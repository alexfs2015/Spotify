package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls) {
        this(cls, null);
    }

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode();
        setName(str);
    }

    public final Class<?> getType() {
        return this._class;
    }

    public final String getName() {
        return this._name;
    }

    public final void setName(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this._name = str;
    }

    public final boolean hasName() {
        return this._name != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == getClass() && this._class == ((NamedType) obj)._class;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[NamedType, class ");
        sb.append(this._class.getName());
        sb.append(", name: ");
        if (this._name == null) {
            str = "null";
        } else {
            String str2 = "'";
            StringBuilder sb2 = new StringBuilder(str2);
            sb2.append(this._name);
            sb2.append(str2);
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
