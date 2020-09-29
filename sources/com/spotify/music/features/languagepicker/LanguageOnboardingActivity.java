package com.spotify.music.features.languagepicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

public class LanguageOnboardingActivity extends kyd {
    private static final int g = 2131427788;
    private final rdb h = new rdb(this);

    public static Intent a(Context context) {
        return a(context, null);
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, LanguageOnboardingActivity.class);
        if (str != null) {
            intent.putExtra("chained_uri", str);
        }
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_language_onboarding);
        npz ah = npz.ah();
        km a = i().a();
        a.a((Fragment) ah, rju.n);
        a.a(g, (Fragment) ah);
        a.b();
        this.h.a((Fragment) ah);
    }

    public final rdh af() {
        return rdh.a((a) this.h);
    }

    public void onBackPressed() {
        Fragment a = i().a(g);
        if (!(a instanceof kyf) || !((kyf) a).onBackPressed()) {
            super.onBackPressed();
        }
    }
}
