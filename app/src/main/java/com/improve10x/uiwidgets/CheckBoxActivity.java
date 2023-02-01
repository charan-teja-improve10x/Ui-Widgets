package com.improve10x.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        orderButton();
    }

    private void orderButton() {
        Button orderBtn = findViewById(R.id.order_btn);
        orderBtn.setOnClickListener(v -> {
        CheckBox pizzzaCheckBox = findViewById(R.id.pizza_check_box);
        CheckBox coffeeCheckBox = findViewById(R.id.coffe_check_box);
        CheckBox burgerCheckBox = findViewById(R.id.burger_check_box);
        boolean isPizzaChecked = pizzzaCheckBox.isChecked();
        boolean isCoffeeChecked = coffeeCheckBox.isChecked();
        boolean isBurgerChecked = burgerCheckBox.isChecked();
        String orderDetails = placeOrder(isPizzaChecked, isCoffeeChecked, isBurgerChecked);
            Toast.makeText(this, orderDetails, Toast.LENGTH_LONG).show();
        });
    }
    public  String placeOrder(boolean isPizzaChecked, boolean isCoffeeChecked, boolean isBurgerChecked) {
        int bilAmount = 0;
        String result = "Selected Items : ";
        if (isPizzaChecked) {
            result += "\t Pizza 130 Rs";
            bilAmount += 130;
        }
        if (isCoffeeChecked) {
            result += "\t Coffee 60 Rs";
            bilAmount += 60;
        }
        if (isBurgerChecked) {
            result += "\t Burger 170 Rs";
            bilAmount += 170;
        }
        result += "\t Total :" + bilAmount;
        return result;
    }
}