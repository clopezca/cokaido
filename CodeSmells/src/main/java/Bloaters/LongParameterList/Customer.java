package Bloaters.LongParameterList;

public class Customer {
    private String firstName;

    private String lastName;

    private String title;

    private Address address;

    private String summary;

    private String buildCustomerSummary(
            String customerFirstName,
            String customerLastName,
            String customerTitle, Address address1)
    {
        return customerTitle + " " + customerFirstName + " " + customerLastName + ", " + address1.getCity() + ", "
                + address1.getCountry() + ", " + address1.getPostcode();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Bloaters.LongParameterList.Address getAddress() {
        return address;
    }

    public void setAddress(Bloaters.LongParameterList.Address address) {
        this.address = address;
    }

    public String getSummary() {
        return buildCustomerSummary(
                firstName,
                lastName,
                title,
                new Address(address.getCity(), address.getPostcode(), address.getCountry()));
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
