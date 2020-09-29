package defpackage;

import android.content.Context;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: hqs reason: default package */
public final class hqs implements hqr {
    private final Context a;
    private final hqf b;
    private final rzt c;
    private final iiu d;
    private final hqy e;
    private final String f;
    private boolean g;
    private hps h;

    protected hqs(Context context, hqf hqf, rzt rzt, iiu iiu, hqu hqu, hqy hqy) {
        this.a = (Context) fbp.a(context);
        this.b = hqf;
        this.c = (rzt) fbp.a(rzt);
        this.d = (iiu) fbp.a(iiu);
        this.e = (hqy) fbp.a(hqy);
        this.f = hqu.a();
    }

    private void a(String str, boolean z) {
        fbp.a(str);
        mh.a(this.a).a(rzs.a(str, z));
    }

    private boolean e() {
        return !"".equals(this.c.a);
    }

    public final rzt a() {
        return this.c;
    }

    public final void b() {
        if (e() && !this.g) {
            this.g = true;
            this.e.a(this.f, rzr.a(this.c.f, this.c.a), this.c);
            if (this.h == null) {
                this.h = new hps(this.e, this.f, this.c);
            }
            this.h.a(this.b.a());
            if ("car".equals(this.c.e)) {
                a(this.c.a, true);
            }
            try {
                Logger.b("Connecting external accessory", new Object[0]);
                this.d.a(this.c);
            } catch (JsonProcessingException e2) {
                Logger.e(e2, "Failed to serialize object", new Object[0]);
            }
        }
    }

    public final void c() {
        if (e() && this.g) {
            this.g = false;
            this.h.a();
            this.h.b();
            this.e.b(this.f, rzr.a(this.c.f, this.c.a), this.c);
            if ("car".equals(this.c.e)) {
                a(this.c.a, false);
            }
            try {
                this.d.b(this.c);
            } catch (JsonProcessingException e2) {
                String str = "Could not disconnect accessory";
                Logger.e(e2, str, new Object[0]);
                Assertion.a(str, (Throwable) e2);
            }
        }
    }

    public final String d() {
        return this.f;
    }
}
