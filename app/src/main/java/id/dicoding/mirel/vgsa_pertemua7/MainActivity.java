package id.dicoding.mirel.vgsa_pertemua7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btninput,btnkalkulator,btnlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninput = (Button)findViewById(R.id.btninputnama);
        btninput.setOnClickListener(this);
        btnkalkulator = (Button)findViewById(R.id.btnkalkulator);
        btnkalkulator.setOnClickListener(this);
        btnlist = (Button)findViewById(R.id.btnlistnegara);
        btnlist.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btninputnama:
                Intent moveinputintent = new Intent(MainActivity.this,Input_Nama.class);
                startActivity(moveinputintent);
                break;

            case R.id.btnkalkulator:
                Intent movekalkulaorintent = new Intent(MainActivity.this,Kalkulator.class);
                startActivity(movekalkulaorintent);
                break;

            case R.id.btnlistnegara:
                Intent movenegaraintent = new Intent(MainActivity.this,List_Negara.class);
                startActivity(movenegaraintent);
                break;
        }
    }
}