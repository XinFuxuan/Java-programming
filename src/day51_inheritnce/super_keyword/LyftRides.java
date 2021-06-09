package day51_inheritnce.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft LyftRides = new Lyft();
        LyftXL LyftXLRide = new LyftXL();
        Lux LuxRide = new Lux();


        System.out.println("Lyft ride at 5 miles "+LyftRides.calculateRate(5));
        System.out.println(LyftXLRide.calculateRate(5));
        System.out.println(LuxRide.calculateRate(5));


    }

}
