package defpackage;

/* renamed from: fuy reason: default package */
public final class fuy implements vfr {
    private static vgh<Integer> a = vgh.a(Integer.valueOf(0));
    private static vgh<Integer> b = vgh.a(Integer.valueOf(266));
    private final fut c;
    private vfp d;

    public fuy(fut fut) {
        this.c = fut;
    }

    public final void a() {
        float b2 = (float) b();
        vfp vfp = new vfp(((float) ((Integer) a.a()).intValue()) / b2, ((float) ((Integer) b.a()).intValue()) / b2, this.c.g().getAlpha(), 0.0f, fuh.c);
        this.d = vfp;
    }

    public final void a(float f) {
        this.c.g().setAlpha(this.d.a(f));
    }

    public final int b() {
        return ((Integer) a.a()).intValue() + ((Integer) b.a()).intValue();
    }
}
