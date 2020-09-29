package defpackage;

@cfp
/* renamed from: bfq reason: default package */
public final class bfq {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final bfm e;

    /* renamed from: bfq$a */
    public static final class a {
        public boolean a = false;
        public int b = -1;
        public boolean c = false;
        public bfm d;
        public int e = 1;

        public final bfq a() {
            return new bfq(this, 0);
        }
    }

    private bfq(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.e;
        this.e = aVar.d;
    }

    /* synthetic */ bfq(a aVar, byte b2) {
        this(aVar);
    }
}
