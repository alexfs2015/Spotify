package defpackage;

import com.google.android.gms.internal.ads.zzwe;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ebu reason: default package */
final class ebu implements bfo {
    private final eau a;
    private final cqc b;
    private final /* synthetic */ ebr c;

    public ebu(ebr ebr, eau eau, cqc cqc) {
        this.c = ebr;
        this.a = eau;
        this.b = cqc;
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
