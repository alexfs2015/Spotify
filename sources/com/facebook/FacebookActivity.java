package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

public class FacebookActivity extends ka {
    public static String g = "PassThrough";
    private static String i = "SingleFragment";
    private static final String j = FacebookActivity.class.getName();
    public Fragment h;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!akc.a()) {
            amw.b(j, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            akc.a(getApplicationContext());
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (g.equals(intent.getAction())) {
            setResult(0, amr.a(getIntent(), (Bundle) null, amr.a(amr.b(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        kf i2 = i();
        Fragment a = i2.a(i);
        if (a == 0) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                amb amb = new amb();
                amb.c_(true);
                amb.a(i2, i);
                a = amb;
            } else {
                if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                    anv anv = new anv();
                    anv.c_(true);
                    anv.T = (aon) intent2.getParcelableExtra("content");
                    anv.a(i2, i);
                    a = anv;
                } else {
                    Fragment ani = new ani();
                    ani.c_(true);
                    i2.a().a(R.id.com_facebook_fragment_container, ani, i).b();
                    a = ani;
                }
            }
        }
        this.h = a;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.h;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }
}
