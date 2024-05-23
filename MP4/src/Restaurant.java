import java.util.List;
public class Restaurant
{
    private List<Tables> listOfTables;
    private List<Reservations> listOfReservations;

    public Restaurant()
    {
        listOfTables = new List<Table>();
        listOfReservations = new List<Reservation>();
    }
    public void addTable()
    {
        listOfTables.add(new Table(tableNumber));
    }
    public void addReservation(int reservationId, int tableNumber, int tableTime, String customerName)
    {
        Table table = findTableForReservation(tableNumber);
        if (table != null && table.isAvailable) {
            listOfReservations.add(new Reservation(tableNumber, reservationId, tableTime, customerName));
            table.setAvailable(false);
        } else {
            System.out.println("The table is not available or does not exist.");
        }

    }
    public void cancelReservation()
    {
        Reservation reservationToCancel = null;
        for (Reservation reservation : listOfReservations) {
            if (reservation.getReservationId() == reservationId) {
                reservationToCancel = reservation;
                break;
            }
        }
        if (reservationToCancel != null) {
            listOfReservations.remove(reservationToCancel);
            updateTableAvailability(reservationToCancel.getTableNumber(), true);
        }
    }

    private Table findTableForReservation(int tableNumber)
    {
        for (Table table: listOfTables) {
            if (table.getTableNumber() == tableNumber) {
                return table;
            }
        }
        return null;
    }
    public void updateTableAvailability(int tableNumber, boolean isAvilable)
    {
        Table table = findTableForReservation(tableNumber);
        if (table != null) {
            table.setAvailable(availbility);
        }
    }
}
