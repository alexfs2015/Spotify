package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.features.yourlibrary.container.YourLibraryPrefs;

/* renamed from: qro reason: default package */
public final class qro implements vua<YourLibraryPrefs> {
    private final wlc<qri> a;
    private final wlc<Context> b;
    private final wlc<jrp> c;
    private final wlc<rnf> d;
    private final wlc<jvy> e;
    private final wlc<qrq> f;
    private final wlc<a> g;

    private qro(wlc<qri> wlc, wlc<Context> wlc2, wlc<jrp> wlc3, wlc<rnf> wlc4, wlc<jvy> wlc5, wlc<qrq> wlc6, wlc<a> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static qro a(wlc<qri> wlc, wlc<Context> wlc2, wlc<jrp> wlc3, wlc<rnf> wlc4, wlc<jvy> wlc5, wlc<qrq> wlc6, wlc<a> wlc7) {
        qro qro = new qro(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return qro;
    }

    public final /* synthetic */ Object get() {
        YourLibraryPrefs yourLibraryPrefs = new YourLibraryPrefs((qri) this.a.get(), (Context) this.b.get(), (jrp) this.c.get(), (rnf) this.d.get(), (jvy) this.e.get(), (qrq) this.f.get(), (a) this.g.get());
        return yourLibraryPrefs;
    }
}
