package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: tsi reason: default package */
public final class tsi {
    private final iin a;
    private Ad b;
    private final tma c;
    private final tsh d;

    public tsi(tma tma, tsh tsh, iin iin) {
        this.c = tma;
        this.d = tsh;
        this.a = iin;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Ad ad) {
        this.b = ad;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        iin iin = this.a;
        String str = z ? "unobscured" : "obscured";
        Ad ad = this.b;
        iin.a(str, ad != null ? ad.id() : "");
    }

    public final void a() {
        this.d.a((a<T>) new $$Lambda$tsi$zIM_bQgar8d75Hm7dAaIgo9bI50<T>(this));
        this.c.a((a<T>) new $$Lambda$tsi$3jjKnp67m6GR4bclubBuUM6LN1Y<T>(this));
    }
}
