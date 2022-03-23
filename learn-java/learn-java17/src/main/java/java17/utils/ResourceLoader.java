package java17.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java17.beans.Car;
import java17.beans.Person;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResourceLoader {

    public static List<Person> getPersons(){
        var persons = new ArrayList<Person>();
        try {
            InputStream is = Resources.getResource("person.json").openStream();
            String personArr = IOUtils.toString(is);
            persons = new Gson().fromJson(personArr,new TypeToken<ArrayList<Person>>(){}.getType());
        }catch (Exception e){
            System.out.println("ERROR : " + e);
        }

        return persons;
    }

    public static List<Car> getCars(){
        var cars = new ArrayList<Car>();
        try {
            InputStream is = Resources.getResource("cars.json").openStream();
            String carsArr = IOUtils.toString(is);
            cars = new Gson().fromJson(carsArr,new TypeToken<ArrayList<Car>>(){}.getType());
        }catch (Exception e){
            System.out.println("ERROR : " + e);
        }

        return cars;
    }

    public static List<Integer> getInts(){

        return Arrays.asList(1,2,3,4,5,2,1,3,4,5,4,3,1,3,45,6,8,4,3,0,4,5,3);
    }

    public static List<Integer> getInts2(){

        return Arrays.asList(1,2,3,4,5,2,1,3,4,5,4,3,1,3,45,6,8,4,3,0,4,5,3,45,6,343,656,3,453);
    }

    public static List<String> getStrings(){

        return ImmutableList.of("Java","Data Structure","Reactive Programing","Kafka","Dynamo DB","Clpud");
    }
}
