class OperatorPrecedence{
    public static void main(String []args){
        // BODMAS -bracket,OF,  division, multiplication, addition, subtraction
        System.out.println(10 * 20 + 12);
        System.out.println(10 * 20 + 12 / 10);

        System.out.println(10 * 20 + 12 / 10 % 10);
        System.out.println((20 + 30) % (40 - 20));

    }
}