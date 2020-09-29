package defpackage;

import android.os.Bundle;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: uya reason: default package */
public final class uya {
    xok a;
    private final sxw b;
    private final uwo c;
    private final uwe d;
    private final uyd e;
    private final rly f;
    private final fqn g;
    private final uvy h;
    private final boolean i;
    private final a j;
    private final Intent k;
    private final String l;

    public uya(uwo uwo, sxw sxw, uwe uwe, rly rly, fqn fqn, uvy uvy, Bundle bundle, uyd uyd) {
        this.c = uwo;
        this.b = sxw;
        this.d = uwe;
        this.f = rly;
        this.g = fqn;
        this.h = uvy;
        this.j = (a) bundle.getParcelable("voice_nlu_result");
        this.i = bundle.getBoolean("voice_player_was_playing");
        this.k = (Intent) bundle.getSerializable("voice_nlu_intent");
        this.l = bundle.getString("error_text");
        this.e = uyd;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    public final void a(String str) {
        this.c.a(this.e.a, ViewUris.bY.toString(), ViewUris.bU.toString(), str, 0, InteractionIntent.PREVIOUS, InteractionType.TAP);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.uyb r12, boolean r13, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r14, java.lang.String r15, long r16, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r18, boolean r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r11 = this;
            r0 = r11
            r1 = r14
            r2 = r18
            r3 = r21
            if (r13 != 0) goto L_0x0049
            if (r1 == 0) goto L_0x0049
            uwo r4 = r0.c
            uyd r5 = r0.e
            java.lang.String r5 = r5.a
            sso r6 = com.spotify.music.libs.viewuri.ViewUris.bY
            java.lang.String r6 = r6.toString()
            sso r7 = com.spotify.music.libs.viewuri.ViewUris.bY
            java.lang.String r7 = r7.toString()
            r9 = 0
            java.lang.String r8 = "error-screen"
            java.lang.String r10 = "page"
            r4.a(r5, r6, r7, r8, r9, r10)
            com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r4 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.CONNECTION_ERROR
            if (r1 == r4) goto L_0x0034
            com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r4 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.APP_ERROR
            if (r1 != r4) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            java.lang.String r4 = r0.l
            if (r4 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            r4 = r15
            goto L_0x0036
        L_0x0034:
            java.lang.String r4 = r0.l
        L_0x0036:
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = "Unknown error"
        L_0x003a:
            java.lang.String r1 = r14.name()
            uwo r5 = r0.c
            uyd r6 = r0.e
            java.lang.String r6 = r6.a
            r7 = r22
            r5.a(r6, r1, r4, r7)
        L_0x0049:
            if (r19 == 0) goto L_0x004f
            r12.ai()
            goto L_0x0052
        L_0x004f:
            r12.aj()
        L_0x0052:
            if (r20 == 0) goto L_0x0058
            r12.c()
            goto L_0x005b
        L_0x0058:
            r12.ah()
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            r1 = r12
            r12.b(r3)
        L_0x0061:
            xok r1 = new xok
            r1.<init>()
            r0.a = r1
            uwe r1 = r0.d
            r1.a()
            rly r1 = r0.f
            com.spotify.instrumentation.PageIdentifiers r3 = com.spotify.instrumentation.PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY
            java.lang.String r3 = r3.mPageIdentifier
            sso r4 = com.spotify.music.libs.viewuri.ViewUris.bY
            java.lang.String r4 = r4.toString()
            r1.a(r3, r4)
            uwq$a r1 = r0.j
            r3 = 0
            if (r1 == 0) goto L_0x00ad
            com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r4 = r0.k
            if (r4 == 0) goto L_0x00ad
            jva r1 = r1.b
            if (r1 == 0) goto L_0x00ad
            com.spotify.mobile.android.util.LinkType r4 = r1.b
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.DUMMY
            if (r4 == r5) goto L_0x00ad
            java.lang.String r4 = r1.q()
            xok r5 = r0.a
            uvy r6 = r0.h
            uyd r7 = r0.e
            java.lang.String r7 = r7.a
            com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r8 = r0.k
            xii r1 = r6.a(r7, r8, r1, r3)
            -$$Lambda$uya$TROElkNjUcBOeOKEM3bfiS77ilQ r3 = defpackage.$$Lambda$uya$TROElkNjUcBOeOKEM3bfiS77ilQ.INSTANCE
            -$$Lambda$uya$GjrE9sWzMV6MQsIrED7e11N2b_s r6 = defpackage.$$Lambda$uya$GjrE9sWzMV6MQsIrED7e11N2b_s.INSTANCE
            xip r1 = r1.a(r3, r6)
            r5.a(r1)
            goto L_0x00ae
        L_0x00ad:
            r4 = r3
        L_0x00ae:
            r5 = 0
            int r1 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d7
            com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r1 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.FINISH
            if (r2 != r1) goto L_0x00ce
            sxw r1 = r0.b
            r1.b(r4)
            boolean r1 = r0.i
            if (r1 == 0) goto L_0x00d7
            uvy r1 = r0.h
            uyd r2 = r0.e
            java.lang.String r2 = r2.a
            com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r3 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.RESUME
            r4 = 1
            r1.a(r2, r3, r4)
            return
        L_0x00ce:
            if (r2 == 0) goto L_0x00d7
            sxw r1 = r0.b
            fqn r3 = r0.g
            r1.a(r2, r3)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uya.a(uyb, boolean, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState, java.lang.String, long, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState, boolean, boolean, java.lang.String, boolean):void");
    }
}
