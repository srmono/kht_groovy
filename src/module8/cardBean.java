package module8;

import java.io.Serializable;

public class cardBean implements Serializable {
    String name;
    int numDigits;


    public cardBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumDigits() {
        return numDigits;
    }

    public void setNumDigits(int numDigits) {
        this.numDigits = numDigits;
    }
}
