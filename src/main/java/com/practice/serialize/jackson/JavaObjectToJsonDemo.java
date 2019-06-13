package com.practice.serialize.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.practice.serialize.domain.Car;

/**
 * @author Luo Bao Ding
 * @since 2018/9/5
 */
public class JavaObjectToJsonDemo {
    private ObjectMapper objectMapper = new ObjectMapper();
    private final ObjectWriter writer = objectMapper.writer();


    public void demo() throws JsonProcessingException {
        Car car = new Car("red", "x001");
        String s = objectMapper.writeValueAsString(car);
        System.out.println("s = " + s);

        String s2 = writer.writeValueAsString(car);
        System.out.println("s2 = " + s2);
    }


    public static void main(String[] args) throws JsonProcessingException {
        new JavaObjectToJsonDemo().demo();
    }
}
