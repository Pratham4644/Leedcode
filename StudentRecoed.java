class StudentRecord {

    public int id;
    public String name;

    StudentRecord(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public static void main(String[] args) {
        StudentRecord[] arr;
        arr = new StudentRecord[5];
        arr[0] = new StudentRecord(1, "Alice");
        arr[1] = new StudentRecord(2, "Bob");
        arr[2] = new StudentRecord(3, "Charlie");
        arr[3] = new StudentRecord(4, "David");
        arr[4] = new StudentRecord(5, "Eve");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ID: " + arr[i].id + ", Name: " + arr[i].name);
        }

    }
}