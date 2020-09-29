package defpackage;

/* renamed from: mbu reason: default package */
public final class mbu extends itd {
    public mbx a;
    private final boolean b;

    public mbu(boolean z) {
        this.b = z;
    }

    public final int a() {
        return 8;
    }

    public final void a(int i, int i2) {
        mbx mbx = this.a;
        if (mbx != null) {
            mbx.onLoadMore();
        }
    }

    public final boolean b() {
        return this.b;
    }
}
