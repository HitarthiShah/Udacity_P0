package com.example.hitarthishah.udacity_p0;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void clickOnButton(View view){
        Button button = (Button) view;
        Toast.makeText(MainActivity.this, "This Button Will Launch "+button.getText()+" ! ", Toast.LENGTH_SHORT).show();
    }
}
