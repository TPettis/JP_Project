/*
 * Tim Pettis
 * JP_Project Alpha
 */

import java.util.Date;

public abstract class Product implements Items {
  //create integer serial number
  private int serialNumber;

  //create string called manufacturer
  private String manufacturer;

  //create date
  private Date manufacuredOn;

  //create name
  private String name;

  //This will store the next number to be assigned to serialNumber.
  private int currentProductionNumber = 0;

  //Constructor that will take in the name of the product and set this to the field variable name.
  //Assign a serial number from the currentProductionNumber.
  //CurrentProductionNumber is incremented in readiness for the next instance.
  //Set manufacturedOn as the current date and time.
  public Product(String n){
      name = n;
      serialNumber = currentProductionNumber++;
      manufacuredOn = new Date();
  }

  //A method that has one integer parameter
  public void setProductionNumber(int proNum){
    proNum = currentProductionNumber;
  }

  //A method that has one String parameter
  public void setName(String name){
    this.name = name;
  }

  //A method that returns a String
  public String getName(){
    return name;
  }

  //A method that returns a Date
  public Date getManufactureDate(){
    return manufacuredOn;
  }

  //A method that returns an int
  public int getSerialNumber(){
    return serialNumber;
  }

  //A toString method that will return Manufacturer, Serial Number, Date, Name
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date          : " + manufacuredOn + "\n"
        + "Name          : " + name + "\n";
  }
}
