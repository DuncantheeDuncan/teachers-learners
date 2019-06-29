package net.teachers_learners;



import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Learner implements Person {
    Map<String, String> namesAndLastNames = new HashMap();
//    Map<String, String> lastNamesAndNames = new HashMap();
    private  String subjects;



//
//    public String firstName() {
//        return null;
//    }
//
//    public String lastName() {
//        namesAndLastNames.put("Phulani1", "Mthembu");
//        namesAndLastNames.put("Phulani2", "Mthembu");
//        namesAndLastNames.put("Phulani3", "Mthembu");
//        namesAndLastNames.put("Phulani4", "Mthembu");
//
//        return String.valueOf(namesAndLastNames.values());
//
//    }
//
//    public String emailAddress() {
//
//        return null;
//    }
//
//    public Integer tokens() {
//
//        return null;
//    }


//    public  Subjects getSubjects(){
//
////        return Subjects.Accounting;
//return Subjects.English;
//
//    }
//

//
//    Languages(String greeting) {
//        this.greeting = greeting;
//
//    }
//
//
//    public String getGreeting() {
//
//        return greeting;
//    }

//                            private String firstName;
//                            Learner(String firstName){
//                                this.firstName = firstName;
//
//                            }
//
//                            public  String getFirstName(){
//
//                                return firstName;
//                            }
//    public void getAll(String firstName){
//
//        System.out.println("one");
//
//
//
//
//    }



    public String firstName(String name) {

        namesAndLastNames.put("Jack","Mthembu");
        namesAndLastNames.put("Menzi","Ndlovu");

        if (!namesAndLastNames.containsKey(name)){
            namesAndLastNames.put(name," one");
        }
        namesAndLastNames.put(name,namesAndLastNames.get(name));

        return String.valueOf(namesAndLastNames);
    }

    public void checkIfLearnerQualify(){

        List<String>subjectList = new ArrayList<String>();

        subjectList.add(Subjects.Agriculture.toString());
        subjectList.add(Subjects.Geography.toString());
        subjectList.add(Subjects.Business_studies.toString());
        subjectList.add(Subjects.English.toString());

        if (subjectList.size() >=3){
            System.out.println("The learner qualify to attend a class ");
            System.out.println("the student is registered for "+subjectList.size()+ " subject(s)");
        }else {
            if (subjectList.size() <= 2){

                System.out.println("does not qualify to attend class\nDo you want to register for a class ");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please add subject: ");
                String addSubject = scanner.next();

                subjectList.add(addSubject);
//TODO: make it to check if it the subject added amounts to 3
                System.out.println("added!!");
            }

        }

        System.out.println(subjectList);

    }


    public static void main(String[] args) {
        Learner learner = new Learner();
//        Todo: remove the Scanner.
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter Students name: ");
            String name = scanner.next();
            System.out.println(learner.firstName(name));
            learner.checkIfLearnerQualify();

        }




        }

    }




