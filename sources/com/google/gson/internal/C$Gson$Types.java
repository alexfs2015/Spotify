package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

/* renamed from: com.google.gson.internal.$Gson$Types reason: invalid class name */
public final class C$Gson$Types {
    static final Type[] a = new Type[0];

    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    static final class GenericArrayTypeImpl implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = C$Gson$Types.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C$Gson$Types.a((Type) this, (Type) (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C$Gson$Types.c(this.componentType));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    static final class ParameterizedTypeImpl implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                fjn.a(z);
            }
            this.ownerType = type == null ? null : C$Gson$Types.a(type);
            this.rawType = C$Gson$Types.a(type2);
            this.typeArguments = (Type[]) typeArr.clone();
            int length = this.typeArguments.length;
            for (int i = 0; i < length; i++) {
                fjn.a(this.typeArguments[i]);
                C$Gson$Types.e(this.typeArguments[i]);
                Type[] typeArr2 = this.typeArguments;
                typeArr2[i] = C$Gson$Types.a(typeArr2[i]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C$Gson$Types.a((Type) this, (Type) (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        public final Type getOwnerType() {
            return this.ownerType;
        }

        public final Type getRawType() {
            return this.rawType;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ C$Gson$Types.a((Object) this.ownerType);
        }

        public final String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return C$Gson$Types.c(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C$Gson$Types.c(this.rawType));
            sb.append("<");
            sb.append(C$Gson$Types.c(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C$Gson$Types.c(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    static final class WildcardTypeImpl implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            fjn.a(typeArr2.length <= 1);
            fjn.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                fjn.a(typeArr2[0]);
                C$Gson$Types.e(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    z = false;
                }
                fjn.a(z);
                this.lowerBound = C$Gson$Types.a(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            fjn.a(typeArr[0]);
            C$Gson$Types.e(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = C$Gson$Types.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C$Gson$Types.a((Type) this, (Type) (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.lowerBound;
            if (type == null) {
                return C$Gson$Types.a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public final int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public final String toString() {
            if (this.lowerBound != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C$Gson$Types.c(this.lowerBound));
                return sb.toString();
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C$Gson$Types.c(this.upperBound));
                return sb2.toString();
            }
        }
    }

    static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type a(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r0 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = a(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl r0 = new com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl r0 = new com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r0 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.a(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static Type a(Type type, Class<?> cls) {
        Type b = b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        return b instanceof ParameterizedType ? ((ParameterizedType) b).getActualTypeArguments()[0] : Object.class;
    }

    private static Type a(Type type, Class<?> cls, Class<?> cls2) {
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

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 == 0) goto L_0x0049
            java.lang.reflect.Type r2 = a(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0049
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002d:
            if (r1 >= r3) goto L_0x0043
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0040
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004a
        L_0x0040:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0043:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x0049:
            r10 = r0
        L_0x004a:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004d:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006a
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006a
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = a(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0065
            return r0
        L_0x0065:
            java.lang.reflect.GenericArrayType r8 = f(r8)
            return r8
        L_0x006a:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0080
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = a(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007b
            return r10
        L_0x007b:
            java.lang.reflect.GenericArrayType r8 = f(r8)
            return r8
        L_0x0080:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c1
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = a(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0093
            r0 = 1
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0099:
            if (r1 >= r5) goto L_0x00b4
            r6 = r4[r1]
            java.lang.reflect.Type r6 = a(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b1
            if (r0 != 0) goto L_0x00af
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00af:
            r4[r1] = r6
        L_0x00b1:
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00b4:
            if (r0 == 0) goto L_0x00c0
            java.lang.reflect.Type r8 = r10.getRawType()
            com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl r9 = new com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl
            r9.<init>(r3, r8, r4)
            return r9
        L_0x00c0:
            return r10
        L_0x00c1:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x011d
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00f8
            r3 = r0[r1]
            java.lang.reflect.Type r8 = a(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x011d
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e7
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ec
        L_0x00e7:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ec:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r9 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00f8:
            int r0 = r3.length
            if (r0 != r2) goto L_0x011d
            r0 = r3[r1]
            java.lang.reflect.Type r8 = a(r8, r9, r0, r11)     // Catch:{ all -> 0x011e }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x011d
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0110
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0115
        L_0x0110:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0115:
            com.google.gson.internal.$Gson$Types$WildcardTypeImpl r9 = new com.google.gson.internal.$Gson$Types$WildcardTypeImpl
            java.lang.reflect.Type[] r10 = a
            r9.<init>(r8, r10)
            return r9
        L_0x011d:
            return r10
        L_0x011e:
            r8 = move-exception
            goto L_0x0121
        L_0x0120:
            throw r8
        L_0x0121:
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    public static boolean a(Type type, Type type2) {
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

    public static Class<?> b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                fjn.a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    String name = type == null ? "null" : type.getClass().getName();
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return (Class) type;
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        fjn.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    static void e(Type type) {
        fjn.a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    private static GenericArrayType f(Type type) {
        return new GenericArrayTypeImpl(type);
    }
}
