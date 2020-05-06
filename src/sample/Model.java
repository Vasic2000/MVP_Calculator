package sample;

public class Model {
    private String op = "-"; // операция
    private String num1 = "1"; // первое число
    private String num2 = "2"; // второе число
    private String result;
    private Double res;

    // выставляет операцию
    void setOp(String o) {
        op = o;
    }

    // выставляет num1
    void setNum1(String s) {
        num1 = s;
    }

    // выставляет num2
    void setNum2(String s) {
        num2 = s;
    }

    // вычисляем результат
    void go() {
        result = num1 + op + num2;
        switch(op) {
            case "+" :
                res = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            case "-" :
                res = Double.parseDouble(num1) - Double.parseDouble(num2);
                break;
            case "x" :
                res = Double.parseDouble(num1) * Double.parseDouble(num2);
                break;
            case "/" :
                res = Double.parseDouble(num1) / Double.parseDouble(num2);
                break;
        }
    }

    // отдаем результат текст
    String getResult() {
        return result;
    }

    // отдаем результат значение
    Double getRes() {
        return res;
    }
}
