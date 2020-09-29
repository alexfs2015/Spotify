package defpackage;

/* renamed from: tek reason: default package */
public final class tek implements a {
    private final jyt a = jyu.a(0, 500, this);
    private gcp<Integer> b;
    private boolean c = true;

    tek(jyu jyu) {
    }

    public final void a(int i) {
        gcp<Integer> gcp = this.b;
        if (gcp != null) {
            gcp.accept(Integer.valueOf(i));
        }
    }

    public final void a(int i, gcp<Integer> gcp) {
        this.b = gcp;
        if (this.c) {
            this.c = false;
            this.a.a(i);
            return;
        }
        this.a.b(i);
    }
}
