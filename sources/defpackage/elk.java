package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: elk reason: default package */
public final class elk implements ekw {
    static final Map<String, elk> a = new HashMap();
    final Object b = new Object();
    volatile Map<String, ?> c;
    final List<Object> d = new ArrayList();
    private final SharedPreferences e;
    private final OnSharedPreferenceChangeListener f = new ell(this);

    /* JADX WARNING: type inference failed for: r0v0, types: [elk, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [elk, java.lang.Object, java.lang.String]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.Object, java.lang.String, elk]
      mth insns count: 34
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.elk a(android.content.Context r4, java.lang.String r5) {
        /*
            boolean r5 = defpackage.eks.a()
            r0 = 0
            if (r5 == 0) goto L_0x0014
            java.lang.String r5 = "direct_boot:"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x0014
            boolean r5 = defpackage.eks.a(r4)
            goto L_0x0015
        L_0x0014:
            r5 = 1
        L_0x0015:
            if (r5 != 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.Class<elk> r5 = defpackage.elk.class
            monitor-enter(r5)
            java.util.Map<java.lang.String, elk> r1 = a     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0053 }
            elk r1 = (defpackage.elk) r1     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x0051
            elk r1 = new elk     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "direct_boot:"
            boolean r2 = r0.startsWith(r2)     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r2 == 0) goto L_0x0045
            boolean r2 = defpackage.eks.a()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x003a
            android.content.Context r4 = r4.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0053 }
        L_0x003a:
            r2 = 12
            java.lang.String r2 = r0.substring(r2)     // Catch:{ all -> 0x0053 }
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x0053 }
            goto L_0x0049
        L_0x0045:
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r3)     // Catch:{ all -> 0x0053 }
        L_0x0049:
            r1.<init>(r4)     // Catch:{ all -> 0x0053 }
            java.util.Map<java.lang.String, elk> r4 = a     // Catch:{ all -> 0x0053 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            return r1
        L_0x0053:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elk.a(android.content.Context, java.lang.String):elk");
    }

    private elk(SharedPreferences sharedPreferences) {
        this.e = sharedPreferences;
        this.e.registerOnSharedPreferenceChangeListener(this.f);
    }

    public final Object a(String str) {
        Map<String, ?> map = this.c;
        if (map == null) {
            synchronized (this.b) {
                map = this.c;
                if (map == null) {
                    map = this.e.getAll();
                    this.c = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
