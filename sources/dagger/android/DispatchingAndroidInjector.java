package dagger.android;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class DispatchingAndroidInjector<T> implements vtk<T> {
    private final Map<String, wlc<a<?>>> a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public DispatchingAndroidInjector(Map<Class<?>, wlc<a<?>>> map, Map<String, wlc<a<?>>> map2) {
        this.a = a(map, map2);
    }

    private static <C, V> Map<String, wlc<a<?>>> a(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap b = vtx.b(map.size() + map2.size());
        b.putAll(map2);
        for (Entry entry : map.entrySet()) {
            b.put(((Class) entry.getKey()).getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(b);
    }

    private boolean b(T t) {
        wlc wlc = (wlc) this.a.get(t.getClass().getName());
        if (wlc == null) {
            return false;
        }
        a aVar = (a) wlc.get();
        try {
            ((vtk) vuf.a(aVar.a(t), "%s.create(I) should not return null.", aVar.getClass())).a(t);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{aVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    public final void a(T t) {
        if (!b(t)) {
            throw new IllegalArgumentException(c(t));
        }
    }

    private String c(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }
}
