package org.example;

import java.io.Serializable;

public interface Address extends Serializable {
    public static final String EOL_STRING = System.lineSeparator();
    public static final String SPACE = " ";
    public static final String COMMA = ",";
    public String getType();
    public String getDescription();
    public String getStreet();
    public String getCity();
    public String getState();
    public String getZipCode();

    public void setType(String type);
    public void setDescription(String description);
    public void setStreet(String street);
    public void setCity(String city);
    public void setState(String state);
    public void setZipCode(String zipCode);
}
