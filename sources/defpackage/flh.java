package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat.FieldType;

/* renamed from: flh reason: default package */
public final class flh<K, V> {
    private final a<K, V> a;
    private final K b;
    private final V c;

    /* renamed from: flh$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[FieldType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.flh.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: flh$a */
    static class a<K, V> {
        public final FieldType a;
        public final K b;
        public final FieldType c;
        public final V d;

        public a(FieldType fieldType, K k, FieldType fieldType2, V v) {
            this.a = fieldType;
            this.b = k;
            this.c = fieldType2;
            this.d = v;
        }
    }

    private flh(FieldType fieldType, K k, FieldType fieldType2, V v) {
        this.a = new a<>(fieldType, k, fieldType2, v);
        this.b = k;
        this.c = v;
    }

    private static <K, V> int a(a<K, V> aVar, K k, V v) {
        return fkz.a(aVar.a, 1, (Object) k) + fkz.a(aVar.c, 2, (Object) v);
    }

    public static <K, V> flh<K, V> a(FieldType fieldType, K k, FieldType fieldType2, V v) {
        return new flh<>(fieldType, k, fieldType2, v);
    }

    private static <T> T a(fkw fkw, fky fky, FieldType fieldType, T t) {
        int i = AnonymousClass1.a[fieldType.ordinal()];
        if (i == 1) {
            defpackage.fli.a h = ((fli) t).h();
            int g = fkw.g();
            if (fkw.a < fkw.b) {
                int c2 = fkw.c(g);
                fkw.a++;
                h.b(fkw, fky);
                fkw.a(0);
                fkw.a--;
                fkw.d(c2);
                return h.e();
            }
            throw InvalidProtocolBufferException.g();
        } else if (i == 2) {
            return Integer.valueOf(fkw.g());
        } else {
            if (i != 3) {
                return fkz.a(fkw, fieldType, true);
            }
            throw new RuntimeException("Groups are not allowed in maps.");
        }
    }

    public final int a(int i, K k, V v) {
        return CodedOutputStream.d(i) + CodedOutputStream.i(a(this.a, k, v));
    }

    public final void a(CodedOutputStream codedOutputStream, int i, K k, V v) {
        codedOutputStream.a(i, 2);
        codedOutputStream.b(a(this.a, k, v));
        a<K, V> aVar = this.a;
        fkz.a(codedOutputStream, aVar.a, 1, k);
        fkz.a(codedOutputStream, aVar.c, 2, v);
    }

    public final void a(MapFieldLite<K, V> mapFieldLite, fkw fkw, fky fky) {
        int c2 = fkw.c(fkw.g());
        K k = this.a.b;
        V v = this.a.d;
        while (true) {
            int a2 = fkw.a();
            if (a2 != 0) {
                if (a2 != (this.a.a.wireType | 8)) {
                    if (a2 != (this.a.c.wireType | 16)) {
                        if (!fkw.b(a2)) {
                            break;
                        }
                    } else {
                        v = a(fkw, fky, this.a.c, (T) v);
                    }
                } else {
                    k = a(fkw, fky, this.a.a, (T) k);
                }
            } else {
                break;
            }
        }
        fkw.a(0);
        fkw.d(c2);
        mapFieldLite.put(k, v);
    }
}
