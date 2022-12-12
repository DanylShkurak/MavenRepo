package homework20.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {
    int firstOperand;
    int secondOperand;

    public int calculate(){
       return firstOperand + secondOperand;
    }
}
