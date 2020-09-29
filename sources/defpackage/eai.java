package defpackage;

import android.content.Context;

/* renamed from: eai reason: default package */
final /* synthetic */ class eai implements Runnable {
    private final eah a;
    private final dhx b;
    private final eay c;

    eai(eah eah, dhx dhx, eay eay) {
        this.a = eah;
        this.b = dhx;
        this.c = eay;
    }

    public final void run() {
        eah eah = this.a;
        dhx dhx = this.b;
        eay eay = this.c;
        try {
            Context context = eah.b;
            coy coy = eah.d;
            dzv dzh = ((Boolean) dpn.f().a(dsp.ay)).booleanValue() ? new dzh(context, coy) : new dzx(context, coy, dhx);
            dzh.a((dzw) new eaj(eah, eay, dzh));
            dzh.a("/jsLoaded", new eam(eah, eay, dzh));
            coc coc = new coc();
            T ean = new ean(eah, dhx, dzh, coc);
            coc.a = ean;
            dzh.a("/requestReload", ean);
            if (eah.c.endsWith(".js")) {
                dzh.a(eah.c);
            } else if (eah.c.startsWith("<html>")) {
                dzh.c(eah.c);
            } else {
                dzh.d(eah.c);
            }
            cmd.a.postDelayed(new eao(eah, eay, dzh), (long) eas.a);
        } catch (Throwable th) {
            clu.a("Error creating webview.", th);
            bjl.i().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            eay.a();
        }
    }
}
