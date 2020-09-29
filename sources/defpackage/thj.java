package defpackage;

/* renamed from: thj reason: default package */
public final class thj implements ihk, a<Boolean>, a {
    public final thc a;
    public vdn b;
    private final vdl c;
    private final tvm d;
    private boolean e;

    public thj(vdl vdl, thc thc, tvm tvm) {
        this.c = vdl;
        this.a = thc;
        this.d = tvm;
    }

    public final void a() {
        if (this.e) {
            this.c.d();
            this.d.a();
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.b.a(false);
        } else {
            this.b.a(true);
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.b.b(bool.booleanValue());
        this.e = bool.booleanValue();
    }
}
