public class Risk {

    private String description;
    private String consequence;
    private double probabilityPercent;   // 0..1
    private Probability probabilityLevel;
    // private int probability;   // 0..100
    // private String probability;   // LOW, MEDIUM, HIGH

    Risk() {
        probabilityPercent = 0.01;
    }

    public String hello() {
        return "Hello!";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConsequence() {
        return consequence;
    }

    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    public double getProbabilityPercent() {
        return probabilityPercent;
    }

    public void setProbabilityPercent(double probabilityPercent) {
        this.probabilityPercent = probabilityPercent;
    }

    public Probability getProbabilityLevel() {
        return probabilityLevel;
    }

    public void setProbabilityLevel(Probability probabilityLevel) {
        this.probabilityLevel = probabilityLevel;
    }
}



