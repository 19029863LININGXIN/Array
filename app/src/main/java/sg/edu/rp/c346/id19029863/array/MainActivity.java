package sg.edu.rp.c346.id19029863.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Durian");

        String fruit = "Fruits\n";
        String theFruit = fruits.get(1);
        fruit += "========\n";
        fruits.remove(0);
        fruits.set(fruits.size()-1, "dragon fruit");

        for (int i = 0; i < fruits.size(); i++){
            fruit += fruits.get(i) + "\n";
        }
        tv.setText(fruit);
    }
}
