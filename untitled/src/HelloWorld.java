import model.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, nice to meet you");


        Person Hoa = new Person("Dang Van", "Hoa", LocalDate.of(2002, 7, 27));
        Person Son = new Person("Dang Van", "Son", LocalDate.of(2002,4,13));

        Hoa.setSpouse(Son);

        Dog Ki = new Dog("Ki", LocalDate.of(2018,2,2));

        Ki.bark();
        Hoa.setPet(Ki);

        System.out.println(Hoa);
    }

}
