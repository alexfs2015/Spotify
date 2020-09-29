package com.spotify.podcastonboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners;
import com.spotify.mobile.android.util.ui.Lifecycle.Listeners.Event;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import com.spotify.music.R;

public class PodcastOnboardingActivity extends vtt implements a, b, a {
    public vae g;
    public vad h;
    private final Listeners j = new Listeners();
    private final rdb k = new rdb(this);

    public static Intent a(Context context, boolean z) {
        Intent intent = new Intent(context, PodcastOnboardingActivity.class);
        intent.putExtra("is_coming_from_taste_onboarding", z);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        fzx.a(this);
        super.onCreate(bundle);
        this.j.a(bundle);
        setContentView((int) R.layout.activity_podcast_onboarding);
        vae vae = this.g;
        vae.b = this;
        vae.a(vaz.e());
    }

    public void onStart() {
        super.onStart();
        this.j.a((gbr<b>) Event.ON_START);
    }

    public void onResume() {
        super.onResume();
        this.j.a((gbr<b>) Event.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        this.j.a((gbr<b>) Event.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        this.j.a((gbr<b>) Event.ON_STOP);
    }

    public void onDestroy() {
        this.g.b = null;
        this.j.a((gbr<b>) Event.ON_DESTROY);
        super.onDestroy();
    }

    public void onBackPressed() {
        vad vad = this.h;
        if (vad != null) {
            vad.a();
        } else {
            super.onBackPressed();
        }
    }

    public final boolean a(b bVar) {
        return this.j.a((b) fay.a(bVar));
    }

    public final boolean b(b bVar) {
        return this.j.b((b) fay.a(bVar));
    }

    public final rdh af() {
        return rdh.a((a) this.k);
    }

    public final void b(Fragment fragment) {
        this.k.a(fragment);
    }
}
