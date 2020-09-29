package defpackage;

/* renamed from: ado reason: default package */
public final class ado extends adb implements aez {
    private afd[] c;

    public ado(acc acc, acd acd) {
        super(acc, acd);
        this.a.b("InternalListScreen(mIdent=%s, this=%s, parent=%s, l=%s)", this.b, this, acc, acd);
    }

    public final afd a(int i) {
        this.a.b("getList(%d) mLists=%s", Integer.valueOf(i), this.c);
        afd[] afdArr = this.c;
        if (afdArr == null || i < 0 || i >= afdArr.length) {
            this.a.b("getList(%d) -> null", Integer.valueOf(i));
            return null;
        }
        this.a.b("getList(%d) -> %s", Integer.valueOf(i), this.c[i]);
        return this.c[i];
    }

    public final void b(int i) {
        this.a.b("setNumberOfLists(%d)", Integer.valueOf(1));
        this.c = new adp[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.c[0] = new adp(String.format("%s:%d", new Object[]{this.b, Integer.valueOf(0)}));
            ((adn) this.c[0]).a(true);
        }
        this.a.b("setNumberOfLists() initalized list", new Object[0]);
    }
}
