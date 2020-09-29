package defpackage;

/* renamed from: uvz reason: default package */
public final class uvz {
    public boolean a;
    public byte b = 0;
    public int c;
    public a d;

    /* renamed from: uvz$a */
    public interface a {
        void y();
    }

    public final void a(boolean z) {
        boolean z2 = !this.a && z;
        this.a = z;
        if (z2) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.y();
            }
        }
    }
}
