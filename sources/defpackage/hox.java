package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hox reason: default package */
public final class hox implements SpotifyServiceIntentProcessor {
    private final who<hpn> a;

    public hox(who<hpn> who) {
        this.a = who;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result a(boolean r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r7 = r8.getAction()
            defpackage.fbp.a(r7)
            java.lang.String r7 = r8.getAction()
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r0) {
                case -608079327: goto L_0x0040;
                case 142607439: goto L_0x0036;
                case 717624190: goto L_0x002c;
                case 832408453: goto L_0x0022;
                case 1962756171: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x004a
        L_0x0018:
            java.lang.String r0 = "com.spotify.mobile.android.service.action.player.NEXT"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 4
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "com.spotify.mobile.android.service.action.player.RESUME"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 2
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "com.spotify.mobile.android.service.action.player.PAUSE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "com.spotify.mobile.android.service.action.player.PREVIOUS"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 0
            goto L_0x004b
        L_0x004a:
            r7 = -1
        L_0x004b:
            if (r7 == 0) goto L_0x0097
            if (r7 == r4) goto L_0x008a
            if (r7 == r3) goto L_0x007d
            if (r7 == r2) goto L_0x0070
            if (r7 == r1) goto L_0x0063
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r5] = r8
            java.lang.String r8 = "PlayerActionProcessor cannot handle %s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            com.spotify.mobile.android.util.Assertion.b(r7)
            goto L_0x00a3
        L_0x0063:
            who<hpn> r7 = r6.a
            java.lang.Object r7 = r7.get()
            hpn r7 = (defpackage.hpn) r7
            boolean r5 = r7.c()
            goto L_0x00a3
        L_0x0070:
            who<hpn> r7 = r6.a
            java.lang.Object r7 = r7.get()
            hpn r7 = (defpackage.hpn) r7
            boolean r5 = r7.b()
            goto L_0x00a3
        L_0x007d:
            who<hpn> r7 = r6.a
            java.lang.Object r7 = r7.get()
            hpn r7 = (defpackage.hpn) r7
            boolean r5 = r7.a(r5)
            goto L_0x00a3
        L_0x008a:
            who<hpn> r7 = r6.a
            java.lang.Object r7 = r7.get()
            hpn r7 = (defpackage.hpn) r7
            boolean r5 = r7.a(r4)
            goto L_0x00a3
        L_0x0097:
            who<hpn> r7 = r6.a
            java.lang.Object r7 = r7.get()
            hpn r7 = (defpackage.hpn) r7
            boolean r5 = r7.a()
        L_0x00a3:
            if (r5 == 0) goto L_0x00a8
            com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor$Result r7 = com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result.PROCESSED
            return r7
        L_0x00a8:
            com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor$Result r7 = com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result.NOT_PROCESSED
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hox.a(boolean, android.content.Intent):com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor$Result");
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
