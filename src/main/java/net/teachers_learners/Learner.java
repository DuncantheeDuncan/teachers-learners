package net.teachers_learners;

import java.util.HashMap;
import java.util.Map;

public class Learner implements Person {
    Map<String, Subjects> namesAndSubjects = new HashMap<String, Subjects>();
    public String firstName() {

        return null;
    }

    public String lastName() {

        return null;
    }

    public String email() {

        return null;
    }

    public Integer tokens() {

        return null;
    }


    public  Subjects getSubjects(){

        return Subjects.Accounting;


    }

  public void  addLearner(Learner learner){
        namesAndSubjects.put("Phumlani",Subjects.Accounting);
         System.out.println(namesAndSubjects);


    }
}
