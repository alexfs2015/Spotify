package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SensorRecorder;

/* renamed from: jgs reason: default package */
public final class jgs {
    rqi a;
    final igh b;
    final SensorRecorder c;
    private wuk d;

    public jgs(wud<String> wud, rqi rqi, igh igh, SensorRecorder sensorRecorder) {
        this.b = igh;
        this.c = sensorRecorder;
        this.d = wud.j(new $$Lambda$jgs$2xGI6n9t09fBf0eUqx2hr48k1k(this)).a((wun<? super T>) new $$Lambda$jgs$ER_cSCVxGsP2pCzjhz0dZJUfb8<Object>(this, rqi), (wun<Throwable>) $$Lambda$jgs$KIZ1UnnhVnt77eAq9qME8vP_o.INSTANCE);
    }

    public final void a() {
        this.b.a();
        wuk wuk = this.d;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        this.d = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rqi rqi, String str) {
        String str2 = "bluetooth";
        a aVar = new a(str2);
        aVar.b(str2);
        aVar.c("car");
        aVar.e(rqi.g);
        aVar.d(rqi.f);
        aVar.a(rqi.c);
        this.a = aVar.a();
        try {
            this.b.a(this.a);
        } catch (JsonProcessingException e) {
            Assertion.a("Could not connect BT car as external accessory", (Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ java.lang.Boolean a(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            java.lang.String r1 = "car"
            r2 = 2
            r3 = 1
            switch(r0) {
                case -2010949979: goto L_0x0028;
                case -2008522753: goto L_0x001e;
                case -284840886: goto L_0x0014;
                case 98260: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0032
        L_0x000c:
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0033
        L_0x0014:
            java.lang.String r0 = "unknown"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 3
            goto L_0x0033
        L_0x001e:
            java.lang.String r0 = "speaker"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 2
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "headphones"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = -1
        L_0x0033:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            if (r0 == r2) goto L_0x003c
            java.lang.String r0 = "bt_connected_unknown"
            goto L_0x0044
        L_0x003c:
            java.lang.String r0 = "bt_connected_speaker"
            goto L_0x0044
        L_0x003f:
            java.lang.String r0 = "bt_connected_headphones"
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "bt_connected_car"
        L_0x0044:
            com.spotify.mobile.android.util.SensorRecorder r2 = r5.c
            com.spotify.mobile.android.util.SensorRecorder$RecordingPurpose r3 = com.spotify.mobile.android.util.SensorRecorder.RecordingPurpose.TRAINING
            r4 = 180000(0x2bf20, float:2.52234E-40)
            r2.a(r0, r3, r4)
            boolean r6 = r1.equals(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgs.a(java.lang.String):java.lang.Boolean");
    }
}
