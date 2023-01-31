package source_code.labsheet_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddressList {
    public static int countAddressWithCity(Address[] addresses, String city) {
        if (addresses == null || city == null || addresses.length == 0 || city.length() == 0) {
            return -1;
        }

        int count = 0;
        for (Address address : addresses) {
            if (Objects.equals(address.getCity(), city)) {
                count++;
            }
        }

        return count;
    }

    public static int countAddressWithPin(Address[] addresses, String pinCode) {
        if (addresses == null || pinCode == null || addresses.length == 0 || pinCode.length() == 0) {
            return -1;
        }

        int count = 0;
        for (Address address : addresses) {
            if (Objects.equals(address.getPinCode(), pinCode)) {
                count++;
            }
        }
        return count;
    }

    public static Address[] getAddressWithCity(Address[] addresses, String city) {
        if (addresses == null || city == null || addresses.length == 0 || city.length() == 0) {
            return null;
        }

        List<Address> addressList = new ArrayList<>();
        for (Address address : addresses) {
            if (Objects.equals(address.getCity(), city)) {
                addressList.add(address);
            }
        }

        Address[] addressesArray = new Address[addressList.size()];

        for (int i = 0; i < addressList.size(); i++) {
            addressesArray[i] = addressList.get(i);
        }

        return addressesArray;
    }

    public static Address[] getAddressWithPin(Address[] addresses, String pinCode) {
        if (addresses == null || pinCode == null || addresses.length == 0 || pinCode.length() == 0) {
            return null;
        }
        List<Address> addressList = new ArrayList<>();
        for (Address address : addresses) {
            if (Objects.equals(address.getPinCode(), pinCode)) {
                addressList.add(address);
            }
        }

        Address[] addressesArray = new Address[addressList.size()];

        for (int i = 0; i < addressList.size(); i++) {
            addressesArray[i] = addressList.get(i);
        }

        return addressesArray;
    }


}
