package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.room.RoomDatabase;
import com.spotify.cosmos.router.Request;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

/* renamed from: pc reason: default package */
public final class pc {
    private static final String[] i = {"UPDATE", Request.DELETE, "INSERT"};
    final String[] a;
    public final RoomDatabase b;
    public AtomicBoolean c = new AtomicBoolean(false);
    public volatile boolean d = false;
    public volatile px e;
    final db<b, c> f = new db<>();
    public pd g;
    public Runnable h = new Runnable() {
        /* JADX INFO: finally extract failed */
        private Set<Integer> a() {
            dq dqVar = new dq();
            Cursor a2 = pc.this.b.a((pw) new ps("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (a2.moveToNext()) {
                try {
                    dqVar.add(Integer.valueOf(a2.getInt(0)));
                } catch (Throwable th) {
                    a2.close();
                    throw th;
                }
            }
            a2.close();
            if (!dqVar.isEmpty()) {
                pc.this.e.a();
            }
            return dqVar;
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r5v1 */
        /* JADX WARNING: type inference failed for: r5v2 */
        /* JADX WARNING: type inference failed for: r5v4, types: [boolean] */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: type inference failed for: r5v6, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: type inference failed for: r5v9, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r5v10, types: [boolean] */
        /* JADX WARNING: type inference failed for: r5v11 */
        /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r5v14, types: [pu] */
        /* JADX WARNING: type inference failed for: r5v15 */
        /* JADX WARNING: type inference failed for: r5v16 */
        /* JADX WARNING: type inference failed for: r5v17 */
        /* JADX WARNING: type inference failed for: r5v18 */
        /* JADX WARNING: type inference failed for: r5v19 */
        /* JADX WARNING: type inference failed for: r5v20 */
        /* JADX WARNING: type inference failed for: r5v21 */
        /* JADX WARNING: type inference failed for: r5v22 */
        /* JADX WARNING: type inference failed for: r5v23 */
        /* JADX WARNING: type inference failed for: r5v24 */
        /* JADX WARNING: type inference failed for: r5v25 */
        /* JADX WARNING: type inference failed for: r5v26 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1
          assigns: []
          uses: []
          mth insns count: 125
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[SYNTHETIC, Splitter:B:15:0x003a] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x009a  */
        /* JADX WARNING: Unknown variable types count: 10 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                pc r0 = defpackage.pc.this
                androidx.room.RoomDatabase r0 = r0.b
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r1 = 0
                r2 = 1
                r3 = 0
                r0.lock()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                pc r4 = defpackage.pc.this     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                androidx.room.RoomDatabase r5 = r4.b     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                boolean r5 = r5.b()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                if (r5 != 0) goto L_0x001c
            L_0x001a:
                r4 = 0
                goto L_0x0034
            L_0x001c:
                boolean r5 = r4.d     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                if (r5 != 0) goto L_0x0027
                androidx.room.RoomDatabase r5 = r4.b     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                pu r5 = r5.c     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                r5.a()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
            L_0x0027:
                boolean r4 = r4.d     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                if (r4 != 0) goto L_0x0033
                java.lang.String r4 = "ROOM"
                java.lang.String r5 = "database is not initialized even though it is open"
                android.util.Log.e(r4, r5)     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                goto L_0x001a
            L_0x0033:
                r4 = 1
            L_0x0034:
                if (r4 != 0) goto L_0x003a
                r0.unlock()
                return
            L_0x003a:
                pc r4 = defpackage.pc.this     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.c     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                boolean r4 = r4.compareAndSet(r2, r3)     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                if (r4 != 0) goto L_0x0048
                r0.unlock()
                return
            L_0x0048:
                pc r4 = defpackage.pc.this     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                androidx.room.RoomDatabase r4 = r4.b     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                boolean r4 = r4.h()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                if (r4 == 0) goto L_0x0056
                r0.unlock()
                return
            L_0x0056:
                pc r4 = defpackage.pc.this     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                androidx.room.RoomDatabase r4 = r4.b     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                boolean r4 = r4.d     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                if (r4 == 0) goto L_0x0082
                pc r4 = defpackage.pc.this     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                androidx.room.RoomDatabase r4 = r4.b     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                pu r4 = r4.c     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                pt r4 = r4.a()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                r4.a()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                java.util.Set r5 = r11.a()     // Catch:{ all -> 0x0078 }
                r4.c()     // Catch:{ all -> 0x0076 }
                r4.b()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                goto L_0x0095
            L_0x0076:
                r6 = move-exception
                goto L_0x007a
            L_0x0078:
                r6 = move-exception
                r5 = r1
            L_0x007a:
                r4.b()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                throw r6     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
            L_0x007e:
                r4 = move-exception
                goto L_0x008e
            L_0x0080:
                r4 = move-exception
                goto L_0x008e
            L_0x0082:
                java.util.Set r5 = r11.a()     // Catch:{ IllegalStateException -> 0x008c, SQLiteException -> 0x008a }
                goto L_0x0095
            L_0x0087:
                r1 = move-exception
                goto L_0x00f8
            L_0x008a:
                r4 = move-exception
                goto L_0x008d
            L_0x008c:
                r4 = move-exception
            L_0x008d:
                r5 = r1
            L_0x008e:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch:{ all -> 0x0087 }
            L_0x0095:
                r0.unlock()
                if (r5 == 0) goto L_0x00f7
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00f7
                pc r0 = defpackage.pc.this
                db<pc$b, pc$c> r0 = r0.f
                monitor-enter(r0)
                pc r4 = defpackage.pc.this     // Catch:{ all -> 0x00f4 }
                db<pc$b, pc$c> r4 = r4.f     // Catch:{ all -> 0x00f4 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00f4 }
            L_0x00ad:
                boolean r6 = r4.hasNext()     // Catch:{ all -> 0x00f4 }
                if (r6 == 0) goto L_0x00f2
                java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x00f4 }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00f4 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00f4 }
                pc$c r6 = (defpackage.pc.c) r6     // Catch:{ all -> 0x00f4 }
                int[] r7 = r6.a     // Catch:{ all -> 0x00f4 }
                int r7 = r7.length     // Catch:{ all -> 0x00f4 }
                r9 = r1
                r8 = 0
            L_0x00c4:
                if (r8 >= r7) goto L_0x00ea
                int[] r10 = r6.a     // Catch:{ all -> 0x00f4 }
                r10 = r10[r8]     // Catch:{ all -> 0x00f4 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00f4 }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00f4 }
                if (r10 == 0) goto L_0x00e7
                if (r7 != r2) goto L_0x00d9
                java.util.Set<java.lang.String> r9 = r6.d     // Catch:{ all -> 0x00f4 }
                goto L_0x00e7
            L_0x00d9:
                if (r9 != 0) goto L_0x00e0
                dq r9 = new dq     // Catch:{ all -> 0x00f4 }
                r9.<init>(r7)     // Catch:{ all -> 0x00f4 }
            L_0x00e0:
                java.lang.String[] r10 = r6.b     // Catch:{ all -> 0x00f4 }
                r10 = r10[r8]     // Catch:{ all -> 0x00f4 }
                r9.add(r10)     // Catch:{ all -> 0x00f4 }
            L_0x00e7:
                int r8 = r8 + 1
                goto L_0x00c4
            L_0x00ea:
                if (r9 == 0) goto L_0x00ad
                pc$b r6 = r6.c     // Catch:{ all -> 0x00f4 }
                r6.a(r9)     // Catch:{ all -> 0x00f4 }
                goto L_0x00ad
            L_0x00f2:
                monitor-exit(r0)     // Catch:{ all -> 0x00f4 }
                return
            L_0x00f4:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00f4 }
                throw r1
            L_0x00f7:
                return
            L_0x00f8:
                r0.unlock()
                goto L_0x00fd
            L_0x00fc:
                throw r1
            L_0x00fd:
                goto L_0x00fc
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pc.AnonymousClass1.run():void");
        }
    };
    private dp<String, Integer> j;
    private Map<String, Set<String>> k;
    private a l;
    private final pb m;

    /* renamed from: pc$a */
    static class a {
        private long[] a;
        private boolean[] b;
        private int[] c;
        private boolean d;
        private boolean e;

        a(int i) {
            this.a = new long[i];
            this.b = new boolean[i];
            this.c = new int[i];
            Arrays.fill(this.a, 0);
            Arrays.fill(this.b, false);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.a[i];
                    this.a[i] = 1 + j;
                    if (j == 0) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public final int[] a() {
            synchronized (this) {
                if (this.d) {
                    if (!this.e) {
                        int length = this.a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.a[i] > 0;
                                if (z != this.b[i]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.c[i] = 0;
                                }
                                this.b[i] = z;
                                i++;
                            } else {
                                this.e = true;
                                this.d = false;
                                int[] iArr2 = this.c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            synchronized (this) {
                this.e = false;
            }
        }

        /* access modifiers changed from: 0000 */
        public final boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.a[i];
                    this.a[i] = j - 1;
                    if (j == 1) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: pc$b */
    public static abstract class b {
        final String[] a;

        public b(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);

        /* access modifiers changed from: 0000 */
        public boolean a() {
            return false;
        }
    }

    /* renamed from: pc$c */
    static class c {
        final int[] a;
        final String[] b;
        final b c;
        final Set<String> d;

        c(b bVar, int[] iArr, String[] strArr) {
            this.c = bVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                dq dqVar = new dq();
                dqVar.add(this.b[0]);
                this.d = Collections.unmodifiableSet(dqVar);
                return;
            }
            this.d = null;
        }
    }

    public pc(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.b = roomDatabase;
        this.l = new a(strArr.length);
        this.j = new dp<>();
        this.k = map2;
        this.m = new pb(this.b);
        int length = strArr.length;
        this.a = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.j.put(lowerCase, Integer.valueOf(i2));
            String str = (String) map.get(strArr[i2]);
            if (str != null) {
                this.a[i2] = str.toLowerCase(Locale.US);
            } else {
                this.a[i2] = lowerCase;
            }
        }
        for (Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.j.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                dp<String, Integer> dpVar = this.j;
                dpVar.put(lowerCase3, dpVar.get(lowerCase2));
            }
        }
    }

    private void a() {
        if (this.b.b()) {
            a(this.b.c.a());
        }
    }

    private static void a(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private void a(pt ptVar, int i2) {
        String str = this.a[i2];
        StringBuilder sb = new StringBuilder();
        String[] strArr = i;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            a(sb, str, str2);
            ptVar.c(sb.toString());
        }
    }

    private void b(pt ptVar, int i2) {
        StringBuilder sb = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i2);
        sb.append(", 0)");
        ptVar.c(sb.toString());
        String str = this.a[i2];
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = i;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            a(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE room_table_modification_log");
            sb2.append(" SET invalidated");
            sb2.append(" = 1 WHERE ");
            sb2.append("table_id = ");
            sb2.append(i2);
            sb2.append(" AND invalidated");
            sb2.append(" = 0; END");
            ptVar.c(sb2.toString());
        }
    }

    public final void a(b bVar) {
        c cVar;
        String[] strArr = bVar.a;
        dq dqVar = new dq();
        int i2 = 0;
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.k.containsKey(lowerCase)) {
                dqVar.addAll((Collection) this.k.get(lowerCase));
            } else {
                dqVar.add(str);
            }
        }
        String[] strArr2 = (String[]) dqVar.toArray(new String[dqVar.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        while (i2 < length) {
            Integer num = (Integer) this.j.get(strArr2[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("There is no table with name ");
                sb.append(strArr2[i2]);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        c cVar2 = new c(bVar, iArr, strArr2);
        synchronized (this.f) {
            cVar = (c) this.f.a(bVar, cVar2);
        }
        if (cVar == null && this.l.a(iArr)) {
            a();
        }
    }

    public final void a(pt ptVar) {
        if (!ptVar.d()) {
            while (true) {
                try {
                    ReadLock readLock = this.b.f.readLock();
                    readLock.lock();
                    try {
                        int[] a2 = this.l.a();
                        if (a2 == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a2.length;
                        ptVar.a();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                b(ptVar, i2);
                            } else if (i3 == 2) {
                                a(ptVar, i2);
                            }
                        }
                        ptVar.c();
                        ptVar.b();
                        this.l.b();
                        readLock.unlock();
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
        }
    }

    public final void b(b bVar) {
        c cVar;
        synchronized (this.f) {
            cVar = (c) this.f.b(bVar);
        }
        if (cVar != null && this.l.b(cVar.a)) {
            a();
        }
    }
}
