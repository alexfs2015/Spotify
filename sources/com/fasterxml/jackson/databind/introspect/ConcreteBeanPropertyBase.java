package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    private static final long serialVersionUID = 1;
    protected transient List<PropertyName> _aliases;
    protected final PropertyMetadata _metadata;
    protected transient Value _propertyFormat;

    protected ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        if (propertyMetadata == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        }
        this._metadata = propertyMetadata;
    }

    protected ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
        this._propertyFormat = concreteBeanPropertyBase._propertyFormat;
    }

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        Value value = this._propertyFormat;
        if (value == null) {
            Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
            value = null;
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null) {
                AnnotatedMember member = getMember();
                if (member != null) {
                    value = annotationIntrospector.findFormat(member);
                }
            }
            if (defaultPropertyFormat != null) {
                if (value != null) {
                    defaultPropertyFormat = defaultPropertyFormat.withOverrides(value);
                }
                value = defaultPropertyFormat;
            } else if (value == null) {
                value = EMPTY_FORMAT;
            }
            this._propertyFormat = value;
        }
        return value;
    }

    public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (member == null) {
            return mapperConfig.getDefaultPropertyInclusion(cls);
        }
        JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        JsonInclude.Value findPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        if (defaultInclusion == null) {
            return findPropertyInclusion;
        }
        return defaultInclusion.withOverrides(findPropertyInclusion);
    }

    public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
        List<PropertyName> list = this._aliases;
        if (list == null) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null) {
                list = annotationIntrospector.findPropertyAliases(getMember());
            }
            if (list == null) {
                list = Collections.emptyList();
            }
            this._aliases = list;
        }
        return list;
    }
}
