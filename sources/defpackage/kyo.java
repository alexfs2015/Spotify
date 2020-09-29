package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: kyo reason: default package */
public final class kyo implements vua<uvf> {
    private final wlc<a> a;
    private final wlc<uvt> b;

    private kyo(wlc<a> wlc, wlc<uvt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kyo a(wlc<a> wlc, wlc<uvt> wlc2) {
        return new kyo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        a aVar = (a) this.a.get();
        uvf b2 = ((uvt) this.b.get()).b();
        aVar.a(new uvg(b2));
        return (uvf) vuf.a(b2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
