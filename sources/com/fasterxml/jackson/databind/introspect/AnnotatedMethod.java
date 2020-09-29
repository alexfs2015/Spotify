package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected Serialization _serialization;

    static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?>[] args;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }

    protected AnnotatedMethod(Serialization serialization) {
        super(null, null, null);
        this._method = null;
        this._serialization = serialization;
    }

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method != null) {
            this._method = method;
            return;
        }
        throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
    }

    public final Object call() {
        return this._method.invoke(null, new Object[0]);
    }

    public final Object call(Object[] objArr) {
        return this._method.invoke(null, objArr);
    }

    public final Object call1(Object obj) {
        return this._method.invoke(null, new Object[]{obj});
    }

    public final Object callOnWith(Object obj, Object... objArr) {
        return this._method.invoke(obj, objArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, getClass()) && ((AnnotatedMethod) obj)._method == this._method;
    }

    public final Method getAnnotated() {
        return this._method;
    }

    public final Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    public final String getFullName() {
        return String.format("%s(%d params)", new Object[]{super.getFullName(), Integer.valueOf(getParameterCount())});
    }

    public final Method getMember() {
        return this._method;
    }

    public final String getName() {
        return this._method.getName();
    }

    public final int getParameterCount() {
        return getRawParameterTypes().length;
    }

    public final JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i]);
    }

    public final Class<?> getRawParameterType(int i) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i];
    }

    public final Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public final Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    public final Class<?> getRawType() {
        return this._method.getReturnType();
    }

    public final JavaType getType() {
        return this._typeContext.resolveType(this._method.getGenericReturnType());
    }

    public final Object getValue(Object obj) {
        try {
            return this._method.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder sb = new StringBuilder("Failed to getValue() with method ");
            sb.append(getFullName());
            sb.append(": ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final boolean hasReturnType() {
        Class<Void> rawReturnType = getRawReturnType();
        return (rawReturnType == Void.TYPE || rawReturnType == Void.class) ? false : true;
    }

    public final int hashCode() {
        return this._method.getName().hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final Object readResolve() {
        Class<?> cls = this._serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(this._serialization.name, this._serialization.args);
            if (!declaredMethod.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder("Could not find method '");
            sb.append(this._serialization.name);
            sb.append("' from Class '");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void setValue(Object obj, Object obj2) {
        try {
            this._method.invoke(obj, new Object[]{obj2});
        } catch (IllegalAccessException | InvocationTargetException e) {
            StringBuilder sb = new StringBuilder("Failed to setValue() with method ");
            sb.append(getFullName());
            sb.append(": ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[method ");
        sb.append(getFullName());
        sb.append("]");
        return sb.toString();
    }

    public final AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._typeContext, this._method, annotationMap, this._paramAnnotations);
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }
}
