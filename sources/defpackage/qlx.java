package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.music.features.tasteonboarding.flags.TasteOnboardingToPodcastOnboardingMVPRolloutState;
import com.spotify.music.features.tasteonboarding.flags.TasteOnboardingToPodcastOnboardingState;

/* renamed from: qlx reason: default package */
public final class qlx extends hju {
    @Deprecated
    public static final fqa a = hjp.d("and_nft_skip_onboarding", Overridable.INTERNAL);
    @Deprecated
    public static final fpq b = hjp.c("and_nft_taste_onboarding_sticky_search_bar", Overridable.INTERNAL);
    @Deprecated
    public static final fpr<TasteOnboardingToPodcastOnboardingMVPRolloutState> c = hjp.b("and_podcast_onboarding_mvp_rollout_android", TasteOnboardingToPodcastOnboardingMVPRolloutState.class, TasteOnboardingToPodcastOnboardingMVPRolloutState.INACTIVE, Overridable.INTERNAL);
    @Deprecated
    public static final fpr<TasteOnboardingToPodcastOnboardingState> d = hjp.b("and_taste_onboarding_to_podcast_onboarding", TasteOnboardingToPodcastOnboardingState.class, TasteOnboardingToPodcastOnboardingState.INACTIVE, Overridable.INTERNAL);
}
