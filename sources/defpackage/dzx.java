package defpackage;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

@cey
/* renamed from: dzx reason: default package */
public final class dzx implements dzp, dzv {
    final csr a;
    private final Context b;

    private static void a(Runnable runnable) {
        dpn.a();
        if (col.b()) {
            runnable.run();
        } else {
            cmd.a.post(runnable);
        }
    }

    public final void a() {
        this.a.destroy();
    }

    public final void a(String str) {
        a((Runnable) new eac(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void a(String str, bgl<? super ebd> bgl) {
        this.a.a(str, (bgl<? super csr>) new eaf<Object>(this, bgl));
    }

    public final void a(String str, String str2) {
        dzq.a((dzp) this, str, str2);
    }

    public final void a(String str, Map map) {
        dzq.a((dzp) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        dzq.b(this, str, jSONObject);
    }

    public final ebe b() {
        return new ebf(this);
    }

    public final void b(String str) {
        a((Runnable) new dzy(this, str));
    }

    public final void b(String str, bgl<? super ebd> bgl) {
        this.a.a(str, (bzp<bgl<? super csr>>) new dzz<bgl<? super csr>>(bgl));
    }

    public final void b(String str, JSONObject jSONObject) {
        dzq.a((dzp) this, str, jSONObject);
    }

    public final void c(String str) {
        a((Runnable) new ead(this, str));
    }

    public final void d(String str) {
        a((Runnable) new eae(this, str));
    }

    public dzx(Context context, coy coy, dhx dhx) {
        this.b = context;
        bjl.f();
        Context context2 = context;
        this.a = csy.a(context2, cue.a(), "", false, false, dhx, coy, null, null, null, new dnh());
        this.a.o().setWillNotDraw(true);
    }

    public final void a(dzw dzw) {
        cty x = this.a.x();
        dzw.getClass();
        x.a((cua) new eaa(dzw));
    }
}
