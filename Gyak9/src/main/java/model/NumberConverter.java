package model;

import javafx.util.StringConverter;

public class NumberConverter extends StringConverter<String> {

    private int fromRadix;

    private int toRadix;

    public NumberConverter(int fromRadix, int toRadix) {
        this.fromRadix = fromRadix;
        this.toRadix = toRadix;
    }

    @Override
    public String toString(String s) {
        return Integer.toString(Integer.parseInt(s, toRadix),fromRadix);
    }

    @Override
    public String fromString(String s) {
        return Integer.toString(Integer.parseInt(s, fromRadix),toRadix);
    }
}
