package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;

public class TypeKey {
    protected Class<?> _class;
    protected int _hashCode;
    protected boolean _isTyped;
    protected JavaType _type;

    public TypeKey() {
    }

    public TypeKey(Class<?> cls, boolean z) {
        this._class = cls;
        this._type = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(cls) : untypedHash(cls);
    }

    public TypeKey(JavaType javaType, boolean z) {
        this._type = javaType;
        this._class = null;
        this._isTyped = z;
        this._hashCode = z ? typedHash(javaType) : untypedHash(javaType);
    }

    public static final int untypedHash(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public static final int typedHash(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int untypedHash(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    public static final int typedHash(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    public boolean isTyped() {
        return this._isTyped;
    }

    public Class<?> getRawType() {
        return this._class;
    }

    public JavaType getType() {
        return this._type;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public final String toString() {
        String str = "}";
        String str2 = ", typed? ";
        if (this._class != null) {
            StringBuilder sb = new StringBuilder("{class: ");
            sb.append(this._class.getName());
            sb.append(str2);
            sb.append(this._isTyped);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("{type: ");
        sb2.append(this._type);
        sb2.append(str2);
        sb2.append(this._isTyped);
        sb2.append(str);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        TypeKey typeKey = (TypeKey) obj;
        if (typeKey._isTyped != this._isTyped) {
            return false;
        }
        Class<?> cls = this._class;
        if (cls != null) {
            return typeKey._class == cls;
        }
        return this._type.equals(typeKey._type);
    }
}
