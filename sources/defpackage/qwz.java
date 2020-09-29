package defpackage;

import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: qwz reason: default package */
public final class qwz {
    private final jtz a;
    private final jlr b;
    private final String c;
    private final String d;

    public qwz(jtz jtz, jlr jlr, String str, String str2) {
        this.a = jtz;
        this.b = jlr;
        this.c = str;
        this.d = str2;
    }

    public final void a(String str) {
        a("public-playlists", str, "navigate_forward", null);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [hdp] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r28, java.lang.String r29, java.lang.String r30, com.spotify.music.ubi.interactions.InteractionAction r31) {
        /*
            r27 = this;
            r0 = r27
            r1 = r31
            if (r1 == 0) goto L_0x0025
            hdr$bh r14 = new hdr$bh
            r2 = 0
            java.lang.String r3 = r0.c
            java.lang.String r4 = r0.d
            r6 = -1
            jtz r5 = r0.a
            long r8 = r5.a()
            double r11 = (double) r8
            java.lang.String r13 = r1.mLogString
            java.lang.String r9 = "hit"
            r1 = r14
            r5 = r28
            r8 = r29
            r10 = r30
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r13)
            goto L_0x0049
        L_0x0025:
            hdr$bg r1 = new hdr$bg
            r16 = 0
            java.lang.String r2 = r0.c
            java.lang.String r3 = r0.d
            r20 = -1
            jtz r4 = r0.a
            long r4 = r4.a()
            double r4 = (double) r4
            java.lang.String r23 = "hit"
            r15 = r1
            r17 = r2
            r18 = r3
            r19 = r28
            r22 = r29
            r24 = r30
            r25 = r4
            r15.<init>(r16, r17, r18, r19, r20, r22, r23, r24, r25)
            r14 = r1
        L_0x0049:
            jlr r1 = r0.b
            r1.a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwz.a(java.lang.String, java.lang.String, java.lang.String, com.spotify.music.ubi.interactions.InteractionAction):void");
    }

    public final void a(String str, boolean z) {
        InteractionAction interactionAction = z ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW;
        a(null, str, interactionAction.mLogString, interactionAction);
    }

    public final void b(String str) {
        a("recently-played-artists", str, "navigate_forward", null);
    }
}
