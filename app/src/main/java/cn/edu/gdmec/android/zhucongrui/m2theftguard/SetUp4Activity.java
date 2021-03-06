package cn.edu.gdmec.android.zhucongrui.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import cn.edu.gdmec.android.zhucongrui.R;


public class SetUp4Activity extends BaseSetUpActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up4);
        ((RadioButton) findViewById(R.id.rb_four)).setChecked(true);

    }

    @Override
    public void showNext() {
        startActivityAndFinishShelf(LostFindActivity.class);
    }

    @Override

    public void showPre() {
        startActivityAndFinishShelf(SetUp3Activity.class);
    }
   /* private TextView mStatusTV;
    private ToggleButton mToggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up4);
        initView();
    }

    private void initView() {
        ((RadioButton)findViewById(R.id.rb_four)).setChecked(true);
        mStatusTV=(TextView)findViewById(R.id.togglebtn_securityfunction);
        mToggleButton=(ToggleButton)findViewById(R.id.togglebtn_securityfunction);
        mToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mStatusTV.setText("防盗保护已经开启");
                }else {
                    mStatusTV.setText("防盗保护没有开启");
                }
                SharedPreferences.Editor editor=sp.edit();
                editor.putBoolean("protecting",isChecked);
                editor.commit();
            }
        });
        boolean protecting=sp.getBoolean("protecting",true);
        if (protecting){
            mStatusTV.setText("防盗保护已经开启");
            mToggleButton.setChecked(true);
        }else{
            mStatusTV.setText("防盗保护没有开启");
            mToggleButton.setChecked(false);
        }
    }
    @Override
    public void showNext(){
        SharedPreferences.Editor editor=sp.edit();
        editor.putBoolean("isSetUp",true);
        editor.commit();
        startActivityAndFinishShelf(LostFindActivity.class);
    }
    @Override
    public void showPre(){
        startActivityAndFinishShelf(SetUp3Activity.class);
    }*/
}
