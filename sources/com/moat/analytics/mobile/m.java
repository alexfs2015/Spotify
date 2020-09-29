package com.moat.analytics.mobile;

import org.json.JSONObject;

abstract class m<PlayerOrIMAAd> extends f<PlayerOrIMAAd> {
    protected o j = o.UNINITIALIZED;
    protected int k = Integer.MIN_VALUE;
    protected double l = Double.NaN;
    protected int m = Integer.MIN_VALUE;
    protected int n = Integer.MIN_VALUE;
    private int o = 0;

    public m(String str, a aVar, ap apVar) {
        super(str, aVar, apVar);
    }

    /* access modifiers changed from: protected */
    public JSONObject a(MoatAdEvent moatAdEvent) {
        Integer num;
        if (!moatAdEvent.adPlayhead.equals(MoatAdEvent.TIME_UNAVAILABLE)) {
            num = moatAdEvent.adPlayhead;
        } else {
            try {
                num = g();
            } catch (Exception unused) {
                num = Integer.valueOf(this.k);
            }
            moatAdEvent.adPlayhead = num;
        }
        if (moatAdEvent.eventType == MoatAdEventType.AD_EVT_COMPLETE) {
            if (num.intValue() != Integer.MIN_VALUE) {
                int i = this.n;
                if (i != Integer.MIN_VALUE && a(num, Integer.valueOf(i))) {
                    this.j = o.COMPLETED;
                }
            }
            this.j = o.STOPPED;
            moatAdEvent.eventType = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.a(moatAdEvent);
    }

    /* access modifiers changed from: protected */
    public void b() {
        super.b();
        this.d.postDelayed(new n(this), 200);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093 A[Catch:{ Exception -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[Catch:{ Exception -> 0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5 A[Catch:{ Exception -> 0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f() {
        /*
            r12 = this;
            java.lang.ref.WeakReference r0 = r12.f
            java.lang.Object r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r12.e()
            if (r0 == 0) goto L_0x0011
            goto L_0x00d5
        L_0x0011:
            r0 = 1
            java.lang.Integer r2 = r12.g()     // Catch:{ Exception -> 0x00ca }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x00ca }
            r12.k = r2     // Catch:{ Exception -> 0x00ca }
            if (r2 != 0) goto L_0x001f
            return r0
        L_0x001f:
            java.lang.Integer r3 = r12.i()     // Catch:{ Exception -> 0x00ca }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x00ca }
            boolean r4 = r12.h()     // Catch:{ Exception -> 0x00ca }
            double r5 = (double) r3
            r7 = 4616189618054758400(0x4010000000000000, double:4.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r7
            double r7 = r12.d()     // Catch:{ Exception -> 0x00ca }
            r9 = 0
            int r10 = r12.m     // Catch:{ Exception -> 0x00ca }
            if (r2 <= r10) goto L_0x003d
            r12.m = r2     // Catch:{ Exception -> 0x00ca }
        L_0x003d:
            int r10 = r12.n     // Catch:{ Exception -> 0x00ca }
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r11) goto L_0x0045
            r12.n = r3     // Catch:{ Exception -> 0x00ca }
        L_0x0045:
            if (r4 == 0) goto L_0x0086
            com.moat.analytics.mobile.o r3 = r12.j     // Catch:{ Exception -> 0x00ca }
            com.moat.analytics.mobile.o r4 = com.moat.analytics.mobile.o.UNINITIALIZED     // Catch:{ Exception -> 0x00ca }
            if (r3 != r4) goto L_0x0054
            com.moat.analytics.mobile.MoatAdEventType r9 = com.moat.analytics.mobile.MoatAdEventType.AD_EVT_START     // Catch:{ Exception -> 0x00ca }
            com.moat.analytics.mobile.o r3 = com.moat.analytics.mobile.o.PLAYING     // Catch:{ Exception -> 0x00ca }
        L_0x0051:
            r12.j = r3     // Catch:{ Exception -> 0x00ca }
            goto L_0x0091
        L_0x0054:
            com.moat.analytics.mobile.o r3 = r12.j     // Catch:{ Exception -> 0x00ca }
            com.moat.analytics.mobile.o r4 = com.moat.analytics.mobile.o.PAUSED     // Catch:{ Exception -> 0x00ca }
            if (r3 != r4) goto L_0x005f
            com.moat.analytics.mobile.MoatAdEventType r9 = com.moat.analytics.mobile.MoatAdEventType.AD_EVT_PLAYING     // Catch:{ Exception -> 0x00ca }
            com.moat.analytics.mobile.o r3 = com.moat.analytics.mobile.o.PLAYING     // Catch:{ Exception -> 0x00ca }
            goto L_0x0051
        L_0x005f:
            double r3 = (double) r2
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r5
            double r3 = java.lang.Math.floor(r3)     // Catch:{ Exception -> 0x00ca }
            int r3 = (int) r3     // Catch:{ Exception -> 0x00ca }
            int r3 = r3 - r0
            if (r3 < 0) goto L_0x0091
            r4 = 3
            if (r3 >= r4) goto L_0x0091
            com.moat.analytics.mobile.MoatAdEventType[] r4 = b     // Catch:{ Exception -> 0x00ca }
            r3 = r4[r3]     // Catch:{ Exception -> 0x00ca }
            java.util.Map r4 = r12.c     // Catch:{ Exception -> 0x00ca }
            boolean r4 = r4.containsKey(r3)     // Catch:{ Exception -> 0x00ca }
            if (r4 != 0) goto L_0x0091
            java.util.Map r4 = r12.c     // Catch:{ Exception -> 0x00ca }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00ca }
            r4.put(r3, r5)     // Catch:{ Exception -> 0x00ca }
            r9 = r3
            goto L_0x0091
        L_0x0086:
            com.moat.analytics.mobile.o r3 = r12.j     // Catch:{ Exception -> 0x00ca }
            com.moat.analytics.mobile.o r4 = com.moat.analytics.mobile.o.PAUSED     // Catch:{ Exception -> 0x00ca }
            if (r3 == r4) goto L_0x0091
            com.moat.analytics.mobile.MoatAdEventType r9 = com.moat.analytics.mobile.MoatAdEventType.AD_EVT_PAUSED     // Catch:{ Exception -> 0x00ca }
            com.moat.analytics.mobile.o r3 = com.moat.analytics.mobile.o.PAUSED     // Catch:{ Exception -> 0x00ca }
            goto L_0x0051
        L_0x0091:
            if (r9 == 0) goto L_0x0095
            r3 = 1
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            if (r3 != 0) goto L_0x00b3
            double r4 = r12.l     // Catch:{ Exception -> 0x00ca }
            boolean r4 = java.lang.Double.isNaN(r4)     // Catch:{ Exception -> 0x00ca }
            if (r4 != 0) goto L_0x00b3
            double r4 = r12.l     // Catch:{ Exception -> 0x00ca }
            double r4 = r4 - r7
            double r4 = java.lang.Math.abs(r4)     // Catch:{ Exception -> 0x00ca }
            r10 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b3
            com.moat.analytics.mobile.MoatAdEventType r9 = com.moat.analytics.mobile.MoatAdEventType.AD_EVT_VOLUME_CHANGE     // Catch:{ Exception -> 0x00ca }
            r3 = 1
        L_0x00b3:
            if (r3 == 0) goto L_0x00c5
            com.moat.analytics.mobile.MoatAdEvent r3 = new com.moat.analytics.mobile.MoatAdEvent     // Catch:{ Exception -> 0x00ca }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00ca }
            java.lang.Double r4 = java.lang.Double.valueOf(r7)     // Catch:{ Exception -> 0x00ca }
            r3.<init>(r9, r2, r4)     // Catch:{ Exception -> 0x00ca }
            r12.dispatchEvent(r3)     // Catch:{ Exception -> 0x00ca }
        L_0x00c5:
            r12.l = r7     // Catch:{ Exception -> 0x00ca }
            r12.o = r1     // Catch:{ Exception -> 0x00ca }
            return r0
        L_0x00ca:
            int r2 = r12.o
            int r3 = r2 + 1
            r12.o = r3
            r3 = 5
            if (r2 >= r3) goto L_0x00d5
            return r0
        L_0x00d5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moat.analytics.mobile.m.f():boolean");
    }

    /* access modifiers changed from: protected */
    public abstract Integer g();

    /* access modifiers changed from: protected */
    public abstract boolean h();

    /* access modifiers changed from: protected */
    public abstract Integer i();

    /* access modifiers changed from: protected */
    public o j() {
        return this.j;
    }
}
