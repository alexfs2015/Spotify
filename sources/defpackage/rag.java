package defpackage;

import android.os.Bundle;
import android.view.View;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: rag reason: default package */
public final class rag {
    private final wlc<a> a;
    private final wlc<rdh> b;
    private final wlc<a> c;
    private final wlc<rwr> d;

    public rag(wlc<a> wlc, wlc<rdh> wlc2, wlc<a> wlc3, wlc<rwr> wlc4) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
    }

    public final raf a(View view, Bundle bundle) {
        raf raf = new raf((View) a((T) view, 1), bundle, (a) a((T) this.a.get(), 3), (rdh) a((T) this.b.get(), 4), (a) a((T) this.c.get(), 5), (rwr) a((T) this.d.get(), 6));
        return raf;
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
