package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@cfp
/* renamed from: dmk reason: default package */
public final class dmk {
    private final Object a = new Object();
    private int b;
    private List<dmj> c = new LinkedList();

    public final dmj a() {
        synchronized (this.a) {
            dmj dmj = null;
            if (this.c.size() == 0) {
                cpn.a(3);
                return null;
            }
            int i = 0;
            if (this.c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (dmj dmj2 : this.c) {
                    int i4 = dmj2.e;
                    if (i4 > i2) {
                        i = i3;
                        dmj = dmj2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.c.remove(i);
                return dmj;
            }
            dmj dmj3 = (dmj) this.c.get(0);
            synchronized (dmj3.a) {
                dmj3.e -= 100;
            }
            return dmj3;
        }
    }

    public final boolean a(dmj dmj) {
        synchronized (this.a) {
            return this.c.contains(dmj);
        }
    }

    public final boolean b(dmj dmj) {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                dmj dmj2 = (dmj) it.next();
                if (!((Boolean) dqe.f().a(dtg.W)).booleanValue() || bkc.i().g().d()) {
                    if (((Boolean) dqe.f().a(dtg.Y)).booleanValue() && !bkc.i().g().f() && dmj != dmj2 && dmj2.h.equals(dmj.h)) {
                        it.remove();
                        return true;
                    }
                } else if (dmj != dmj2 && dmj2.f.equals(dmj.f)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(dmj dmj) {
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                int size = this.c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                sb.toString();
                cpn.a(3);
                this.c.remove(0);
            }
            int i = this.b;
            this.b = i + 1;
            dmj.c = i;
            this.c.add(dmj);
        }
    }
}
