package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;

/* renamed from: esk reason: default package */
public final class esk extends evs implements ewp {
    private static int a = 65535;
    private static int c = 2;
    private final Map<String, Map<String, String>> d = new dp();
    private final Map<String, Map<String, Boolean>> e = new dp();
    private final Map<String, Map<String, Boolean>> f = new dp();
    private final Map<String, ekt> g = new dp();
    private final Map<String, Map<String, Integer>> h = new dp();
    private final Map<String, String> i = new dp();

    esk(evt evt) {
        super(evt);
    }

    private final ekt a(String str, byte[] bArr) {
        if (bArr == null) {
            return new ekt();
        }
        eqj a2 = eqj.a(bArr, bArr.length);
        ekt ekt = new ekt();
        try {
            ekt.a(a2);
            q().k.a("Parsed config. version, gmp_app_id", ekt.a, ekt.b);
            return ekt;
        } catch (IOException e2) {
            q().f.a("Unable to merge remote config. appId", ern.a(str), e2);
            return new ekt();
        }
    }

    private static Map<String, String> a(ekt ekt) {
        eku[] ekuArr;
        dp dpVar = new dp();
        if (!(ekt == null || ekt.c == null)) {
            for (eku eku : ekt.c) {
                if (eku != null) {
                    dpVar.put(eku.a, eku.b);
                }
            }
        }
        return dpVar;
    }

    private final void a(String str, ekt ekt) {
        eks[] eksArr;
        dp dpVar = new dp();
        dp dpVar2 = new dp();
        dp dpVar3 = new dp();
        if (!(ekt == null || ekt.d == null)) {
            for (eks eks : ekt.d) {
                if (TextUtils.isEmpty(eks.a)) {
                    q().f.a("EventConfig contained null event name");
                } else {
                    String a2 = eto.a(eks.a);
                    if (!TextUtils.isEmpty(a2)) {
                        eks.a = a2;
                    }
                    dpVar.put(eks.a, eks.b);
                    dpVar2.put(eks.a, eks.c);
                    if (eks.d != null) {
                        if (eks.d.intValue() < c || eks.d.intValue() > a) {
                            q().f.a("Invalid sampling rate. Event name, sample rate", eks.a, eks.d);
                        } else {
                            dpVar3.put(eks.a, eks.d);
                        }
                    }
                }
            }
        }
        this.e.put(str, dpVar);
        this.f.put(str, dpVar2);
        this.h.put(str, dpVar3);
    }

    private final void h(String str) {
        j();
        c();
        bxo.a(str);
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
            ekt a2 = a(str, d2);
            this.d.put(str, a(a2));
            a(str, a2);
            this.g.put(str, a2);
            this.i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    public final ekt a(String str) {
        j();
        c();
        bxo.a(str);
        h(str);
        return (ekt) this.g.get(str);
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

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        ekn[] eknArr;
        ekq[] ekqArr;
        eko[] ekoArr;
        String str3 = str;
        j();
        c();
        bxo.a(str);
        ekt a2 = a(str, bArr);
        a(str3, a2);
        this.g.put(str3, a2);
        this.i.put(str3, str2);
        this.d.put(str3, a(a2));
        ewj g2 = g();
        ekm[] ekmArr = a2.e;
        bxo.a(ekmArr);
        for (ekm ekm : ekmArr) {
            for (ekn ekn : ekm.c) {
                String a3 = eto.a(ekn.b);
                if (a3 != null) {
                    ekn.b = a3;
                }
                for (eko eko : ekn.c) {
                    String a4 = etp.a(eko.d);
                    if (a4 != null) {
                        eko.d = a4;
                    }
                }
            }
            for (ekq ekq : ekm.b) {
                String a5 = etq.a(ekq.b);
                if (a5 != null) {
                    ekq.b = a5;
                }
            }
        }
        g2.h().a(str3, ekmArr);
        try {
            a2.e = null;
            bArr2 = new byte[a2.e()];
            a2.a(eqk.a(bArr2, bArr2.length));
        } catch (IOException e2) {
            q().f.a("Unable to serialize reduced-size config. Storing full config instead. appId", ern.a(str), e2);
            bArr2 = bArr;
        }
        ewq h2 = h();
        bxo.a(str);
        h2.c();
        h2.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) h2.w().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                h2.q().c.a("Failed to update remote config (got 0). appId", ern.a(str));
            }
        } catch (SQLiteException e3) {
            h2.q().c.a("Error storing remote config. appId", ern.a(str), e3);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        c();
        return (String) this.i.get(str);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(String str, String str2) {
        c();
        h(str);
        if (f(str) && ewd.e(str2)) {
            return true;
        }
        if (g(str) && ewd.a(str2)) {
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

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        c();
        this.i.put(str, null);
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
    public final void d(String str) {
        c();
        this.g.remove(str);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final long e(String str) {
        String a2 = a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a2)) {
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException e2) {
                q().f.a("Unable to parse timezone offset. appId", ern.a(str), e2);
            }
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ evz f() {
        return super.f();
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    public final /* bridge */ /* synthetic */ ewj g() {
        return super.g();
    }

    /* access modifiers changed from: 0000 */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ ewq h() {
        return super.h();
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
}
