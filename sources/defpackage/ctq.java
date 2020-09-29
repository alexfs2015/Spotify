package defpackage;

import android.content.Context;

/* renamed from: ctq reason: default package */
final /* synthetic */ class ctq implements cps {
    private final Context a;
    private final dio b;
    private final cpp c;
    private final bkz d;
    private final String e;

    ctq(Context context, dio dio, cpp cpp, bkz bkz, String str) {
        this.a = context;
        this.b = dio;
        this.c = cpp;
        this.d = bkz;
        this.e = str;
    }

    public final cqi a(Object obj) {
        Context context = this.a;
        dio dio = this.b;
        cpp cpp = this.c;
        bkz bkz = this.d;
        String str = this.e;
        bkc.f();
        cti a2 = ctp.a(context, cuv.a(), "", false, false, dio, cpp, null, null, bkz, new dny());
        cqs a3 = cqs.a(a2);
        a2.x().a((cuq) new cts(a3));
        a2.loadUrl(str);
        return a3;
    }
}
