package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.Observable;

/* renamed from: iiq reason: default package */
public final class iiq<A extends JacksonModel, R extends JacksonModel> {
    public int a;
    public b<A, R> b;
    public String c;
    private final Class<A> d;
    private final Class<R> e;

    /* renamed from: iiq$a */
    public static class a<A extends JacksonModel, R extends JacksonModel> implements iip<A, R> {
        private final Class<A> a;
        private final Class<R> b;
        private final int c;
        private final b<A, R> d;
        private final String e;

        /* synthetic */ a(Class cls, Class cls2, String str, int i, b bVar, byte b2) {
            this(cls, cls2, str, i, bVar);
        }

        private a(Class<A> cls, Class<R> cls2, String str, int i, b<A, R> bVar) {
            this.a = cls;
            this.b = cls2;
            this.e = str;
            this.c = i;
            this.d = bVar;
        }

        public final Class<A> a() {
            return this.a;
        }

        public final int c() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public final Observable<R> a(iia iia, A a2) {
            return this.d.serve(iia, a2);
        }
    }

    /* renamed from: iiq$b */
    public interface b<A extends JacksonModel, R extends JacksonModel> {
        Observable<R> serve(iia iia, A a);
    }

    private iiq(Class<A> cls, Class<R> cls2) {
        this.d = cls;
        this.e = cls2;
    }

    public final iip<A, R> a() {
        a aVar = new a((Class) fay.a(this.d), (Class) fay.a(this.e), (String) fay.a(this.c), this.a, (b) fay.a(this.b), 0);
        return aVar;
    }

    public static <A extends JacksonModel, R extends JacksonModel> iiq<A, R> a(Class<A> cls, Class<R> cls2) {
        return new iiq<>(cls, cls2);
    }
}
