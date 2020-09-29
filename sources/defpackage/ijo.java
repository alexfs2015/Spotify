package defpackage;

import android.os.Handler;
import com.google.common.collect.ImmutableMap;
import com.moat.analytics.mobile.spot.MoatAdEvent;
import com.moat.analytics.mobile.spot.MoatAdEventType;
import com.moat.analytics.mobile.spot.ReactiveVideoTracker;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.video.VideoSurfaceView;

/* renamed from: ijo reason: default package */
public final class ijo implements ket {
    final ReactiveVideoTracker a;
    private final Ad b;
    private final Handler c;
    private VideoSurfaceView d;
    private boolean e;
    private long f;
    private boolean g;

    public ijo(ReactiveVideoTracker reactiveVideoTracker, Ad ad, Handler handler, VideoSurfaceView videoSurfaceView) {
        this.a = reactiveVideoTracker;
        this.b = ad;
        this.c = handler;
        this.d = videoSurfaceView;
    }

    private ImmutableMap<String, String> b() {
        String str = "";
        String advertiserId = this.b.getAdvertiserId() == null ? str : this.b.getAdvertiserId();
        String orderId = this.b.getOrderId() == null ? str : this.b.getOrderId();
        String lineItemId = this.b.lineItemId() == null ? str : this.b.lineItemId();
        if (this.b.creativeId() != null) {
            str = this.b.creativeId();
        }
        return ImmutableMap.a("level1", advertiserId, "level2", orderId, "level3", lineItemId, "level4", str);
    }

    private void c() {
        this.a.trackVideoAd(b(), Integer.valueOf((int) this.f), this.d);
        this.e = true;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Long.valueOf(this.f);
        if (this.d == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Logger.b("MOAT_SDK - tracking started. Duration: %d%n, SurfaceView==null? : %b%n", objArr);
    }

    public final void a() {
        this.c.post(new Runnable() {
            public final void run() {
                ijo.this.a.dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
                Logger.b("MOAT_EVENT - %s", MoatAdEventType.AD_EVT_COMPLETE);
                ijo.this.a.stopTracking();
                Logger.b("MOAT_SDK - tracking stopped", new Object[0]);
            }
        });
    }

    public final void a(long j) {
        this.f = j;
        if (this.d != null && !this.e) {
            c();
        }
    }

    public final void a(VideoSurfaceView videoSurfaceView, boolean z) {
        if (videoSurfaceView != null) {
            this.d = videoSurfaceView;
            if (!this.e && this.f != 0) {
                c();
            }
        }
        this.a.changeTargetView(videoSurfaceView);
        if (this.g != z) {
            this.a.dispatchEvent(new MoatAdEvent(z ? MoatAdEventType.AD_EVT_ENTER_FULLSCREEN : MoatAdEventType.AD_EVT_EXIT_FULLSCREEN));
        }
        this.g = z;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final java.lang.String r8, long r9) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1941887438: goto L_0x0040;
                case -1897185151: goto L_0x0036;
                case -1638835128: goto L_0x002c;
                case -995321554: goto L_0x0022;
                case -651914917: goto L_0x0018;
                case 1097547223: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "resumed"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 4
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "third_quartile"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 3
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "paused"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 5
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "midpoint"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "started"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "first_quartile"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = -1
        L_0x004b:
            if (r0 == 0) goto L_0x00a2
            if (r0 == r6) goto L_0x0095
            if (r0 == r5) goto L_0x0088
            if (r0 == r4) goto L_0x007b
            if (r0 == r3) goto L_0x006e
            if (r0 == r2) goto L_0x0061
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r1] = r8
            java.lang.String r8 = "MOAT_SDK - Unknown event to moat: %s"
            com.spotify.base.java.logging.Logger.b(r8, r9)
            return
        L_0x0061:
            com.moat.analytics.mobile.spot.MoatAdEvent r0 = new com.moat.analytics.mobile.spot.MoatAdEvent
            com.moat.analytics.mobile.spot.MoatAdEventType r1 = com.moat.analytics.mobile.spot.MoatAdEventType.AD_EVT_PAUSED
            int r10 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.<init>(r1, r9)
            goto L_0x00ae
        L_0x006e:
            com.moat.analytics.mobile.spot.MoatAdEvent r0 = new com.moat.analytics.mobile.spot.MoatAdEvent
            com.moat.analytics.mobile.spot.MoatAdEventType r1 = com.moat.analytics.mobile.spot.MoatAdEventType.AD_EVT_PLAYING
            int r10 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.<init>(r1, r9)
            goto L_0x00ae
        L_0x007b:
            com.moat.analytics.mobile.spot.MoatAdEvent r0 = new com.moat.analytics.mobile.spot.MoatAdEvent
            com.moat.analytics.mobile.spot.MoatAdEventType r1 = com.moat.analytics.mobile.spot.MoatAdEventType.AD_EVT_THIRD_QUARTILE
            int r10 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.<init>(r1, r9)
            goto L_0x00ae
        L_0x0088:
            com.moat.analytics.mobile.spot.MoatAdEvent r0 = new com.moat.analytics.mobile.spot.MoatAdEvent
            com.moat.analytics.mobile.spot.MoatAdEventType r1 = com.moat.analytics.mobile.spot.MoatAdEventType.AD_EVT_MID_POINT
            int r10 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.<init>(r1, r9)
            goto L_0x00ae
        L_0x0095:
            com.moat.analytics.mobile.spot.MoatAdEvent r0 = new com.moat.analytics.mobile.spot.MoatAdEvent
            com.moat.analytics.mobile.spot.MoatAdEventType r1 = com.moat.analytics.mobile.spot.MoatAdEventType.AD_EVT_FIRST_QUARTILE
            int r10 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.<init>(r1, r9)
            goto L_0x00ae
        L_0x00a2:
            com.moat.analytics.mobile.spot.MoatAdEvent r0 = new com.moat.analytics.mobile.spot.MoatAdEvent
            com.moat.analytics.mobile.spot.MoatAdEventType r1 = com.moat.analytics.mobile.spot.MoatAdEventType.AD_EVT_START
            int r10 = (int) r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0.<init>(r1, r9)
        L_0x00ae:
            android.os.Handler r9 = r7.c
            ijo$1 r10 = new ijo$1
            r10.<init>(r0, r8)
            r9.post(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijo.a(java.lang.String, long):void");
    }
}
