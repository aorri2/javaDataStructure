package programmers.lv1;

import java.util.function.Predicate;

public class OddAndEven {
        public String solution(int num) {
            String answer = "";
            int[] arr = new int[3];
            if(Number.EVEN.calculate(num)){
                return Number.EVEN.getValue();
            }
            return Number.ODD.getValue();
        }


    }

    enum Number{
        EVEN(value ->(value%2==0),"Even" ),
        ODD(value ->(value%2!=0),"Odd");

        private Predicate<Integer> expression;
        private String value;
        Number(Predicate<Integer> expression,String value){
            this.expression = expression;
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        public boolean calculate(Integer value){return expression.test(value);}


}
