/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;


/**
 *
 * @author Sara
 */
public class Users {
    
    //Attributes
    private String user;
    private String pass;
    private String age;
    private String gender;
    private String card;
    private String phone;
    private int qual;
   
    //Constructor

    public Users(String user, String pass, String age, String gender, String card, String phone,int qual) {
        this.user = user;
        this.pass = pass;
        this.age = age;
        this.gender = gender;
        this.card = card;
        this.phone = phone;
        this.qual=qual;
    }

    public Users() {
     
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCard() {
        return this.card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String mostrar(){
        return user;
    }

    public int getQual() {
        return qual;
    }

    public void setQual(int qual) {
        this.qual = qual;
    }
    

}
