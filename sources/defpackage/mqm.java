package defpackage;

/* renamed from: mqm reason: default package */
public final class mqm implements gvk {
    private final mqe b;

    public mqm(mqe mqe) {
        this.b = mqe;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String str = (String) guy.c.get("artist_uri");
        if (str != null) {
            this.b.a(new i(str));
        }
    }
}
