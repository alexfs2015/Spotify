package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.UUID;

/* renamed from: unm reason: default package */
public final class unm {
    public final String a;
    public final jjf b;
    private final jrp c;

    unm(jjf jjf, jrp jrp) {
        this(UUID.randomUUID().toString(), jjf, jrp);
    }

    private unm(String str, jjf jjf, jrp jrp) {
        this.a = str;
        this.b = jjf;
        this.c = jrp;
    }

    public final void a(InteractionIntent interactionIntent) {
        jjf jjf = this.b;
        bh bhVar = new bh(this.a, udt.bg.a(), ViewUris.bY.toString(), null, 0, ViewUris.bV.toString(), InteractionType.TAP.mInteractionType, interactionIntent.mInteractionIntent, (double) this.c.a());
        jjf.a(bhVar);
    }
}
