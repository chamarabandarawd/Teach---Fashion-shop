import model.Customer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer cust1= new Customer();
        Customer cust2=new Customer(2,"chamara","0719138264");

        Integer n1=2;
        Integer n2=44;
        System.out.println(n1==n2);
        System.out.println(cust1);
        System.out.println(cust2.getId()+cust2.getName()+cust2.getPhone());
    }
}