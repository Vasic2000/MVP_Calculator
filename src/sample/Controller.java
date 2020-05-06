package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    // форма: поля ввода
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;

    // форма: поля вывода
    @FXML private Label LabelRes;
    @FXML private Label LabelResult;

    // контролер должен знать модель
    // в модели все вычисления и внутренние данные
    private Model model = new Model();
    private View view = new View();

    // нажатите кнопки BtnPlus
    @FXML public void onActionBtnPlus() {
        model.setOp("+");
    }

    // нажатите кнопки BtnMinus
    @FXML public void onActionBtnMinus() {
        model.setOp("-");
    }

    // нажатите кнопки BtnPlus
    @FXML public void onActionBtnMultiply() {
        model.setOp("x");
    }

    // нажатите кнопки BtnMinus
    @FXML public void onActionBtnDevide() {
        model.setOp("/");
    }

    // нажатите кнопки BtnGo - получение результата
    @FXML public void onActionBtnGo() {
        this.go();
    }

    // функция для получения и вывода результата
    private void go() {
        // отдаем модели нужные данные
        model.setNum1(tf1.getText());
        model.setNum2(tf2.getText());

        // вычисляем результат
        model.go();

        // дальше нужно вывести результат
        // ...
        view.displayLabel(model.getRes().toString(), LabelRes);
        view.displayLabel(model.getResult(), LabelResult);
    }
}
