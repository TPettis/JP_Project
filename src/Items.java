/*
 * Tim Pettis
 * JP_Project Alpha
 */

import java.util.Date;
import sun.misc.VM;

//Create interface of items
public interface Items {

  //A constant called manufacturer that would be set to “OracleProduction”.
  final String manufacturer = "OracleProduction";

  //A method that has one integer parameter
  public void setProductionNumber(int proNum);

  //A method that has one String parameter
  public void setName(String name);

  //A method that returns a String
  public String getName();

  //A method that returns a Date
  public Date getManufactureDate();

  //A method that returns an int
  public int getSerialNumber();

}