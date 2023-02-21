public class UsedCar implements Comparable<UsedCar> 
{

    Integer id;
    String make;
    Integer price;
    Integer year;
    String model;
    static Integer nextId = 1000;



public UsedCar(String make, String model, Integer price, Integer year)
{
    this.make = make;
    this.model = model;
    this.price = price;
    this.year = year;
    this.id = nextId++;


}

@Override
public String toString()
{ return "UseCar [id =" + id + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year + " ]";

}

@Override
public int compareTo(UsedCar otherCar)
{
    int compareValue = 0;
    if(this.price > otherCar.price) 
    {
        compareValue = 1;
    }
    if(this.price < otherCar.price)
    {
        compareValue = -1;
    }
    if(this.price == otherCar.price)
    {
        compareValue = 0;
    }
    return compareValue;
}

}

