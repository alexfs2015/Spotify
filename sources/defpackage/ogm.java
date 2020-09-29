package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;

/* renamed from: ogm reason: default package */
public final class ogm {
    private final ofx a;
    private final jui b;
    private final ogp c;
    private final vug d;
    private final ogn e;

    public ogm(ogn ogn, ofx ofx, jui jui, ogp ogp, vug vug) {
        this.e = ogn;
        this.a = ofx;
        this.b = jui;
        this.c = ogp;
        this.d = vug;
    }

    public final Single<Boolean> a() {
        ogn ogn = this.e;
        String str = "setup needs to be called first";
        if (ogn.d.b()) {
            boolean z = false;
            if (((SpSharedPreferences) ogn.d.c()).a(ogn.c, true) && this.d.a() && this.a.b() && this.b.a()) {
                ogp ogp = this.c;
                ogn ogn2 = ogp.a;
                if (ogn2.d.b()) {
                    long a2 = ((SpSharedPreferences) ogn2.d.c()).a(ogn.a, 0);
                    int a3 = ogp.a.a();
                    if (a3 == 0 || (a3 <= 2 && a2 + ogp.c[a3 - 1] < ogp.b.a())) {
                        z = true;
                    }
                } else {
                    throw new RuntimeException(str);
                }
            }
            if (!z) {
                return Single.b(Boolean.FALSE);
            }
            Single f = this.a.c().f($$Lambda$ogm$NjiLi2ujzhyYlkctTAkmbzFB7K0.INSTANCE);
            ogn ogn3 = this.e;
            ogn3.getClass();
            return f.b((Consumer<? super T>) new $$Lambda$fh2JfSUTwK2LMMtUih7qcmw8Vjk<Object>(ogn3));
        }
        throw new RuntimeException(str);
    }
}
