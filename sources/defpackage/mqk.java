package defpackage;

/* renamed from: mqk reason: default package */
public final class mqk implements gvk {
    private final mqe b;

    public mqk(mqe mqe) {
        this.b = mqe;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("entity_uri");
        String string2 = gzp.data().string("id");
        if (string != null && string2 != null) {
            this.b.a(new d(string, string2));
        }
    }
}
