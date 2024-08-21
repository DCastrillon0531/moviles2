package domain;

public class Costumer extends User {
    private String costumerType;

    public Costumer() {
        super();
    }

    public Costumer(int idUser, String nameUser, String lastNameUser, String email, String cellphone, String address, String city, String state, String country, String password, UserType userType, String costumerType) {
        super(idUser, nameUser, lastNameUser, email, cellphone, address, city, state, country, password, userType);
        this.costumerType = costumerType;
    }

    public String getCostumerType() {
        return costumerType;
    }

    public void setCostumerType(String costumerType) {
        this.costumerType = costumerType;
    }

    @Override
    public void createUser() {
        super.createUser();
    }

    @Override
    public void listUser() {
        super.listUser();
    }

}
