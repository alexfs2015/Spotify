package defpackage;

import com.google.android.gms.internal.ads.zzwe;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ecl reason: default package */
final class ecl implements bgf {
    private final ebl a;
    private final cqt b;
    private final /* synthetic */ eci c;

    public ecl(eci eci, ebl ebl, cqt cqt) {
        this.c = eci;
        this.a = ebl;
        this.b = cqt;
    }

    public final void a(String str) {
        if (str == null) {
            try {
                this.b.a(new zzwe());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.a.b();
                throw th;
            }
        } else {
            this.b.a(new zzwe(str));
        }
        this.a.b();
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.b.b(this.c.a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.b.b(e);
        } catch (Throwable th) {
            this.a.b();
            throw th;
        }
        this.a.b();
    }
}
