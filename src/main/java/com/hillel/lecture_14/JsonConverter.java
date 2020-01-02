package com.hillel.lecture_14;

import java.util.*;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 * <p>
 * private String name;
 * <p>
 * }
 * <p>
 * Should be present as json {"name": "bob"}
 *
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {

    public String doubleQuotes = "\"";
    public String comma = ",";
    public String leftBracket = "[";
    public String rightBracket = "]";
    public String leftCurlyBracket = "{";
    public String rightCurlyBracket = "}";

    public String convertToJsonString(List<User> users) {

//        TODO implements result
        String result = "";
        result = doubleQuotes + leftBracket;

        for (User user1 : users
        ) {
            result = result + leftCurlyBracket + useMapToJSON(user1) + rightCurlyBracket + comma;

        }
        result = removeLastComma(result);
        result = result + rightBracket + doubleQuotes;

        return result;
    }

    public String convertToJsonString(User users) {

//        TODO implements result
        String result = doubleQuotes + leftCurlyBracket;

        result = result + useMapToJSON(users) + rightCurlyBracket + doubleQuotes;

        return result;
    }


    public String useMapToJSON(User user) {
        String result = "";

        Map<String, Object> mapToJSON = new LinkedHashMap<>();

        mapToJSON.put("id", user.getId());
        mapToJSON.put("firstName", basicToJson(user.getFirstName()));
        mapToJSON.put("lastName", basicToJson(user.getLastName()));
        mapToJSON.put("age", user.getAge());
        mapToJSON.put("gender", basicToJson(user.getGender()));
        mapToJSON.put("company", basicToJson(user.getCompany()));
        mapToJSON.put("email", basicToJson(user.getEmail()));
        mapToJSON.put("phone", phonesToJson(user.getPhone()));
        mapToJSON.put("address", addressToJson(user.getAddress()));
        mapToJSON.put("friends", friendsToJson(user.getFriends()));

        Set<Map.Entry<String, Object>> entries = mapToJSON.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            result = result.concat(useMapEntryToJSON(entry.getKey(), entry.getValue()));
        }
        result = removeLastComma(result);
        return result;
    }

    private String friendsToJson(List<Friend> friends) {
        String result = leftBracket;
        for (Friend newFriend : friends
        ) {
            result += leftCurlyBracket;
            result = result.concat(useMapEntryToJSON("id", newFriend.getId()));
            result = result.concat(useMapEntryToJSON2("firstName", newFriend.getFirstName()));
            result = result.concat(useMapEntryToJSON2("lastName", newFriend.getLastName()));
            result = removeLastComma(result);
            result += rightCurlyBracket + comma;
        }

        result = removeLastComma(result);
        return result + rightBracket;
    }


    private String addressToJson(Address addresses) {
        String result = "";

        result += leftCurlyBracket;
        result = result.concat(useMapEntryToJSON2("city", addresses.getCity()));
        result = result.concat(useMapEntryToJSON2("street", addresses.getStreet()));
        result = removeLastComma(result);
        result += rightCurlyBracket + comma;


        result = removeLastComma(result);
        return result;
    }

    private String phonesToJson(List<String> phones) {
        String result = leftBracket;
        for (String phone : phones
        ) {
            result = result.concat(basicToJson(phone)) + comma;
        }
        result = removeLastComma(result);
        return result + rightBracket;
    }


    private String removeLastComma(String result) {
        return result.substring(0, result.length() - 1);
    }


    private String basicToJson(String value) {
        String result = doubleQuotes + value + doubleQuotes;

        return result;
    }


    public String useMapEntryToJSON(String key, Object value) {
        String result = "";

        result = result.concat(doubleQuotes + key + doubleQuotes + ":" + value);
        return result + comma;
    }

    public String useMapEntryToJSON2(String key, Object value) {
        String result = "";
        result = result.concat(doubleQuotes + key + doubleQuotes + ":" + doubleQuotes + value + doubleQuotes);
        return result + comma;
    }
}

