package Operations;

public class MultiplicationOperation extends OperationAbstract {
    private final String operation = "*";

    @Override
    public String getOperation() {
        return this.operation;
    }

    @Override
    public float apply(float value1, float value2) {
        return value1 * value2;
    }
}
