package db;

import model.Customer;

public class Database {

    private Customer[] customerArray;

    public Database(){
        this.customerArray=new Customer[0];
    }
//extendArray Method

    public void extendArray(){
        Customer[] temArray=new Customer[customerArray.length+1];

        for (int i=0;i<customerArray.length;i++){
            temArray[i]=customerArray[i];
        }
        customerArray=temArray;
    }


    //add customer method
    public boolean addCustomer(Customer customer){
        extendArray();
        customerArray[customerArray.length-1]=customer;
        return true;
    }

    //get all customers

    public Customer[] getAllCustomers(){
        Customer[] temArray=new Customer[customerArray.length];

        for (int i=0;i<customerArray.length;i++){
            temArray[i]=customerArray[i];
        }
        return temArray;
    }

    //get customer by Id  if (c.getId().equalsIgnoreCase(id))
    public Customer getCustomerById(Integer id){
        for (Customer customer : customerArray){
            if(customer.getId()==id){
                return customer;
            }
        }
        return null;
    }

    // delete customer by id
    public boolean deleteCustomerById(Integer id){

        for (Customer customer:customerArray){
            if(customer.getId()==id){
                deleteCustomer(id);
                return true;
            }
        }

        return false;
    }

    public void deleteCustomer(Integer id){
        Customer[] temArray =new Customer[customerArray.length-1];

        for (int i=0;i< customerArray.length;i++){
            if(!(customerArray[i].getId()==id)){
                temArray[i]=customerArray[i];
            }
        }
        customerArray=temArray;
    }


    //update cutomer
    public boolean updateCustomer(Integer id, Customer newCustomer){
        for (int i =0;i<customerArray.length;i++){
            if(customerArray[i].getId()==id){
                customerArray[i]=newCustomer;
                return true;
            }
        }
        return false;
    }


}
