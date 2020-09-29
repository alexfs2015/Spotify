package com.spotify.magiclink.setpassword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class MagiclinkSetPasswordActivity extends jjs implements b {
    public gok g;
    public goi h;
    private b<got, goq> i;

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        goi goi = this.h;
        if (vnk.a(i2)) {
            goi.a.a(i2, i3, intent);
        }
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, MagiclinkSetPasswordActivity.class);
        intent.putExtra("t", fax.b(str));
        return intent;
    }

    public void onCreate(Bundle bundle) {
        vtj.a((Activity) this);
        fzx.a(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_magiclink_set_password);
        got got = got.a;
        got a = got.d().a(getIntent().getStringExtra("t")).a();
        gow gow = new gow(this);
        this.i = kjt.a(this.g.a(gow), a, kkd.a());
        this.i.a(gow);
    }

    public void onResume() {
        super.onResume();
        this.i.c();
    }

    public void onPause() {
        super.onPause();
        this.i.d();
    }

    public void onDestroy() {
        super.onDestroy();
        this.i.b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.LOGIN_ACCOUNTRECOVERY_RESETPASSWORD, null);
    }
}
