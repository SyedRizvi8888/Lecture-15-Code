public class name {
    private String firstN;
    private String lastN;
    private char middleI;
    
    // Constructor
    public name(String firstN, char middleI, String lastN) {
        this.firstN = firstN;
        this.middleI = middleI;
        this.lastN = lastN;
    }

    public String firstName(){
        return firstN;
    }
    public String lastN(){
        return lastN;
    }
    public String middleI(){
        return middleI();
    }
    public String normalOrder() {
        // This will return the normal orderr
        return firstN + " " + middleI + ". " + lastN;
    }

    // This will get the reverse order 
    public String reverse() {
        return lastN + ", " + firstN+ " " + middleI + ".";
    }
}
