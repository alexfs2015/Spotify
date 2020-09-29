package defpackage;

/* renamed from: bbx reason: default package */
public final class bbx {
    public final int a;
    public final arh[] b;
    public final bbv c;
    public final Object d;

    public bbx(arh[] arhArr, bbu[] bbuArr, Object obj) {
        this.b = arhArr;
        this.c = new bbv(bbuArr);
        this.d = obj;
        this.a = arhArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public final boolean a(bbx bbx) {
        if (bbx == null || bbx.c.a != this.c.a) {
            return false;
        }
        for (int i = 0; i < this.c.a; i++) {
            if (!a(bbx, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(bbx bbx, int i) {
        return bbx != null && ben.a((Object) this.b[i], (Object) bbx.b[i]) && ben.a((Object) this.c.b[i], (Object) bbx.c.b[i]);
    }
}
