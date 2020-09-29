package defpackage;

import com.google.android.gms.internal.measurement.zzve;
import com.google.android.gms.internal.measurement.zzwe;
import com.google.android.gms.internal.measurement.zzyl;
import defpackage.emw;
import defpackage.emw.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: emw reason: default package */
public abstract class emw<MessageType extends emw<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends eln<MessageType, BuilderType> {
    private static Map<Object, emw<?, ?>> zzbzj = new ConcurrentHashMap();
    protected epf zzbzh = epf.a();
    private int zzbzi = -1;

    /* renamed from: emw$a */
    public static abstract class a<MessageType extends emw<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends elo<MessageType, BuilderType> {
        protected MessageType a;
        private final MessageType b;
        private boolean c = false;

        protected a(MessageType messagetype) {
            this.b = messagetype;
            this.a = (emw) messagetype.a(e.d);
        }

        /* access modifiers changed from: protected */
        public final void b() {
            if (this.c) {
                MessageType messagetype = (emw) this.a.a(e.d);
                a(messagetype, this.a);
                this.a = messagetype;
                this.c = false;
            }
        }

        public final boolean f() {
            return emw.a(this.a);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public MessageType c() {
            if (this.c) {
                return this.a;
            }
            MessageType messagetype = this.a;
            eoj.a().a(messagetype).c(messagetype);
            this.c = true;
            return this.a;
        }

        public final BuilderType a(MessageType messagetype) {
            b();
            a(this.a, messagetype);
            return this;
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            eoj.a().a(messagetype).b(messagetype, messagetype2);
        }

        public final /* synthetic */ elo a() {
            return (a) clone();
        }

        public final /* synthetic */ enx k() {
            return this.b;
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) ((emw) this.b).a(e.e);
            aVar.a((MessageType) c());
            return aVar;
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
                    z = eoj.a().a(e).d(e);
                    e.a(e.b);
                }
            }
            if (z) {
                return e;
            }
            throw new zzyl();
        }
    }

    /* renamed from: emw$b */
    public static class b<T extends emw<T, ?>> extends elp<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        public final /* synthetic */ Object a(emc emc, eml eml) {
            return emw.a(this.a, emc, eml);
        }
    }

    /* renamed from: emw$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends emw<MessageType, BuilderType> implements enz {
        protected emp<Object> zzbzn = emp.a();
    }

    /* renamed from: emw$d */
    public static class d<ContainingType extends enx, Type> extends emj<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: emw$e */
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

    public abstract Object a(int i);

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        eoa.a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.zzbum != 0) {
            return this.zzbum;
        }
        this.zzbum = eoj.a().a(this).a(this);
        return this.zzbum;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((emw) a(e.f)).getClass().isInstance(obj)) {
            return false;
        }
        return eoj.a().a(this).a(this, (emw) obj);
    }

    public final boolean f() {
        byte byteValue = ((Byte) a(e.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = eoj.a().a(this).d(this);
        a(e.b);
        return d2;
    }

    public final BuilderType g() {
        BuilderType buildertype = (a) a(e.e);
        buildertype.a(this);
        return buildertype;
    }

    /* access modifiers changed from: 0000 */
    public final int e() {
        return this.zzbzi;
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        this.zzbzi = i;
    }

    public final void a(zzve zzve) {
        emh emh;
        eon a2 = eoj.a().a(getClass());
        if (zzve.b != null) {
            emh = zzve.b;
        } else {
            emh = new emh(zzve);
        }
        a2.a(this, (epr) emh);
    }

    public final int h() {
        if (this.zzbzi == -1) {
            this.zzbzi = eoj.a().a(this).b(this);
        }
        return this.zzbzi;
    }

    static <T extends emw<?, ?>> T a(Class<T> cls) {
        T t = (emw) zzbzj.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (emw) zzbzj.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (emw) ((emw) epk.a(cls)).a(e.f);
            if (t != null) {
                zzbzj.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static <T extends emw<?, ?>> void a(Class<T> cls, T t) {
        zzbzj.put(cls, t);
    }

    protected static Object a(enx enx, String str, Object[] objArr) {
        return new eol(enx, str, objArr);
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

    protected static final <T extends emw<T, ?>> boolean a(T t) {
        byte byteValue = ((Byte) t.a(e.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return eoj.a().a(t).d(t);
    }

    static <T extends emw<T, ?>> T a(T t, emc emc, eml eml) {
        emf emf;
        T t2 = (emw) t.a(e.d);
        try {
            eon a2 = eoj.a().a(t2);
            if (emc.c != null) {
                emf = emc.c;
            } else {
                emf = new emf(emc);
            }
            a2.a(t2, emf, eml);
            eoj.a().a(t2).c(t2);
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

    public final /* synthetic */ eny i() {
        a aVar = (a) a(e.e);
        aVar.a(this);
        return aVar;
    }

    public final /* synthetic */ eny j() {
        return (a) a(e.e);
    }

    public final /* synthetic */ enx k() {
        return (emw) a(e.f);
    }
}
