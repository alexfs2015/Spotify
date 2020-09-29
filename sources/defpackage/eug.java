package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* renamed from: eug reason: default package */
public final class eug extends evi {
    protected euf a;
    public volatile euf b;
    euf c;
    public final Map<Activity, euf> d = new dp();
    private euf e;
    private String f;

    public eug(esp esp) {
        super(esp);
    }

    public static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    public static void a(euf euf, Bundle bundle, boolean z) {
        String str = "_si";
        String str2 = "_sn";
        String str3 = "_sc";
        if (bundle == null || euf == null || (bundle.containsKey(str3) && !z)) {
            if (bundle != null && euf == null && z) {
                bundle.remove(str2);
                bundle.remove(str3);
                bundle.remove(str);
            }
            return;
        }
        if (euf.a != null) {
            bundle.putString(str2, euf.a);
        } else {
            bundle.remove(str2);
        }
        bundle.putString(str3, euf.b);
        bundle.putLong(str, euf.c);
    }

    static /* synthetic */ void a(eug eug, euf euf, boolean z) {
        eug.d().a(eug.l().b());
        if (eug.j().a(euf.d, z)) {
            euf.d = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final euf a(Activity activity) {
        bxo.a(activity);
        euf euf = (euf) this.d.get(activity);
        if (euf != null) {
            return euf;
        }
        euf euf2 = new euf(null, a(activity.getClass().getCanonicalName()), o().f());
        this.d.put(activity, euf2);
        return euf2;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(Activity activity, euf euf, boolean z) {
        euf euf2 = this.b == null ? this.c : this.b;
        if (euf.b == null) {
            euf = new euf(euf.a, a(activity.getClass().getCanonicalName()), euf.c);
        }
        this.c = this.b;
        this.b = euf;
        p().a((Runnable) new euh(this, z, euf2, euf));
    }

    public final void a(String str, euf euf) {
        c();
        synchronized (this) {
            if (this.f == null || this.f.equals(str) || euf != null) {
                this.f = str;
                this.e = euf;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqw d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ ett e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ erh f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ euj g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ eug h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ erj i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ evh j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    public final euf v() {
        D();
        c();
        return this.a;
    }
}
