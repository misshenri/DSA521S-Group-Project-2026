public class StudentLinkedList {

    StudentNode head;

    public StudentLinkedList() {
        this.head = null;
    }

    // Insert a student at a given 1-based position.
    // position 1 = insert at the beginning.
    // position >= current length + 1 = insert at the end.
    // any position in between = insert in the middle.
    public void insertStudent(String studentNumber, String name,
                               String serviceType, int estimatedServiceTime,
                               int position) {

        StudentNode newNode = new StudentNode(studentNumber, name,
                serviceType, estimatedServiceTime);

        // Insert at the beginning (or list is empty)
        if (head == null || position <= 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Walk to the node just before the insertion point
        StudentNode current = head;
        int count = 1;

        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }

        // Insert after 'current' (covers both middle and end cases)
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a student by student number
    public void deleteStudent(String studentNumber) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // Deleting the head node
        if (head.studentNumber.equals(studentNumber)) {
            head = head.next;
            System.out.println("Student " + studentNumber + " deleted.");
            return;
        }

        StudentNode current = head;
        while (current.next != null && !current.next.studentNumber.equals(studentNumber)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student " + studentNumber + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student " + studentNumber + " deleted.");
        }
    }

    // Search for a student by student number
    public void searchStudent(String studentNumber) {
        StudentNode current = head;

        while (current != null) {
            if (current.studentNumber.equals(studentNumber)) {
                System.out.println("Student found!");
                System.out.println("Student Number: " + current.studentNumber);
                System.out.println("Name: " + current.name);
                System.out.println("Service Type: " + current.serviceType);
                System.out.println("Estimated Service Time: "
                        + current.estimatedServiceTime + " minutes");
                return;
            }
            current = current.next;
        }

        System.out.println("Student not found.");
    }

    // Display all students in the list
    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records to display.");
            return;
        }

        StudentNode current = head;
        while (current != null) {
            System.out.println("Student Number: " + current.studentNumber);
            System.out.println("Name: " + current.name);
            System.out.println("Service Type: " + current.serviceType);
            System.out.println("Estimated Service Time: "
                    + current.estimatedServiceTime + " minutes");
            System.out.println("--------------------------");
            current = current.next;
        }
    }
}

