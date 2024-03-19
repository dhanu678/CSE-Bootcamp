class ComplexSituation {
    public static void main(String[] args) {

        System.out.println(10 + 20 + 30);

        System.out.println("CSE" + 10 + 20 + 30);
        // "CSE10" + 20 + 30 => "CSE1020" + 30 ="CSE102030"
        // CSE102030

        System.out.println(10 + 20 + "CSE" + 30);
        // 30 + CSE => "30CSE" + 30 => 30CSE30

        System.out.println(10 + 20 + "CSE" + true + (20 + 10));
        // 30CSEtrue2010
        // "30CSE" => "30CSEtrue" + 20=> "30CSEtrue20" + 10 => 30CSEtrue2010
    }
}
