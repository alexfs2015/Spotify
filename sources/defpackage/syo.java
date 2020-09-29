package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: syo reason: default package */
public class syo implements a, syq, a<Integer> {
    private final jwr a = new jwr((a) jws.a(this, 1));
    private final Set<urx> b = new LinkedHashSet();
    private boolean c;

    public syo(jws jws, syu syu) {
        syu.a((a<T>) this);
        this.c = true;
    }

    public final void a(urx urx) {
        this.b.add(urx);
    }

    /* renamed from: a */
    public void onChanged(Integer num) {
        if (!this.c) {
            this.a.b(num.intValue());
        } else {
            this.a.a(num.intValue());
        }
        this.c = false;
    }

    public final void a(int i) {
        for (urx a2 : this.b) {
            a2.a(i);
        }
    }
}
