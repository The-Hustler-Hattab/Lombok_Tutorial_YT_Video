package com.mtattab.app.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
/*
* @Data will generate the following methods:
* 1. toString()
* 2. equals()
* 3. hashCode()
* 4. getters for all fields
* 5. setters for all non-final fields
* 6. a constructor without parameters
* */

/* You can also use the following annotations to generate specific methods:
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
*/


/*
* @Builder(toBuilder = true) will create the builder pattern that returns the object
* toBuilder = true will allow you to use existing object to create a copy or a modified version of it
* */
//@Builder(toBuilder = true)
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor // must-have for @Builder to work
public class PersonWithLombok
//        extends Parent
{

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    Integer age;


    public static void main(String[] args) {
        PersonWithLombok person = new PersonWithLombok();
        person.setFirstName("Mohamed");
        person.setLastName("Hattab");
        person.setEmail("MohammedEmail@email.com");
        person.setPhoneNumber("123-456-7890");
        person.setAge(30);
        System.out.println(person.getAge());
        System.out.println(person.toString());










        PersonWithLombok person2 =  PersonWithLombok.builder()
                .age(30)
                .firstName("Mohamed")
                .lastName("Hattab")
//                .father("Father")

                .build();


        PersonWithLombok person3 = person2.toBuilder().build();
        System.out.println(person3);

    }

}
