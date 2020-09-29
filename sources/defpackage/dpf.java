package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;

@cey
/* renamed from: dpf reason: default package */
public class dpf {
    private dqp a;
    private final Object b = new Object();
    /* access modifiers changed from: private */
    public final dow c;
    /* access modifiers changed from: private */
    public final dov d;
    private final drn e;
    /* access modifiers changed from: private */
    public final dwy f;
    private final cja g;
    /* access modifiers changed from: private */
    public final cch h;
    private final dwz i;

    /* renamed from: dpf$a */
    abstract class a<T> {
        a() {
        }

        /* access modifiers changed from: protected */
        public abstract T a();

        /* access modifiers changed from: protected */
        public abstract T a(dqp dqp);

        /* access modifiers changed from: protected */
        public final T b() {
            dqp a2 = dpf.this.b();
            if (a2 == null) {
                cow.a(5);
                return null;
            }
            try {
                return a(a2);
            } catch (RemoteException unused) {
                cow.a(5);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final T c() {
            try {
                return a();
            } catch (RemoteException unused) {
                cow.a(5);
                return null;
            }
        }
    }

    public dpf(dow dow, dov dov, drn drn, dwy dwy, cja cja, cch cch, dwz dwz) {
        this.c = dow;
        this.d = dov;
        this.e = drn;
        this.f = dwy;
        this.g = cja;
        this.h = cch;
        this.i = dwz;
    }

    /* access modifiers changed from: private */
    public final dqp b() {
        dqp dqp;
        synchronized (this.b) {
            if (this.a == null) {
                this.a = a();
            }
            dqp = this.a;
        }
        return dqp;
    }

    public final dve a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (dve) a(context, false, (a<T>) new dpk<T>(this, frameLayout, frameLayout2, context));
    }

    private static dqp a() {
        try {
            Object newInstance = dpf.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return dqq.asInterface((IBinder) newInstance);
            }
            cow.a(5);
            return null;
        } catch (Exception unused) {
            cow.a(5);
            return null;
        }
    }

    public static <T> T a(Context context, boolean z, a<T> aVar) {
        if (!z) {
            dpn.a();
            if (!col.c(context)) {
                cow.a(3);
                z = true;
            }
        }
        dpn.a();
        int e2 = col.e(context);
        dpn.a();
        if (e2 > col.d(context)) {
            z = true;
        }
        dsp.a(context);
        if (((Boolean) dpn.f().a(dsp.dc)).booleanValue()) {
            z = false;
        }
        if (z) {
            T b2 = aVar.b();
            return b2 == null ? aVar.c() : b2;
        }
        T c2 = aVar.c();
        return c2 == null ? aVar.b() : c2;
    }

    static /* synthetic */ void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        dpn.a().a(context, "gmob-apps", bundle);
    }
}
