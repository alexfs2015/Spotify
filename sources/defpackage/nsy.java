package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: nsy reason: default package */
final class nsy {
    final wzi<a> a;
    final wzi<vjj> b;
    final wzi<nsv> c;
    final wzi<String> d;
    final wzi<Scheduler> e;
    final wzi<oml> f;
    final wzi<Completable> g;

    nsy(wzi<a> wzi, wzi<vjj> wzi2, wzi<nsv> wzi3, wzi<String> wzi4, wzi<Scheduler> wzi5, wzi<oml> wzi6, wzi<Completable> wzi7) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
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
