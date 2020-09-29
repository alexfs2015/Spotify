package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: wjq reason: default package */
public abstract class wjq {
    private static final wjq a = new wjj();
    private static final Object b = new Object();

    /* renamed from: wjq$a */
    static final class a extends wjq {
        private final Class<?> a;

        a(Class<?> cls) {
            this.a = cls;
        }

        public final boolean a(Object obj) {
            return this.a.isInstance(obj);
        }
    }

    public abstract boolean a(Object obj);

    public static wjq a(Class<?> cls) {
        wjc b2 = wjc.b();
        Map map = b2.i;
        if (map == null) {
            map = new IdentityHashMap();
            b2.i = map;
        }
        wjq wjq = (wjq) map.get(cls);
        if (wjq == null) {
            if (cls == Object.class) {
                wjq = a;
            } else if (PlatformDependent.i()) {
                try {
                    wjq = wjd.a(cls);
                    wjq.a(b);
                } catch (Exception | IllegalAccessError unused) {
                    wjq = null;
                }
            }
            if (wjq == null) {
                wjq = new a(cls);
            }
            map.put(cls, wjq);
        }
        return wjq;
    }

    public static wjq a(Object obj, Class<?> cls, String str) {
        wjc b2 = wjc.b();
        Map map = b2.j;
        if (map == null) {
            map = new IdentityHashMap();
            b2.j = map;
        }
        Class cls2 = obj.getClass();
        Map map2 = (Map) map.get(cls2);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(cls2, map2);
        }
        wjq wjq = (wjq) map2.get(str);
        if (wjq != null) {
            return wjq;
        }
        wjq a2 = a(b(obj, cls, str));
        map2.put(str, a2);
        return a2;
    }

    private static Class<?> b(Object obj, Class<?> cls, String str) {
        Class cls2 = obj.getClass();
        String str2 = str;
        Class<?> cls3 = cls;
        do {
            Class cls4 = cls2;
            while (cls4.getSuperclass() != cls3) {
                cls4 = cls4.getSuperclass();
                if (cls4 == null) {
                    return a(cls2, str2);
                }
            }
            int i = -1;
            TypeVariable[] typeParameters = cls4.getSuperclass().getTypeParameters();
            int i2 = 0;
            while (true) {
                if (i2 >= typeParameters.length) {
                    break;
                } else if (str2.equals(typeParameters[i2].getName())) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                Type genericSuperclass = cls4.getGenericSuperclass();
                if (!(genericSuperclass instanceof ParameterizedType)) {
                    return Object.class;
                }
                Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[i];
                if (type instanceof ParameterizedType) {
                    type = ((ParameterizedType) type).getRawType();
                }
                if (type instanceof Class) {
                    return (Class) type;
                }
                if (type instanceof GenericArrayType) {
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    if (genericComponentType instanceof ParameterizedType) {
                        genericComponentType = ((ParameterizedType) genericComponentType).getRawType();
                    }
                    if (genericComponentType instanceof Class) {
                        return Array.newInstance((Class) genericComponentType, 0).getClass();
                    }
                }
                if (!(type instanceof TypeVariable)) {
                    return a(cls2, str2);
                }
                TypeVariable typeVariable = (TypeVariable) type;
                if (!(typeVariable.getGenericDeclaration() instanceof Class)) {
                    return Object.class;
                }
                cls3 = (Class) typeVariable.getGenericDeclaration();
                str2 = typeVariable.getName();
            } else {
                StringBuilder sb = new StringBuilder("unknown type parameter '");
                sb.append(str2);
                sb.append("': ");
                sb.append(cls3);
                throw new IllegalStateException(sb.toString());
            }
        } while (cls3.isAssignableFrom(cls2));
        return Object.class;
    }

    private static Class<?> a(Class<?> cls, String str) {
        StringBuilder sb = new StringBuilder("cannot determine the type of the type parameter '");
        sb.append(str);
        sb.append("': ");
        sb.append(cls);
        throw new IllegalStateException(sb.toString());
    }

    protected wjq() {
    }
}
