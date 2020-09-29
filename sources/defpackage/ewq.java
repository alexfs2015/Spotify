package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ewq reason: default package */
final class ewq extends evs {
    /* access modifiers changed from: private */
    public static final String[] a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] c = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] f = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] g = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final ewt h = new ewt(this, m(), "google_app_measurement.db");
    /* access modifiers changed from: private */
    public final evo i = new evo(l());

    ewq(evt evt) {
        super(evt);
    }

    private final boolean L() {
        return m().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = w().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e2) {
            q().c.a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            q().c.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                q().c.a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            q().c.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        bxo.a(str);
        bxo.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final boolean a(String str, int i2, ekn ekn) {
        j();
        c();
        bxo.a(str);
        bxo.a(ekn);
        if (TextUtils.isEmpty(ekn.b)) {
            q().f.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", ern.a(str), Integer.valueOf(i2), String.valueOf(ekn.a));
            return false;
        }
        try {
            byte[] bArr = new byte[ekn.e()];
            eqk a2 = eqk.a(bArr, bArr.length);
            ekn.a(a2);
            a2.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", ekn.a);
            contentValues.put("event_name", ekn.b);
            contentValues.put("data", bArr);
            try {
                if (w().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    q().c.a("Failed to insert event filter (got -1). appId", ern.a(str));
                }
                return true;
            } catch (SQLiteException e2) {
                q().c.a("Error storing event filter. appId", ern.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            q().c.a("Configuration loss. Failed to serialize event filter. appId", ern.a(str), e3);
            return false;
        }
    }

    private final boolean a(String str, int i2, ekq ekq) {
        j();
        c();
        bxo.a(str);
        bxo.a(ekq);
        if (TextUtils.isEmpty(ekq.b)) {
            q().f.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", ern.a(str), Integer.valueOf(i2), String.valueOf(ekq.a));
            return false;
        }
        try {
            byte[] bArr = new byte[ekq.e()];
            eqk a2 = eqk.a(bArr, bArr.length);
            ekq.a(a2);
            a2.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", ekq.a);
            contentValues.put("property_name", ekq.b);
            contentValues.put("data", bArr);
            try {
                if (w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                q().c.a("Failed to insert property filter (got -1). appId", ern.a(str));
                return false;
            } catch (SQLiteException e2) {
                q().c.a("Error storing property filter. appId", ern.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            q().c.a("Configuration loss. Failed to serialize property filter. appId", ern.a(str), e3);
            return false;
        }
    }

    private final boolean a(String str, List<Integer> list) {
        bxo.a(str);
        j();
        c();
        SQLiteDatabase w = w();
        try {
            long b = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, s().b(str, erd.M)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = (Integer) list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return w.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            q().c.a("Database error querying filters. appId", ern.a(str), e2);
            return false;
        }
    }

    private final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = w().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            q().c.a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long A() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long B() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final boolean C() {
        return b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean D() {
        return b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long E() {
        Cursor cursor = null;
        try {
            cursor = w().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e2) {
            q().c.a("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long a(ela ela) {
        long j;
        c();
        j();
        bxo.a(ela);
        bxo.a(ela.o);
        try {
            byte[] bArr = new byte[ela.e()];
            eqk a2 = eqk.a(bArr, bArr.length);
            ela.a(a2);
            a2.a();
            evz f2 = f();
            bxo.a(bArr);
            f2.o().c();
            MessageDigest h2 = ewd.h();
            if (h2 == null) {
                f2.q().c.a("Failed to get MD5");
                j = 0;
            } else {
                j = ewd.a(h2.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ela.o);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", bArr);
            try {
                w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return j;
            } catch (SQLiteException e2) {
                q().c.a("Error storing raw event metadata. appId", ern.a(ela.o), e2);
                throw e2;
            }
        } catch (IOException e3) {
            q().c.a("Data loss. Failed to serialize event metadata. appId", ern.a(ela.o), e3);
            throw e3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<defpackage.ekx, java.lang.Long> a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.c()
            r7.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0073, all -> 0x0070 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r2 != 0) goto L_0x0035
            ern r8 = r7.q()     // Catch:{ SQLiteException -> 0x006e }
            erp r8 = r8.k     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x0034
            r1.close()
        L_0x0034:
            return r0
        L_0x0035:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x006e }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x006e }
            int r4 = r2.length     // Catch:{ SQLiteException -> 0x006e }
            eqj r2 = defpackage.eqj.a(r2, r4)     // Catch:{ SQLiteException -> 0x006e }
            ekx r4 = new ekx     // Catch:{ SQLiteException -> 0x006e }
            r4.<init>()     // Catch:{ SQLiteException -> 0x006e }
            r4.a(r2)     // Catch:{ IOException -> 0x0058 }
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r8
        L_0x0058:
            r2 = move-exception
            ern r3 = r7.q()     // Catch:{ SQLiteException -> 0x006e }
            erp r3 = r3.c     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = defpackage.ern.a(r8)     // Catch:{ SQLiteException -> 0x006e }
            r3.a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x006d
            r1.close()
        L_0x006d:
            return r0
        L_0x006e:
            r8 = move-exception
            goto L_0x0075
        L_0x0070:
            r8 = move-exception
            r1 = r0
            goto L_0x0087
        L_0x0073:
            r8 = move-exception
            r1 = r0
        L_0x0075:
            ern r9 = r7.q()     // Catch:{ all -> 0x0086 }
            erp r9 = r9.c     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "Error selecting main event"
            r9.a(r2, r8)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0085
            r1.close()
        L_0x0085:
            return r0
        L_0x0086:
            r8 = move-exception
        L_0x0087:
            if (r1 == 0) goto L_0x008c
            r1.close()
        L_0x008c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.eqx a(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r15 = r24
            defpackage.bxo.a(r23)
            defpackage.bxo.a(r24)
            r22.c()
            r22.j()
            r16 = 0
            android.database.sqlite.SQLiteDatabase r1 = r22.w()     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r2 = "events"
            r0 = 8
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "lifetime_count"
            r9 = 0
            r3[r9] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "current_bundle_count"
            r10 = 1
            r3[r10] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "last_fire_timestamp"
            r11 = 2
            r3[r11] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "last_bundled_timestamp"
            r12 = 3
            r3[r12] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "last_bundled_day"
            r13 = 4
            r3[r13] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "last_sampled_complex_event_id"
            r14 = 5
            r3[r14] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "last_sampling_rate"
            r8 = 6
            r3[r8] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "last_exempt_from_sampling"
            r7 = 7
            r3[r7] = r0     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            r5[r9] = r23     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            r6 = 0
            r0 = 0
            r17 = 0
            r7 = r0
            r0 = 6
            r8 = r17
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x010b, all -> 0x0107 }
            boolean r1 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            if (r1 != 0) goto L_0x0062
            if (r8 == 0) goto L_0x0061
            r8.close()
        L_0x0061:
            return r16
        L_0x0062:
            long r4 = r8.getLong(r9)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            long r6 = r8.getLong(r10)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            long r19 = r8.getLong(r11)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            boolean r1 = r8.isNull(r12)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            if (r1 == 0) goto L_0x0077
            r1 = 0
            goto L_0x007b
        L_0x0077:
            long r1 = r8.getLong(r12)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
        L_0x007b:
            r11 = r1
            boolean r1 = r8.isNull(r13)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            if (r1 == 0) goto L_0x0085
            r13 = r16
            goto L_0x008e
        L_0x0085:
            long r1 = r8.getLong(r13)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            r13 = r1
        L_0x008e:
            boolean r1 = r8.isNull(r14)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            if (r1 == 0) goto L_0x0097
            r14 = r16
            goto L_0x00a0
        L_0x0097:
            long r1 = r8.getLong(r14)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            r14 = r1
        L_0x00a0:
            boolean r1 = r8.isNull(r0)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            if (r1 == 0) goto L_0x00aa
            r0 = r16
        L_0x00a8:
            r1 = 7
            goto L_0x00b3
        L_0x00aa:
            long r0 = r8.getLong(r0)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            goto L_0x00a8
        L_0x00b3:
            boolean r2 = r8.isNull(r1)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            if (r2 != 0) goto L_0x00cb
            long r1 = r8.getLong(r1)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            r17 = 1
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x00c4
            r9 = 1
        L_0x00c4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            r17 = r1
            goto L_0x00cd
        L_0x00cb:
            r17 = r16
        L_0x00cd:
            eqx r18 = new eqx     // Catch:{ SQLiteException -> 0x0103, all -> 0x00ff }
            r1 = r18
            r2 = r23
            r3 = r24
            r21 = r8
            r8 = r19
            r10 = r11
            r12 = r13
            r13 = r14
            r14 = r0
            r15 = r17
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x00fd }
            boolean r0 = r21.moveToNext()     // Catch:{ SQLiteException -> 0x00fd }
            if (r0 == 0) goto L_0x00f7
            ern r0 = r22.q()     // Catch:{ SQLiteException -> 0x00fd }
            erp r0 = r0.c     // Catch:{ SQLiteException -> 0x00fd }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = defpackage.ern.a(r23)     // Catch:{ SQLiteException -> 0x00fd }
            r0.a(r1, r2)     // Catch:{ SQLiteException -> 0x00fd }
        L_0x00f7:
            if (r21 == 0) goto L_0x00fc
            r21.close()
        L_0x00fc:
            return r18
        L_0x00fd:
            r0 = move-exception
            goto L_0x010e
        L_0x00ff:
            r0 = move-exception
            r21 = r8
            goto L_0x012e
        L_0x0103:
            r0 = move-exception
            r21 = r8
            goto L_0x010e
        L_0x0107:
            r0 = move-exception
            r21 = r16
            goto L_0x012e
        L_0x010b:
            r0 = move-exception
            r21 = r16
        L_0x010e:
            ern r1 = r22.q()     // Catch:{ all -> 0x012d }
            erp r1 = r1.c     // Catch:{ all -> 0x012d }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = defpackage.ern.a(r23)     // Catch:{ all -> 0x012d }
            erl r4 = r22.n()     // Catch:{ all -> 0x012d }
            r5 = r24
            java.lang.String r4 = r4.a(r5)     // Catch:{ all -> 0x012d }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x012d }
            if (r21 == 0) goto L_0x012c
            r21.close()
        L_0x012c:
            return r16
        L_0x012d:
            r0 = move-exception
        L_0x012e:
            if (r21 == 0) goto L_0x0133
            r21.close()
        L_0x0133:
            goto L_0x0135
        L_0x0134:
            throw r0
        L_0x0135:
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.a(java.lang.String, java.lang.String):eqx");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ewr a(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r21 = this;
            java.lang.String r0 = "daily_realtime_events_count"
            java.lang.String r1 = "daily_error_events_count"
            java.lang.String r2 = "daily_conversions_count"
            java.lang.String r3 = "daily_public_events_count"
            java.lang.String r4 = "daily_events_count"
            java.lang.String r5 = "day"
            defpackage.bxo.a(r24)
            r21.c()
            r21.j()
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]
            r8 = 0
            r7[r8] = r24
            ewr r9 = new ewr
            r9.<init>()
            android.database.sqlite.SQLiteDatabase r15 = r21.w()     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            java.lang.String r12 = "apps"
            r11 = 6
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r13[r8] = r5     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r13[r6] = r4     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r14 = 2
            r13[r14] = r3     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r11 = 3
            r13[r11] = r2     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r10 = 4
            r13[r10] = r1     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r10 = 5
            r13[r10] = r0     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            java.lang.String r16 = "app_id=?"
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r10[r8] = r24     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            r17 = 0
            r18 = 0
            r19 = 0
            r11 = r15
            r14 = r16
            r20 = r15
            r15 = r10
            r16 = r17
            r17 = r18
            r18 = r19
            android.database.Cursor r10 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x010c, all -> 0x0109 }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0107 }
            if (r11 != 0) goto L_0x0070
            ern r0 = r21.q()     // Catch:{ SQLiteException -> 0x0107 }
            erp r0 = r0.f     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.String r1 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r2 = defpackage.ern.a(r24)     // Catch:{ SQLiteException -> 0x0107 }
            r0.a(r1, r2)     // Catch:{ SQLiteException -> 0x0107 }
            if (r10 == 0) goto L_0x006f
            r10.close()
        L_0x006f:
            return r9
        L_0x0070:
            long r11 = r10.getLong(r8)     // Catch:{ SQLiteException -> 0x0107 }
            int r8 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r8 != 0) goto L_0x009a
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0107 }
            r9.b = r11     // Catch:{ SQLiteException -> 0x0107 }
            r6 = 2
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0107 }
            r9.a = r11     // Catch:{ SQLiteException -> 0x0107 }
            r6 = 3
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0107 }
            r9.c = r11     // Catch:{ SQLiteException -> 0x0107 }
            r6 = 4
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0107 }
            r9.d = r11     // Catch:{ SQLiteException -> 0x0107 }
            r6 = 5
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0107 }
            r9.e = r11     // Catch:{ SQLiteException -> 0x0107 }
        L_0x009a:
            r11 = 1
            if (r25 == 0) goto L_0x00a3
            long r13 = r9.b     // Catch:{ SQLiteException -> 0x0107 }
            long r13 = r13 + r11
            r9.b = r13     // Catch:{ SQLiteException -> 0x0107 }
        L_0x00a3:
            if (r26 == 0) goto L_0x00aa
            long r13 = r9.a     // Catch:{ SQLiteException -> 0x0107 }
            long r13 = r13 + r11
            r9.a = r13     // Catch:{ SQLiteException -> 0x0107 }
        L_0x00aa:
            if (r27 == 0) goto L_0x00b1
            long r13 = r9.c     // Catch:{ SQLiteException -> 0x0107 }
            long r13 = r13 + r11
            r9.c = r13     // Catch:{ SQLiteException -> 0x0107 }
        L_0x00b1:
            if (r28 == 0) goto L_0x00b8
            long r13 = r9.d     // Catch:{ SQLiteException -> 0x0107 }
            long r13 = r13 + r11
            r9.d = r13     // Catch:{ SQLiteException -> 0x0107 }
        L_0x00b8:
            if (r29 == 0) goto L_0x00bf
            long r13 = r9.e     // Catch:{ SQLiteException -> 0x0107 }
            long r13 = r13 + r11
            r9.e = r13     // Catch:{ SQLiteException -> 0x0107 }
        L_0x00bf:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0107 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.Long r8 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x0107 }
            r6.put(r5, r8)     // Catch:{ SQLiteException -> 0x0107 }
            long r11 = r9.a     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0107 }
            r6.put(r3, r5)     // Catch:{ SQLiteException -> 0x0107 }
            long r11 = r9.b     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0107 }
            r6.put(r4, r3)     // Catch:{ SQLiteException -> 0x0107 }
            long r3 = r9.c     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0107 }
            r6.put(r2, r3)     // Catch:{ SQLiteException -> 0x0107 }
            long r2 = r9.d     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0107 }
            r6.put(r1, r2)     // Catch:{ SQLiteException -> 0x0107 }
            long r1 = r9.e     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0107 }
            r6.put(r0, r1)     // Catch:{ SQLiteException -> 0x0107 }
            java.lang.String r0 = "apps"
            java.lang.String r1 = "app_id=?"
            r2 = r20
            r2.update(r0, r6, r1, r7)     // Catch:{ SQLiteException -> 0x0107 }
            if (r10 == 0) goto L_0x0106
            r10.close()
        L_0x0106:
            return r9
        L_0x0107:
            r0 = move-exception
            goto L_0x010e
        L_0x0109:
            r0 = move-exception
            r10 = 0
            goto L_0x0124
        L_0x010c:
            r0 = move-exception
            r10 = 0
        L_0x010e:
            ern r1 = r21.q()     // Catch:{ all -> 0x0123 }
            erp r1 = r1.c     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = "Error updating daily counts. appId"
            java.lang.Object r3 = defpackage.ern.a(r24)     // Catch:{ all -> 0x0123 }
            r1.a(r2, r3, r0)     // Catch:{ all -> 0x0123 }
            if (r10 == 0) goto L_0x0122
            r10.close()
        L_0x0122:
            return r9
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            if (r10 == 0) goto L_0x0129
            r10.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):ewr");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(long r5) {
        /*
            r4 = this;
            r4.c()
            r4.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.w()     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0041, all -> 0x003e }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003c }
            if (r1 != 0) goto L_0x0032
            ern r6 = r4.q()     // Catch:{ SQLiteException -> 0x003c }
            erp r6 = r6.k     // Catch:{ SQLiteException -> 0x003c }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003c }
            if (r5 == 0) goto L_0x0031
            r5.close()
        L_0x0031:
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003c }
            if (r5 == 0) goto L_0x003b
            r5.close()
        L_0x003b:
            return r6
        L_0x003c:
            r6 = move-exception
            goto L_0x0043
        L_0x003e:
            r6 = move-exception
            r5 = r0
            goto L_0x0055
        L_0x0041:
            r6 = move-exception
            r5 = r0
        L_0x0043:
            ern r1 = r4.q()     // Catch:{ all -> 0x0054 }
            erp r1 = r1.c     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.a(r2, r6)     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x0053
            r5.close()
        L_0x0053:
            return r0
        L_0x0054:
            r6 = move-exception
        L_0x0055:
            if (r5 == 0) goto L_0x005a
            r5.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<defpackage.ewc> a(java.lang.String r23) {
        /*
            r22 = this;
            defpackage.bxo.a(r23)
            r22.c()
            r22.j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.w()     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            r6[r11] = r23     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0098, all -> 0x0093 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            if (r3 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x0047
            r2.close()
        L_0x0047:
            return r0
        L_0x0048:
            java.lang.String r18 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            java.lang.String r3 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch:{ SQLiteException -> 0x008f, all -> 0x008b }
            r3 = r22
            java.lang.Object r21 = r3.a(r2, r14)     // Catch:{ SQLiteException -> 0x0089 }
            if (r21 != 0) goto L_0x0072
            ern r4 = r22.q()     // Catch:{ SQLiteException -> 0x0089 }
            erp r4 = r4.c     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = defpackage.ern.a(r23)     // Catch:{ SQLiteException -> 0x0089 }
            r4.a(r5, r6)     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x007d
        L_0x0072:
            ewc r4 = new ewc     // Catch:{ SQLiteException -> 0x0089 }
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch:{ SQLiteException -> 0x0089 }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x007d:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r4 != 0) goto L_0x0048
            if (r2 == 0) goto L_0x0088
            r2.close()
        L_0x0088:
            return r0
        L_0x0089:
            r0 = move-exception
            goto L_0x009c
        L_0x008b:
            r0 = move-exception
            r3 = r22
            goto L_0x00b2
        L_0x008f:
            r0 = move-exception
            r3 = r22
            goto L_0x009c
        L_0x0093:
            r0 = move-exception
            r3 = r22
            r2 = r1
            goto L_0x00b2
        L_0x0098:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L_0x009c:
            ern r4 = r22.q()     // Catch:{ all -> 0x00b1 }
            erp r4 = r4.c     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = defpackage.ern.a(r23)     // Catch:{ all -> 0x00b1 }
            r4.a(r5, r6, r0)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x00b0
            r2.close()
        L_0x00b0:
            return r1
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            r2.close()
        L_0x00b7:
            goto L_0x00b9
        L_0x00b8:
            throw r0
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.a(java.lang.String):java.util.List");
    }

    public final List<Pair<ela, Long>> a(String str, int i2, int i3) {
        int i4 = i3;
        c();
        j();
        bxo.b(i2 > 0);
        bxo.b(i4 > 0);
        bxo.a(str);
        Cursor cursor = null;
        try {
            cursor = w().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
            if (!cursor.moveToFirst()) {
                List<Pair<ela, Long>> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            do {
                long j = cursor.getLong(0);
                try {
                    byte[] a2 = f().a(cursor.getBlob(1));
                    if (!arrayList.isEmpty() && a2.length + i5 > i4) {
                        break;
                    }
                    eqj a3 = eqj.a(a2, a2.length);
                    ela ela = new ela();
                    try {
                        ela.a(a3);
                        if (!cursor.isNull(2)) {
                            ela.H = Integer.valueOf(cursor.getInt(2));
                        }
                        i5 += a2.length;
                        arrayList.add(Pair.create(ela, Long.valueOf(j)));
                    } catch (IOException e2) {
                        q().c.a("Failed to merge queued bundle. appId", ern.a(str), e2);
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } catch (IOException e3) {
                    q().c.a("Failed to unzip queued bundle. appId", ern.a(str), e3);
                }
            } while (i5 <= i4);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e4) {
            q().c.a("Error querying bundles. appId", ern.a(str), e4);
            List<Pair<ela, Long>> emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0117, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0122, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r14 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0143, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<defpackage.ewc> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            defpackage.bxo.a(r22)
            r21.c()
            r21.j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0122, all -> 0x011e }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011e }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x011a, all -> 0x011e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x011a, all -> 0x011e }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x011a, all -> 0x011e }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x011a, all -> 0x011e }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            android.database.sqlite.SQLiteDatabase r12 = r21.w()     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r13 = "user_attributes"
            r2 = 4
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r2 = "name"
            r10 = 0
            r14[r10] = r2     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r2 = "set_timestamp"
            r8 = 1
            r14[r8] = r2     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r2 = "value"
            r9 = 2
            r14[r9] = r2     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r2 = "origin"
            r14[r3] = r2     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x0116, all -> 0x011e }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            if (r4 != 0) goto L_0x0092
            if (r2 == 0) goto L_0x0091
            r2.close()
        L_0x0091:
            return r0
        L_0x0092:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00ac
            ern r3 = r21.q()     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            erp r3 = r3.c     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            r3.a(r4, r6)     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            r14 = r21
            goto L_0x00f7
        L_0x00ac:
            java.lang.String r7 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            long r12 = r2.getLong(r8)     // Catch:{ SQLiteException -> 0x0112, all -> 0x010e }
            r14 = r21
            java.lang.Object r15 = r14.a(r2, r9)     // Catch:{ SQLiteException -> 0x010c }
            java.lang.String r6 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x010c }
            if (r15 != 0) goto L_0x00dc
            ern r4 = r21.q()     // Catch:{ SQLiteException -> 0x00d9 }
            erp r4 = r4.c     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = defpackage.ern.a(r22)     // Catch:{ SQLiteException -> 0x00d9 }
            r12 = r24
            r4.a(r5, r7, r6, r12)     // Catch:{ SQLiteException -> 0x00d9 }
            r17 = r6
            r12 = 0
            r18 = 2
            r19 = 1
            goto L_0x00f1
        L_0x00d9:
            r0 = move-exception
            r5 = r6
            goto L_0x012a
        L_0x00dc:
            ewc r5 = new ewc     // Catch:{ SQLiteException -> 0x0106 }
            r4 = r5
            r3 = r5
            r5 = r22
            r17 = r6
            r18 = 2
            r19 = 1
            r8 = r12
            r12 = 0
            r10 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0104 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0104 }
        L_0x00f1:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0104 }
            if (r3 != 0) goto L_0x00fd
        L_0x00f7:
            if (r2 == 0) goto L_0x00fc
            r2.close()
        L_0x00fc:
            return r0
        L_0x00fd:
            r5 = r17
            r3 = 3
            r8 = 1
            r9 = 2
            r10 = 0
            goto L_0x0092
        L_0x0104:
            r0 = move-exception
            goto L_0x0109
        L_0x0106:
            r0 = move-exception
            r17 = r6
        L_0x0109:
            r5 = r17
            goto L_0x012a
        L_0x010c:
            r0 = move-exception
            goto L_0x012a
        L_0x010e:
            r0 = move-exception
            r14 = r21
            goto L_0x0140
        L_0x0112:
            r0 = move-exception
            r14 = r21
            goto L_0x012a
        L_0x0116:
            r0 = move-exception
            r14 = r21
            goto L_0x0129
        L_0x011a:
            r0 = move-exception
            r14 = r21
            goto L_0x0127
        L_0x011e:
            r0 = move-exception
            r14 = r21
            goto L_0x0141
        L_0x0122:
            r0 = move-exception
            r14 = r21
            r11 = r22
        L_0x0127:
            r5 = r23
        L_0x0129:
            r2 = r1
        L_0x012a:
            ern r3 = r21.q()     // Catch:{ all -> 0x013f }
            erp r3 = r3.c     // Catch:{ all -> 0x013f }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = defpackage.ern.a(r22)     // Catch:{ all -> 0x013f }
            r3.a(r4, r6, r5, r0)     // Catch:{ all -> 0x013f }
            if (r2 == 0) goto L_0x013e
            r2.close()
        L_0x013e:
            return r1
        L_0x013f:
            r0 = move-exception
        L_0x0140:
            r1 = r2
        L_0x0141:
            if (r1 == 0) goto L_0x0146
            r1.close()
        L_0x0146:
            goto L_0x0148
        L_0x0147:
            throw r0
        L_0x0148:
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<defpackage.ewl> a(java.lang.String r40, java.lang.String[] r41) {
        /*
            r39 = this;
            r39.c()
            r39.j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r2 = r39.w()     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "app_id"
            r11 = 0
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "name"
            r13 = 2
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "active"
            r15 = 4
            r4[r15] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "trigger_event_name"
            r10 = 5
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "trigger_timeout"
            r9 = 6
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "timed_out_event"
            r8 = 7
            r4[r8] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "creation_timestamp"
            r7 = 8
            r4[r7] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "triggered_event"
            r6 = 9
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "triggered_timestamp"
            r1 = 10
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "time_to_live"
            r1 = 11
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            java.lang.String r5 = "expired_event"
            r1 = 12
            r4[r1] = r5     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "1001"
            r5 = r40
            r1 = 9
            r6 = r41
            r1 = 8
            r7 = r19
            r1 = 7
            r8 = r20
            r1 = 6
            r9 = r21
            r1 = 5
            r10 = r22
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0156, all -> 0x0153 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            if (r3 != 0) goto L_0x0086
            if (r2 == 0) goto L_0x0085
            r2.close()
        L_0x0085:
            return r0
        L_0x0086:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x009f
            ern r1 = r39.q()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            erp r1 = r1.c     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            java.lang.String r3 = "Read more than the max allowed conditional properties, ignoring extra"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r1.a(r3, r4)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            goto L_0x0144
        L_0x009f:
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            java.lang.String r10 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            java.lang.String r5 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r9 = r39
            java.lang.Object r8 = r9.a(r2, r14)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            int r4 = r2.getInt(r15)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            if (r4 == 0) goto L_0x00ba
            r22 = 1
            goto L_0x00bc
        L_0x00ba:
            r22 = 0
        L_0x00bc:
            java.lang.String r24 = r2.getString(r1)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r6 = 6
            long r25 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            evz r4 = r39.f()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r7 = 7
            byte[] r1 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable$Creator<erb> r6 = defpackage.erb.CREATOR     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable r1 = r4.a(r1, r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            erb r1 = (defpackage.erb) r1     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r6 = 8
            long r27 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            evz r4 = r39.f()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r11 = 9
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable$Creator<erb> r7 = defpackage.erb.CREATOR     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable r4 = r4.a(r6, r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r29 = r4
            erb r29 = (defpackage.erb) r29     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r6 = 10
            long r16 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r7 = 11
            long r31 = r2.getLong(r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            evz r4 = r39.f()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r11 = 12
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable$Creator<erb> r7 = defpackage.erb.CREATOR     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            android.os.Parcelable r4 = r4.a(r6, r7)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r30 = r4
            erb r30 = (defpackage.erb) r30     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            ewa r33 = new ewa     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r4 = r33
            r34 = 11
            r35 = 10
            r36 = 8
            r37 = 7
            r38 = 6
            r6 = r16
            r9 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            ewl r4 = new ewl     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r16 = r4
            r17 = r3
            r18 = r10
            r19 = r33
            r20 = r27
            r23 = r24
            r24 = r1
            r27 = r29
            r28 = r31
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            boolean r1 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0150, all -> 0x014e }
            if (r1 != 0) goto L_0x014a
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            r2.close()
        L_0x0149:
            return r0
        L_0x014a:
            r1 = 5
            r11 = 0
            goto L_0x0086
        L_0x014e:
            r0 = move-exception
            goto L_0x016f
        L_0x0150:
            r0 = move-exception
            r1 = r2
            goto L_0x0158
        L_0x0153:
            r0 = move-exception
            r2 = 0
            goto L_0x016f
        L_0x0156:
            r0 = move-exception
            r1 = 0
        L_0x0158:
            ern r2 = r39.q()     // Catch:{ all -> 0x016d }
            erp r2 = r2.c     // Catch:{ all -> 0x016d }
            java.lang.String r3 = "Error querying conditional user property value"
            r2.a(r3, r0)     // Catch:{ all -> 0x016d }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x016d }
            if (r1 == 0) goto L_0x016c
            r1.close()
        L_0x016c:
            return r0
        L_0x016d:
            r0 = move-exception
            r2 = r1
        L_0x016f:
            if (r2 == 0) goto L_0x0174
            r2.close()
        L_0x0174:
            goto L_0x0176
        L_0x0175:
            throw r0
        L_0x0176:
            goto L_0x0175
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.a(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void a(eqx eqx) {
        bxo.a(eqx);
        c();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", eqx.a);
        contentValues.put("name", eqx.b);
        contentValues.put("lifetime_count", Long.valueOf(eqx.c));
        contentValues.put("current_bundle_count", Long.valueOf(eqx.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(eqx.e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(eqx.f));
        contentValues.put("last_bundled_day", eqx.g);
        contentValues.put("last_sampled_complex_event_id", eqx.h);
        contentValues.put("last_sampling_rate", eqx.i);
        contentValues.put("last_exempt_from_sampling", (eqx.j == null || !eqx.j.booleanValue()) ? null : Long.valueOf(1));
        try {
            if (w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                q().c.a("Failed to insert/update event aggregates (got -1). appId", ern.a(eqx.a));
            }
        } catch (SQLiteException e2) {
            q().c.a("Error storing event aggregates. appId", ern.a(eqx.a), e2);
        }
    }

    public final void a(ewg ewg) {
        String str = "apps";
        bxo.a(ewg);
        c();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ewg.a());
        contentValues.put("app_instance_id", ewg.b());
        contentValues.put("gmp_app_id", ewg.c());
        contentValues.put("resettable_device_id_hash", ewg.e());
        contentValues.put("last_bundle_index", Long.valueOf(ewg.o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(ewg.g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(ewg.h()));
        contentValues.put("app_version", ewg.i());
        contentValues.put("app_store", ewg.k());
        contentValues.put("gmp_version", Long.valueOf(ewg.l()));
        contentValues.put("dev_cert_hash", Long.valueOf(ewg.m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(ewg.n()));
        ewg.a.p().c();
        contentValues.put("day", Long.valueOf(ewg.b));
        ewg.a.p().c();
        contentValues.put("daily_public_events_count", Long.valueOf(ewg.c));
        ewg.a.p().c();
        contentValues.put("daily_events_count", Long.valueOf(ewg.d));
        ewg.a.p().c();
        contentValues.put("daily_conversions_count", Long.valueOf(ewg.e));
        contentValues.put("config_fetched_time", Long.valueOf(ewg.p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(ewg.q()));
        contentValues.put("app_version_int", Long.valueOf(ewg.j()));
        contentValues.put("firebase_instance_id", ewg.f());
        ewg.a.p().c();
        contentValues.put("daily_error_events_count", Long.valueOf(ewg.f));
        ewg.a.p().c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(ewg.g));
        contentValues.put("health_monitor_sample", ewg.s());
        contentValues.put("android_id", Long.valueOf(ewg.t()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(ewg.u()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(ewg.v()));
        contentValues.put("admob_app_id", ewg.d());
        try {
            SQLiteDatabase w = w();
            if (((long) w.update(str, contentValues, "app_id = ?", new String[]{ewg.a()})) == 0 && w.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                q().c.a("Failed to insert/update app (got -1). appId", ern.a(ewg.a()));
            }
        } catch (SQLiteException e2) {
            q().c.a("Error storing app. appId", ern.a(ewg.a()), e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, ekm[] ekmArr) {
        boolean z;
        String str2 = str;
        ekm[] ekmArr2 = ekmArr;
        String str3 = "app_id=? and audience_id=?";
        String str4 = "event_filters";
        String str5 = "app_id=?";
        String str6 = "property_filters";
        j();
        c();
        bxo.a(str);
        bxo.a(ekmArr);
        SQLiteDatabase w = w();
        w.beginTransaction();
        try {
            j();
            c();
            bxo.a(str);
            SQLiteDatabase w2 = w();
            w2.delete(str6, str5, new String[]{str2});
            w2.delete(str4, str5, new String[]{str2});
            for (ekm ekm : ekmArr2) {
                j();
                c();
                bxo.a(str);
                bxo.a(ekm);
                bxo.a(ekm.c);
                bxo.a(ekm.b);
                if (ekm.a == null) {
                    q().f.a("Audience with no ID. appId", ern.a(str));
                } else {
                    int intValue = ekm.a.intValue();
                    ekn[] eknArr = ekm.c;
                    int length = eknArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            ekq[] ekqArr = ekm.b;
                            int length2 = ekqArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    ekn[] eknArr2 = ekm.c;
                                    int length3 = eknArr2.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= length3) {
                                            z = true;
                                            break;
                                        } else if (!a(str2, intValue, eknArr2[i4])) {
                                            z = false;
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (z) {
                                        ekq[] ekqArr2 = ekm.b;
                                        int length4 = ekqArr2.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length4) {
                                                break;
                                            } else if (!a(str2, intValue, ekqArr2[i5])) {
                                                z = false;
                                                break;
                                            } else {
                                                i5++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        j();
                                        c();
                                        bxo.a(str);
                                        SQLiteDatabase w3 = w();
                                        w3.delete(str6, str3, new String[]{str2, String.valueOf(intValue)});
                                        w3.delete(str4, str3, new String[]{str2, String.valueOf(intValue)});
                                    }
                                } else if (ekqArr[i3].a == null) {
                                    q().f.a("Property filter with no ID. Audience definition ignored. appId, audienceId", ern.a(str), ekm.a);
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        } else if (eknArr[i2].a == null) {
                            q().f.a("Event filter with no ID. Audience definition ignored. appId, audienceId", ern.a(str), ekm.a);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (ekm ekm2 : ekmArr2) {
                arrayList.add(ekm2.a);
            }
            a(str2, (List<Integer>) arrayList);
            w.setTransactionSuccessful();
        } finally {
            w.endTransaction();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(List<Long> list) {
        c();
        j();
        bxo.a(list);
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (L()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (b(sb3.toString(), (String[]) null) > 0) {
                q().f.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase w = w();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                w.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                q().c.a("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean a(ela ela, boolean z) {
        c();
        j();
        bxo.a(ela);
        bxo.a(ela.o);
        bxo.a(ela.f);
        z();
        long a2 = l().a();
        if (ela.f.longValue() < a2 - ewn.g() || ela.f.longValue() > ewn.g() + a2) {
            q().f.a("Storing bundle outside of the max uploading time span. appId, now, timestamp", ern.a(ela.o), Long.valueOf(a2), ela.f);
        }
        try {
            byte[] bArr = new byte[ela.e()];
            eqk a3 = eqk.a(bArr, bArr.length);
            ela.a(a3);
            a3.a();
            byte[] b = f().b(bArr);
            q().k.a("Saving bundle, size", Integer.valueOf(b.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ela.o);
            contentValues.put("bundle_end_timestamp", ela.f);
            contentValues.put("data", b);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (ela.H != null) {
                contentValues.put("retry_count", ela.H);
            }
            try {
                if (w().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                q().c.a("Failed to insert bundle (got -1). appId", ern.a(ela.o));
                return false;
            } catch (SQLiteException e2) {
                q().c.a("Error storing bundle. appId", ern.a(ela.o), e2);
                return false;
            }
        } catch (IOException e3) {
            q().c.a("Data loss. Failed to serialize bundle. appId", ern.a(ela.o), e3);
            return false;
        }
    }

    public final boolean a(ewc ewc) {
        bxo.a(ewc);
        c();
        j();
        if (c(ewc.a, ewc.c) == null) {
            if (ewd.a(ewc.c)) {
                if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{ewc.a}) >= 25) {
                    return false;
                }
            } else {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{ewc.a, ewc.b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ewc.a);
        contentValues.put("origin", ewc.b);
        contentValues.put("name", ewc.c);
        contentValues.put("set_timestamp", Long.valueOf(ewc.d));
        a(contentValues, "value", ewc.e);
        try {
            if (w().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                q().c.a("Failed to insert/update user property (got -1). appId", ern.a(ewc.a));
            }
        } catch (SQLiteException e2) {
            q().c.a("Error storing user property. appId", ern.a(ewc.a), e2);
        }
        return true;
    }

    public final boolean a(ewl ewl) {
        bxo.a(ewl);
        c();
        j();
        if (c(ewl.a, ewl.c.a) == null) {
            if (b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{ewl.a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ewl.a);
        contentValues.put("origin", ewl.b);
        contentValues.put("name", ewl.c.a);
        a(contentValues, "value", ewl.c.a());
        contentValues.put("active", Boolean.valueOf(ewl.e));
        contentValues.put("trigger_event_name", ewl.f);
        contentValues.put("trigger_timeout", Long.valueOf(ewl.h));
        o();
        contentValues.put("timed_out_event", ewd.a((Parcelable) ewl.g));
        contentValues.put("creation_timestamp", Long.valueOf(ewl.d));
        o();
        contentValues.put("triggered_event", ewd.a((Parcelable) ewl.i));
        contentValues.put("triggered_timestamp", Long.valueOf(ewl.c.b));
        contentValues.put("time_to_live", Long.valueOf(ewl.j));
        o();
        contentValues.put("expired_event", ewd.a((Parcelable) ewl.k));
        try {
            if (w().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                q().c.a("Failed to insert/update conditional user property (got -1)", ern.a(ewl.a));
            }
        } catch (SQLiteException e2) {
            q().c.a("Error storing conditional user property", ern.a(ewl.a), e2);
        }
        return true;
    }

    public final boolean a(ewy ewy, long j, boolean z) {
        c();
        j();
        bxo.a(ewy);
        bxo.a(ewy.a);
        ekx ekx = new ekx();
        ekx.d = Long.valueOf(ewy.d);
        ekx.a = new eky[ewy.e.a.size()];
        Iterator it = ewy.e.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            eky eky = new eky();
            int i3 = i2 + 1;
            ekx.a[i2] = eky;
            eky.a = str;
            f().a(eky, ewy.e.a(str));
            i2 = i3;
        }
        try {
            byte[] bArr = new byte[ekx.e()];
            eqk a2 = eqk.a(bArr, bArr.length);
            ekx.a(a2);
            a2.a();
            q().k.a("Saving event, name, data size", n().a(ewy.b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ewy.a);
            contentValues.put("name", ewy.b);
            contentValues.put("timestamp", Long.valueOf(ewy.c));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (w().insert("raw_events", null, contentValues) != -1) {
                    return true;
                }
                q().c.a("Failed to insert raw event (got -1). appId", ern.a(ewy.a));
                return false;
            } catch (SQLiteException e2) {
                q().c.a("Error storing raw event. appId", ern.a(ewy.a), e2);
                return false;
            }
        } catch (IOException e3) {
            q().c.a("Data loss. Failed to serialize event params/data. appId", ern.a(ewy.a), e3);
            return false;
        }
    }

    public final boolean a(String str, Long l, long j, ekx ekx) {
        c();
        j();
        bxo.a(ekx);
        bxo.a(str);
        bxo.a(l);
        try {
            byte[] bArr = new byte[ekx.e()];
            eqk a2 = eqk.a(bArr, bArr.length);
            ekx.a(a2);
            a2.a();
            q().k.a("Saving complex main event, appId, data size", n().a(str), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (w().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                q().c.a("Failed to insert complex main event (got -1). appId", ern.a(str));
                return false;
            } catch (SQLiteException e2) {
                q().c.a("Error storing complex main event. appId", ern.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            q().c.a("Data loss. Failed to serialize event params/data. appId, eventId", ern.a(str), l, e3);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0157 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0159 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0176 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0178 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0195 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0197 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01b4 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b6 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01d6 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01da A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0202 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0204 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0221 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0223 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x023a A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x023d A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x024c A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0261 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0286 A[Catch:{ SQLiteException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ewg b(java.lang.String r23) {
        /*
            r22 = this;
            r1 = r23
            defpackage.bxo.a(r23)
            r22.c()
            r22.j()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r22.w()     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r4 = "apps"
            r0 = 26
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "app_instance_id"
            r11 = 0
            r5[r11] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "gmp_app_id"
            r12 = 1
            r5[r12] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "resettable_device_id_hash"
            r13 = 2
            r5[r13] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "last_bundle_index"
            r14 = 3
            r5[r14] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r15 = 4
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r5[r10] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "app_version"
            r9 = 6
            r5[r9] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "app_store"
            r8 = 7
            r5[r8] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "gmp_version"
            r7 = 8
            r5[r7] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 9
            java.lang.String r6 = "dev_cert_hash"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "measurement_enabled"
            r6 = 10
            r5[r6] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 11
            java.lang.String r16 = "day"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 12
            java.lang.String r16 = "daily_public_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 13
            java.lang.String r16 = "daily_events_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 14
            java.lang.String r16 = "daily_conversions_count"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 15
            java.lang.String r16 = "config_fetched_time"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 16
            java.lang.String r16 = "failed_config_fetch_time"
            r5[r0] = r16     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "app_version_int"
            r15 = 17
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 18
            java.lang.String r17 = "firebase_instance_id"
            r5[r0] = r17     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 19
            java.lang.String r17 = "daily_error_events_count"
            r5[r0] = r17     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 20
            java.lang.String r17 = "daily_realtime_events_count"
            r5[r0] = r17     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 21
            java.lang.String r17 = "health_monitor_sample"
            r5[r0] = r17     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "android_id"
            r15 = 22
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "adid_reporting_enabled"
            r15 = 23
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "ssaid_reporting_enabled"
            r15 = 24
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r0 = 25
            java.lang.String r18 = "admob_app_id"
            r5[r0] = r18     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            java.lang.String r0 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            r19 = 0
            r20 = 0
            r21 = 0
            r15 = 10
            r6 = r0
            r0 = 8
            r15 = 7
            r8 = r19
            r0 = 6
            r9 = r20
            r15 = 5
            r10 = r21
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x02aa, all -> 0x02a5 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            if (r4 != 0) goto L_0x00d4
            if (r3 == 0) goto L_0x00d3
            r3.close()
        L_0x00d3:
            return r2
        L_0x00d4:
            ewg r4 = new ewg     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            r5 = r22
            evt r6 = r5.b     // Catch:{ SQLiteException -> 0x029b }
            esp r6 = r6.b     // Catch:{ SQLiteException -> 0x029b }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x029b }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x029b }
            r4.a(r6)     // Catch:{ SQLiteException -> 0x029b }
            java.lang.String r6 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x029b }
            r4.b(r6)     // Catch:{ SQLiteException -> 0x029b }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x029b }
            r4.d(r6)     // Catch:{ SQLiteException -> 0x029b }
            long r6 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x029b }
            r4.f(r6)     // Catch:{ SQLiteException -> 0x029b }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x029b }
            r4.a(r6)     // Catch:{ SQLiteException -> 0x029b }
            long r6 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x029b }
            r4.b(r6)     // Catch:{ SQLiteException -> 0x029b }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.f(r0)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 7
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.g(r0)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 8
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.d(r6)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 9
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.e(r6)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 10
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r6 != 0) goto L_0x013c
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r0 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r0 = 0
            goto L_0x013d
        L_0x013c:
            r0 = 1
        L_0x013d:
            r4.a(r0)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 11
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            esp r0 = r4.a     // Catch:{ SQLiteException -> 0x029b }
            esl r0 = r0.p()     // Catch:{ SQLiteException -> 0x029b }
            r0.c()     // Catch:{ SQLiteException -> 0x029b }
            boolean r0 = r4.i     // Catch:{ SQLiteException -> 0x029b }
            long r8 = r4.b     // Catch:{ SQLiteException -> 0x029b }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0159
            r8 = 1
            goto L_0x015a
        L_0x0159:
            r8 = 0
        L_0x015a:
            r0 = r0 | r8
            r4.i = r0     // Catch:{ SQLiteException -> 0x029b }
            r4.b = r6     // Catch:{ SQLiteException -> 0x029b }
            r0 = 12
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            esp r0 = r4.a     // Catch:{ SQLiteException -> 0x029b }
            esl r0 = r0.p()     // Catch:{ SQLiteException -> 0x029b }
            r0.c()     // Catch:{ SQLiteException -> 0x029b }
            boolean r0 = r4.i     // Catch:{ SQLiteException -> 0x029b }
            long r8 = r4.c     // Catch:{ SQLiteException -> 0x029b }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0178
            r8 = 1
            goto L_0x0179
        L_0x0178:
            r8 = 0
        L_0x0179:
            r0 = r0 | r8
            r4.i = r0     // Catch:{ SQLiteException -> 0x029b }
            r4.c = r6     // Catch:{ SQLiteException -> 0x029b }
            r0 = 13
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            esp r0 = r4.a     // Catch:{ SQLiteException -> 0x029b }
            esl r0 = r0.p()     // Catch:{ SQLiteException -> 0x029b }
            r0.c()     // Catch:{ SQLiteException -> 0x029b }
            boolean r0 = r4.i     // Catch:{ SQLiteException -> 0x029b }
            long r8 = r4.d     // Catch:{ SQLiteException -> 0x029b }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0197
            r8 = 1
            goto L_0x0198
        L_0x0197:
            r8 = 0
        L_0x0198:
            r0 = r0 | r8
            r4.i = r0     // Catch:{ SQLiteException -> 0x029b }
            r4.d = r6     // Catch:{ SQLiteException -> 0x029b }
            r0 = 14
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            esp r0 = r4.a     // Catch:{ SQLiteException -> 0x029b }
            esl r0 = r0.p()     // Catch:{ SQLiteException -> 0x029b }
            r0.c()     // Catch:{ SQLiteException -> 0x029b }
            boolean r0 = r4.i     // Catch:{ SQLiteException -> 0x029b }
            long r8 = r4.e     // Catch:{ SQLiteException -> 0x029b }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x01b6
            r8 = 1
            goto L_0x01b7
        L_0x01b6:
            r8 = 0
        L_0x01b7:
            r0 = r0 | r8
            r4.i = r0     // Catch:{ SQLiteException -> 0x029b }
            r4.e = r6     // Catch:{ SQLiteException -> 0x029b }
            r0 = 15
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.g(r6)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 16
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.h(r6)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 17
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r6 == 0) goto L_0x01da
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x01df
        L_0x01da:
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x029b }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x029b }
        L_0x01df:
            r4.c(r6)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 18
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.e(r0)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 19
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            esp r0 = r4.a     // Catch:{ SQLiteException -> 0x029b }
            esl r0 = r0.p()     // Catch:{ SQLiteException -> 0x029b }
            r0.c()     // Catch:{ SQLiteException -> 0x029b }
            boolean r0 = r4.i     // Catch:{ SQLiteException -> 0x029b }
            long r8 = r4.f     // Catch:{ SQLiteException -> 0x029b }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0204
            r8 = 1
            goto L_0x0205
        L_0x0204:
            r8 = 0
        L_0x0205:
            r0 = r0 | r8
            r4.i = r0     // Catch:{ SQLiteException -> 0x029b }
            r4.f = r6     // Catch:{ SQLiteException -> 0x029b }
            r0 = 20
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
            esp r0 = r4.a     // Catch:{ SQLiteException -> 0x029b }
            esl r0 = r0.p()     // Catch:{ SQLiteException -> 0x029b }
            r0.c()     // Catch:{ SQLiteException -> 0x029b }
            boolean r0 = r4.i     // Catch:{ SQLiteException -> 0x029b }
            long r8 = r4.g     // Catch:{ SQLiteException -> 0x029b }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0223
            r8 = 1
            goto L_0x0224
        L_0x0223:
            r8 = 0
        L_0x0224:
            r0 = r0 | r8
            r4.i = r0     // Catch:{ SQLiteException -> 0x029b }
            r4.g = r6     // Catch:{ SQLiteException -> 0x029b }
            r0 = 21
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.h(r0)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 22
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r6 == 0) goto L_0x023d
            r6 = 0
            goto L_0x0241
        L_0x023d:
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029b }
        L_0x0241:
            r4.i(r6)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 23
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r6 != 0) goto L_0x0255
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r0 == 0) goto L_0x0253
            goto L_0x0255
        L_0x0253:
            r0 = 0
            goto L_0x0256
        L_0x0255:
            r0 = 1
        L_0x0256:
            r4.b(r0)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 24
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r6 != 0) goto L_0x0269
            int r0 = r3.getInt(r0)     // Catch:{ SQLiteException -> 0x029b }
            if (r0 == 0) goto L_0x0268
            goto L_0x0269
        L_0x0268:
            r12 = 0
        L_0x0269:
            r4.c(r12)     // Catch:{ SQLiteException -> 0x029b }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x029b }
            r4.c(r0)     // Catch:{ SQLiteException -> 0x029b }
            esp r0 = r4.a     // Catch:{ SQLiteException -> 0x029b }
            esl r0 = r0.p()     // Catch:{ SQLiteException -> 0x029b }
            r0.c()     // Catch:{ SQLiteException -> 0x029b }
            r4.i = r11     // Catch:{ SQLiteException -> 0x029b }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x029b }
            if (r0 == 0) goto L_0x0295
            ern r0 = r22.q()     // Catch:{ SQLiteException -> 0x029b }
            erp r0 = r0.c     // Catch:{ SQLiteException -> 0x029b }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = defpackage.ern.a(r23)     // Catch:{ SQLiteException -> 0x029b }
            r0.a(r6, r7)     // Catch:{ SQLiteException -> 0x029b }
        L_0x0295:
            if (r3 == 0) goto L_0x029a
            r3.close()
        L_0x029a:
            return r4
        L_0x029b:
            r0 = move-exception
            goto L_0x02ae
        L_0x029d:
            r0 = move-exception
            r5 = r22
            goto L_0x02c4
        L_0x02a1:
            r0 = move-exception
            r5 = r22
            goto L_0x02ae
        L_0x02a5:
            r0 = move-exception
            r5 = r22
            r3 = r2
            goto L_0x02c4
        L_0x02aa:
            r0 = move-exception
            r5 = r22
            r3 = r2
        L_0x02ae:
            ern r4 = r22.q()     // Catch:{ all -> 0x02c3 }
            erp r4 = r4.c     // Catch:{ all -> 0x02c3 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = defpackage.ern.a(r23)     // Catch:{ all -> 0x02c3 }
            r4.a(r6, r1, r0)     // Catch:{ all -> 0x02c3 }
            if (r3 == 0) goto L_0x02c2
            r3.close()
        L_0x02c2:
            return r2
        L_0x02c3:
            r0 = move-exception
        L_0x02c4:
            if (r3 == 0) goto L_0x02c9
            r3.close()
        L_0x02c9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.b(java.lang.String):ewg");
    }

    public final List<ewl> b(String str, String str2, String str3) {
        bxo.a(str);
        c();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void b(String str, String str2) {
        bxo.a(str);
        bxo.a(str2);
        c();
        j();
        try {
            q().k.a("Deleted user attribute rows", Integer.valueOf(w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e2) {
            q().c.a("Error deleting user attribute. appId", ern.a(str), n().c(str2), e2);
        }
    }

    public final long c(String str) {
        bxo.a(str);
        c();
        j();
        try {
            return (long) w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, s().b(str, erd.w))))});
        } catch (SQLiteException e2) {
            q().c.a("Error deleting over the limit events. appId", ern.a(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ewc c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            defpackage.bxo.a(r19)
            defpackage.bxo.a(r20)
            r18.c()
            r18.j()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.w()     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0086, all -> 0x0081 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007d, all -> 0x0079 }
            if (r0 != 0) goto L_0x0044
            if (r10 == 0) goto L_0x0043
            r10.close()
        L_0x0043:
            return r9
        L_0x0044:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007d, all -> 0x0079 }
            r11 = r18
            java.lang.Object r7 = r11.a(r10, r2)     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ SQLiteException -> 0x0077 }
            ewc r0 = new ewc     // Catch:{ SQLiteException -> 0x0077 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0077 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 == 0) goto L_0x0071
            ern r1 = r18.q()     // Catch:{ SQLiteException -> 0x0077 }
            erp r1 = r1.c     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = defpackage.ern.a(r19)     // Catch:{ SQLiteException -> 0x0077 }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x0077 }
        L_0x0071:
            if (r10 == 0) goto L_0x0076
            r10.close()
        L_0x0076:
            return r0
        L_0x0077:
            r0 = move-exception
            goto L_0x008a
        L_0x0079:
            r0 = move-exception
            r11 = r18
            goto L_0x00a8
        L_0x007d:
            r0 = move-exception
            r11 = r18
            goto L_0x008a
        L_0x0081:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00a8
        L_0x0086:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x008a:
            ern r1 = r18.q()     // Catch:{ all -> 0x00a7 }
            erp r1 = r1.c     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = defpackage.ern.a(r19)     // Catch:{ all -> 0x00a7 }
            erl r4 = r18.n()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.c(r8)     // Catch:{ all -> 0x00a7 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r10 == 0) goto L_0x00a6
            r10.close()
        L_0x00a6:
            return r9
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.c(java.lang.String, java.lang.String):ewc");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ewl d(java.lang.String r33, java.lang.String r34) {
        /*
            r32 = this;
            r7 = r34
            defpackage.bxo.a(r33)
            defpackage.bxo.a(r34)
            r32.c()
            r32.j()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r32.w()     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r10 = "conditional_properties"
            r0 = 11
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "origin"
            r1 = 0
            r11[r1] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "value"
            r2 = 1
            r11[r2] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "active"
            r3 = 2
            r11[r3] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "trigger_event_name"
            r4 = 3
            r11[r4] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "trigger_timeout"
            r5 = 4
            r11[r5] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "timed_out_event"
            r6 = 5
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r11[r15] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r11[r14] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r11[r13] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "time_to_live"
            r12 = 9
            r11[r12] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "expired_event"
            r6 = 10
            r11[r6] = r0     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            java.lang.String r0 = "app_id=? and name=?"
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            r13[r1] = r33     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            r17 = 0
            r18 = 0
            r19 = 0
            r6 = 9
            r12 = r0
            r0 = 8
            r6 = 7
            r14 = r17
            r0 = 6
            r15 = r18
            r16 = r19
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x012d, all -> 0x0128 }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0124, all -> 0x0120 }
            if (r10 != 0) goto L_0x007e
            if (r9 == 0) goto L_0x007d
            r9.close()
        L_0x007d:
            return r8
        L_0x007e:
            java.lang.String r19 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x0124, all -> 0x0120 }
            r10 = r32
            java.lang.Object r11 = r10.a(r9, r2)     // Catch:{ SQLiteException -> 0x011e }
            int r3 = r9.getInt(r3)     // Catch:{ SQLiteException -> 0x011e }
            if (r3 == 0) goto L_0x0091
            r23 = 1
            goto L_0x0093
        L_0x0091:
            r23 = 0
        L_0x0093:
            java.lang.String r24 = r9.getString(r4)     // Catch:{ SQLiteException -> 0x011e }
            long r26 = r9.getLong(r5)     // Catch:{ SQLiteException -> 0x011e }
            evz r1 = r32.f()     // Catch:{ SQLiteException -> 0x011e }
            r2 = 5
            byte[] r2 = r9.getBlob(r2)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator<erb> r3 = defpackage.erb.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r1 = r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x011e }
            r25 = r1
            erb r25 = (defpackage.erb) r25     // Catch:{ SQLiteException -> 0x011e }
            long r12 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            evz r0 = r32.f()     // Catch:{ SQLiteException -> 0x011e }
            byte[] r1 = r9.getBlob(r6)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator<erb> r2 = defpackage.erb.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r0 = r0.a(r1, r2)     // Catch:{ SQLiteException -> 0x011e }
            r28 = r0
            erb r28 = (defpackage.erb) r28     // Catch:{ SQLiteException -> 0x011e }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            r0 = 9
            long r29 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x011e }
            evz r0 = r32.f()     // Catch:{ SQLiteException -> 0x011e }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable$Creator<erb> r2 = defpackage.erb.CREATOR     // Catch:{ SQLiteException -> 0x011e }
            android.os.Parcelable r0 = r0.a(r1, r2)     // Catch:{ SQLiteException -> 0x011e }
            r31 = r0
            erb r31 = (defpackage.erb) r31     // Catch:{ SQLiteException -> 0x011e }
            ewa r20 = new ewa     // Catch:{ SQLiteException -> 0x011e }
            r1 = r20
            r2 = r34
            r5 = r11
            r6 = r19
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x011e }
            ewl r0 = new ewl     // Catch:{ SQLiteException -> 0x011e }
            r17 = r0
            r18 = r33
            r21 = r12
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r31)     // Catch:{ SQLiteException -> 0x011e }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x011e }
            if (r1 == 0) goto L_0x0118
            ern r1 = r32.q()     // Catch:{ SQLiteException -> 0x011e }
            erp r1 = r1.c     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = defpackage.ern.a(r33)     // Catch:{ SQLiteException -> 0x011e }
            erl r4 = r32.n()     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r4 = r4.c(r7)     // Catch:{ SQLiteException -> 0x011e }
            r1.a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x011e }
        L_0x0118:
            if (r9 == 0) goto L_0x011d
            r9.close()
        L_0x011d:
            return r0
        L_0x011e:
            r0 = move-exception
            goto L_0x0131
        L_0x0120:
            r0 = move-exception
            r10 = r32
            goto L_0x014f
        L_0x0124:
            r0 = move-exception
            r10 = r32
            goto L_0x0131
        L_0x0128:
            r0 = move-exception
            r10 = r32
            r9 = r8
            goto L_0x014f
        L_0x012d:
            r0 = move-exception
            r10 = r32
            r9 = r8
        L_0x0131:
            ern r1 = r32.q()     // Catch:{ all -> 0x014e }
            erp r1 = r1.c     // Catch:{ all -> 0x014e }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = defpackage.ern.a(r33)     // Catch:{ all -> 0x014e }
            erl r4 = r32.n()     // Catch:{ all -> 0x014e }
            java.lang.String r4 = r4.c(r7)     // Catch:{ all -> 0x014e }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x014e }
            if (r9 == 0) goto L_0x014d
            r9.close()
        L_0x014d:
            return r8
        L_0x014e:
            r0 = move-exception
        L_0x014f:
            if (r9 == 0) goto L_0x0154
            r9.close()
        L_0x0154:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.d(java.lang.String, java.lang.String):ewl");
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d(java.lang.String r12) {
        /*
            r11 = this;
            defpackage.bxo.a(r12)
            r11.c()
            r11.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.w()     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            r6[r9] = r12     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0056 }
            if (r2 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0056 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0056 }
            if (r3 == 0) goto L_0x0050
            ern r3 = r11.q()     // Catch:{ SQLiteException -> 0x0056 }
            erp r3 = r3.c     // Catch:{ SQLiteException -> 0x0056 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = defpackage.ern.a(r12)     // Catch:{ SQLiteException -> 0x0056 }
            r3.a(r4, r5)     // Catch:{ SQLiteException -> 0x0056 }
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1.close()
        L_0x0055:
            return r2
        L_0x0056:
            r2 = move-exception
            goto L_0x005d
        L_0x0058:
            r12 = move-exception
            r1 = r0
            goto L_0x0073
        L_0x005b:
            r2 = move-exception
            r1 = r0
        L_0x005d:
            ern r3 = r11.q()     // Catch:{ all -> 0x0072 }
            erp r3 = r3.c     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = defpackage.ern.a(r12)     // Catch:{ all -> 0x0072 }
            r3.a(r4, r12, r2)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            return r0
        L_0x0072:
            r12 = move-exception
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()
        L_0x0078:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.d(java.lang.String):byte[]");
    }

    public final int e(String str, String str2) {
        bxo.a(str);
        bxo.a(str2);
        c();
        j();
        try {
            return w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            q().c.a("Error deleting conditional property", ern.a(str), n().c(str2), e2);
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, defpackage.elb> e(java.lang.String r12) {
        /*
            r11 = this;
            r11.j()
            r11.c()
            defpackage.bxo.a(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.w()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r4[r9] = r12     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0078 }
            if (r1 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            return r8
        L_0x0036:
            dp r1 = new dp     // Catch:{ SQLiteException -> 0x0078 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0078 }
        L_0x003b:
            int r2 = r0.getInt(r9)     // Catch:{ SQLiteException -> 0x0078 }
            byte[] r3 = r0.getBlob(r10)     // Catch:{ SQLiteException -> 0x0078 }
            int r4 = r3.length     // Catch:{ SQLiteException -> 0x0078 }
            eqj r3 = defpackage.eqj.a(r3, r4)     // Catch:{ SQLiteException -> 0x0078 }
            elb r4 = new elb     // Catch:{ SQLiteException -> 0x0078 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0078 }
            r4.a(r3)     // Catch:{ IOException -> 0x0058 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x0078 }
            goto L_0x006c
        L_0x0058:
            r3 = move-exception
            ern r4 = r11.q()     // Catch:{ SQLiteException -> 0x0078 }
            erp r4 = r4.c     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = defpackage.ern.a(r12)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0078 }
            r4.a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0078 }
        L_0x006c:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0078 }
            if (r2 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x0077
            r0.close()
        L_0x0077:
            return r1
        L_0x0078:
            r1 = move-exception
            goto L_0x007f
        L_0x007a:
            r12 = move-exception
            r0 = r8
            goto L_0x0095
        L_0x007d:
            r1 = move-exception
            r0 = r8
        L_0x007f:
            ern r2 = r11.q()     // Catch:{ all -> 0x0094 }
            erp r2 = r2.c     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = defpackage.ern.a(r12)     // Catch:{ all -> 0x0094 }
            r2.a(r3, r12, r1)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0093
            r0.close()
        L_0x0093:
            return r8
        L_0x0094:
            r12 = move-exception
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            r0.close()
        L_0x009a:
            goto L_0x009c
        L_0x009b:
            throw r12
        L_0x009c:
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.e(java.lang.String):java.util.Map");
    }

    public final void e() {
        j();
        w().beginTransaction();
    }

    public final long f(String str) {
        bxo.a(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.ekn>> f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.j()
            r12.c()
            defpackage.bxo.a(r13)
            defpackage.bxo.a(r14)
            dp r0 = new dp
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.w()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r13
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0095 }
            eqj r1 = defpackage.eqj.a(r1, r2)     // Catch:{ SQLiteException -> 0x0095 }
            ekn r2 = new ekn     // Catch:{ SQLiteException -> 0x0095 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            r2.a(r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0079:
            r1 = move-exception
            ern r2 = r12.q()     // Catch:{ SQLiteException -> 0x0095 }
            erp r2 = r2.c     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = defpackage.ern.a(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009c
        L_0x0097:
            r13 = move-exception
            r14 = r9
            goto L_0x00b2
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            ern r1 = r12.q()     // Catch:{ all -> 0x00b1 }
            erp r1 = r1.c     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = defpackage.ern.a(r13)     // Catch:{ all -> 0x00b1 }
            r1.a(r2, r13, r0)     // Catch:{ all -> 0x00b1 }
            if (r14 == 0) goto L_0x00b0
            r14.close()
        L_0x00b0:
            return r9
        L_0x00b1:
            r13 = move-exception
        L_0x00b2:
            if (r14 == 0) goto L_0x00b7
            r14.close()
        L_0x00b7:
            goto L_0x00b9
        L_0x00b8:
            throw r13
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<defpackage.ekq>> g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.j()
            r12.c()
            defpackage.bxo.a(r13)
            defpackage.bxo.a(r14)
            dp r0 = new dp
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.w()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r13
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0095 }
            eqj r1 = defpackage.eqj.a(r1, r2)     // Catch:{ SQLiteException -> 0x0095 }
            ekq r2 = new ekq     // Catch:{ SQLiteException -> 0x0095 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            r2.a(r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0079:
            r1 = move-exception
            ern r2 = r12.q()     // Catch:{ SQLiteException -> 0x0095 }
            erp r2 = r2.c     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = defpackage.ern.a(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009c
        L_0x0097:
            r13 = move-exception
            r14 = r9
            goto L_0x00b2
        L_0x009a:
            r0 = move-exception
            r14 = r9
        L_0x009c:
            ern r1 = r12.q()     // Catch:{ all -> 0x00b1 }
            erp r1 = r1.c     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = defpackage.ern.a(r13)     // Catch:{ all -> 0x00b1 }
            r1.a(r2, r13, r0)     // Catch:{ all -> 0x00b1 }
            if (r14 == 0) goto L_0x00b0
            r14.close()
        L_0x00b0:
            return r9
        L_0x00b1:
            r13 = move-exception
        L_0x00b2:
            if (r14 == 0) goto L_0x00b7
            r14.close()
        L_0x00b7:
            goto L_0x00b9
        L_0x00b8:
            throw r13
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    public final long h(String str, String str2) {
        long j;
        String str3 = str;
        String str4 = str2;
        bxo.a(str);
        bxo.a(str2);
        c();
        j();
        SQLiteDatabase w = w();
        w.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                j = a(sb.toString(), new String[]{str3}, -1);
                String str5 = "app2";
                String str6 = "app_id";
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str6, str3);
                    contentValues.put("first_open_count", Integer.valueOf(0));
                    contentValues.put("previous_install_count", Integer.valueOf(0));
                    if (w.insertWithOnConflict(str5, null, contentValues, 5) == -1) {
                        q().c.a("Failed to insert column (got -1). appId", ern.a(str), str4);
                        w.endTransaction();
                        return -1;
                    }
                    j = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(str6, str3);
                    contentValues2.put(str4, Long.valueOf(1 + j));
                    if (((long) w.update(str5, contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                        q().c.a("Failed to update column (got 0). appId", ern.a(str), str4);
                        w.endTransaction();
                        return -1;
                    }
                    w.setTransactionSuccessful();
                    w.endTransaction();
                    return j;
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        q().c.a("Error inserting column. appId", ern.a(str), str4, e);
                        w.endTransaction();
                        return j;
                    } catch (Throwable th) {
                        th = th;
                        w.endTransaction();
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                j = 0;
                q().c.a("Error inserting column. appId", ern.a(str), str4, e);
                w.endTransaction();
                return j;
            }
        } catch (SQLiteException e4) {
            e = e4;
            j = 0;
            q().c.a("Error inserting column. appId", ern.a(str), str4, e);
            w.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            w.endTransaction();
            throw th;
        }
    }

    public final void u() {
        j();
        w().setTransactionSuccessful();
    }

    public final void v() {
        j();
        w().endTransaction();
    }

    /* access modifiers changed from: 0000 */
    public final SQLiteDatabase w() {
        c();
        try {
            return this.h.getWritableDatabase();
        } catch (SQLiteException e2) {
            q().f.a("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003d
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            ern r3 = r6.q()     // Catch:{ all -> 0x003c }
            erp r3 = r3.c     // Catch:{ all -> 0x003c }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003b
            r0.close()
        L_0x003b:
            return r1
        L_0x003c:
            r1 = move-exception
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewq.x():java.lang.String");
    }

    public final boolean y() {
        return b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void z() {
        c();
        j();
        if (L()) {
            long a2 = r().g.a();
            long b = l().b();
            if (Math.abs(b - a2) > ((Long) erd.F.a()).longValue()) {
                r().g.a(b);
                c();
                j();
                if (L()) {
                    int delete = w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(l().a()), String.valueOf(ewn.g())});
                    if (delete > 0) {
                        q().k.a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
