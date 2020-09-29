package com.spotify.music.loggers;

import com.spotify.music.ubi.interactions.InteractionAction;

public final class InteractionLogger {
    private final gjf a;
    private final sih b;
    private final jjf c;

    public enum InteractionType {
        SCROLL("scroll"),
        SWIPE_LEFT("swipe-left"),
        SWIPE_RIGHT("swipe-right"),
        HIT("hit"),
        DEFERRED("deferred"),
        DRAG("drag"),
        DRAG_SLIDER("drag-slider"),
        TAP("tap");
        
        private final String mStrValue;

        private InteractionType(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public InteractionLogger(jjf jjf, sih sih, gjf gjf) {
        this.c = jjf;
        this.b = sih;
        this.a = gjf;
    }

    public final void a(String str, String str2, int i, InteractionType interactionType, String str3) {
        a("", str, str2, i, interactionType, str3);
    }

    public final void a(String str, String str2, int i, InteractionType interactionType, String str3, InteractionAction interactionAction) {
        a("", str, this.a.a(), str2, i, interactionType, str3, interactionAction);
    }

    public final void a(String str, String str2, String str3, int i, InteractionType interactionType, String str4) {
        a(str, str2, this.a.a(), str3, i, interactionType, str4);
    }

    public final void a(String str, String str2, String str3, int i, InteractionType interactionType, String str4, InteractionAction interactionAction) {
        a(str, str2, this.a.a(), str3, 0, interactionType, str4, interactionAction);
    }

    public final void a(String str, String str2, String str3, String str4, int i, InteractionType interactionType, String str5) {
        a(str, str2, str3, str4, i, interactionType, str5, null);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [haw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, com.spotify.music.loggers.InteractionLogger.InteractionType r33, java.lang.String r34, com.spotify.music.ubi.interactions.InteractionAction r35) {
        /*
            r27 = this;
            r0 = r27
            r1 = r32
            r2 = r35
            if (r2 == 0) goto L_0x002d
            hay$bi r14 = new hay$bi
            sih r3 = r0.b
            java.lang.String r4 = r3.toString()
            long r6 = (long) r1
            java.lang.String r9 = r33.toString()
            jrp r1 = defpackage.jrf.a
            long r10 = r1.a()
            double r11 = (double) r10
            java.lang.String r13 = r2.mLogString
            r1 = r14
            r2 = r28
            r3 = r30
            r5 = r31
            r8 = r29
            r10 = r34
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r13)
            goto L_0x0054
        L_0x002d:
            hay$bh r2 = new hay$bh
            sih r3 = r0.b
            java.lang.String r18 = r3.toString()
            long r3 = (long) r1
            java.lang.String r23 = r33.toString()
            jrp r1 = defpackage.jrf.a
            long r5 = r1.a()
            double r5 = (double) r5
            r15 = r2
            r16 = r28
            r17 = r30
            r19 = r31
            r20 = r3
            r22 = r29
            r24 = r34
            r25 = r5
            r15.<init>(r16, r17, r18, r19, r20, r22, r23, r24, r25)
            r14 = r2
        L_0x0054:
            jjf r1 = r0.c
            r1.a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.loggers.InteractionLogger.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.spotify.music.loggers.InteractionLogger$InteractionType, java.lang.String, com.spotify.music.ubi.interactions.InteractionAction):void");
    }
}
