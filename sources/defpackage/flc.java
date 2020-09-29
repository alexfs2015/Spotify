package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: flc reason: default package */
public final class flc {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    /* renamed from: flc$a */
    public interface a extends e<Boolean> {
        a a(int i);

        void a(boolean z);

        boolean b(int i);
    }

    /* renamed from: flc$b */
    public interface b {
        int a();
    }

    /* renamed from: flc$c */
    public interface c extends e<Integer> {
        c a(int i);

        int b(int i);

        void d(int i);
    }

    /* renamed from: flc$d */
    public static class d<F, T> extends AbstractList<T> {
        private final List<F> a;
        private final a<F, T> b;

        /* renamed from: flc$d$a */
        public interface a<F, T> {
            T a(F f);
        }

        public d(List<F> list, a<F, T> aVar) {
            this.a = list;
            this.b = aVar;
        }

        public final T get(int i) {
            return this.b.a(this.a.get(i));
        }

        public final int size() {
            return this.a.size();
        }
    }

    /* renamed from: flc$e */
    public interface e<E> extends List<E>, RandomAccess {
        boolean a();

        void b();

        e<E> c(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        fkw.a(b);
    }

    public static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int a(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
