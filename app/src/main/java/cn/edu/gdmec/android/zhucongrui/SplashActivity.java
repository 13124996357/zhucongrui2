package cn.edu.gdmec.android.zhucongrui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

import cn.edu.gdmec.android.zhucongrui.m1Home.utils.MyUtils;
import cn.edu.gdmec.android.zhucongrui.m1Home.utils.VersionUpdateUtils;


public class SplashActivity extends AppCompatActivity {

    private TextView mTvVersion;
    private String mVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mVersion = MyUtils.getVersion(getApplicationContext());
        mTvVersion = (TextView) findViewById(R.id.tv_splash_version);
        mTvVersion.setText("版本号" + mVersion);
        final VersionUpdateUtils versionUpdateUtils = new VersionUpdateUtils(mVersion, SplashActivity.this);
        new Thread() {
            @Override
            public void run() {
                super.run();
                versionUpdateUtils.getCloudVersion();
            }
        }.start();
    }
}
//25252525252525