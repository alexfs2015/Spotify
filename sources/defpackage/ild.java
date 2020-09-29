package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.Observable;

/* renamed from: ild reason: default package */
public final class ild<A extends JacksonModel, R extends JacksonModel> {
    public int a;
    public b<A, R> b;
    public String c;
    private final Class<A> d;
    private final Class<R> e;

    /* renamed from: ild$a */
    public static class a<A extends JacksonModel, R extends JacksonModel> implements ilc<A, R> {
        private final Class<A> a;
        private final Class<R> b;
        private final int c;
        private final b<A, R> d;
        private final String e;

        private a(Class<A> cls, Class<R> cls2, String str, int i, b<A, R> bVar) {
            this.a = cls;
            this.b = cls2;
            this.e = str;
            this.c = i;
            this.d = bVar;
        }

        /* synthetic */ a(Class cls, Class cls2, String str, int i, b bVar, byte b2) {
            this(cls, cls2, str, i, bVar);
        }

        public final Observable<R> a(ikn ikn, A a2) {
            return this.d.serve(ikn, a2);
        }

        public final Class<A> a() {
            return this.a;
        }

        public final String b() {
            return this.e;
        }

        public final int c() {
            return this.c;
        }
    }

    /* renamed from: ild$b */
    public interface b<A extends JacksonModel, R extends JacksonModel> {
        Observable<R> serve(ikn ikn, A a);
    }

    private ild(Class<A> cls, Class<R> cls2) {
        this.d = cls;
        this.e = cls2;
    }

    public static <A extends JacksonModel, R extends JacksonModel> ild<A, R> a(Class<A> cls, Class<R> cls2) {
        return new ild<>(cls, cls2);
    }

    public final ilc<A, R> a() {
        a aVar = new a((Class) fbp.a(this.d), (Class) fbp.a(this.e), (String) fbp.a(this.c), this.a, (b) fbp.a(this.b), 0);
        return aVar;
    }
}
