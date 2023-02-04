public class Task {
    public int getGreatestCommonDivisor(int a, int b){
        if (b == 0){
            return a;
        }
        return getGreatestCommonDivisor(b, a % b);
    }
    public int getLeastCommonMultiple(int a, int b){
        return a * b/getGreatestCommonDivisor(a,b);
    }
    public int getGreatestCommonDivisorFourValues(int a, int b, int c, int d){
        int firstPair = getGreatestCommonDivisor(a,b);
        int secondPair = getGreatestCommonDivisor(c,d);

        return getGreatestCommonDivisor(firstPair, secondPair);
    }
}
