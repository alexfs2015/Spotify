package defpackage;

/* renamed from: pvz reason: default package */
public final class pvz implements gvk {
    private final sfj b;
    private final sgn c;

    public pvz(sfj sfj, sgn sgn) {
        this.b = sfj;
        this.c = sgn;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String str = (String) fay.a(gzp.data().string("query"));
        String str2 = (String) fay.a(gzp.data().string("requestId"));
        int intValue = gzp.data().intValue("suggestionIndex", -1);
        if (guy.a.equals("rightAccessoryClick")) {
            this.b.a(str, intValue);
            return;
        }
        this.b.onSuggestionClicked(str, str2, intValue);
        this.c.a();
    }
}
