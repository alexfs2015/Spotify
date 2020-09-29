package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.Map;

/* renamed from: fho reason: default package */
public final class fho {
    private int a = 0;
    private final Map<Integer, eya<Void>> b = new dp();
    private final fhj c;

    public fho(fhj fhj) {
        this.c = fhj;
    }

    private static boolean a(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c2 = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            c2 = 1;
                        }
                    }
                } else if (str2.equals("S")) {
                    c2 = 0;
                }
                String str4 = "token not available";
                if (c2 == 0) {
                    fhk e = firebaseInstanceId.e();
                    if (e == null || e.b(firebaseInstanceId.d.b())) {
                        throw new IOException(str4);
                    }
                    firebaseInstanceId.a(firebaseInstanceId.e.b(FirebaseInstanceId.d(), e.a, str3));
                    boolean f = FirebaseInstanceId.f();
                } else if (c2 == 1) {
                    fhk e2 = firebaseInstanceId.e();
                    if (e2 == null || e2.b(firebaseInstanceId.d.b())) {
                        throw new IOException(str4);
                    }
                    firebaseInstanceId.a(firebaseInstanceId.e.c(FirebaseInstanceId.d(), e2.a, str3));
                    FirebaseInstanceId.f();
                }
            } catch (IOException e3) {
                String str5 = "Topic sync failed: ";
                String valueOf = String.valueOf(e3.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean a(String str) {
        synchronized (this.c) {
            String a2 = this.c.a();
            String str2 = ",";
            String valueOf = String.valueOf(str);
            if (!a2.startsWith(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))) {
                return false;
            }
            String str3 = ",";
            String valueOf2 = String.valueOf(str);
            this.c.a(a2.substring((valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3)).length()));
            return true;
        }
    }

    private final String b() {
        String a2;
        synchronized (this.c) {
            a2 = this.c.a();
        }
        if (!TextUtils.isEmpty(a2)) {
            String[] split = a2.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    public final synchronized boolean a() {
        return b() != null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = (defpackage.eya) r4.b.remove(java.lang.Integer.valueOf(r4.a));
        a(r0);
        r4.a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r2.a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (a(r5, r0) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.b()     // Catch:{ all -> 0x0038 }
            r1 = 1
            if (r0 != 0) goto L_0x000d
            com.google.firebase.iid.FirebaseInstanceId.f()     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            return r1
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            boolean r2 = a(r5, r0)
            if (r2 != 0) goto L_0x0016
            r5 = 0
            return r5
        L_0x0016:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, eya<java.lang.Void>> r2 = r4.b     // Catch:{ all -> 0x0035 }
            int r3 = r4.a     // Catch:{ all -> 0x0035 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x0035 }
            eya r2 = (defpackage.eya) r2     // Catch:{ all -> 0x0035 }
            r4.a(r0)     // Catch:{ all -> 0x0035 }
            int r0 = r4.a     // Catch:{ all -> 0x0035 }
            int r0 = r0 + r1
            r4.a = r0     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.a(r0)
            goto L_0x0000
        L_0x0035:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r5
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x003b:
            throw r5
        L_0x003c:
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fho.a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }
}
