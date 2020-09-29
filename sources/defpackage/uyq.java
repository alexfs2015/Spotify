package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.UUID;

/* renamed from: uyq reason: default package */
public final class uyq {
    public final String a;
    public final jlr b;
    private final jtz c;

    private uyq(String str, jlr jlr, jtz jtz) {
        this.a = str;
        this.b = jlr;
        this.c = jtz;
    }

    uyq(jlr jlr, jtz jtz) {
        this(UUID.randomUUID().toString(), jlr, jtz);
    }

    public final void a(InteractionIntent interactionIntent) {
        jlr jlr = this.b;
        bg bgVar = new bg(this.a, uqo.bg.a(), ViewUris.bX.toString(), null, 0, ViewUris.bU.toString(), InteractionType.TAP.mInteractionType, interactionIntent.mInteractionIntent, (double) this.c.a());
        jlr.a(bgVar);
    }
}
