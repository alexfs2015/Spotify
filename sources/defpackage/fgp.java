package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: fgp reason: default package */
public final class fgp {
    private final SharedPreferences a;
    private final Context b;
    private final fhr c;
    private final Map<String, fhs> d;

    public fgp(Context context) {
        this(context, new fhr());
    }

    private fgp(Context context, fhr fhr) {
        this.d = new dp();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = fhr;
        File file = new File(fr.b(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    b();
                    FirebaseInstanceId.a().g();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                        return;
                    }
                    new String(str);
                }
            }
        }
    }

    public final synchronized String a() {
        return this.a.getString("topic_operaion_queue", "");
    }

    public final synchronized void a(String str) {
        this.a.edit().putString("topic_operaion_queue", str).apply();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void b() {
        File[] listFiles;
        this.d.clear();
        for (File file : fhr.a(this.b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }

    public final synchronized fgq a(String str, String str2, String str3) {
        return fgq.a(this.a.getString(b(str, str2, str3), null));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a2 = fgq.a(str4, str5, System.currentTimeMillis());
        if (a2 != null) {
            Editor edit = this.a.edit();
            edit.putString(b(str, str2, str3), a2);
            edit.commit();
        }
    }

    /* JADX INFO: used method not loaded: fhr.a(android.content.Context, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        com.google.firebase.iid.FirebaseInstanceId.a().g();
        r2 = r3.c.a(r3.b, r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.fhs b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, fhs> r0 = r3.d     // Catch:{ all -> 0x0033 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0033 }
            fhs r0 = (defpackage.fhs) r0     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r3)
            return r0
        L_0x000d:
            fhr r0 = r3.c     // Catch:{ zzaa -> 0x001d }
            android.content.Context r1 = r3.b     // Catch:{ zzaa -> 0x001d }
            fhs r2 = r0.b(r1, r4)     // Catch:{ zzaa -> 0x001d }
            if (r2 == 0) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            fhs r2 = r0.a(r1, r4)     // Catch:{ zzaa -> 0x001d }
            goto L_0x002c
        L_0x001d:
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.a()     // Catch:{ all -> 0x0033 }
            r0.g()     // Catch:{ all -> 0x0033 }
            fhr r0 = r3.c     // Catch:{ all -> 0x0033 }
            android.content.Context r1 = r3.b     // Catch:{ all -> 0x0033 }
            fhs r2 = r0.a(r1, r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            java.util.Map<java.lang.String, fhs> r0 = r3.d     // Catch:{ all -> 0x0033 }
            r0.put(r4, r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)
            return r2
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgp.b(java.lang.String):fhs");
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
