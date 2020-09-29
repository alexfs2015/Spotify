package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: ozz reason: default package */
final class ozz {
    final wzi<a> a;
    final wzi<ozw> b;
    final wzi<Scheduler> c;
    final wzi<oml> d;
    final wzi<Completable> e;

    ozz(wzi<a> wzi, wzi<ozw> wzi2, wzi<Scheduler> wzi3, wzi<oml> wzi4, wzi<Completable> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
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
