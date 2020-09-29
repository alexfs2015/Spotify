package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzarg;
import java.util.Map;
import org.json.JSONObject;

@cey
/* renamed from: dzh reason: default package */
public final class dzh extends dzt<ebd> implements dzp, dzv {
    final cur a;

    /* JADX WARNING: type inference failed for: r3v0, types: [dzh, dzs] */
    public dzh(Context context, coy coy) {
        try {
            this.a = new cur(new cud(context));
            this.a.setWillNotDraw(true);
            this.a.a((cut) new dzi(this));
            this.a.a((cuv) new dzj(this));
            this.a.addJavascriptInterface(new dzo(this, 0), "GoogleJsInterface");
            bjl.e().a(context, coy.a, this.a.getSettings());
        } catch (Throwable th) {
            throw new zzarg("Init failed.", th);
        }
    }

    public final void a() {
        this.a.destroy();
    }

    public final void a(dzw dzw) {
        this.a.a((cux) new dzm(dzw));
    }

    public final void a(String str) {
        c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
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
        cpx.a.execute(new dzn(this, str));
    }

    public final void b(String str, JSONObject jSONObject) {
        dzq.a((dzp) this, str, jSONObject);
    }

    public final void c(String str) {
        cpx.a.execute(new dzk(this, str));
    }

    public final void d(String str) {
        cpx.a.execute(new dzl(this, str));
    }

    public final /* bridge */ /* synthetic */ Object n() {
        return this;
    }
}
