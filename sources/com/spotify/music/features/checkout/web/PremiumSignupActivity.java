package com.spotify.music.features.checkout.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class PremiumSignupActivity extends kyd {
    public static Intent a(Context context, mbt mbt) {
        Intent intent = new Intent(context, PremiumSignupActivity.class);
        intent.putExtra("premium_signup_configuration", mbt);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_premium_signup);
        if (!(k() != null)) {
            i().a().a(R.id.fragment_premium_signup, mbu.a((mbt) getIntent().getParcelableExtra("premium_signup_configuration")), "premium_signup").b();
        }
    }

    public void onBackPressed() {
        mbu k = k();
        if (k != null) {
            k.a.a();
        } else {
            super.onBackPressed();
        }
    }

    private mbu k() {
        return (mbu) i().a("premium_signup");
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PREMIUM_SIGNUP, ViewUris.aW.toString());
    }
}
