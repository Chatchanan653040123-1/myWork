package exercise;

import java.util.ArrayList;

public class TestEnKKUStudent22 {
    public static void main(String[] args) {
        ArrayList<EnKKUStudent22> students = new ArrayList<EnKKUStudent22>();
        students.add(new COEStudent22());
        students.add(new DMEStudent22());
        int numStudents = students.size();
        for (int i = 0; i < numStudents; i++) {
            students.get(i).register();
        }
    }
}
