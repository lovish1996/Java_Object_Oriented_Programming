package source_code.labsheet_4;

import java.util.Arrays;

public class Address {
    private String addressLineFirst;
    private String addressLineSecond;
    private String addressLineThird;
    private char[] city;
    private char[] state;
    private String pinCode;

    // using String.split method, we can also use StringTokenizer class
    public Address(String address) {
        String[] addressComponents = address.split("\\$");
        addressLineFirst = addressComponents[0];
        addressLineSecond = addressComponents[1];
        addressLineThird = addressComponents[2];
        city = addressComponents[3].toCharArray();
        state = addressComponents[4].toCharArray();
        pinCode = addressComponents[5];
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLineFirst='" + addressLineFirst + '\'' +
                ", addressLineSecond='" + addressLineSecond + '\'' +
                ", addressLineThird='" + addressLineThird + '\'' +
                ", city=" + Arrays.toString(city) +
                ", state=" + Arrays.toString(state) +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public String getAddressLineFirst() {
        return addressLineFirst;
    }

    public String getAddressLineSecond() {
        return addressLineSecond;
    }

    public String getAddressLineThird() {
        return addressLineThird;
    }

    public String getCity() {
        return String.valueOf(city);
    }

    public String getState() {
        return String.valueOf(state);
    }

    public String getPinCode() {
        return pinCode;
    }
}
