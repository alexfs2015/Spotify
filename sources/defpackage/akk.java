package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: akk reason: default package */
public final class akk {
    private static volatile akk c;
    final akj a;
    public aki b;
    private final mh d;
    /* access modifiers changed from: private */
    public AtomicBoolean e = new AtomicBoolean(false);
    private Date f = new Date(0);

    /* renamed from: akk$a */
    static class a {
        public String a;
        public int b;
        public Long c;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    private akk(mh mhVar, akj akj) {
        anl.a((Object) mhVar, "localBroadcastManager");
        anl.a((Object) akj, "accessTokenCache");
        this.d = mhVar;
        this.a = akj;
    }

    public static akk a() {
        if (c == null) {
            synchronized (akk.class) {
                if (c == null) {
                    c = new akk(mh.a(akq.g()), new akj());
                }
            }
        }
        return c;
    }

    private static akr a(aki aki, b bVar) {
        aki aki2 = aki;
        akr akr = new akr(aki2, "me/permissions", new Bundle(), HttpMethod.GET, bVar);
        return akr;
    }

    /* access modifiers changed from: private */
    public void a(defpackage.aki.a aVar) {
        aki aki = this.b;
        if (aki == null) {
            if (aVar != null) {
                new FacebookException("No current access token to refresh");
            }
        } else if (!this.e.compareAndSet(false, true)) {
            if (aVar != null) {
                new FacebookException("Refresh already in progress");
            }
        } else {
            this.f = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final a aVar2 = new a(0);
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final HashSet hashSet4 = hashSet;
            AnonymousClass2 r7 = r0;
            final HashSet hashSet5 = hashSet2;
            final HashSet hashSet6 = hashSet3;
            AnonymousClass2 r0 = new b() {
                public final void a(aku aku) {
                    JSONObject jSONObject = aku.a;
                    if (jSONObject != null) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("data");
                        if (optJSONArray != null) {
                            atomicBoolean2.set(true);
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("permission");
                                    String optString2 = optJSONObject.optString("status");
                                    if (!ank.a(optString) && !ank.a(optString2)) {
                                        String lowerCase = optString2.toLowerCase(Locale.US);
                                        if (lowerCase.equals("granted")) {
                                            hashSet4.add(optString);
                                        } else if (lowerCase.equals("declined")) {
                                            hashSet5.add(optString);
                                        } else if (lowerCase.equals("expired")) {
                                            hashSet6.add(optString);
                                        } else {
                                            new StringBuilder("Unexpected status: ").append(lowerCase);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            };
            akt akt = new akt(a(aki, (b) r7), b(aki, new b() {
                public final void a(aku aku) {
                    JSONObject jSONObject = aku.a;
                    if (jSONObject != null) {
                        aVar2.a = jSONObject.optString("access_token");
                        aVar2.b = jSONObject.optInt("expires_at");
                        aVar2.c = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    }
                }
            }));
            final aki aki2 = aki;
            final defpackage.aki.a aVar3 = aVar;
            final AtomicBoolean atomicBoolean3 = atomicBoolean;
            final a aVar4 = aVar2;
            final HashSet hashSet7 = hashSet;
            final HashSet hashSet8 = hashSet2;
            AnonymousClass4 r10 = r0;
            final HashSet hashSet9 = hashSet3;
            AnonymousClass4 r02 = new defpackage.akt.a() {
                /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0044=Splitter:B:18:0x0044, B:47:0x00e9=Splitter:B:47:0x00e9} */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a() {
                    /*
                        r17 = this;
                        r1 = r17
                        r2 = 0
                        akk r0 = defpackage.akk.a()     // Catch:{ all -> 0x00f6 }
                        aki r0 = r0.b     // Catch:{ all -> 0x00f6 }
                        if (r0 == 0) goto L_0x00e9
                        akk r0 = defpackage.akk.a()     // Catch:{ all -> 0x00f6 }
                        aki r0 = r0.b     // Catch:{ all -> 0x00f6 }
                        java.lang.String r0 = r0.i     // Catch:{ all -> 0x00f6 }
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.lang.String r3 = r3.i     // Catch:{ all -> 0x00f6 }
                        if (r0 == r3) goto L_0x001b
                        goto L_0x00e9
                    L_0x001b:
                        java.util.concurrent.atomic.AtomicBoolean r0 = r4     // Catch:{ all -> 0x00f6 }
                        boolean r0 = r0.get()     // Catch:{ all -> 0x00f6 }
                        if (r0 != 0) goto L_0x0044
                        akk$a r0 = r5     // Catch:{ all -> 0x00f6 }
                        java.lang.String r0 = r0.a     // Catch:{ all -> 0x00f6 }
                        if (r0 != 0) goto L_0x0044
                        akk$a r0 = r5     // Catch:{ all -> 0x00f6 }
                        int r0 = r0.b     // Catch:{ all -> 0x00f6 }
                        if (r0 != 0) goto L_0x0044
                        aki$a r0 = r3     // Catch:{ all -> 0x00f6 }
                        if (r0 == 0) goto L_0x003a
                        com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ all -> 0x00f6 }
                        java.lang.String r3 = "Failed to refresh access token"
                        r0.<init>(r3)     // Catch:{ all -> 0x00f6 }
                    L_0x003a:
                        akk r0 = defpackage.akk.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.e
                        r0.set(r2)
                        return
                    L_0x0044:
                        aki r0 = new aki     // Catch:{ all -> 0x00f6 }
                        akk$a r3 = r5     // Catch:{ all -> 0x00f6 }
                        java.lang.String r3 = r3.a     // Catch:{ all -> 0x00f6 }
                        if (r3 == 0) goto L_0x0051
                        akk$a r3 = r5     // Catch:{ all -> 0x00f6 }
                        java.lang.String r3 = r3.a     // Catch:{ all -> 0x00f6 }
                        goto L_0x0055
                    L_0x0051:
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.lang.String r3 = r3.e     // Catch:{ all -> 0x00f6 }
                    L_0x0055:
                        r4 = r3
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.lang.String r5 = r3.h     // Catch:{ all -> 0x00f6 }
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.lang.String r6 = r3.i     // Catch:{ all -> 0x00f6 }
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00f6 }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00f6 }
                        if (r3 == 0) goto L_0x0069
                        java.util.Set r3 = r6     // Catch:{ all -> 0x00f6 }
                        goto L_0x006d
                    L_0x0069:
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.util.Set<java.lang.String> r3 = r3.b     // Catch:{ all -> 0x00f6 }
                    L_0x006d:
                        r7 = r3
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00f6 }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00f6 }
                        if (r3 == 0) goto L_0x0079
                        java.util.Set r3 = r7     // Catch:{ all -> 0x00f6 }
                        goto L_0x007d
                    L_0x0079:
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.util.Set<java.lang.String> r3 = r3.c     // Catch:{ all -> 0x00f6 }
                    L_0x007d:
                        r8 = r3
                        java.util.concurrent.atomic.AtomicBoolean r3 = r4     // Catch:{ all -> 0x00f6 }
                        boolean r3 = r3.get()     // Catch:{ all -> 0x00f6 }
                        if (r3 == 0) goto L_0x0089
                        java.util.Set r3 = r8     // Catch:{ all -> 0x00f6 }
                        goto L_0x008d
                    L_0x0089:
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.util.Set<java.lang.String> r3 = r3.d     // Catch:{ all -> 0x00f6 }
                    L_0x008d:
                        r9 = r3
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        com.facebook.AccessTokenSource r10 = r3.f     // Catch:{ all -> 0x00f6 }
                        akk$a r3 = r5     // Catch:{ all -> 0x00f6 }
                        int r3 = r3.b     // Catch:{ all -> 0x00f6 }
                        r11 = 1000(0x3e8, double:4.94E-321)
                        if (r3 == 0) goto L_0x00a7
                        java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00f6 }
                        akk$a r13 = r5     // Catch:{ all -> 0x00f6 }
                        int r13 = r13.b     // Catch:{ all -> 0x00f6 }
                        long r13 = (long) r13     // Catch:{ all -> 0x00f6 }
                        long r13 = r13 * r11
                        r3.<init>(r13)     // Catch:{ all -> 0x00f6 }
                        goto L_0x00ab
                    L_0x00a7:
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.util.Date r3 = r3.a     // Catch:{ all -> 0x00f6 }
                    L_0x00ab:
                        r13 = r3
                        java.util.Date r14 = new java.util.Date     // Catch:{ all -> 0x00f6 }
                        r14.<init>()     // Catch:{ all -> 0x00f6 }
                        akk$a r3 = r5     // Catch:{ all -> 0x00f6 }
                        java.lang.Long r3 = r3.c     // Catch:{ all -> 0x00f6 }
                        if (r3 == 0) goto L_0x00c7
                        java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00f6 }
                        akk$a r15 = r5     // Catch:{ all -> 0x00f6 }
                        java.lang.Long r15 = r15.c     // Catch:{ all -> 0x00f6 }
                        long r15 = r15.longValue()     // Catch:{ all -> 0x00f6 }
                        long r11 = r11 * r15
                        r3.<init>(r11)     // Catch:{ all -> 0x00f6 }
                        goto L_0x00cb
                    L_0x00c7:
                        aki r3 = r2     // Catch:{ all -> 0x00f6 }
                        java.util.Date r3 = r3.j     // Catch:{ all -> 0x00f6 }
                    L_0x00cb:
                        r15 = r3
                        r3 = r0
                        r11 = r13
                        r12 = r14
                        r13 = r15
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00f6 }
                        akk r3 = defpackage.akk.a()     // Catch:{ all -> 0x00f6 }
                        r4 = 1
                        r3.a(r0, r4)     // Catch:{ all -> 0x00f6 }
                        akk r0 = defpackage.akk.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.e
                        r0.set(r2)
                        aki$a r0 = r3
                        if (r0 == 0) goto L_0x00e8
                    L_0x00e8:
                        return
                    L_0x00e9:
                        aki$a r0 = r3     // Catch:{ all -> 0x00f6 }
                        if (r0 == 0) goto L_0x003a
                        com.facebook.FacebookException r0 = new com.facebook.FacebookException     // Catch:{ all -> 0x00f6 }
                        java.lang.String r3 = "No current access token to refresh"
                        r0.<init>(r3)     // Catch:{ all -> 0x00f6 }
                        goto L_0x003a
                    L_0x00f6:
                        r0 = move-exception
                        akk r3 = defpackage.akk.this
                        java.util.concurrent.atomic.AtomicBoolean r3 = r3.e
                        r3.set(r2)
                        goto L_0x0102
                    L_0x0101:
                        throw r0
                    L_0x0102:
                        goto L_0x0101
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.akk.AnonymousClass4.a():void");
                }
            };
            akt.a((defpackage.akt.a) r10);
            akr.b(akt);
        }
    }

    private static akr b(aki aki, b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        aki aki2 = aki;
        akr akr = new akr(aki2, "oauth/access_token", bundle, HttpMethod.GET, bVar);
        return akr;
    }

    private static void c() {
        Context g = akq.g();
        aki a2 = aki.a();
        AlarmManager alarmManager = (AlarmManager) g.getSystemService("alarm");
        if (aki.b() && a2.a != null && alarmManager != null) {
            Intent intent = new Intent(g, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            alarmManager.set(1, a2.a.getTime(), PendingIntent.getBroadcast(g, 0, intent, 0));
        }
    }

    public void a(aki aki, aki aki2) {
        Intent intent = new Intent(akq.g(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aki);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aki2);
        this.d.a(intent);
    }

    /* access modifiers changed from: 0000 */
    public void a(aki aki, boolean z) {
        aki aki2 = this.b;
        this.b = aki;
        this.e.set(false);
        this.f = new Date(0);
        if (z) {
            if (aki != null) {
                this.a.a(aki);
            } else {
                this.a.b();
                ank.b(akq.g());
            }
        }
        if (!ank.a(aki2, aki)) {
            a(aki2, aki);
            c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            aki r0 = r6.b
            if (r0 == 0) goto L_0x0041
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            aki r1 = r6.b
            com.facebook.AccessTokenSource r1 = r1.f
            boolean r1 = r1.canExtendToken
            if (r1 == 0) goto L_0x0041
            long r1 = r0.longValue()
            java.util.Date r3 = r6.f
            long r3 = r3.getTime()
            long r1 = r1 - r3
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0041
            long r0 = r0.longValue()
            aki r2 = r6.b
            java.util.Date r2 = r2.g
            long r2 = r2.getTime()
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 != 0) goto L_0x0045
            return
        L_0x0045:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0058
            r6.a(r1)
            return
        L_0x0058:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            akk$1 r2 = new akk$1
            r2.<init>(r1)
            r0.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akk.b():void");
    }
}
