package Calculator;

class Formula {
    private String operation;
    private float value1;
    private float value2;

    public Formula(String operation, float value1, float value2) {
        this.operation = operation;
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getOperation() {
        return operation;
    }

    public float getValue1() {
        return value1;
    }

    public float getValue2() {
        return value2;
    }
}