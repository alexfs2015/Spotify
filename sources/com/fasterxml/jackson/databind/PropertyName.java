package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

public class PropertyName implements Serializable {
    public static final PropertyName NO_NAME;
    public static final PropertyName USE_DEFAULT;
    private static final long serialVersionUID = 1;
    protected SerializableString _encodedSimple;
    protected final String _namespace;
    protected final String _simpleName;

    static {
        String str = "";
        USE_DEFAULT = new PropertyName(str, null);
        NO_NAME = new PropertyName(new String(str), null);
    }

    public PropertyName(String str) {
        this(str, null);
    }

    public PropertyName(String str, String str2) {
        this._simpleName = ClassUtil.nonNullString(str);
        this._namespace = str2;
    }

    public static PropertyName construct(String str) {
        return (str == null || str.length() == 0) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), null);
    }

    public static PropertyName construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.length() == 0) ? USE_DEFAULT : new PropertyName(InternCache.instance.intern(str), str2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        if (str == null) {
            if (propertyName._simpleName != null) {
                return false;
            }
        } else if (!str.equals(propertyName._simpleName)) {
            return false;
        }
        String str2 = this._namespace;
        return str2 == null ? propertyName._namespace == null : str2.equals(propertyName._namespace);
    }

    public String getSimpleName() {
        return this._simpleName;
    }

    public boolean hasNamespace() {
        return this._namespace != null;
    }

    public boolean hasSimpleName() {
        return this._simpleName.length() > 0;
    }

    public boolean hasSimpleName(String str) {
        return this._simpleName.equals(str);
    }

    public int hashCode() {
        String str = this._namespace;
        return str == null ? this._simpleName.hashCode() : str.hashCode() ^ this._simpleName.hashCode();
    }

    public PropertyName internSimpleName() {
        if (this._simpleName.length() == 0) {
            return this;
        }
        String intern = InternCache.instance.intern(this._simpleName);
        return intern == this._simpleName ? this : new PropertyName(intern, this._namespace);
    }

    public boolean isEmpty() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        if (this._namespace == null) {
            String str = this._simpleName;
            if (str == null || "".equals(str)) {
                return USE_DEFAULT;
            }
        }
        return this;
    }

    public SerializableString simpleAsEncoded(MapperConfig<?> mapperConfig) {
        SerializableString serializableString = this._encodedSimple;
        if (serializableString != null) {
            return serializableString;
        }
        SerializableString serializedString = mapperConfig == null ? new SerializedString(this._simpleName) : mapperConfig.compileString(this._simpleName);
        this._encodedSimple = serializedString;
        return serializedString;
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(this._namespace);
        sb.append("}");
        sb.append(this._simpleName);
        return sb.toString();
    }

    public PropertyName withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this._simpleName) ? this : new PropertyName(str, this._namespace);
    }
}