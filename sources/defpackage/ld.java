package defpackage;

import androidx.lifecycle.Lifecycle.Event;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ld reason: default package */
public final class ld {
    public static ld a = new ld();
    private final Map<Class, a> b = new HashMap();
    private final Map<Class, Boolean> c = new HashMap();

    /* renamed from: ld$a */
    public static class a {
        public final Map<Event, List<b>> a = new HashMap();
        final Map<b, Event> b;

        a(Map<b, Event> map) {
            this.b = map;
            for (Entry entry : map.entrySet()) {
                Event event = (Event) entry.getValue();
                List list = (List) this.a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(event, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, lm lmVar, Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(lmVar, event, obj);
                }
            }
        }
    }

    /* renamed from: ld$b */
    static class b {
        final Method a;
        private int b;

        b(int i, Method method) {
            this.b = i;
            this.a = method;
            this.a.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        public final void a(lm lmVar, Event event, Object obj) {
            try {
                int i = this.b;
                if (i == 0) {
                    this.a.invoke(obj, new Object[0]);
                } else if (i != 1) {
                    if (i == 2) {
                        this.a.invoke(obj, new Object[]{lmVar, event});
                    }
                } else {
                    this.a.invoke(obj, new Object[]{lmVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.a.getName().equals(bVar.a.getName());
            }
        }

        public final int hashCode() {
            return (this.b * 31) + this.a.getName().hashCode();
        }
    }

    ld() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            a b2 = b(superclass);
            if (b2 != null) {
                hashMap.putAll(b2.b);
            }
        }
        for (Class b3 : cls.getInterfaces()) {
            for (Entry entry : b(b3).b.entrySet()) {
                a(hashMap, (b) entry.getKey(), (Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            lu luVar = (lu) method.getAnnotation(lu.class);
            if (luVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(lm.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Event a2 = luVar.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a2 == Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.b.put(cls, aVar);
        this.c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private static void a(Map<b, Event> map, b bVar, Event event, Class cls) {
        Event event2 = (Event) map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.a;
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(event2);
            sb.append(", new value ");
            sb.append(event);
            throw new IllegalArgumentException(sb.toString());
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }

    private static Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Class cls) {
        Boolean bool = (Boolean) this.c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method annotation : c2) {
            if (((lu) annotation.getAnnotation(lu.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.c.put(cls, Boolean.FALSE);
        return false;
    }

    public final a b(Class cls) {
        a aVar = (a) this.b.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }
}
