package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: qos reason: default package */
public final class qos {
    private final jlr a;
    private final jtz b;

    public qos(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    public final void a(String str, ImpressionType impressionType, RenderType renderType) {
        jlr jlr = this.a;
        String str2 = str;
        be beVar = new be("", uqo.aT.a(), str2, "", 0, "", impressionType.toString(), renderType.toString(), (double) this.b.a());
        jlr.a(beVar);
    }

    public final void a(String str, String str2, int i, String str3, InteractionType interactionType, InteractionIntent interactionIntent, String str4, String str5) {
        a(str, str2, i, str3, interactionType, interactionIntent.mInteractionIntent, str4, str5);
    }

    public final void a(String str, String str2, int i, String str3, InteractionType interactionType, String str4, String str5, String str6) {
        jlr jlr = this.a;
        bh bhVar = new bh(str, uqo.aT.a(), str2, str6, (long) i, str3, interactionType.mInteractionType, str4, (double) this.b.a(), str5);
        jlr.a(bhVar);
    }
}
