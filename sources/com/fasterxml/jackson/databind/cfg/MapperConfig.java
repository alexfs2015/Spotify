package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class MapperConfig<T extends MapperConfig<T>> implements MixInResolver, Serializable {
    protected static final Value EMPTY_FORMAT = Value.empty();
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();
    private static final long serialVersionUID = 2;
    protected final BaseSettings _base;
    protected final int _mapperFeatures;

    protected MapperConfig(BaseSettings baseSettings, int i) {
        this._base = baseSettings;
        this._mapperFeatures = i;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig, int i) {
        this._base = mapperConfig._base;
        this._mapperFeatures = i;
    }

    protected MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this._base = baseSettings;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public static <F extends Enum<F> & ConfigFeature> int collectFeatureDefaults(Class<F> cls) {
        int i = 0;
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            ConfigFeature configFeature = (ConfigFeature) enumR;
            if (configFeature.enabledByDefault()) {
                i |= configFeature.getMask();
            }
        }
        return i;
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public SerializableString compileString(String str) {
        return new SerializedString(str);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls);
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().constructType((Type) cls);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS) ? this._base.getAnnotationIntrospector() : NopAnnotationIntrospector.instance;
    }

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public ClassIntrospector getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public abstract ConfigOverride getConfigOverride(Class<?> cls);

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public abstract JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2, JsonInclude.Value value) {
        return JsonInclude.Value.mergeAll(value, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public abstract Boolean getDefaultMergeable();

    public abstract Value getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls);

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        return include != null ? include : value;
    }

    public abstract JsonSetter.Value getDefaultSetterInfo();

    public final TypeResolverBuilder<?> getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, AnnotatedClass annotatedClass);

    public final HandlerInstantiator getHandlerInstantiator() {
        return this._base.getHandlerInstantiator();
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public BeanDescription introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public BeanDescription introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return (mapperFeature.getMask() & this._mapperFeatures) != 0;
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class<? extends TypeIdResolver> cls) {
        HandlerInstantiator handlerInstantiator = getHandlerInstantiator();
        if (handlerInstantiator != null) {
            TypeIdResolver typeIdResolverInstance = handlerInstantiator.typeIdResolverInstance(this, annotated, cls);
            if (typeIdResolverInstance != null) {
                return typeIdResolverInstance;
            }
        }
        return (TypeIdResolver) ClassUtil.createInstance(cls, canOverrideAccessModifiers());
    }

    public TypeResolverBuilder<?> typeResolverBuilderInstance(Annotated annotated, Class<? extends TypeResolverBuilder<?>> cls) {
        HandlerInstantiator handlerInstantiator = getHandlerInstantiator();
        if (handlerInstantiator != null) {
            TypeResolverBuilder<?> typeResolverBuilderInstance = handlerInstantiator.typeResolverBuilderInstance(this, annotated, cls);
            if (typeResolverBuilderInstance != null) {
                return typeResolverBuilderInstance;
            }
        }
        return (TypeResolverBuilder) ClassUtil.createInstance(cls, canOverrideAccessModifiers());
    }
}
