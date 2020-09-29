package defpackage;

import android.content.Context;
import android.text.TextUtils;

@cey
/* renamed from: bin reason: default package */
public final class bin extends dqv {
    private static final Object b = new Object();
    private static bin c;
    final Context a;
    private final Object d = new Object();
    private boolean e;
    private coy f;

    private bin(Context context, coy coy) {
        this.a = context;
        this.f = coy;
        this.e = false;
    }

    public static bin a(Context context, coy coy) {
        bin bin;
        synchronized (b) {
            if (c == null) {
                c = new bin(context.getApplicationContext(), coy);
            }
            bin = c;
        }
        return bin;
    }

    public final void a(float f2) {
        bjl.D().a(f2);
    }

    public final void a(String str) {
        dsp.a(this.a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) dpn.f().a(dsp.cq)).booleanValue()) {
                bjl.m().a(this.a, this.f, str, null);
            }
        }
    }

    public final void a(String str, car car) {
        if (!TextUtils.isEmpty(str)) {
            dsp.a(this.a);
            boolean booleanValue = ((Boolean) dpn.f().a(dsp.cq)).booleanValue() | ((Boolean) dpn.f().a(dsp.aB)).booleanValue();
            bio bio = null;
            if (((Boolean) dpn.f().a(dsp.aB)).booleanValue()) {
                booleanValue = true;
                bio = new bio(this, (Runnable) cas.a(car));
            }
            if (booleanValue) {
                bjl.m().a(this.a, this.f, str, bio);
            }
        }
    }

    public final void a(boolean z) {
        bjl.D().a(z);
    }

    public final float b() {
        return bjl.D().a();
    }

    public final boolean c() {
        return bjl.D().b();
    }

    public final void a() {
        synchronized (b) {
            if (this.e) {
                cow.a(5);
                return;
            }
            this.e = true;
            dsp.a(this.a);
            bjl.i().a(this.a, this.f);
            bjl.k().a(this.a);
        }
    }

    public final void a(car car, String str) {
        if (car == null) {
            clu.a("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) cas.a(car);
        if (context == null) {
            clu.a("Context is null. Failed to open debug menu.");
            return;
        }
        cmw cmw = new cmw(context);
        cmw.c = str;
        cmw.d = this.f.a;
        cmw.a();
    }
}
