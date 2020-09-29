package com.spotify.music.features.fullscreen.story;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class FullscreenStoryActivity extends kyd {
    public static Intent a(Context context) {
        fay.a(context);
        Intent intent = new Intent(context, FullscreenStoryActivity.class);
        intent.setFlags(603979776);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_fullscreen_story);
        getWindow().addFlags(128);
        if (VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(3840);
        }
        if (bundle == null) {
            nae a = nae.a(getIntent().getExtras());
            km a2 = i().a();
            a2.b(R.id.fragment_container, a, "fullscreen_story_fragment");
            a2.b();
        }
    }

    public void onBackPressed() {
        Fragment a = i().a("fullscreen_story_fragment");
        if (!(a instanceof kyf) || !a.w() || !((kyf) a).onBackPressed()) {
            super.onBackPressed();
        }
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FULLSCREEN_STORY, null);
    }
}
