public class Car {

private String color;

private String make;

private int year;

private boolean blueTooth;

// Empty
public Car(String color, String make, int year, boolean blueTooth){
    this.color = color;
    this.make = make;
    this.year = year;
    this.blueTooth = blueTooth;
}
// All Attributes
public Car(){
}

public String getColor(){
    return color;
}
 
public String getMake(){
    return make;
}

public int getYear(){
    return year;
}

public boolean getBlueTooth(){
    return blueTooth;
}

public void setColor(String color){
    this.color = color;
}

public void setMake(String make){
    this.make = make;
}

public void setYear(int year){
    this.year = year;
}

public void setBluetooth(boolean blueTooth){
    this.blueTooth = blueTooth;
}

public boolean carReport(){
    if(color == "Silver" && make == "Tacoma" && year == 2003 && blueTooth == false){
        return true;
    } else {
        return false;
    }
}
    public String tell(){
        if (carReport() == true){
            return "Correct Car";
        } else {
            return "Wrong Car";
        }
    }
}



