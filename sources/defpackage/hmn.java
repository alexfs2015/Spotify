package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: hmn reason: default package */
public final class hmn implements wig<nxs> {
    private final wzi<a> a;
    private final wzi<Flowable<SessionState>> b;
    private final wzi<hxs> c;
    private final wzi<nxv> d;

    private hmn(wzi<a> wzi, wzi<Flowable<SessionState>> wzi2, wzi<hxs> wzi3, wzi<nxv> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hmn a(wzi<a> wzi, wzi<Flowable<SessionState>> wzi2, wzi<hxs> wzi3, wzi<nxv> wzi4) {
        return new hmn(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (nxs) wil.a(new nxs((Flowable) this.b.get(), (a) this.a.get(), (hxs) this.c.get(), (nxv) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
