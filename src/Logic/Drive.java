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
public class Drive {

    //Attributes
    private String name;
    private String car;
    private String qual;
    private String pyment;

    public Drive() {
    }

    //Constructor
    public Drive(String name1, String car, String qual, String pyment) {
        this.name = name1;
        this.car = car;
        this.qual = qual;
        this.pyment = pyment;
    }

    //Get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public String getPyment() {
        return pyment;
    }

    public void setPyment(String pyment) {
        this.pyment = pyment;
    }

}
