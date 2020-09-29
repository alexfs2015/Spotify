package defpackage;

/* renamed from: gtx reason: default package */
public abstract class gtx extends gtv {
    public fbu<Integer> e;

    public final int g(int i) {
        gtw gtw = (gtw) this.d.get(f(i));
        Integer num = (Integer) this.e.get();
        if (!(gtw instanceof gty)) {
            return num.intValue();
        }
        int d = ((gty) gtw).d();
        if (d == 0) {
            d = num.intValue();
        }
        return d;
    }
}
