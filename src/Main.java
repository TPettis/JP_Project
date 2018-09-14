import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

interface Item
{
    String manufacturer = "OracleProduction";
    void setProductionNumber(int proNum);
    void setName(String name);
    String getName();
    Date getManufactureDate();
    int getSerialNumber();
}

/*
class TV implements Item{}
 */
