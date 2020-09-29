package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: evi reason: default package */
public final class evi extends evb {
    evi(evc evc) {
        super(evc);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void a(ekm ekm, Object obj) {
        bwx.a(obj);
        ekm.c = null;
        ekm.d = null;
        ekm.e = null;
        if (obj instanceof String) {
            ekm.c = (String) obj;
        } else if (obj instanceof Long) {
            ekm.d = (Long) obj;
        } else if (obj instanceof Double) {
            ekm.e = (Double) obj;
        } else {
            q().c.a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(ekh ekh, Object obj) {
        bwx.a(obj);
        ekh.b = null;
        ekh.c = null;
        ekh.d = null;
        if (obj instanceof String) {
            ekh.b = (String) obj;
        } else if (obj instanceof Long) {
            ekh.c = (Long) obj;
        } else if (obj instanceof Double) {
            ekh.d = (Double) obj;
        } else {
            q().c.a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a(eki eki) {
        try {
            byte[] bArr = new byte[eki.e()];
            ept a = ept.a(bArr, bArr.length);
            eki.a(a);
            a.a();
            return bArr;
        } catch (IOException e) {
            q().c.a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    static ekh a(ekg ekg, String str) {
        ekh[] ekhArr;
        for (ekh ekh : ekg.a) {
            if (ekh.a.equals(str)) {
                return ekh;
            }
        }
        return null;
    }

    static Object b(ekg ekg, String str) {
        ekh a = a(ekg, str);
        if (a != null) {
            if (a.b != null) {
                return a.b;
            }
            if (a.c != null) {
                return a.c;
            }
            if (a.d != null) {
                return a.d;
            }
        }
        return null;
    }

    static ekh[] a(ekh[] ekhArr, String str, Object obj) {
        for (ekh ekh : ekhArr) {
            if (str.equals(ekh.a)) {
                ekh.c = null;
                ekh.b = null;
                ekh.d = null;
                if (obj instanceof Long) {
                    ekh.c = (Long) obj;
                }
                return ekhArr;
            }
        }
        ekh[] ekhArr2 = new ekh[(ekhArr.length + 1)];
        System.arraycopy(ekhArr, 0, ekhArr2, 0, ekhArr.length);
        ekh ekh2 = new ekh();
        ekh2.a = str;
        if (obj instanceof Long) {
            ekh2.c = (Long) obj;
        }
        ekhArr2[ekhArr.length] = ekh2;
        return ekhArr2;
    }

    /* access modifiers changed from: 0000 */
    public final String b(eki eki) {
        int i;
        ekj[] ekjArr;
        eke[] ekeArr;
        int i2;
        ekj[] ekjArr2;
        evi evi = this;
        eki eki2 = eki;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        String str = "}\n";
        if (eki2.a != null) {
            ekj[] ekjArr3 = eki2.a;
            int length = ekjArr3.length;
            int i3 = 0;
            while (i3 < length) {
                ekj ekj = ekjArr3[i3];
                if (ekj == null || ekj == null) {
                    ekjArr = ekjArr3;
                    i = length;
                } else {
                    a(sb, 1);
                    sb.append("bundle {\n");
                    a(sb, 1, "protocol_version", (Object) ekj.a);
                    a(sb, 1, "platform", (Object) ekj.i);
                    a(sb, 1, "gmp_version", (Object) ekj.q);
                    a(sb, 1, "uploading_gmp_version", (Object) ekj.r);
                    a(sb, 1, "config_version", (Object) ekj.E);
                    a(sb, 1, "gmp_app_id", (Object) ekj.y);
                    a(sb, 1, "admob_app_id", (Object) ekj.I);
                    a(sb, 1, "app_id", (Object) ekj.o);
                    a(sb, 1, "app_version", (Object) ekj.p);
                    a(sb, 1, "app_version_major", (Object) ekj.C);
                    a(sb, 1, "firebase_instance_id", (Object) ekj.B);
                    a(sb, 1, "dev_cert_hash", (Object) ekj.v);
                    a(sb, 1, "app_store", (Object) ekj.n);
                    a(sb, 1, "upload_timestamp_millis", (Object) ekj.d);
                    a(sb, 1, "start_timestamp_millis", (Object) ekj.e);
                    a(sb, 1, "end_timestamp_millis", (Object) ekj.f);
                    a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) ekj.g);
                    a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) ekj.h);
                    a(sb, 1, "app_instance_id", (Object) ekj.u);
                    a(sb, 1, "resettable_device_id", (Object) ekj.s);
                    a(sb, 1, "device_id", (Object) ekj.D);
                    a(sb, 1, "ds_id", (Object) ekj.G);
                    a(sb, 1, "limited_ad_tracking", (Object) ekj.t);
                    a(sb, 1, "os_version", (Object) ekj.j);
                    a(sb, 1, "device_model", (Object) ekj.k);
                    a(sb, 1, "user_default_language", (Object) ekj.l);
                    a(sb, 1, "time_zone_offset_minutes", (Object) ekj.m);
                    a(sb, 1, "bundle_sequential_index", (Object) ekj.w);
                    a(sb, 1, "service_upload", (Object) ekj.z);
                    a(sb, 1, "health_monitor", (Object) ekj.x);
                    if (!(ekj.F == null || ekj.F.longValue() == 0)) {
                        a(sb, 1, "android_id", (Object) ekj.F);
                    }
                    if (ekj.H != null) {
                        a(sb, 1, "retry_counter", (Object) ekj.H);
                    }
                    ekm[] ekmArr = ekj.c;
                    String str2 = "double_value";
                    String str3 = "int_value";
                    String str4 = "string_value";
                    String str5 = "name";
                    int i4 = 2;
                    if (ekmArr != null) {
                        int length2 = ekmArr.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            ekm ekm = ekmArr[i5];
                            if (ekm != null) {
                                a(sb, i4);
                                sb.append("user_property {\n");
                                ekjArr2 = ekjArr3;
                                i2 = length;
                                a(sb, 2, "set_timestamp_millis", (Object) ekm.a);
                                a(sb, 2, str5, (Object) n().c(ekm.b));
                                a(sb, 2, str4, (Object) ekm.c);
                                a(sb, 2, str3, (Object) ekm.d);
                                a(sb, 2, str2, (Object) ekm.e);
                                a(sb, 2);
                                sb.append(str);
                            } else {
                                ekjArr2 = ekjArr3;
                                i2 = length;
                            }
                            i5++;
                            ekjArr3 = ekjArr2;
                            length = i2;
                            i4 = 2;
                        }
                    }
                    ekjArr = ekjArr3;
                    i = length;
                    eke[] ekeArr2 = ekj.A;
                    String str6 = ekj.o;
                    if (ekeArr2 != null) {
                        int length3 = ekeArr2.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            eke eke = ekeArr2[i6];
                            if (eke != null) {
                                a(sb, 2);
                                sb.append("audience_membership {\n");
                                ekeArr = ekeArr2;
                                a(sb, 2, "audience_id", (Object) eke.a);
                                a(sb, 2, "new_audience", (Object) eke.d);
                                evi.a(sb, "current_data", eke.b, str6);
                                evi.a(sb, "previous_data", eke.c, str6);
                                a(sb, 2);
                                sb.append(str);
                            } else {
                                ekeArr = ekeArr2;
                            }
                            i6++;
                            ekeArr2 = ekeArr;
                        }
                    }
                    ekg[] ekgArr = ekj.b;
                    if (ekgArr != null) {
                        int length4 = ekgArr.length;
                        int i7 = 0;
                        while (i7 < length4) {
                            ekg ekg = ekgArr[i7];
                            if (ekg != null) {
                                a(sb, 2);
                                sb.append("event {\n");
                                a(sb, 2, str5, (Object) n().a(ekg.b));
                                a(sb, 2, "timestamp_millis", (Object) ekg.c);
                                a(sb, 2, "previous_timestamp_millis", (Object) ekg.d);
                                a(sb, 2, "count", (Object) ekg.e);
                                ekh[] ekhArr = ekg.a;
                                if (ekhArr != null) {
                                    int length5 = ekhArr.length;
                                    int i8 = 0;
                                    while (i8 < length5) {
                                        ekh ekh = ekhArr[i8];
                                        if (ekh != null) {
                                            a(sb, 3);
                                            sb.append("param {\n");
                                            a(sb, 3, str5, (Object) n().b(ekh.a));
                                            a(sb, 3, str4, (Object) ekh.b);
                                            a(sb, 3, str3, (Object) ekh.c);
                                            a(sb, 3, str2, (Object) ekh.d);
                                            a(sb, 3);
                                            sb.append(str);
                                        }
                                        i8++;
                                    }
                                }
                                a(sb, 2);
                                sb.append(str);
                            }
                            i7++;
                        }
                    }
                    a(sb, 1);
                    sb.append(str);
                }
                i3++;
                evi = this;
                ekjArr3 = ekjArr;
                length = i;
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String a(ejw ejw) {
        if (ejw == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        a(sb, 0, "filter_id", (Object) ejw.a);
        a(sb, 0, "event_name", (Object) n().a(ejw.b));
        a(sb, 1, "event_count_filter", ejw.d);
        sb.append("  filters {\n");
        for (ejx a : ejw.c) {
            a(sb, 2, a);
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String a(ejz ejz) {
        if (ejz == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        a(sb, 0, "filter_id", (Object) ejz.a);
        a(sb, 0, "property_name", (Object) n().c(ejz.b));
        a(sb, 1, ejz.c);
        sb.append("}\n");
        return sb.toString();
    }

    private final void a(StringBuilder sb, String str, ekk ekk, String str2) {
        StringBuilder sb2 = sb;
        ekk ekk2 = ekk;
        if (ekk2 != null) {
            a(sb2, 3);
            sb.append(str);
            sb2.append(" {\n");
            String str3 = ", ";
            if (ekk2.b != null) {
                a(sb2, 4);
                sb2.append("results: ");
                long[] jArr = ekk2.b;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    Long valueOf = Long.valueOf(jArr[i]);
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb2.append(str3);
                    }
                    sb2.append(valueOf);
                    i++;
                    i2 = i3;
                }
                sb2.append(10);
            }
            if (ekk2.a != null) {
                a(sb2, 4);
                sb2.append("status: ");
                long[] jArr2 = ekk2.a;
                int length2 = jArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i4]);
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb2.append(str3);
                    }
                    sb2.append(valueOf2);
                    i4++;
                    i5 = i6;
                }
                sb2.append(10);
            }
            String str4 = "}\n";
            if (s().f(str2)) {
                if (ekk2.c != null) {
                    a(sb2, 4);
                    sb2.append("dynamic_filter_timestamps: {");
                    ekf[] ekfArr = ekk2.c;
                    int length3 = ekfArr.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length3) {
                        ekf ekf = ekfArr[i7];
                        int i9 = i8 + 1;
                        if (i8 != 0) {
                            sb2.append(str3);
                        }
                        sb2.append(ekf.a);
                        sb2.append(":");
                        sb2.append(ekf.b);
                        i7++;
                        i8 = i9;
                    }
                    sb2.append(str4);
                }
                if (ekk2.d != null) {
                    a(sb2, 4);
                    sb2.append("sequence_filter_timestamps: {");
                    ekl[] eklArr = ekk2.d;
                    int length4 = eklArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length4) {
                        ekl ekl = eklArr[i10];
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb2.append(str3);
                        }
                        sb2.append(ekl.a);
                        sb2.append(": [");
                        long[] jArr3 = ekl.b;
                        int length5 = jArr3.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length5) {
                            long j = jArr3[i13];
                            int i15 = i14 + 1;
                            if (i14 != 0) {
                                sb2.append(str3);
                            }
                            sb2.append(j);
                            i13++;
                            i14 = i15;
                        }
                        sb2.append("]");
                        i10++;
                        i11 = i12;
                    }
                    sb2.append(str4);
                }
            }
            a(sb2, 3);
            sb2.append(str4);
        }
    }

    private static void a(StringBuilder sb, int i, String str, ejy ejy) {
        if (ejy != null) {
            a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (ejy.a != null) {
                int intValue = ejy.a.intValue();
                String str2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? "UNKNOWN_COMPARISON_TYPE" : "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN";
                a(sb, i, "comparison_type", (Object) str2);
            }
            a(sb, i, "match_as_float", (Object) ejy.b);
            a(sb, i, "comparison_value", (Object) ejy.c);
            a(sb, i, "min_comparison_value", (Object) ejy.d);
            a(sb, i, "max_comparison_value", (Object) ejy.e);
            a(sb, i);
            sb.append("}\n");
        }
    }

    private final void a(StringBuilder sb, int i, ejx ejx) {
        String[] strArr;
        String str;
        if (ejx != null) {
            a(sb, i);
            sb.append("filter {\n");
            a(sb, i, "complement", (Object) ejx.c);
            a(sb, i, "param_name", (Object) n().b(ejx.d));
            int i2 = i + 1;
            eka eka = ejx.a;
            String str2 = "}\n";
            if (eka != null) {
                a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (eka.a != null) {
                    switch (eka.a.intValue()) {
                        case 1:
                            str = "REGEXP";
                            break;
                        case 2:
                            str = "BEGINS_WITH";
                            break;
                        case 3:
                            str = "ENDS_WITH";
                            break;
                        case 4:
                            str = "PARTIAL";
                            break;
                        case 5:
                            str = "EXACT";
                            break;
                        case 6:
                            str = "IN_LIST";
                            break;
                        default:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                    }
                    a(sb, i2, "match_type", (Object) str);
                }
                a(sb, i2, "expression", (Object) eka.b);
                a(sb, i2, "case_sensitive", (Object) eka.c);
                if (eka.d.length > 0) {
                    a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str3 : eka.d) {
                        a(sb, i2 + 2);
                        sb.append(str3);
                        sb.append("\n");
                    }
                    sb.append(str2);
                }
                a(sb, i2);
                sb.append(str2);
            }
            a(sb, i2, "number_filter", ejx.b);
            a(sb, i);
            sb.append(str2);
        }
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        q().c.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002b
        L_0x001c:
            eqw r5 = r4.q()     // Catch:{ all -> 0x001a }
            eqy r5 = r5.c     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002b:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evi.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(eqk eqk, evq evq) {
        bwx.a(eqk);
        bwx.a(evq);
        return !TextUtils.isEmpty(evq.b) || !TextUtils.isEmpty(evq.r);
    }

    static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean a(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        if (((1 << (i % 64)) & jArr[i / 64]) != 0) {
            return true;
        }
        return false;
    }

    static long[] a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(l().a() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            q().c.a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            q().c.a("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int[] e() {
        Map a = eqm.a(this.b.m());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) eqm.P.a()).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            q().f.a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    q().f.a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i3 = i2 + 1;
            iArr[i2] = ((Integer) obj).intValue();
            i2 = i3;
        }
        return iArr;
    }

    public final /* bridge */ /* synthetic */ evi f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ evs g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ evz h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
