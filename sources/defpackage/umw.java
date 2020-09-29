package defpackage;

import android.os.Bundle;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: umw reason: default package */
public final class umw {
    xag a;
    private final snp b;
    private final ulk c;
    private final ula d;
    private final umz e;
    private final rda f;
    private final fpt g;
    private final uks h;
    private final boolean i;
    private final a j;
    private final Intent k;
    private final String l;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    public umw(ulk ulk, snp snp, ula ula, rda rda, fpt fpt, uks uks, Bundle bundle, umz umz) {
        this.c = ulk;
        this.b = snp;
        this.d = ula;
        this.f = rda;
        this.g = fpt;
        this.h = uks;
        this.j = (a) bundle.getParcelable("voice_nlu_result");
        this.i = bundle.getBoolean("voice_player_was_playing");
        this.k = (Intent) bundle.getSerializable("voice_nlu_intent");
        this.l = bundle.getString("error_text");
        this.e = umz;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.umx r12, boolean r13, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r14, java.lang.String r15, long r16, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r18, boolean r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            r11 = this;
            r0 = r11
            r1 = r14
            r2 = r18
            r3 = r21
            if (r13 != 0) goto L_0x0049
            if (r1 == 0) goto L_0x0049
            ulk r4 = r0.c
            umz r5 = r0.e
            java.lang.String r5 = r5.a
            sih r6 = com.spotify.music.libs.viewuri.ViewUris.bZ
            java.lang.String r6 = r6.toString()
            sih r7 = com.spotify.music.libs.viewuri.ViewUris.bZ
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
            ulk r5 = r0.c
            umz r6 = r0.e
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
            xag r1 = new xag
            r1.<init>()
            r0.a = r1
            ula r1 = r0.d
            r1.a()
            rda r1 = r0.f
            com.spotify.instrumentation.PageIdentifiers r3 = com.spotify.instrumentation.PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY
            java.lang.String r3 = r3.mPageIdentifier
            sih r4 = com.spotify.music.libs.viewuri.ViewUris.bZ
            java.lang.String r4 = r4.toString()
            r1.a(r3, r4)
            ulm$a r1 = r0.j
            r3 = 0
            if (r1 == 0) goto L_0x00ad
            com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r4 = r0.k
            if (r4 == 0) goto L_0x00ad
            jst r1 = r1.b
            if (r1 == 0) goto L_0x00ad
            com.spotify.mobile.android.util.LinkType r4 = r1.b
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.DUMMY
            if (r4 == r5) goto L_0x00ad
            java.lang.String r4 = r1.q()
            xag r5 = r0.a
            uks r6 = r0.h
            umz r7 = r0.e
            java.lang.String r7 = r7.a
            com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r8 = r0.k
            wud r1 = r6.a(r7, r8, r1, r3)
            -$$Lambda$umw$UXmzvLc7u3HwM4LSBOhj8Hhmzk4 r3 = defpackage.$$Lambda$umw$UXmzvLc7u3HwM4LSBOhj8Hhmzk4.INSTANCE
            -$$Lambda$umw$rdUE6JMxaiYrTNngodCF0XnSCcA r6 = defpackage.$$Lambda$umw$rdUE6JMxaiYrTNngodCF0XnSCcA.INSTANCE
            wuk r1 = r1.a(r3, r6)
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
            snp r1 = r0.b
            r1.b(r4)
            boolean r1 = r0.i
            if (r1 == 0) goto L_0x00d7
            uks r1 = r0.h
            umz r2 = r0.e
            java.lang.String r2 = r2.a
            com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r3 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.RESUME
            r4 = 1
            r1.a(r2, r3, r4)
            return
        L_0x00ce:
            if (r2 == 0) goto L_0x00d7
            snp r1 = r0.b
            fpt r3 = r0.g
            r1.a(r2, r3)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umw.a(umx, boolean, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState, java.lang.String, long, com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState, boolean, boolean, java.lang.String, boolean):void");
    }

    public final void a(String str) {
        this.c.a(this.e.a, ViewUris.bZ.toString(), ViewUris.bV.toString(), str, 0, InteractionIntent.PREVIOUS, InteractionType.TAP);
    }
}
