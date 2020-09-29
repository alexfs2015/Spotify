package defpackage;

import android.content.Context;

/* renamed from: hnm reason: default package */
public final class hnm implements hnn {
    private final Context a;
    private final sih b;
    private final hou c;
    private fpt d = new fpx("No flags available yet");

    public hnm(Context context, sih sih, hou hou) {
        this.a = context;
        this.b = sih;
        this.c = hou;
    }

    public final void a(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "unknown_context_in_external_integration_service";
        }
        new kxj(this.a, this.b, this.d).a(str, str2, false);
        this.c.a(str3, str, true);
    }

    public final void a(String str, String str2) {
        new kxj(this.a, this.b, this.d).a(str, false);
        this.c.a(str2, str, false);
    }

    public final void a(fpt fpt) {
        this.d = fpt;
    }
}
