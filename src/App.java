import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<UsedCar> usedCars = new ArrayList<>();

        usedCars.add(new UsedCar("Acura", "MDX", 24000,2016 ));
        usedCars.add(new UsedCar("BMW", "428i", 33000, 2016));
        usedCars.add(new UsedCar("Kia", "Soul", 25000, 2020));

        Collections.sort(usedCars); //Sorts by price 

        for(UsedCar usedCar: usedCars)
        {
            System.out.println("Sorted " + usedCar);
        }


        //For the assignment 

        //Create hashMap
        HashMap<Integer, UsedCar> usedCarMap = new HashMap<>();

        for(UsedCar usedCar: usedCars)
        {
            usedCarMap.put(usedCar.id, usedCar);
        }

        System.out.println("hashMap " + usedCarMap); //Will appear in the order they were created

        //Create the array list that matches what we have for the assignment 
         //How to convert hashMap to arrayList needed for our assignment 2 
        //HashMap 
        ArrayList<UsedCar> usedCarList = new ArrayList<>();
        for(Integer key: usedCarMap.keySet())//.keySet gives you all the keys you've added to the hashMap 
        {
            UsedCar usedCar = usedCarMap.get(key);
            usedCarList.add(usedCar);
        }

        Collections.sort(usedCarList);

        for(UsedCar usedCar : usedCarList)
        {
            System.out.println("List: " + usedCars);
        }
        
    }
}
