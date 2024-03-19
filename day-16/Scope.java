class Scope {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            int count = 0; // at this line the count varaible will be re initialized
            for (int j = 0; j < 4; j++) {
                count++;
                System.out.print("count= " + count + ", ");
            }
            System.out.println();
        }
    }
}
