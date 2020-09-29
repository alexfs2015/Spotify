package defpackage;

/* renamed from: spq reason: default package */
public final class spq implements spp {
    public spp a;

    private spq() {
    }

    public static spq a() {
        return new spq();
    }

    public final void a(String str, int i) {
        spp spp = this.a;
        if (spp != null) {
            spp.a(str, i);
        }
    }

    public final void onSuggestionClicked(String str, String str2, int i) {
        spp spp = this.a;
        if (spp != null) {
            spp.onSuggestionClicked(str, str2, i);
        }
    }
}
