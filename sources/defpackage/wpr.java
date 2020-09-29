package defpackage;

/* renamed from: wpr reason: default package */
abstract class wpr extends wvx<Void> implements wox {
    private final wot a;

    protected wpr(wot wot, wwc wwc) {
        super(wwc);
        if (wot != null) {
            this.a = wot;
            return;
        }
        throw new NullPointerException("channel");
    }

    public final wox a(wwk<? extends wwi<? super Void>> wwk) {
        super.b(wwk);
        return this;
    }

    public final wwc a() {
        wwc a2 = super.a();
        return a2 == null ? this.a.e() : a2;
    }

    public final /* bridge */ /* synthetic */ wwi aV_() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wwi b(wwk wwk) {
        super.b(wwk);
        return this;
    }

    public final /* bridge */ /* synthetic */ wwi c() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return null;
    }

    public final wot e() {
        return this.a;
    }
}
