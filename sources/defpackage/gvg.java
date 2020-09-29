package defpackage;

/* renamed from: gvg reason: default package */
public final class gvg {
    final gzt a;
    final int b;

    private gvg(gzt gzt, int i) {
        this.a = (gzt) fay.a(gzt);
        this.b = i;
    }

    public static gvg a(gzt gzt, gum gum) {
        fay.a(gzt);
        gzt decorate = gum.g.decorate(gzt);
        return new gvg(decorate, gum.h.resolve(decorate));
    }
}
