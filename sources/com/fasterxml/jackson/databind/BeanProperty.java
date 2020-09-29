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

        public Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            return Value.empty();
        }

        public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
            return null;
        }

        public PropertyName getFullName() {
            return PropertyName.NO_NAME;
        }

        public AnnotatedMember getMember() {
            return null;
        }

        public PropertyMetadata getMetadata() {
            return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }

        public String getName() {
            return "";
        }

        public JavaType getType() {
            return TypeFactory.unknownType();
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

        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
            StringBuilder sb = new StringBuilder("Instances of ");
            sb.append(getClass().getName());
            sb.append(" should not get visited");
            throw new UnsupportedOperationException(sb.toString());
        }

        public Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
            Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null) {
                AnnotatedMember annotatedMember = this._member;
                if (annotatedMember != null) {
                    Value findFormat = annotationIntrospector.findFormat(annotatedMember);
                    return findFormat == null ? defaultPropertyFormat : defaultPropertyFormat.withOverrides(findFormat);
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
                    return findPropertyInclusion == null ? defaultInclusion : defaultInclusion.withOverrides(findPropertyInclusion);
                }
            }
            return defaultInclusion;
        }

        public PropertyName getFullName() {
            return this._name;
        }

        public AnnotatedMember getMember() {
            return this._member;
        }

        public PropertyMetadata getMetadata() {
            return this._metadata;
        }

        public String getName() {
            return this._name.getSimpleName();
        }

        public JavaType getType() {
            return this._type;
        }

        public PropertyName getWrapperName() {
            return this._wrapperName;
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
