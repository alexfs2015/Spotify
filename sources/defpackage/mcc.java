package defpackage;

import com.spotify.music.libs.web.RxWebToken;

/* renamed from: mcc reason: default package */
public final class mcc implements vua<mcb> {
    private final wlc<RxWebToken> a;
    private final wlc<mbx> b;

    public static mcb a(RxWebToken rxWebToken, Object obj) {
        return new mcb(rxWebToken, (mbx) obj);
    }

    public final /* synthetic */ Object get() {
        return new mcb((RxWebToken) this.a.get(), (mbx) this.b.get());
    }
}
