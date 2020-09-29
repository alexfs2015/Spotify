package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: btn reason: default package */
final class btn extends btu {
    final /* synthetic */ btk a;
    private final Map<f, btm> b;

    public btn(btk btk, Map<f, btm> map) {
        this.a = btk;
        super(btk, 0);
        this.b = map;
    }

    public final void a() {
        bwp bwp = new bwp(this.a.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (f fVar : this.b.keySet()) {
            if (!((btm) this.b.get(fVar)).a) {
                arrayList.add(fVar);
            } else {
                arrayList2.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                i = bwp.a(this.a.c, (f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList2;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                i = bwp.a(this.a.c, (f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.a.a.a((bug) new bto(this, this.a, new ConnectionResult(i, null)));
            return;
        }
        if (this.a.f) {
            this.a.e.t();
        }
        for (f fVar2 : this.b.keySet()) {
            c cVar = (c) this.b.get(fVar2);
            if (bwp.a(this.a.c, fVar2) != 0) {
                this.a.a.a((bug) new btp(this.a, cVar));
            } else {
                fVar2.a(cVar);
            }
        }
    }
}
