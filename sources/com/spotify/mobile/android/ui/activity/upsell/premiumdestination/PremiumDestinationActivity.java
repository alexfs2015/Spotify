package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class PremiumDestinationActivity extends lbm {
    public fqn g;
    public jnb h;
    private final OnClickListener i = new OnClickListener() {
        public final void onClick(View view) {
            PremiumDestinationActivity.this.finish();
        }
    };

    public final rmf af() {
        return rmf.a(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.aQ.toString());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_premium_destination);
        gau.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        fsy a = ftc.a(this, viewGroup);
        gav.a(a.getView(), this);
        viewGroup.addView(a.getView());
        fzm fzm = new fzm(this, a, this.i);
        fzm.c(true);
        fzm.b(true);
        kr a2 = i().a();
        a2.a((int) R.id.fragment_container, this.h.a(this.g).ae());
        a2.b();
    }
}
