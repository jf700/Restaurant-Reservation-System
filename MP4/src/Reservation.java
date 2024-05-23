import java.time.LocalDateTime;

public class Reservation implements Comparable<Reservation> {
    private int reservationID;
    private Customer customer;
    private LocalDateTime dateTime;
    private int numberOfGuests;
    public Reservation(int reservationID, Customer customer, LocalDateTime dateTime, int numberOfGuests) {
        this.reservationID = reservationID;
        this.customer = customer;
        this.dateTime = dateTime;
        this.numberOfGuests = numberOfGuests;
    }

    public int getReservationID() {
        return reservationID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public int compareTo(Reservation other) {
        return this.dateTime.compareTo(other.dateTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Reservation that = (Reservation) obj;
        return reservationID == that.reservationID;
    }
    
    @Override
    public String toString() {
        return "Reservation{" +"\n"+
                "reservationID=" + reservationID +
                ","+"\n"+"customer=" + customer +
                ","+"\n"+"dateTime=" + dateTime +
                ","+"\n"+"numberOfGuests=" + numberOfGuests +"\n"+
                '}';
    }
}
