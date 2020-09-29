package com.spotify.mobile.android.spotlets.ads.marquee.learnmore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

public class LearnMoreWebActivity extends kyd {
    private rdb g = new rdb(this);

    public static Intent a(Context context) {
        return new Intent(context, LearnMoreWebActivity.class);
    }

    public void onCreate(Bundle bundle) {
        fzx.a(this);
        boolean z = false;
        overridePendingTransition(R.anim.marquee_learn_more_enter, 0);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_learn_more);
        if (i().a((int) R.id.learn_more_fragment_container) != null) {
            z = true;
        }
        if (!z) {
            i().a().a((int) R.id.learn_more_fragment_container, (Fragment) iar.c()).b();
        }
    }

    public final void a(Fragment fragment) {
        this.g.a(fragment);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.marquee_learn_more_exit);
    }

    public final rdh af() {
        return rdh.a((a) this.g);
    }

    public void onBackPressed() {
        iar iar = (iar) i().a((int) R.id.learn_more_fragment_container);
        if (iar == null || !iar.ac_()) {
            super.onBackPressed();
        }
    }
}
