import java.util.LinkedList;
public class Restaurant
{
    private LinkedList<Tables> LinkedListOfTables;
    private LinkedList<Reservations> LinkedListOfReservations;

    public Restaurant()
    {
        LinkedListOfTables = new LinkedList<Tables>();
        LinkedListOfReservations = new LinkedList<Reservations>();
    }
    public void addTable()
    {
        LinkedListOfTables.add(new Table(tableNumber));
    }
    public void addReservation(int reservationId, int tableNumber, int tableTime, String customerName)
    {
        Table table = findTableForReservation(tableNumber);
        if (table != null && table.isAvailable) {
            LinkedListOfReservations.add(new Reservation(tableNumber, reservationId, tableTime, customerName));
            table.setAvailable(false);
        } else {
            System.out.println("The table is not available or does not exist.");
        }

    }
    public void cancelReservation()
    {
        Reservation reservationToCancel = null;
        for (Reservation reservation : LinkedListOfReservations) {
            if (reservation.getReservationId() == reservationId) {
                reservationToCancel = reservation;
                break;
            }
        }
        if (reservationToCancel != null) {
            LinkedListOfReservations.remove(reservationToCancel);
            updateTableAvailability(reservationToCancel.getTableNumber(), true);
        }
    }

    private Table findTableForReservation(int tableNumber)
    {
        for (Table table: LinkedListOfTables) {
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
