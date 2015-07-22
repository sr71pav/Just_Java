package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    public int quantity, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantity = 2;
        price = 5;
        displayPrice(quantity * price);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //int quantity=2, price=5;
        //display(quantity);

        //displayPrice(quantity * price);
        int total = quantity * price;
        String priceMessage = "Total: $" + total + "\nHave a nice day!";
        displayMessage(priceMessage);
    }

    /**
     * This method increments the quantity by 1.
     */
    public void increment(View view) {
        //int quantity = 3;
        quantity += 1;
        display(quantity);
    }

    /**
     * This method decrements the quantity by 1.
     */
    public void decrement(View view) {
        //int quantity = 1;
        if (quantity == 0) {
          quantity = 0;
        }
        else {
            quantity -= 1;
        }

        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
