class Demo {
    public static void main(String args[]) {
        Calc obj = new Calc();
        int result = Calc.add(4,3);
        System.out.println(result);
        double result1 = Calc.add(4.00000000000000,3);
        System.out.println(result1);
    }
}
