package defpackage;

/* renamed from: tsk reason: default package */
public final class tsk implements a, a<Long> {
    public final ihl a;
    public ihq b;
    private final tvm c;
    private boolean d;

    public tsk(tvm tvm, ihl ihl) {
        this.c = tvm;
        this.a = ihl;
    }

    public final void a() {
        if (!this.d) {
            this.c.a();
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Long l = (Long) obj;
        this.d = l.longValue() > 0;
        if (this.d) {
            this.b.a(l.longValue());
            this.b.e();
            return;
        }
        this.b.c();
        this.b.f();
    }
}
