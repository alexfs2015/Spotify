package defpackage;

import android.os.Bundle;
import android.view.View;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: rjc reason: default package */
public final class rjc {
    private final wzi<a> a;
    private final wzi<rmf> b;
    private final wzi<a> c;
    private final wzi<sgb> d;

    public rjc(wzi<a> wzi, wzi<rmf> wzi2, wzi<a> wzi3, wzi<sgb> wzi4) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final rjb a(View view, Bundle bundle) {
        rjb rjb = new rjb((View) a((T) view, 1), bundle, (a) a((T) this.a.get(), 3), (rmf) a((T) this.b.get(), 4), (a) a((T) this.c.get(), 5), (sgb) a((T) this.d.get(), 6));
        return rjb;
    }
}
