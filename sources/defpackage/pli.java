package defpackage;

import com.spotify.podcastonboarding.PodcastOnboardingActivity;

/* renamed from: pli reason: default package */
public final class pli implements wig<Boolean> {
    private final wzi<PodcastOnboardingActivity> a;

    private pli(wzi<PodcastOnboardingActivity> wzi) {
        this.a = wzi;
    }

    public static pli a(wzi<PodcastOnboardingActivity> wzi) {
        return new pli(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((PodcastOnboardingActivity) this.a.get()).getIntent().getBooleanExtra("is_coming_from_taste_onboarding", false));
    }
}
