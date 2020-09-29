package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public final class AnnotatedField extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Field _field;
    protected Serialization _serialization;

    static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Field field) {
            this.clazz = field.getDeclaringClass();
            this.name = field.getName();
        }
    }

    protected AnnotatedField(Serialization serialization) {
        super(null, null);
        this._field = null;
        this._serialization = serialization;
    }

    public AnnotatedField(TypeResolutionContext typeResolutionContext, Field field, AnnotationMap annotationMap) {
        super(typeResolutionContext, annotationMap);
        this._field = field;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, getClass()) && ((AnnotatedField) obj)._field == this._field;
    }

    public final Field getAnnotated() {
        return this._field;
    }

    public final Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    public final Member getMember() {
        return this._field;
    }

    public final int getModifiers() {
        return this._field.getModifiers();
    }

    public final String getName() {
        return this._field.getName();
    }

    public final Class<?> getRawType() {
        return this._field.getType();
    }

    public final JavaType getType() {
        return this._typeContext.resolveType(this._field.getGenericType());
    }

    public final Object getValue(Object obj) {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Failed to getValue() for field ");
            sb.append(getFullName());
            sb.append(": ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final int hashCode() {
        return this._field.getName().hashCode();
    }

    public final boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    /* access modifiers changed from: 0000 */
    public final Object readResolve() {
        Class<?> cls = this._serialization.clazz;
        try {
            Field declaredField = cls.getDeclaredField(this._serialization.name);
            if (!declaredField.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
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
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Failed to setValue() for field ");
            sb.append(getFullName());
            sb.append(": ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[field ");
        sb.append(getFullName());
        sb.append("]");
        return sb.toString();
    }

    public final AnnotatedField withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedField(this._typeContext, this._field, annotationMap);
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new AnnotatedField(new Serialization(this._field));
    }
}
