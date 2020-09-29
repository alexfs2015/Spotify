package defpackage;

/* renamed from: thh reason: default package */
public final class thh implements a<Long> {
    public final ihl a;
    public ihk b;
    public ihq c;
    private boolean d;

    public thh(ihl ihl) {
        this.a = ihl;
    }

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
}
