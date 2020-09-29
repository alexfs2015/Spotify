package defpackage;

import dagger.android.DispatchingAndroidInjector;
import java.util.Map;

/* renamed from: whw reason: default package */
public final class whw<T> implements wig<DispatchingAndroidInjector<T>> {
    private final wzi<Map<Class<?>, wzi<a<?>>>> a;
    private final wzi<Map<String, wzi<a<?>>>> b;

    public static <T> DispatchingAndroidInjector<T> a(Map<Class<?>, wzi<a<?>>> map, Map<String, wzi<a<?>>> map2) {
        return new DispatchingAndroidInjector<>(map, map2);
    }

    public final /* synthetic */ Object get() {
        return new DispatchingAndroidInjector((Map) this.a.get(), (Map) this.b.get());
    }
}
