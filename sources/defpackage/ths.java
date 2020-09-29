package defpackage;

/* renamed from: ths reason: default package */
public final class ths implements a, a<Long> {
    public final iey a;
    public ifd b;
    private final tju c;
    private boolean d;

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

    public ths(tju tju, iey iey) {
        this.c = tju;
        this.a = iey;
    }

    public final void a() {
        if (!this.d) {
            this.c.a();
        }
    }
}
