package id.dicoding.mirel.vgsa_pertemua7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class List_Negara extends AppCompatActivity {

    private ListView list_negara;
    private String[] namanegara = new String[]{
            "indonesia","Singapura","jepang","timor leste",
            "venesuela","Taiwan","Texas","Roma"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__negara);
        getSupportActionBar().setTitle("List sederhana");
        list_negara =(ListView)findViewById(R.id.list_negara);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(List_Negara.this,android.R.layout.simple_expandable_list_item_1,android.R.id.text1,namanegara);
        list_negara.setAdapter(adapter);

        list_negara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(List_Negara.this,"Memilih :"+namanegara[position],Toast.LENGTH_LONG).show();
            }
        });

    }
}