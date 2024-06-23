package com.example.demo;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainController() {

        return "index";
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String input(Model model, @RequestParam("input") String text) {


        CharStream inputStream = CharStreams.fromString(text);


        ExprLexer lexer = new ExprLexer(inputStream);


        CommonTokenStream tokens = new CommonTokenStream(lexer);


        ExprParser parser = new ExprParser(tokens);


        ParseTree tree = parser.prog();


        MyVisitor visitor = new MyVisitor();
        Integer result = visitor.visit(tree);
        model.addAttribute("result", result);

        return "index";
    }
}
