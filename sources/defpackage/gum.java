package defpackage;

/* renamed from: gum reason: default package */
public final class gum {
    public final gva a;
    public final gzl b;
    public final guz c;
    public final guk d;
    public final gul e;
    public final gul f;
    public final guo g;
    public final gul h;
    public final gui<?> i;
    public final guw j;

    /* renamed from: gum$a */
    public static class a {
        private gva a = gva.a;
        private gzl b = gzl.a;
        private guo c = defpackage.guo.a.a();
        private gul d = defpackage.gul.a.a();
        private guk e = defpackage.guk.a.a();
        private gul f = defpackage.gul.a.a();
        private gui<?> g;
        private guw h = guw.a;

        public final a a(gva gva) {
            this.a = (gva) fay.a(gva);
            return this;
        }

        @Deprecated
        public final a a(gzl gzl) {
            this.b = (gzl) fay.a(gzl);
            return this;
        }

        public final a a(guk... gukArr) {
            this.e = defpackage.guk.a.a(gukArr);
            return this;
        }

        public final a b(guk... gukArr) {
            return a(this.e, defpackage.guk.a.a(gukArr));
        }

        public final a a(int i, gui<?> gui) {
            return a(defpackage.guk.a.a(i, gui), this.e);
        }

        public final a a(gul gul) {
            this.f = (gul) fay.a(gul);
            return this;
        }

        public final a a(gui<?> gui) {
            this.g = (gui) fay.a(gui);
            return this;
        }

        public final a b(gul gul) {
            this.d = (gul) fay.a(gul);
            return this;
        }

        public final a c(gul gul) {
            return b(defpackage.gul.a.a((gul) fay.a(gul), this.d));
        }

        public final a a(guo guo) {
            this.c = (guo) fay.a(guo);
            return this;
        }

        public final a b(guo guo) {
            return a(defpackage.guo.a.a(this.c, guo));
        }

        public final a a(guw guw) {
            this.h = (guw) fay.a(guw);
            return this;
        }

        public final gum a() {
            gui<?> gui = this.g;
            if (gui != null) {
                gum gum = new gum(this.a, this.b, this.e, this.d, this.f, this.c, gui, this.h, 0);
                return gum;
            }
            throw new IllegalStateException("No fallback binder set!");
        }

        public final a a(int i, String str, gui<?> gui) {
            b(defpackage.guk.a.a(i, gui));
            c(defpackage.gul.a.a(str, i));
            return this;
        }
    }

    /* synthetic */ gum(gva gva, gzl gzl, guk guk, gul gul, gul gul2, guo guo, gui gui, guw guw, byte b2) {
        this(gva, gzl, guk, gul, gul2, guo, gui, guw);
    }

    private gum(gva gva, gzl gzl, guk guk, gul gul, gul gul2, guo guo, gui<?> gui, guw guw) {
        this.a = (gva) fay.a(gva);
        this.c = new guz(gva);
        this.b = (gzl) fay.a(gzl);
        this.d = (guk) fay.a(guk);
        this.f = (gul) fay.a(gul2);
        this.e = (gul) fay.a(gul);
        this.g = (guo) fay.a(guo);
        this.i = (gui) fay.a(gui);
        this.h = defpackage.gul.a.a(this.e, this.f);
        this.j = (guw) fay.a(guw);
    }
}
