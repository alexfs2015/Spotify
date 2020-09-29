package defpackage;

import android.content.Context;
import android.view.ViewGroup;

@cey
/* renamed from: crh reason: default package */
public final class crh {
    final Context a;
    final crq b;
    final ViewGroup c;
    crc d;

    private crh(Context context, ViewGroup viewGroup, crq crq) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.a = context;
        this.c = viewGroup;
        this.b = crq;
        this.d = null;
    }

    public crh(Context context, ViewGroup viewGroup, csr csr) {
        this(context, viewGroup, (crq) csr);
    }

    public final crc a() {
        bwx.b("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }

    public final void b() {
        bwx.b("onDestroy must be called from the UI thread.");
        crc crc = this.d;
        if (crc != null) {
            crc.a.a = true;
            if (crc.b != null) {
                crc.b.b();
            }
            crc.m();
            this.c.removeView(this.d);
            this.d = null;
        }
    }
}
