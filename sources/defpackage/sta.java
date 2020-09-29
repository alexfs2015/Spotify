package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: sta reason: default package */
public final class sta {
    private final wlc<tad> a;
    private final wlc<a> b;
    private final wlc<Flowable<String>> c;

    public sta(wlc<tad> wlc, wlc<a> wlc2, wlc<Flowable<String>> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    public final ssz a(Flowable<stl> flowable) {
        return new ssz((tad) a(this.a.get(), 1), (a) a(this.b.get(), 2), (Flowable) a(this.c.get(), 3), (Flowable) a(flowable, 4));
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
