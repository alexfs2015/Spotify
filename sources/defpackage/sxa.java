package defpackage;

/* renamed from: sxa reason: default package */
public final class sxa implements a<Long> {
    public final iey a;
    public iex b;
    public ifd c;
    private boolean d;

    public final /* synthetic */ void onChanged(Object obj) {
        Long l = (Long) obj;
        this.d = l.longValue() > 0;
        this.b.a(this.d);
        if (this.d) {
            this.c.a(l.longValue());
        } else {
            this.c.d();
        }
    }

    public sxa(iey iey) {
        this.a = iey;
    }
}
