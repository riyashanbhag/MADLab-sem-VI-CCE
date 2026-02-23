package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView menuIcon, displayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuIcon = findViewById(R.id.menuIcon);
        displayImage = findViewById(R.id.displayImage);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu =
                        new PopupMenu(MainActivity.this, menuIcon);

                popupMenu.getMenuInflater()
                        .inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(
                        new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {

                                if (item.getItemId() == R.id.image1) {

                                    displayImage.setImageResource(R.drawable.image1);
                                    Toast.makeText(MainActivity.this,
                                            "Image - 1 Selected",
                                            Toast.LENGTH_SHORT).show();
                                }

                                else if (item.getItemId() == R.id.image2) {

                                    displayImage.setImageResource(R.drawable.image2);
                                    Toast.makeText(MainActivity.this,
                                            "Image - 2 Selected",
                                            Toast.LENGTH_SHORT).show();
                                }

                                return true;
                            }
                        });

                popupMenu.show();
            }
        });
    }
}
