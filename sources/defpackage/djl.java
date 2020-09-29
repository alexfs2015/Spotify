package defpackage;

import java.util.List;

/* renamed from: djl reason: default package */
public final class djl extends djw {
    private List<Long> d = null;

    public djl(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 31);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        dbr dbr = this.b;
        Long valueOf = Long.valueOf(-1);
        dbr.p = valueOf;
        this.b.q = valueOf;
        if (this.d == null) {
            this.d = (List) this.c.invoke(null, new Object[]{this.a.a()});
        }
        List<Long> list = this.d;
        if (list != null && list.size() == 2) {
            synchronized (this.b) {
                this.b.p = Long.valueOf(((Long) this.d.get(0)).longValue());
                this.b.q = Long.valueOf(((Long) this.d.get(1)).longValue());
            }
        }
    }
}
