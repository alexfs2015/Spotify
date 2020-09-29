package com.spotify.mobile.android.spotlets.ads.marquee.learnmore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

public class LearnMoreWebActivity extends lbm {
    private rlz g = new rlz(this);

    public static Intent a(Context context) {
        Class<LearnMoreWebActivity> cls = LearnMoreWebActivity.class;
        return new Intent(context, LearnMoreWebActivity.class);
    }

    public final void a(Fragment fragment) {
        this.g.a(fragment);
    }

    public final rmf af() {
        return rmf.a((a) this.g);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.marquee_learn_more_exit);
    }

    public void onBackPressed() {
        idd idd = (idd) i().a((int) R.id.learn_more_fragment_container);
        if (idd == null || !idd.ac_()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        gar.a(this);
        boolean z = false;
        boolean z2 = true;
        overridePendingTransition(R.anim.marquee_learn_more_enter, 0);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_learn_more);
        if (i().a((int) R.id.learn_more_fragment_container) != null) {
            z = true;
        }
        if (!z) {
            i().a().a((int) R.id.learn_more_fragment_container, (Fragment) idd.c()).b();
        }
    }
}
