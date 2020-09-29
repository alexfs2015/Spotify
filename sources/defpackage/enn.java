package defpackage;

import com.google.android.gms.internal.measurement.zzve;
import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzyl;
import defpackage.enn;
import defpackage.enn.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: enn reason: default package */
public abstract class enn<MessageType extends enn<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends eme<MessageType, BuilderType> {
    private static Map<Object, enn<?, ?>> zzbzj = new ConcurrentHashMap();
    protected epw zzbzh = epw.a();
    private int zzbzi = -1;

    /* renamed from: enn$a */
    public static abstract class a<MessageType extends enn<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends emf<MessageType, BuilderType> {
        protected MessageType a;
        private final MessageType b;
        private boolean c = false;

        protected a(MessageType messagetype) {
            this.b = messagetype;
            this.a = (enn) messagetype.a(e.d);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            epa.a().a(messagetype).b(messagetype, messagetype2);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public MessageType c() {
            if (this.c) {
                return this.a;
            }
            MessageType messagetype = this.a;
            epa.a().a(messagetype).c(messagetype);
            this.c = true;
            return this.a;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public MessageType d() {
            MessageType e = c();
            byte byteValue = ((Byte) e.a(e.a)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = epa.a().a(e).d(e);
                    e.a(e.b);
                }
            }
            if (z) {
                return e;
            }
            throw new zzyl();
        }

        public final /* synthetic */ emf a() {
            return (a) clone();
        }

        public final BuilderType a(MessageType messagetype) {
            b();
            a(this.a, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public final void b() {
            if (this.c) {
                MessageType messagetype = (enn) this.a.a(e.d);
                a(messagetype, this.a);
                this.a = messagetype;
                this.c = false;
            }
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) ((enn) this.b).a(e.e);
            aVar.a((MessageType) c());
            return aVar;
        }

        public final boolean f() {
            return enn.a(this.a);
        }

        public final /* synthetic */ eoo k() {
            return this.b;
        }
    }

    /* renamed from: enn$b */
    public static class b<T extends enn<T, ?>> extends emg<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        public final /* synthetic */ Object a(emt emt, enc enc) {
            return enn.a(this.a, emt, enc);
        }
    }

    /* renamed from: enn$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends enn<MessageType, BuilderType> implements eoq {
        protected eng<Object> zzbzn = eng.a();
    }

    /* renamed from: enn$d */
    public static class d<ContainingType extends eoo, Type> extends ena<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: enn$e */
    public static final class e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 1;
        public static final int k = 2;
        private static final /* synthetic */ int[] l = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) l.clone();
        }
    }

    static <T extends enn<T, ?>> T a(T t, emt emt, enc enc) {
        T t2 = (enn) t.a(e.d);
        try {
            epa.a().a(t2).a(t2, emt.c != null ? emt.c : new emw(emt), enc);
            epa.a().a(t2).c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzwe) {
                throw ((zzwe) e2.getCause());
            }
            zzwe zzwe = new zzwe(e2.getMessage());
            zzwe.zzcah = t2;
            throw zzwe;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzwe) {
                throw ((zzwe) e3.getCause());
            }
            throw e3;
        }
    }

    static <T extends enn<?, ?>> T a(Class<T> cls) {
        T t = (enn) zzbzj.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (enn) zzbzj.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (enn) ((enn) eqb.a(cls)).a(e.f);
            if (t != null) {
                zzbzj.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static Object a(eoo eoo, String str, Object[] objArr) {
        return new epc(eoo, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
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

    public static <T extends enn<?, ?>> void a(Class<T> cls, T t) {
        zzbzj.put(cls, t);
    }

    protected static final <T extends enn<T, ?>> boolean a(T t) {
        byte byteValue = ((Byte) t.a(e.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return epa.a().a(t).d(t);
    }

    public abstract Object a(int i);

    public final void a(zzve zzve) {
        epa.a().a(getClass()).a(this, (eqi) zzve.b != null ? zzve.b : new emy(zzve));
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        this.zzbzi = i;
    }

    /* access modifiers changed from: 0000 */
    public final int e() {
        return this.zzbzi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((enn) a(e.f)).getClass().isInstance(obj)) {
            return false;
        }
        return epa.a().a(this).a(this, (enn) obj);
    }

    public final boolean f() {
        byte byteValue = ((Byte) a(e.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = epa.a().a(this).d(this);
        a(e.b);
        return d2;
    }

    public final BuilderType g() {
        BuilderType buildertype = (a) a(e.e);
        buildertype.a(this);
        return buildertype;
    }

    public final int h() {
        if (this.zzbzi == -1) {
            this.zzbzi = epa.a().a(this).b(this);
        }
        return this.zzbzi;
    }

    public int hashCode() {
        if (this.zzbum != 0) {
            return this.zzbum;
        }
        this.zzbum = epa.a().a(this).a(this);
        return this.zzbum;
    }

    public final /* synthetic */ eop i() {
        a aVar = (a) a(e.e);
        aVar.a(this);
        return aVar;
    }

    public final /* synthetic */ eop j() {
        return (a) a(e.e);
    }

    public final /* synthetic */ eoo k() {
        return (enn) a(e.f);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        eor.a(this, sb, 0);
        return sb.toString();
    }
}
