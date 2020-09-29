package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: cdw reason: default package */
final /* synthetic */ class cdw implements Runnable {
    private final cdv a;
    private final JSONObject b;
    private final cqc c;

    cdw(cdv cdv, JSONObject jSONObject, cqc cqc) {
        this.a = cdv;
        this.b = jSONObject;
        this.c = cqc;
    }

    public final void run() {
        cdv cdv = this.a;
        JSONObject jSONObject = this.b;
        cqc cqc = this.c;
        try {
            bjl.f();
            csr a2 = csy.a(cdv.a, cue.a(), "native-video", false, false, cdv.b, cdv.c.a.k, cdv.d, null, cdv.e.i(), cdv.c.i);
            a2.a(new cue(4, 0, 0));
            cdv.e.k = a2;
            WeakReference weakReference = new WeakReference(a2);
            cty x = a2.x();
            if (cdv.f == null) {
                cdv.f = new ceb(cdv, weakReference);
            }
            OnGlobalLayoutListener onGlobalLayoutListener = cdv.f;
            if (cdv.g == null) {
                cdv.g = new cec(cdv, weakReference);
            }
            x.a(onGlobalLayoutListener, cdv.g);
            a2.a("/video", bfv.l);
            a2.a("/videoMeta", bfv.m);
            a2.a("/precache", (bgl<? super csr>) new csg<Object>());
            a2.a("/delayPageLoaded", bfv.p);
            a2.a("/instrument", bfv.n);
            a2.a("/log", bfv.g);
            a2.a("/videoClicked", bfv.h);
            a2.a("/trackActiveViewUnit", (bgl<? super csr>) new cdz<Object>(cdv));
            a2.a("/untrackActiveViewUnit", (bgl<? super csr>) new cea<Object>(cdv));
            a2.x().a((cua) new cdx(a2, jSONObject));
            a2.x().a((ctz) new cdy(cdv, cqc, a2));
            a2.loadUrl((String) dpn.f().a(dsp.bW));
        } catch (Exception unused) {
            cow.a(5);
            cqc.b(null);
        }
    }
}
