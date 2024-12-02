/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

//        setting the deadline for assignments
        DeadLine deadline = new DeadLine(LocalDate.of(2024, 12, 8));
        AssignmentSubmission submission = AssignmentSubmission.getInstance(deadline);

//        creating Assessment objects, with title and content
        Assessment assessment1 = new Assessment("Lab One", "Classes and Objects");
        Assessment assessment2 = new Assessment("Lab Two", "Abstract Classes");
        Assessment assessment3 = new Assessment("Lab Three", "Immutable Classes");

        submission.submit(assessment1);
        submission.submit(assessment2);
        submission.submit(assessment3);

//        for each loop to display all assessments
        for (Assessment assessment : submission.getAssessments()){
            System.out.println(assessment);
        }

//        creating Product objects (laptop and scooter have the same price)
        Product product1 = new Product("Mobile Phone", 900.0);
        Product product2 = new Product("Laptop", 1500.0);
        Product product3 = new Product("Scooter", 1500.0);
        Product product4 = new Product("Air Pods", 120.0);

//        testing the equals method (should be false as all attributes are different
        System.out.println("\nAre Products 1 and 2 the same? " + product1.equals(product2));

//        ArrayList called order, then added all 4 products to it
        ArrayList<Product> order = new ArrayList<>();
        order.add(product1);
        order.add(product2);
        order.add(product3);
        order.add(product4);

//        for each loop to show all products
        System.out.println("\nProducts: \n");
        for (Product product : order){
            System.out.println(product);
        }
    }
}
