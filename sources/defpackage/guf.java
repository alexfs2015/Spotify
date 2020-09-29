package defpackage;

import com.google.common.hash.Hashing;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.android.flags.Overridable;

/* renamed from: guf reason: default package */
public final class guf extends hju {
    @Deprecated
    public static final fpq a = hjp.c("on-demand", Overridable.DEBUG);
    @Deprecated
    public static final fqa b = hjp.d(MoatAdEvent.EVENT_TYPE, Overridable.DEBUG);
    public static final fpq c = new fpq("shuffle_restricted", new jpn("streaming-rules"), Overridable.NEVER) {
        /* renamed from: a */
        public final Boolean b(String str) {
            return Boolean.valueOf(str == null || Hashing.e().a((CharSequence) str).b() == 1929113152);
        }
    };
    @Deprecated
    public static final fpq d = hjp.c("offline", Overridable.DEBUG);
}
