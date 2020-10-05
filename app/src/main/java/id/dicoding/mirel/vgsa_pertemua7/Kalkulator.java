package id.dicoding.mirel.vgsa_pertemua7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {
    private EditText angka1,angka2;
    private Button tambah,kurang,kali,bagi,bersihkan;
    private TextView tv_hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        angka1 = (EditText)findViewById(R.id.angka1);
        angka2 =(EditText)findViewById(R.id.angka2);
        tambah =(Button)findViewById(R.id.tambah);
        kurang = (Button)findViewById(R.id.kurang);
        kali = (Button)findViewById(R.id.kali);
        bagi = (Button)findViewById(R.id.bagi);
        bersihkan =(Button)findViewById(R.id.bersih);
        tv_hasil =(TextView)findViewById(R.id.tv_hasil);


                tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1.getText().length()>0)&&(angka2.getText().length()>0)){
                    double angka_1 = Double.parseDouble((angka1.getText().toString()));
                    double angka_2 =Double.parseDouble(angka2.getText().toString());
                    double SamaDengan= angka_1 + angka_2;
                    tv_hasil.setText(Double.toString(SamaDengan));
                }else {
                    Toast toast = Toast.makeText(Kalkulator.this,"mohon di isi angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

                kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1.getText().length()>0)&&(angka2.getText().length()>0)){
                    double angka_1 = Double.parseDouble((angka1.getText().toString()));
                    double angka_2 =Double.parseDouble(angka2.getText().toString());
                    double SamaDengan= angka_1 - angka_2;
                    tv_hasil.setText(Double.toString(SamaDengan));
                }else {
                    Toast toast = Toast.makeText(Kalkulator.this,"mohon di isi angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

                kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1.getText().length()>0)&&(angka2.getText().length()>0)){
                    double angka_1 = Double.parseDouble((angka1.getText().toString()));
                    double angka_2 =Double.parseDouble(angka2.getText().toString());
                    double SamaDengan= angka_1 * angka_2;
                    tv_hasil.setText(Double.toString(SamaDengan));
                }else {
                    Toast toast = Toast.makeText(Kalkulator.this,"mohon di isi angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
                bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka1.getText().length()>0)&&(angka2.getText().length()>0)){
                    double angka_1 = Double.parseDouble((angka1.getText().toString()));
                    double angka_2 =Double.parseDouble(angka2.getText().toString());
                    double SamaDengan= angka_1 / angka_2;
                    tv_hasil.setText(Double.toString(SamaDengan));
                }else {
                    Toast toast = Toast.makeText(Kalkulator.this,"mohon di isi angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
                bersihkan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        angka1.setText("");
                        angka2.setText("");
                        tv_hasil.setText("0");
                        angka1.requestFocus();
                    }
                });

    }
}