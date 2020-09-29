package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: jyz reason: default package */
public final class jyz extends hju {
    @Deprecated
    public static final fqa a = hjp.d("widevine-license-url", Overridable.NEVER);
    @Deprecated
    public static final fqa b = hjp.d("video-manifest-url", Overridable.NEVER);
    @Deprecated
    public static final fpq c = hjp.c("video-device-blacklisted", Overridable.DEBUG);
    @Deprecated
    public static final fpv d = hjp.e("video-cdn-sampling", Overridable.ALWAYS);
    public static final fpq e = hjp.a("ab-video-subtitles", Overridable.DEBUG);
    public static final fpr<RolloutFlag> f = hjp.a("live-video-internal", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);

    static {
        hjp.d("streaming-rules", Overridable.DEBUG);
    }
}
