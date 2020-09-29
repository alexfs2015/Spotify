package defpackage;

import android.content.Context;
import android.text.TextUtils;

@cfp
/* renamed from: bje reason: default package */
public final class bje extends drm {
    private static final Object b = new Object();
    private static bje c;
    final Context a;
    private final Object d = new Object();
    private boolean e;
    private cpp f;

    private bje(Context context, cpp cpp) {
        this.a = context;
        this.f = cpp;
        this.e = false;
    }

    public static bje a(Context context, cpp cpp) {
        bje bje;
        synchronized (b) {
            if (c == null) {
                c = new bje(context.getApplicationContext(), cpp);
            }
            bje = c;
        }
        return bje;
    }

    public final void a() {
        synchronized (b) {
            if (this.e) {
                cpn.a(5);
                return;
            }
            this.e = true;
            dtg.a(this.a);
            bkc.i().a(this.a, this.f);
            bkc.k().a(this.a);
        }
    }

    public final void a(float f2) {
        bkc.D().a(f2);
    }

    public final void a(cbi cbi, String str) {
        if (cbi == null) {
            cml.a("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) cbj.a(cbi);
        if (context == null) {
            cml.a("Context is null. Failed to open debug menu.");
            return;
        }
        cnn cnn = new cnn(context);
        cnn.c = str;
        cnn.d = this.f.a;
        cnn.a();
    }

    public final void a(String str) {
        dtg.a(this.a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) dqe.f().a(dtg.cq)).booleanValue()) {
                bkc.m().a(this.a, this.f, str, null);
            }
        }
    }

    public final void a(String str, cbi cbi) {
        if (!TextUtils.isEmpty(str)) {
            dtg.a(this.a);
            boolean booleanValue = ((Boolean) dqe.f().a(dtg.cq)).booleanValue() | ((Boolean) dqe.f().a(dtg.aB)).booleanValue();
            bjf bjf = null;
            if (((Boolean) dqe.f().a(dtg.aB)).booleanValue()) {
                booleanValue = true;
                bjf = new bjf(this, (Runnable) cbj.a(cbi));
            }
            if (booleanValue) {
                bkc.m().a(this.a, this.f, str, bjf);
            }
        }
    }

    public final void a(boolean z) {
        bkc.D().a(z);
    }

    public final float b() {
        return bkc.D().a();
    }

    public final boolean c() {
        return bkc.D().b();
    }
}
