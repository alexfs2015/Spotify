package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: kaz reason: default package */
public final class kaz extends hmm {
    @Deprecated
    public static final fqu a = hmh.d("widevine-license-url", Overridable.NEVER);
    @Deprecated
    public static final fqu b = hmh.d("video-manifest-url", Overridable.NEVER);
    @Deprecated
    public static final fqk c = hmh.c("video-device-blacklisted", Overridable.DEBUG);
    @Deprecated
    public static final fqp d = hmh.e("video-cdn-sampling", Overridable.ALWAYS);
    public static final fqk e = hmh.a("ab-video-subtitles", Overridable.DEBUG);
    public static final fql<RolloutFlag> f = hmh.a("live-video-internal", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);

    static {
        hmh.d("streaming-rules", Overridable.DEBUG);
    }
}
