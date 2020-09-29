package defpackage;

import defpackage.bou;

/* renamed from: bql reason: default package */
public final class bql<T extends bou> extends brh {
    private final bow<T> a;
    private final Class<T> b;

    public bql(bow<T> bow, Class<T> cls) {
        this.a = bow;
        this.b = cls;
    }

    public final cbi a() {
        return cbj.a(this.a);
    }

    public final void a(cbi cbi) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.a((bou) this.b.cast(bou));
            }
        }
    }

    public final void a(cbi cbi, int i) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.a((bou) this.b.cast(bou), i);
            }
        }
    }

    public final void a(cbi cbi, String str) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.a((bou) this.b.cast(bou), str);
            }
        }
    }

    public final void a(cbi cbi, boolean z) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.a((bou) this.b.cast(bou), z);
            }
        }
    }

    public final void b(cbi cbi) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.b((bou) this.b.cast(bou));
            }
        }
    }

    public final void b(cbi cbi, int i) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.b((bou) this.b.cast(bou), i);
            }
        }
    }

    public final void b(cbi cbi, String str) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.b((bou) this.b.cast(bou), str);
            }
        }
    }

    public final void c(cbi cbi, int i) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.c((bou) this.b.cast(bou), i);
            }
        }
    }

    public final void d(cbi cbi, int i) {
        bou bou = (bou) cbj.a(cbi);
        if (this.b.isInstance(bou)) {
            bow<T> bow = this.a;
            if (bow != null) {
                bow.d((bou) this.b.cast(bou), i);
            }
        }
    }
}
