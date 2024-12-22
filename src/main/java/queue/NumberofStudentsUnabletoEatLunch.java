package queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofStudentsUnabletoEatLunch {

    public static void main(String[] args) {

        int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
        int i = coundStudents(students,sandwiches);
        System.out.println(i);

    }

    private static int coundStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<>();
        Queue<Integer> sandwichQueue = new LinkedList<>();

        // Enqueue all students into the studentsQueue
        for (int student : students) {
            studentsQueue.offer(student);
        }

        // Enqueue all sandwiches into the sandwichQueue
        for (int sandwich : sandwiches) {
            sandwichQueue.offer(sandwich);
        }
        int rotations = 0;


        while (!sandwichQueue.isEmpty() && rotations < studentsQueue.size()) {
            int student = studentsQueue.poll();
            int sandwich = sandwichQueue.peek();

            if (student == sandwich) {

                sandwichQueue.poll();
                rotations = 0;
            } else {

                studentsQueue.offer(student);
                rotations++; // Increase the number of rotations
            }
        }
        return studentsQueue.size();
    }
}
