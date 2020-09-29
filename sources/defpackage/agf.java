package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* renamed from: agf reason: default package */
public abstract class agf {
    private static final agi b = agi.a("kju.remoting");
    protected String a;
    private Set<BroadcastReceiver> c;

    public abstract void m();

    public abstract void n();

    public final void j(String str) {
        this.a = str;
    }

    public final void a(String str, BroadcastReceiver broadcastReceiver) {
        Context applicationContext = agg.a(this.a).a.getApplicationContext();
        b.a("subscribe(%s, %s, %s)...", applicationContext, str, broadcastReceiver);
        applicationContext.registerReceiver(broadcastReceiver, new IntentFilter(str));
        if (this.c == null) {
            this.c = new HashSet();
        }
        this.c.add(broadcastReceiver);
        b.a("subscribe(%s) OK!", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = new java.lang.Object[]{r7};
        b.a.c("Error unregistering receiver: %s", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r6.c.remove(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.BroadcastReceiver r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.a
            agg r0 = defpackage.agg.a(r0)
            android.content.Context r0 = r0.a
            android.content.Context r0 = r0.getApplicationContext()
            agi r1 = b
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r4 = 1
            r2[r4] = r7
            java.lang.String r5 = "unsubscribe(%s, %s)..."
            r1.a(r5, r2)
            java.util.Set<android.content.BroadcastReceiver> r1 = r6.c     // Catch:{ IllegalArgumentException -> 0x0046 }
            boolean r1 = r1.contains(r7)     // Catch:{ IllegalArgumentException -> 0x0046 }
            if (r1 == 0) goto L_0x0033
            r0.unregisterReceiver(r7)     // Catch:{ IllegalArgumentException -> 0x0046 }
            agi r0 = b     // Catch:{ IllegalArgumentException -> 0x0046 }
            java.lang.String r1 = "unsubscribe(%s) OK!"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IllegalArgumentException -> 0x0046 }
            r2[r3] = r7     // Catch:{ IllegalArgumentException -> 0x0046 }
            r0.a(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0046 }
            goto L_0x003e
        L_0x0033:
            agi r0 = b     // Catch:{ IllegalArgumentException -> 0x0046 }
            java.lang.String r1 = "Trying to unregister missing receiver %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IllegalArgumentException -> 0x0046 }
            r2[r3] = r7     // Catch:{ IllegalArgumentException -> 0x0046 }
            r0.a(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0046 }
        L_0x003e:
            java.util.Set<android.content.BroadcastReceiver> r0 = r6.c
            r0.remove(r7)
            return
        L_0x0044:
            r0 = move-exception
            goto L_0x0054
        L_0x0046:
            agi r0 = b     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "Error unregistering receiver: %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0044 }
            r2[r3] = r7     // Catch:{ all -> 0x0044 }
            age r0 = r0.a     // Catch:{ all -> 0x0044 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0044 }
            goto L_0x003e
        L_0x0054:
            java.util.Set<android.content.BroadcastReceiver> r1 = r6.c
            r1.remove(r7)
            goto L_0x005b
        L_0x005a:
            throw r0
        L_0x005b:
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agf.a(android.content.BroadcastReceiver):void");
    }

    public static Object a(Intent intent, String str, Type type) {
        if (type == Integer.TYPE) {
            return Integer.valueOf(intent.getIntExtra(str, 0));
        }
        if (type == int[].class) {
            return intent.getIntArrayExtra(str);
        }
        if (type == Double.TYPE) {
            return Double.valueOf(intent.getDoubleExtra(str, 0.0d));
        }
        if (type == Boolean.TYPE) {
            return Boolean.valueOf(intent.getBooleanExtra(str, false));
        }
        if (type == byte[].class) {
            return intent.getByteArrayExtra(str);
        }
        if (type == String.class) {
            return intent.getStringExtra(str);
        }
        if (type == String[].class) {
            return intent.getStringArrayExtra(str);
        }
        return null;
    }
}
