public class Pet {

    // private instance variables declared
    private String name;
    private int age;
    private String location;
    private String type;

    //constructors
    public Pet(){
        System.out.println("empty constructor called");}

     public Pet(){
        System.out.println("name, age, location, type");
    }

    //Getters
    public String getName(){
    return name; }

    public int getAge (){
        return age;
    }

    public String getType(){
        return type;
    }

    //Setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setLocation(String newLocation){
        this.location = newLocation;
    }


}
