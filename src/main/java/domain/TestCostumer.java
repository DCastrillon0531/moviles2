package domain;

public class TestCostumer {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();

        costumer.setEmail("pp@gmail.com");
        System.out.printf(costumer.getEmail());
    }

}
