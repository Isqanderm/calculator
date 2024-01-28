package Operations;

abstract class OperationAbstract implements Operation {
    private String operation;

    @Override
    public boolean equals(Object obj) {
        return this.operation.equals(obj);
    }
}