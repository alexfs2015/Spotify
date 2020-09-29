package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

@cfp
/* renamed from: dzr reason: default package */
final class dzr {
    final LinkedList<dzs> a = new LinkedList<>();
    dpp b;
    final String c;
    final int d;
    boolean e;

    dzr(dpp dpp, String str, int i) {
        bxo.a(dpp);
        bxo.a(str);
        this.b = dpp;
        this.c = str;
        this.d = i;
    }

    /* access modifiers changed from: 0000 */
    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((dzs) it.next()).e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public final dzs a(dpp dpp) {
        if (dpp != null) {
            this.b = dpp;
        }
        return (dzs) this.a.remove();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(dyk dyk) {
        dzs dzs = new dzs(this, dyk);
        this.a.add(dzs);
        return dzs.a();
    }

    /* access modifiers changed from: 0000 */
    public final int b() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((dzs) it.next()).a()) {
                i++;
            }
        }
        return i;
    }
}
