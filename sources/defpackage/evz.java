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

/* renamed from: evz reason: default package */
public final class evz extends evs {
    evz(evt evt) {
        super(evt);
    }

    static eky a(ekx ekx, String str) {
        eky[] ekyArr;
        for (eky eky : ekx.a) {
            if (eky.a.equals(str)) {
                return eky;
            }
        }
        return null;
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void a(StringBuilder sb, int i, eko eko) {
        String[] strArr;
        String str;
        if (eko != null) {
            a(sb, i);
            sb.append("filter {\n");
            a(sb, i, "complement", (Object) eko.c);
            a(sb, i, "param_name", (Object) n().b(eko.d));
            int i2 = i + 1;
            ekr ekr = eko.a;
            String str2 = "}\n";
            if (ekr != null) {
                a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (ekr.a != null) {
                    switch (ekr.a.intValue()) {
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
                a(sb, i2, "expression", (Object) ekr.b);
                a(sb, i2, "case_sensitive", (Object) ekr.c);
                if (ekr.d.length > 0) {
                    a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str3 : ekr.d) {
                        a(sb, i2 + 2);
                        sb.append(str3);
                        sb.append("\n");
                    }
                    sb.append(str2);
                }
                a(sb, i2);
                sb.append(str2);
            }
            a(sb, i2, "number_filter", eko.b);
            a(sb, i);
            sb.append(str2);
        }
    }

    private static void a(StringBuilder sb, int i, String str, ekp ekp) {
        if (ekp != null) {
            a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (ekp.a != null) {
                int intValue = ekp.a.intValue();
                String str2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? "UNKNOWN_COMPARISON_TYPE" : "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN";
                a(sb, i, "comparison_type", (Object) str2);
            }
            a(sb, i, "match_as_float", (Object) ekp.b);
            a(sb, i, "comparison_value", (Object) ekp.c);
            a(sb, i, "min_comparison_value", (Object) ekp.d);
            a(sb, i, "max_comparison_value", (Object) ekp.e);
            a(sb, i);
            sb.append("}\n");
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

    private final void a(StringBuilder sb, String str, elb elb, String str2) {
        StringBuilder sb2 = sb;
        elb elb2 = elb;
        if (elb2 != null) {
            a(sb2, 3);
            sb.append(str);
            sb2.append(" {\n");
            String str3 = ", ";
            if (elb2.b != null) {
                a(sb2, 4);
                sb2.append("results: ");
                long[] jArr = elb2.b;
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
            if (elb2.a != null) {
                a(sb2, 4);
                sb2.append("status: ");
                long[] jArr2 = elb2.a;
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
                if (elb2.c != null) {
                    a(sb2, 4);
                    sb2.append("dynamic_filter_timestamps: {");
                    ekw[] ekwArr = elb2.c;
                    int length3 = ekwArr.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length3) {
                        ekw ekw = ekwArr[i7];
                        int i9 = i8 + 1;
                        if (i8 != 0) {
                            sb2.append(str3);
                        }
                        sb2.append(ekw.a);
                        sb2.append(":");
                        sb2.append(ekw.b);
                        i7++;
                        i8 = i9;
                    }
                    sb2.append(str4);
                }
                if (elb2.d != null) {
                    a(sb2, 4);
                    sb2.append("sequence_filter_timestamps: {");
                    elc[] elcArr = elb2.d;
                    int length4 = elcArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length4) {
                        elc elc = elcArr[i10];
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb2.append(str3);
                        }
                        sb2.append(elc.a);
                        sb2.append(": [");
                        long[] jArr3 = elc.b;
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

    static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean a(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i / 64]) != 0;
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

    static eky[] a(eky[] ekyArr, String str, Object obj) {
        for (eky eky : ekyArr) {
            if (str.equals(eky.a)) {
                eky.c = null;
                eky.b = null;
                eky.d = null;
                if (obj instanceof Long) {
                    eky.c = (Long) obj;
                }
                return ekyArr;
            }
        }
        eky[] ekyArr2 = new eky[(ekyArr.length + 1)];
        System.arraycopy(ekyArr, 0, ekyArr2, 0, ekyArr.length);
        eky eky2 = new eky();
        eky2.a = str;
        if (obj instanceof Long) {
            eky2.c = (Long) obj;
        }
        ekyArr2[ekyArr.length] = eky2;
        return ekyArr2;
    }

    static Object b(ekx ekx, String str) {
        eky a = a(ekx, str);
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
            ern r5 = r4.q()     // Catch:{ all -> 0x001a }
            erp r5 = r5.c     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002b:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evz.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    public final String a(ekn ekn) {
        if (ekn == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        a(sb, 0, "filter_id", (Object) ekn.a);
        a(sb, 0, "event_name", (Object) n().a(ekn.b));
        a(sb, 1, "event_count_filter", ekn.d);
        sb.append("  filters {\n");
        for (eko a : ekn.c) {
            a(sb, 2, a);
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String a(ekq ekq) {
        if (ekq == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        a(sb, 0, "filter_id", (Object) ekq.a);
        a(sb, 0, "property_name", (Object) n().c(ekq.b));
        a(sb, 1, ekq.c);
        sb.append("}\n");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: 0000 */
    public final void a(eky eky, Object obj) {
        bxo.a(obj);
        eky.b = null;
        eky.c = null;
        eky.d = null;
        if (obj instanceof String) {
            eky.b = (String) obj;
        } else if (obj instanceof Long) {
            eky.c = (Long) obj;
        } else if (obj instanceof Double) {
            eky.d = (Double) obj;
        } else {
            q().c.a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(eld eld, Object obj) {
        bxo.a(obj);
        eld.c = null;
        eld.d = null;
        eld.e = null;
        if (obj instanceof String) {
            eld.c = (String) obj;
        } else if (obj instanceof Long) {
            eld.d = (Long) obj;
        } else if (obj instanceof Double) {
            eld.e = (Double) obj;
        } else {
            q().c.a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(l().a() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(erb erb, ewh ewh) {
        bxo.a(erb);
        bxo.a(ewh);
        return !TextUtils.isEmpty(ewh.b) || !TextUtils.isEmpty(ewh.r);
    }

    /* access modifiers changed from: 0000 */
    public final byte[] a(ekz ekz) {
        try {
            byte[] bArr = new byte[ekz.e()];
            eqk a = eqk.a(bArr, bArr.length);
            ekz.a(a);
            a.a();
            return bArr;
        } catch (IOException e) {
            q().c.a("Data loss. Failed to serialize batch", e);
            return null;
        }
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
    public final String b(ekz ekz) {
        int i;
        ela[] elaArr;
        ekv[] ekvArr;
        int i2;
        ela[] elaArr2;
        evz evz = this;
        ekz ekz2 = ekz;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        String str = "}\n";
        if (ekz2.a != null) {
            ela[] elaArr3 = ekz2.a;
            int length = elaArr3.length;
            int i3 = 0;
            while (i3 < length) {
                ela ela = elaArr3[i3];
                if (ela == null || ela == null) {
                    elaArr = elaArr3;
                    i = length;
                } else {
                    a(sb, 1);
                    sb.append("bundle {\n");
                    a(sb, 1, "protocol_version", (Object) ela.a);
                    a(sb, 1, "platform", (Object) ela.i);
                    a(sb, 1, "gmp_version", (Object) ela.q);
                    a(sb, 1, "uploading_gmp_version", (Object) ela.r);
                    a(sb, 1, "config_version", (Object) ela.E);
                    a(sb, 1, "gmp_app_id", (Object) ela.y);
                    a(sb, 1, "admob_app_id", (Object) ela.I);
                    a(sb, 1, "app_id", (Object) ela.o);
                    a(sb, 1, "app_version", (Object) ela.p);
                    a(sb, 1, "app_version_major", (Object) ela.C);
                    a(sb, 1, "firebase_instance_id", (Object) ela.B);
                    a(sb, 1, "dev_cert_hash", (Object) ela.v);
                    a(sb, 1, "app_store", (Object) ela.n);
                    a(sb, 1, "upload_timestamp_millis", (Object) ela.d);
                    a(sb, 1, "start_timestamp_millis", (Object) ela.e);
                    a(sb, 1, "end_timestamp_millis", (Object) ela.f);
                    a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) ela.g);
                    a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) ela.h);
                    a(sb, 1, "app_instance_id", (Object) ela.u);
                    a(sb, 1, "resettable_device_id", (Object) ela.s);
                    a(sb, 1, "device_id", (Object) ela.D);
                    a(sb, 1, "ds_id", (Object) ela.G);
                    a(sb, 1, "limited_ad_tracking", (Object) ela.t);
                    a(sb, 1, "os_version", (Object) ela.j);
                    a(sb, 1, "device_model", (Object) ela.k);
                    a(sb, 1, "user_default_language", (Object) ela.l);
                    a(sb, 1, "time_zone_offset_minutes", (Object) ela.m);
                    a(sb, 1, "bundle_sequential_index", (Object) ela.w);
                    a(sb, 1, "service_upload", (Object) ela.z);
                    a(sb, 1, "health_monitor", (Object) ela.x);
                    if (!(ela.F == null || ela.F.longValue() == 0)) {
                        a(sb, 1, "android_id", (Object) ela.F);
                    }
                    if (ela.H != null) {
                        a(sb, 1, "retry_counter", (Object) ela.H);
                    }
                    eld[] eldArr = ela.c;
                    String str2 = "double_value";
                    String str3 = "int_value";
                    String str4 = "string_value";
                    String str5 = "name";
                    int i4 = 2;
                    if (eldArr != null) {
                        int length2 = eldArr.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            eld eld = eldArr[i5];
                            if (eld != null) {
                                a(sb, i4);
                                sb.append("user_property {\n");
                                elaArr2 = elaArr3;
                                i2 = length;
                                a(sb, 2, "set_timestamp_millis", (Object) eld.a);
                                a(sb, 2, str5, (Object) n().c(eld.b));
                                a(sb, 2, str4, (Object) eld.c);
                                a(sb, 2, str3, (Object) eld.d);
                                a(sb, 2, str2, (Object) eld.e);
                                a(sb, 2);
                                sb.append(str);
                            } else {
                                elaArr2 = elaArr3;
                                i2 = length;
                            }
                            i5++;
                            elaArr3 = elaArr2;
                            length = i2;
                            i4 = 2;
                        }
                    }
                    elaArr = elaArr3;
                    i = length;
                    ekv[] ekvArr2 = ela.A;
                    String str6 = ela.o;
                    if (ekvArr2 != null) {
                        int length3 = ekvArr2.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            ekv ekv = ekvArr2[i6];
                            if (ekv != null) {
                                a(sb, 2);
                                sb.append("audience_membership {\n");
                                ekvArr = ekvArr2;
                                a(sb, 2, "audience_id", (Object) ekv.a);
                                a(sb, 2, "new_audience", (Object) ekv.d);
                                evz.a(sb, "current_data", ekv.b, str6);
                                evz.a(sb, "previous_data", ekv.c, str6);
                                a(sb, 2);
                                sb.append(str);
                            } else {
                                ekvArr = ekvArr2;
                            }
                            i6++;
                            ekvArr2 = ekvArr;
                        }
                    }
                    ekx[] ekxArr = ela.b;
                    if (ekxArr != null) {
                        int length4 = ekxArr.length;
                        int i7 = 0;
                        while (i7 < length4) {
                            ekx ekx = ekxArr[i7];
                            if (ekx != null) {
                                a(sb, 2);
                                sb.append("event {\n");
                                a(sb, 2, str5, (Object) n().a(ekx.b));
                                a(sb, 2, "timestamp_millis", (Object) ekx.c);
                                a(sb, 2, "previous_timestamp_millis", (Object) ekx.d);
                                a(sb, 2, "count", (Object) ekx.e);
                                eky[] ekyArr = ekx.a;
                                if (ekyArr != null) {
                                    int length5 = ekyArr.length;
                                    int i8 = 0;
                                    while (i8 < length5) {
                                        eky eky = ekyArr[i8];
                                        if (eky != null) {
                                            a(sb, 3);
                                            sb.append("param {\n");
                                            a(sb, 3, str5, (Object) n().b(eky.a));
                                            a(sb, 3, str4, (Object) eky.b);
                                            a(sb, 3, str3, (Object) eky.c);
                                            a(sb, 3, str2, (Object) eky.d);
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
                evz = this;
                elaArr3 = elaArr;
                length = i;
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
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

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int[] e() {
        Map a = erd.a(this.b.m());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) erd.P.a()).intValue();
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

    public final /* bridge */ /* synthetic */ evz f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ ewj g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ ewq h() {
        return super.h();
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
}
