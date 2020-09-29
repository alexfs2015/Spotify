package defpackage;

/* renamed from: piy reason: default package */
public final class piy implements kjd<gzz, pfy> {
    public final gur a;
    /* access modifiers changed from: private */
    public final gup b;

    public piy(gur gur, gup gup) {
        this.a = gur;
        this.b = gup;
    }

    public final kje<gzz> connect(kkn<pfy> kkn) {
        return new kje<gzz>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                piy.this.b.a((gzz) obj, false);
            }
        };
    }
}
