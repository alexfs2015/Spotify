package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: cen reason: default package */
final /* synthetic */ class cen implements Runnable {
    private final cem a;
    private final JSONObject b;
    private final cqt c;

    cen(cem cem, JSONObject jSONObject, cqt cqt) {
        this.a = cem;
        this.b = jSONObject;
        this.c = cqt;
    }

    public final void run() {
        cem cem = this.a;
        JSONObject jSONObject = this.b;
        cqt cqt = this.c;
        try {
            bkc.f();
            cti a2 = ctp.a(cem.a, cuv.a(), "native-video", false, false, cem.b, cem.c.a.k, cem.d, null, cem.e.i(), cem.c.i);
            a2.a(new cuv(4, 0, 0));
            cem.e.k = a2;
            WeakReference weakReference = new WeakReference(a2);
            cup x = a2.x();
            if (cem.f == null) {
                cem.f = new ces(cem, weakReference);
            }
            OnGlobalLayoutListener onGlobalLayoutListener = cem.f;
            if (cem.g == null) {
                cem.g = new cet(cem, weakReference);
            }
            x.a(onGlobalLayoutListener, cem.g);
            a2.a("/video", bgm.l);
            a2.a("/videoMeta", bgm.m);
            a2.a("/precache", (bhc<? super cti>) new csx<Object>());
            a2.a("/delayPageLoaded", bgm.p);
            a2.a("/instrument", bgm.n);
            a2.a("/log", bgm.g);
            a2.a("/videoClicked", bgm.h);
            a2.a("/trackActiveViewUnit", (bhc<? super cti>) new ceq<Object>(cem));
            a2.a("/untrackActiveViewUnit", (bhc<? super cti>) new cer<Object>(cem));
            a2.x().a((cur) new ceo(a2, jSONObject));
            a2.x().a((cuq) new cep(cem, cqt, a2));
            a2.loadUrl((String) dqe.f().a(dtg.bW));
        } catch (Exception unused) {
            cpn.a(5);
            cqt.b(null);
        }
    }
}
