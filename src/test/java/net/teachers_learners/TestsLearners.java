package net.teachers_learners;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsLearners {

    @Test
   public void AddingALearner(){
        Learner learner = new Learner();
        String name= "mduduzi";
        System.out.println(learner.firstName(name));


    }

}
