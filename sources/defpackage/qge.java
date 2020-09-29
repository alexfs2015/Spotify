package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: qge reason: default package */
public final class qge {
    private final jjf a;
    private final jrp b;

    public qge(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
    }

    public final void a(String str, ImpressionType impressionType, RenderType renderType) {
        jjf jjf = this.a;
        String str2 = str;
        bf bfVar = new bf("", udt.aT.a(), str2, "", 0, "", impressionType.toString(), renderType.toString(), (double) this.b.a());
        jjf.a(bfVar);
    }

    public final void a(String str, String str2, int i, String str3, InteractionType interactionType, String str4, String str5, String str6) {
        jjf jjf = this.a;
        bi biVar = new bi(str, udt.aT.a(), str2, str6, (long) i, str3, interactionType.mInteractionType, str4, (double) this.b.a(), str5);
        jjf.a(biVar);
    }

    public final void a(String str, String str2, int i, String str3, InteractionType interactionType, InteractionIntent interactionIntent, String str4, String str5) {
        a(str, str2, i, str3, interactionType, interactionIntent.mInteractionIntent, str4, str5);
    }
}
