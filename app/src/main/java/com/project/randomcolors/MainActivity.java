package com.project.randomcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View windowview;
    private Button click;
    private int[] color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color = new int[]{Color.YELLOW,Color.RED,Color.GREEN,Color.CYAN,Color.WHITE,Color.MAGENTA,Color.LTGRAY};
        windowview = findViewById(R.id.windowviewID);

        click = (Button)findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorarraylength = color.length;
                Random random = new Random();
                int randomnum = random.nextInt(colorarraylength);
                windowview.setBackgroundColor(color[randomnum]);
                Log.d("Random", String.valueOf(randomnum));
            }
        });


    }
}
