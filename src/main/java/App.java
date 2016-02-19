import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("wordList", Word.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/words", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String userWord = request.queryParams("word");
      Word newWord = new Word(userWord);
      model.put("wordList", Word.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("definitionList", word.getDefinition());
      model.put("word", word);
      model.put("template", "templates/add-definition.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    post("/words/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word word = Word.find(Integer.parseInt(request.params(":id")));
      Definition definintion = Definition.find(Integer.parseInt(request.params(":id")));
      ArrayList<Definition> definitionList = word.getDefinition();

      if (definitionList == null) {
        definitionList = new ArrayList<Definition>();
        request.session().attribute("definitionList", definitionList);
      }

      String userDefinition = request.queryParams("definition");
      Definition newDefinition = new Definition(userDefinition);

      definitionList.add(newDefinition);
      
      model.put("definitionList", definitionList);
      model.put("word", word);
      model.put("template", "templates/add-definition.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
