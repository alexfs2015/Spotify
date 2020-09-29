package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarg;
import java.util.Map;
import org.json.JSONObject;

@cfp
/* renamed from: dzy reason: default package */
public final class dzy extends eak<ebu> implements eag, eam {
    final cvi a;

    /* JADX WARNING: type inference failed for: r3v0, types: [dzy, eaj] */
    public dzy(Context context, cpp cpp) {
        try {
            this.a = new cvi(new cuu(context));
            this.a.setWillNotDraw(true);
            this.a.a((cvk) new dzz(this));
            this.a.a((cvm) new eaa(this));
            this.a.addJavascriptInterface(new eaf(this, 0), "GoogleJsInterface");
            bkc.e().a(context, cpp.a, this.a.getSettings());
        } catch (Throwable th) {
            throw new zzarg("Init failed.", th);
        }
    }

    public final void a() {
        this.a.destroy();
    }

    public final void a(ean ean) {
        this.a.a((cvo) new ead(ean));
    }

    public final void a(String str) {
        c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
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
        cqo.a.execute(new eae(this, str));
    }

    public final void b(String str, JSONObject jSONObject) {
        eah.a((eag) this, str, jSONObject);
    }

    public final void c(String str) {
        cqo.a.execute(new eab(this, str));
    }

    public final void d(String str) {
        cqo.a.execute(new eac(this, str));
    }

    public final /* bridge */ /* synthetic */ Object n() {
        return this;
    }
}
