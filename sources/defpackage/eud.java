package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzft.a;
import com.google.android.gms.internal.measurement.zzft.zzb;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: eud reason: default package */
final class eud extends evs {
    public eud(evt evt) {
        super(evt);
    }

    private static String e() {
        throw new SecurityException("This implementation should not be used.");
    }

    public final byte[] a(erb erb, String str) {
        ela ela;
        Bundle bundle;
        ewg ewg;
        ekz ekz;
        eqx eqx;
        long j;
        ewc ewc;
        erb erb2 = erb;
        String str2 = str;
        String str3 = "_r";
        c();
        this.r.r();
        bxo.a(erb);
        bxo.a(str);
        if (!s().c(str2, erd.an)) {
            q().j.a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(erb2.a)) {
            if (!"_iapx".equals(erb2.a)) {
                q().j.a("Generating a payload for this event is not available. package_name, event_name", str2, erb2.a);
                return null;
            }
        }
        ekz ekz2 = new ekz();
        h().e();
        try {
            ewg b = h().b(str2);
            if (b == null) {
                q().j.a("Log and bundle not available. package_name", str2);
                return new byte[0];
            } else if (!b.n()) {
                q().j.a("Log and bundle disabled. package_name", str2);
                byte[] bArr = new byte[0];
                h().v();
                return bArr;
            } else {
                ela ela2 = new ela();
                ekz2.a = new ela[]{ela2};
                ela2.a = Integer.valueOf(1);
                ela2.i = "android";
                ela2.o = b.a();
                ela2.n = b.k();
                ela2.p = b.i();
                long j2 = b.j();
                ela2.C = j2 == -2147483648L ? null : Integer.valueOf((int) j2);
                ela2.q = Long.valueOf(b.l());
                ela2.y = b.c();
                if (TextUtils.isEmpty(ela2.y)) {
                    ela2.I = b.d();
                }
                ela2.v = Long.valueOf(b.m());
                if (this.r.o() && ewn.j() && s().c(ela2.o)) {
                    ela2.G = null;
                }
                Pair a = r().a(b.a());
                if (b.u() && !TextUtils.isEmpty((CharSequence) a.first)) {
                    Object obj = a.first;
                    Long.toString(erb2.d);
                    ela2.s = e();
                    ela2.t = (Boolean) a.second;
                }
                k().w();
                ela2.k = Build.MODEL;
                k().w();
                ela2.j = VERSION.RELEASE;
                ela2.m = Integer.valueOf((int) k().f());
                ela2.l = k().g();
                try {
                    b.b();
                    Long.toString(erb2.d);
                    ela2.u = e();
                    ela2.B = b.f();
                    String str4 = ela2.o;
                    List a2 = h().a(str4);
                    if (s().d(str2)) {
                        Iterator it = a2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                ewc = null;
                                break;
                            }
                            ewc = (ewc) it.next();
                            if ("_lte".equals(ewc.c)) {
                                break;
                            }
                        }
                        if (ewc == null || ewc.e == null) {
                            ewc ewc2 = new ewc(str4, "auto", "_lte", l().a(), Long.valueOf(0));
                            a2.add(ewc2);
                            h().a(ewc2);
                        }
                    }
                    eld[] eldArr = new eld[a2.size()];
                    for (int i = 0; i < a2.size(); i++) {
                        eld eld = new eld();
                        eldArr[i] = eld;
                        eld.b = ((ewc) a2.get(i)).c;
                        eld.a = Long.valueOf(((ewc) a2.get(i)).d);
                        f().a(eld, ((ewc) a2.get(i)).e);
                    }
                    ela2.c = eldArr;
                    Bundle a3 = erb2.b.a();
                    a3.putLong("_c", 1);
                    q().j.a("Marking in-app purchase as real-time");
                    a3.putLong(str3, 1);
                    a3.putString("_o", erb2.c);
                    if (o().f(ela2.o)) {
                        o().a(a3, "_dbg", (Object) Long.valueOf(1));
                        o().a(a3, str3, (Object) Long.valueOf(1));
                    }
                    eqx a4 = h().a(str2, erb2.a);
                    if (a4 == null) {
                        bundle = a3;
                        ela = ela2;
                        ekz = ekz2;
                        ewg = b;
                        eqx eqx2 = new eqx(str, erb2.a, 0, 0, erb2.d, 0, null, null, null, null);
                        eqx = eqx2;
                        j = 0;
                    } else {
                        bundle = a3;
                        ela = ela2;
                        ekz = ekz2;
                        ewg = b;
                        j = a4.e;
                        eqx = a4.a(erb2.d);
                    }
                    h().a(eqx);
                    ewy ewy = new ewy(this.r, erb2.c, str, erb2.a, erb2.d, j, bundle);
                    ekx ekx = new ekx();
                    int i2 = 0;
                    ela ela3 = ela;
                    ela3.b = new ekx[]{ekx};
                    ekx.c = Long.valueOf(ewy.c);
                    ekx.b = ewy.b;
                    ekx.d = Long.valueOf(ewy.d);
                    ekx.a = new eky[ewy.e.a.size()];
                    Iterator it2 = ewy.e.iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        eky eky = new eky();
                        int i3 = i2 + 1;
                        ekx.a[i2] = eky;
                        eky.a = str5;
                        f().a(eky, ewy.e.a(str5));
                        i2 = i3;
                    }
                    ela3.J = (zzb) ((enn) zzb.a().a((a) ((enn) a.a().a(eqx.c).a(erb2.a).d())).d());
                    ela3.A = g().a(ewg.a(), (ekx[]) null, ela3.c);
                    ela3.e = ekx.c;
                    ela3.f = ekx.c;
                    long h = ewg.h();
                    ela3.h = h != 0 ? Long.valueOf(h) : null;
                    long g = ewg.g();
                    if (g != 0) {
                        h = g;
                    }
                    ela3.g = h != 0 ? Long.valueOf(h) : null;
                    ewg.r();
                    ela3.w = Integer.valueOf((int) ewg.o());
                    ela3.r = Long.valueOf(14700);
                    ela3.d = Long.valueOf(l().a());
                    ela3.z = Boolean.TRUE;
                    ewg ewg2 = ewg;
                    ewg2.a(ela3.e.longValue());
                    ewg2.b(ela3.f.longValue());
                    h().a(ewg2);
                    h().u();
                    h().v();
                    try {
                        byte[] bArr2 = new byte[ekz.e()];
                        eqk a5 = eqk.a(bArr2, bArr2.length);
                        ekz.a(a5);
                        a5.a();
                        return f().b(bArr2);
                    } catch (IOException e) {
                        q().c.a("Data loss. Failed to bundle and serialize. appId", ern.a(str), e);
                        return null;
                    }
                } catch (SecurityException e2) {
                    q().j.a("app instance id encryption failed", e2.getMessage());
                    byte[] bArr3 = new byte[0];
                    h().v();
                    return bArr3;
                }
            }
        } catch (SecurityException e3) {
            q().j.a("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            h().v();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }
}
