package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* renamed from: buy reason: default package */
public final class buy extends ewq implements b, c {
    private static a<? extends exc, ewm> b = ewz.a;
    exc a;
    private final Context c;
    private final Handler d;
    private final a<? extends exc, ewm> e;
    private Set<Scope> f;
    private bwh g;
    /* access modifiers changed from: private */
    public bvb h;

    public buy(Context context, Handler handler, bwh bwh) {
        this(context, handler, bwh, b);
    }

    public buy(Context context, Handler handler, bwh bwh, a<? extends exc, ewm> aVar) {
        this.c = context;
        this.d = handler;
        this.g = (bwh) bwx.a(bwh, (Object) "ClientSettings must not be null");
        this.f = bwh.b;
        this.e = aVar;
    }

    public final void a(bvb bvb) {
        exc exc = this.a;
        if (exc != null) {
            exc.f();
        }
        this.g.h = Integer.valueOf(System.identityHashCode(this));
        a<? extends exc, ewm> aVar = this.e;
        Context context = this.c;
        Looper looper = this.d.getLooper();
        bwh bwh = this.g;
        this.a = (exc) aVar.a(context, looper, bwh, bwh.g, this, this);
        this.h = bvb;
        Set<Scope> set = this.f;
        if (set == null || set.isEmpty()) {
            this.d.post(new buz(this));
        } else {
            this.a.t();
        }
    }

    public final void a() {
        exc exc = this.a;
        if (exc != null) {
            exc.f();
        }
    }

    public final void a(Bundle bundle) {
        this.a.a(this);
    }

    public final void a(int i) {
        this.a.f();
    }

    public final void a(ConnectionResult connectionResult) {
        this.h.b(connectionResult);
    }

    public final void a(ewx ewx) {
        this.d.post(new bva(this, ewx));
    }

    static /* synthetic */ void a(buy buy, ewx ewx) {
        ConnectionResult connectionResult = ewx.a;
        if (connectionResult.b()) {
            bwz bwz = ewx.b;
            ConnectionResult connectionResult2 = bwz.b;
            if (!connectionResult2.b()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                new Exception();
                buy.h.b(connectionResult2);
            } else {
                buy.h.a(a.a(bwz.a), buy.f);
            }
        } else {
            buy.h.b(connectionResult);
        }
        buy.a.f();
    }
}
