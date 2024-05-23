import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Table> listOfTables;
    private List<Reservation> listOfReservations;

    public Restaurant() {
        this.listOfTables = new ArrayList<>();
        this.listOfReservations = new ArrayList<>();
    }

    public boolean addReservation(Reservation reservation) {
        System.out.println("Attempting to add reservation: " + reservation);
        Table table = findTableForReservation(reservation.getNumberOfGuests());
        if (table != null) {
            System.out.println("Found table: " + table.getTableID() + " for reservation.");
            if (table.isAvailable()) {
                listOfReservations.add(reservation);
                updateTableAvailability(table.getTableID(), false);
                System.out.println("Reservation added successfully.");
                return true;
            } else {
                System.out.println("Table found but it is not available.");
            }
        } else {
            System.out.println("No suitable table found for reservation.");
        }
        return false;
    }


    private Table findTableForReservation(int numberOfGuests) {
        for (Table table : listOfTables) {
            if (table.getCapacity() >= numberOfGuests) {
                return table;
            }
        }
        return null;
    }

    public void updateTableAvailability(int tableID, boolean isAvailable) {
        for (Table table : listOfTables) {
            if (table.getTableID() == tableID) {
                table.setIsAvailable(isAvailable);
                break;
            }
        }
    }

    public void addTable(Table table) {
        listOfTables.add(table);
    }
}
