package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: fiu reason: default package */
public final class fiu {
    private final Map<Type, fie<?>> a;
    private final fjs b = fjs.a();

    public fiu(Map<Type, fie<?>> map) {
        this.a = map;
    }

    private <T> fiy<T> a(Class<? super T> cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            return new fiy<T>() {
                public final T a() {
                    String str = " with no args";
                    String str2 = "Failed to invoke ";
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (InstantiationException e) {
                        StringBuilder sb = new StringBuilder(str2);
                        sb.append(declaredConstructor);
                        sb.append(str);
                        throw new RuntimeException(sb.toString(), e);
                    } catch (InvocationTargetException e2) {
                        StringBuilder sb2 = new StringBuilder(str2);
                        sb2.append(declaredConstructor);
                        sb2.append(str);
                        throw new RuntimeException(sb2.toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    public final <T> fiy<T> a(fju<T> fju) {
        final Type type = fju.b;
        final Class<? super T> cls = fju.a;
        final fie fie = (fie) this.a.get(type);
        if (fie != null) {
            return new fiy<T>() {
                public final T a() {
                    return fie.a();
                }
            };
        }
        final fie fie2 = (fie) this.a.get(cls);
        if (fie2 != null) {
            return new fiy<T>() {
                public final T a() {
                    return fie2.a();
                }
            };
        }
        fiy<T> a2 = a(cls);
        if (a2 != null) {
            return a2;
        }
        fiy<T> fiy = Collection.class.isAssignableFrom(cls) ? SortedSet.class.isAssignableFrom(cls) ? new fiy<T>() {
            public final T a() {
                return new TreeSet();
            }
        } : EnumSet.class.isAssignableFrom(cls) ? new fiy<T>() {
            public final T a() {
                Type type = type;
                String str = "Invalid EnumSet type: ";
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(type.toString());
                    throw new JsonIOException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(type.toString());
                throw new JsonIOException(sb2.toString());
            }
        } : Set.class.isAssignableFrom(cls) ? new fiy<T>() {
            public final T a() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(cls) ? new fiy<T>() {
            public final T a() {
                return new ArrayDeque();
            }
        } : new fiy<T>() {
            public final T a() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(cls) ? ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new fiy<T>() {
            public final T a() {
                return new ConcurrentSkipListMap();
            }
        } : ConcurrentMap.class.isAssignableFrom(cls) ? new fiy<T>() {
            public final T a() {
                return new ConcurrentHashMap();
            }
        } : SortedMap.class.isAssignableFrom(cls) ? new fiy<T>() {
            public final T a() {
                return new TreeMap();
            }
        } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(fju.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new fiy<T>() {
            public final T a() {
                return new LinkedTreeMap();
            }
        } : new fiy<T>() {
            public final T a() {
                return new LinkedHashMap();
            }
        } : null;
        return fiy != null ? fiy : new fiy<T>() {
            private final fjb a = fjb.a();

            public final T a() {
                try {
                    return this.a.a(cls);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(type);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        };
    }
}
