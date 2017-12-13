package com.example.chris.week6daily2.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.chris.week6daily2.R;

/**
 * Created by chris on 12/12/2017.
 */

public class MyCustomViewGroup extends LinearLayout
{
    public MyCustomViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    
    public MyCustomViewGroup(Context context)
    {
        super(context);
        init(context);
    }
    
    public MyCustomViewGroup(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }
    
    private void init(Context context)
    {
        inflate(context, R.layout.view_login_options, this);
    
        Button btnSetName = findViewById(R.id.btnSetName);
        final EditText etFirst = findViewById(R.id.etFirst);
        final EditText etLast = findViewById(R.id.etLast);
        final TextView tvName = findViewById(R.id.tvName);
        
        btnSetName.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvName.setText(etFirst.getText().toString() + " " + etLast.getText().toString());
                etFirst.setText("");
                etLast.setText("");
            }
        });
    }
}
