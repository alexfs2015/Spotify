package defpackage;

/* renamed from: aec reason: default package */
public final class aec extends adp implements afn {
    private afr[] c;

    public aec(acq acq, acr acr) {
        super(acq, acr);
        this.a.b("InternalListScreen(mIdent=%s, this=%s, parent=%s, l=%s)", this.b, this, acq, acr);
    }

    public final afr a(int i) {
        this.a.b("getList(%d) mLists=%s", Integer.valueOf(i), this.c);
        afr[] afrArr = this.c;
        if (afrArr == null || i < 0 || i >= afrArr.length) {
            this.a.b("getList(%d) -> null", Integer.valueOf(i));
            return null;
        }
        this.a.b("getList(%d) -> %s", Integer.valueOf(i), this.c[i]);
        return this.c[i];
    }

    public final void b(int i) {
        this.a.b("setNumberOfLists(%d)", Integer.valueOf(1));
        this.c = new aed[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.c[0] = new aed(String.format("%s:%d", new Object[]{this.b, Integer.valueOf(0)}));
            ((aeb) this.c[0]).a(true);
        }
        this.a.b("setNumberOfLists() initalized list", new Object[0]);
    }
}
