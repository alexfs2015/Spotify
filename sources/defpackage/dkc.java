package defpackage;

import java.util.List;

/* renamed from: dkc reason: default package */
public final class dkc extends dkn {
    private List<Long> d = null;

    public dkc(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 31);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        dci dci = this.b;
        Long valueOf = Long.valueOf(-1);
        dci.p = valueOf;
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
