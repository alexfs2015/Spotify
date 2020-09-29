package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.Converter.None;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BasicBeanDescription extends BeanDescription {
    private static final Class<?>[] NO_VIEWS = new Class[0];
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final AnnotatedClass _classInfo;
    protected final MapperConfig<?> _config;
    protected Class<?>[] _defaultViews;
    protected boolean _defaultViewsResolved;
    protected ObjectIdInfo _objectIdInfo;
    protected final POJOPropertiesCollector _propCollector;
    protected List<BeanPropertyDefinition> _properties;

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector, JavaType javaType, AnnotatedClass annotatedClass) {
        super(javaType);
        this._propCollector = pOJOPropertiesCollector;
        this._config = pOJOPropertiesCollector.getConfig();
        MapperConfig<?> mapperConfig = this._config;
        if (mapperConfig == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
    }

    protected BasicBeanDescription(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass, List<BeanPropertyDefinition> list) {
        super(javaType);
        this._propCollector = null;
        this._config = mapperConfig;
        MapperConfig<?> mapperConfig2 = this._config;
        if (mapperConfig2 == null) {
            this._annotationIntrospector = null;
        } else {
            this._annotationIntrospector = mapperConfig2.getAnnotationIntrospector();
        }
        this._classInfo = annotatedClass;
        this._properties = list;
    }

    protected BasicBeanDescription(POJOPropertiesCollector pOJOPropertiesCollector) {
        this(pOJOPropertiesCollector, pOJOPropertiesCollector.getType(), pOJOPropertiesCollector.getClassDef());
        this._objectIdInfo = pOJOPropertiesCollector.getObjectIdInfo();
    }

    public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public static BasicBeanDescription forSerialization(POJOPropertiesCollector pOJOPropertiesCollector) {
        return new BasicBeanDescription(pOJOPropertiesCollector);
    }

    public static BasicBeanDescription forOtherUse(MapperConfig<?> mapperConfig, JavaType javaType, AnnotatedClass annotatedClass) {
        return new BasicBeanDescription(mapperConfig, javaType, annotatedClass, Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    public List<BeanPropertyDefinition> _properties() {
        if (this._properties == null) {
            this._properties = this._propCollector.getProperties();
        }
        return this._properties;
    }

    public boolean removeProperty(String str) {
        Iterator it = _properties().iterator();
        while (it.hasNext()) {
            if (((BeanPropertyDefinition) it.next()).getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean addProperty(BeanPropertyDefinition beanPropertyDefinition) {
        if (hasProperty(beanPropertyDefinition.getFullName())) {
            return false;
        }
        _properties().add(beanPropertyDefinition);
        return true;
    }

    public boolean hasProperty(PropertyName propertyName) {
        return findProperty(propertyName) != null;
    }

    public BeanPropertyDefinition findProperty(PropertyName propertyName) {
        for (BeanPropertyDefinition beanPropertyDefinition : _properties()) {
            if (beanPropertyDefinition.hasName(propertyName)) {
                return beanPropertyDefinition;
            }
        }
        return null;
    }

    public AnnotatedClass getClassInfo() {
        return this._classInfo;
    }

    public ObjectIdInfo getObjectIdInfo() {
        return this._objectIdInfo;
    }

    public List<BeanPropertyDefinition> findProperties() {
        return _properties();
    }

    public AnnotatedMember findJsonValueAccessor() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector == null) {
            return null;
        }
        return pOJOPropertiesCollector.getJsonValueAccessor();
    }

    public Set<String> getIgnoredPropertyNames() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        Set<String> ignoredPropertyNames = pOJOPropertiesCollector == null ? null : pOJOPropertiesCollector.getIgnoredPropertyNames();
        return ignoredPropertyNames == null ? Collections.emptySet() : ignoredPropertyNames;
    }

    public boolean hasKnownClassAnnotations() {
        return this._classInfo.hasAnnotations();
    }

    public Annotations getClassAnnotations() {
        return this._classInfo.getAnnotations();
    }

    public AnnotatedConstructor findDefaultConstructor() {
        return this._classInfo.getDefaultConstructor();
    }

    public AnnotatedMember findAnySetterAccessor() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector != null) {
            AnnotatedMethod anySetterMethod = pOJOPropertiesCollector.getAnySetterMethod();
            if (anySetterMethod != null) {
                Class<Object> rawParameterType = anySetterMethod.getRawParameterType(0);
                if (rawParameterType == String.class || rawParameterType == Object.class) {
                    return anySetterMethod;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", new Object[]{anySetterMethod.getName(), rawParameterType.getName()}));
            }
            AnnotatedMember anySetterField = this._propCollector.getAnySetterField();
            if (anySetterField != null) {
                if (Map.class.isAssignableFrom(anySetterField.getRawType())) {
                    return anySetterField;
                }
                throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", new Object[]{anySetterField.getName()}));
            }
        }
        return null;
    }

    public Map<Object, AnnotatedMember> findInjectables() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        if (pOJOPropertiesCollector != null) {
            return pOJOPropertiesCollector.getInjectables();
        }
        return Collections.emptyMap();
    }

    public List<AnnotatedConstructor> getConstructors() {
        return this._classInfo.getConstructors();
    }

    public Object instantiateBean(boolean z) {
        AnnotatedConstructor defaultConstructor = this._classInfo.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z) {
            defaultConstructor.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return defaultConstructor.getAnnotated().newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            ClassUtil.throwIfError(e);
            ClassUtil.throwIfRTE(e);
            StringBuilder sb = new StringBuilder("Failed to instantiate bean of type ");
            sb.append(this._classInfo.getAnnotated().getName());
            sb.append(": (");
            sb.append(e.getClass().getName());
            sb.append(") ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return this._classInfo.findMethod(str, clsArr);
    }

    public Value findExpectedFormat(Value value) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            Value findFormat = annotationIntrospector.findFormat(this._classInfo);
            if (findFormat != null) {
                if (value == null) {
                    value = findFormat;
                } else {
                    value = value.withOverrides(findFormat);
                }
            }
        }
        Value defaultPropertyFormat = this._config.getDefaultPropertyFormat(this._classInfo.getRawType());
        if (defaultPropertyFormat == null) {
            return value;
        }
        if (value == null) {
            return defaultPropertyFormat;
        }
        return value.withOverrides(defaultPropertyFormat);
    }

    public Class<?>[] findDefaultViews() {
        if (!this._defaultViewsResolved) {
            this._defaultViewsResolved = true;
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            Class<?>[] findViews = annotationIntrospector == null ? null : annotationIntrospector.findViews(this._classInfo);
            if (findViews == null && !this._config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                findViews = NO_VIEWS;
            }
            this._defaultViews = findViews;
        }
        return this._defaultViews;
    }

    public Converter<Object, Object> findSerializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findSerializationConverter(this._classInfo));
    }

    public JsonInclude.Value findPropertyInclusion(JsonInclude.Value value) {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector != null) {
            JsonInclude.Value findPropertyInclusion = annotationIntrospector.findPropertyInclusion(this._classInfo);
            if (findPropertyInclusion != null) {
                if (value == null) {
                    return findPropertyInclusion;
                }
                value = value.withOverrides(findPropertyInclusion);
            }
        }
        return value;
    }

    public AnnotatedMember findAnyGetter() {
        POJOPropertiesCollector pOJOPropertiesCollector = this._propCollector;
        AnnotatedMember anyGetter = pOJOPropertiesCollector == null ? null : pOJOPropertiesCollector.getAnyGetter();
        if (anyGetter != null) {
            if (!Map.class.isAssignableFrom(anyGetter.getRawType())) {
                StringBuilder sb = new StringBuilder("Invalid 'any-getter' annotation on method ");
                sb.append(anyGetter.getName());
                sb.append("(): return type is not instance of java.util.Map");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return anyGetter;
    }

    public List<BeanPropertyDefinition> findBackReferences() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (BeanPropertyDefinition beanPropertyDefinition : _properties()) {
            ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
            if (findReferenceType != null && findReferenceType.isBackReference()) {
                String name = findReferenceType.getName();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(name);
                } else if (!hashSet.add(name)) {
                    StringBuilder sb = new StringBuilder("Multiple back-reference properties with name '");
                    sb.append(name);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        List<AnnotatedMethod> factoryMethods = this._classInfo.getFactoryMethods();
        if (factoryMethods.isEmpty()) {
            return factoryMethods;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : factoryMethods) {
            if (isFactoryMethod(annotatedMethod)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public Constructor<?> findSingleArgConstructor(Class<?>... clsArr) {
        for (AnnotatedConstructor annotatedConstructor : this._classInfo.getConstructors()) {
            if (annotatedConstructor.getParameterCount() == 1) {
                Class<?> rawParameterType = annotatedConstructor.getRawParameterType(0);
                for (Class<?> cls : clsArr) {
                    if (cls == rawParameterType) {
                        return annotatedConstructor.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Method findFactoryMethod(Class<?>... clsArr) {
        for (AnnotatedMethod annotatedMethod : this._classInfo.getFactoryMethods()) {
            if (isFactoryMethod(annotatedMethod) && annotatedMethod.getParameterCount() == 1) {
                Class rawParameterType = annotatedMethod.getRawParameterType(0);
                for (Class<?> isAssignableFrom : clsArr) {
                    if (rawParameterType.isAssignableFrom(isAssignableFrom)) {
                        return annotatedMethod.getAnnotated();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean isFactoryMethod(AnnotatedMethod annotatedMethod) {
        if (!getBeanClass().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        Mode findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedMethod);
        if (findCreatorAnnotation != null && findCreatorAnnotation != Mode.DISABLED) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        if ("fromString".equals(name) && annotatedMethod.getParameterCount() == 1) {
            Class<String> rawParameterType = annotatedMethod.getRawParameterType(0);
            if (rawParameterType == String.class || CharSequence.class.isAssignableFrom(rawParameterType)) {
                return true;
            }
        }
        return false;
    }

    public Class<?> findPOJOBuilder() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this._classInfo);
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this._classInfo);
    }

    public Converter<Object, Object> findDeserializationConverter() {
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        if (annotationIntrospector == null) {
            return null;
        }
        return _createConverter(annotationIntrospector.findDeserializationConverter(this._classInfo));
    }

    /* access modifiers changed from: protected */
    public Converter<Object, Object> _createConverter(Object obj) {
        Converter<Object, Object> converter = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class<None> cls = (Class) obj;
            if (cls == None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    converter = handlerInstantiator.converterInstance(this._config, this._classInfo, cls);
                }
                if (converter == null) {
                    converter = (Converter) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
                }
                return converter;
            }
            StringBuilder sb = new StringBuilder("AnnotationIntrospector returned Class ");
            sb.append(cls.getName());
            sb.append("; expected Class<Converter>");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("AnnotationIntrospector returned Converter definition of type ");
        sb2.append(obj.getClass().getName());
        sb2.append("; expected type Converter or Class<Converter> instead");
        throw new IllegalStateException(sb2.toString());
    }
}
