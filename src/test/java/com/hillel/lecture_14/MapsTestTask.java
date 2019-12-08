package com.hillel.lecture_14;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 12/8/19
 */
public class MapsTestTask {

    private JsonConverter jsonConverter = new JsonConverter();

    private String jsonInput = "\"[{\"id\":1,\"firstName\":\"Bob\",\"lastName\":\"Marley\",\"age\":22,\"gender\":\"male\",\"company\":\"BALOOBA\",\"email\":\"knoxavery@balooba.com\",\"phone\":[\"+38-096-123-26-48\",\"+38-093-812-12-32\"],\"address\":{\"city\":\"Dnipro\",\"street\":\"Gagarina 35\"},\"friends\":[{\"id\":2,\"firstName\":\"Eaton\",\"lastName\":\"Barlow\"},{\"id\":3,\"firstName\":\"Milagros\",\"lastName\":\"Fletcher\"},{\"id\":4,\"firstName\":\"Morris\",\"lastName\":\"Grimes\"}]},{\"id\":5,\"firstName\":\"Steve\",\"lastName\":\"Rogers\",\"age\":99,\"gender\":\"male\",\"company\":\"Avangers\",\"email\":\"steve@avangers.com\",\"phone\":[\"+19-123-136-35-48\",\"+19-916-812-99-00\"],\"address\":{\"city\":\"New-York\",\"street\":\"Brooklyn 75\"},\"friends\":[{\"id\":6,\"firstName\":\"Tony\",\"lastName\":\"Stark\"},{\"id\":7,\"firstName\":\"Natasha\",\"lastName\":\"Romanova\"},{\"id\":8,\"firstName\":\"Thor\",\"lastName\":\"Son of Oddin\"}]}]\"";

    @Test
    public void checkReversDataTest() {
        List<User> userList = new ArrayList<>();

        assertEquals(jsonConverter.convertUsers(userList).toString(), jsonInput);
    }

}
