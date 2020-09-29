package defpackage;

import dagger.android.DispatchingAndroidInjector;
import java.util.Map;

/* renamed from: vtq reason: default package */
public final class vtq<T> implements vua<DispatchingAndroidInjector<T>> {
    private final wlc<Map<Class<?>, wlc<a<?>>>> a;
    private final wlc<Map<String, wlc<a<?>>>> b;

    public static <T> DispatchingAndroidInjector<T> a(Map<Class<?>, wlc<a<?>>> map, Map<String, wlc<a<?>>> map2) {
        return new DispatchingAndroidInjector<>(map, map2);
    }

    public final /* synthetic */ Object get() {
        return new DispatchingAndroidInjector((Map) this.a.get(), (Map) this.b.get());
    }
}
