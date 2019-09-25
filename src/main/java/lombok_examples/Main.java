package lombok_examples;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public static void main(String[] args) {

        Person person = Person.builder()
                .age(11)
                .beer("tuborg", 1)
                .beer("leff", 3)
                .name("Rivka")
                .salary(10)
                .child("Moshe")
                .child("Rubi")
                .דג("carpion")
                .build();
        System.out.println(person);


//        PolicyService.Builder builder = new PolicyService.Builder();
//        PolicyService policyService = builder.age(12).numberOfAccidents(1).vetek(4).build();
    }
}




