package defpackage;

import android.content.Context;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.UUID;

/* renamed from: hoq reason: default package */
public final class hoq implements hop {
    private final Context a;
    private final hod b;
    private final rqi c;
    private final igh d;
    private final hou e;
    private final String f = e();
    private boolean g;
    private hnc h;

    protected hoq(Context context, hod hod, rqi rqi, igh igh, hou hou) {
        this.a = (Context) fay.a(context);
        this.b = hod;
        this.c = (rqi) fay.a(rqi);
        this.d = (igh) fay.a(igh);
        this.e = (hou) fay.a(hou);
    }

    public final rqi a() {
        return this.c;
    }

    private boolean f() {
        return !"".equals(this.c.a);
    }

    public static String e() {
        StringBuilder sb = new StringBuilder();
        ggw.a(gbd.class);
        sb.append(Long.toString(gbd.a().a()));
        sb.append(UUID.randomUUID());
        return sb.toString();
    }

    public final void b() {
        if (f() && !this.g) {
            this.g = true;
            this.e.a(this.f, rqg.a(this.c.f, this.c.a), this.c);
            if (this.h == null) {
                this.h = new hnc(this.e, this.f, this.c);
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
        if (f() && this.g) {
            this.g = false;
            this.h.a();
            this.h.b();
            this.e.b(this.f, rqg.a(this.c.f, this.c.a), this.c);
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

    private void a(String str, boolean z) {
        fay.a(str);
        mc.a(this.a).a(rqh.a(str, z));
    }

    public final String d() {
        return this.f;
    }
}
