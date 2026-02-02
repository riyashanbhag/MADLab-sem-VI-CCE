package com.example.myapplication4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnOreo, btnPie, btnQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOreo = findViewById(R.id.btnOreo);
        btnPie = findViewById(R.id.btnPie);
        btnQ = findViewById(R.id.btnQ);

        btnOreo.setOnClickListener(v ->
                showToast("Android Oreo", R.drawable.oreo));

        btnPie.setOnClickListener(v ->
                showToast("Android Pie", R.drawable.pie));

        btnQ.setOnClickListener(v ->
                showToast("Android 10", R.drawable.android10));
    }

    private void showToast(String text, int imageRes) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, null);

        ImageView image = layout.findViewById(R.id.toastImage);
        TextView message = layout.findViewById(R.id.toastText);

        image.setImageResource(imageRes);
        message.setText(text);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
