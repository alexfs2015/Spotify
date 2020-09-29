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

/* renamed from: etm reason: default package */
final class etm extends evb {
    public etm(evc evc) {
        super(evc);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    public final byte[] a(eqk eqk, String str) {
        Integer num;
        ekj ekj;
        Bundle bundle;
        evp evp;
        eki eki;
        eqg eqg;
        long j;
        evl evl;
        eqk eqk2 = eqk;
        String str2 = str;
        String str3 = "_r";
        c();
        this.r.r();
        bwx.a(eqk);
        bwx.a(str);
        if (!s().c(str2, eqm.an)) {
            q().j.a("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(eqk2.a)) {
            if (!"_iapx".equals(eqk2.a)) {
                q().j.a("Generating a payload for this event is not available. package_name, event_name", str2, eqk2.a);
                return null;
            }
        }
        eki eki2 = new eki();
        h().e();
        try {
            evp b = h().b(str2);
            if (b == null) {
                q().j.a("Log and bundle not available. package_name", str2);
                return new byte[0];
            } else if (!b.n()) {
                q().j.a("Log and bundle disabled. package_name", str2);
                byte[] bArr = new byte[0];
                h().v();
                return bArr;
            } else {
                ekj ekj2 = new ekj();
                eki2.a = new ekj[]{ekj2};
                ekj2.a = Integer.valueOf(1);
                ekj2.i = "android";
                ekj2.o = b.a();
                ekj2.n = b.k();
                ekj2.p = b.i();
                long j2 = b.j();
                if (j2 == -2147483648L) {
                    num = null;
                } else {
                    num = Integer.valueOf((int) j2);
                }
                ekj2.C = num;
                ekj2.q = Long.valueOf(b.l());
                ekj2.y = b.c();
                if (TextUtils.isEmpty(ekj2.y)) {
                    ekj2.I = b.d();
                }
                ekj2.v = Long.valueOf(b.m());
                if (this.r.o() && evw.j() && s().c(ekj2.o)) {
                    ekj2.G = null;
                }
                Pair a = r().a(b.a());
                if (b.u() && !TextUtils.isEmpty((CharSequence) a.first)) {
                    Object obj = a.first;
                    Long.toString(eqk2.d);
                    ekj2.s = e();
                    ekj2.t = (Boolean) a.second;
                }
                k().w();
                ekj2.k = Build.MODEL;
                k().w();
                ekj2.j = VERSION.RELEASE;
                ekj2.m = Integer.valueOf((int) k().f());
                ekj2.l = k().g();
                try {
                    b.b();
                    Long.toString(eqk2.d);
                    ekj2.u = e();
                    ekj2.B = b.f();
                    String str4 = ekj2.o;
                    List a2 = h().a(str4);
                    if (s().d(str2)) {
                        Iterator it = a2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                evl = null;
                                break;
                            }
                            evl = (evl) it.next();
                            if ("_lte".equals(evl.c)) {
                                break;
                            }
                        }
                        if (evl == null || evl.e == null) {
                            evl evl2 = new evl(str4, "auto", "_lte", l().a(), Long.valueOf(0));
                            a2.add(evl2);
                            h().a(evl2);
                        }
                    }
                    ekm[] ekmArr = new ekm[a2.size()];
                    for (int i = 0; i < a2.size(); i++) {
                        ekm ekm = new ekm();
                        ekmArr[i] = ekm;
                        ekm.b = ((evl) a2.get(i)).c;
                        ekm.a = Long.valueOf(((evl) a2.get(i)).d);
                        f().a(ekm, ((evl) a2.get(i)).e);
                    }
                    ekj2.c = ekmArr;
                    Bundle a3 = eqk2.b.a();
                    a3.putLong("_c", 1);
                    q().j.a("Marking in-app purchase as real-time");
                    a3.putLong(str3, 1);
                    a3.putString("_o", eqk2.c);
                    if (o().f(ekj2.o)) {
                        o().a(a3, "_dbg", (Object) Long.valueOf(1));
                        o().a(a3, str3, (Object) Long.valueOf(1));
                    }
                    eqg a4 = h().a(str2, eqk2.a);
                    if (a4 == null) {
                        bundle = a3;
                        ekj = ekj2;
                        eki = eki2;
                        evp = b;
                        eqg eqg2 = new eqg(str, eqk2.a, 0, 0, eqk2.d, 0, null, null, null, null);
                        eqg = eqg2;
                        j = 0;
                    } else {
                        bundle = a3;
                        ekj = ekj2;
                        eki = eki2;
                        evp = b;
                        j = a4.e;
                        eqg = a4.a(eqk2.d);
                    }
                    h().a(eqg);
                    ewh ewh = new ewh(this.r, eqk2.c, str, eqk2.a, eqk2.d, j, bundle);
                    ekg ekg = new ekg();
                    int i2 = 0;
                    ekj ekj3 = ekj;
                    ekj3.b = new ekg[]{ekg};
                    ekg.c = Long.valueOf(ewh.c);
                    ekg.b = ewh.b;
                    ekg.d = Long.valueOf(ewh.d);
                    ekg.a = new ekh[ewh.e.a.size()];
                    Iterator it2 = ewh.e.iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        ekh ekh = new ekh();
                        int i3 = i2 + 1;
                        ekg.a[i2] = ekh;
                        ekh.a = str5;
                        f().a(ekh, ewh.e.a(str5));
                        i2 = i3;
                    }
                    ekj3.J = (zzb) ((emw) zzb.a().a((a) ((emw) a.a().a(eqg.c).a(eqk2.a).d())).d());
                    ekj3.A = g().a(evp.a(), (ekg[]) null, ekj3.c);
                    ekj3.e = ekg.c;
                    ekj3.f = ekg.c;
                    long h = evp.h();
                    ekj3.h = h != 0 ? Long.valueOf(h) : null;
                    long g = evp.g();
                    if (g != 0) {
                        h = g;
                    }
                    ekj3.g = h != 0 ? Long.valueOf(h) : null;
                    evp.r();
                    ekj3.w = Integer.valueOf((int) evp.o());
                    ekj3.r = Long.valueOf(14700);
                    ekj3.d = Long.valueOf(l().a());
                    ekj3.z = Boolean.TRUE;
                    evp evp2 = evp;
                    evp2.a(ekj3.e.longValue());
                    evp2.b(ekj3.f.longValue());
                    h().a(evp2);
                    h().u();
                    h().v();
                    try {
                        byte[] bArr2 = new byte[eki.e()];
                        ept a5 = ept.a(bArr2, bArr2.length);
                        eki.a(a5);
                        a5.a();
                        return f().b(bArr2);
                    } catch (IOException e) {
                        q().c.a("Data loss. Failed to bundle and serialize. appId", eqw.a(str), e);
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

    private static String e() {
        throw new SecurityException("This implementation should not be used.");
    }
}
