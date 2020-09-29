package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;

/* renamed from: iqw reason: default package */
public final class iqw {
    private final jjf a;

    public iqw(jjf jjf) {
        this.a = jjf;
    }

    public final void a(String str, InteractionIntent interactionIntent, gjf gjf, sih sih) {
        String str2 = interactionIntent.mInteractionIntent;
        String a2 = gjf.a();
        String sih2 = sih.toString();
        ai aiVar = new ai(str2, str, InteractionType.TAP.toString(), str2, a2, sih2);
        this.a.a(aiVar);
        Logger.b("{itemId: '%s', intent: '%s', pageIdentifier: '%s', viewUri: '%s'}", str, str2, a2, sih2);
    }
}
