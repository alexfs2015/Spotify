package com.spotify.magiclink.setpassword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class MagiclinkSetPasswordActivity extends jme implements b {
    public gpz g;
    public gpx h;
    private b<gqi, gqf> i;

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, MagiclinkSetPasswordActivity.class);
        intent.putExtra("t", fbo.b(str));
        return intent;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.LOGIN_ACCOUNTRECOVERY_RESETPASSWORD, null);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        gpx gpx = this.h;
        if (waq.a(i2)) {
            gpx.a.a(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        whp.a((Activity) this);
        gar.a(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_magiclink_set_password);
        gqi gqi = gqi.a;
        gqi a = gqi.d().a(getIntent().getStringExtra("t")).a();
        gql gql = new gql(this);
        this.i = knc.a(this.g.a(gql), a, knm.a());
        this.i.a(gql);
    }

    public void onDestroy() {
        super.onDestroy();
        this.i.b();
    }

    public void onPause() {
        super.onPause();
        this.i.d();
    }

    public void onResume() {
        super.onResume();
        this.i.c();
    }
}
