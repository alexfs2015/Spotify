package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cvc reason: default package */
final /* synthetic */ class cvc implements Callable {
    private final Context a;
    private final cuv b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final dio f;
    private final cpp g;
    private final dtt h;
    private final bjv i;
    private final bkz j;
    private final dny k;

    cvc(Context context, cuv cuv, String str, boolean z, boolean z2, dio dio, cpp cpp, dtt dtt, bjv bjv, bkz bkz, dny dny) {
        this.a = context;
        this.b = cuv;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = dio;
        this.g = cpp;
        this.h = dtt;
        this.i = bjv;
        this.j = bkz;
        this.k = dny;
    }

    public final Object call() {
        Context context = this.a;
        cuv cuv = this.b;
        String str = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        cvd a2 = cvd.a(context, cuv, str, z, z2, this.f, this.g, this.h, this.i, this.j, this.k);
        ctt ctt = new ctt(a2);
        cuw cuw = new cuw(ctt, z2);
        a2.setWebChromeClient(new cta(ctt));
        a2.a((cvk) cuw);
        a2.b.add(cuw);
        a2.a((cvo) cuw);
        a2.a((cvm) cuw);
        a2.a = cuw;
        return ctt;
    }
}
