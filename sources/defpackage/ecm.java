package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cey
/* renamed from: ecm reason: default package */
public final class ecm implements ebx {
    private final cfu a;
    private final ecp b;
    private final Context c;
    private final Object d = new Object();
    private final ebz e;
    private final boolean f;
    private final long g;
    private final long h;
    private final dtc i;
    private final boolean j;
    private final String k;
    private boolean l = false;
    private ecd m;
    private List<ecg> n = new ArrayList();
    private final boolean o;

    public ecm(Context context, cfu cfu, ecp ecp, ebz ebz, boolean z, boolean z2, String str, long j2, long j3, dtc dtc, boolean z3) {
        this.c = context;
        this.a = cfu;
        this.b = ecp;
        this.e = ebz;
        this.f = z;
        this.j = z2;
        this.k = str;
        this.g = j2;
        this.h = j3;
        this.i = dtc;
        this.o = z3;
    }

    public final void a() {
        synchronized (this.d) {
            this.l = true;
            if (this.m != null) {
                this.m.a();
            }
        }
    }

    public final List<ecg> b() {
        return this.n;
    }

    public final ecg a(List<eby> list) {
        Object obj;
        ecg ecg;
        cow.a(3);
        ArrayList arrayList = new ArrayList();
        dta a2 = this.i.a();
        dpc dpc = this.a.d;
        int[] iArr = new int[2];
        if (dpc.g != null) {
            bjl.x();
            if (eci.a(this.k, iArr)) {
                int i2 = iArr[0];
                int i3 = iArr[1];
                dpc[] dpcArr = dpc.g;
                int length = dpcArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    dpc dpc2 = dpcArr[i4];
                    if (i2 == dpc2.e && i3 == dpc2.b) {
                        dpc = dpc2;
                        break;
                    }
                    i4++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eby eby = (eby) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(eby.b);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(4);
            Iterator it2 = eby.c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                dta a3 = this.i.a();
                Object obj2 = this.d;
                synchronized (obj2) {
                    try {
                        if (this.l) {
                            ecg = new ecg(-1);
                        } else {
                            Context context = this.c;
                            ecp ecp = this.b;
                            ebz ebz = this.e;
                            doy doy = this.a.c;
                            coy coy = this.a.k;
                            Iterator it3 = it;
                            boolean z = this.f;
                            Iterator it4 = it2;
                            boolean z2 = this.j;
                            ecp ecp2 = ecp;
                            dup dup = this.a.y;
                            List<String> list2 = this.a.n;
                            dta dta = a2;
                            List<String> list3 = this.a.X;
                            r12 = r12;
                            dta dta2 = a3;
                            ecd ecd = r12;
                            obj = obj2;
                            try {
                                ecd ecd2 = new ecd(context, str2, ecp2, ebz, eby, doy, dpc, coy, z, z2, dup, list2, this.a.z, list3, this.o);
                                this.m = ecd;
                                ecg a4 = this.m.a(this.g, this.h);
                                this.n.add(a4);
                                if (a4.a == 0) {
                                    cow.a(3);
                                    this.i.a("mediation_network_succeed", str2);
                                    if (!arrayList.isEmpty()) {
                                        this.i.a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                    }
                                    this.i.a(dta2, "mls");
                                    this.i.a(dta, "ttm");
                                    return a4;
                                }
                                dta dta3 = dta;
                                dta dta4 = dta2;
                                arrayList.add(str2);
                                this.i.a(dta4, "mlf");
                                if (a4.c != null) {
                                    cmd.a.post(new ecn(a4));
                                }
                                it = it3;
                                a2 = dta3;
                                it2 = it4;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                }
                return ecg;
            }
            dta dta5 = a2;
        }
        if (!arrayList.isEmpty()) {
            this.i.a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new ecg(1);
    }
}
