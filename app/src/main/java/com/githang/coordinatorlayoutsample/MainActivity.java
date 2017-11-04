package com.githang.coordinatorlayoutsample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.githang.coordinatorlayoutsample.anchor.AnchorActivity;
import com.githang.coordinatorlayoutsample.behavior.BehaviorActivity;
import com.githang.coordinatorlayoutsample.dodge.DodgeInsetEdgesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        final int id = view.getId();
        switch (id) {
            case R.id.behavior:
                startActivity(BehaviorActivity.class);
                break;
            case R.id.anchor:
                startActivity(AnchorActivity.class);
                break;
            case R.id.dodge:
                startActivity(DodgeInsetEdgesActivity.class);
                break;
        }
    }

    private void startActivity(Class<? extends Activity> cls) {
        startActivity(new Intent(this, cls));
    }
}
