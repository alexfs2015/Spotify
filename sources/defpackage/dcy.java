package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbed;
import defpackage.dcy;
import defpackage.dcy.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dcy reason: default package */
public abstract class dcy<MessageType extends dcy<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends dbo<MessageType, BuilderType> {
    private static Map<Object, dcy<?, ?>> zzdtv = new ConcurrentHashMap();
    protected dfl zzdtt = dfl.a();
    private int zzdtu = -1;

    /* renamed from: dcy$a */
    public static abstract class a<MessageType extends dcy<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends dbp<MessageType, BuilderType> {
        protected MessageType a;
        private final MessageType b;
        private boolean c = false;

        protected a(MessageType messagetype) {
            this.b = messagetype;
            this.a = (dcy) messagetype.a(e.d);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            dem.a().a(messagetype).b(messagetype, messagetype2);
        }

        public final BuilderType a(MessageType messagetype) {
            d();
            a(this.a, messagetype);
            return this;
        }

        public final /* synthetic */ dbp c() {
            return (a) clone();
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) ((dcy) this.b).a(e.e);
            if (!this.c) {
                MessageType messagetype = this.a;
                dem.a().a(messagetype).c(messagetype);
                this.c = true;
            }
            aVar.a((MessageType) (dcy) this.a);
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final void d() {
            if (this.c) {
                MessageType messagetype = (dcy) this.a.a(e.d);
                a(messagetype, this.a);
                this.a = messagetype;
                this.c = false;
            }
        }

        public final MessageType e() {
            boolean z = true;
            if (!this.c) {
                MessageType messagetype = this.a;
                dem.a().a(messagetype).c(messagetype);
                this.c = true;
            }
            MessageType messagetype2 = (dcy) this.a;
            byte byteValue = ((Byte) messagetype2.a(e.a)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dem.a().a(messagetype2).d(messagetype2);
                    messagetype2.a(e.b);
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new zzbed();
        }

        public final /* synthetic */ ddz f() {
            if (this.c) {
                return this.a;
            }
            MessageType messagetype = this.a;
            dem.a().a(messagetype).c(messagetype);
            this.c = true;
            return this.a;
        }

        public final /* synthetic */ ddz g() {
            boolean z = true;
            if (!this.c) {
                MessageType messagetype = this.a;
                dem.a().a(messagetype).c(messagetype);
                this.c = true;
            }
            dcy dcy = (dcy) this.a;
            byte byteValue = ((Byte) dcy.a(e.a)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dem.a().a(dcy).d(dcy);
                    dcy.a(e.b);
                }
            }
            if (z) {
                return dcy;
            }
            throw new zzbed();
        }

        public final boolean i() {
            return dcy.a(this.a);
        }

        public final /* synthetic */ ddz m() {
            return this.b;
        }
    }

    /* renamed from: dcy$b */
    public static class b<T extends dcy<T, ?>> extends dbs<T> {
        private T a;

        public b(T t) {
            this.a = t;
        }
    }

    /* renamed from: dcy$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends dcy<MessageType, BuilderType> implements deb {
        protected dcs<Object> zzdtz = dcs.a();
    }

    /* renamed from: dcy$d */
    public static class d<ContainingType extends ddz, Type> extends dck<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: dcy$e */
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

    static <T extends dcy<?, ?>> T a(Class<T> cls) {
        T t = (dcy) zzdtv.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (dcy) zzdtv.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        String str = "Unable to get default instance for: ";
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected static Object a(ddz ddz, String str, Object[] objArr) {
        return new deo(ddz, str, objArr);
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

    public static <T extends dcy<?, ?>> void a(Class<T> cls, T t) {
        zzdtv.put(cls, t);
    }

    protected static final <T extends dcy<T, ?>> boolean a(T t) {
        byte byteValue = ((Byte) t.a(e.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return dem.a().a(t).d(t);
    }

    public abstract Object a(int i);

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        this.zzdtu = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((dcy) a(e.f)).getClass().isInstance(obj)) {
            return false;
        }
        return dem.a().a(this).a(this, (dcy) obj);
    }

    /* access modifiers changed from: 0000 */
    public final int h() {
        return this.zzdtu;
    }

    public int hashCode() {
        if (this.zzdpf != 0) {
            return this.zzdpf;
        }
        this.zzdpf = dem.a().a(this).a(this);
        return this.zzdpf;
    }

    public final boolean i() {
        byte byteValue = ((Byte) a(e.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = dem.a().a(this).d(this);
        a(e.b);
        return d2;
    }

    public final int j() {
        if (this.zzdtu == -1) {
            this.zzdtu = dem.a().a(this).b(this);
        }
        return this.zzdtu;
    }

    public final /* synthetic */ dea k() {
        a aVar = (a) a(e.e);
        aVar.a(this);
        return aVar;
    }

    public final /* synthetic */ dea l() {
        return (a) a(e.e);
    }

    public final /* synthetic */ ddz m() {
        return (dcy) a(e.f);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        dec.a(this, sb, 0);
        return sb.toString();
    }

    public final void a(zzbav zzbav) {
        dem.a().a(getClass()).a(this, (dfw) zzbav.c != null ? zzbav.c : new dci(zzbav));
    }

    private static <T extends dcy<T, ?>> T a(T t, dce dce, dcn dcn) {
        T t2 = (dcy) t.a(e.d);
        try {
            dem.a().a(t2).a(t2, dce.c != null ? dce.c : new dcg(dce), dcn);
            dem.a().a(t2).c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzbbu) {
                throw ((zzbbu) e2.getCause());
            }
            zzbbu zzbbu = new zzbbu(e2.getMessage());
            zzbbu.zzdut = t2;
            throw zzbbu;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzbbu) {
                throw ((zzbbu) e3.getCause());
            }
            throw e3;
        }
    }

    private static <T extends dcy<T, ?>> T b(T t, byte[] bArr) {
        T t2 = (dcy) t.a(e.d);
        try {
            dem.a().a(t2).a(t2, bArr, 0, bArr.length, new dbw());
            dem.a().a(t2).c(t2);
            if (t2.zzdpf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzbbu) {
                throw ((zzbbu) e2.getCause());
            }
            zzbbu zzbbu = new zzbbu(e2.getMessage());
            zzbbu.zzdut = t2;
            throw zzbbu;
        } catch (IndexOutOfBoundsException unused) {
            zzbbu a2 = zzbbu.a();
            a2.zzdut = t2;
            throw a2;
        }
    }

    protected static <T extends dcy<T, ?>> T a(T t, zzbah zzbah) {
        boolean z;
        T a2 = a(t, zzbah, dcn.a());
        boolean z2 = false;
        if (a2 != null) {
            byte byteValue = ((Byte) a2.a(e.a)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = dem.a().a(a2).d(a2);
                a2.a(e.b);
            }
            if (!z) {
                zzbbu a3 = new zzbed().a();
                a3.zzdut = a2;
                throw a3;
            }
        }
        if (a2 != null) {
            byte byteValue2 = ((Byte) a2.a(e.a)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = dem.a().a(a2).d(a2);
                a2.a(e.b);
            }
            if (!z2) {
                zzbbu a4 = new zzbed().a();
                a4.zzdut = a2;
                throw a4;
            }
        }
        return a2;
    }

    private static <T extends dcy<T, ?>> T a(T t, zzbah zzbah, dcn dcn) {
        T a2;
        try {
            dce e2 = zzbah.e();
            a2 = a(t, e2, dcn);
            e2.a(0);
            return a2;
        } catch (zzbbu e3) {
            e3.zzdut = a2;
            throw e3;
        } catch (zzbbu e4) {
            throw e4;
        }
    }

    protected static <T extends dcy<T, ?>> T a(T t, byte[] bArr) {
        T b2 = b(t, bArr);
        if (b2 != null) {
            byte byteValue = ((Byte) b2.a(e.a)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dem.a().a(b2).d(b2);
                    b2.a(e.b);
                }
            }
            if (!z) {
                zzbbu a2 = new zzbed().a();
                a2.zzdut = b2;
                throw a2;
            }
        }
        return b2;
    }
}
