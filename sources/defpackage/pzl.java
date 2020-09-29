package defpackage;

/* renamed from: pzl reason: default package */
public final class pzl implements gvk {
    private final sgn b;
    private final pzw c;

    public pzl(sgn sgn, pzw pzw) {
        this.b = (sgn) fay.a(sgn);
        this.c = pzw;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.b.a();
        String string = gzp.data().string("targetUri");
        int intValue = gzp.data().intValue("position").intValue();
        if (!fax.a(string)) {
            this.c.b(string, intValue);
        }
    }

    public static gzp a(String str, int i) {
        fay.a(str);
        return haa.builder().a("removeHistoryItem").a("targetUri", str).a("position", Integer.valueOf(i)).a();
    }
}
