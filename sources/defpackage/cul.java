package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cul reason: default package */
final /* synthetic */ class cul implements Callable {
    private final Context a;
    private final cue b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final dhx f;
    private final coy g;
    private final dtc h;
    private final bje i;
    private final bki j;
    private final dnh k;

    cul(Context context, cue cue, String str, boolean z, boolean z2, dhx dhx, coy coy, dtc dtc, bje bje, bki bki, dnh dnh) {
        this.a = context;
        this.b = cue;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = dhx;
        this.g = coy;
        this.h = dtc;
        this.i = bje;
        this.j = bki;
        this.k = dnh;
    }

    public final Object call() {
        Context context = this.a;
        cue cue = this.b;
        String str = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        cum a2 = cum.a(context, cue, str, z, z2, this.f, this.g, this.h, this.i, this.j, this.k);
        ctc ctc = new ctc(a2);
        cuf cuf = new cuf(ctc, z2);
        a2.setWebChromeClient(new csj(ctc));
        a2.a((cut) cuf);
        a2.b.add(cuf);
        a2.a((cux) cuf);
        a2.a((cuv) cuf);
        a2.a = cuf;
        return ctc;
    }
}
