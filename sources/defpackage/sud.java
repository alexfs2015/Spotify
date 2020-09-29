package defpackage;

/* renamed from: sud reason: default package */
public final class sud implements a {
    private final jwr a = jws.a(0, 500, this);
    private gbr<Integer> b;
    private boolean c = true;

    sud(jws jws) {
    }

    public final void a(int i) {
        gbr<Integer> gbr = this.b;
        if (gbr != null) {
            gbr.accept(Integer.valueOf(i));
        }
    }

    public final void a(int i, gbr<Integer> gbr) {
        this.b = gbr;
        if (this.c) {
            this.c = false;
            this.a.a(i);
            return;
        }
        this.a.b(i);
    }
}
