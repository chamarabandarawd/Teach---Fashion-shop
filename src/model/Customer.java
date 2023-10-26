package model;

public class Customer {
    private Integer id;
    private String name;
    private String phone;

    public Customer(){

    }

    public Customer(Integer id,String name, String phone ){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    @Override
    public boolean equals(Object obj){
        Customer c1= (Customer) obj;
        return (this.id==c1.id);

    }
}
