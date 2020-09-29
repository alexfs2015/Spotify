package rx.internal.util;

import java.util.List;
import rx.Notification;
import rx.exceptions.OnErrorNotImplementedException;

public enum InternalObservableUtils {
    ;
    
    static final h a = null;
    static final b b = null;

    static final class a implements wun<Throwable> {
        a() {
        }

        public final /* synthetic */ void call(Object obj) {
            throw new OnErrorNotImplementedException((Throwable) obj);
        }
    }

    static final class b implements wut<Notification<?>, Throwable> {
        b() {
        }

        public final /* bridge */ /* synthetic */ Object call(Object obj) {
            return ((Notification) obj).b;
        }
    }

    public static final class c implements wuu<Object, Object, Boolean> {
        c() {
        }

        public final /* synthetic */ Object call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    public static final class d implements wuu<Integer, Object, Integer> {
        d() {
        }

        public final /* synthetic */ Object call(Object obj, Object obj2) {
            return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }

    public static final class e implements wuu<Long, Object, Long> {
        e() {
        }

        public final /* synthetic */ Object call(Object obj, Object obj2) {
            return Long.valueOf(((Long) obj).longValue() + 1);
        }
    }

    static final class f implements wut<wud<? extends Notification<?>>, wud<?>> {
        private wut<? super wud<? extends Void>, ? extends wud<?>> a;

        public final /* synthetic */ Object call(Object obj) {
            return (wud) this.a.call(((wud) obj).f(InternalObservableUtils.a));
        }

        public f(wut<? super wud<? extends Void>, ? extends wud<?>> wut) {
            this.a = wut;
        }
    }

    static final class g implements wut<wud<? extends Notification<?>>, wud<?>> {
        private wut<? super wud<? extends Throwable>, ? extends wud<?>> a;

        public final /* synthetic */ Object call(Object obj) {
            return (wud) this.a.call(((wud) obj).f(InternalObservableUtils.b));
        }

        public g(wut<? super wud<? extends Throwable>, ? extends wud<?>> wut) {
            this.a = wut;
        }
    }

    static final class h implements wut<Object, Void> {
        public final /* bridge */ /* synthetic */ Object call(Object obj) {
            return null;
        }

        h() {
        }
    }

    public static final class i implements wut<List<? extends wud<?>>, wud<?>[]> {
        i() {
        }

        public final /* synthetic */ Object call(Object obj) {
            List list = (List) obj;
            return (wud[]) list.toArray(new wud[list.size()]);
        }
    }

    static {
        new e();
        new c();
        new i();
        a = new h();
        new d();
        b = new b();
        new a();
        new wvt(AlwaysTrue.INSTANCE, true);
    }

    public static wut<wud<? extends Notification<?>>, wud<?>> a(wut<? super wud<? extends Void>, ? extends wud<?>> wut) {
        return new f(wut);
    }

    public static wut<wud<? extends Notification<?>>, wud<?>> b(wut<? super wud<? extends Throwable>, ? extends wud<?>> wut) {
        return new g(wut);
    }
}
