package defpackage;

import java.util.PriorityQueue;

/* renamed from: bed reason: default package */
public final class bed {
    public final Object a;
    public final PriorityQueue<Integer> b;
    public int c;

    public final void a(int i) {
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(0));
            this.c = this.b.isEmpty() ? Integer.MIN_VALUE : ((Integer) ben.a(this.b.peek())).intValue();
            this.a.notifyAll();
        }
    }
}
