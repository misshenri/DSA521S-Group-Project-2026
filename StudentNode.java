public class StudentNode {

    String studentNumber;
    String name;
    String serviceType;
    int estimatedServiceTime;
    StudentNode next;

    // Constructor
    public StudentNode(String studentNumber, String name,
                        String serviceType, int estimatedServiceTime) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.serviceType = serviceType;
        this.estimatedServiceTime = estimatedServiceTime;
        this.next = null;
    }
}