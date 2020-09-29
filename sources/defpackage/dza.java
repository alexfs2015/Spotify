package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

@cey
/* renamed from: dza reason: default package */
final class dza {
    final LinkedList<dzb> a = new LinkedList<>();
    doy b;
    final String c;
    final int d;
    boolean e;

    dza(doy doy, String str, int i) {
        bwx.a(doy);
        bwx.a(str);
        this.b = doy;
        this.c = str;
        this.d = i;
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((dzb) it.next()).e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final dzb a(doy doy) {
        if (doy != null) {
            this.b = doy;
        }
        return (dzb) this.a.remove();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(dxt dxt) {
        dzb dzb = new dzb(this, dxt);
        this.a.add(dzb);
        return dzb.a();
    }

    /* access modifiers changed from: 0000 */
    public final int b() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((dzb) it.next()).a()) {
                i++;
            }
        }
        return i;
    }
}
