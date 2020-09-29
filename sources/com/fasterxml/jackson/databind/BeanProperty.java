package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Named;
import java.io.Serializable;

public interface BeanProperty extends Named {
    public static final Value EMPTY_FORMAT = new Value();
    public static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();

    public static class Bogus implements BeanProperty {
        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
        }

        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        public AnnotatedMember getMember() {
            return null;
        }

        public String getName() {
            return "";
        }

        public PropertyName getFullName() {
            return PropertyName.NO_NAME;
        }

        public JavaType getType() {
            return TypeFactory.unknownType();
        }

        public PropertyMetadata getMetadata() {
            return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }

        public Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return Value.empty();
        }
    }

    public static class Std implements BeanProperty, Serializable {
        private static final long serialVersionUID = 1;
        protected final AnnotatedMember _member;
        protected final PropertyMetadata _metadata;
        protected final PropertyName _name;
        protected final JavaType _type;
        protected final PropertyName _wrapperName;

        public Std(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AnnotatedMember annotatedMember, PropertyMetadata propertyMetadata) {
            this._name = propertyName;
            this._type = javaType;
            this._wrapperName = propertyName2;
            this._metadata = propertyMetadata;
            this._member = annotatedMember;
        }

        public Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null) {
                AnnotatedMember annotatedMember = this._member;
                if (annotatedMember != null) {
                    Value findFormat = annotationIntrospector.findFormat(annotatedMember);
                    if (findFormat == null) {
                        return defaultPropertyFormat;
                    }
                    return defaultPropertyFormat.withOverrides(findFormat);
                }
            }
            return defaultPropertyFormat;
        }

        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, this._type.getRawClass());
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null) {
                AnnotatedMember annotatedMember = this._member;
                if (annotatedMember != null) {
                    JsonInclude.Value findPropertyInclusion = annotationIntrospector.findPropertyInclusion(annotatedMember);
                    if (findPropertyInclusion == null) {
                        return defaultInclusion;
                    }
                    return defaultInclusion.withOverrides(findPropertyInclusion);
                }
            }
            return defaultInclusion;
        }

        public String getName() {
            return this._name.getSimpleName();
        }

        public PropertyName getFullName() {
            return this._name;
        }

        public JavaType getType() {
            return this._type;
        }

        public PropertyName getWrapperName() {
            return this._wrapperName;
        }

        public PropertyMetadata getMetadata() {
            return this._metadata;
        }

        public AnnotatedMember getMember() {
            return this._member;
        }

        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
            StringBuilder sb = new StringBuilder("Instances of ");
            sb.append(getClass().getName());
            sb.append(" should not get visited");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider);

    Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls);

    JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls);

    PropertyName getFullName();

    AnnotatedMember getMember();

    PropertyMetadata getMetadata();

    String getName();

    JavaType getType();
}
