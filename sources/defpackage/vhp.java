package defpackage;

/* renamed from: vhp reason: default package */
public final class vhp {
    public boolean a;
    public byte b = 0;
    public int c;
    public a d;

    /* renamed from: vhp$a */
    public interface a {
        void z();
    }

    public final void a(boolean z) {
        boolean z2 = !this.a && z;
        this.a = z;
        if (z2) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.z();
            }
        }
    }
}
