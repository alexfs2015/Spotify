package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.flags.AudioPlusLeaveBehindABFlag;
import com.spotify.mobile.android.spotlets.ads.flags.SkippableAdsABFlag;
import com.spotify.mobile.android.spotlets.ads.screensaver.ScreensaverProgrammaticAdFlag;

/* renamed from: hwb reason: default package */
public final class hwb extends hju {
    @Deprecated
    public static final fpq a = hjp.c("ads", Overridable.DEBUG);
    @Deprecated
    public static final fpq b = hjp.c("ab-watch-now", Overridable.NEVER);
    public static final fpr<ScreensaverProgrammaticAdFlag> c = hjp.a("interstitial_overlay_test", ScreensaverProgrammaticAdFlag.class, ScreensaverProgrammaticAdFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<SkippableAdsABFlag> d = hjp.a("ad-skippable-audio", SkippableAdsABFlag.class, SkippableAdsABFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<RolloutFlag> e = hjp.f("accessory-ads-inventory-rollout", Overridable.ALWAYS);
    @Deprecated
    public static final fpq f = hjp.c("ad-formats-preroll-video", Overridable.NEVER);
    public static final fpq g = hjp.a("ads-click2play-queuing-ios", Overridable.DEBUG);
    public static final fpq h = hjp.a("ads-click2play-queuing", Overridable.DEBUG);
    public static final fpq i = hjp.a("ComScore-killswitch-android", Overridable.DEBUG);
    public static final fpr<RolloutFlag> j = hjp.f("ab_house_ads_auto_login", Overridable.ALWAYS);
    public static final fpr<RolloutFlag> k = hjp.a("cream-audio-voice-android", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);
    public static final fpr<RolloutFlag> l = hjp.a("ab_marquee_android", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);
    public static final fpr<RolloutFlag> m = hjp.a("ads_mobile_overlay_in_app_browser_android", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);
    public static final fpr<AudioPlusLeaveBehindABFlag> n = hjp.a("ab_mo_leavebehind_type", AudioPlusLeaveBehindABFlag.class, AudioPlusLeaveBehindABFlag.CONTROL, Overridable.INTERNAL);
    public static final fpr<RolloutFlag> o = hjp.f("ab_audioplus_leavebehind_fetch", Overridable.INTERNAL);
    public static final fqa p = hjp.b("voice_mic_permission_prompt", Overridable.INTERNAL);
}
