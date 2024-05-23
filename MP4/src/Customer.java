public class Customer {
    private int customerID;
    private String name;
    private String contactNumber;

    public Customer()
    {
        this.customerID = 0;
        this.name = "";
        this.contactNumber = "";
    }

    public Customer(int customerID, String name, String contactNumber)
    {
        this.customerID = customerID;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getCustomerID()
    {
        return customerID;
    }

    public String getName()
    {
        return name;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }

    public boolean equals(Customer customer)
    {
        return this.customerID == customer.getCustomerID() && this.name.equals(customer.getName()) && this.contactNumber.equals(customer.getContactNumber());
    }

    public String toString()
    {
        return "Customer ID: " + customerID + ", Name: " + name + ", Contact Number: " + contactNumber;
    }
}

