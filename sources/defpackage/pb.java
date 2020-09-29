package defpackage;

import android.database.Cursor;

/* renamed from: pb reason: default package */
public final class pb extends defpackage.pp.a {
    private or b;
    private final a c;
    private final String d;
    private final String e;

    /* renamed from: pb$a */
    public static abstract class a {
        public final int a;

        /* access modifiers changed from: protected */
        public abstract void a(po poVar);

        /* access modifiers changed from: protected */
        public abstract void b(po poVar);

        /* access modifiers changed from: protected */
        public abstract void c(po poVar);

        /* access modifiers changed from: protected */
        public abstract void d(po poVar);

        /* access modifiers changed from: protected */
        public abstract void e(po poVar);

        /* access modifiers changed from: protected */
        public void f(po poVar) {
        }

        public a(int i) {
            this.a = i;
        }
    }

    public pb(or orVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = orVar;
        this.c = aVar;
        this.d = str;
        this.e = str2;
    }

    public final void a(po poVar) {
        c(poVar);
        this.c.b(poVar);
        this.c.d(poVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.po r6, int r7, int r8) {
        /*
            r5 = this;
            or r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0042
            androidx.room.RoomDatabase$c r0 = r0.d
            if (r7 != r8) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x001d
        L_0x000f:
            if (r8 <= r7) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r0.a(r4, r3, r7, r8)
        L_0x001d:
            if (r0 == 0) goto L_0x0042
            pb$a r3 = r5.c
            r3.f(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            pf r3 = (defpackage.pf) r3
            r3.a(r6)
            goto L_0x0028
        L_0x0038:
            pb$a r0 = r5.c
            r0.e(r6)
            r5.c(r6)
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 != 0) goto L_0x0098
            or r0 = r5.b
            if (r0 == 0) goto L_0x0077
            if (r7 <= r8) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x0054
            boolean r3 = r0.l
            if (r3 != 0) goto L_0x0069
        L_0x0054:
            boolean r3 = r0.k
            if (r3 == 0) goto L_0x0069
            java.util.Set<java.lang.Integer> r3 = r0.m
            if (r3 == 0) goto L_0x006a
            java.util.Set<java.lang.Integer> r0 = r0.m
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 != 0) goto L_0x0077
            pb$a r7 = r5.c
            r7.a(r6)
            pb$a r7 = r5.c
            r7.b(r6)
            return
        L_0x0077:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A migration from "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " to "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb.a(po, int, int):void");
    }

    public final void b(po poVar, int i, int i2) {
        a(poVar, i, i2);
    }

    public final void b(po poVar) {
        Object obj;
        super.b(poVar);
        if (e(poVar)) {
            Cursor a2 = poVar.a((pr) new pn("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                obj = a2.moveToFirst() ? a2.getString(0) : null;
            } finally {
                a2.close();
            }
        } else {
            obj = null;
        }
        if (this.d.equals(obj) || this.e.equals(obj)) {
            this.c.c(poVar);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
    }

    private void c(po poVar) {
        d(poVar);
        poVar.c(pa.a(this.d));
    }

    private static void d(po poVar) {
        poVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean e(po poVar) {
        Cursor b2 = poVar.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (b2.moveToFirst() && b2.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b2.close();
        }
    }
}
