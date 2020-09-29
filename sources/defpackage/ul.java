package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ul reason: default package */
public final class ul implements uk {
    private final RoomDatabase a;
    private final ot b;
    private final pd c;
    private final pd d;
    private final pd e;
    private final pd f;
    private final pd g;
    private final pd h;
    private final pd i;
    private final pd j;

    public ul(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<uj>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void a(ps psVar, Object obj) {
                int i;
                ps psVar2 = psVar;
                uj ujVar = (uj) obj;
                if (ujVar.a == null) {
                    psVar2.a(1);
                } else {
                    psVar2.a(1, ujVar.a);
                }
                int i2 = 2;
                psVar2.a(2, (long) up.a(ujVar.b));
                if (ujVar.c == null) {
                    psVar2.a(3);
                } else {
                    psVar2.a(3, ujVar.c);
                }
                if (ujVar.d == null) {
                    psVar2.a(4);
                } else {
                    psVar2.a(4, ujVar.d);
                }
                byte[] a2 = se.a(ujVar.e);
                if (a2 == null) {
                    psVar2.a(5);
                } else {
                    psVar2.a(5, a2);
                }
                byte[] a3 = se.a(ujVar.f);
                if (a3 == null) {
                    psVar2.a(6);
                } else {
                    psVar2.a(6, a3);
                }
                psVar2.a(7, ujVar.g);
                psVar2.a(8, ujVar.h);
                psVar2.a(9, ujVar.i);
                psVar2.a(10, (long) ujVar.k);
                BackoffPolicy backoffPolicy = ujVar.l;
                int i3 = AnonymousClass1.b[backoffPolicy.ordinal()];
                String str = " to int";
                String str2 = "Could not convert ";
                if (i3 == 1) {
                    i = 0;
                } else if (i3 == 2) {
                    i = 1;
                } else {
                    StringBuilder sb = new StringBuilder(str2);
                    sb.append(backoffPolicy);
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
                psVar2.a(11, (long) i);
                psVar2.a(12, ujVar.m);
                psVar2.a(13, ujVar.n);
                psVar2.a(14, ujVar.o);
                psVar2.a(15, ujVar.p);
                sc scVar = ujVar.j;
                if (scVar != null) {
                    NetworkType networkType = scVar.b;
                    int i4 = AnonymousClass1.c[networkType.ordinal()];
                    if (i4 == 1) {
                        i2 = 0;
                    } else if (i4 == 2) {
                        i2 = 1;
                    } else if (i4 != 3) {
                        if (i4 == 4) {
                            i2 = 3;
                        } else if (i4 == 5) {
                            i2 = 4;
                        } else {
                            StringBuilder sb2 = new StringBuilder(str2);
                            sb2.append(networkType);
                            sb2.append(str);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                    psVar2.a(16, (long) i2);
                    psVar2.a(17, scVar.c ? 1 : 0);
                    psVar2.a(18, scVar.d ? 1 : 0);
                    psVar2.a(19, scVar.e ? 1 : 0);
                    psVar2.a(20, scVar.f ? 1 : 0);
                    psVar2.a(21, scVar.g);
                    psVar2.a(22, scVar.h);
                    byte[] a4 = up.a(scVar.i);
                    if (a4 == null) {
                        psVar2.a(23);
                    } else {
                        psVar2.a(23, a4);
                    }
                } else {
                    psVar2.a(16);
                    psVar2.a(17);
                    psVar2.a(18);
                    psVar2.a(19);
                    psVar2.a(20);
                    psVar2.a(21);
                    psVar2.a(22);
                    psVar2.a(23);
                }
            }
        };
        this.c = new pd(roomDatabase) {
            public final String a() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.d = new pd(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.e = new pd(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f = new pd(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.g = new pd(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.h = new pd(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.i = new pd(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.j = new pd(roomDatabase) {
            public final String a() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    public final void a(uj ujVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(ujVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final void a(String str) {
        this.a.d();
        ps b2 = this.c.b();
        if (str == null) {
            b2.a(1);
        } else {
            b2.a(1, str);
        }
        this.a.e();
        try {
            b2.a();
            this.a.g();
        } finally {
            this.a.f();
            this.c.a(b2);
        }
    }

    public final void a(String str, se seVar) {
        this.a.d();
        ps b2 = this.d.b();
        byte[] a2 = se.a(seVar);
        if (a2 == null) {
            b2.a(1);
        } else {
            b2.a(1, a2);
        }
        if (str == null) {
            b2.a(2);
        } else {
            b2.a(2, str);
        }
        this.a.e();
        try {
            b2.a();
            this.a.g();
        } finally {
            this.a.f();
            this.d.a(b2);
        }
    }

    public final void a(String str, long j2) {
        this.a.d();
        ps b2 = this.e.b();
        b2.a(1, j2);
        if (str == null) {
            b2.a(2);
        } else {
            b2.a(2, str);
        }
        this.a.e();
        try {
            b2.a();
            this.a.g();
        } finally {
            this.a.f();
            this.e.a(b2);
        }
    }

    public final int d(String str) {
        this.a.d();
        ps b2 = this.f.b();
        if (str == null) {
            b2.a(1);
        } else {
            b2.a(1, str);
        }
        this.a.e();
        try {
            int a2 = b2.a();
            this.a.g();
            return a2;
        } finally {
            this.a.f();
            this.f.a(b2);
        }
    }

    public final int e(String str) {
        this.a.d();
        ps b2 = this.g.b();
        if (str == null) {
            b2.a(1);
        } else {
            b2.a(1, str);
        }
        this.a.e();
        try {
            int a2 = b2.a();
            this.a.g();
            return a2;
        } finally {
            this.a.f();
            this.g.a(b2);
        }
    }

    public final int b(String str, long j2) {
        this.a.d();
        ps b2 = this.h.b();
        b2.a(1, j2);
        if (str == null) {
            b2.a(2);
        } else {
            b2.a(2, str);
        }
        this.a.e();
        try {
            int a2 = b2.a();
            this.a.g();
            return a2;
        } finally {
            this.a.f();
            this.h.a(b2);
        }
    }

    public final int b() {
        this.a.d();
        ps b2 = this.i.b();
        this.a.e();
        try {
            int a2 = b2.a();
            this.a.g();
            return a2;
        } finally {
            this.a.f();
            this.i.a(b2);
        }
    }

    public final uj b(String str) {
        pc pcVar;
        uj ujVar;
        String str2 = str;
        pc a2 = pc.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str2);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            int a4 = pg.a(a3, "id");
            int a5 = pg.a(a3, "state");
            int a6 = pg.a(a3, "worker_class_name");
            int a7 = pg.a(a3, "input_merger_class_name");
            int a8 = pg.a(a3, "input");
            int a9 = pg.a(a3, "output");
            int a10 = pg.a(a3, "initial_delay");
            int a11 = pg.a(a3, "interval_duration");
            int a12 = pg.a(a3, "flex_duration");
            int a13 = pg.a(a3, "run_attempt_count");
            int a14 = pg.a(a3, "backoff_policy");
            int a15 = pg.a(a3, "backoff_delay_duration");
            int a16 = pg.a(a3, "period_start_time");
            int a17 = pg.a(a3, "minimum_retention_duration");
            pcVar = a2;
            try {
                int a18 = pg.a(a3, "schedule_requested_at");
                int a19 = pg.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = pg.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = pg.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = pg.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = pg.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = pg.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = pg.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = pg.a(a3, "content_uri_triggers");
                if (a3.moveToFirst()) {
                    String string = a3.getString(a4);
                    String string2 = a3.getString(a6);
                    int i9 = a10;
                    sc scVar = new sc();
                    scVar.b = up.c(a3.getInt(a19));
                    boolean z = false;
                    scVar.c = a3.getInt(a20) != 0;
                    scVar.d = a3.getInt(a21) != 0;
                    scVar.e = a3.getInt(a22) != 0;
                    if (a3.getInt(a23) != 0) {
                        z = true;
                    }
                    scVar.f = z;
                    scVar.g = a3.getLong(a24);
                    scVar.h = a3.getLong(a25);
                    scVar.i = up.a(a3.getBlob(a26));
                    ujVar = new uj(string, string2);
                    ujVar.b = up.a(a3.getInt(a5));
                    ujVar.d = a3.getString(a7);
                    ujVar.e = se.a(a3.getBlob(a8));
                    ujVar.f = se.a(a3.getBlob(a9));
                    ujVar.g = a3.getLong(i9);
                    ujVar.h = a3.getLong(i8);
                    ujVar.i = a3.getLong(i7);
                    ujVar.k = a3.getInt(i6);
                    ujVar.l = up.b(a3.getInt(i5));
                    ujVar.m = a3.getLong(i4);
                    ujVar.n = a3.getLong(i3);
                    ujVar.o = a3.getLong(i2);
                    ujVar.p = a3.getLong(a18);
                    ujVar.j = scVar;
                } else {
                    ujVar = null;
                }
                a3.close();
                pcVar.a();
                return ujVar;
            } catch (Throwable th) {
                th = th;
                a3.close();
                pcVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pcVar = a2;
            a3.close();
            pcVar.a();
            throw th;
        }
    }

    public final List<a> c(String str) {
        pc a2 = pc.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            int a4 = pg.a(a3, "id");
            int a5 = pg.a(a3, "state");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                a aVar = new a();
                aVar.a = a3.getString(a4);
                aVar.b = up.a(a3.getInt(a5));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final State f(String str) {
        pc a2 = pc.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            return a3.moveToFirst() ? up.a(a3.getInt(0)) : null;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final List<se> g(String str) {
        pc a2 = pc.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(se.a(a3.getBlob(0)));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final List<String> h(String str) {
        pc a2 = pc.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final List<String> a() {
        pc a2 = pc.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final List<uj> a(int i2) {
        pc pcVar;
        pc a2 = pc.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a2.a(1, (long) i2);
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            int a4 = pg.a(a3, "id");
            int a5 = pg.a(a3, "state");
            int a6 = pg.a(a3, "worker_class_name");
            int a7 = pg.a(a3, "input_merger_class_name");
            int a8 = pg.a(a3, "input");
            int a9 = pg.a(a3, "output");
            int a10 = pg.a(a3, "initial_delay");
            int a11 = pg.a(a3, "interval_duration");
            int a12 = pg.a(a3, "flex_duration");
            int a13 = pg.a(a3, "run_attempt_count");
            int a14 = pg.a(a3, "backoff_policy");
            int a15 = pg.a(a3, "backoff_delay_duration");
            int a16 = pg.a(a3, "period_start_time");
            int a17 = pg.a(a3, "minimum_retention_duration");
            pcVar = a2;
            try {
                int a18 = pg.a(a3, "schedule_requested_at");
                int a19 = pg.a(a3, "required_network_type");
                int i3 = a17;
                int a20 = pg.a(a3, "requires_charging");
                int i4 = a16;
                int a21 = pg.a(a3, "requires_device_idle");
                int i5 = a15;
                int a22 = pg.a(a3, "requires_battery_not_low");
                int i6 = a14;
                int a23 = pg.a(a3, "requires_storage_not_low");
                int i7 = a13;
                int a24 = pg.a(a3, "trigger_content_update_delay");
                int i8 = a12;
                int a25 = pg.a(a3, "trigger_max_content_delay");
                int i9 = a11;
                int a26 = pg.a(a3, "content_uri_triggers");
                int i10 = a10;
                int i11 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i12 = a4;
                    String string2 = a3.getString(a6);
                    int i13 = a6;
                    sc scVar = new sc();
                    int i14 = a19;
                    scVar.b = up.c(a3.getInt(a19));
                    scVar.c = a3.getInt(a20) != 0;
                    scVar.d = a3.getInt(a21) != 0;
                    scVar.e = a3.getInt(a22) != 0;
                    scVar.f = a3.getInt(a23) != 0;
                    int i15 = a21;
                    int i16 = a20;
                    scVar.g = a3.getLong(a24);
                    scVar.h = a3.getLong(a25);
                    scVar.i = up.a(a3.getBlob(a26));
                    uj ujVar = new uj(string, string2);
                    ujVar.b = up.a(a3.getInt(a5));
                    ujVar.d = a3.getString(a7);
                    ujVar.e = se.a(a3.getBlob(a8));
                    int i17 = i11;
                    ujVar.f = se.a(a3.getBlob(i17));
                    i11 = i17;
                    int i18 = i16;
                    int i19 = i10;
                    ujVar.g = a3.getLong(i19);
                    i10 = i19;
                    int i20 = a5;
                    int i21 = i9;
                    ujVar.h = a3.getLong(i21);
                    i9 = i21;
                    int i22 = i20;
                    int i23 = i8;
                    ujVar.i = a3.getLong(i23);
                    int i24 = i7;
                    ujVar.k = a3.getInt(i24);
                    int i25 = i6;
                    i7 = i24;
                    ujVar.l = up.b(a3.getInt(i25));
                    i8 = i23;
                    int i26 = i5;
                    int i27 = i22;
                    ujVar.m = a3.getLong(i26);
                    int i28 = i26;
                    i6 = i25;
                    int i29 = i4;
                    ujVar.n = a3.getLong(i29);
                    i4 = i29;
                    int i30 = i28;
                    int i31 = i3;
                    ujVar.o = a3.getLong(i31);
                    int i32 = a18;
                    i3 = i31;
                    int i33 = i30;
                    ujVar.p = a3.getLong(i32);
                    ujVar.j = scVar;
                    arrayList.add(ujVar);
                    a18 = i32;
                    a20 = i18;
                    a4 = i12;
                    a6 = i13;
                    a21 = i15;
                    a19 = i14;
                    int i34 = i27;
                    i5 = i33;
                    a5 = i34;
                }
                a3.close();
                pcVar.a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                pcVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pcVar = a2;
            a3.close();
            pcVar.a();
            throw th;
        }
    }

    public final List<uj> c() {
        pc pcVar;
        pc a2 = pc.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            int a4 = pg.a(a3, "id");
            int a5 = pg.a(a3, "state");
            int a6 = pg.a(a3, "worker_class_name");
            int a7 = pg.a(a3, "input_merger_class_name");
            int a8 = pg.a(a3, "input");
            int a9 = pg.a(a3, "output");
            int a10 = pg.a(a3, "initial_delay");
            int a11 = pg.a(a3, "interval_duration");
            int a12 = pg.a(a3, "flex_duration");
            int a13 = pg.a(a3, "run_attempt_count");
            int a14 = pg.a(a3, "backoff_policy");
            int a15 = pg.a(a3, "backoff_delay_duration");
            int a16 = pg.a(a3, "period_start_time");
            int a17 = pg.a(a3, "minimum_retention_duration");
            pcVar = a2;
            try {
                int a18 = pg.a(a3, "schedule_requested_at");
                int a19 = pg.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = pg.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = pg.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = pg.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = pg.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = pg.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = pg.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = pg.a(a3, "content_uri_triggers");
                int i9 = a10;
                int i10 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i11 = a4;
                    String string2 = a3.getString(a6);
                    int i12 = a6;
                    sc scVar = new sc();
                    int i13 = a19;
                    scVar.b = up.c(a3.getInt(a19));
                    scVar.c = a3.getInt(a20) != 0;
                    scVar.d = a3.getInt(a21) != 0;
                    scVar.e = a3.getInt(a22) != 0;
                    scVar.f = a3.getInt(a23) != 0;
                    int i14 = a21;
                    int i15 = a20;
                    scVar.g = a3.getLong(a24);
                    scVar.h = a3.getLong(a25);
                    scVar.i = up.a(a3.getBlob(a26));
                    uj ujVar = new uj(string, string2);
                    ujVar.b = up.a(a3.getInt(a5));
                    ujVar.d = a3.getString(a7);
                    ujVar.e = se.a(a3.getBlob(a8));
                    int i16 = i10;
                    ujVar.f = se.a(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    ujVar.g = a3.getLong(i18);
                    i9 = i18;
                    int i19 = a5;
                    int i20 = i8;
                    ujVar.h = a3.getLong(i20);
                    i8 = i20;
                    int i21 = i19;
                    int i22 = i7;
                    ujVar.i = a3.getLong(i22);
                    int i23 = i6;
                    ujVar.k = a3.getInt(i23);
                    int i24 = i5;
                    i6 = i23;
                    ujVar.l = up.b(a3.getInt(i24));
                    i7 = i22;
                    int i25 = i4;
                    int i26 = i21;
                    ujVar.m = a3.getLong(i25);
                    int i27 = i25;
                    i5 = i24;
                    int i28 = i3;
                    ujVar.n = a3.getLong(i28);
                    i3 = i28;
                    int i29 = i27;
                    int i30 = i2;
                    ujVar.o = a3.getLong(i30);
                    i2 = i30;
                    int i31 = i29;
                    int i32 = a18;
                    ujVar.p = a3.getLong(i32);
                    ujVar.j = scVar;
                    arrayList.add(ujVar);
                    a18 = i32;
                    a20 = i17;
                    a4 = i11;
                    a6 = i12;
                    a21 = i14;
                    a19 = i13;
                    int i33 = i26;
                    i4 = i31;
                    a5 = i33;
                }
                a3.close();
                pcVar.a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                pcVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pcVar = a2;
            a3.close();
            pcVar.a();
            throw th;
        }
    }

    public final List<uj> d() {
        pc pcVar;
        pc a2 = pc.a("SELECT * FROM workspec WHERE state=1", 0);
        this.a.d();
        Cursor a3 = this.a.a((pr) a2);
        try {
            int a4 = pg.a(a3, "id");
            int a5 = pg.a(a3, "state");
            int a6 = pg.a(a3, "worker_class_name");
            int a7 = pg.a(a3, "input_merger_class_name");
            int a8 = pg.a(a3, "input");
            int a9 = pg.a(a3, "output");
            int a10 = pg.a(a3, "initial_delay");
            int a11 = pg.a(a3, "interval_duration");
            int a12 = pg.a(a3, "flex_duration");
            int a13 = pg.a(a3, "run_attempt_count");
            int a14 = pg.a(a3, "backoff_policy");
            int a15 = pg.a(a3, "backoff_delay_duration");
            int a16 = pg.a(a3, "period_start_time");
            int a17 = pg.a(a3, "minimum_retention_duration");
            pcVar = a2;
            try {
                int a18 = pg.a(a3, "schedule_requested_at");
                int a19 = pg.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = pg.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = pg.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = pg.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = pg.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = pg.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = pg.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = pg.a(a3, "content_uri_triggers");
                int i9 = a10;
                int i10 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i11 = a4;
                    String string2 = a3.getString(a6);
                    int i12 = a6;
                    sc scVar = new sc();
                    int i13 = a19;
                    scVar.b = up.c(a3.getInt(a19));
                    scVar.c = a3.getInt(a20) != 0;
                    scVar.d = a3.getInt(a21) != 0;
                    scVar.e = a3.getInt(a22) != 0;
                    scVar.f = a3.getInt(a23) != 0;
                    int i14 = a21;
                    int i15 = a20;
                    scVar.g = a3.getLong(a24);
                    scVar.h = a3.getLong(a25);
                    scVar.i = up.a(a3.getBlob(a26));
                    uj ujVar = new uj(string, string2);
                    ujVar.b = up.a(a3.getInt(a5));
                    ujVar.d = a3.getString(a7);
                    ujVar.e = se.a(a3.getBlob(a8));
                    int i16 = i10;
                    ujVar.f = se.a(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    ujVar.g = a3.getLong(i18);
                    i9 = i18;
                    int i19 = a5;
                    int i20 = i8;
                    ujVar.h = a3.getLong(i20);
                    i8 = i20;
                    int i21 = i19;
                    int i22 = i7;
                    ujVar.i = a3.getLong(i22);
                    int i23 = i6;
                    ujVar.k = a3.getInt(i23);
                    int i24 = i5;
                    i6 = i23;
                    ujVar.l = up.b(a3.getInt(i24));
                    i7 = i22;
                    int i25 = i4;
                    int i26 = i21;
                    ujVar.m = a3.getLong(i25);
                    int i27 = i25;
                    i5 = i24;
                    int i28 = i3;
                    ujVar.n = a3.getLong(i28);
                    i3 = i28;
                    int i29 = i27;
                    int i30 = i2;
                    ujVar.o = a3.getLong(i30);
                    i2 = i30;
                    int i31 = i29;
                    int i32 = a18;
                    ujVar.p = a3.getLong(i32);
                    ujVar.j = scVar;
                    arrayList.add(ujVar);
                    a18 = i32;
                    a20 = i17;
                    a4 = i11;
                    a6 = i12;
                    a21 = i14;
                    a19 = i13;
                    int i33 = i26;
                    i4 = i31;
                    a5 = i33;
                }
                a3.close();
                pcVar.a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                pcVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pcVar = a2;
            a3.close();
            pcVar.a();
            throw th;
        }
    }

    public final int a(State state, String... strArr) {
        this.a.d();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        pi.a(sb, 1);
        sb.append(")");
        ps a2 = this.a.a(sb.toString());
        a2.a(1, (long) up.a(state));
        for (int i2 = 0; i2 <= 0; i2++) {
            String str = strArr[0];
            if (str == null) {
                a2.a(2);
            } else {
                a2.a(2, str);
            }
        }
        this.a.e();
        try {
            int a3 = a2.a();
            this.a.g();
            return a3;
        } finally {
            this.a.f();
        }
    }
}
