package com.spotify.music.features.tasteonboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.flags.TasteOnboardingToPodcastOnboardingMVPRolloutState;
import java.util.Arrays;
import java.util.HashSet;

public class TasteOnboardingActivity extends lbm implements a {
    public a g;
    public qqc h;
    public qqi i;
    public boolean j;
    private final rlz k = new rlz(this);

    public static Intent a(Context context, fqn fqn, boolean z) {
        Intent intent = new Intent(context, TasteOnboardingActivity.class);
        fqo.a(intent, fqn);
        intent.putExtra("update_mode", z);
        TasteOnboardingToPodcastOnboardingMVPRolloutState tasteOnboardingToPodcastOnboardingMVPRolloutState = (TasteOnboardingToPodcastOnboardingMVPRolloutState) fqn.a(qug.b);
        intent.putExtra("and_podcast_onboarding_mvp_rollout_android", tasteOnboardingToPodcastOnboardingMVPRolloutState == TasteOnboardingToPodcastOnboardingMVPRolloutState.TOB_TO_OLD_POB || tasteOnboardingToPodcastOnboardingMVPRolloutState == TasteOnboardingToPodcastOnboardingMVPRolloutState.TOB_TO_NEW_POB || tasteOnboardingToPodcastOnboardingMVPRolloutState == TasteOnboardingToPodcastOnboardingMVPRolloutState.TOB_TO_NEW_POB_COLDSTART_VARIATION);
        return intent;
    }

    public final rmf af() {
        return rmf.a((a) this.k);
    }

    public final void b(Fragment fragment) {
        this.k.a(fragment);
    }

    public void onBackPressed() {
        Fragment fragment = this.i.d;
        if (fragment instanceof lbp) {
            ((lbp) fragment).onBackPressed();
        } else if (!this.j) {
            this.g.b();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_free_tier_taste_onboarding);
        this.i.e = this;
        if (VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        if (bundle == null) {
            this.g.a();
            return;
        }
        qqc qqc = this.h;
        String[] stringArray = bundle.getStringArray("key_liked_uris");
        qqc.a = new HashSet();
        if (stringArray != null) {
            qqc.a.addAll(Arrays.asList(stringArray));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.i.e = null;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        qqi qqi = this.i;
        ClassLoader classLoader = qqi.c.getClassLoader();
        for (Parcelable parcelable : (Parcelable[]) fbp.a(bundle.getParcelableArray("entries"))) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(classLoader);
            qqi.b.push(jlm.a(classLoader, bundle2.getParcelable("fragment_snapshot")));
        }
        qqi.a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.i.a(bundle);
        bundle.putStringArray("key_liked_uris", (String[]) this.h.a.toArray(new String[0]));
    }

    public void onStart() {
        super.onStart();
        this.i.a();
    }
}
