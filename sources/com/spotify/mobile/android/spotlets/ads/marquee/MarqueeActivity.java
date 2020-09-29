package com.spotify.mobile.android.spotlets.ads.marquee;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import java.util.ArrayList;

public class MarqueeActivity extends lbm implements ica {
    public icb g;
    private rlz h = new rlz(this);

    public static Intent a(Context context, fqn fqn, ido ido) {
        Intent intent = new Intent(context, MarqueeActivity.class);
        String str = "qrsexemraatue";
        intent.putExtra("extra_marquee", ido);
        fqo.a(intent, fqn);
        return intent;
    }

    private Fragment l() {
        return i().a((int) R.id.marquee_fragment_container);
    }

    public final void a(Fragment fragment) {
        this.h.a(fragment);
    }

    public final void a(ArrayList<ida> arrayList) {
        if (getIntent() != null) {
            getIntent().putParcelableArrayListExtra("extra_marquee_randomized_feedback_list", arrayList);
        }
    }

    public final rmf af() {
        return rmf.a((a) this.h);
    }

    public final ArrayList<ida> k() {
        if (getIntent() != null) {
            String str = "_trmn_zdueceot_emamqeadib_arexeildkras";
            String str2 = "extra_marquee_randomized_feedback_list";
            if (getIntent().hasExtra(str2)) {
                return getIntent().getParcelableArrayListExtra(str2);
            }
        }
        return new ArrayList<>(0);
    }

    public void onBackPressed() {
        Fragment l = l();
        if (!(l instanceof lbp) || !((lbp) l).onBackPressed()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_marquee);
        if (l() == null) {
            String str = "eeqtoxrre_aam";
            i().a().b(R.id.marquee_fragment_container, idr.a(fqo.a((Activity) this), (ido) getIntent().getParcelableExtra("extra_marquee")), null).b();
        }
    }

    public void onStart() {
        super.onStart();
        icb icb = this.g;
        if (icb.a != null && icb.b) {
            icb.a.setRequestedOrientation(1);
        }
    }

    public void onStop() {
        super.onStop();
        icb icb = this.g;
        if (icb.a != null && icb.b && jvi.a(icb.a)) {
            icb.a.setRequestedOrientation(-1);
        }
    }
}
