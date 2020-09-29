package defpackage;

import com.spotify.podcastonboarding.PodcastOnboardingActivity;

/* renamed from: pdw reason: default package */
public final class pdw implements vua<Boolean> {
    private final wlc<PodcastOnboardingActivity> a;

    private pdw(wlc<PodcastOnboardingActivity> wlc) {
        this.a = wlc;
    }

    public static pdw a(wlc<PodcastOnboardingActivity> wlc) {
        return new pdw(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PodcastOnboardingActivity) this.a.get()).getIntent().getBooleanExtra("is_coming_from_taste_onboarding", false));
    }
}
