package com.spotify.music.features.checkout.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class PremiumSignupActivity extends lbm {
    public static Intent a(Context context, mfw mfw) {
        Intent intent = new Intent(context, PremiumSignupActivity.class);
        intent.putExtra("premium_signup_configuration", mfw);
        return intent;
    }

    private mfx k() {
        return (mfx) i().a("premium_signup");
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.PREMIUM_SIGNUP, ViewUris.aV.toString());
    }

    public void onBackPressed() {
        mfx k = k();
        if (k != null) {
            k.a.a();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_premium_signup);
        if (!(k() != null)) {
            i().a().a(R.id.fragment_premium_signup, mfx.a((mfw) getIntent().getParcelableExtra("premium_signup_configuration")), "premium_signup").b();
        }
    }
}
