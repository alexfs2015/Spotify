package com.google.common.collect;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Iterator;
import java.util.Map.Entry;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    static final ImmutableMap<Object, Object> a = new RegularImmutableMap(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    private final transient int[] b;
    private transient Object[] c;
    private final transient int d;

    static class EntrySet<K, V> extends ImmutableSet<Entry<K, V>> {
        private final transient ImmutableMap<K, V> a;
        /* access modifiers changed from: private */
        public final transient Object[] b;
        /* access modifiers changed from: private */
        public final transient int c;
        /* access modifiers changed from: private */
        public final transient int d;

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return true;
        }

        EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.a = immutableMap;
            this.b = objArr;
            this.c = i;
            this.d = i2;
        }

        public final fdh<Entry<K, V>> R_() {
            return f().R_();
        }

        /* access modifiers changed from: 0000 */
        public final int a(Object[] objArr, int i) {
            return f().a(objArr, i);
        }

        /* access modifiers changed from: 0000 */
        public final ImmutableList<Entry<K, V>> i() {
            return new ImmutableList<Entry<K, V>>() {
                public final boolean c() {
                    return true;
                }

                public int size() {
                    return EntrySet.this.d;
                }

                public /* synthetic */ Object get(int i) {
                    fay.a(i, EntrySet.this.d, "index");
                    int i2 = i * 2;
                    return new SimpleImmutableEntry(EntrySet.this.b[EntrySet.this.c + i2], EntrySet.this.b[i2 + (EntrySet.this.c ^ 1)]);
                }
            };
        }

        public boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.a.get(key))) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return this.d;
        }

        public /* synthetic */ Iterator iterator() {
            return f().R_();
        }
    }

    static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableMap<K, ?> a;
        private final transient ImmutableList<K> b;

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return true;
        }

        KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.a = immutableMap;
            this.b = immutableList;
        }

        public final ImmutableList<K> f() {
            return this.b;
        }

        public final boolean contains(Object obj) {
            return this.a.get(obj) != null;
        }

        public final int size() {
            return this.a.size();
        }

        /* renamed from: R_ */
        public final fdh<K> iterator() {
            return this.b.R_();
        }

        /* access modifiers changed from: 0000 */
        public final int a(Object[] objArr, int i) {
            return this.b.a(objArr, i);
        }
    }

    static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] a;
        private final transient int b;
        private final transient int c;

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return true;
        }

        KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.a = objArr;
            this.b = i;
            this.c = i2;
        }

        public final Object get(int i) {
            fay.a(i, this.c, "index");
            return this.a[(i * 2) + this.b];
        }

        public final int size() {
            return this.c;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        return false;
    }

    static <K, V> RegularImmutableMap<K, V> a(int i, Object[] objArr) {
        if (i == 0) {
            return (RegularImmutableMap) a;
        }
        if (i == 1) {
            fbu.a(objArr[0], objArr[1]);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        fay.b(i, objArr.length >> 1, "index");
        return new RegularImmutableMap<>(a(objArr, i, ImmutableSet.b(i), 0), objArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            defpackage.fbu.a(r11, r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0074
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            defpackage.fbu.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = defpackage.fck.a(r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Multiple entries with same key: "
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0074:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableMap.a(java.lang.Object[], int, int, int):int[]");
    }

    private RegularImmutableMap(int[] iArr, Object[] objArr, int i) {
        this.b = iArr;
        this.c = objArr;
        this.d = i;
    }

    public final int size() {
        return this.d;
    }

    public final V get(Object obj) {
        return a(this.b, this.c, this.d, 0, obj);
    }

    static Object a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = fck.a(obj.hashCode());
            while (true) {
                int i3 = a2 & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a2 = i3 + 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<Entry<K, V>> i() {
        return new EntrySet(this, this.c, 0, this.d);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<K> k() {
        return new KeySet(this, new KeysOrValuesAsList(this.c, 0, this.d));
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableCollection<V> d() {
        return new KeysOrValuesAsList(this.c, 1, this.d);
    }
}
