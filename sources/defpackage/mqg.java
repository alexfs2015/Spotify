package defpackage;

import com.google.common.base.Optional;

/* renamed from: mqg reason: default package */
public final class mqg implements gvk {
    private final mqe b;

    public mqg(mqe mqe) {
        this.b = mqe;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("artist_uri");
        Optional c = Optional.c(gzp.data().string("id"));
        if (string != null) {
            this.b.a(mrh.a(string, (String) c.a("")));
        }
    }
}
