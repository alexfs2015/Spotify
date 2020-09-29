package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cfp
/* renamed from: edd reason: default package */
public final class edd implements eco {
    private final cgl a;
    private final edg b;
    private final Context c;
    private final Object d = new Object();
    private final ecq e;
    private final boolean f;
    private final long g;
    private final long h;
    private final dtt i;
    private final boolean j;
    private final String k;
    private boolean l = false;
    private ecu m;
    private List<ecx> n = new ArrayList();
    private final boolean o;

    public edd(Context context, cgl cgl, edg edg, ecq ecq, boolean z, boolean z2, String str, long j2, long j3, dtt dtt, boolean z3) {
        this.c = context;
        this.a = cgl;
        this.b = edg;
        this.e = ecq;
        this.f = z;
        this.j = z2;
        this.k = str;
        this.g = j2;
        this.h = j3;
        this.i = dtt;
        this.o = z3;
    }

    public final ecx a(List<ecp> list) {
        Object obj;
        ecx ecx;
        cpn.a(3);
        ArrayList arrayList = new ArrayList();
        dtr a2 = this.i.a();
        dpt dpt = this.a.d;
        int[] iArr = new int[2];
        if (dpt.g != null) {
            bkc.x();
            if (ecz.a(this.k, iArr)) {
                int i2 = iArr[0];
                int i3 = iArr[1];
                dpt[] dptArr = dpt.g;
                int length = dptArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    dpt dpt2 = dptArr[i4];
                    if (i2 == dpt2.e && i3 == dpt2.b) {
                        dpt = dpt2;
                        break;
                    }
                    i4++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ecp ecp = (ecp) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(ecp.b);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(4);
            Iterator it2 = ecp.c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                dtr a3 = this.i.a();
                Object obj2 = this.d;
                synchronized (obj2) {
                    try {
                        if (this.l) {
                            ecx = new ecx(-1);
                        } else {
                            Context context = this.c;
                            edg edg = this.b;
                            ecq ecq = this.e;
                            dpp dpp = this.a.c;
                            cpp cpp = this.a.k;
                            Iterator it3 = it;
                            boolean z = this.f;
                            Iterator it4 = it2;
                            boolean z2 = this.j;
                            edg edg2 = edg;
                            dvg dvg = this.a.y;
                            List<String> list2 = this.a.n;
                            dtr dtr = a2;
                            List<String> list3 = this.a.X;
                            r12 = r12;
                            dtr dtr2 = a3;
                            ecu ecu = r12;
                            obj = obj2;
                            try {
                                ecu ecu2 = new ecu(context, str2, edg2, ecq, ecp, dpp, dpt, cpp, z, z2, dvg, list2, this.a.z, list3, this.o);
                                this.m = ecu;
                                ecx a4 = this.m.a(this.g, this.h);
                                this.n.add(a4);
                                if (a4.a == 0) {
                                    cpn.a(3);
                                    this.i.a("mediation_network_succeed", str2);
                                    if (!arrayList.isEmpty()) {
                                        this.i.a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                    }
                                    this.i.a(dtr2, "mls");
                                    this.i.a(dtr, "ttm");
                                    return a4;
                                }
                                dtr dtr3 = dtr;
                                dtr dtr4 = dtr2;
                                arrayList.add(str2);
                                this.i.a(dtr4, "mlf");
                                if (a4.c != null) {
                                    cmu.a.post(new ede(a4));
                                }
                                it = it3;
                                a2 = dtr3;
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
                return ecx;
            }
            dtr dtr5 = a2;
        }
        if (!arrayList.isEmpty()) {
            this.i.a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new ecx(1);
    }

    public final void a() {
        synchronized (this.d) {
            this.l = true;
            if (this.m != null) {
                this.m.a();
            }
        }
    }

    public final List<ecx> b() {
        return this.n;
    }
}
