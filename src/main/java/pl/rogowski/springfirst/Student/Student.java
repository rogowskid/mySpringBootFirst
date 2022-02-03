package pl.rogowski.springfirst.Student;

import lombok.Data;

import java.util.Random;
@Data
public class Student {

    private String[] nameRandom = {"Asia", "Kasia", "Daniel", "Patryk", "Michal"};
    private String[] surNameRandom = {"Kowalski", "Robak", "Rogowski", "Chelmicki"};
    private String[] classNameRandom = {"3ID13", "3ID12", "3ID11"};
    private Random random;
    private String name;
    private String surName;
    private String className;
    private int randomIndex;

    public Student() {
        random = new Random();
    }

    public Student(String name, String surName, String className, int randomIndex) {
        this.name = name;
        this.surName = surName;
        this.className = className;
        this.randomIndex = randomIndex;
        random = new Random();
    }

    public Student createStudent()
    {
        String tempName = nameRandom[random.nextInt(nameRandom.length)];
        String tempSurName = surNameRandom[random.nextInt(surNameRandom.length)];

        if (tempName.charAt(tempName.length()-1) == 'a')
        {
            if(tempSurName.endsWith("i"))
            {
                tempSurName = tempSurName.substring(0, tempSurName.length()-1) + "a";

            }
        }

        if(tempName.charAt(tempName.length()-1) != 'a')
        {
            if(tempSurName.endsWith("a"))
            {
                tempSurName = tempSurName.substring(0, tempSurName.length()-1) + "i";

            }

        }

        return new Student(tempName, tempSurName, classNameRandom[random.nextInt(classNameRandom.length)], random.nextInt(1000));

    }


    @Override
    public String toString() {
        return "<br>Students: <br> " +
                "Name: " + name + "<br>" +
                "SurName: " + surName + "<br>" +
                "ClassName: " + className + "<br>" +
                "RandomIndex: " + randomIndex;
    }
}
