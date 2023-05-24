package modul7;

import lombok.Data;

@Data
public class HelperClass {
private int statusCode;

    public  boolean isNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

