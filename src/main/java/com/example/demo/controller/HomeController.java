package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("message", "Hello Yose");

        return model;
    }

    @GetMapping("/leame")
    public ModelAndView leame(){

        ModelAndView model = new ModelAndView("leame");
        return model;
    }

    @GetMapping("/contactme")
    public ModelAndView contactMe(){

        ModelAndView model = new ModelAndView("contactme");
        return model;
    }

    @GetMapping("/astroport")
    public ModelAndView astrop(){

        ModelAndView model = new ModelAndView("astroport");
        return model;
    }

//fica atenta uk estou a escrever
    //aplicacao assim esta a run,
    //para desconectar clicar== ja desconetei
    //agora vou correr aplicacao.. fica de olho
    //aplicao esta a compilar....
    //ja terminou, agora vou acessar no navegador.. fica de olho
    //para acessae eh: localhost:8080
    //esse que esta a mostrar agora eh sua aplicao

    @GetMapping("/ primeFactors?")
    public ModelAndView primeFactors(){

        ModelAndView model = new ModelAndView("primeFactors");
        return model;
    }

    @GetMapping(" / minasminweeper")
    public ModelAndView minasminweeper(){

        ModelAndView model = new ModelAndView("minasminweeper");
        return model;
    }




}
