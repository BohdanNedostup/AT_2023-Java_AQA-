package itstep.task_5;

import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.IOException;

public class JsonParser {


    public static void main(String[] args) throws IOException {

//      Serialization-Deserialization:
//      a) Make some complex models using your variant.
//              b) Make it serializable.
//              c) Read json from “input.json”
//      d) and deserialize it to POJO.
//              e) Then change a few fields and save it to “output.json”.
//      f) Do the same for xml.

//      V13
//      {
//          "isEmployed": false,
//              "name": "Jessica",
//              "address": {
//          "street": "234 Elm St",
//                  "city": "Boston",
//                  "state": "MA"
//      }
//      }

//      Read object from “input.json”
        JsonMapper jsonMapper = new JsonMapper();
        User userJson = jsonMapper.readValue(new File("input.json"), User.class);
        System.out.println("User from \"input.json\" is:");
        System.out.println(userJson);

//      Change some fields
        userJson.setIsEmployed(true);
        userJson.setName("Jessica JSON");
        Address userXMLAddress = userJson.getAddress();
        userXMLAddress.setStreet("New Street Json");
        userJson.setAddress(userXMLAddress);
        System.out.println();
        System.out.println("User with updated fields: ");
        System.out.println(userJson);

//      Write object to “output.xml”
        jsonMapper.writeValue(new File("output.json"), userJson);

    }
}
