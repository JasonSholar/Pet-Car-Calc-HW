public class Calculator {
  private int result;
  
  public Calculator(){

    }

public int add(int num1, int num2){
  result = num1 + num2;
  return result;
    }

public int sub(int num1, int num2){
    result = num1 - num2;
    return result;
    }   

public int multiply(int num1, int num2){
    result =num1 * num2;
    return result;
    }

public int division(int num1, int num2){
    result= num1/num2;
    return result;
    }
}
