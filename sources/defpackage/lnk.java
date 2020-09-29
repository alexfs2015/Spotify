package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: lnk reason: default package */
public final class lnk implements wig<xii<String>> {
    private final wzi<xii<SessionState>> a;

    private lnk(wzi<xii<SessionState>> wzi) {
        this.a = wzi;
    }

    public static lnk a(wzi<xii<SessionState>> wzi) {
        return new lnk(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(CC.a((xii) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
