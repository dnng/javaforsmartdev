package dnoguchi.studentrecords;

public class upppeRecordsLimitException extends Exception {
    private int upperRecordsLimit;

    public upppeRecordsLimitException(int upperRecordsLimit) {
        this.upperRecordsLimit = upperRecordsLimit;
        System.err.println("Records out of limit!");
    }

    public int getUpperRecordsLimit() {
        return this.upperRecordsLimit;
    }
}
