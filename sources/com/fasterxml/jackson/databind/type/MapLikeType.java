package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

public class MapLikeType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final JavaType _keyType;
    protected final JavaType _valueType;

    protected MapLikeType(TypeBase typeBase, JavaType javaType, JavaType javaType2) {
        super(typeBase);
        this._keyType = javaType;
        this._valueType = javaType2;
    }

    protected MapLikeType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode() ^ javaType3.hashCode(), obj, obj2, z);
        this._keyType = javaType2;
        this._valueType = javaType3;
    }

    public static MapLikeType upgradeFrom(JavaType javaType, JavaType javaType2, JavaType javaType3) {
        if (javaType instanceof TypeBase) {
            return new MapLikeType((TypeBase) javaType, javaType2, javaType3);
        }
        StringBuilder sb = new StringBuilder("Cannot upgrade from an instance of ");
        sb.append(javaType.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this._keyType != null) {
            sb.append('<');
            sb.append(this._keyType.toCanonical());
            sb.append(',');
            sb.append(this._valueType.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MapLikeType mapLikeType = (MapLikeType) obj;
        return this._class == mapLikeType._class && this._keyType.equals(mapLikeType._keyType) && this._valueType.equals(mapLikeType._valueType);
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        _classSignature(this._class, sb, false);
        sb.append('<');
        this._keyType.getGenericSignature(sb);
        this._valueType.getGenericSignature(sb);
        sb.append(">;");
        return sb;
    }

    public JavaType getKeyType() {
        return this._keyType;
    }

    public boolean hasHandlers() {
        return super.hasHandlers() || this._valueType.hasHandlers() || this._keyType.hasHandlers();
    }

    public boolean isContainerType() {
        return true;
    }

    public boolean isMapLikeType() {
        return true;
    }

    public boolean isTrueMapType() {
        return Map.class.isAssignableFrom(this._class);
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        MapLikeType mapLikeType = new MapLikeType(cls, typeBindings, javaType, javaTypeArr, this._keyType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapLikeType;
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", new Object[]{this._class.getName(), this._keyType, this._valueType});
    }

    public JavaType withContentType(JavaType javaType) {
        if (this._valueType == javaType) {
            return this;
        }
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, javaType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapLikeType;
    }

    public MapLikeType withContentTypeHandler(Object obj) {
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
        return mapLikeType;
    }

    public MapLikeType withContentValueHandler(Object obj) {
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
        return mapLikeType;
    }

    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType withHandlersFrom = super.withHandlersFrom(javaType);
        JavaType keyType = javaType.getKeyType();
        if ((withHandlersFrom instanceof MapLikeType) && keyType != null) {
            JavaType withHandlersFrom2 = this._keyType.withHandlersFrom(keyType);
            if (withHandlersFrom2 != this._keyType) {
                withHandlersFrom = ((MapLikeType) withHandlersFrom).withKeyType(withHandlersFrom2);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return withHandlersFrom;
        }
        JavaType withHandlersFrom3 = this._valueType.withHandlersFrom(contentType);
        return withHandlersFrom3 != this._valueType ? withHandlersFrom.withContentType(withHandlersFrom3) : withHandlersFrom;
    }

    public MapLikeType withKeyType(JavaType javaType) {
        if (javaType == this._keyType) {
            return this;
        }
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapLikeType;
    }

    public MapLikeType withKeyValueHandler(Object obj) {
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType.withValueHandler(obj), this._valueType, this._valueHandler, this._typeHandler, this._asStatic);
        return mapLikeType;
    }

    public MapLikeType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
        return mapLikeType;
    }

    public MapLikeType withTypeHandler(Object obj) {
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, this._valueHandler, obj, this._asStatic);
        return mapLikeType;
    }

    public MapLikeType withValueHandler(Object obj) {
        MapLikeType mapLikeType = new MapLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._keyType, this._valueType, obj, this._typeHandler, this._asStatic);
        return mapLikeType;
    }
}
