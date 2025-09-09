package constructors;

public class ClassHierarchy {
    class Employee1 {

        protected String name;
        protected String birthDate;

        public Employee1(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }
    }

    class RegularEmployee extends Employee1 {

        protected long salary;
        protected String hireDate;

        public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
            super(name, birthDate);
            this.salary = salary;
            this.hireDate = hireDate;
        }
    }

    class ContractEmployee extends Employee1 {

        protected long payPerHour;
        protected String contractPeriod;

        public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
            super(name, birthDate);
            this.payPerHour = payPerHour;
            this.contractPeriod = contractPeriod;
        }
    }
}