package java10;

import java10.beans.Car;
import java10.utils.ResourceLoader;

import java.util.stream.Collectors;

public class VarWithCollection {

    public static void main(String[] args) {

        // var is representing Map<String, Map<Integer, List<Car>>>
        var carGroupByModel = ResourceLoader.getCars().stream()
                .collect(Collectors.groupingBy(Car::getModel, Collectors.groupingBy(Car::getYear)));

        // var is representing Set<Map.Entry<String, Map<Integer, List<Car>>>>
        for(var carGroupEntrySetByYear : carGroupByModel.entrySet()) {
            // var is representing Map<Integer, List<Car>>
            var color = carGroupEntrySetByYear.getKey();
            var carGroupByYear = carGroupEntrySetByYear.getValue();

            carGroupByYear.forEach((k,v) -> System.out.println("Model:- " + color + " ---> Year :- " + k + " ---> value:- " + v));
        }
    }
}
