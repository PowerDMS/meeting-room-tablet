package com.futurice.android.reservator.view;

import com.futurice.android.reservator.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * Created by Richard on 5/13/2016.
 */
public class NavigationBar extends RelativeLayout{
    ImageButton home_button;
    ImageButton list_button;
    ImageButton calendar_button;

    public NavigationBar(Context context) {
        super(context);
    }

    public NavigationBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        home_button=(ImageButton) findViewById(R.id.home_button);
        list_button=(ImageButton) findViewById(R.id.list_button);
        calendar_button=(ImageButton) findViewById(R.id.calendar_button);
    }
}
