package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bbk reason: default package */
public abstract class bbk implements bbn {
    private final boolean a;
    private final ArrayList<bcd> b = new ArrayList<>(1);
    private int c;
    private bbp d;

    public /* synthetic */ Map<String, List<String>> b() {
        return CC.$default$b(this);
    }

    protected bbk(boolean z) {
        this.a = z;
    }

    public final void a(bcd bcd) {
        if (!this.b.contains(bcd)) {
            this.b.add(bcd);
            this.c++;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(bbp bbp) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void c(bbp bbp) {
        this.d = bbp;
        for (int i = 0; i < this.c; i++) {
            ((bcd) this.b.get(i)).a(this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        bdw.a(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((bcd) this.b.get(i2)).a(this.a, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        bdw.a(this.d);
        for (int i = 0; i < this.c; i++) {
            ((bcd) this.b.get(i)).b(this.a);
        }
        this.d = null;
    }
}
