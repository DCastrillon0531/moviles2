package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public abstract class User implements UtilUser {

    Scanner sc = new Scanner(System.in);

    private int idUser;
    private String nameUser, lastNameUser, email, cellphone, address, city, state, country, password;
    UserType userType;

    // Constructores
    public User() {
    }
    public User(int idUser, String nameUser, String lastNameUser, String email, String cellphone, String address, String city, String state, String country, String password, UserType userType) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        this.email = email;
        this.cellphone = cellphone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.password = password;
        this.userType = userType;
    }

    // Getters And Setters
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    // Metodos

    List<ArrayList<Object>> users = new ArrayList<>();

    public void createUser(){

        ArrayList<Object> user = new ArrayList<>();

        System.out.println("Ingrese el ID del usuario: ");
        idUser = sc.nextInt();
        user.add(idUser);
        sc.nextLine();

        System.out.println("Ingrese el nombre del usuario: ");
        nameUser = sc.nextLine();
        user.add(nameUser);

        System.out.println("ingrese el correo: ");
        email = sc.nextLine();
        user.add(email);

        System.out.println("Tipo Usuario: ");
        String userTypeCostumer = userType.getNameType();
        user.add(userTypeCostumer);

        users.add(user);

    }

    public void listUser(){

    }

    public void updateUser(){

    }

    public void deleteUser(){

    }
}
