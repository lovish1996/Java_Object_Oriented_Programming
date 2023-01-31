package source_code.labsheet_4;

import java.util.StringTokenizer;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String name) {
        boolean hasComma = name.contains(",");

        String delimiter = hasComma ? "," : ";";
        StringTokenizer stringTokenizer = new StringTokenizer(name, delimiter);

        if (hasComma) {
            if (stringTokenizer.hasMoreTokens()) {
                this.firstName = stringTokenizer.nextToken();
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.middleName = stringTokenizer.nextToken();
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.lastName = stringTokenizer.nextToken();
            }
        } else {
            if (stringTokenizer.hasMoreTokens()) {
                this.lastName = stringTokenizer.nextToken();
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.middleName = stringTokenizer.nextToken();
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.firstName = stringTokenizer.nextToken();
            }
        }
    }

    public String getName() {
        return "Name: " + firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}
