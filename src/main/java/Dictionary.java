import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.*;

import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;

import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Dictionary{
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout ="templates/layout.vtl";

    // get("/", (request, response ) ->{
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   model.put("definitions", request.session().attribute("definitions"));
    //   model.put("template", "templates/index.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }
}
