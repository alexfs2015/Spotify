package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.a;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends fkr<MessageType, BuilderType> {
    public flr b = flr.a();
    protected int c = -1;

    static class EqualsVisitor implements f {
        static final EqualsVisitor a = new EqualsVisitor();
        private static NotEqualsException b = new NotEqualsException();

        static final class NotEqualsException extends RuntimeException {
            NotEqualsException() {
            }
        }

        private EqualsVisitor() {
        }

        public final double a(boolean z, double d, boolean z2, double d2) {
            if (z == z2 && d == d2) {
                return d;
            }
            throw b;
        }

        public final float a(boolean z, float f, boolean z2, float f2) {
            if (z == z2 && f == f2) {
                return f;
            }
            throw b;
        }

        public final int a(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw b;
        }

        public final long a(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw b;
        }

        public final ByteString a(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            if (z == z2 && byteString.equals(byteString2)) {
                return byteString;
            }
            throw b;
        }

        public final <K, V> MapFieldLite<K, V> a(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (mapFieldLite.equals(mapFieldLite2)) {
                return mapFieldLite;
            }
            throw b;
        }

        public final defpackage.flc.a a(defpackage.flc.a aVar, defpackage.flc.a aVar2) {
            if (aVar.equals(aVar2)) {
                return aVar;
            }
            throw b;
        }

        public final defpackage.flc.c a(defpackage.flc.c cVar, defpackage.flc.c cVar2) {
            if (cVar.equals(cVar2)) {
                return cVar;
            }
            throw b;
        }

        public final <T> defpackage.flc.e<T> a(defpackage.flc.e<T> eVar, defpackage.flc.e<T> eVar2) {
            if (eVar.equals(eVar2)) {
                return eVar;
            }
            throw b;
        }

        public final <T extends fli> T a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw b;
            }
            ((GeneratedMessageLite) t).a(this, (fli) t2);
            return t;
        }

        public final flr a(flr flr, flr flr2) {
            if (flr.equals(flr2)) {
                return flr;
            }
            throw b;
        }

        public final Object a(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        public final String a(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw b;
        }

        public final void a(boolean z) {
            if (z) {
                throw b;
            }
        }

        public final boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw b;
        }

        public final Object b(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        public final Object c(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        public final Object d(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw b;
        }

        public final Object e(boolean z, Object obj, Object obj2) {
            if (z && ((GeneratedMessageLite) obj).a(this, (fli) obj2)) {
                return obj;
            }
            throw b;
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements fla<MessageType, BuilderType> {
        public fkz<c> d = fkz.a();
    }

    public enum MethodToInvoke {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends defpackage.fkr.a<MessageType, BuilderType> {
        protected MessageType a;
        private final MessageType b;
        private boolean c = false;

        protected a(MessageType messagetype) {
            this.b = messagetype;
            this.a = (GeneratedMessageLite) messagetype.a(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public BuilderType b(fkw fkw, fky fky) {
            b();
            try {
                this.a.a(MethodToInvoke.MERGE_FROM_STREAM, (Object) fkw, (Object) fky);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public BuilderType clone() {
            BuilderType d = this.b.d();
            d.a((MessageType) e());
            return d;
        }

        public final BuilderType a(MessageType messagetype) {
            b();
            this.a.a((f) e.a, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public final void b() {
            if (this.c) {
                MessageType messagetype = (GeneratedMessageLite) this.a.a(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                messagetype.a((f) e.a, this.a);
                this.a = messagetype;
                this.c = false;
            }
        }

        /* renamed from: c */
        public final MessageType e() {
            if (this.c) {
                return this.a;
            }
            this.a.e();
            this.c = true;
            return this.a;
        }

        /* renamed from: d */
        public final MessageType g() {
            MessageType c2 = e();
            if (c2.f()) {
                return c2;
            }
            throw new UninitializedMessageException();
        }

        public final boolean f() {
            return GeneratedMessageLite.a(this.a, false);
        }

        public final /* bridge */ /* synthetic */ fli i() {
            return this.b;
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends fks<T> {
        private T a;

        public b(T t) {
            this.a = t;
        }

        public final /* bridge */ /* synthetic */ Object a(fkw fkw, fky fky) {
            return GeneratedMessageLite.a(this.a, fkw, fky);
        }
    }

    public static final class c implements defpackage.fkz.a<c> {
        public final int a;
        private FieldType b;
        private boolean c;

        public final FieldType a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.a - ((c) obj).a;
        }
    }

    static class d implements f {
        int a;

        private d() {
            this.a = 0;
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final double a(boolean z, double d, boolean z2, double d2) {
            this.a = (this.a * 53) + flc.a(Double.doubleToLongBits(d));
            return d;
        }

        public final float a(boolean z, float f, boolean z2, float f2) {
            this.a = (this.a * 53) + Float.floatToIntBits(f);
            return f;
        }

        public final int a(boolean z, int i, boolean z2, int i2) {
            this.a = (this.a * 53) + i;
            return i;
        }

        public final long a(boolean z, long j, boolean z2, long j2) {
            this.a = (this.a * 53) + flc.a(j);
            return j;
        }

        public final ByteString a(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            this.a = (this.a * 53) + byteString.hashCode();
            return byteString;
        }

        public final <K, V> MapFieldLite<K, V> a(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            this.a = (this.a * 53) + mapFieldLite.hashCode();
            return mapFieldLite;
        }

        public final defpackage.flc.a a(defpackage.flc.a aVar, defpackage.flc.a aVar2) {
            this.a = (this.a * 53) + aVar.hashCode();
            return aVar;
        }

        public final defpackage.flc.c a(defpackage.flc.c cVar, defpackage.flc.c cVar2) {
            this.a = (this.a * 53) + cVar.hashCode();
            return cVar;
        }

        public final <T> defpackage.flc.e<T> a(defpackage.flc.e<T> eVar, defpackage.flc.e<T> eVar2) {
            this.a = (this.a * 53) + eVar.hashCode();
            return eVar;
        }

        public final <T extends fli> T a(T t, T t2) {
            int i = t != null ? t instanceof GeneratedMessageLite ? ((GeneratedMessageLite) t).a(this) : t.hashCode() : 37;
            this.a = (this.a * 53) + i;
            return t;
        }

        public final flr a(flr flr, flr flr2) {
            this.a = (this.a * 53) + flr.hashCode();
            return flr;
        }

        public final Object a(boolean z, Object obj, Object obj2) {
            this.a = (this.a * 53) + flc.a(((Boolean) obj).booleanValue());
            return obj;
        }

        public final String a(boolean z, String str, boolean z2, String str2) {
            this.a = (this.a * 53) + str.hashCode();
            return str;
        }

        public final void a(boolean z) {
            if (z) {
                throw new IllegalStateException();
            }
        }

        public final boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = (this.a * 53) + flc.a(z2);
            return z2;
        }

        public final Object b(boolean z, Object obj, Object obj2) {
            this.a = (this.a * 53) + ((Integer) obj).intValue();
            return obj;
        }

        public final Object c(boolean z, Object obj, Object obj2) {
            this.a = (this.a * 53) + flc.a(Double.doubleToLongBits(((Double) obj).doubleValue()));
            return obj;
        }

        public final Object d(boolean z, Object obj, Object obj2) {
            this.a = (this.a * 53) + obj.hashCode();
            return obj;
        }

        public final Object e(boolean z, Object obj, Object obj2) {
            return a((T) (fli) obj, (T) (fli) obj2);
        }
    }

    public static class e implements f {
        public static final e a = new e();

        private e() {
        }

        public final double a(boolean z, double d, boolean z2, double d2) {
            return z2 ? d2 : d;
        }

        public final float a(boolean z, float f, boolean z2, float f2) {
            return z2 ? f2 : f;
        }

        public final int a(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public final long a(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        public final ByteString a(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            return z2 ? byteString2 : byteString;
        }

        public final <K, V> MapFieldLite<K, V> a(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (!mapFieldLite2.isEmpty()) {
                if (!mapFieldLite.isMutable) {
                    mapFieldLite = mapFieldLite.b();
                }
                mapFieldLite.c();
                if (!mapFieldLite2.isEmpty()) {
                    mapFieldLite.putAll(mapFieldLite2);
                }
            }
            return mapFieldLite;
        }

        public final defpackage.flc.a a(defpackage.flc.a aVar, defpackage.flc.a aVar2) {
            int size = aVar.size();
            int size2 = aVar2.size();
            if (size > 0 && size2 > 0) {
                if (!aVar.a()) {
                    aVar = aVar.a(size2 + size);
                }
                aVar.addAll(aVar2);
            }
            return size > 0 ? aVar : aVar2;
        }

        public final defpackage.flc.c a(defpackage.flc.c cVar, defpackage.flc.c cVar2) {
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.a()) {
                    cVar = cVar.a(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            return size > 0 ? cVar : cVar2;
        }

        public final <T> defpackage.flc.e<T> a(defpackage.flc.e<T> eVar, defpackage.flc.e<T> eVar2) {
            int size = eVar.size();
            int size2 = eVar2.size();
            if (size > 0 && size2 > 0) {
                if (!eVar.a()) {
                    eVar = eVar.c(size2 + size);
                }
                eVar.addAll(eVar2);
            }
            return size > 0 ? eVar : eVar2;
        }

        public final <T extends fli> T a(T t, T t2) {
            return (t == null || t2 == null) ? t != null ? t : t2 : t.h().a(t2).g();
        }

        public final flr a(flr flr, flr flr2) {
            return flr2 == flr.a() ? flr : flr.a(flr, flr2);
        }

        public final Object a(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final String a(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public final void a(boolean z) {
        }

        public final boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        public final Object b(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final Object c(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final Object d(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final Object e(boolean z, Object obj, Object obj2) {
            return z ? a((T) (fli) obj, (T) (fli) obj2) : obj2;
        }
    }

    public interface f {
        double a(boolean z, double d, boolean z2, double d2);

        float a(boolean z, float f, boolean z2, float f2);

        int a(boolean z, int i, boolean z2, int i2);

        long a(boolean z, long j, boolean z2, long j2);

        ByteString a(boolean z, ByteString byteString, boolean z2, ByteString byteString2);

        <K, V> MapFieldLite<K, V> a(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2);

        defpackage.flc.a a(defpackage.flc.a aVar, defpackage.flc.a aVar2);

        defpackage.flc.c a(defpackage.flc.c cVar, defpackage.flc.c cVar2);

        <T> defpackage.flc.e<T> a(defpackage.flc.e<T> eVar, defpackage.flc.e<T> eVar2);

        <T extends fli> T a(T t, T t2);

        flr a(flr flr, flr flr2);

        Object a(boolean z, Object obj, Object obj2);

        String a(boolean z, String str, boolean z2, String str2);

        void a(boolean z);

        boolean a(boolean z, boolean z2, boolean z3, boolean z4);

        Object b(boolean z, Object obj, Object obj2);

        Object c(boolean z, Object obj, Object obj2);

        Object d(boolean z, Object obj, Object obj2);

        Object e(boolean z, Object obj, Object obj2);
    }

    static <T extends GeneratedMessageLite<T, ?>> T a(T t, fkw fkw, fky fky) {
        T t2 = (GeneratedMessageLite) t.a(MethodToInvoke.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
        try {
            t2.a(MethodToInvoke.MERGE_FROM_STREAM, (Object) fkw, (Object) fky);
            t2.e();
            return t2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T a(T t, byte[] bArr) {
        T a2 = a(t, bArr, fky.a());
        if (a2 == null || a2.f()) {
            return a2;
        }
        InvalidProtocolBufferException a3 = new UninitializedMessageException().a();
        a3.unfinishedMessage = a2;
        throw a3;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T a(T t, byte[] bArr, fky fky) {
        T a2;
        try {
            fkw a3 = fkw.a(bArr);
            a2 = a(t, a3, fky);
            a3.a(0);
            return a2;
        } catch (InvalidProtocolBufferException e2) {
            e2.unfinishedMessage = a2;
            throw e2;
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }

    public static defpackage.flc.c a(defpackage.flc.c cVar) {
        int size = cVar.size();
        return cVar.a(size == 0 ? 10 : size << 1);
    }

    public static <E> defpackage.flc.e<E> a(defpackage.flc.e<E> eVar) {
        int size = eVar.size();
        return eVar.c(size == 0 ? 10 : size << 1);
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean a(T t, boolean z) {
        return t.a(MethodToInvoke.IS_INITIALIZED, (Object) Boolean.FALSE, (Object) null) != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public MessageType i() {
        return (GeneratedMessageLite) a(MethodToInvoke.GET_DEFAULT_INSTANCE, (Object) null, (Object) null);
    }

    private final void l() {
        if (this.b == flr.a()) {
            this.b = flr.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(d dVar) {
        if (this.a == 0) {
            int i = dVar.a;
            dVar.a = 0;
            a((f) dVar, (MessageType) this);
            this.a = dVar.a;
            dVar.a = i;
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Object a(MethodToInvoke methodToInvoke) {
        return a(methodToInvoke, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public final void a(int i, int i2) {
        l();
        flr flr = this.b;
        flr.c();
        if (i != 0) {
            flr.a((i << 3) | 0, (Object) Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: 0000 */
    public final void a(f fVar, MessageType messagetype) {
        a(MethodToInvoke.VISIT, (Object) fVar, (Object) messagetype);
        this.b = fVar.a(this.b, messagetype.b);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, fkw fkw) {
        if ((i & 7) == 4) {
            return false;
        }
        l();
        return this.b.a(i, fkw);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(EqualsVisitor equalsVisitor, fli fli) {
        if (this == fli) {
            return true;
        }
        if (!i().getClass().isInstance(fli)) {
            return false;
        }
        a((f) equalsVisitor, (MessageType) (GeneratedMessageLite) fli);
        return true;
    }

    public final fll<MessageType> c() {
        return (fll) a(MethodToInvoke.GET_PARSER, (Object) null, (Object) null);
    }

    public final BuilderType d() {
        return (a) a(MethodToInvoke.NEW_BUILDER, (Object) null, (Object) null);
    }

    public final void e() {
        a(MethodToInvoke.MAKE_IMMUTABLE, (Object) null, (Object) null);
        this.b.a = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i().getClass().isInstance(obj)) {
            return false;
        }
        try {
            a((f) EqualsVisitor.a, (MessageType) (GeneratedMessageLite) obj);
            return true;
        } catch (NotEqualsException unused) {
            return false;
        }
    }

    public final boolean f() {
        return a(MethodToInvoke.IS_INITIALIZED, (Object) Boolean.TRUE, (Object) null) != null;
    }

    /* renamed from: g */
    public final BuilderType h() {
        BuilderType buildertype = (a) a(MethodToInvoke.NEW_BUILDER, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public int hashCode() {
        if (this.a == 0) {
            d dVar = new d(0);
            a((f) dVar, (MessageType) this);
            this.a = dVar.a;
        }
        return this.a;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        flk.a(this, sb, 0);
        return sb.toString();
    }
}
