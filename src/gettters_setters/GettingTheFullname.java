package gettters_setters;

public class GettingTheFullname {
    class User {
        private String firstName;
        private String lastName;

        public User() {
            this.firstName = "";
            this.lastName = "";
        }

        public void setFirstName(String firstName) {
            // write your code here
            if (firstName != null && !firstName.isEmpty()) {
                this.firstName = firstName;
            }
        }

        public void setLastName(String lastName) {
            // write your code here
            if (lastName != null && !lastName.isEmpty()) {
                this.lastName = lastName;
            }
        }

        public String getFullName() {
            boolean isFirstNameIsEmpty = firstName == null || firstName.isEmpty();
            boolean isLastNameIsEmpty = lastName == null || lastName.isEmpty();


            if (isFirstNameIsEmpty && isLastNameIsEmpty) {
                return "Unknown";
            } else if (isFirstNameIsEmpty) {
                return lastName;
            } else if (isLastNameIsEmpty) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }
        }
    }
}
