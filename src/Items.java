import java.util.Date;
import sun.misc.VM;

//Create interface of items
public interface Items {
  String manufacturer = "OracleProduction";
  void setProductionNumber(int proNum);
  void setName(String name);
  String getName();
  Date getManufactureDate();
  int getSerialNumber();
}

//Create enum of item types
public enum ItemType {
  Audio (AU),
  Visual (VI),
  AudioMobile (AM),
  VisualMobile (VM);

  private final String Code;

  ItemType (String code){
    this.Code = code;
  }
  private String Code(){
    return Code;
  }

}