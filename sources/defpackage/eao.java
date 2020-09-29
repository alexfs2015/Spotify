package defpackage;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

@cfp
/* renamed from: eao reason: default package */
public final class eao implements eag, eam {
    final cti a;
    private final Context b;

    public eao(Context context, cpp cpp, dio dio) {
        this.b = context;
        bkc.f();
        Context context2 = context;
        this.a = ctp.a(context2, cuv.a(), "", false, false, dio, cpp, null, null, null, new dny());
        this.a.o().setWillNotDraw(true);
    }

    private static void a(Runnable runnable) {
        dqe.a();
        if (cpc.b()) {
            runnable.run();
        } else {
            cmu.a.post(runnable);
        }
    }

    public final void a() {
        this.a.destroy();
    }

    public final void a(ean ean) {
        cup x = this.a.x();
        ean.getClass();
        x.a((cur) new ear(ean));
    }

    public final void a(String str) {
        a((Runnable) new eat(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void a(String str, bhc<? super ebu> bhc) {
        this.a.a(str, (bhc<? super cti>) new eaw<Object>(this, bhc));
    }

    public final void a(String str, String str2) {
        eah.a((eag) this, str, str2);
    }

    public final void a(String str, Map map) {
        eah.a((eag) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        eah.b(this, str, jSONObject);
    }

    public final ebv b() {
        return new ebw(this);
    }

    public final void b(String str) {
        a((Runnable) new eap(this, str));
    }

    public final void b(String str, bhc<? super ebu> bhc) {
        this.a.a(str, (cag<bhc<? super cti>>) new eaq<bhc<? super cti>>(bhc));
    }

    public final void b(String str, JSONObject jSONObject) {
        eah.a((eag) this, str, jSONObject);
    }

    public final void c(String str) {
        a((Runnable) new eau(this, str));
    }

    public final void d(String str) {
        a((Runnable) new eav(this, str));
    }
}
