package itstep.task_5;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XMLParser {

    public static void main(String[] args) throws IOException {

//      Serialization-Deserialization:
//      a) Make some complex models using your variant.
//              b) Make it serializable.
//              c) Read json from “input.json”
//      d) and deserialize it to POJO.
//              e) Then change a few fields and save it to “output.json”.
//      f) Do the same for xml.

//      V13
//      <data>
//        <isEmployed>false</isEmployed>
//        <name>Jessica</name>
//        <address>
//          <street>234 Elm St</street>
//          <city>Boston</city>
//          <state>MA</state>
//        </address>
//      </data>

//      Read object from “input.xml”
        XmlMapper xmlMapper = new XmlMapper();
        User userXML = xmlMapper.readValue(new File("input.xml"), User.class);
        System.out.println("User from \"input.xml\" is:");
        System.out.println(userXML);

//      Change some fields
        userXML.setIsEmployed(true);
        Address userXMLAddress = userXML.getAddress();
        userXMLAddress.setStreet("New Street");
        userXML.setAddress(userXMLAddress);
        System.out.println();
        System.out.println("User with updated fields: ");
        System.out.println(userXML);

//      Write object to “output.xml”
        xmlMapper.writeValue(new File("output.xml"), userXML);

    }
}
