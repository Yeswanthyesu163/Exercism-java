import java.util.*;
public class PythagoreanTriplet {

    private int a;
    private int b;
    private int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c =c;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof PythagoreanTriplet)) {
            return false;
        }
        PythagoreanTriplet temp = (PythagoreanTriplet) obj;
        return this.a == temp.a && this.b == temp.b && this.c == temp.c;
    }



    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }

    public static class PythagoreanTripletBuilder {
        private int factor;
        private int sum;

        public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int factor) {
            this.factor = factor;
            return this;
        }

        public PythagoreanTripletBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            int a,b,c;
            for(a = 1; a < factor; a++) {
                for(b = a + 1; b < factor; b++) {
                    c = sum - a - b;
                    if(c < a || c < b) {
                        break;
                    }
                    if( (a*a) + (b*b) == (c*c)) {
                        triplets.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
            return  triplets;
        }
    }


}
