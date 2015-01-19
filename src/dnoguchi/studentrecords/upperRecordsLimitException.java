package dnoguchi.studentrecords;

public class upperRecordsLimitException extends Exception {
    private int upperRecordsLimit;

    public upperRecordsLimitException(int upperRecordsLimit) {
        this.upperRecordsLimit = upperRecordsLimit;
        System.err.println("Records out of limit!");
    }

    public int getUpperRecordsLimit() {
        return this.upperRecordsLimit;
    }
}
