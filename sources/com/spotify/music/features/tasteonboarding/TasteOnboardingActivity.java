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

public class TasteOnboardingActivity extends kyd implements a {
    public a g;
    public qho h;
    public qhu i;
    private final rdb j = new rdb(this);

    public static Intent a(Context context, fpt fpt, boolean z) {
        Intent intent = new Intent(context, TasteOnboardingActivity.class);
        fpu.a(intent, fpt);
        intent.putExtra("update_mode", z);
        intent.putExtra("ab_nft_stockholm_black", qly.a(fpt));
        TasteOnboardingToPodcastOnboardingMVPRolloutState tasteOnboardingToPodcastOnboardingMVPRolloutState = (TasteOnboardingToPodcastOnboardingMVPRolloutState) fpt.a(qlx.c);
        intent.putExtra("and_podcast_onboarding_mvp_rollout_android", tasteOnboardingToPodcastOnboardingMVPRolloutState == TasteOnboardingToPodcastOnboardingMVPRolloutState.TOB_TO_OLD_POB || tasteOnboardingToPodcastOnboardingMVPRolloutState == TasteOnboardingToPodcastOnboardingMVPRolloutState.TOB_TO_NEW_POB || tasteOnboardingToPodcastOnboardingMVPRolloutState == TasteOnboardingToPodcastOnboardingMVPRolloutState.TOB_TO_NEW_POB_COLDSTART_VARIATION);
        return intent;
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
        qho qho = this.h;
        String[] stringArray = bundle.getStringArray("key_liked_uris");
        qho.a = new HashSet();
        if (stringArray != null) {
            qho.a.addAll(Arrays.asList(stringArray));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.i.e = null;
    }

    public void onStart() {
        super.onStart();
        this.i.a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.i.a(bundle);
        bundle.putStringArray("key_liked_uris", (String[]) this.h.a.toArray(new String[0]));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        qhu qhu = this.i;
        ClassLoader classLoader = qhu.c.getClassLoader();
        for (Parcelable parcelable : (Parcelable[]) fay.a(bundle.getParcelableArray("entries"))) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(classLoader);
            qhu.b.push(jja.a(classLoader, bundle2.getParcelable("fragment_snapshot")));
        }
        qhu.a();
    }

    public final rdh af() {
        return rdh.a((a) this.j);
    }

    public final void b(Fragment fragment) {
        this.j.a(fragment);
    }

    public void onBackPressed() {
        Fragment fragment = this.i.d;
        if (fragment instanceof kyf) {
            ((kyf) fragment).onBackPressed();
        } else {
            this.g.b();
        }
    }
}
