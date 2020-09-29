package defpackage;

import com.spotify.remoteconfig.AndroidLibsShareProperties;

/* renamed from: iwv reason: default package */
public final class iwv implements vua<iwu> {
    private final wlc<jmb> a;
    private final wlc<AndroidLibsShareProperties> b;
    private final wlc<izg> c;

    private iwv(wlc<jmb> wlc, wlc<AndroidLibsShareProperties> wlc2, wlc<izg> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static iwv a(wlc<jmb> wlc, wlc<AndroidLibsShareProperties> wlc2, wlc<izg> wlc3) {
        return new iwv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new iwu((jmb) this.a.get(), (AndroidLibsShareProperties) this.b.get(), (izg) this.c.get());
    }
}
