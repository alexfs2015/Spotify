package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger;

/* renamed from: inz reason: default package */
public final class inz implements wig<StreamingCardEventLogger> {
    private final wzi<inx> a;
    private final wzi<gfk<fli>> b;

    private inz(wzi<inx> wzi, wzi<gfk<fli>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static inz a(wzi<inx> wzi, wzi<gfk<fli>> wzi2) {
        return new inz(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new StreamingCardEventLogger((inx) this.a.get(), (gfk) this.b.get());
    }
}
