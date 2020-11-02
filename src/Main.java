public class Main {

    public static void main(String[] args) {

        Risk risk = new Risk();
        risk.setDescription("Noget forfærdeligt");
        System.out.println(risk.getDescription() + " kommer til at ske med " + risk.getProbabilityPercent() + " % chance. ");
    }
}
