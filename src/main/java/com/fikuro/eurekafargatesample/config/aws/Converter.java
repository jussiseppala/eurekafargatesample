package com.fikuro.eurekafargatesample.config.aws;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * These files were generated using https://app.quicktype.io/
 * based on input that we received from ECS metadata endpoint
 * 
 * To use this code, add the following Maven dependency to your project:
 *      com.fasterxml.jackson.core : jackson-databind : 2.9.0
 * 
 * Import this package
 * Then you can deserialize a JSON string with
 *      EcsTaskMetadata data = Converter.fromJsonString(jsonString);
 */
public class Converter {
    
    // Serialize/deserialize helpers

    public static EcsTaskMetadata fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(EcsTaskMetadata obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(EcsTaskMetadata.class);
        writer = mapper.writerFor(EcsTaskMetadata.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}
