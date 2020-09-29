package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import io.reactivex.FlowableEmitter;
import java.io.IOException;

/* renamed from: wda reason: default package */
final class wda extends wpd {
    private final FlowableEmitter<wot> b;
    private boolean c;

    wda(FlowableEmitter<wot> flowableEmitter) {
        this.b = flowableEmitter;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(wsp wsp, wwi wwi) {
        if (wwi == null || wwi.g()) {
            Logger.b("Channel successfully closed after handling response, response=%s", wsp);
            return;
        }
        Logger.e("Failed to close future: %s", wwi.f().getMessage());
    }

    public final void a(wpb wpb) {
        super.a(wpb);
        this.b.a(new $$Lambda$wda$nSABer6FFM5S3RMo8QjpvAfxyZQ(wpb));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0120 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wpb r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.wsp
            if (r0 == 0) goto L_0x0121
            r1 = r12
            wsp r1 = (defpackage.wsp) r1
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            wot r3 = r11.a()
            boolean r3 = r3.D()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            wot r3 = r11.a()
            boolean r3 = r3.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            wot r3 = r11.a()
            boolean r3 = r3.C()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6 = 2
            r2[r6] = r3
            r3 = 3
            r2[r3] = r1
            java.lang.String r7 = "HTTP response: active=%s, writable=%s, open=%s, response=%s"
            com.spotify.base.java.logging.Logger.b(r7, r2)
            wsr r2 = r1.f()
            wsr r7 = defpackage.wsr.a
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x004e
        L_0x004b:
            r4 = 1
            goto L_0x011e
        L_0x004e:
            wsr r2 = r1.f()
            int r2 = r2.b
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 < r7) goto L_0x00be
            r7 = 299(0x12b, float:4.19E-43)
            if (r2 <= r7) goto L_0x005d
            goto L_0x00be
        L_0x005d:
            wot r2 = r11.a()
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x0076
            wot r2 = r11.a()
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            r10.c = r5
            goto L_0x011e
        L_0x0076:
            io.reactivex.FlowableEmitter<wot> r2 = r10.b
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x00bb
            java.lang.Object[] r2 = new java.lang.Object[r3]
            wot r3 = r11.a()
            boolean r3 = r3.D()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r4] = r3
            wot r3 = r11.a()
            boolean r3 = r3.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r5] = r3
            wsr r1 = r1.f()
            r2[r6] = r1
            java.lang.String r1 = "Invalid channel: active=%s, writable=%s, response=%s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            io.reactivex.FlowableEmitter<wot> r2 = r10.b
            com.spotify.voice.api.VoiceSessionException r3 = new com.spotify.voice.api.VoiceSessionException
            com.spotify.voice.api.model.ErrorDomain r5 = com.spotify.voice.api.model.ErrorDomain.CONNECTION
            wel r6 = defpackage.wel.g
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            r3.<init>(r5, r6, r7)
            r2.a(r3)
        L_0x00bb:
            r10.c = r4
            goto L_0x011e
        L_0x00be:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            wsr r6 = r1.f()
            java.lang.String r6 = r6.toString()
            r3[r4] = r6
            java.lang.String r4 = "unexpected speech-recognition status %s"
            com.spotify.base.java.logging.Logger.e(r4, r3)
            io.reactivex.FlowableEmitter<wot> r3 = r10.b
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x0102
            io.reactivex.FlowableEmitter<wot> r3 = r10.b
            com.spotify.voice.api.VoiceSessionException r4 = new com.spotify.voice.api.VoiceSessionException
            com.spotify.voice.api.model.ErrorDomain r6 = com.spotify.voice.api.model.ErrorDomain.CONNECTION
            java.lang.String r2 = java.lang.String.valueOf(r2)
            wel r2 = defpackage.wel.a(r2)
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "request failed: "
            r8.<init>(r9)
            wsr r9 = r1.f()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r4.<init>(r6, r2, r7)
            r3.a(r4)
        L_0x0102:
            wot r2 = r11.a()
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x004b
            wot r2 = r11.a()
            wox r2 = r2.i()
            -$$Lambda$wda$cgBAlOF2cT1GyX5bIz_mumYvdsA r3 = new -$$Lambda$wda$cgBAlOF2cT1GyX5bIz_mumYvdsA
            r3.<init>(r1)
            r2.a(r3)
            goto L_0x004b
        L_0x011e:
            if (r4 == 0) goto L_0x0121
            return
        L_0x0121:
            boolean r1 = r12 instanceof defpackage.wsc
            if (r1 == 0) goto L_0x0137
            wsc r12 = (defpackage.wsc) r12
            boolean r0 = r10.c
            if (r0 == 0) goto L_0x0133
            wnb r12 = r12.a()
            r11.d(r12)
            goto L_0x013c
        L_0x0133:
            r12.B()
            return
        L_0x0137:
            if (r0 == 0) goto L_0x013c
            r11.d(r12)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wda.a(wpb, java.lang.Object):void");
    }

    public final void a(wpb wpb, Throwable th) {
        Logger.e("exception caught: %s", th.getMessage());
        if (!this.b.b()) {
            this.b.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, wel.g, th));
        }
    }

    public final void b(wpb wpb) {
        Logger.b("channel inactive ", new Object[0]);
        super.b(wpb);
        if (!wpb.a().D() && !this.b.b()) {
            this.b.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, wel.g, new IOException("Connection already closed")));
        }
    }
}
