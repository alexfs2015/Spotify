package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

public class PremiumDestinationActivity extends kyd {
    public fpt g;
    public jkp h;
    private final OnClickListener i = new OnClickListener() {
        public final void onClick(View view) {
            PremiumDestinationActivity.this.finish();
        }
    };

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_premium_destination);
        gaa.a((Context) this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar_wrapper);
        fse a = fsi.a(this, viewGroup);
        gab.a(a.getView(), this);
        viewGroup.addView(a.getView());
        fys fys = new fys(this, a, this.i);
        fys.c(true);
        fys.b(true);
        km a2 = i().a();
        a2.a((int) R.id.fragment_container, this.h.a(this.g).ae());
        a2.b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.aR.toString());
    }
}
