package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;

@cfp
/* renamed from: dpw reason: default package */
public class dpw {
    private drg a;
    private final Object b = new Object();
    /* access modifiers changed from: private */
    public final dpn c;
    /* access modifiers changed from: private */
    public final dpm d;
    private final dse e;
    /* access modifiers changed from: private */
    public final dxp f;
    private final cjr g;
    /* access modifiers changed from: private */
    public final ccy h;
    private final dxq i;

    /* renamed from: dpw$a */
    abstract class a<T> {
        a() {
        }

        /* access modifiers changed from: protected */
        public abstract T a();

        /* access modifiers changed from: protected */
        public abstract T a(drg drg);

        /* access modifiers changed from: protected */
        public final T b() {
            drg a2 = dpw.this.b();
            if (a2 == null) {
                cpn.a(5);
                return null;
            }
            try {
                return a(a2);
            } catch (RemoteException unused) {
                cpn.a(5);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public final T c() {
            try {
                return a();
            } catch (RemoteException unused) {
                cpn.a(5);
                return null;
            }
        }
    }

    public dpw(dpn dpn, dpm dpm, dse dse, dxp dxp, cjr cjr, ccy ccy, dxq dxq) {
        this.c = dpn;
        this.d = dpm;
        this.e = dse;
        this.f = dxp;
        this.g = cjr;
        this.h = ccy;
        this.i = dxq;
    }

    private static drg a() {
        try {
            Object newInstance = dpw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return drh.asInterface((IBinder) newInstance);
            }
            cpn.a(5);
            return null;
        } catch (Exception unused) {
            cpn.a(5);
            return null;
        }
    }

    public static <T> T a(Context context, boolean z, a<T> aVar) {
        if (!z) {
            dqe.a();
            if (!cpc.c(context)) {
                cpn.a(3);
                z = true;
            }
        }
        dqe.a();
        int e2 = cpc.e(context);
        dqe.a();
        if (e2 > cpc.d(context)) {
            z = true;
        }
        dtg.a(context);
        if (((Boolean) dqe.f().a(dtg.dc)).booleanValue()) {
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
        dqe.a().a(context, "gmob-apps", bundle);
    }

    /* access modifiers changed from: private */
    public final drg b() {
        drg drg;
        synchronized (this.b) {
            if (this.a == null) {
                this.a = a();
            }
            drg = this.a;
        }
        return drg;
    }

    public final dvv a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (dvv) a(context, false, (a<T>) new dqb<T>(this, frameLayout, frameLayout2, context));
    }
}
