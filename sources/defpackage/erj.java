package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: erj reason: default package */
public final class erj extends evi {
    private final erk a = new erk(this, m(), "google_app_measurement_local.db");
    private boolean b;

    erj(esp esp) {
        super(esp);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r13v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r10v2, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r13v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r10v8, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = e;
        r8 = r8;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        r8 = 0;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d8, code lost:
        if (r8.inTransaction() != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00da, code lost:
        r8.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f5, code lost:
        r10 = r8;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0101, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0106, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1, types: [int, boolean]
      assigns: []
      uses: [?[int, short, byte, char], int, boolean]
      mth insns count: 163
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
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0123 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0123 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0123 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:9:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[SYNTHETIC, Splitter:B:57:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "Error writing entry to local database"
            r17.c()
            boolean r0 = r1.b
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.String r5 = "type"
            r4.put(r5, r0)
            java.lang.String r0 = "entry"
            r5 = r19
            r4.put(r0, r5)
            r5 = 5
            r6 = 0
            r7 = 5
        L_0x0025:
            if (r6 >= r5) goto L_0x0136
            r8 = 0
            r9 = 1
            android.database.sqlite.SQLiteDatabase r10 = r17.w()     // Catch:{ SQLiteFullException -> 0x010a, SQLiteDatabaseLockedException -> 0x00f7, SQLiteException -> 0x00cf, all -> 0x00ca }
            if (r10 != 0) goto L_0x003e
            r1.b = r9     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x00c4, SQLiteException -> 0x0037 }
            if (r10 == 0) goto L_0x0036
            r10.close()
        L_0x0036:
            return r3
        L_0x0037:
            r0 = move-exception
            r13 = r8
            goto L_0x00c2
        L_0x003b:
            r0 = move-exception
            goto L_0x010d
        L_0x003e:
            r10.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00c7, SQLiteDatabaseLockedException -> 0x00c4, SQLiteException -> 0x00bf, all -> 0x00ba }
            r11 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r13 = r10.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00c7, SQLiteDatabaseLockedException -> 0x00c4, SQLiteException -> 0x00bf, all -> 0x00ba }
            if (r13 == 0) goto L_0x005f
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            if (r0 == 0) goto L_0x005f
            long r11 = r13.getLong(r3)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            goto L_0x005f
        L_0x0056:
            r0 = move-exception
            goto L_0x012b
        L_0x0059:
            r0 = move-exception
            goto L_0x00c2
        L_0x005b:
            r0 = move-exception
            r8 = r13
            goto L_0x010d
        L_0x005f:
            java.lang.String r0 = "messages"
            r14 = 100000(0x186a0, double:4.94066E-319)
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00a2
            ern r5 = r17.q()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            erp r5 = r5.c     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r8 = "Data loss, local db full"
            r5.a(r8)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            long r14 = r14 - r11
            r11 = 1
            long r14 = r14 + r11
            java.lang.String r5 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r11 = java.lang.Long.toString(r14)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            r8[r3] = r11     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            int r5 = r10.delete(r0, r5, r8)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            long r11 = (long) r5     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x00a2
            ern r5 = r17.q()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            erp r5 = r5.c     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r8 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            long r14 = r14 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            r5.a(r8, r3, r9, r11)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
        L_0x00a2:
            r3 = 0
            r10.insertOrThrow(r0, r3, r4)     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            r10.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            r10.endTransaction()     // Catch:{ SQLiteFullException -> 0x005b, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0059, all -> 0x0056 }
            if (r13 == 0) goto L_0x00b1
            r13.close()
        L_0x00b1:
            if (r10 == 0) goto L_0x00b6
            r10.close()
        L_0x00b6:
            r2 = 1
            return r2
        L_0x00b8:
            r8 = r13
            goto L_0x00f9
        L_0x00ba:
            r0 = move-exception
            r3 = r8
            r13 = r3
            goto L_0x012b
        L_0x00bf:
            r0 = move-exception
            r3 = r8
            r13 = r3
        L_0x00c2:
            r8 = r10
            goto L_0x00d2
        L_0x00c4:
            r3 = r8
            r8 = r3
            goto L_0x00f9
        L_0x00c7:
            r0 = move-exception
            r3 = r8
            goto L_0x010d
        L_0x00ca:
            r0 = move-exception
            r3 = r8
            r10 = r3
            r13 = r10
            goto L_0x012b
        L_0x00cf:
            r0 = move-exception
            r3 = r8
            r13 = r8
        L_0x00d2:
            if (r8 == 0) goto L_0x00dd
            boolean r3 = r8.inTransaction()     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x00dd
            r8.endTransaction()     // Catch:{ all -> 0x00f4 }
        L_0x00dd:
            ern r3 = r17.q()     // Catch:{ all -> 0x00f4 }
            erp r3 = r3.c     // Catch:{ all -> 0x00f4 }
            r3.a(r2, r0)     // Catch:{ all -> 0x00f4 }
            r3 = 1
            r1.b = r3     // Catch:{ all -> 0x00f4 }
            if (r13 == 0) goto L_0x00ee
            r13.close()
        L_0x00ee:
            if (r8 == 0) goto L_0x0123
            r8.close()
            goto L_0x0123
        L_0x00f4:
            r0 = move-exception
            r10 = r8
            goto L_0x012b
        L_0x00f7:
            r3 = r8
            r10 = r8
        L_0x00f9:
            long r11 = (long) r7
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0129 }
            int r7 = r7 + 20
            if (r8 == 0) goto L_0x0104
            r8.close()
        L_0x0104:
            if (r10 == 0) goto L_0x0123
            r10.close()
            goto L_0x0123
        L_0x010a:
            r0 = move-exception
            r3 = r8
            r10 = r8
        L_0x010d:
            ern r3 = r17.q()     // Catch:{ all -> 0x0129 }
            erp r3 = r3.c     // Catch:{ all -> 0x0129 }
            r3.a(r2, r0)     // Catch:{ all -> 0x0129 }
            r3 = 1
            r1.b = r3     // Catch:{ all -> 0x0129 }
            if (r8 == 0) goto L_0x011e
            r8.close()
        L_0x011e:
            if (r10 == 0) goto L_0x0123
            r10.close()
        L_0x0123:
            int r6 = r6 + 1
            r3 = 0
            r5 = 5
            goto L_0x0025
        L_0x0129:
            r0 = move-exception
            r13 = r8
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            r13.close()
        L_0x0130:
            if (r10 == 0) goto L_0x0135
            r10.close()
        L_0x0135:
            throw r0
        L_0x0136:
            ern r0 = r17.q()
            erp r0 = r0.f
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erj.a(int, byte[]):boolean");
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqw d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ ett e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ erh f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ euj g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ eug h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ erj i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ evh j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<bxw>] */
    /* JADX WARNING: type inference failed for: r10v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:54|55|56|57) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:69|70|71|72) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:39|40|41|42|166) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0177, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r10 = r3;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r0 = e;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        q().c.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r14.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        q().c.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r15.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        q().c.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r15.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0109 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0188 A[SYNTHETIC, Splitter:B:114:0x0188] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01d8 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<defpackage.bxw> v() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "Error reading entries from local database"
            r20.c()
            boolean r0 = r1.b
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.Context r0 = r20.m()
            java.lang.String r5 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0023
            return r4
        L_0x0023:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x0027:
            if (r7 >= r5) goto L_0x01ec
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r20.w()     // Catch:{ SQLiteFullException -> 0x01c0, SQLiteDatabaseLockedException -> 0x01a9, SQLiteException -> 0x0183, all -> 0x017f }
            if (r15 != 0) goto L_0x0040
            r1.b = r9     // Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x0038 }
            if (r15 == 0) goto L_0x0037
            r15.close()
        L_0x0037:
            return r3
        L_0x0038:
            r0 = move-exception
            r10 = r3
            r3 = r15
            goto L_0x0186
        L_0x003d:
            r0 = move-exception
            goto L_0x01c3
        L_0x0040:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x017b, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r11 = "messages"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteFullException -> 0x017b, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r0 = "rowid"
            r12[r6] = r0     // Catch:{ SQLiteFullException -> 0x017b, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r0 = "type"
            r12[r9] = r0     // Catch:{ SQLiteFullException -> 0x017b, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r0 = "entry"
            r14 = 2
            r12[r14] = r0     // Catch:{ SQLiteFullException -> 0x017b, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x0174, all -> 0x0171 }
            r13 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid asc"
            r10 = 100
            java.lang.String r19 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x017b, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x0174, all -> 0x0171 }
            r10 = r15
            r5 = 2
            r14 = r0
            r3 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x016e, SQLiteDatabaseLockedException -> 0x0178, SQLiteException -> 0x016c, all -> 0x016a }
            r11 = -1
        L_0x0075:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 == 0) goto L_0x012e
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            byte[] r13 = r10.getBlob(r5)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 != 0) goto L_0x00ba
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00a7 }
            r14.unmarshall(r13, r6, r0)     // Catch:{ ParseException -> 0x00a7 }
            r14.setDataPosition(r6)     // Catch:{ ParseException -> 0x00a7 }
            android.os.Parcelable$Creator<erb> r0 = defpackage.erb.CREATOR     // Catch:{ ParseException -> 0x00a7 }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ ParseException -> 0x00a7 }
            erb r0 = (defpackage.erb) r0     // Catch:{ ParseException -> 0x00a7 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 == 0) goto L_0x0075
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0075
        L_0x00a5:
            r0 = move-exception
            goto L_0x00b6
        L_0x00a7:
            ern r0 = r20.q()     // Catch:{ all -> 0x00a5 }
            erp r0 = r0.c     // Catch:{ all -> 0x00a5 }
            java.lang.String r13 = "Failed to load event from local database"
            r0.a(r13)     // Catch:{ all -> 0x00a5 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0075
        L_0x00b6:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x00ba:
            java.lang.String r14 = "Failed to load user property from local database"
            if (r0 != r9) goto L_0x00ee
            android.os.Parcel r15 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x00d7 }
            r15.unmarshall(r13, r6, r0)     // Catch:{ ParseException -> 0x00d7 }
            r15.setDataPosition(r6)     // Catch:{ ParseException -> 0x00d7 }
            android.os.Parcelable$Creator<ewa> r0 = defpackage.ewa.CREATOR     // Catch:{ ParseException -> 0x00d7 }
            java.lang.Object r0 = r0.createFromParcel(r15)     // Catch:{ ParseException -> 0x00d7 }
            ewa r0 = (defpackage.ewa) r0     // Catch:{ ParseException -> 0x00d7 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x00e4
        L_0x00d5:
            r0 = move-exception
            goto L_0x00ea
        L_0x00d7:
            ern r0 = r20.q()     // Catch:{ all -> 0x00d5 }
            erp r0 = r0.c     // Catch:{ all -> 0x00d5 }
            r0.a(r14)     // Catch:{ all -> 0x00d5 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r0 = 0
        L_0x00e4:
            if (r0 == 0) goto L_0x0075
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0075
        L_0x00ea:
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x00ee:
            if (r0 != r5) goto L_0x0121
            android.os.Parcel r15 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r13.length     // Catch:{ ParseException -> 0x0109 }
            r15.unmarshall(r13, r6, r0)     // Catch:{ ParseException -> 0x0109 }
            r15.setDataPosition(r6)     // Catch:{ ParseException -> 0x0109 }
            android.os.Parcelable$Creator<ewl> r0 = defpackage.ewl.CREATOR     // Catch:{ ParseException -> 0x0109 }
            java.lang.Object r0 = r0.createFromParcel(r15)     // Catch:{ ParseException -> 0x0109 }
            ewl r0 = (defpackage.ewl) r0     // Catch:{ ParseException -> 0x0109 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0116
        L_0x0107:
            r0 = move-exception
            goto L_0x011d
        L_0x0109:
            ern r0 = r20.q()     // Catch:{ all -> 0x0107 }
            erp r0 = r0.c     // Catch:{ all -> 0x0107 }
            r0.a(r14)     // Catch:{ all -> 0x0107 }
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r0 = 0
        L_0x0116:
            if (r0 == 0) goto L_0x0075
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0075
        L_0x011d:
            r15.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x0121:
            ern r0 = r20.q()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            erp r0 = r0.c     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            java.lang.String r13 = "Unknown record type in local database"
            r0.a(r13)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0075
        L_0x012e:
            java.lang.String r0 = "messages"
            java.lang.String r5 = "rowid <= ?"
            java.lang.String[] r13 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            java.lang.String r11 = java.lang.Long.toString(r11)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r13[r6] = r11     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r3.delete(r0, r5, r13)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r5 = r4.size()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 >= r5) goto L_0x014f
            ern r0 = r20.q()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            erp r0 = r0.c     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            java.lang.String r5 = "Fewer entries removed from local database than expected"
            r0.a(r5)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x014f:
            r3.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r3.endTransaction()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r10 == 0) goto L_0x015a
            r10.close()
        L_0x015a:
            if (r3 == 0) goto L_0x015f
            r3.close()
        L_0x015f:
            return r4
        L_0x0160:
            r0 = move-exception
            goto L_0x0186
        L_0x0162:
            r5 = r3
            r3 = r10
            goto L_0x01ab
        L_0x0165:
            r0 = move-exception
            r15 = r3
            r3 = r10
            goto L_0x01c3
        L_0x016a:
            r0 = move-exception
            goto L_0x0181
        L_0x016c:
            r0 = move-exception
            goto L_0x0185
        L_0x016e:
            r0 = move-exception
            r15 = r3
            goto L_0x017d
        L_0x0171:
            r0 = move-exception
            r3 = r15
            goto L_0x0181
        L_0x0174:
            r0 = move-exception
            r3 = r15
            goto L_0x0185
        L_0x0177:
            r3 = r15
        L_0x0178:
            r5 = r3
            r3 = 0
            goto L_0x01ab
        L_0x017b:
            r0 = move-exception
            r3 = r15
        L_0x017d:
            r3 = 0
            goto L_0x01c3
        L_0x017f:
            r0 = move-exception
            r3 = 0
        L_0x0181:
            r10 = 0
            goto L_0x01e1
        L_0x0183:
            r0 = move-exception
            r3 = 0
        L_0x0185:
            r10 = 0
        L_0x0186:
            if (r3 == 0) goto L_0x0191
            boolean r5 = r3.inTransaction()     // Catch:{ all -> 0x01a7 }
            if (r5 == 0) goto L_0x0191
            r3.endTransaction()     // Catch:{ all -> 0x01a7 }
        L_0x0191:
            ern r5 = r20.q()     // Catch:{ all -> 0x01a7 }
            erp r5 = r5.c     // Catch:{ all -> 0x01a7 }
            r5.a(r2, r0)     // Catch:{ all -> 0x01a7 }
            r1.b = r9     // Catch:{ all -> 0x01a7 }
            if (r10 == 0) goto L_0x01a1
            r10.close()
        L_0x01a1:
            if (r3 == 0) goto L_0x01d8
            r3.close()
            goto L_0x01d8
        L_0x01a7:
            r0 = move-exception
            goto L_0x01e1
        L_0x01a9:
            r3 = 0
            r5 = 0
        L_0x01ab:
            long r9 = (long) r8
            android.os.SystemClock.sleep(r9)     // Catch:{ all -> 0x01bc }
            int r8 = r8 + 20
            if (r3 == 0) goto L_0x01b6
            r3.close()
        L_0x01b6:
            if (r5 == 0) goto L_0x01d8
            r5.close()
            goto L_0x01d8
        L_0x01bc:
            r0 = move-exception
            r10 = r3
            r3 = r5
            goto L_0x01e1
        L_0x01c0:
            r0 = move-exception
            r3 = 0
            r15 = 0
        L_0x01c3:
            ern r5 = r20.q()     // Catch:{ all -> 0x01de }
            erp r5 = r5.c     // Catch:{ all -> 0x01de }
            r5.a(r2, r0)     // Catch:{ all -> 0x01de }
            r1.b = r9     // Catch:{ all -> 0x01de }
            if (r3 == 0) goto L_0x01d3
            r3.close()
        L_0x01d3:
            if (r15 == 0) goto L_0x01d8
            r15.close()
        L_0x01d8:
            int r7 = r7 + 1
            r3 = 0
            r5 = 5
            goto L_0x0027
        L_0x01de:
            r0 = move-exception
            r10 = r3
            r3 = r15
        L_0x01e1:
            if (r10 == 0) goto L_0x01e6
            r10.close()
        L_0x01e6:
            if (r3 == 0) goto L_0x01eb
            r3.close()
        L_0x01eb:
            throw r0
        L_0x01ec:
            ern r0 = r20.q()
            erp r0 = r0.f
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erj.v():java.util.List");
    }

    /* access modifiers changed from: 0000 */
    public final SQLiteDatabase w() {
        if (this.b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.b = true;
        return null;
    }
}
