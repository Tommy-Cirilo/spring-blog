package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number, @PathVariable int number2) {
        return number + " plus the second number " + number2 + " is " + (number + number2);
    }

    @Controller
    public class SubtractController {
        @RequestMapping(path = "/subtract/{number}/from/{number2}", method = RequestMethod.GET)
        @ResponseBody
        public String addOne(@PathVariable int number, @PathVariable int number2) {
            return number + " Subtracted from  " + number2 + " is " + (number2 - number);
        }
    }

    @Controller
    public class MultiplyController {
        @RequestMapping(path = "/multiply/{number}/and/{number2}", method = RequestMethod.GET)
        @ResponseBody
        public String addOne(@PathVariable int number, @PathVariable int number2) {
            return number + " Multiplied by  " + number2 + " is " + (number * number2);
        }
    }

    @Controller
    public class DivideController {
        @RequestMapping(path = "/divide/{number}/by/{number2}", method = RequestMethod.GET)
        @ResponseBody
        public String addOne(@PathVariable int number, @PathVariable int number2) {
            return number + " Divided by  " + number2 + " is " + (number / number2);
        }
    }




}
