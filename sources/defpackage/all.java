package defpackage;

import com.facebook.appevents.AppEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: all reason: default package */
final class all {
    private List<AppEvent> a = new ArrayList();
    private List<AppEvent> b = new ArrayList();
    private int c;
    private ami d;
    private String e;
    private final int f = 1000;

    public all(ami ami, String str) {
        this.d = ami;
        this.e = str;
    }

    public final synchronized int a() {
        return this.a.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = com.facebook.appevents.internal.AppEventsLoggerUtility.a(com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, r5.d, r5.e, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r5.c <= 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r7.put("num_skipped_events", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r7 = new org.json.JSONObject();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.akr r6, android.content.Context r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.c     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r1 = r5.b     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r2 = r5.a     // Catch:{ all -> 0x0084 }
            r1.addAll(r2)     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r1 = r5.a     // Catch:{ all -> 0x0084 }
            r1.clear()     // Catch:{ all -> 0x0084 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x0084 }
            r1.<init>()     // Catch:{ all -> 0x0084 }
            java.util.List<com.facebook.appevents.AppEvent> r2 = r5.b     // Catch:{ all -> 0x0084 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0084 }
        L_0x001a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0084 }
            com.facebook.appevents.AppEvent r3 = (com.facebook.appevents.AppEvent) r3     // Catch:{ all -> 0x0084 }
            boolean r4 = r3.a()     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0038
            if (r8 != 0) goto L_0x0032
            boolean r4 = r3.isImplicit     // Catch:{ all -> 0x0084 }
            if (r4 != 0) goto L_0x001a
        L_0x0032:
            org.json.JSONObject r3 = r3.jsonObject     // Catch:{ all -> 0x0084 }
            r1.put(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x001a
        L_0x0038:
            java.lang.String r4 = "Event with invalid checksum: %s"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0084 }
            defpackage.ank.b(r4, r3)     // Catch:{ all -> 0x0084 }
            goto L_0x001a
        L_0x0042:
            int r8 = r1.length()     // Catch:{ all -> 0x0084 }
            if (r8 != 0) goto L_0x004b
            r6 = 0
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            return r6
        L_0x004b:
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType r8 = com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x0060 }
            ami r2 = r5.d     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r3 = r5.e     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONObject r7 = com.facebook.appevents.internal.AppEventsLoggerUtility.a(r8, r2, r3, r9, r7)     // Catch:{ JSONException -> 0x0060 }
            int r8 = r5.c     // Catch:{ JSONException -> 0x0060 }
            if (r8 <= 0) goto L_0x0065
            java.lang.String r8 = "num_skipped_events"
            r7.put(r8, r0)     // Catch:{ JSONException -> 0x0060 }
            goto L_0x0065
        L_0x0060:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
        L_0x0065:
            r6.c = r7
            android.os.Bundle r7 = r6.d
            if (r7 != 0) goto L_0x0070
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L_0x0070:
            java.lang.String r8 = r1.toString()
            if (r8 == 0) goto L_0x007d
            java.lang.String r9 = "custom_events"
            r7.putString(r9, r8)
            r6.f = r8
        L_0x007d:
            r6.d = r7
            int r6 = r1.length()
            return r6
        L_0x0084:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0087:
            throw r6
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.all.a(akr, android.content.Context, boolean, boolean):int");
    }

    public final synchronized void a(AppEvent appEvent) {
        if (this.a.size() + this.b.size() >= 1000) {
            this.c++;
        } else {
            this.a.add(appEvent);
        }
    }

    public final synchronized void a(boolean z) {
        if (z) {
            this.a.addAll(this.b);
        }
        this.b.clear();
        this.c = 0;
    }

    public final synchronized List<AppEvent> b() {
        List<AppEvent> list;
        list = this.a;
        this.a = new ArrayList();
        return list;
    }
}
