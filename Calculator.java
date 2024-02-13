/**
 * The Calculator class performs addition, subtraction, multiplication, and division operations on two
 * float operands.
 */

 class Calculator{
/**
 * The function "addition" takes two float numbers as input and returns their sum.
 *
 * @param operand1 The first operand for addition. It is a float data type.
 * @param operand2 The second operand in the addition operation.
 * @return the sum of operand1 and operand2.
 */
    float addition(float operand1,float operand2){
        return(operand1+operand2);
    }
   /**
    * The function performs subtraction of two float numbers.
    *
    * @param operand1 The first operand for subtraction. It is a float data type.
    * @param operand2 The second operand in the subtraction operation.
    * @return the result of subtracting operand2 from operand1.
    */
    float subtraction(float operand1,float operand2){
        return(operand1-operand2);
    }

/**
  * The function "multiplication" takes two float numbers as input and returns their product.
  *
  * @param operand1 The first operand for multiplication. It is a float data type.
  * @param operand2 The second operand in the multiplication operation.
  * @return the product of the two operands, which is the result of the multiplication.
  */
 
    float multiplication(float operand1,float operand2){
        return(operand1*operand2);
    }
/**
 * The division function takes two float operands and returns their quotient.
 *
 * @param operand1 The first operand of the division operation. It is a floating-point number.
 * @param operand2 The second operand in the division operation.
 * @return The division of operand1 by operand2.
 */
    float division(float operand1,float operand2){
        return(operand1/operand2);
    }
    float square(float operand1){
        return(operand1*operand1);
    }
 /**
  * The main function creates an instance of the Calculator class and performs addition, subtraction,
  * multiplication, and division operations on two operands.
  */
    public static void main(String[] args) {
        Calculator c=new Calculator();
        float operand1=10;
        float operand2=12;
        System.out.println("Sum:"+c.addition(operand1, operand2));
        System.out.println("Difference"+c.subtraction(operand1, operand2));
        System.out.println("Product:"+c.multiplication(operand1, operand2));
        System.out.println("Quotient:"+c.division(operand1, operand2));
        System.out.println("Square:"+c.square(operand1));
    }
}
