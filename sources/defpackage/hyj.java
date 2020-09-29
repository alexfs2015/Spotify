package defpackage;

import com.spotify.music.libs.web.RxWebToken;

/* renamed from: hyj reason: default package */
public final class hyj implements wig<hyi> {
    private final wzi<RxWebToken> a;
    private final wzi<hgy> b;
    private final wzi<gfk<fli>> c;
    private final wzi<jtz> d;
    private final wzi<giz> e;

    private hyj(wzi<RxWebToken> wzi, wzi<hgy> wzi2, wzi<gfk<fli>> wzi3, wzi<jtz> wzi4, wzi<giz> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static hyj a(wzi<RxWebToken> wzi, wzi<hgy> wzi2, wzi<gfk<fli>> wzi3, wzi<jtz> wzi4, wzi<giz> wzi5) {
        hyj hyj = new hyj(wzi, wzi2, wzi3, wzi4, wzi5);
        return hyj;
    }

    public final /* synthetic */ Object get() {
        hyi hyi = new hyi((RxWebToken) this.a.get(), (hgy) this.b.get(), (gfk) this.c.get(), (jtz) this.d.get(), (giz) this.e.get());
        return hyi;
    }
}
