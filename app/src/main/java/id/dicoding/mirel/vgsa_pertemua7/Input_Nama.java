package id.dicoding.mirel.vgsa_pertemua7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Input_Nama extends AppCompatActivity {
TextView tv_nama;
EditText namaanda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input__nama);
        tv_nama =findViewById(R.id.tv_nama);
        namaanda =findViewById(R.id.edit_nama);
    }
    public void tampil(View v){
        tv_nama.setText("nama anda"+namaanda.getText());
    }
}