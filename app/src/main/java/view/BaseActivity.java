package view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by JasonChen on 2017/9/23.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected abstract void setView();
    protected abstract void setData();
    protected abstract void setListener();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setView();
        setData();
        setListener();
    }

}
