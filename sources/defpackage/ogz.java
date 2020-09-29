package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.payfail.PaymentFailureRepository;

/* renamed from: ogz reason: default package */
public final class ogz implements wig<ogy> {
    private final wzi<Context> a;
    private final wzi<SpSharedPreferences<Object>> b;
    private final wzi<PaymentFailureRepository> c;
    private final wzi<oha> d;
    private final wzi<ohe> e;
    private final wzi<jtz> f;
    private final wzi<hhc> g;

    private ogz(wzi<Context> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<PaymentFailureRepository> wzi3, wzi<oha> wzi4, wzi<ohe> wzi5, wzi<jtz> wzi6, wzi<hhc> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static ogz a(wzi<Context> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<PaymentFailureRepository> wzi3, wzi<oha> wzi4, wzi<ohe> wzi5, wzi<jtz> wzi6, wzi<hhc> wzi7) {
        ogz ogz = new ogz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return ogz;
    }

    public final /* synthetic */ Object get() {
        ogy ogy = new ogy((Context) this.a.get(), (SpSharedPreferences) this.b.get(), (PaymentFailureRepository) this.c.get(), (oha) this.d.get(), (ohe) this.e.get(), (jtz) this.f.get(), (hhc) this.g.get());
        return ogy;
    }
}
