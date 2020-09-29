package defpackage;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fgj reason: default package */
public final class fgj {
    private final Executor a;
    private final Map<Pair<String, String>, exi<String>> b = new dp();

    public fgj(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.exi<java.lang.String> a(java.lang.String r3, java.lang.String r4, defpackage.fgl r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x006f }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x006f }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, exi<java.lang.String>> r3 = r2.b     // Catch:{ all -> 0x006f }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x006f }
            exi r3 = (defpackage.exi) r3     // Catch:{ all -> 0x006f }
            r4 = 3
            if (r3 == 0) goto L_0x0036
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x006f }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x006f }
            int r5 = r5.length()     // Catch:{ all -> 0x006f }
            int r5 = r5 + 29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r0.<init>(r5)     // Catch:{ all -> 0x006f }
            java.lang.String r5 = "Joining ongoing request for: "
            r0.append(r5)     // Catch:{ all -> 0x006f }
            r0.append(r4)     // Catch:{ all -> 0x006f }
        L_0x0034:
            monitor-exit(r2)
            return r3
        L_0x0036:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0059
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x006f }
            int r4 = r4.length()     // Catch:{ all -> 0x006f }
            int r4 = r4 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r1.<init>(r4)     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "Making new request for: "
            r1.append(r4)     // Catch:{ all -> 0x006f }
            r1.append(r3)     // Catch:{ all -> 0x006f }
        L_0x0059:
            exi r3 = r5.a()     // Catch:{ all -> 0x006f }
            java.util.concurrent.Executor r4 = r2.a     // Catch:{ all -> 0x006f }
            fgk r5 = new fgk     // Catch:{ all -> 0x006f }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x006f }
            exi r3 = r3.b(r4, r5)     // Catch:{ all -> 0x006f }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, exi<java.lang.String>> r4 = r2.b     // Catch:{ all -> 0x006f }
            r4.put(r0, r3)     // Catch:{ all -> 0x006f }
            monitor-exit(r2)
            return r3
        L_0x006f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgj.a(java.lang.String, java.lang.String, fgl):exi");
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ exi a(Pair pair, exi exi) {
        synchronized (this) {
            this.b.remove(pair);
        }
        return exi;
    }
}
