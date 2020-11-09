package com.example.postest5;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PraktikumActivity extends AppCompatActivity {
    private EditText Tinggi, Sisi1, Sisi2;
    private Button Hitung;
    private TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.praktikum);
        Tinggi = (EditText)findViewById(R.id.tinggi);
        Sisi1 = (EditText)findViewById(R.id.sisi1);
        Sisi2 = (EditText)findViewById(R.id.sisi2);
        Hitung = (Button)findViewById(R.id.hitung);
        Hasil = (TextView)findViewById(R.id.hasil);


        getSupportActionBar().setTitle("Hitung Luas Limas Segi Empat");

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tinggi, sisi1, sisi2;
                tinggi = Tinggi.getText().toString();
                sisi1 = Sisi1.getText().toString();
                sisi2 = Sisi2.getText().toString();

                if (TextUtils.isEmpty(tinggi)){
                    Tinggi.setError("Tidak Boleh Kosong!!!");
                    Tinggi.requestFocus();
                }
                else if (TextUtils.isEmpty(sisi1)){
                    Sisi1.setError("Tidak Boleh Kosong");
                    Sisi1.requestFocus();
                }
                else if (TextUtils.isEmpty(sisi2)){
                    Sisi2.setError("Tidak Boleh Kosong");
                    Sisi2.requestFocus();
                }
                else {
                    double t = Double.parseDouble(tinggi);
                    double s1 = Double.parseDouble(sisi1);
                    double s2 = Double.parseDouble(sisi2);
                    double h = ((s1 * s2)*t)/3;

                    Hasil.setText("Hasil : "+ h);
                }
            }
        });


    }
}
