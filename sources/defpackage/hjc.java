package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: hjc reason: default package */
public final class hjc implements hjb {
    private final hpn a;
    private final Resources b;
    private final ConnectManager c;
    private final Player d;
    private final jkp e;
    private final jiy f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private final hkj h;
    private long i;

    public hjc(hpn hpn, Resources resources, ConnectManager connectManager, Player player, jkp jkp, jiy jiy, hkj hkj) {
        this.h = hkj;
        fbp.a(hpn);
        fbp.a(resources);
        fbp.a(connectManager);
        fbp.a(player);
        fbp.a(jkp);
        fbp.a(jiy);
        this.a = hpn;
        this.b = resources;
        this.c = connectManager;
        this.d = player;
        this.e = jkp;
        this.f = jiy;
    }

    private void a() {
        if (this.e.m.e) {
            Logger.b("Switching playback from speaker to local", new Object[0]);
            this.c.t();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.e.b.g()) {
            this.f.a(0);
        } else {
            this.f.a(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r0 != null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.KeyEvent r9, defpackage.hjb.a r10) {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0034
            int r0 = r9.getKeyCode()
            switch(r0) {
                case 272: goto L_0x0024;
                case 273: goto L_0x001e;
                case 274: goto L_0x0016;
                case 275: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0034
        L_0x000e:
            hpn r0 = r8.a
            r1 = -15000(0xffffffffffffc568, float:NaN)
            r0.a(r1)
            goto L_0x0034
        L_0x0016:
            hpn r0 = r8.a
            r1 = 15000(0x3a98, float:2.102E-41)
            r0.a(r1)
            goto L_0x0034
        L_0x001e:
            hpn r0 = r8.a
            r0.b()
            goto L_0x0034
        L_0x0024:
            jkp r0 = r8.e
            jip r0 = r0.q
            boolean r0 = r0.e
            if (r0 != 0) goto L_0x002f
            r8.a()
        L_0x002f:
            hpn r0 = r8.a
            r0.c()
        L_0x0034:
            if (r9 != 0) goto L_0x0037
            return
        L_0x0037:
            com.spotify.mobile.android.cosmos.player.v2.Player r0 = r8.d
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r0 = r0.getLastPlayerState()
            r1 = 0
            if (r0 == 0) goto L_0x0047
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r0.track()
            if (r0 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            int r9 = r9.getKeyCode()
            r2 = 79
            r3 = 1
            r4 = 0
            if (r9 == r2) goto L_0x00b5
            r1 = 126(0x7e, float:1.77E-43)
            if (r9 == r1) goto L_0x00a5
            r1 = 127(0x7f, float:1.78E-43)
            if (r9 == r1) goto L_0x0098
            switch(r9) {
                case 85: goto L_0x0088;
                case 86: goto L_0x0098;
                case 87: goto L_0x006e;
                case 88: goto L_0x005f;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0108
        L_0x005f:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "Handling Keycode Media Previous"
            com.spotify.base.java.logging.Logger.b(r10, r9)
            if (r0 == 0) goto L_0x0108
            hkj r9 = r8.h
            r9.b(r0)
            return
        L_0x006e:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "Handling Keycode Media Next"
            com.spotify.base.java.logging.Logger.b(r10, r9)
            jkp r9 = r8.e
            jip r9 = r9.q
            boolean r9 = r9.e
            if (r9 != 0) goto L_0x0080
            r8.a()
        L_0x0080:
            if (r0 == 0) goto L_0x0108
            hkj r9 = r8.h
            r9.a(r0)
            return
        L_0x0088:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r0 = "Handling Keycode Media Play/Pause"
            com.spotify.base.java.logging.Logger.b(r0, r9)
            hpn r9 = r8.a
            r9.a(r10)
            r8.a()
            return
        L_0x0098:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r0 = "Handling Keycode Media Pause/Stop"
            com.spotify.base.java.logging.Logger.b(r0, r9)
            hpn r9 = r8.a
            r9.a(r3, r10)
            return
        L_0x00a5:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r0 = "Handling Keycode Media Play"
            com.spotify.base.java.logging.Logger.b(r0, r9)
            hpn r9 = r8.a
            r9.a(r4, r10)
            r8.a()
            return
        L_0x00b5:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r10 = "Handling Keycode Headset Hook"
            com.spotify.base.java.logging.Logger.b(r10, r9)
            android.content.res.Resources r9 = r8.b
            r10 = 2131492885(0x7f0c0015, float:1.8609235E38)
            int r9 = r9.getInteger(r10)
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r8.i
            long r4 = r4 - r6
            long r9 = (long) r9
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f0
            android.os.Handler r9 = r8.g
            r9.removeCallbacksAndMessages(r1)
            hpn r9 = r8.a
            r9.c()
            jiy r9 = r8.f
            hqy r10 = r9.a
            java.lang.String r0 = r9.c
            r10.b(r0, r3)
            com.spotify.mobile.android.util.SensorRecorder r9 = r9.b
            com.spotify.mobile.android.util.SensorRecorder$RecordingPurpose r10 = com.spotify.mobile.android.util.SensorRecorder.RecordingPurpose.TRAINING
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r1 = "headphone_button_pressed"
            r9.a(r1, r10, r0)
            goto L_0x00ff
        L_0x00f0:
            hpn r0 = r8.a
            r0.a()
            android.os.Handler r0 = r8.g
            -$$Lambda$hjc$u4aojyuvKk_59OqdHfq7RYw4hCc r1 = new -$$Lambda$hjc$u4aojyuvKk_59OqdHfq7RYw4hCc
            r1.<init>(r8)
            r0.postDelayed(r1, r9)
        L_0x00ff:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r8.i = r9
            r8.a()
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjc.a(android.view.KeyEvent, hjb$a):void");
    }
}
