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

        for (User user1 : users
        ) { result += addComma(addCurlyBracket(useMapToJSON(user1)));
        }
        result = removeLastComma(result);

        return addQuotes(addBracket(result));
    }

    public String convertToJsonString(User users) {

//        TODO implements result
        String result = "";

        result = useMapToJSON(users);

        return addQuotes(addCurlyBracket(result));
    }


    public String useMapToJSON(User user) {
        String result = "";

        Map<String, Object> mapToJSON = new LinkedHashMap<>();

        mapToJSON.put("id", user.getId());
        mapToJSON.put("firstName", addQuotes(user.getFirstName()));
        mapToJSON.put("lastName", addQuotes(user.getLastName()));
        mapToJSON.put("age", user.getAge());
        mapToJSON.put("gender", addQuotes(user.getGender()));
        mapToJSON.put("company", addQuotes(user.getCompany()));
        mapToJSON.put("email", addQuotes(user.getEmail()));
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
            String temporaryString = "";
            temporaryString = temporaryString.concat(useMapEntryToJSON("id", newFriend.getId()));
            temporaryString = temporaryString.concat(useMapEntryToJSON2("firstName", newFriend.getFirstName()));
            temporaryString = temporaryString.concat(useMapEntryToJSON2("lastName", newFriend.getLastName()));
            temporaryString = addCurlyBracket(removeLastComma(temporaryString));
            result += addComma(temporaryString);
        }
        result = removeLastComma(result);
        return result + rightBracket;
    }

    private String addCurlyBracket(String result) {
        return leftCurlyBracket + result + rightCurlyBracket;
    }

    private String addComma(String result) {
        return result + comma;
    }

    private String addBracket(String result) {
        return leftBracket + result + rightBracket;
    }

    private String addressToJson(Address addresses) {
        String result = "";

        result = result.concat(useMapEntryToJSON2("city", addresses.getCity()));
        result = result.concat(useMapEntryToJSON2("street", addresses.getStreet()));
        result = addCurlyBracket(removeLastComma(result));

        return result;
    }

    private String phonesToJson(List<String> phones) {
        String result = "";
        for (String phone : phones
        ) {
            result = addComma(result.concat(addQuotes(phone)));
        }
        result = removeLastComma(result);
        return addBracket(result);
    }


    private String removeLastComma(String result) {
        return result.substring(0, result.length() - 1);
    }


    private String addQuotes(String value) {
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

