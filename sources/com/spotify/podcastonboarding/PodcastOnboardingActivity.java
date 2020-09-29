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

public class PodcastOnboardingActivity extends whz implements a, b, a {
    public vms g;
    public vmr h;
    private final Listeners j = new Listeners();
    private final rlz k = new rlz(this);

    public static Intent a(Context context, boolean z) {
        Intent intent = new Intent(context, PodcastOnboardingActivity.class);
        intent.putExtra("is_coming_from_taste_onboarding", z);
        return intent;
    }

    public final boolean a(b bVar) {
        return this.j.a((b) fbp.a(bVar));
    }

    public final rmf af() {
        return rmf.a((a) this.k);
    }

    public final void b(Fragment fragment) {
        this.k.a(fragment);
    }

    public final boolean b(b bVar) {
        return this.j.b((b) fbp.a(bVar));
    }

    public void onBackPressed() {
        vmr vmr = this.h;
        if (vmr != null) {
            vmr.a();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        gar.a(this);
        super.onCreate(bundle);
        this.j.a(bundle);
        setContentView((int) R.layout.activity_podcast_onboarding);
        vms vms = this.g;
        vms.b = this;
        vms.a(vnn.e());
    }

    public void onDestroy() {
        this.g.b = null;
        this.j.a((gcp<b>) Event.ON_DESTROY);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.j.a((gcp<b>) Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        this.j.a((gcp<b>) Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        this.j.a((gcp<b>) Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        this.j.a((gcp<b>) Event.ON_STOP);
    }
}
