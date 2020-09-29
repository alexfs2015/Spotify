package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import java.util.List;

/* renamed from: ouz reason: default package */
public final class ouz implements wig<ujf> {
    private final wzi<a> a;
    private final wzi<List<b>> b;

    private ouz(wzi<a> wzi, wzi<List<b>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ouz a(wzi<a> wzi, wzi<List<b>> wzi2) {
        return new ouz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (ujf) wil.a(((a) this.a.get()).a(new a((List) this.b.get()) {
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
