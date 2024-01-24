public class Calculator extends Opertion {

    // The code you provided is defining four methods in the Calculator class:
    // addition, subtraction,
    // multiplication, and division.
    float addition(float opr1, float opr2) {
        return opr1 + opr2;
    }

    float subtraction(float opr1, float opr2) {
        return opr1 - opr2;
    }

    float multiplication(float opr1, float opr2) {
        return opr1 * opr2;
    }

    float division(float opr1, float opr2) {
        return opr1 / opr2;
    }

    /**
     * The main function creates an instance of the Calculator class, performs
     * addition, subtraction,
     * multiplication, and division operations on two operands, and prints the
     * results.
     */
    public static void main(String[] args) {
        // float square,cube,modulus;
        Calculator calc = new Calculator();
        // Operations calc1=new Operations();
        float opr1 = 10;
        float opr2 = 63;
        float add = calc.addition(opr1, opr2);
        System.out.println("Addition = " + add);
        float sub = calc.subtraction(opr1, opr2);
        System.out.println("Subtration = " + sub);
        float mul = calc.multiplication(opr1, opr2);
        System.out.println("Multiplication = " + mul);
        float div = calc.division(opr1, opr2);
        System.out.println("Division = " + div);

        float sq = calc.square(opr1); // Call square method
        System.out.println("Square = " + sq); // Print square result
        float cu = calc.cube(opr1); // Call cube method
        System.out.println("Cube = " + cu); // Print cube result
        float mu = calc.modulus(opr1, opr2); // Call modulus method
        System.out.println("Modulus = " + mu);

    }
}