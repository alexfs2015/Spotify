package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uz reason: default package */
public final class uz implements uy {
    private final RoomDatabase a;
    private final oy b;
    private final pi c;
    private final pi d;
    private final pi e;
    private final pi f;
    private final pi g;
    private final pi h;
    private final pi i;
    private final pi j;

    public uz(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new oy<ux>(roomDatabase) {
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void a(px pxVar, Object obj) {
                int i;
                px pxVar2 = pxVar;
                ux uxVar = (ux) obj;
                if (uxVar.a == null) {
                    pxVar2.a(1);
                } else {
                    pxVar2.a(1, uxVar.a);
                }
                int i2 = 2;
                pxVar2.a(2, (long) vd.a(uxVar.b));
                if (uxVar.c == null) {
                    pxVar2.a(3);
                } else {
                    pxVar2.a(3, uxVar.c);
                }
                if (uxVar.d == null) {
                    pxVar2.a(4);
                } else {
                    pxVar2.a(4, uxVar.d);
                }
                byte[] a2 = ss.a(uxVar.e);
                if (a2 == null) {
                    pxVar2.a(5);
                } else {
                    pxVar2.a(5, a2);
                }
                byte[] a3 = ss.a(uxVar.f);
                if (a3 == null) {
                    pxVar2.a(6);
                } else {
                    pxVar2.a(6, a3);
                }
                pxVar2.a(7, uxVar.g);
                pxVar2.a(8, uxVar.h);
                pxVar2.a(9, uxVar.i);
                pxVar2.a(10, (long) uxVar.k);
                BackoffPolicy backoffPolicy = uxVar.l;
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
                pxVar2.a(11, (long) i);
                pxVar2.a(12, uxVar.m);
                pxVar2.a(13, uxVar.n);
                pxVar2.a(14, uxVar.o);
                pxVar2.a(15, uxVar.p);
                sq sqVar = uxVar.j;
                if (sqVar != null) {
                    NetworkType networkType = sqVar.b;
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
                    pxVar2.a(16, (long) i2);
                    pxVar2.a(17, sqVar.c ? 1 : 0);
                    pxVar2.a(18, sqVar.d ? 1 : 0);
                    pxVar2.a(19, sqVar.e ? 1 : 0);
                    pxVar2.a(20, sqVar.f ? 1 : 0);
                    pxVar2.a(21, sqVar.g);
                    pxVar2.a(22, sqVar.h);
                    byte[] a4 = vd.a(sqVar.i);
                    if (a4 == null) {
                        pxVar2.a(23);
                    } else {
                        pxVar2.a(23, a4);
                    }
                } else {
                    pxVar2.a(16);
                    pxVar2.a(17);
                    pxVar2.a(18);
                    pxVar2.a(19);
                    pxVar2.a(20);
                    pxVar2.a(21);
                    pxVar2.a(22);
                    pxVar2.a(23);
                }
            }
        };
        this.c = new pi(roomDatabase) {
            public final String a() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.d = new pi(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.e = new pi(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f = new pi(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.g = new pi(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.h = new pi(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.i = new pi(roomDatabase) {
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.j = new pi(roomDatabase) {
            public final String a() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    public final int a(State state, String... strArr) {
        this.a.d();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        pn.a(sb, 1);
        sb.append(")");
        px a2 = this.a.a(sb.toString());
        a2.a(1, (long) vd.a(state));
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

    public final List<String> a() {
        ph a2 = ph.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
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

    public final List<ux> a(int i2) {
        ph phVar;
        ph a2 = ph.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a2.a(1, (long) i2);
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            int a4 = pl.a(a3, "id");
            int a5 = pl.a(a3, "state");
            int a6 = pl.a(a3, "worker_class_name");
            int a7 = pl.a(a3, "input_merger_class_name");
            int a8 = pl.a(a3, "input");
            int a9 = pl.a(a3, "output");
            int a10 = pl.a(a3, "initial_delay");
            int a11 = pl.a(a3, "interval_duration");
            int a12 = pl.a(a3, "flex_duration");
            int a13 = pl.a(a3, "run_attempt_count");
            int a14 = pl.a(a3, "backoff_policy");
            int a15 = pl.a(a3, "backoff_delay_duration");
            int a16 = pl.a(a3, "period_start_time");
            int a17 = pl.a(a3, "minimum_retention_duration");
            phVar = a2;
            try {
                int a18 = pl.a(a3, "schedule_requested_at");
                int a19 = pl.a(a3, "required_network_type");
                int i3 = a17;
                int a20 = pl.a(a3, "requires_charging");
                int i4 = a16;
                int a21 = pl.a(a3, "requires_device_idle");
                int i5 = a15;
                int a22 = pl.a(a3, "requires_battery_not_low");
                int i6 = a14;
                int a23 = pl.a(a3, "requires_storage_not_low");
                int i7 = a13;
                int a24 = pl.a(a3, "trigger_content_update_delay");
                int i8 = a12;
                int a25 = pl.a(a3, "trigger_max_content_delay");
                int i9 = a11;
                int a26 = pl.a(a3, "content_uri_triggers");
                int i10 = a10;
                int i11 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i12 = a4;
                    String string2 = a3.getString(a6);
                    int i13 = a6;
                    sq sqVar = new sq();
                    int i14 = a19;
                    sqVar.b = vd.c(a3.getInt(a19));
                    sqVar.c = a3.getInt(a20) != 0;
                    sqVar.d = a3.getInt(a21) != 0;
                    sqVar.e = a3.getInt(a22) != 0;
                    sqVar.f = a3.getInt(a23) != 0;
                    int i15 = a21;
                    int i16 = a20;
                    sqVar.g = a3.getLong(a24);
                    sqVar.h = a3.getLong(a25);
                    sqVar.i = vd.a(a3.getBlob(a26));
                    ux uxVar = new ux(string, string2);
                    uxVar.b = vd.a(a3.getInt(a5));
                    uxVar.d = a3.getString(a7);
                    uxVar.e = ss.a(a3.getBlob(a8));
                    int i17 = i11;
                    uxVar.f = ss.a(a3.getBlob(i17));
                    i11 = i17;
                    int i18 = i16;
                    int i19 = i10;
                    uxVar.g = a3.getLong(i19);
                    i10 = i19;
                    int i20 = a5;
                    int i21 = i9;
                    uxVar.h = a3.getLong(i21);
                    i9 = i21;
                    int i22 = i20;
                    int i23 = i8;
                    uxVar.i = a3.getLong(i23);
                    int i24 = i7;
                    uxVar.k = a3.getInt(i24);
                    int i25 = i6;
                    i7 = i24;
                    uxVar.l = vd.b(a3.getInt(i25));
                    i8 = i23;
                    int i26 = i5;
                    int i27 = i22;
                    uxVar.m = a3.getLong(i26);
                    int i28 = i26;
                    i6 = i25;
                    int i29 = i4;
                    uxVar.n = a3.getLong(i29);
                    i4 = i29;
                    int i30 = i28;
                    int i31 = i3;
                    uxVar.o = a3.getLong(i31);
                    int i32 = a18;
                    i3 = i31;
                    int i33 = i30;
                    uxVar.p = a3.getLong(i32);
                    uxVar.j = sqVar;
                    arrayList.add(uxVar);
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
                phVar.a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                phVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            phVar = a2;
            a3.close();
            phVar.a();
            throw th;
        }
    }

    public final void a(String str) {
        this.a.d();
        px b2 = this.c.b();
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

    public final void a(String str, long j2) {
        this.a.d();
        px b2 = this.e.b();
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

    public final void a(String str, ss ssVar) {
        this.a.d();
        px b2 = this.d.b();
        byte[] a2 = ss.a(ssVar);
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

    public final void a(ux uxVar) {
        this.a.d();
        this.a.e();
        try {
            this.b.a(uxVar);
            this.a.g();
        } finally {
            this.a.f();
        }
    }

    public final int b() {
        this.a.d();
        px b2 = this.i.b();
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

    public final int b(String str, long j2) {
        this.a.d();
        px b2 = this.h.b();
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

    public final ux b(String str) {
        ph phVar;
        ux uxVar;
        String str2 = str;
        ph a2 = ph.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str2);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            int a4 = pl.a(a3, "id");
            int a5 = pl.a(a3, "state");
            int a6 = pl.a(a3, "worker_class_name");
            int a7 = pl.a(a3, "input_merger_class_name");
            int a8 = pl.a(a3, "input");
            int a9 = pl.a(a3, "output");
            int a10 = pl.a(a3, "initial_delay");
            int a11 = pl.a(a3, "interval_duration");
            int a12 = pl.a(a3, "flex_duration");
            int a13 = pl.a(a3, "run_attempt_count");
            int a14 = pl.a(a3, "backoff_policy");
            int a15 = pl.a(a3, "backoff_delay_duration");
            int a16 = pl.a(a3, "period_start_time");
            int a17 = pl.a(a3, "minimum_retention_duration");
            phVar = a2;
            try {
                int a18 = pl.a(a3, "schedule_requested_at");
                int a19 = pl.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = pl.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = pl.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = pl.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = pl.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = pl.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = pl.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = pl.a(a3, "content_uri_triggers");
                if (a3.moveToFirst()) {
                    String string = a3.getString(a4);
                    String string2 = a3.getString(a6);
                    int i9 = a10;
                    sq sqVar = new sq();
                    sqVar.b = vd.c(a3.getInt(a19));
                    boolean z = false;
                    sqVar.c = a3.getInt(a20) != 0;
                    sqVar.d = a3.getInt(a21) != 0;
                    sqVar.e = a3.getInt(a22) != 0;
                    if (a3.getInt(a23) != 0) {
                        z = true;
                    }
                    sqVar.f = z;
                    sqVar.g = a3.getLong(a24);
                    sqVar.h = a3.getLong(a25);
                    sqVar.i = vd.a(a3.getBlob(a26));
                    uxVar = new ux(string, string2);
                    uxVar.b = vd.a(a3.getInt(a5));
                    uxVar.d = a3.getString(a7);
                    uxVar.e = ss.a(a3.getBlob(a8));
                    uxVar.f = ss.a(a3.getBlob(a9));
                    uxVar.g = a3.getLong(i9);
                    uxVar.h = a3.getLong(i8);
                    uxVar.i = a3.getLong(i7);
                    uxVar.k = a3.getInt(i6);
                    uxVar.l = vd.b(a3.getInt(i5));
                    uxVar.m = a3.getLong(i4);
                    uxVar.n = a3.getLong(i3);
                    uxVar.o = a3.getLong(i2);
                    uxVar.p = a3.getLong(a18);
                    uxVar.j = sqVar;
                } else {
                    uxVar = null;
                }
                a3.close();
                phVar.a();
                return uxVar;
            } catch (Throwable th) {
                th = th;
                a3.close();
                phVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            phVar = a2;
            a3.close();
            phVar.a();
            throw th;
        }
    }

    public final List<ux> c() {
        ph phVar;
        ph a2 = ph.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            int a4 = pl.a(a3, "id");
            int a5 = pl.a(a3, "state");
            int a6 = pl.a(a3, "worker_class_name");
            int a7 = pl.a(a3, "input_merger_class_name");
            int a8 = pl.a(a3, "input");
            int a9 = pl.a(a3, "output");
            int a10 = pl.a(a3, "initial_delay");
            int a11 = pl.a(a3, "interval_duration");
            int a12 = pl.a(a3, "flex_duration");
            int a13 = pl.a(a3, "run_attempt_count");
            int a14 = pl.a(a3, "backoff_policy");
            int a15 = pl.a(a3, "backoff_delay_duration");
            int a16 = pl.a(a3, "period_start_time");
            int a17 = pl.a(a3, "minimum_retention_duration");
            phVar = a2;
            try {
                int a18 = pl.a(a3, "schedule_requested_at");
                int a19 = pl.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = pl.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = pl.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = pl.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = pl.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = pl.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = pl.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = pl.a(a3, "content_uri_triggers");
                int i9 = a10;
                int i10 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i11 = a4;
                    String string2 = a3.getString(a6);
                    int i12 = a6;
                    sq sqVar = new sq();
                    int i13 = a19;
                    sqVar.b = vd.c(a3.getInt(a19));
                    sqVar.c = a3.getInt(a20) != 0;
                    sqVar.d = a3.getInt(a21) != 0;
                    sqVar.e = a3.getInt(a22) != 0;
                    sqVar.f = a3.getInt(a23) != 0;
                    int i14 = a21;
                    int i15 = a20;
                    sqVar.g = a3.getLong(a24);
                    sqVar.h = a3.getLong(a25);
                    sqVar.i = vd.a(a3.getBlob(a26));
                    ux uxVar = new ux(string, string2);
                    uxVar.b = vd.a(a3.getInt(a5));
                    uxVar.d = a3.getString(a7);
                    uxVar.e = ss.a(a3.getBlob(a8));
                    int i16 = i10;
                    uxVar.f = ss.a(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    uxVar.g = a3.getLong(i18);
                    i9 = i18;
                    int i19 = a5;
                    int i20 = i8;
                    uxVar.h = a3.getLong(i20);
                    i8 = i20;
                    int i21 = i19;
                    int i22 = i7;
                    uxVar.i = a3.getLong(i22);
                    int i23 = i6;
                    uxVar.k = a3.getInt(i23);
                    int i24 = i5;
                    i6 = i23;
                    uxVar.l = vd.b(a3.getInt(i24));
                    i7 = i22;
                    int i25 = i4;
                    int i26 = i21;
                    uxVar.m = a3.getLong(i25);
                    int i27 = i25;
                    i5 = i24;
                    int i28 = i3;
                    uxVar.n = a3.getLong(i28);
                    i3 = i28;
                    int i29 = i27;
                    int i30 = i2;
                    uxVar.o = a3.getLong(i30);
                    i2 = i30;
                    int i31 = i29;
                    int i32 = a18;
                    uxVar.p = a3.getLong(i32);
                    uxVar.j = sqVar;
                    arrayList.add(uxVar);
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
                phVar.a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                phVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            phVar = a2;
            a3.close();
            phVar.a();
            throw th;
        }
    }

    public final List<a> c(String str) {
        ph a2 = ph.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            int a4 = pl.a(a3, "id");
            int a5 = pl.a(a3, "state");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                a aVar = new a();
                aVar.a = a3.getString(a4);
                aVar.b = vd.a(a3.getInt(a5));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final int d(String str) {
        this.a.d();
        px b2 = this.f.b();
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

    public final List<ux> d() {
        ph phVar;
        ph a2 = ph.a("SELECT * FROM workspec WHERE state=1", 0);
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            int a4 = pl.a(a3, "id");
            int a5 = pl.a(a3, "state");
            int a6 = pl.a(a3, "worker_class_name");
            int a7 = pl.a(a3, "input_merger_class_name");
            int a8 = pl.a(a3, "input");
            int a9 = pl.a(a3, "output");
            int a10 = pl.a(a3, "initial_delay");
            int a11 = pl.a(a3, "interval_duration");
            int a12 = pl.a(a3, "flex_duration");
            int a13 = pl.a(a3, "run_attempt_count");
            int a14 = pl.a(a3, "backoff_policy");
            int a15 = pl.a(a3, "backoff_delay_duration");
            int a16 = pl.a(a3, "period_start_time");
            int a17 = pl.a(a3, "minimum_retention_duration");
            phVar = a2;
            try {
                int a18 = pl.a(a3, "schedule_requested_at");
                int a19 = pl.a(a3, "required_network_type");
                int i2 = a17;
                int a20 = pl.a(a3, "requires_charging");
                int i3 = a16;
                int a21 = pl.a(a3, "requires_device_idle");
                int i4 = a15;
                int a22 = pl.a(a3, "requires_battery_not_low");
                int i5 = a14;
                int a23 = pl.a(a3, "requires_storage_not_low");
                int i6 = a13;
                int a24 = pl.a(a3, "trigger_content_update_delay");
                int i7 = a12;
                int a25 = pl.a(a3, "trigger_max_content_delay");
                int i8 = a11;
                int a26 = pl.a(a3, "content_uri_triggers");
                int i9 = a10;
                int i10 = a9;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a4);
                    int i11 = a4;
                    String string2 = a3.getString(a6);
                    int i12 = a6;
                    sq sqVar = new sq();
                    int i13 = a19;
                    sqVar.b = vd.c(a3.getInt(a19));
                    sqVar.c = a3.getInt(a20) != 0;
                    sqVar.d = a3.getInt(a21) != 0;
                    sqVar.e = a3.getInt(a22) != 0;
                    sqVar.f = a3.getInt(a23) != 0;
                    int i14 = a21;
                    int i15 = a20;
                    sqVar.g = a3.getLong(a24);
                    sqVar.h = a3.getLong(a25);
                    sqVar.i = vd.a(a3.getBlob(a26));
                    ux uxVar = new ux(string, string2);
                    uxVar.b = vd.a(a3.getInt(a5));
                    uxVar.d = a3.getString(a7);
                    uxVar.e = ss.a(a3.getBlob(a8));
                    int i16 = i10;
                    uxVar.f = ss.a(a3.getBlob(i16));
                    i10 = i16;
                    int i17 = i15;
                    int i18 = i9;
                    uxVar.g = a3.getLong(i18);
                    i9 = i18;
                    int i19 = a5;
                    int i20 = i8;
                    uxVar.h = a3.getLong(i20);
                    i8 = i20;
                    int i21 = i19;
                    int i22 = i7;
                    uxVar.i = a3.getLong(i22);
                    int i23 = i6;
                    uxVar.k = a3.getInt(i23);
                    int i24 = i5;
                    i6 = i23;
                    uxVar.l = vd.b(a3.getInt(i24));
                    i7 = i22;
                    int i25 = i4;
                    int i26 = i21;
                    uxVar.m = a3.getLong(i25);
                    int i27 = i25;
                    i5 = i24;
                    int i28 = i3;
                    uxVar.n = a3.getLong(i28);
                    i3 = i28;
                    int i29 = i27;
                    int i30 = i2;
                    uxVar.o = a3.getLong(i30);
                    i2 = i30;
                    int i31 = i29;
                    int i32 = a18;
                    uxVar.p = a3.getLong(i32);
                    uxVar.j = sqVar;
                    arrayList.add(uxVar);
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
                phVar.a();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                phVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            phVar = a2;
            a3.close();
            phVar.a();
            throw th;
        }
    }

    public final int e(String str) {
        this.a.d();
        px b2 = this.g.b();
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

    public final State f(String str) {
        ph a2 = ph.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            return a3.moveToFirst() ? vd.a(a3.getInt(0)) : null;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final List<ss> g(String str) {
        ph a2 = ph.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(ss.a(a3.getBlob(0)));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public final List<String> h(String str) {
        ph a2 = ph.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.a.d();
        Cursor a3 = this.a.a((pw) a2);
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
}
