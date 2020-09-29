package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: tiv reason: default package */
public class tiv implements a, tix, a<Integer> {
    private final jyt a = new jyt((a) jyu.a(this, 1));
    private final Set<vdc> b = new LinkedHashSet();
    private boolean c;

    public tiv(jyu jyu, tjb tjb) {
        tjb.a((a<T>) this);
        this.c = true;
    }

    public final void a(int i) {
        for (vdc a2 : this.b) {
            a2.a(i);
        }
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

    public final void a(vdc vdc) {
        this.b.add(vdc);
    }
}
