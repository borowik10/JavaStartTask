package tasks.company;

public class Company {
    public static void main(String[] args) {


        Employee e1 = new Employee();
        e1.firstName = "Paweł";
        e1.lastName = "Borowicki";
        e1.birthYear = 1979;
        e1.seniority = 18;

        Employee e2 = new Employee();
        e2.firstName = "Piotr";
        e2.lastName = "Borowicki";
        e2.birthYear = 1973;
        e2.seniority = 28;

        Employee e3 = new Employee();
        e3.firstName = "Anna";
        e3.lastName = "Borowicka";
        e3.birthYear = 1980;
        e3.seniority = 17;

        System.out.println("Pracownicy w firmie: ");
        System.out.println(e1.firstName + " " + e1.lastName + " ur. " + e1.birthYear + " staż: " + e1.seniority);
        System.out.println(e2.firstName + " " + e2.lastName + " ur. " + e2.birthYear + " staż: " + e2.seniority);
        System.out.println(e3.firstName + " " + e3.lastName + " ur. " + e3.birthYear + " staż: " + e3.seniority);
    }


}
