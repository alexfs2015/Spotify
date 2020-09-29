package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: pu reason: default package */
final class pu implements pp {
    private final a a;

    /* renamed from: pu$a */
    static class a extends SQLiteOpenHelper {
        private pt[] a;
        private defpackage.pp.a b;
        private boolean c;

        a(Context context, String str, final pt[] ptVarArr, final defpackage.pp.a aVar) {
            super(context, str, null, aVar.a, new DatabaseErrorHandler() {
                /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
                    if (r0 != null) goto L_0x003b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
                    r3 = r0.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
                    if (r3.hasNext() != false) goto L_0x0045;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
                    defpackage.pp.a.a((java.lang.String) ((android.util.Pair) r3.next()).second);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
                    defpackage.pp.a.a(r3.f());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0035 */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
                /* JADX WARNING: Removed duplicated region for block: B:7:0x0033 A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
                  PHI: (r0v12 java.util.List) = (r0v5 java.util.List), (r0v6 java.util.List), (r0v6 java.util.List) binds: [B:5:0x002e, B:8:0x0035, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x002e] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCorruption(android.database.sqlite.SQLiteDatabase r3) {
                    /*
                        r2 = this;
                        pp$a r0 = defpackage.pp.a.this
                        pt[] r0 = r9
                        pt r3 = defpackage.pu.a.a(r0, r3)
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "Corruption reported by sqlite on database: "
                        r0.<init>(r1)
                        java.lang.String r1 = r3.f()
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        java.lang.String r1 = "SupportSQLite"
                        android.util.Log.e(r1, r0)
                        boolean r0 = r3.e()
                        if (r0 != 0) goto L_0x002d
                        java.lang.String r3 = r3.f()
                        defpackage.pp.a.a(r3)
                        return
                    L_0x002d:
                        r0 = 0
                        java.util.List r0 = r3.g()     // Catch:{ SQLiteException -> 0x0035, all -> 0x0033 }
                        goto L_0x0035
                    L_0x0033:
                        r1 = move-exception
                        goto L_0x0039
                    L_0x0035:
                        r3.close()     // Catch:{ IOException -> 0x005b, all -> 0x0033 }
                        goto L_0x005c
                    L_0x0039:
                        if (r0 == 0) goto L_0x0053
                        java.util.Iterator r3 = r0.iterator()
                    L_0x003f:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x005a
                        java.lang.Object r0 = r3.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        defpackage.pp.a.a(r0)
                        goto L_0x003f
                    L_0x0053:
                        java.lang.String r3 = r3.f()
                        defpackage.pp.a.a(r3)
                    L_0x005a:
                        throw r1
                    L_0x005b:
                    L_0x005c:
                        if (r0 == 0) goto L_0x0077
                        java.util.Iterator r3 = r0.iterator()
                    L_0x0062:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L_0x0076
                        java.lang.Object r0 = r3.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        defpackage.pp.a.a(r0)
                        goto L_0x0062
                    L_0x0076:
                        return
                    L_0x0077:
                        java.lang.String r3 = r3.f()
                        defpackage.pp.a.a(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pu.a.AnonymousClass1.onCorruption(android.database.sqlite.SQLiteDatabase):void");
                }
            });
            this.b = aVar;
            this.a = ptVarArr;
        }

        /* access modifiers changed from: 0000 */
        public final synchronized po a() {
            this.c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.c) {
                close();
                return a();
            }
            return a(writableDatabase);
        }

        private pt a(SQLiteDatabase sQLiteDatabase) {
            return a(this.a, sQLiteDatabase);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.b.a((po) a(sQLiteDatabase));
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.a(a(sQLiteDatabase), i, i2);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.b(a(sQLiteDatabase), i, i2);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.c) {
                this.b.b(a(sQLiteDatabase));
            }
        }

        public final synchronized void close() {
            super.close();
            this.a[0] = null;
        }

        static pt a(pt[] ptVarArr, SQLiteDatabase sQLiteDatabase) {
            pt ptVar = ptVarArr[0];
            if (ptVar == null || !ptVar.a(sQLiteDatabase)) {
                ptVarArr[0] = new pt(sQLiteDatabase);
            }
            return ptVarArr[0];
        }
    }

    pu(Context context, String str, defpackage.pp.a aVar) {
        this.a = new a(context, str, new pt[1], aVar);
    }

    public final void a(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }

    public final po a() {
        return this.a.a();
    }
}
