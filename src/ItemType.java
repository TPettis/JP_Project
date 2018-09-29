/*
 * Tim Pettis
 * JP_Project Alpha
 */

//Create enum of item types
public enum ItemType {
  //Each type with their code
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  //Creating a Code string
  private final String Code;

  //Constructor with a String parameter that sets it to Code.
  ItemType(String code) {
    this.Code = code;
  }

  //Returns Code
  public String getCode() {
    return Code;
  }

}