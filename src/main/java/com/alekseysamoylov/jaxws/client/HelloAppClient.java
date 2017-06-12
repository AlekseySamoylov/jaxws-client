package com.alekseysamoylov.jaxws.client;

import com.alekseysamoylov.jaxws.helloservice.Hello;
import com.alekseysamoylov.jaxws.helloservice.HelloService;

import javax.xml.ws.WebServiceRef;

/**
 * Client example
 */
public class HelloAppClient {

    @WebServiceRef(wsdlLocation =
            "http://localhost:8080/jaxws-example-1.0-SNAPSHOT/Hello?WSDL"
    )
    private static HelloService helloService;


    public void invoke() {
        Hello hello = helloService.getHelloPort();
        System.out.println(hello.sayHello("Aleksey"));
    }
}
