package com.practice.serialize.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * JSON to Jackson JsonNode
 *
 * @author Luo Bao Ding
 * @since 2018/9/5
 */
public class JSON_to_JsonNode_demo {

    ObjectMapper objectMapper = new ObjectMapper();

    public void demo() throws IOException {
        String json = "{ \"color\" : \"Black\", \"type\" : \"FIAT\" }";
        JsonNode jsonNode = objectMapper.readTree(json);
        String color = jsonNode.get("color").asText();
        System.out.println("color = " + color);
// Output: color -> Black
    }

    public static void main(String[] args) throws IOException {
        new JSON_to_JsonNode_demo().demo();
    }
}
