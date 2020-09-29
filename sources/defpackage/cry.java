package defpackage;

import android.content.Context;
import android.view.ViewGroup;

@cfp
/* renamed from: cry reason: default package */
public final class cry {
    final Context a;
    final csh b;
    final ViewGroup c;
    crt d;

    private cry(Context context, ViewGroup viewGroup, csh csh) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.a = context;
        this.c = viewGroup;
        this.b = csh;
        this.d = null;
    }

    public cry(Context context, ViewGroup viewGroup, cti cti) {
        this(context, viewGroup, (csh) cti);
    }

    public final crt a() {
        bxo.b("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }

    public final void b() {
        bxo.b("onDestroy must be called from the UI thread.");
        crt crt = this.d;
        if (crt != null) {
            crt.a.a = true;
            if (crt.b != null) {
                crt.b.b();
            }
            crt.m();
            this.c.removeView(this.d);
            this.d = null;
        }
    }
}
