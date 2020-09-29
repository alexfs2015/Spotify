package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbed;
import defpackage.ddp;
import defpackage.ddp.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ddp reason: default package */
public abstract class ddp<MessageType extends ddp<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends dcf<MessageType, BuilderType> {
    private static Map<Object, ddp<?, ?>> zzdtv = new ConcurrentHashMap();
    protected dgc zzdtt = dgc.a();
    private int zzdtu = -1;

    /* renamed from: ddp$a */
    public static abstract class a<MessageType extends ddp<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends dcg<MessageType, BuilderType> {
        protected MessageType a;
        private final MessageType b;
        private boolean c = false;

        protected a(MessageType messagetype) {
            this.b = messagetype;
            this.a = (ddp) messagetype.a(e.d);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            dfd.a().a(messagetype).b(messagetype, messagetype2);
        }

        public final BuilderType a(MessageType messagetype) {
            d();
            a(this.a, messagetype);
            return this;
        }

        public final /* synthetic */ dcg c() {
            return (a) clone();
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) ((ddp) this.b).a(e.e);
            if (!this.c) {
                MessageType messagetype = this.a;
                dfd.a().a(messagetype).c(messagetype);
                this.c = true;
            }
            aVar.a((MessageType) (ddp) this.a);
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final void d() {
            if (this.c) {
                MessageType messagetype = (ddp) this.a.a(e.d);
                a(messagetype, this.a);
                this.a = messagetype;
                this.c = false;
            }
        }

        public final MessageType e() {
            boolean z = true;
            if (!this.c) {
                MessageType messagetype = this.a;
                dfd.a().a(messagetype).c(messagetype);
                this.c = true;
            }
            MessageType messagetype2 = (ddp) this.a;
            byte byteValue = ((Byte) messagetype2.a(e.a)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dfd.a().a(messagetype2).d(messagetype2);
                    messagetype2.a(e.b);
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new zzbed();
        }

        public final /* synthetic */ deq f() {
            if (this.c) {
                return this.a;
            }
            MessageType messagetype = this.a;
            dfd.a().a(messagetype).c(messagetype);
            this.c = true;
            return this.a;
        }

        public final /* synthetic */ deq g() {
            boolean z = true;
            if (!this.c) {
                MessageType messagetype = this.a;
                dfd.a().a(messagetype).c(messagetype);
                this.c = true;
            }
            ddp ddp = (ddp) this.a;
            byte byteValue = ((Byte) ddp.a(e.a)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dfd.a().a(ddp).d(ddp);
                    ddp.a(e.b);
                }
            }
            if (z) {
                return ddp;
            }
            throw new zzbed();
        }

        public final boolean i() {
            return ddp.a(this.a);
        }

        public final /* synthetic */ deq m() {
            return this.b;
        }
    }

    /* renamed from: ddp$b */
    public static class b<T extends ddp<T, ?>> extends dcj<T> {
        private T a;

        public b(T t) {
            this.a = t;
        }
    }

    /* renamed from: ddp$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends ddp<MessageType, BuilderType> implements des {
        protected ddj<Object> zzdtz = ddj.a();
    }

    /* renamed from: ddp$d */
    public static class d<ContainingType extends deq, Type> extends ddb<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: ddp$e */
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

    protected static <T extends ddp<T, ?>> T a(T t, zzbah zzbah) {
        boolean z;
        T a2 = a(t, zzbah, dde.a());
        boolean z2 = false;
        if (a2 != null) {
            byte byteValue = ((Byte) a2.a(e.a)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = dfd.a().a(a2).d(a2);
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
                z2 = dfd.a().a(a2).d(a2);
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

    private static <T extends ddp<T, ?>> T a(T t, zzbah zzbah, dde dde) {
        T a2;
        try {
            dcv e2 = zzbah.e();
            a2 = a(t, e2, dde);
            e2.a(0);
            return a2;
        } catch (zzbbu e3) {
            e3.zzdut = a2;
            throw e3;
        } catch (zzbbu e4) {
            throw e4;
        }
    }

    private static <T extends ddp<T, ?>> T a(T t, dcv dcv, dde dde) {
        T t2 = (ddp) t.a(e.d);
        try {
            dfd.a().a(t2).a(t2, dcv.c != null ? dcv.c : new dcx(dcv), dde);
            dfd.a().a(t2).c(t2);
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

    protected static <T extends ddp<T, ?>> T a(T t, byte[] bArr) {
        T b2 = b(t, bArr);
        if (b2 != null) {
            byte byteValue = ((Byte) b2.a(e.a)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = dfd.a().a(b2).d(b2);
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

    static <T extends ddp<?, ?>> T a(Class<T> cls) {
        T t = (ddp) zzdtv.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (ddp) zzdtv.get(cls);
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

    protected static Object a(deq deq, String str, Object[] objArr) {
        return new dff(deq, str, objArr);
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

    public static <T extends ddp<?, ?>> void a(Class<T> cls, T t) {
        zzdtv.put(cls, t);
    }

    protected static final <T extends ddp<T, ?>> boolean a(T t) {
        byte byteValue = ((Byte) t.a(e.a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return dfd.a().a(t).d(t);
    }

    private static <T extends ddp<T, ?>> T b(T t, byte[] bArr) {
        T t2 = (ddp) t.a(e.d);
        try {
            dfd.a().a(t2).a(t2, bArr, 0, bArr.length, new dcn());
            dfd.a().a(t2).c(t2);
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

    public abstract Object a(int i);

    public final void a(zzbav zzbav) {
        dfd.a().a(getClass()).a(this, (dgn) zzbav.c != null ? zzbav.c : new dcz(zzbav));
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        this.zzdtu = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((ddp) a(e.f)).getClass().isInstance(obj)) {
            return false;
        }
        return dfd.a().a(this).a(this, (ddp) obj);
    }

    /* access modifiers changed from: 0000 */
    public final int h() {
        return this.zzdtu;
    }

    public int hashCode() {
        if (this.zzdpf != 0) {
            return this.zzdpf;
        }
        this.zzdpf = dfd.a().a(this).a(this);
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
        boolean d2 = dfd.a().a(this).d(this);
        a(e.b);
        return d2;
    }

    public final int j() {
        if (this.zzdtu == -1) {
            this.zzdtu = dfd.a().a(this).b(this);
        }
        return this.zzdtu;
    }

    public final /* synthetic */ der k() {
        a aVar = (a) a(e.e);
        aVar.a(this);
        return aVar;
    }

    public final /* synthetic */ der l() {
        return (a) a(e.e);
    }

    public final /* synthetic */ deq m() {
        return (ddp) a(e.f);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        det.a(this, sb, 0);
        return sb.toString();
    }
}
