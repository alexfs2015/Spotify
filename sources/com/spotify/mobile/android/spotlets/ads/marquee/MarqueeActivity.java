package com.spotify.mobile.android.spotlets.ads.marquee;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import java.util.ArrayList;

public class MarqueeActivity extends kyd implements hzo {
    public hzp g;
    private rdb h = new rdb(this);

    public static Intent a(Context context, fpt fpt, ibc ibc) {
        Intent intent = new Intent(context, MarqueeActivity.class);
        intent.putExtra("extra_marquee", ibc);
        fpu.a(intent, fpt);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_marquee);
        if (l() == null) {
            i().a().b(R.id.marquee_fragment_container, ibf.a(fpu.a((Activity) this), (ibc) getIntent().getParcelableExtra("extra_marquee")), null).b();
        }
    }

    public void onStart() {
        super.onStart();
        hzp hzp = this.g;
        if (hzp.a != null && hzp.b) {
            hzp.a.setRequestedOrientation(1);
        }
    }

    public void onStop() {
        super.onStop();
        hzp hzp = this.g;
        if (hzp.a != null && hzp.b && jtc.a(hzp.a)) {
            hzp.a.setRequestedOrientation(-1);
        }
    }

    public void onBackPressed() {
        Fragment l = l();
        if (!(l instanceof kyf) || !((kyf) l).onBackPressed()) {
            super.onBackPressed();
        }
    }

    public final void a(Fragment fragment) {
        this.h.a(fragment);
    }

    public final rdh af() {
        return rdh.a((a) this.h);
    }

    private Fragment l() {
        return i().a((int) R.id.marquee_fragment_container);
    }

    public final void a(ArrayList<iao> arrayList) {
        if (getIntent() != null) {
            getIntent().putParcelableArrayListExtra("extra_marquee_randomized_feedback_list", arrayList);
        }
    }

    public final ArrayList<iao> k() {
        if (getIntent() != null) {
            String str = "extra_marquee_randomized_feedback_list";
            if (getIntent().hasExtra(str)) {
                return getIntent().getParcelableArrayListExtra(str);
            }
        }
        return new ArrayList<>(0);
    }
}
