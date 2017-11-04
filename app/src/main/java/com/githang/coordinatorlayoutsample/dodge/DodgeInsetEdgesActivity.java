package com.githang.coordinatorlayoutsample.dodge;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.githang.coordinatorlayoutsample.R;

/**
 * @author Geek_Soledad (msdx.android@qq.com)
 * @version 2017-11-04
 * @since 2017-11-04
 */
public class DodgeInsetEdgesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodge_inset_edges);
    }

    public void onClick(View view) {
        Snackbar.make(view, "Snackbar", Snackbar.LENGTH_SHORT).show();
    }
}
