package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class TestDataManager {

    List<String> testUsers = new ArrayList<>();
    Map<String,String> testConfig=new HashMap<>();
    Set<String> browserSet=new HashSet<>();



    public TestDataManager() {
        testUsers.add("admin@test.com");
        testUsers.add("user1@test.com");
        testUsers.add("user2@test.com");
        testUsers.add("invalid@test.com");
        testConfig.put("baseUrl","https://saucedemo.com");
        testConfig.put("browser","chrome");
        testConfig.put("timeout","30");
        testConfig.put("environment","staging");
        browserSet.add("chrome");
        browserSet.add("firefox");
        browserSet.add("safari");
        browserSet.add("chrome");
        browserSet.add("firefox");
    }
    public  void printValidUsersUpperCase(){
        testUsers.stream().filter(u->!u.contains("invalid@test.com")).map(String::toUpperCase).forEach(System.out::println);
    }

    public void printAll(){
        for(Map.Entry<String,String> entry:testConfig.entrySet()){
            System.out.println("[Config]" +" "+entry.getKey()+" : "+entry.getValue());
        }
    }

    public void printSet(){
        int count=0;
       for(String set:browserSet){
           System.out.println(set);
           count++;
       }
        System.out.println("Total unique  browsers : "+count );

    }
    public String getConfigValue(String key){
       return testConfig.getOrDefault(key,"Key Not Found");

    }

    public List<String> getValidUserStreams(){
        return testUsers.stream().filter(u -> !u.contains("invalid@test.com")).collect(Collectors.toList());

    }
}



