package Com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

public class Brand {
    //data member

    String brandID, brandName, brandSound;
    double price;

    //get,set
    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandSound() {
        return brandSound;
    }

    public void setBrandSound(String brandSound) {
        this.brandSound = brandSound;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // constructor
    public Brand(String brandID, String brandName, String brandSound, double price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.brandSound = brandSound;
        this.price = price;
    }

    public Brand() {
    }

    // method
    @Override
    public String toString() {
        return "<" + this.brandID + "," + this.brandName + "," + this.brandSound + ":" + this.price + ">";
    }

    public boolean loadFromFile(String str) {
        // dọc dữ liệu từ file brandList
        String path = "D:\\Assignment_OOP\\File brands.txt";
        File f = new File(path);
        List<Brand> brandList = new ArrayList<>();

        if (f.isFile()) {
            try {

//                FileReader fileReader = new FileReader(f);
//                BufferedReader reader = new BufferedReader(fileReader);
//                String line = reader.readLine();
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object object;
                while ((object = ois.readObject()) != null) {
                    // tách chuỗi theo dấu ','

                }
            } catch (Exception e) {
                e.getStackTrace();
            }
            return true;
        } else {
            return false;
        }

    }
}
