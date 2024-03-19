class Question7 {
    public static void main(String[] args) {
        int english = 33;
        int math = 73;
        int science = 33;

        // int average = (english + math + science)/3;

        // System.out.println(average);

        // if(average >= 33) {
        // System.out.println("Student is passed");
        // } else {
        // System.out.println("Student is failed");
        // }

        // if (english >= 33 && math >= 33 && science >= 33) {
        // // int average = (english + math + science) / 3;
        // // if (average >= 40) {
        // // System.out.println("Student is passed");
        // // } else {
        // // System.out.println("Student is failed");
        // // }
        // System.out.println(((english + math + science) / 3) >= 40 ? "Student is
        // passed" : "Student is failed");
        // } else {
        // System.out.println("Student is failed");
        // }
        System.out.println((english >= 33 && math >= 33 && science >= 33)
                ? ((english + math + science) / 3) >= 40 ? "Student is passed" : "Student is failed"
                : "Student is failed");
    }
}
