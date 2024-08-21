package domain;

public class UserType {

    private int idUserType;
    private String nameType;

    // Constructores
    public UserType() {
    }

    public UserType(int idUserType, String nameType) {
        this.idUserType = idUserType;
        this.nameType = nameType;
    }

    // Getters And Setters
    public int getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }


    public void createUserType(){

    }

    public void listUserType(){

    }
}
