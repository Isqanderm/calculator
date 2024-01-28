package Calculator;

import Operations.MinusOperation;
import Operations.MultiplicationOperation;
import Operations.Operation;
import Operations.PlusOperation;

import java.util.HashMap;

public class Calculator {
    private HashMap<String, Operation> operations = new HashMap<>();

    private Formula parseFormula(String formula) {
        String[] splitFormula = formula.split(" ");
        float value1 = Float.parseFloat(splitFormula[0]);
        String operation = splitFormula[1];
        float value2 = Float.parseFloat(splitFormula[2]);

        return new Formula(operation, value1, value2);
    }

    private Operation getOperation(String operation) {
        return this.operations.get(operation);
    }

    public void addOperation(Operation operation) {
        this.operations.put(operation.getOperation(), operation);
    }

    public float apply(String formula) throws Exception {
        Formula parsedFormula = this.parseFormula(formula);
        Operation operation = this.getOperation(parsedFormula.getOperation());

        if (operation != null) {
            return operation.apply(parsedFormula.getValue1(), parsedFormula.getValue2());
        }

        throw new Exception("Not supported operation");
    }
}
