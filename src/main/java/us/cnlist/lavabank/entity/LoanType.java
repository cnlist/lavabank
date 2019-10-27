package us.cnlist.lavabank.entity;

public enum LoanType {

    QIWI("qiwi"),
    CONSUMER("consumer"),
    MORTGAGE("mortgage"),
    CARS("cars");
    private String type;

    LoanType(String type) {
        this.type = type;
    }
}
