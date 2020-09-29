package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;

/* renamed from: ryo reason: default package */
public final class ryo {
    private final jlr a;

    public ryo(jlr jlr) {
        this.a = jlr;
    }

    private void a(String str, String str2, String str3, String str4) {
        ah ahVar = new ah(str2, str, InteractionType.TAP.mInteractionType, str2, str3, str4);
        this.a.a(ahVar);
    }

    private void a(String str, String str2, String str3, String str4, String str5) {
        ah ahVar = new ah(str, str2, InteractionType.TAP.mInteractionType, str3, str4, str5);
        this.a.a(ahVar);
    }

    public final void a(String str, InteractionIntent interactionIntent, gkq gkq, sso sso) {
        a(str, interactionIntent.mInteractionIntent, gkq.a(), sso.toString());
    }

    public final void a(String str, String str2, InteractionIntent interactionIntent, gkq gkq, sso sso) {
        a(str, str2, interactionIntent.mInteractionIntent, gkq.a(), sso.toString());
    }
}
