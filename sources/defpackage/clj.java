package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

@cey
/* renamed from: clj reason: default package */
public final class clj {
    int a = -1;
    private long b = -1;
    private long c = -1;
    private int d = -1;
    private long e = 0;
    private final Object f = new Object();
    private final String g;
    private int h = 0;
    private int i = 0;

    public clj(String str) {
        this.g = str;
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.g);
            bundle.putLong("basets", this.c);
            bundle.putLong("currts", this.b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.d);
            bundle.putInt("preqs_in_session", this.a);
            bundle.putLong("time_in_session", this.e);
            bundle.putInt("pclick", this.h);
            bundle.putInt("pimp", this.i);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.f) {
            this.h++;
        }
    }

    public final void b() {
        synchronized (this.f) {
            this.i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.doy r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            cle r1 = defpackage.bjl.i()     // Catch:{ all -> 0x00bd }
            clw r1 = r1.g()     // Catch:{ all -> 0x00bd }
            long r1 = r1.k()     // Catch:{ all -> 0x00bd }
            bzg r3 = defpackage.bjl.l()     // Catch:{ all -> 0x00bd }
            long r3 = r3.a()     // Catch:{ all -> 0x00bd }
            long r5 = r10.c     // Catch:{ all -> 0x00bd }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x004b
            long r1 = r3 - r1
            dsf<java.lang.Long> r5 = defpackage.dsp.aG     // Catch:{ all -> 0x00bd }
            dsn r6 = defpackage.dpn.f()     // Catch:{ all -> 0x00bd }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ all -> 0x00bd }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x00bd }
            long r5 = r5.longValue()     // Catch:{ all -> 0x00bd }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0039
            r1 = -1
            r10.a = r1     // Catch:{ all -> 0x00bd }
            goto L_0x0047
        L_0x0039:
            cle r1 = defpackage.bjl.i()     // Catch:{ all -> 0x00bd }
            clw r1 = r1.g()     // Catch:{ all -> 0x00bd }
            int r1 = r1.l()     // Catch:{ all -> 0x00bd }
            r10.a = r1     // Catch:{ all -> 0x00bd }
        L_0x0047:
            r10.c = r12     // Catch:{ all -> 0x00bd }
            long r12 = r10.c     // Catch:{ all -> 0x00bd }
        L_0x004b:
            r10.b = r12     // Catch:{ all -> 0x00bd }
            r12 = 1
            if (r11 == 0) goto L_0x0061
            android.os.Bundle r13 = r11.c     // Catch:{ all -> 0x00bd }
            if (r13 == 0) goto L_0x0061
            android.os.Bundle r11 = r11.c     // Catch:{ all -> 0x00bd }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x00bd }
            if (r11 != r12) goto L_0x0061
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x0061:
            int r11 = r10.d     // Catch:{ all -> 0x00bd }
            int r11 = r11 + r12
            r10.d = r11     // Catch:{ all -> 0x00bd }
            int r11 = r10.a     // Catch:{ all -> 0x00bd }
            int r11 = r11 + r12
            r10.a = r11     // Catch:{ all -> 0x00bd }
            int r11 = r10.a     // Catch:{ all -> 0x00bd }
            if (r11 != 0) goto L_0x00ac
            r11 = 0
            r10.e = r11     // Catch:{ all -> 0x00bd }
            cle r11 = defpackage.bjl.i()     // Catch:{ all -> 0x00bd }
            clw r11 = r11.g()     // Catch:{ all -> 0x00bd }
            r11.a()     // Catch:{ all -> 0x00bd }
            java.lang.Object r12 = r11.a     // Catch:{ all -> 0x00bd }
            monitor-enter(r12)     // Catch:{ all -> 0x00bd }
            long r1 = r11.m     // Catch:{ all -> 0x00a9 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0089
        L_0x0087:
            monitor-exit(r12)     // Catch:{ all -> 0x00a9 }
            goto L_0x00bb
        L_0x0089:
            r11.m = r3     // Catch:{ all -> 0x00a9 }
            android.content.SharedPreferences$Editor r13 = r11.d     // Catch:{ all -> 0x00a9 }
            if (r13 == 0) goto L_0x009b
            android.content.SharedPreferences$Editor r13 = r11.d     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "first_ad_req_time_ms"
            r13.putLong(r1, r3)     // Catch:{ all -> 0x00a9 }
            android.content.SharedPreferences$Editor r13 = r11.d     // Catch:{ all -> 0x00a9 }
            r13.apply()     // Catch:{ all -> 0x00a9 }
        L_0x009b:
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ all -> 0x00a9 }
            r13.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "first_ad_req_time_ms"
            r13.putLong(r1, r3)     // Catch:{ all -> 0x00a9 }
            r11.a(r13)     // Catch:{ all -> 0x00a9 }
            goto L_0x0087
        L_0x00a9:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00a9 }
            throw r11     // Catch:{ all -> 0x00bd }
        L_0x00ac:
            cle r11 = defpackage.bjl.i()     // Catch:{ all -> 0x00bd }
            clw r11 = r11.g()     // Catch:{ all -> 0x00bd }
            long r11 = r11.m()     // Catch:{ all -> 0x00bd }
            long r3 = r3 - r11
            r10.e = r3     // Catch:{ all -> 0x00bd }
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x00bd:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00c1
        L_0x00c0:
            throw r11
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clj.a(doy, long):void");
    }

    private static boolean a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            cow.a(4);
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            cow.a(4);
            return false;
        } catch (NameNotFoundException unused) {
            cow.a(5);
            cow.a(4);
            return false;
        }
    }
}
