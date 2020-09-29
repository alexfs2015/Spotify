package com.spotify.music.features.profile.editprofile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class EditProfileActivity extends lbm {
    public pqm g;
    public pqv h;
    private b<pqr, pqp> i;
    private pqu j;
    private String k;

    public static Intent a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, EditProfileActivity.class);
        intent.putExtra("user-name", str);
        intent.putExtra("display-name", str2);
        intent.putExtra("image-url", str3);
        return intent;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PROFILE_EDIT, null);
    }

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
        pqr a = pqr.d().a(this.k).b(str2).c(str).a();
        this.j = new pqu((EditProfileActivity) pqv.a(this, 1), (jyx) pqv.a(this.h.a.get(), 2));
        this.i = knc.a(this.g.a(this.j), a, knm.a());
        this.i.a(this.j);
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

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("user-name", this.k);
        bundle.putString("display-name", this.j.b());
        bundle.putString("image-url", pqu.c());
    }
}
