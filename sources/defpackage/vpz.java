package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.voice.VoiceSessionException;
import com.spotify.voice.model.ErrorDomain;
import io.reactivex.FlowableEmitter;
import java.io.IOException;

/* renamed from: vpz reason: default package */
final class vpz extends wax {
    private final FlowableEmitter<wan> b;
    private boolean c;

    vpz(FlowableEmitter<wan> flowableEmitter) {
        this.b = flowableEmitter;
    }

    public final void a(wav wav) {
        super.a(wav);
        this.b.a(new $$Lambda$vpz$gFFhl6_zEqDt1K1zgJ_BipBEAk(wav));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0120 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wav r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.wej
            if (r0 == 0) goto L_0x0121
            r1 = r12
            wej r1 = (defpackage.wej) r1
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            wan r3 = r11.a()
            boolean r3 = r3.D()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            wan r3 = r11.a()
            boolean r3 = r3.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            wan r3 = r11.a()
            boolean r3 = r3.C()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6 = 2
            r2[r6] = r3
            r3 = 3
            r2[r3] = r1
            java.lang.String r7 = "HTTP response: active=%s, writable=%s, open=%s, response=%s"
            com.spotify.base.java.logging.Logger.b(r7, r2)
            wel r2 = r1.f()
            wel r7 = defpackage.wel.a
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x004e
        L_0x004b:
            r4 = 1
            goto L_0x011e
        L_0x004e:
            wel r2 = r1.f()
            int r2 = r2.b
            r7 = 200(0xc8, float:2.8E-43)
            if (r2 < r7) goto L_0x00be
            r7 = 299(0x12b, float:4.19E-43)
            if (r2 <= r7) goto L_0x005d
            goto L_0x00be
        L_0x005d:
            wan r2 = r11.a()
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x0076
            wan r2 = r11.a()
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            r10.c = r5
            goto L_0x011e
        L_0x0076:
            io.reactivex.FlowableEmitter<wan> r2 = r10.b
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x00bb
            java.lang.Object[] r2 = new java.lang.Object[r3]
            wan r3 = r11.a()
            boolean r3 = r3.D()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r4] = r3
            wan r3 = r11.a()
            boolean r3 = r3.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r5] = r3
            wel r1 = r1.f()
            r2[r6] = r1
            java.lang.String r1 = "Invalid channel: active=%s, writable=%s, response=%s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            io.reactivex.FlowableEmitter<wan> r2 = r10.b
            com.spotify.voice.VoiceSessionException r3 = new com.spotify.voice.VoiceSessionException
            com.spotify.voice.model.ErrorDomain r5 = com.spotify.voice.model.ErrorDomain.CONNECTION
            vrd r6 = defpackage.vrd.g
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            r3.<init>(r5, r6, r7)
            r2.a(r3)
        L_0x00bb:
            r10.c = r4
            goto L_0x011e
        L_0x00be:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            wel r6 = r1.f()
            java.lang.String r6 = r6.toString()
            r3[r4] = r6
            java.lang.String r4 = "unexpected speech-recognition status %s"
            com.spotify.base.java.logging.Logger.e(r4, r3)
            io.reactivex.FlowableEmitter<wan> r3 = r10.b
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x0102
            io.reactivex.FlowableEmitter<wan> r3 = r10.b
            com.spotify.voice.VoiceSessionException r4 = new com.spotify.voice.VoiceSessionException
            com.spotify.voice.model.ErrorDomain r6 = com.spotify.voice.model.ErrorDomain.CONNECTION
            java.lang.String r2 = java.lang.String.valueOf(r2)
            vrd r2 = defpackage.vrd.a(r2)
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "request failed: "
            r8.<init>(r9)
            wel r9 = r1.f()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r4.<init>(r6, r2, r7)
            r3.a(r4)
        L_0x0102:
            wan r2 = r11.a()
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x004b
            wan r2 = r11.a()
            war r2 = r2.i()
            -$$Lambda$vpz$iV_DUeVBSTS3uN44fFTYsndiGJs r3 = new -$$Lambda$vpz$iV_DUeVBSTS3uN44fFTYsndiGJs
            r3.<init>(r1)
            r2.a(r3)
            goto L_0x004b
        L_0x011e:
            if (r4 == 0) goto L_0x0121
            return
        L_0x0121:
            boolean r1 = r12 instanceof defpackage.wdw
            if (r1 == 0) goto L_0x0137
            wdw r12 = (defpackage.wdw) r12
            boolean r0 = r10.c
            if (r0 == 0) goto L_0x0133
            vyv r12 = r12.a()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpz.a(wav, java.lang.Object):void");
    }

    public final void b(wav wav) {
        Logger.b("channel inactive ", new Object[0]);
        super.b(wav);
        if (!wav.a().D() && !this.b.b()) {
            this.b.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, vrd.g, new IOException("Connection already closed")));
        }
    }

    public final void a(wav wav, Throwable th) {
        Logger.e("exception caught: %s", th.getMessage());
        if (!this.b.b()) {
            this.b.a((Throwable) new VoiceSessionException(ErrorDomain.CONNECTION, vrd.g, th));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(wej wej, wic wic) {
        if (wic == null || wic.g()) {
            Logger.b("Channel successfully closed after handling response, response=%s", wej);
            return;
        }
        Logger.e("Failed to close future: %s", wic.f().getMessage());
    }
}
