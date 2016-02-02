package com.example.hermon.highlow;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int contador=0;
    Random randomGenerator = new Random();
    int numeroRandom = randomGenerator.nextInt(11)+10;
    public  void guessNumber(View view){
        EditText myTextField = (EditText) findViewById(R.id.textField);
        TextView result = (TextView) findViewById(R.id.textResult);
        int numeroUsuario = Integer.parseInt(myTextField.getText().toString());
        if (numeroUsuario<numeroRandom){
            contador++;
            Toast.makeText(getApplicationContext(), "That number it's lower", Toast.LENGTH_SHORT).show();

        }
        if (numeroUsuario>numeroRandom){
            contador++;
            Toast.makeText(getApplicationContext(), "That number it's higher", Toast.LENGTH_SHORT).show();

        }
        if (numeroUsuario==numeroRandom){
            result.setText("It took you "+contador+" times to guess it");

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
