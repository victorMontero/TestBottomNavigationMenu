package br.com.testebottomnavigationmenu;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tituloTextView;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tituloTextView = findViewById(R.id.titulo_text_view);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.compras){
                    tituloTextView.setText("Compras");
                } else if (menuItem.getItemId() ==R.id.listas){
                    tituloTextView.setText("Listas Salvas");
                } else {
                    tituloTextView.setText("Promos");
                }
                return true;
            }
        });
    }
}
