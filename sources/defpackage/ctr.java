package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: ctr reason: default package */
final /* synthetic */ class ctr implements Callable {
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

    ctr(Context context, cuv cuv, String str, boolean z, boolean z2, dio dio, cpp cpp, dtt dtt, bjv bjv, bkz bkz, dny dny) {
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
        ctt ctt = new ctt(ctu.a(context, cuv, str, z, z2, this.f, this.g, this.h, this.i, this.j, this.k));
        ctt.setWebViewClient(bkc.g().a((cti) ctt, z2));
        ctt.setWebChromeClient(new cta(ctt));
        return ctt;
    }
}
