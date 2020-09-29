package defpackage;

/* renamed from: pzj reason: default package */
public final class pzj implements gvk {
    private final sgn b;
    private final pzw c;

    public pzj(sgn sgn, pzw pzw) {
        this.b = (sgn) fay.a(sgn);
        this.c = pzw;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.b.a();
        String string = gzp.data().string("targetUri");
        int intValue = gzp.data().intValue("position").intValue();
        if (!fax.a(string)) {
            this.c.a(string, intValue);
        }
    }

    public static gzp a(String str, int i) {
        fay.a(str);
        return haa.builder().a("openHistoryItem").a("targetUri", str).a("position", Integer.valueOf(i)).a();
    }
}
