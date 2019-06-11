package net.teachers_learners;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testss {

    @Test

   public void nh(){

        String name = "phumlani";
        String Sname = "mthembu";
//        System.out.println();
        System.out.println(name + Sname);
        assertEquals(name +" "+ Sname ,("phumlani mthembu"));


    }
    @Test
    public void addingNamesAndSubject(){
        Learner learner = new Learner();

        learner.namesAndSubjects.clear();
        learner.namesAndSubjects.put("Jack", Subjects.Aggriculture);
//        learner.namesAndSubjects.put("Jack", Subjects.Venda);
        System.out.println(learner.namesAndSubjects+ " this i s the map");
        System.out.println(learner.namesAndSubjects.keySet() + " this is key set");
        System.out.println(learner.namesAndSubjects.values() + " this is values");
        System.out.println(learner.namesAndSubjects.size() + " this is size");

//        assertEquals("{Jack=Aggriculture}",learner.namesAndSubjects);


    }

}
