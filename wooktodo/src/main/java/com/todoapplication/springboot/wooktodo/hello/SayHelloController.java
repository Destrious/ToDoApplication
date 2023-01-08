package com.todoapplication.springboot.wooktodo.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello() {
        return "Hello!";
    }

    @RequestMapping("hello-html")
    @ResponseBody
    public String sayHelloHtml() {

        return """
                    <!DOCTYPE html>
                    <html lang="en">
                      <head>
                          <meta charset="UTF-8">
                          <title>HTML Hello Page</title>
                      </head>
                      <body>
                        Hello from HTML!
                      </body>
                    </html>
                """;
    }

    // JSP Hello
    // (auto route to jsp from application.properties without .jsp)
    // /resources/META-INF/resources/WEB-INF/jsp/hello.jsp
    @RequestMapping("hello-jsp")
    public String sayHelloJsp() {
        return "hello";
    }


}
