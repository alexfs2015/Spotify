package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.spotlets.ads.flags.AudioPlusLeaveBehindABFlag;
import com.spotify.mobile.android.spotlets.ads.flags.SkippableAdsABFlag;
import com.spotify.mobile.android.spotlets.ads.flags.VoiceMicPermissionABFlag;
import com.spotify.mobile.android.spotlets.ads.screensaver.ScreensaverProgrammaticAdFlag;

/* renamed from: hyn reason: default package */
public final class hyn extends hmm {
    @Deprecated
    public static final fqk a = hmh.c("ads", Overridable.DEBUG);
    @Deprecated
    public static final fqk b = hmh.c("ab-watch-now", Overridable.NEVER);
    public static final fql<ScreensaverProgrammaticAdFlag> c = hmh.a("interstitial_overlay_test", ScreensaverProgrammaticAdFlag.class, ScreensaverProgrammaticAdFlag.CONTROL, Overridable.ALWAYS);
    public static final fql<SkippableAdsABFlag> d = hmh.a("ad-skippable-audio", SkippableAdsABFlag.class, SkippableAdsABFlag.CONTROL, Overridable.ALWAYS);
    public static final fql<RolloutFlag> e = hmh.f("accessory-ads-inventory-rollout", Overridable.ALWAYS);
    @Deprecated
    public static final fqk f = hmh.c("ad-formats-preroll-video", Overridable.NEVER);
    public static final fqk g = hmh.a("ads-click2play-queuing-ios", Overridable.DEBUG);
    public static final fqk h = hmh.a("ads-click2play-queuing", Overridable.DEBUG);
    public static final fqk i = hmh.a("ComScore-killswitch-android", Overridable.DEBUG);
    public static final fql<RolloutFlag> j = hmh.f("ab_house_ads_auto_login", Overridable.ALWAYS);
    public static final fql<RolloutFlag> k = hmh.a("cream-audio-voice-android", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);
    public static final fql<RolloutFlag> l = hmh.a("ab_marquee_android", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);
    public static final fql<RolloutFlag> m = hmh.a("ads_mobile_overlay_in_app_browser_android", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);
    public static final fql<AudioPlusLeaveBehindABFlag> n = hmh.a("ab_mo_leavebehind_type", AudioPlusLeaveBehindABFlag.class, AudioPlusLeaveBehindABFlag.CONTROL, Overridable.INTERNAL);
    public static final fql<RolloutFlag> o = hmh.f("ab_audioplus_leavebehind_fetch", Overridable.INTERNAL);
    public static final fql<VoiceMicPermissionABFlag> p = hmh.a("voice_mic_permission_prompt_android", VoiceMicPermissionABFlag.class, VoiceMicPermissionABFlag.CONTROL, Overridable.INTERNAL);
}
