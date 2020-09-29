package defpackage;

import android.content.Context;

/* renamed from: eaz reason: default package */
final /* synthetic */ class eaz implements Runnable {
    private final eay a;
    private final dio b;
    private final ebp c;

    eaz(eay eay, dio dio, ebp ebp) {
        this.a = eay;
        this.b = dio;
        this.c = ebp;
    }

    public final void run() {
        eay eay = this.a;
        dio dio = this.b;
        ebp ebp = this.c;
        try {
            Context context = eay.b;
            cpp cpp = eay.d;
            eam dzy = ((Boolean) dqe.f().a(dtg.ay)).booleanValue() ? new dzy(context, cpp) : new eao(context, cpp, dio);
            dzy.a((ean) new eba(eay, ebp, dzy));
            dzy.a("/jsLoaded", new ebd(eay, ebp, dzy));
            cot cot = new cot();
            T ebe = new ebe(eay, dio, dzy, cot);
            cot.a = ebe;
            dzy.a("/requestReload", ebe);
            if (eay.c.endsWith(".js")) {
                dzy.a(eay.c);
            } else if (eay.c.startsWith("<html>")) {
                dzy.c(eay.c);
            } else {
                dzy.d(eay.c);
            }
            cmu.a.postDelayed(new ebf(eay, ebp, dzy), (long) ebj.a);
        } catch (Throwable th) {
            cml.a("Error creating webview.", th);
            bkc.i().a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            ebp.a();
        }
    }
}
