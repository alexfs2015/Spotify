package defpackage;

import android.content.Context;

/* renamed from: hqb reason: default package */
public final class hqb implements hqc {
    private final Context a;
    private final sso b;
    private final hqy c;
    private fqn d = new fqr("No flags available yet");

    public hqb(Context context, sso sso, hqy hqy) {
        this.a = context;
        this.b = sso;
        this.c = hqy;
    }

    public final void a(fqn fqn) {
        this.d = fqn;
    }

    public final void a(String str, String str2) {
        new las(this.a, this.b, this.d).a(str, false);
        this.c.a(str2, str, false);
    }

    public final void a(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "unknown_context_in_external_integration_service";
        }
        new las(this.a, this.b, this.d).a(str, str2, false);
        this.c.a(str3, str, true);
    }
}
