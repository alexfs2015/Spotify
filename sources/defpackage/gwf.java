package defpackage;

import com.google.common.hash.Hashing;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.android.flags.Overridable;

/* renamed from: gwf reason: default package */
public final class gwf extends hmm {
    @Deprecated
    public static final fqk a = hmh.c("on-demand", Overridable.DEBUG);
    @Deprecated
    public static final fqu b = hmh.d(MoatAdEvent.EVENT_TYPE, Overridable.DEBUG);
    public static final fqk c = new fqk("shuffle_restricted", new jrz("streaming-rules"), Overridable.NEVER) {
        /* renamed from: a */
        public final Boolean b(String str) {
            return Boolean.valueOf(str == null || Hashing.e().a((CharSequence) str).b() == 1929113152);
        }
    };
    @Deprecated
    public static final fqk d = hmh.c("offline", Overridable.DEBUG);
}
