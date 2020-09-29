package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: oss reason: default package */
final class oss {
    final wlc<a> a;
    final wlc<uxh> b;
    final wlc<osp> c;
    final wlc<String> d;
    final wlc<Scheduler> e;
    final wlc<ofh> f;
    final wlc<Completable> g;

    oss(wlc<a> wlc, wlc<uxh> wlc2, wlc<osp> wlc3, wlc<String> wlc4, wlc<Scheduler> wlc5, wlc<ofh> wlc6, wlc<Completable> wlc7) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
