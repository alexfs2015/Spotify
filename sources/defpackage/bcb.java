package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bcb reason: default package */
public abstract class bcb implements bce {
    private final boolean a;
    private final ArrayList<bcu> b = new ArrayList<>(1);
    private int c;
    private bcg d;

    protected bcb(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        ben.a(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((bcu) this.b.get(i2)).a(this.a, i);
        }
    }

    public final void a(bcu bcu) {
        if (!this.b.contains(bcu)) {
            this.b.add(bcu);
            this.c++;
        }
    }

    public /* synthetic */ Map<String, List<String>> b() {
        return CC.$default$b(this);
    }

    /* access modifiers changed from: protected */
    public final void b(bcg bcg) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void c(bcg bcg) {
        this.d = bcg;
        for (int i = 0; i < this.c; i++) {
            ((bcu) this.b.get(i)).a(this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        ben.a(this.d);
        for (int i = 0; i < this.c; i++) {
            ((bcu) this.b.get(i)).b(this.a);
        }
        this.d = null;
    }
}
