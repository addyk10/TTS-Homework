public class Car {
    // variable instances
    private String model;
    private String color;
    private int seats;

    //constructors
    public Car (){
        System.out.println("empty constructor called");
    }

    public Car(model, color){
        System.out.println("constructor with 2 variables");
    }
    public Car (model, color, seats){
        System.out.println("constructor with 3 variables");
    }

    //Getters & Setters for instance variables

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}


    Car honda = new Car();
        honda.color = "red";
                honda.seats = 4;
                honda.model = "civic";
                honda.display();

// Return Boolean
public Car()
        if (seats < 4) System.out.println("true");
        else System.out.println("false");

        // Return String
        System.out.println("honda :" + model + color);

