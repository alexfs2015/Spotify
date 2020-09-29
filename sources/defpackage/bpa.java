package defpackage;

/* renamed from: bpa reason: default package */
public final class bpa {
    private final bpt a = new a(this, 0);

    /* renamed from: bpa$a */
    class a extends defpackage.bpt.a {
        private a() {
        }

        /* synthetic */ a(bpa bpa, byte b) {
            this();
        }

        public final int a() {
            return 12451009;
        }

        public final bwu a(boc boc, int i) {
            return bpa.a(boc);
        }

        public final bwu a(boc boc, boz boz) {
            bpa bpa = bpa.this;
            return bpa.a(boc);
        }

        public final cbi b() {
            return cbj.a(bpa.this);
        }
    }

    @Deprecated
    public static bwu a(boc boc) {
        if (boc == null || !boc.a()) {
            return null;
        }
        return (bwu) boc.a.get(0);
    }
}
