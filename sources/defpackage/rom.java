package defpackage;

import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: rom reason: default package */
public final class rom {
    private final jlr a;
    private final String b;

    public rom(jlr jlr, String str) {
        this.a = jlr;
        this.b = str;
    }

    private void a(boolean z, String str, String str2, int i) {
        String str3;
        InteractionAction interactionAction;
        if (z) {
            interactionAction = vao.a(str, false);
            str3 = "like-disable";
        } else {
            interactionAction = vao.a(str, true);
            str3 = "like-enable";
        }
        a(str3, interactionAction, str, str2, 0, "like-button");
    }

    private void b(boolean z, String str, String str2, int i) {
        a(z ? "ban-disable" : "ban-enable", null, str, str2, 0, "ban-button");
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [hdp] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r28, com.spotify.music.ubi.interactions.InteractionAction r29, java.lang.String r30, java.lang.String r31, int r32, java.lang.String r33) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = r32
            if (r1 == 0) goto L_0x0028
            hdr$bh r14 = new hdr$bh
            r3 = 0
            java.lang.String r4 = r0.b
            long r6 = (long) r2
            jtz r2 = defpackage.jtp.a
            long r8 = r2.a()
            double r11 = (double) r8
            java.lang.String r13 = r1.mLogString
            java.lang.String r9 = "hit"
            r1 = r14
            r2 = r3
            r3 = r4
            r4 = r31
            r5 = r33
            r8 = r30
            r10 = r28
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r13)
            goto L_0x004b
        L_0x0028:
            hdr$bg r1 = new hdr$bg
            r16 = 0
            java.lang.String r3 = r0.b
            long r4 = (long) r2
            jtz r2 = defpackage.jtp.a
            long r6 = r2.a()
            double r6 = (double) r6
            java.lang.String r23 = "hit"
            r15 = r1
            r17 = r3
            r18 = r31
            r19 = r33
            r20 = r4
            r22 = r30
            r24 = r28
            r25 = r6
            r15.<init>(r16, r17, r18, r19, r20, r22, r23, r24, r25)
            r14 = r1
        L_0x004b:
            jlr r1 = r0.a
            r1.a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rom.a(java.lang.String, com.spotify.music.ubi.interactions.InteractionAction, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public final void a(String str, String str2) {
        a("share", null, str, null, -1, "share-button");
    }

    public final void a(boolean z, String str, String str2) {
        a(z, str, str2, 0);
    }

    public final void b(boolean z, String str, String str2) {
        b(z, str, str2, 0);
    }
}
