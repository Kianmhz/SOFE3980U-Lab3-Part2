package com.ontariotechu.sofe3980U;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BinaryAPIController {

    /**
     * Handles addition of two binary numbers and returns the result as a plain string.
     * Example: http://localhost:8080/add?operand1=111&operand2=1010
     */
    @GetMapping("/add")
    public String addString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                            @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return Binary.add(number1, number2).getValue();
    }

    /**
     * Handles addition of two binary numbers and returns the result in JSON format.
     * Example: http://localhost:8080/add_json?operand1=111&operand2=1010
     */
    @GetMapping("/add_json")
    public BinaryAPIResult addJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                   @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return new BinaryAPIResult(number1, "add", number2, Binary.add(number1, number2));
    }

    /**
     * Handles bitwise OR operation and returns the result as a plain string.
     * Example: http://localhost:8080/or?operand1=1010&operand2=1100
     */
    @GetMapping("/or")
    public String orString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                           @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return Binary.or(number1, number2).getValue();
    }

    /**
     * Handles bitwise OR operation and returns the result in JSON format.
     * Example: http://localhost:8080/or_json?operand1=1010&operand2=1100
     */
    @GetMapping("/or_json")
    public BinaryAPIResult orJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                  @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return new BinaryAPIResult(number1, "or", number2, Binary.or(number1, number2));
    }

    /**
     * Handles bitwise AND operation and returns the result as a plain string.
     * Example: http://localhost:8080/and?operand1=1010&operand2=1100
     */
    @GetMapping("/and")
    public String andString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                            @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return Binary.and(number1, number2).getValue();
    }

    /**
     * Handles bitwise AND operation and returns the result in JSON format.
     * Example: http://localhost:8080/and_json?operand1=1010&operand2=1100
     */
    @GetMapping("/and_json")
    public BinaryAPIResult andJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                   @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return new BinaryAPIResult(number1, "and", number2, Binary.and(number1, number2));
    }

    /**
     * Handles binary multiplication and returns the result as a plain string.
     * Example: http://localhost:8080/multiply?operand1=101&operand2=11
     */
    @GetMapping("/multiply")
    public String multiplyString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                 @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return Binary.multiply(number1, number2).getValue();
    }

    /**
     * Handles binary multiplication and returns the result in JSON format.
     * Example: http://localhost:8080/multiply_json?operand1=101&operand2=11
     */
    @GetMapping("/multiply_json")
    public BinaryAPIResult multiplyJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                        @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return new BinaryAPIResult(number1, "multiply", number2, Binary.multiply(number1, number2));
    }
}
