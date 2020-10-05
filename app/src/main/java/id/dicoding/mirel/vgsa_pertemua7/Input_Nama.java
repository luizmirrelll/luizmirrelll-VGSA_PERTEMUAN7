package id.dicoding.mirel.vgsa_pertemua7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Input_Nama extends AppCompatActivity {
    EditText textnama;
    TextView hasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input__nama);
        textnama =findViewById(R.id.txtnama);
        hasil =findViewById(R.id.lbl_nama);
    }
    public void TampilNama(View v){
        hasil.setText("nama anda :"+textnama.getText());
    }
}