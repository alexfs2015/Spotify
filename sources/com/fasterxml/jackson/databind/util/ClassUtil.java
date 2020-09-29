package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ClassUtil {
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Iterator<?> EMPTY_ITERATOR = Collections.emptyIterator();
    private static final Annotation[] NO_ANNOTATIONS = new Annotation[0];
    private static final Ctor[] NO_CTORS = new Ctor[0];

    public static final class Ctor {
        public final Constructor<?> _ctor;
        private Annotation[][] _paramAnnotations;
        private int _paramCount = -1;

        public Ctor(Constructor<?> constructor) {
            this._ctor = constructor;
        }

        public final Constructor<?> getConstructor() {
            return this._ctor;
        }

        public final int getParamCount() {
            int i = this._paramCount;
            if (i >= 0) {
                return i;
            }
            int length = this._ctor.getParameterTypes().length;
            this._paramCount = length;
            return length;
        }

        public final Class<?> getDeclaringClass() {
            return this._ctor.getDeclaringClass();
        }

        public final Annotation[][] getParameterAnnotations() {
            Annotation[][] annotationArr = this._paramAnnotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this._ctor.getParameterAnnotations();
            this._paramAnnotations = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    static class EnumTypeLocator {
        static final EnumTypeLocator instance = new EnumTypeLocator();
        private final Field enumMapTypeField;
        private final Field enumSetTypeField;

        private EnumTypeLocator() {
            String str = "elementType";
            this.enumSetTypeField = locateField(EnumSet.class, str, Class.class);
            this.enumMapTypeField = locateField(EnumMap.class, str, Class.class);
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumSet<?> enumSet) {
            Field field = this.enumSetTypeField;
            if (field != null) {
                return (Class) get(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumMap<?, ?> enumMap) {
            Field field = this.enumMapTypeField;
            if (field != null) {
                return (Class) get(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }

        private Object get(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }

        private static Field locateField(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] declaredFields = ClassUtil.getDeclaredFields(cls);
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }
    }

    public static <T> T nonNull(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String nonNullString(String str) {
        return str == null ? "" : str;
    }

    public static <T> Iterator<T> emptyIterator() {
        return EMPTY_ITERATOR;
    }

    public static List<JavaType> findSuperTypes(JavaType javaType, Class<?> cls, boolean z) {
        if (javaType == null || javaType.hasRawClass(cls) || javaType.hasRawClass(Object.class)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        _addSuperTypes(javaType, cls, arrayList, z);
        return arrayList;
    }

    public static List<Class<?>> findRawSuperTypes(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        _addRawSuperTypes(cls, cls2, arrayList, z);
        return arrayList;
    }

    public static List<Class<?>> findSuperClasses(Class<?> cls, Class<?> cls2, boolean z) {
        LinkedList linkedList = new LinkedList();
        if (cls != null && cls != cls2) {
            if (z) {
                linkedList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                linkedList.add(cls);
            }
        }
        return linkedList;
    }

    private static void _addSuperTypes(JavaType javaType, Class<?> cls, Collection<JavaType> collection, boolean z) {
        while (javaType != null) {
            Class<Object> rawClass = javaType.getRawClass();
            if (rawClass != cls && rawClass != Object.class) {
                if (z) {
                    if (!collection.contains(javaType)) {
                        collection.add(javaType);
                    } else {
                        return;
                    }
                }
                for (JavaType _addSuperTypes : javaType.getInterfaces()) {
                    _addSuperTypes(_addSuperTypes, cls, collection, true);
                }
                javaType = javaType.getSuperClass();
                z = true;
            } else {
                return;
            }
        }
    }

    private static void _addRawSuperTypes(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        while (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class _addRawSuperTypes : _interfaces(cls)) {
                _addRawSuperTypes(_addRawSuperTypes, cls2, collection, true);
            }
            cls = cls.getSuperclass();
            z = true;
        }
    }

    public static String canBeABeanType(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static String isLocalType(Class<?> cls, boolean z) {
        try {
            if (hasEnclosingMethod(cls)) {
                return "local/anonymous";
            }
            if (!z && !Modifier.isStatic(cls.getModifiers()) && getEnclosingClass(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    public static Class<?> getOuterClass(Class<?> cls) {
        try {
            if (!hasEnclosingMethod(cls) && !Modifier.isStatic(cls.getModifiers())) {
                return getEnclosingClass(cls);
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public static boolean isProxyType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static boolean isConcrete(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean isBogusClass(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == NoClass.class;
    }

    public static boolean isNonStaticInnerClass(Class<?> cls) {
        return !Modifier.isStatic(cls.getModifiers()) && getEnclosingClass(cls) != null;
    }

    public static boolean isObjectOrPrimitive(Class<?> cls) {
        return cls == CLS_OBJECT || cls.isPrimitive();
    }

    public static boolean hasClass(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static void verifyMustOverride(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[]{obj.getClass().getName(), cls.getName(), str}));
        }
    }

    public static Throwable throwIfError(Throwable th) {
        if (!(th instanceof Error)) {
            return th;
        }
        throw ((Error) th);
    }

    public static Throwable throwIfRTE(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        throw ((RuntimeException) th);
    }

    public static Throwable throwIfIOE(Throwable th) {
        if (!(th instanceof IOException)) {
            return th;
        }
        throw ((IOException) th);
    }

    public static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static Throwable throwRootCauseIfIOE(Throwable th) {
        return throwIfIOE(getRootCause(th));
    }

    public static void throwAsIAE(Throwable th) {
        throwAsIAE(th, th.getMessage());
    }

    public static void throwAsIAE(Throwable th, String str) {
        throwIfRTE(th);
        throwIfError(th);
        throw new IllegalArgumentException(str, th);
    }

    public static <T> T throwAsMappingException(DeserializationContext deserializationContext, IOException iOException) {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException from = JsonMappingException.from(deserializationContext, iOException.getMessage());
        from.initCause(iOException);
        throw from;
    }

    public static void unwrapAndThrowAsIAE(Throwable th) {
        throwAsIAE(getRootCause(th));
    }

    public static void unwrapAndThrowAsIAE(Throwable th, String str) {
        throwAsIAE(getRootCause(th), str);
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Exception exc) {
        jsonGenerator.disable(Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception unused) {
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) {
        if (jsonGenerator != null) {
            jsonGenerator.disable(Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception unused) {
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused2) {
            }
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T createInstance(Class<T> cls, boolean z) {
        Constructor findConstructor = findConstructor(cls, z);
        if (findConstructor != null) {
            try {
                return findConstructor.newInstance(new Object[0]);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Failed to instantiate class ");
                sb.append(cls.getName());
                sb.append(", problem: ");
                sb.append(e.getMessage());
                unwrapAndThrowAsIAE(e, sb.toString());
                return null;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append(cls.getName());
            sb2.append(" has no default (no arg) constructor");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                checkAndFixAccess(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                StringBuilder sb = new StringBuilder("Default constructor for ");
                sb.append(cls.getName());
                sb.append(" is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
                throw new IllegalArgumentException(sb.toString());
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Failed to find default constructor of class ");
            sb2.append(cls.getName());
            sb2.append(", problem: ");
            sb2.append(e.getMessage());
            unwrapAndThrowAsIAE(e, sb2.toString());
            return null;
        }
    }

    public static Class<?> classOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static Class<?> rawClass(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static String nullOrToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static String quotedOr(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return String.format("\"%s\"", new Object[]{obj});
    }

    public static String classNameOf(Object obj) {
        return obj == null ? "[null]" : nameOf(obj.getClass());
    }

    public static String nameOf(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return backticked(simpleName);
    }

    public static String nameOf(Named named) {
        return named == null ? "[null]" : backticked(named.getName());
    }

    public static String backticked(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.valueOf(0);
        }
        if (cls == Long.TYPE) {
            return Long.valueOf(0);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return Byte.valueOf(0);
        }
        if (cls == Short.TYPE) {
            return Short.valueOf(0);
        }
        if (cls == Character.TYPE) {
            return Character.valueOf(0);
        }
        StringBuilder sb = new StringBuilder("Class ");
        sb.append(cls.getName());
        sb.append(" is not a primitive type");
        throw new IllegalArgumentException(sb.toString());
    }

    public static Class<?> wrapperType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        StringBuilder sb = new StringBuilder("Class ");
        sb.append(cls.getName());
        sb.append(" is not a primitive type");
        throw new IllegalArgumentException(sb.toString());
    }

    public static Class<?> primitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (java.lang.reflect.Modifier.isPublic(r4.getDeclaringClass().getModifiers()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void checkAndFixAccess(java.lang.reflect.Member r4, boolean r5) {
        /*
            r0 = r4
            java.lang.reflect.AccessibleObject r0 = (java.lang.reflect.AccessibleObject) r0
            if (r5 != 0) goto L_0x001d
            int r5 = r4.getModifiers()     // Catch:{ SecurityException -> 0x0022 }
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)     // Catch:{ SecurityException -> 0x0022 }
            if (r5 == 0) goto L_0x001d
            java.lang.Class r5 = r4.getDeclaringClass()     // Catch:{ SecurityException -> 0x0022 }
            int r5 = r5.getModifiers()     // Catch:{ SecurityException -> 0x0022 }
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)     // Catch:{ SecurityException -> 0x0022 }
            if (r5 != 0) goto L_0x0021
        L_0x001d:
            r5 = 1
            r0.setAccessible(r5)     // Catch:{ SecurityException -> 0x0022 }
        L_0x0021:
            return
        L_0x0022:
            r5 = move-exception
            boolean r0 = r0.isAccessible()
            if (r0 == 0) goto L_0x002a
            return
        L_0x002a:
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot access "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = " (from class "
            r2.append(r4)
            java.lang.String r4 = r0.getName()
            r2.append(r4)
            java.lang.String r4 = "; failed to set access: "
            r2.append(r4)
            java.lang.String r4 = r5.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean):void");
    }

    public static Class<? extends Enum<?>> findEnumType(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return findEnumType((Enum) enumSet.iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumSet);
    }

    public static Class<? extends Enum<?>> findEnumType(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return findEnumType((Enum) enumMap.keySet().iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumMap);
    }

    public static Class<? extends Enum<?>> findEnumType(Enum<?> enumR) {
        Class<? extends Enum<?>> cls = enumR.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static Class<? extends Enum<?>> findEnumType(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static <T extends Annotation> Enum<?> findFirstAnnotatedEnumValue(Class<Enum<?>> cls, Class<T> cls2) {
        Field[] declaredFields;
        Enum<?>[] enumArr;
        for (Field field : getDeclaredFields(cls)) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> enumR : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(enumR.name())) {
                        return enumR;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return obj == null || isJacksonStdImpl(obj.getClass());
    }

    public static boolean isJacksonStdImpl(Class<?> cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static String getPackageName(Class<?> cls) {
        Package packageR = cls.getPackage();
        if (packageR == null) {
            return null;
        }
        return packageR.getName();
    }

    public static boolean hasEnclosingMethod(Class<?> cls) {
        return !isObjectOrPrimitive(cls) && cls.getEnclosingMethod() != null;
    }

    public static Field[] getDeclaredFields(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Annotation[] findClassAnnotations(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return NO_ANNOTATIONS;
        }
        return cls.getDeclaredAnnotations();
    }

    public static Method[] getClassMethods(Class<?> cls) {
        try {
            return getDeclaredMethods(cls);
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            } else {
                throw e;
            }
        }
    }

    public static Ctor[] getConstructors(Class<?> cls) {
        if (cls.isInterface() || isObjectOrPrimitive(cls)) {
            return NO_CTORS;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        Ctor[] ctorArr = new Ctor[length];
        for (int i = 0; i < length; i++) {
            ctorArr[i] = new Ctor(declaredConstructors[i]);
        }
        return ctorArr;
    }

    public static Type getGenericSuperclass(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Type[] getGenericInterfaces(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    private static Class<?>[] _interfaces(Class<?> cls) {
        return cls.getInterfaces();
    }
}
