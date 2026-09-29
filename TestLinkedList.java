public class TestLinkedList {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        // Insert at beginning
        list.insertStudent("2026001", "Alice", "Registration", 10, 1);

        // Insert at end
        list.insertStudent("2026002", "Brian", "Fees", 15, 2);

        // Insert at end
        list.insertStudent("2026003", "Sarah", "Student Records", 8, 3);

        // Insert in the middle (position 2)
        list.insertStudent("2026004", "David", "Registration", 12, 2);

        System.out.println("STUDENT RECORDS:");
        list.displayStudents();

        System.out.println("\nSEARCHING FOR 2026004:");
        list.searchStudent("2026004");

        System.out.println("\nDELETING 2026004:");
        list.deleteStudent("2026004");

        System.out.println("\nRECORDS AFTER DELETION:");
        list.displayStudents();
    }
}