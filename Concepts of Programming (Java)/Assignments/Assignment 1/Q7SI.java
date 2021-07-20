class Q7SI {
    public static void main(String args[]) {
        double pricipal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        double SI = (pricipal * rate * time) / 100;
        System.out.println("SimpleInterest= " + SI);
    }
}