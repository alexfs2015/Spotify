package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;

/* renamed from: ert reason: default package */
public final class ert extends evb implements evy {
    private static int a = 65535;
    private static int c = 2;
    private final Map<String, Map<String, String>> d = new dp();
    private final Map<String, Map<String, Boolean>> e = new dp();
    private final Map<String, Map<String, Boolean>> f = new dp();
    private final Map<String, ekc> g = new dp();
    private final Map<String, Map<String, Integer>> h = new dp();
    private final Map<String, String> i = new dp();

    ert(evc evc) {
        super(evc);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    private final void h(String str) {
        j();
        c();
        bwx.a(str);
        if (this.g.get(str) == null) {
            byte[] d2 = h().d(str);
            if (d2 == null) {
                this.d.put(str, null);
                this.e.put(str, null);
                this.f.put(str, null);
                this.g.put(str, null);
                this.i.put(str, null);
                this.h.put(str, null);
                return;
            }
            ekc a2 = a(str, d2);
            this.d.put(str, a(a2));
            a(str, a2);
            this.g.put(str, a2);
            this.i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    public final ekc a(String str) {
        j();
        c();
        bwx.a(str);
        h(str);
        return (ekc) this.g.get(str);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        c();
        return (String) this.i.get(str);
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        c();
        this.i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    public final void d(String str) {
        c();
        this.g.remove(str);
    }

    public final String a(String str, String str2) {
        c();
        h(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    private static Map<String, String> a(ekc ekc) {
        ekd[] ekdArr;
        dp dpVar = new dp();
        if (!(ekc == null || ekc.c == null)) {
            for (ekd ekd : ekc.c) {
                if (ekd != null) {
                    dpVar.put(ekd.a, ekd.b);
                }
            }
        }
        return dpVar;
    }

    private final void a(String str, ekc ekc) {
        ekb[] ekbArr;
        dp dpVar = new dp();
        dp dpVar2 = new dp();
        dp dpVar3 = new dp();
        if (!(ekc == null || ekc.d == null)) {
            for (ekb ekb : ekc.d) {
                if (TextUtils.isEmpty(ekb.a)) {
                    q().f.a("EventConfig contained null event name");
                } else {
                    String a2 = esx.a(ekb.a);
                    if (!TextUtils.isEmpty(a2)) {
                        ekb.a = a2;
                    }
                    dpVar.put(ekb.a, ekb.b);
                    dpVar2.put(ekb.a, ekb.c);
                    if (ekb.d != null) {
                        if (ekb.d.intValue() < c || ekb.d.intValue() > a) {
                            q().f.a("Invalid sampling rate. Event name, sample rate", ekb.a, ekb.d);
                        } else {
                            dpVar3.put(ekb.a, ekb.d);
                        }
                    }
                }
            }
        }
        this.e.put(str, dpVar);
        this.f.put(str, dpVar2);
        this.h.put(str, dpVar3);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        ejw[] ejwArr;
        ejz[] ejzArr;
        ejx[] ejxArr;
        String str3 = str;
        j();
        c();
        bwx.a(str);
        ekc a2 = a(str, bArr);
        a(str3, a2);
        this.g.put(str3, a2);
        this.i.put(str3, str2);
        this.d.put(str3, a(a2));
        evs g2 = g();
        ejv[] ejvArr = a2.e;
        bwx.a(ejvArr);
        for (ejv ejv : ejvArr) {
            for (ejw ejw : ejv.c) {
                String a3 = esx.a(ejw.b);
                if (a3 != null) {
                    ejw.b = a3;
                }
                for (ejx ejx : ejw.c) {
                    String a4 = esy.a(ejx.d);
                    if (a4 != null) {
                        ejx.d = a4;
                    }
                }
            }
            for (ejz ejz : ejv.b) {
                String a5 = esz.a(ejz.b);
                if (a5 != null) {
                    ejz.b = a5;
                }
            }
        }
        g2.h().a(str3, ejvArr);
        try {
            a2.e = null;
            bArr2 = new byte[a2.e()];
            a2.a(ept.a(bArr2, bArr2.length));
        } catch (IOException e2) {
            q().f.a("Unable to serialize reduced-size config. Storing full config instead. appId", eqw.a(str), e2);
            bArr2 = bArr;
        }
        evz h2 = h();
        bwx.a(str);
        h2.c();
        h2.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) h2.w().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                h2.q().c.a("Failed to update remote config (got 0). appId", eqw.a(str));
            }
        } catch (SQLiteException e3) {
            h2.q().c.a("Error storing remote config. appId", eqw.a(str), e3);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(String str, String str2) {
        c();
        h(str);
        if (f(str) && evm.e(str2)) {
            return true;
        }
        if (g(str) && evm.a(str2)) {
            return true;
        }
        Map map = (Map) this.e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(String str, String str2) {
        c();
        h(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final int d(String str, String str2) {
        c();
        h(str);
        Map map = (Map) this.h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    public final long e(String str) {
        String a2 = a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a2)) {
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException e2) {
                q().f.a("Unable to parse timezone offset. appId", eqw.a(str), e2);
            }
        }
        return 0;
    }

    private final ekc a(String str, byte[] bArr) {
        if (bArr == null) {
            return new ekc();
        }
        eps a2 = eps.a(bArr, bArr.length);
        ekc ekc = new ekc();
        try {
            ekc.a(a2);
            q().k.a("Parsed config. version, gmp_app_id", ekc.a, ekc.b);
            return ekc;
        } catch (IOException e2) {
            q().f.a("Unable to merge remote config. appId", eqw.a(str), e2);
            return new ekc();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: 0000 */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ evi f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ evs g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ evz h() {
        return super.h();
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
}
