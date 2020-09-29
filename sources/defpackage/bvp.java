package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* renamed from: bvp reason: default package */
public final class bvp extends exh implements b, c {
    private static a<? extends ext, exd> b = exq.a;
    ext a;
    private final Context c;
    private final Handler d;
    private final a<? extends ext, exd> e;
    private Set<Scope> f;
    private bwy g;
    /* access modifiers changed from: private */
    public bvs h;

    public bvp(Context context, Handler handler, bwy bwy) {
        this(context, handler, bwy, b);
    }

    public bvp(Context context, Handler handler, bwy bwy, a<? extends ext, exd> aVar) {
        this.c = context;
        this.d = handler;
        this.g = (bwy) bxo.a(bwy, (Object) "ClientSettings must not be null");
        this.f = bwy.b;
        this.e = aVar;
    }

    static /* synthetic */ void a(bvp bvp, exo exo) {
        ConnectionResult connectionResult = exo.a;
        if (connectionResult.b()) {
            bxq bxq = exo.b;
            ConnectionResult connectionResult2 = bxq.b;
            if (!connectionResult2.b()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                new Exception();
                bvp.h.b(connectionResult2);
            } else {
                bvp.h.a(a.a(bxq.a), bvp.f);
            }
        } else {
            bvp.h.b(connectionResult);
        }
        bvp.a.f();
    }

    public final void a() {
        ext ext = this.a;
        if (ext != null) {
            ext.f();
        }
    }

    public final void a(int i) {
        this.a.f();
    }

    public final void a(Bundle bundle) {
        this.a.a(this);
    }

    public final void a(bvs bvs) {
        ext ext = this.a;
        if (ext != null) {
            ext.f();
        }
        this.g.h = Integer.valueOf(System.identityHashCode(this));
        a<? extends ext, exd> aVar = this.e;
        Context context = this.c;
        Looper looper = this.d.getLooper();
        bwy bwy = this.g;
        this.a = (ext) aVar.a(context, looper, bwy, bwy.g, this, this);
        this.h = bvs;
        Set<Scope> set = this.f;
        if (set == null || set.isEmpty()) {
            this.d.post(new bvq(this));
        } else {
            this.a.t();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.h.b(connectionResult);
    }

    public final void a(exo exo) {
        this.d.post(new bvr(this, exo));
    }
}
