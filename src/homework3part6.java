public class homework3part6 {
    public static void main(String[] args) {
        int banana=5;
        int oneBanana=80;
        int milk=200;
        int onePartOfMlkWeight=105;
        int iceCream=200;
        int egg=4;
        int oneEggWeight=70;
        int milkPart=milk/100;
float totalWeight=(banana*oneBanana+iceCream+egg*oneEggWeight+milkPart*onePartOfMlkWeight);
float weightInKG=totalWeight/1000;
System.out.println(weightInKG);
    }
}
