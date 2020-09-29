package defpackage;

/* renamed from: mqi reason: default package */
public final class mqi implements gvk {
    private final mqe b;

    public mqi(mqe mqe) {
        this.b = mqe;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("id");
        String str = (String) guy.c.get("artist_uri");
        if (str != null && string != null) {
            this.b.a(mrh.a(str, string));
        }
    }
}
