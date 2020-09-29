package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.Serializers.Base;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.StdConverter;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import com.google.common.base.Optional;
import com.google.common.collect.Range;
import com.google.common.hash.HashCode;
import com.google.common.net.HostAndPort;
import java.io.Serializable;
import java.util.Set;

public class GuavaSerializers extends Base implements Serializable {
    static final long serialVersionUID = 1;

    static class FluentConverter extends StdConverter<Object, Iterable<?>> {
        static final FluentConverter instance = new FluentConverter();

        FluentConverter() {
        }

        public Iterable<?> convert(Object obj) {
            return (Iterable) obj;
        }
    }

    public JsonSerializer<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        if (!Optional.class.isAssignableFrom(referenceType.getRawClass())) {
            return null;
        }
        return new GuavaOptionalSerializer(referenceType, typeSerializer == null && serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING), typeSerializer, jsonSerializer);
    }

    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        if (Range.class.isAssignableFrom(rawClass)) {
            return new RangeSerializer(_findDeclared(javaType, Range.class));
        }
        if (fdd.class.isAssignableFrom(rawClass)) {
            return new TableSerializer(_findDeclared(javaType, fdd.class));
        }
        if (HostAndPort.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (fdy.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (fbi.class.isAssignableFrom(rawClass) || fbh.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (HashCode.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (!fbx.class.isAssignableFrom(rawClass)) {
            return super.findSerializer(serializationConfig, javaType, beanDescription);
        }
        return new StdDelegatingSerializer(FluentConverter.instance, _findDeclared(javaType, Iterable.class), null);
    }

    public JsonSerializer<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) {
        Set set = null;
        if (!fcn.class.isAssignableFrom(mapLikeType.getRawClass())) {
            return null;
        }
        Object findFilterId = serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
        SerializationConfig serializationConfig2 = serializationConfig;
        Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(fcn.class, beanDescription.getClassInfo());
        if (defaultPropertyIgnorals != null) {
            set = defaultPropertyIgnorals.getIgnored();
        }
        MultimapSerializer multimapSerializer = new MultimapSerializer(mapLikeType, beanDescription, jsonSerializer, typeSerializer, jsonSerializer2, set, findFilterId);
        return multimapSerializer;
    }

    private JavaType _findDeclared(JavaType javaType, Class<?> cls) {
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType != null) {
            return findSuperType;
        }
        StringBuilder sb = new StringBuilder("Strange ");
        sb.append(cls.getName());
        sb.append(" sub-type, ");
        sb.append(javaType);
        sb.append(", can not find type parameters");
        throw new IllegalArgumentException(sb.toString());
    }
}
