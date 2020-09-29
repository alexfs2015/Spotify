package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ss reason: default package */
public final class ss {
    public static final ss a = new a().a();
    private static final String c = su.a("Data");
    public Map<String, Object> b;

    /* renamed from: ss$a */
    public static final class a {
        private Map<String, Object> a = new HashMap();

        private a a(String str, Object obj) {
            if (obj == null) {
                this.a.put(str, null);
            } else {
                Class<double[]> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.a.put(str, ss.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.a.put(str, ss.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.a.put(str, ss.a((int[]) obj));
                } else if (cls == long[].class) {
                    this.a.put(str, ss.a((long[]) obj));
                } else if (cls == float[].class) {
                    this.a.put(str, ss.a((float[]) obj));
                } else if (cls == double[].class) {
                    this.a.put(str, ss.a((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }

        public final a a(String str, int i) {
            this.a.put(str, Integer.valueOf(i));
            return this;
        }

        public final a a(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        public final a a(Map<String, Object> map) {
            for (Entry entry : map.entrySet()) {
                a((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a a(ss ssVar) {
            a(ssVar.b);
            return this;
        }

        public final ss a() {
            ss ssVar = new ss(this.a);
            ss.a(ssVar);
            return ssVar;
        }
    }

    ss() {
    }

    ss(Map<String, ?> map) {
        this.b = new HashMap(map);
    }

    public ss(ss ssVar) {
        this.b = new HashMap(ssVar.b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC, Splitter:B:36:0x006b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0035=Splitter:B:14:0x0035, B:28:0x0058=Splitter:B:28:0x0058} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ss a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x0080
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = c
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x0039:
            r7 = move-exception
            goto L_0x0047
        L_0x003b:
            r7 = move-exception
            goto L_0x0047
        L_0x003d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L_0x0069
        L_0x0041:
            r3 = move-exception
            goto L_0x0044
        L_0x0043:
            r3 = move-exception
        L_0x0044:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0047:
            java.lang.String r4 = c     // Catch:{ all -> 0x0068 }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r7 = move-exception
            java.lang.String r3 = c
            android.util.Log.e(r3, r0, r7)
        L_0x0058:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r7 = move-exception
            java.lang.String r2 = c
            android.util.Log.e(r2, r0, r7)
        L_0x0062:
            ss r7 = new ss
            r7.<init>(r1)
            return r7
        L_0x0068:
            r7 = move-exception
        L_0x0069:
            if (r3 == 0) goto L_0x0075
            r3.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0075
        L_0x006f:
            r1 = move-exception
            java.lang.String r3 = c
            android.util.Log.e(r3, r0, r1)
        L_0x0075:
            r2.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x007f
        L_0x0079:
            r1 = move-exception
            java.lang.String r2 = c
            android.util.Log.e(r2, r0, r1)
        L_0x007f:
            throw r7
        L_0x0080:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            goto L_0x0089
        L_0x0088:
            throw r7
        L_0x0089:
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.a(byte[]):ss");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[SYNTHETIC, Splitter:B:31:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC, Splitter:B:41:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(defpackage.ss r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006e }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006e }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.b     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.b     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = c
            android.util.Log.e(r2, r0, r5)
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r5 = move-exception
            java.lang.String r2 = c
            android.util.Log.e(r2, r0, r5)
        L_0x0051:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005e
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0066:
            r5 = move-exception
            goto L_0x008f
        L_0x0068:
            r5 = move-exception
            r2 = r3
            goto L_0x006f
        L_0x006b:
            r5 = move-exception
            r3 = r2
            goto L_0x008f
        L_0x006e:
            r5 = move-exception
        L_0x006f:
            java.lang.String r3 = c     // Catch:{ all -> 0x006b }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006b }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0084
        L_0x007e:
            r2 = move-exception
            java.lang.String r3 = c
            android.util.Log.e(r3, r0, r2)
        L_0x0084:
            r1.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r1 = move-exception
            java.lang.String r2 = c
            android.util.Log.e(r2, r0, r1)
        L_0x008e:
            return r5
        L_0x008f:
            if (r3 == 0) goto L_0x009b
            r3.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x009b
        L_0x0095:
            r2 = move-exception
            java.lang.String r3 = c
            android.util.Log.e(r3, r0, r2)
        L_0x009b:
            r1.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r1 = move-exception
            java.lang.String r2 = c
            android.util.Log.e(r2, r0, r1)
        L_0x00a5:
            goto L_0x00a7
        L_0x00a6:
            throw r5
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss.a(ss):byte[]");
    }

    static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    static Double[] a(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    static Float[] a(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    static Integer[] a(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    static Long[] a(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((ss) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
