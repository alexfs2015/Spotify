package rx.internal.util;

import java.util.List;
import rx.Notification;
import rx.exceptions.OnErrorNotImplementedException;

public enum InternalObservableUtils {
    ;
    
    static final h a = null;
    static final b b = null;
    public static final xis<Throwable> c = null;

    static final class a implements xis<Throwable> {
        a() {
        }

        public final /* synthetic */ void call(Object obj) {
            throw new OnErrorNotImplementedException((Throwable) obj);
        }
    }

    static final class b implements xiy<Notification<?>, Throwable> {
        b() {
        }

        public final /* bridge */ /* synthetic */ Object call(Object obj) {
            return ((Notification) obj).b;
        }
    }

    public static final class c implements xiz<Object, Object, Boolean> {
        c() {
        }

        public final /* synthetic */ Object call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    public static final class d implements xiz<Integer, Object, Integer> {
        d() {
        }

        public final /* synthetic */ Object call(Object obj, Object obj2) {
            return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }

    public static final class e implements xiz<Long, Object, Long> {
        e() {
        }

        public final /* synthetic */ Object call(Object obj, Object obj2) {
            return Long.valueOf(((Long) obj).longValue() + 1);
        }
    }

    static final class f implements xiy<xii<? extends Notification<?>>, xii<?>> {
        private xiy<? super xii<? extends Void>, ? extends xii<?>> a;

        public f(xiy<? super xii<? extends Void>, ? extends xii<?>> xiy) {
            this.a = xiy;
        }

        public final /* synthetic */ Object call(Object obj) {
            return (xii) this.a.call(((xii) obj).e((xiy<? super T, ? extends R>) InternalObservableUtils.a));
        }
    }

    static final class g implements xiy<xii<? extends Notification<?>>, xii<?>> {
        private xiy<? super xii<? extends Throwable>, ? extends xii<?>> a;

        public g(xiy<? super xii<? extends Throwable>, ? extends xii<?>> xiy) {
            this.a = xiy;
        }

        public final /* synthetic */ Object call(Object obj) {
            return (xii) this.a.call(((xii) obj).e((xiy<? super T, ? extends R>) InternalObservableUtils.b));
        }
    }

    static final class h implements xiy<Object, Void> {
        h() {
        }

        public final /* bridge */ /* synthetic */ Object call(Object obj) {
            return null;
        }
    }

    public static final class i implements xiy<List<? extends xii<?>>, xii<?>[]> {
        i() {
        }

        public final /* synthetic */ Object call(Object obj) {
            List list = (List) obj;
            return (xii[]) list.toArray(new xii[list.size()]);
        }
    }

    static {
        new e();
        new c();
        new i();
        a = new h();
        new d();
        b = new b();
        c = new a();
        new xjy(AlwaysTrue.INSTANCE, true);
    }

    public static xiy<xii<? extends Notification<?>>, xii<?>> a(xiy<? super xii<? extends Void>, ? extends xii<?>> xiy) {
        return new f(xiy);
    }

    public static xiy<xii<? extends Notification<?>>, xii<?>> b(xiy<? super xii<? extends Throwable>, ? extends xii<?>> xiy) {
        return new g(xiy);
    }
}
