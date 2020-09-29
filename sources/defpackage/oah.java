package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.payfail.PaymentFailureRepository;

/* renamed from: oah reason: default package */
public final class oah implements vua<oag> {
    private final wlc<Context> a;
    private final wlc<SpSharedPreferences<Object>> b;
    private final wlc<PaymentFailureRepository> c;
    private final wlc<oai> d;
    private final wlc<oam> e;
    private final wlc<jrp> f;
    private final wlc<heg> g;

    private oah(wlc<Context> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<PaymentFailureRepository> wlc3, wlc<oai> wlc4, wlc<oam> wlc5, wlc<jrp> wlc6, wlc<heg> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static oah a(wlc<Context> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<PaymentFailureRepository> wlc3, wlc<oai> wlc4, wlc<oam> wlc5, wlc<jrp> wlc6, wlc<heg> wlc7) {
        oah oah = new oah(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return oah;
    }

    public final /* synthetic */ Object get() {
        oag oag = new oag((Context) this.a.get(), (SpSharedPreferences) this.b.get(), (PaymentFailureRepository) this.c.get(), (oai) this.d.get(), (oam) this.e.get(), (jrp) this.f.get(), (heg) this.g.get());
        return oag;
    }
}
