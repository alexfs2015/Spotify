package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.EnumMap;
import java.util.EnumSet;

public class ClassNameIdResolver extends TypeIdResolverBase {
    public String getDescForKnownTypeIds() {
        return "class name used as type id";
    }

    public ClassNameIdResolver(JavaType javaType, TypeFactory typeFactory) {
        super(javaType, typeFactory);
    }

    public String idFromValue(Object obj) {
        return _idFrom(obj, obj.getClass(), this._typeFactory);
    }

    public String idFromValueAndType(Object obj, Class<?> cls) {
        return _idFrom(obj, cls, this._typeFactory);
    }

    public JavaType typeFromId(DatabindContext databindContext, String str) {
        return _typeFromId(str, databindContext);
    }

    /* access modifiers changed from: protected */
    public JavaType _typeFromId(String str, DatabindContext databindContext) {
        JavaType resolveSubType = databindContext.resolveSubType(this._baseType, str);
        return (resolveSubType != null || !(databindContext instanceof DeserializationContext)) ? resolveSubType : ((DeserializationContext) databindContext).handleUnknownTypeId(this._baseType, str, this, "no such class found");
    }

    /* access modifiers changed from: protected */
    public String _idFrom(Object obj, Class<?> cls, TypeFactory typeFactory) {
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || ClassUtil.getOuterClass(cls) == null || ClassUtil.getOuterClass(this._baseType.getRawClass()) != null) ? name : this._baseType.getRawClass().getName();
        }
        if (obj instanceof EnumSet) {
            return typeFactory.constructCollectionType(EnumSet.class, ClassUtil.findEnumType((EnumSet) obj)).toCanonical();
        } else if (!(obj instanceof EnumMap)) {
            return name;
        } else {
            return typeFactory.constructMapType(EnumMap.class, ClassUtil.findEnumType((EnumMap) obj), Object.class).toCanonical();
        }
    }
}
