package com.spotify.music.features.editprofile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class EditProfileActivity extends kyd {
    public moa g;
    public moj h;
    private b<mof, mod> i;
    private moi j;
    private String k;

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_editprofile);
        String str3 = "image-url";
        String str4 = "display-name";
        String str5 = "user-name";
        if (bundle != null) {
            this.k = bundle.getString(str5);
            str2 = bundle.getString(str4);
            str = bundle.getString(str3);
        } else {
            Intent intent = getIntent();
            this.k = intent.getStringExtra(str5);
            str2 = intent.getStringExtra(str4);
            str = intent.getStringExtra(str3);
        }
        mof a = mof.d().a(this.k).b(str2).c(str).a();
        this.j = new moi(this);
        this.i = kjt.a(this.g.a(this.j), a, kkd.a());
        this.i.a(this.j);
    }

    public void onPause() {
        super.onPause();
        this.i.d();
    }

    public void onResume() {
        super.onResume();
        this.i.c();
    }

    public void onDestroy() {
        super.onDestroy();
        this.i.b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("user-name", this.k);
        bundle.putString("display-name", this.j.b());
        bundle.putString("image-url", moi.c());
    }

    public static Intent a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, EditProfileActivity.class);
        intent.putExtra("user-name", str);
        intent.putExtra("display-name", str2);
        intent.putExtra("image-url", str3);
        return intent;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.UNKNOWN, null);
    }
}
