package br.com.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/myapp")
    public String home() {
        return """
        <html>
        <body style="font-family:Arial;text-align:center;margin-top:100px;">
            <h1>Minha Aplicação Web</h1>
            <h2>Deploy 1</h2>
            <p>Projeto Jenkins + Apache Tomcat</p>
        </body>
        </html>
        """;
    }

}