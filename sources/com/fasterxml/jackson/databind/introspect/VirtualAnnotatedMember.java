package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _declaringClass;
    protected final String _name;
    protected final JavaType _type;

    public Field getAnnotated() {
        return null;
    }

    public Member getMember() {
        return null;
    }

    public Annotated withAnnotations(AnnotationMap annotationMap) {
        return this;
    }

    public VirtualAnnotatedMember(TypeResolutionContext typeResolutionContext, Class<?> cls, String str, JavaType javaType) {
        super(typeResolutionContext, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    public JavaType getType() {
        return this._type;
    }

    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    public void setValue(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder("Cannot set virtual property '");
        sb.append(this._name);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }

    public Object getValue(Object obj) {
        StringBuilder sb = new StringBuilder("Cannot get virtual property '");
        sb.append(this._name);
        sb.append("'");
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[virtual ");
        sb.append(getFullName());
        sb.append("]");
        return sb.toString();
    }
}
