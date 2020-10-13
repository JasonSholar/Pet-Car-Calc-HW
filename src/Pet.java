public class Pet {
    
private String name;

private String location;

private String petType;

private int age;

// Empty
public Pet(String name, String location, String petType, int age){
    this.name = name;
    this.location = location;
    this.petType = petType;
    this.age = age;
}
// All attributes
public Pet(){
}

public String getName(){
    return name;
}

public String getLocation(){
    return location;
}

public String getPetType(){
    return petType;
}

public int getAge(){
    return age;
}

public void setName(String name){
    this.name = name;
}

public void setLocation(String location){
    this.location = location;
}

public void setPetType(String petType){
    this.petType = petType;
}

public void setAge(int age){
    this.age = age;
     }
}