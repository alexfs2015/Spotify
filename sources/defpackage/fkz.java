package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.WireFormat.FieldType;
import com.google.protobuf.WireFormat.Utf8Validation;
import defpackage.fkz.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: fkz reason: default package */
public final class fkz<FieldDescriptorType extends a<FieldDescriptorType>> {
    final flo<FieldDescriptorType, Object> a = flo.a(16);
    boolean b = false;
    private boolean c;

    /* renamed from: fkz$a */
    public interface a<T extends a<T>> extends Comparable<T> {
        FieldType a();

        boolean b();
    }

    static {
        new fkz(0);
    }

    private fkz() {
    }

    private fkz(byte b2) {
        if (!this.c) {
            this.a.a();
            this.c = true;
        }
    }

    static int a(FieldType fieldType, int i, Object obj) {
        int i2;
        int d = CodedOutputStream.d(i);
        if (fieldType == FieldType.GROUP) {
            d <<= 1;
        }
        switch (fieldType) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                i2 = CodedOutputStream.f();
                break;
            case FLOAT:
                ((Float) obj).floatValue();
                i2 = CodedOutputStream.e();
                break;
            case INT64:
                i2 = CodedOutputStream.c(((Long) obj).longValue());
                break;
            case UINT64:
                i2 = CodedOutputStream.d(((Long) obj).longValue());
                break;
            case INT32:
                i2 = CodedOutputStream.e(((Integer) obj).intValue());
                break;
            case FIXED64:
                ((Long) obj).longValue();
                i2 = CodedOutputStream.c();
                break;
            case FIXED32:
                ((Integer) obj).intValue();
                i2 = CodedOutputStream.a();
                break;
            case BOOL:
                ((Boolean) obj).booleanValue();
                i2 = CodedOutputStream.g();
                break;
            case GROUP:
                i2 = CodedOutputStream.c((fli) obj);
                break;
            case MESSAGE:
                if (!(obj instanceof fld)) {
                    i2 = CodedOutputStream.b((fli) obj);
                    break;
                } else {
                    i2 = CodedOutputStream.a((fle) (fld) obj);
                    break;
                }
            case STRING:
                if (!(obj instanceof ByteString)) {
                    i2 = CodedOutputStream.b((String) obj);
                    break;
                } else {
                    i2 = CodedOutputStream.b((ByteString) obj);
                    break;
                }
            case BYTES:
                if (!(obj instanceof ByteString)) {
                    i2 = CodedOutputStream.b((byte[]) obj);
                    break;
                } else {
                    i2 = CodedOutputStream.b((ByteString) obj);
                    break;
                }
            case UINT32:
                i2 = CodedOutputStream.f(((Integer) obj).intValue());
                break;
            case SFIXED32:
                ((Integer) obj).intValue();
                i2 = CodedOutputStream.b();
                break;
            case SFIXED64:
                ((Long) obj).longValue();
                i2 = CodedOutputStream.d();
                break;
            case SINT32:
                i2 = CodedOutputStream.g(((Integer) obj).intValue());
                break;
            case SINT64:
                i2 = CodedOutputStream.e(((Long) obj).longValue());
                break;
            case ENUM:
                if (!(obj instanceof b)) {
                    i2 = CodedOutputStream.h(((Integer) obj).intValue());
                    break;
                } else {
                    i2 = CodedOutputStream.h(((b) obj).a());
                    break;
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return d + i2;
    }

    public static <T extends a<T>> fkz<T> a() {
        return new fkz<>();
    }

    public static Object a(fkw fkw, FieldType fieldType, boolean z) {
        Utf8Validation utf8Validation = Utf8Validation.STRICT;
        switch (fieldType) {
            case DOUBLE:
                return Double.valueOf(Double.longBitsToDouble(fkw.j()));
            case FLOAT:
                return Float.valueOf(Float.intBitsToFloat(fkw.i()));
            case INT64:
                return Long.valueOf(fkw.h());
            case UINT64:
                return Long.valueOf(fkw.h());
            case INT32:
                return Integer.valueOf(fkw.g());
            case FIXED64:
                return Long.valueOf(fkw.j());
            case FIXED32:
                return Integer.valueOf(fkw.i());
            case BOOL:
                return Boolean.valueOf(fkw.b());
            case BYTES:
                return fkw.e();
            case UINT32:
                return Integer.valueOf(fkw.g());
            case SFIXED32:
                return Integer.valueOf(fkw.i());
            case SFIXED64:
                return Long.valueOf(fkw.j());
            case SINT32:
                return Integer.valueOf(fkw.f());
            case SINT64:
                long h = fkw.h();
                return Long.valueOf((-(h & 1)) ^ (h >>> 1));
            case STRING:
                return utf8Validation.a(fkw);
            case GROUP:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case MESSAGE:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case ENUM:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static void a(CodedOutputStream codedOutputStream, FieldType fieldType, int i, Object obj) {
        if (fieldType == FieldType.GROUP) {
            fli fli = (fli) obj;
            codedOutputStream.a(i, 3);
            fli.a(codedOutputStream);
            codedOutputStream.a(i, 4);
            return;
        }
        codedOutputStream.a(i, fieldType.wireType);
        switch (fieldType) {
            case DOUBLE:
                codedOutputStream.b(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                codedOutputStream.c(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case INT64:
                codedOutputStream.a(((Long) obj).longValue());
                return;
            case UINT64:
                codedOutputStream.a(((Long) obj).longValue());
                return;
            case INT32:
                codedOutputStream.a(((Integer) obj).intValue());
                return;
            case FIXED64:
                codedOutputStream.b(((Long) obj).longValue());
                return;
            case FIXED32:
                codedOutputStream.c(((Integer) obj).intValue());
                return;
            case BOOL:
                codedOutputStream.a(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case GROUP:
                ((fli) obj).a(codedOutputStream);
                return;
            case MESSAGE:
                codedOutputStream.a((fli) obj);
                return;
            case STRING:
                if (obj instanceof ByteString) {
                    codedOutputStream.a((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.a((String) obj);
                    return;
                }
            case BYTES:
                if (obj instanceof ByteString) {
                    codedOutputStream.a((ByteString) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.b(bArr, 0, bArr.length);
                return;
            case UINT32:
                codedOutputStream.b(((Integer) obj).intValue());
                return;
            case SFIXED32:
                codedOutputStream.c(((Integer) obj).intValue());
                return;
            case SFIXED64:
                codedOutputStream.b(((Long) obj).longValue());
                return;
            case SINT32:
                codedOutputStream.b(CodedOutputStream.j(((Integer) obj).intValue()));
                return;
            case SINT64:
                codedOutputStream.a(CodedOutputStream.f(((Long) obj).longValue()));
                return;
            case ENUM:
                if (!(obj instanceof b)) {
                    codedOutputStream.a(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.a(((b) obj).a());
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if ((r3 instanceof defpackage.flc.b) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if ((r3 instanceof defpackage.fld) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x004b
            int[] r0 = defpackage.fkz.AnonymousClass1.a
            com.google.protobuf.WireFormat$JavaType r2 = r2.javaType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003d;
                case 2: goto L_0x003a;
                case 3: goto L_0x0037;
                case 4: goto L_0x0034;
                case 5: goto L_0x0031;
                case 6: goto L_0x002e;
                case 7: goto L_0x0025;
                case 8: goto L_0x001b;
                case 9: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0040
        L_0x0012:
            boolean r2 = r3 instanceof defpackage.fli
            if (r2 != 0) goto L_0x0023
            boolean r2 = r3 instanceof defpackage.fld
            if (r2 == 0) goto L_0x0040
            goto L_0x0023
        L_0x001b:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0023
            boolean r2 = r3 instanceof defpackage.flc.b
            if (r2 == 0) goto L_0x0040
        L_0x0023:
            r1 = 1
            goto L_0x0040
        L_0x0025:
            boolean r2 = r3 instanceof com.google.protobuf.ByteString
            if (r2 != 0) goto L_0x0023
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0040
            goto L_0x0023
        L_0x002e:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x003f
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x003f
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x003f
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x003f
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x003f
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x003f:
            r1 = r0
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x004b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
            goto L_0x0052
        L_0x0051:
            throw r2
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkz.a(com.google.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    private void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.b()) {
            a(fielddescriptortype.a(), obj);
            r5 = obj;
        } else if (obj instanceof List) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object a2 : arrayList) {
                a(fielddescriptortype.a(), a2);
            }
            r5 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r5 instanceof fld) {
            this.b = true;
        }
        this.a.put(fielddescriptortype, r5);
    }

    public final /* synthetic */ Object clone() {
        fkz fkz = new fkz();
        for (int i = 0; i < this.a.b(); i++) {
            Entry b2 = this.a.b(i);
            fkz.a((FieldDescriptorType) (a) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.a.c()) {
            fkz.a((FieldDescriptorType) (a) entry.getKey(), entry.getValue());
        }
        fkz.b = this.b;
        return fkz;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkz)) {
            return false;
        }
        return this.a.equals(((fkz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
