package defpackage;

/* renamed from: fue reason: default package */
public final class fue implements uua {
    private static uuq<Integer> a = uuq.a(Integer.valueOf(0));
    private static uuq<Integer> b = uuq.a(Integer.valueOf(266));
    private final ftz c;
    private uty d;

    public fue(ftz ftz) {
        this.c = ftz;
    }

    public final void a() {
        float b2 = (float) b();
        uty uty = new uty(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.g().getAlpha(), 0.0f, ftn.c);
        this.d = uty;
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }

    public final void a(float f) {
        this.c.g().setAlpha(this.d.a(f));
    }
}
