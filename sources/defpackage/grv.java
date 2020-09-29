package defpackage;

/* renamed from: grv reason: default package */
public abstract class grv extends grt {
    public fbd<Integer> e;

    public final int g(int i) {
        gru gru = (gru) this.d.get(f(i));
        Integer num = (Integer) this.e.get();
        if (!(gru instanceof grw)) {
            return num.intValue();
        }
        int d = ((grw) gru).d();
        if (d == 0) {
            d = num.intValue();
        }
        return d;
    }
}
