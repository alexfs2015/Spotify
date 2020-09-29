package defpackage;

import com.spotify.music.follow.FollowManager.a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Map;

/* renamed from: mwm reason: default package */
public final class mwm implements c<gzz, ho<gzz, rfo>> {
    private static final wuu<gzz, a, ho<gzz, rfo>> d = $$Lambda$mwm$WTbbrm6H2IdCwAYRPqZj3ymGbQ.INSTANCE;
    private final String a;
    private final ims b;
    private final mwr c;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wud) obj, wuh.a(this.b.a(null, this.a).c(new $$Lambda$mwm$4FdtdO1bYVDwxEZgrLMFuiGpt5k(this))).i(new $$Lambda$mwm$ISNAMIjPjQKmI6GjXtqi2QgMVLM(this.c)), d);
    }

    public mwm(String str, ims ims, mwr mwr) {
        this.a = (String) fay.a(str);
        this.b = (ims) fay.a(ims);
        this.c = (mwr) fay.a(mwr);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ uyr a(Map map) {
        uyr uyr = (uyr) map.get(this.a);
        if (uyr != null) {
            return uyr;
        }
        throw new RuntimeException("No decoration found for artist");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(mwr mwr, uyr uyr) {
        String uri = uyr.getUri();
        a aVar = new a(uyr.getUri(), 0, 0, uyr.isFollowed(), uyr.isDismissed());
        return vun.a((ObservableSource<T>) mwr.a(uri, aVar), BackpressureStrategy.BUFFER);
    }
}
