package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* renamed from: etp reason: default package */
public final class etp extends eur {
    protected eto a;
    public volatile eto b;
    eto c;
    public final Map<Activity, eto> d = new dp();
    private eto e;
    private String f;

    public etp(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    public final eto v() {
        D();
        c();
        return this.a;
    }

    public final void a(Activity activity, eto eto, boolean z) {
        eto eto2 = this.b == null ? this.c : this.b;
        if (eto.b == null) {
            eto = new eto(eto.a, a(activity.getClass().getCanonicalName()), eto.c);
        }
        this.c = this.b;
        this.b = eto;
        p().a((Runnable) new etq(this, z, eto2, eto));
    }

    public static void a(eto eto, Bundle bundle, boolean z) {
        String str = "_si";
        String str2 = "_sn";
        String str3 = "_sc";
        if (bundle == null || eto == null || (bundle.containsKey(str3) && !z)) {
            if (bundle != null && eto == null && z) {
                bundle.remove(str2);
                bundle.remove(str3);
                bundle.remove(str);
            }
            return;
        }
        if (eto.a != null) {
            bundle.putString(str2, eto.a);
        } else {
            bundle.remove(str2);
        }
        bundle.putString(str3, eto.b);
        bundle.putLong(str, eto.c);
    }

    public final void a(String str, eto eto) {
        c();
        synchronized (this) {
            if (this.f == null || this.f.equals(str) || eto != null) {
                this.f = str;
                this.e = eto;
            }
        }
    }

    public static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* access modifiers changed from: 0000 */
    public final eto a(Activity activity) {
        bwx.a(activity);
        eto eto = (eto) this.d.get(activity);
        if (eto != null) {
            return eto;
        }
        eto eto2 = new eto(null, a(activity.getClass().getCanonicalName()), o().f());
        this.d.put(activity, eto2);
        return eto2;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqf d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ etc e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ eqq f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ ets g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ etp h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ eqs i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ euq j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }

    static /* synthetic */ void a(etp etp, eto eto, boolean z) {
        etp.d().a(etp.l().b());
        if (etp.j().a(eto.d, z)) {
            eto.d = false;
        }
    }
}
