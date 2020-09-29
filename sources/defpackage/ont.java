package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import java.util.List;

/* renamed from: ont reason: default package */
public final class ont implements vua<txc> {
    private final wlc<a> a;
    private final wlc<List<b>> b;

    private ont(wlc<a> wlc, wlc<List<b>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ont a(wlc<a> wlc, wlc<List<b>> wlc2) {
        return new ont(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (txc) vuf.a(((a) this.a.get()).a(new a((List) this.b.get()) {
            private /* synthetic */ List a;

            {
                this.a = r1;
            }

            public final boolean a(b bVar) {
                return this.a.add(bVar);
            }

            public final boolean b(b bVar) {
                return this.a.remove(bVar);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
