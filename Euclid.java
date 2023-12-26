class Euclid {

    public int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    public static void main(String []args) {
        int result = new Euclid().gcd(12,2);
        System.out.println(result);
    }
}
