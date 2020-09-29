package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hmk reason: default package */
public final class hmk implements fqs {
    private final a a;
    private final Map<String, Serializable> b = new HashMap(64);

    /* renamed from: hmk$a */
    public interface a {
        void a(String str, String str2);
    }

    public hmk(a aVar) {
        this.a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.fqm<?> r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = defpackage.fbo.a(r4)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.util.Map<java.lang.String, java.io.Serializable> r0 = r2.b     // Catch:{ all -> 0x002d }
            fqt r1 = r3.d     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002d }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x002b
            hmk$a r0 = r2.a     // Catch:{ all -> 0x002d }
            fqt r1 = r3.d     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x002d }
            r0.a(r1, r4)     // Catch:{ all -> 0x002d }
            java.util.Map<java.lang.String, java.io.Serializable> r0 = r2.b     // Catch:{ all -> 0x002d }
            fqt r3 = r3.d     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x002d }
            r0.put(r3, r4)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmk.a(fqm, java.lang.String):void");
    }
}
