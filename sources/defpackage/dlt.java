package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@cey
/* renamed from: dlt reason: default package */
public final class dlt {
    private final Object a = new Object();
    private int b;
    private List<dls> c = new LinkedList();

    public final boolean a(dls dls) {
        synchronized (this.a) {
            return this.c.contains(dls);
        }
    }

    public final dls a() {
        synchronized (this.a) {
            dls dls = null;
            if (this.c.size() == 0) {
                cow.a(3);
                return null;
            }
            int i = 0;
            if (this.c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (dls dls2 : this.c) {
                    int i4 = dls2.e;
                    if (i4 > i2) {
                        i = i3;
                        dls = dls2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.c.remove(i);
                return dls;
            }
            dls dls3 = (dls) this.c.get(0);
            synchronized (dls3.a) {
                dls3.e -= 100;
            }
            return dls3;
        }
    }

    public final boolean b(dls dls) {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                dls dls2 = (dls) it.next();
                if (!((Boolean) dpn.f().a(dsp.W)).booleanValue() || bjl.i().g().d()) {
                    if (((Boolean) dpn.f().a(dsp.Y)).booleanValue() && !bjl.i().g().f() && dls != dls2 && dls2.h.equals(dls.h)) {
                        it.remove();
                        return true;
                    }
                } else if (dls != dls2 && dls2.f.equals(dls.f)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(dls dls) {
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                int size = this.c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                sb.toString();
                cow.a(3);
                this.c.remove(0);
            }
            int i = this.b;
            this.b = i + 1;
            dls.c = i;
            this.c.add(dls);
        }
    }
}
