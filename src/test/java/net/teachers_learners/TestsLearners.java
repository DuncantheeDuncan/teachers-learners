package net.teachers_learners;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsLearners {

    @Test
   public void AddingALearner(){
        Learner learner = new Learner();

        learner.namesAndLastNames.clear();

        learner.firstName("Muzi");
        learner.firstName("Thanbang");
        learner.firstName("Scelo");


        System.out.println(learner.namesAndLastNames);
        assertEquals("dd",learner.namesAndLastNames.toString(),"{Muzi= one, Thanbang= one, Scelo= one, Menzi=Ndlovu, Jack=Mthembu}");

    }

    @Test
    public void checkIfHas3subjects(){
        Learner learner = new Learner();
        Subjects.Agriculture.toString();

        System.out.println(learner.namesAndLastNames);
    }
}
