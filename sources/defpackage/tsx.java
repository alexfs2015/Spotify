package defpackage;

/* renamed from: tsx reason: default package */
public final class tsx extends a {
    public uys[] a = new uys[0];
    public uys[] b = new uys[0];
    private final uyt c;

    public tsx(uyt uyt) {
        this.c = uyt;
    }

    public final int a() {
        return this.b.length;
    }

    public final int b() {
        return this.a.length;
    }

    public final boolean a(int i, int i2) {
        uys uys = this.b[i];
        uys uys2 = this.a[i2];
        if (uys.isHeader()) {
            return uys.getHeader().equals(uys2.getHeader());
        }
        return uys.getUri().equals(uys2.getUri());
    }

    public final boolean b(int i, int i2) {
        uys uys = this.b[i];
        uys uys2 = this.a[i2];
        if (uys.isHeader()) {
            return uys.getHeader().equals(uys2.getHeader());
        }
        return this.c.a(uys, uys2);
    }
}
