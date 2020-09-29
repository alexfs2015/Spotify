package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cta reason: default package */
final /* synthetic */ class cta implements Callable {
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

    cta(Context context, cue cue, String str, boolean z, boolean z2, dhx dhx, coy coy, dtc dtc, bje bje, bki bki, dnh dnh) {
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
        ctc ctc = new ctc(ctd.a(context, cue, str, z, z2, this.f, this.g, this.h, this.i, this.j, this.k));
        ctc.setWebViewClient(bjl.g().a((csr) ctc, z2));
        ctc.setWebChromeClient(new csj(ctc));
        return ctc;
    }
}
