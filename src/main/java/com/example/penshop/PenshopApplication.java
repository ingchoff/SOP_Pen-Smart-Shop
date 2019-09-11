package com.example.penshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class PenshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PenshopApplication.class, args);
    }
    @RequestMapping("/")
    public String home() {
        String text = "Welcome, to Pen-Smart-Shop\nHow to Use:\n/pens = View all Pens Product" +
                "\n/pens/color/{color} = search pens by color\n" +
                "/pens/type/{type} = search pens by type. eg. => BallPoint, Marker, Gel, Stylus, Highlighters, Rollerball";
        return text.replace("\n", "<br />\n");
    }
    @RequestMapping("/pens")
    public ArrayList showAll() {
        return PensFactory.getAll();
    }
    @RequestMapping(value = "/pens/color/{color}", method = RequestMethod.GET)
    public ArrayList sortColor(@PathVariable("color") String color) {
        return PensFactory.getByColor(color);
    }
    @RequestMapping(value = "/pens/type/{type}", method = RequestMethod.GET)
    public ArrayList sortType(@PathVariable("type") String type) {
        return PensFactory.getByType(type);
    }
    @RequestMapping(value = "/show-stock", method = RequestMethod.GET)
    public ArrayList getStock() throws IOException, ClassNotFoundException {
        return PensFactory.getStock();
    }

}
