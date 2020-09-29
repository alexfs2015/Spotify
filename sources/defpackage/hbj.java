package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: hbj reason: default package */
public final class hbj implements gxk {
    private final Player b;
    private final a c;
    private final has d;
    private final hbc e;
    private final hcf f;
    private final wbt g;

    public hbj(Player player, a aVar, has has, hbc hbc, hcf hcf, wbt wbt) {
        this.b = (Player) fbp.a(player);
        this.c = (a) fbp.a(aVar);
        this.d = (has) fbp.a(has);
        this.e = (hbc) fbp.a(hbc);
        this.f = hcf;
        this.g = wbt;
    }

    public static hci a(String str, hcj hcj) {
        return hct.builder().a("playFromContext").a("uri", str).b(hcj).a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b1 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleCommand(defpackage.hci r10, defpackage.gwy r11) {
        /*
            r9 = this;
            hcm r0 = r11.b
            hcj r1 = r10.data()
            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r1 = defpackage.hbr.a(r1)
            if (r1 == 0) goto L_0x00ea
            hcj r2 = r10.data()
            java.lang.String r3 = "uri"
            java.lang.String r2 = r2.string(r3)
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            java.lang.String r2 = ""
        L_0x001b:
            hcj r10 = r10.data()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r10 = defpackage.hbr.b(r10)
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L_0x003b
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides r5 = r10.playerOptionsOverride()
            if (r5 == 0) goto L_0x003b
            java.lang.Boolean r5 = r5.shufflingContext()
            if (r5 == 0) goto L_0x003b
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x003b
            r5 = 1
            goto L_0x003c
        L_0x003b:
            r5 = 0
        L_0x003c:
            java.lang.String r6 = "play"
            if (r5 == 0) goto L_0x0050
            wbt r5 = r9.g
            hcf r7 = r9.f
            wbr$a$a r11 = r7.a(r11)
            wbw r11 = r11.a(r2)
            r5.a(r11)
            goto L_0x009f
        L_0x0050:
            wbt r5 = r9.g
            hcf r7 = r9.f
            wbr$a$a r11 = r7.a(r11)
            wbw$a r7 = defpackage.wbw.a()
            wbr$a r8 = defpackage.wbr.a.this
            wbr r8 = defpackage.wbr.this
            java.lang.String r8 = r8.a
            r7.a = r8
            wbr$a r8 = defpackage.wbr.a.this
            wbr r8 = defpackage.wbr.this
            java.lang.String r8 = r8.b
            r7.b = r8
            wbr$a r8 = defpackage.wbr.a.this
            wbr r8 = defpackage.wbr.this
            java.lang.String r8 = r8.c
            r7.c = r8
            wbr$a r8 = defpackage.wbr.a.this
            wbr r8 = defpackage.wbr.this
            java.lang.String r8 = r8.d
            r7.g = r8
            wbr$a r8 = defpackage.wbr.a.this
            wbr r8 = defpackage.wbr.this
            java.lang.String r8 = r8.e
            r7.d = r8
            wbr$a r8 = defpackage.wbr.a.this
            java.util.List<wbu> r8 = r8.a
            wbw$a r7 = r7.a(r8)
            java.lang.String r11 = r11.a
            r7.e = r11
            r7.f = r6
            java.lang.String r11 = "item_to_be_played"
            wbw$a r11 = r7.a(r11, r2)
            wbw r11 = r11.a()
            r5.a(r11)
        L_0x009f:
            has r11 = r9.d
            r5 = 0
            r11.logInteraction(r2, r0, r6, r5)
            hbc r11 = r9.e
            boolean r0 = defpackage.lpa.a(r0)
            boolean r11 = r11.a(r0)
            if (r11 == 0) goto L_0x00db
            if (r10 == 0) goto L_0x00ba
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r11 = r10.skipTo()
            if (r11 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 == 0) goto L_0x00db
            hbc r11 = r9.e
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r10 = r10.skipTo()
            java.lang.Object r10 = defpackage.fbp.a(r10)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r10 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo) r10
            java.lang.String r10 = r10.trackUri()
            java.lang.Object r10 = defpackage.fbp.a(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = r1.uri()
            r11.a(r10, r0)
            return
        L_0x00db:
            com.spotify.mobile.android.cosmos.player.v2.Player r11 = r9.b
            sso$a r0 = r9.c
            sso r0 = r0.ae_()
            java.lang.String r0 = r0.toString()
            r11.playWithViewUri(r1, r10, r0)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbj.handleCommand(hci, gwy):void");
    }
}
