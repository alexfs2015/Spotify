package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: xgr reason: default package */
public final class xgr {
    static final Type[] a = new Type[0];

    /* renamed from: xgr$a */
    static final class a implements GenericArrayType {
        private final Type a;

        a(Type type) {
            this.a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && xgr.a((Type) this, (Type) (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(xgr.b(this.a));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: xgr$b */
    static final class b implements ParameterizedType {
        private final Type a;
        private final Type b;
        private final Type[] c;

        b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                boolean z = true;
                boolean z2 = type == null;
                if (((Class) type2).getEnclosingClass() != null) {
                    z = false;
                }
                if (z2 != z) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                xgr.a(type3, "typeArgument == null");
                xgr.c(type3);
            }
            this.a = type;
            this.b = type2;
            this.c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && xgr.a((Type) this, (Type) (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        public final Type getOwnerType() {
            return this.a;
        }

        public final Type getRawType() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
            Type type = this.a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.c;
            if (typeArr.length == 0) {
                return xgr.b(this.b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(xgr.b(this.b));
            sb.append("<");
            sb.append(xgr.b(this.c[0]));
            for (int i = 1; i < this.c.length; i++) {
                sb.append(", ");
                sb.append(xgr.b(this.c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: xgr$c */
    static final class c implements WildcardType {
        private final Type a;
        private final Type b;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    xgr.c(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.b = typeArr2[0];
                        this.a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                xgr.c(typeArr[0]);
                this.b = null;
                this.a = typeArr[0];
            } else {
                throw new NullPointerException();
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && xgr.a((Type) this, (Type) (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.b;
            if (type == null) {
                return xgr.a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public final int hashCode() {
            Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
        }

        public final String toString() {
            if (this.b != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(xgr.b(this.b));
                return sb.toString();
            } else if (this.a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(xgr.b(this.a));
                return sb2.toString();
            }
        }
    }

    public static Class<?> a(Type type) {
        while (true) {
            a((T) type, "type == null");
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(type.getClass().getName());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static RuntimeException a(Method method, int i, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(i + 1);
        sb.append(")");
        return a(method, (Throwable) null, sb.toString(), objArr);
    }

    static RuntimeException a(Method method, String str, Object... objArr) {
        return a(method, (Throwable) null, str, objArr);
    }

    static RuntimeException a(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(i + 1);
        sb.append(")");
        return a(method, th, sb.toString(), objArr);
    }

    static RuntimeException a(Method method, Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append("\n    for method ");
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        return new IllegalArgumentException(sb.toString(), th);
    }

    public static Type a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new IllegalArgumentException(sb.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return a(type, cls, b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[LOOP:0: B:0:0x0000->B:21:0x0042, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0041 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x003e
            java.lang.reflect.Type r2 = b(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003e
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0021:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0038
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x003f
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0038:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003e:
            r0 = r10
        L_0x003f:
            if (r0 != r10) goto L_0x0042
            return r0
        L_0x0042:
            r10 = r0
            goto L_0x0000
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0062
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0062
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = a(r8, r9, r10)
            if (r10 != r8) goto L_0x005c
            return r0
        L_0x005c:
            xgr$a r9 = new xgr$a
            r9.<init>(r8)
            return r9
        L_0x0062:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0079
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = a(r8, r9, r0)
            if (r0 != r8) goto L_0x0073
            return r10
        L_0x0073:
            xgr$a r9 = new xgr$a
            r9.<init>(r8)
            return r9
        L_0x0079:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00ba
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = a(r8, r9, r0)
            if (r3 == r0) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0092:
            if (r1 >= r5) goto L_0x00ad
            r6 = r4[r1]
            java.lang.reflect.Type r6 = a(r8, r9, r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00aa
            if (r0 != 0) goto L_0x00a8
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00a8:
            r4[r1] = r6
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x0092
        L_0x00ad:
            if (r0 == 0) goto L_0x00b9
            xgr$b r8 = new xgr$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            return r8
        L_0x00b9:
            return r10
        L_0x00ba:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00fe
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e5
            r3 = r0[r1]
            java.lang.reflect.Type r8 = a(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x00fe
            xgr$c r9 = new xgr$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e5:
            int r0 = r3.length
            if (r0 != r2) goto L_0x00fe
            r0 = r3[r1]
            java.lang.reflect.Type r8 = a(r8, r9, r0)     // Catch:{ all -> 0x00ff }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x00fe
            xgr$c r9 = new xgr$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = a
            r9.<init>(r10, r8)
            return r9
        L_0x00fe:
            return r10
        L_0x00ff:
            r8 = move-exception
            goto L_0x0102
        L_0x0101:
            throw r8
        L_0x0102:
            goto L_0x0101
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgr.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    static xam a(xam xam) {
        xcq xcq = new xcq();
        xam.c().a((xdf) xcq);
        return xam.a(xam.a(), xam.b(), xcq);
    }

    static <T> void a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    static void a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static boolean a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                GenericArrayType genericArrayType = (GenericArrayType) type2;
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = genericArrayType.getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    static boolean a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    static String b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        Type type2;
        Class<?> cls3;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int i = 0;
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (interfaces[i] == cls2) {
                        return cls.getGenericInterfaces()[i];
                    } else {
                        if (cls2.isAssignableFrom(interfaces[i])) {
                            type2 = cls.getGenericInterfaces()[i];
                            cls3 = interfaces[i];
                            break;
                        }
                        i++;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    cls3 = cls.getSuperclass();
                    if (cls3 == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        type2 = cls.getGenericSuperclass();
                        Type type3 = type2;
                        cls = cls3;
                        type = type3;
                    } else {
                        cls = cls3;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean d(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type d : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (d(d)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                String name = type == null ? "null" : type.getClass().getName();
                StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return false;
    }

    static Type e(Type type) {
        if (type instanceof ParameterizedType) {
            return a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
