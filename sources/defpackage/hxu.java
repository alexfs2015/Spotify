package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: hxu reason: default package */
public final class hxu implements wig<xii<SessionState>> {
    private final wzi<hxx> a;

    private hxu(wzi<hxx> wzi) {
        this.a = wzi;
    }

    public static hxu a(wzi<hxx> wzi) {
        return new hxu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(wit.a((xfk<T>) ((hxx) this.a.get()).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
