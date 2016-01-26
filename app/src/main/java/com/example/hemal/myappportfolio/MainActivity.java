package com.example.hemal.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_spotify_streamer, bt_scores_app, bt_library_app, bt_build_it_together, bt_xyz_reader, bt_captstone;
    Toolbar toolbar;
    View container;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpActivity();
    }

    private void setUpActivity() {
        context = this;

        toolbar = (Toolbar) findViewById(R.id.toolbar_activity_main);
        setSupportActionBar(toolbar);

        //binding the continer...include
        container = findViewById(R.id.container_activity_main);

        //binding the buttons
        bt_spotify_streamer = (Button) container.findViewById(R.id.bt_content_main_spotify_streamer);
        bt_scores_app = (Button) container.findViewById(R.id.bt_content_main_scores_app);
        bt_library_app = (Button) container.findViewById(R.id.bt_content_main_library_app);
        bt_build_it_together = (Button) container.findViewById(R.id.bt_content_main_build_it_bigger);
        bt_xyz_reader = (Button) container.findViewById(R.id.bt_content_main_xyz_reader);
        bt_captstone = (Button) container.findViewById(R.id.bt_content_main_capstone);


        //Setting onclicklisteners here only...

        bt_spotify_streamer.setOnClickListener(this);
        bt_scores_app.setOnClickListener(this);
        bt_library_app.setOnClickListener(this);
        bt_build_it_together.setOnClickListener(this);
        bt_xyz_reader.setOnClickListener(this);
        bt_captstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.bt_content_main_spotify_streamer:
                showToast(getResources().getString(R.string.spotify_streamer));
                break;
            case R.id.bt_content_main_scores_app:
                showToast(getResources().getString(R.string.scores_app));
                break;
            case R.id.bt_content_main_library_app:
                showToast(getResources().getString(R.string.library_app));
                break;
            case R.id.bt_content_main_build_it_bigger:
                showToast(getResources().getString(R.string.build_it_bigger));
                break;
            case R.id.bt_content_main_xyz_reader:
                showToast(getResources().getString(R.string.xyz_reader));
                break;
            case R.id.bt_content_main_capstone:
                showToast(getResources().getString(R.string.capstone_my_own_app));
                break;
            default:
                break;
        }
    }


    public void showToast(String message){
        Toast.makeText(context, "This button will launch " + message + "!", Toast.LENGTH_SHORT).show();
    }
}
