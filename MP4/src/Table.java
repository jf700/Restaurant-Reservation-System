public class Table {
    private int tableID;
    private int capacity;
    private boolean isAvailable;

    public Table(int tableID, int capacity, boolean isAvailable){
        this.tableID = tableID;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
    }

    public int getTableID() {
        return tableID;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Table table = (Table) obj;
        return tableID == table.tableID;
    }

    @Override
    public String toString(){
        return "TableID: " + tableID + ", capacity: " + capacity + ", isAvailable: " + isAvailable;
    }

}
