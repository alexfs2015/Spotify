package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

public class FacebookActivity extends kf {
    public static String g = "PassThrough";
    private static String i = "SingleFragment";
    private static final String j = FacebookActivity.class.getName();
    public Fragment h;

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.h;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!akq.a()) {
            ank.b(j, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            akq.a(getApplicationContext());
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (g.equals(intent.getAction())) {
            setResult(0, anf.a(getIntent(), (Bundle) null, anf.a(anf.b(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        kk i2 = i();
        Fragment a = i2.a(i);
        if (a == 0) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                amp amp = new amp();
                amp.c_(true);
                amp.a(i2, i);
                a = amp;
            } else {
                if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                    aoj aoj = new aoj();
                    aoj.c_(true);
                    aoj.T = (apb) intent2.getParcelableExtra("content");
                    aoj.a(i2, i);
                    a = aoj;
                } else {
                    Fragment anw = new anw();
                    anw.c_(true);
                    i2.a().a(R.id.com_facebook_fragment_container, anw, i).b();
                    a = anw;
                }
            }
        }
        this.h = a;
    }
}
