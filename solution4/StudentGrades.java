package solution4;

import java.util.HashMap;

class StudentGrades {
    // Step 1: Create HashMap to store student name and grade
    HashMap<String, Integer> grades = new HashMap<>();

    // Step 2: Add a student and their grade
    void addStudent(String name, int grade) {
        grades.put(name, grade);  // adds new or updates existing student
        System.out.println("✅ Student " + name + " added with grade " + grade);
    }

    // Step 3: Remove a student
    void removeStudent(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println("🗑️ Student " + name + " removed successfully.");
        } else {
            System.out.println("❌ Student " + name + " not found.");
        }
    }

    // Step 4: Display grade of a student
    void displayGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println("📘 " + name + "'s grade: " + grades.get(name));
        } else {
            System.out.println("❌ Student " + name + " not found.");
        }
    }
}



