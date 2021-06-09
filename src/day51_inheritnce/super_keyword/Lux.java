package day51_inheritnce.super_keyword;

public class Lux extends Lyft{
    @Override
    public double calculateRate(double miles){
        // calcualteRate of Lyft + 20 percent
        return super.calculateRate(miles)*1.2;

    }
}
