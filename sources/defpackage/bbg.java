package defpackage;

/* renamed from: bbg reason: default package */
public final class bbg {
    public final int a;
    public final aqq[] b;
    public final bbe c;
    public final Object d;

    public bbg(aqq[] aqqArr, bbd[] bbdArr, Object obj) {
        this.b = aqqArr;
        this.c = new bbe(bbdArr);
        this.d = obj;
        this.a = aqqArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public final boolean a(bbg bbg) {
        if (bbg == null || bbg.c.a != this.c.a) {
            return false;
        }
        for (int i = 0; i < this.c.a; i++) {
            if (!a(bbg, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(bbg bbg, int i) {
        if (bbg != null && bdw.a((Object) this.b[i], (Object) bbg.b[i]) && bdw.a((Object) this.c.b[i], (Object) bbg.c.b[i])) {
            return true;
        }
        return false;
    }
}
