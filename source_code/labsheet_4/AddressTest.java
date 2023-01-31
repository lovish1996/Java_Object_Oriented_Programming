package source_code.labsheet_4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressTest {
    public static Address readAddress(Scanner scanner) throws IOException {
        String addressLineFirst = scanner.nextLine();

        String addressLineSecond = scanner.nextLine();

        String addressLineThird = scanner.nextLine();

        String city = scanner.next();
        scanner.nextLine();

        String state = scanner.next();
        scanner.nextLine();

        String pinCode = scanner.next();
        scanner.nextLine();

        String addressString = addressLineFirst + "$" + addressLineSecond + "$" + addressLineThird + "$" + city + "$" + state + "$" + pinCode;

        return new Address(addressString);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/lovisharora/Documents/Java_Object_Oriented_Programming/source_code/labsheet_4/address_records.txt");
        Scanner scanner = new Scanner(file);

        List<Address> addressList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            addressList.add(readAddress(scanner));
        }

        Address[] addresses = new Address[addressList.size()];
        for (int i = 0; i < addressList.size(); i++) {
            addresses[i] = addressList.get(i);
        }

        int countAddressesWithCity = AddressList.countAddressWithCity(addresses, "FirstCity");
        System.out.println("Count of addresses with given City: " + countAddressesWithCity);
        System.out.println();

        int countAddressesWithPinCode = AddressList.countAddressWithPin(addresses, "FirstPinCode");
        System.out.println("Count of addresses with given PinCode: " + countAddressesWithPinCode);
        System.out.println();

        Address[] addressesWithCity = AddressList.getAddressWithCity(addresses, "FirstCity");
        System.out.println("List of Addresses with FirstCity:");
        for (Address address : addressesWithCity) {
            System.out.println(address);
        }
        System.out.println();

        Address[] addressesWithPinCode = AddressList.getAddressWithPin(addresses, "FirstPinCode");
        System.out.println("List of addresses with FirstPinCode:");
        for (Address address : addressesWithPinCode) {
            System.out.println(address);
        }
        System.out.println();
    }
}
