package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo.None;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_DESER = ((Class[]) new Class[]{JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class});
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_SER = ((Class[]) new Class[]{JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class});
    private static final Java7Support _java7Helper;
    private static final long serialVersionUID = 1;
    protected transient LRUMap<Class<?>, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;

    /* renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion = new int[Inclusion.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion[] r0 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.DEFAULT_INCLUSION     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Java7Support java7Support;
        try {
            java7Support = Java7Support.instance();
        } catch (Throwable unused) {
            java7Support = null;
        }
        _java7Helper = java7Support;
    }

    private final Boolean _findSortAlpha(Annotated annotated) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotated, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null || !jsonPropertyOrder.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    private boolean _primitiveAndWrapper(JavaType javaType, Class<?> cls) {
        return javaType.isPrimitive() ? javaType.hasRawClass(ClassUtil.primitiveType(cls)) : cls.isPrimitive() && cls == ClassUtil.primitiveType(javaType.getRawClass());
    }

    private boolean _primitiveAndWrapper(Class<?> cls, Class<?> cls2) {
        return cls.isPrimitive() ? cls == ClassUtil.primitiveType(cls2) : cls2.isPrimitive() && cls2 == ClassUtil.primitiveType(cls);
    }

    private Value _refinePropertyInclusion(Annotated annotated, Value value) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[jsonSerialize.include().ordinal()];
            if (i == 1) {
                return value.withValueInclusion(Include.ALWAYS);
            }
            if (i == 2) {
                return value.withValueInclusion(Include.NON_NULL);
            }
            if (i == 3) {
                return value.withValueInclusion(Include.NON_DEFAULT);
            }
            if (i == 4) {
                return value.withValueInclusion(Include.NON_EMPTY);
            }
        }
        return value;
    }

    /* access modifiers changed from: protected */
    public Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        return cls;
    }

    /* access modifiers changed from: protected */
    public Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> _classIfExplicit = _classIfExplicit(cls);
        if (_classIfExplicit == null || _classIfExplicit == cls2) {
            return null;
        }
        return _classIfExplicit;
    }

    /* access modifiers changed from: protected */
    public StdTypeResolverBuilder _constructNoTypeResolverBuilder() {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    /* access modifiers changed from: protected */
    public StdTypeResolverBuilder _constructStdTypeResolverBuilder() {
        return new StdTypeResolverBuilder();
    }

    /* access modifiers changed from: protected */
    public BeanPropertyWriter _constructVirtualProperty(Attr attr, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        PropertyMetadata propertyMetadata = attr.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String value = attr.value();
        PropertyName _propertyName = _propertyName(attr.propName(), attr.propNamespace());
        if (!_propertyName.hasSimpleName()) {
            _propertyName = PropertyName.construct(value);
        }
        return AttributePropertyWriter.construct(value, SimpleBeanPropertyDefinition.construct(mapperConfig, (AnnotatedMember) new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), value, javaType), _propertyName, propertyMetadata, attr.include()), annotatedClass.getAnnotations(), javaType);
    }

    /* access modifiers changed from: protected */
    public BeanPropertyWriter _constructVirtualProperty(Prop prop, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        PropertyMetadata propertyMetadata = prop.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName _propertyName = _propertyName(prop.name(), prop.namespace());
        JavaType constructType = mapperConfig.constructType(prop.type());
        SimpleBeanPropertyDefinition construct = SimpleBeanPropertyDefinition.construct(mapperConfig, (AnnotatedMember) new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), _propertyName.getSimpleName(), constructType), _propertyName, propertyMetadata, prop.include());
        Class value = prop.value();
        HandlerInstantiator handlerInstantiator = mapperConfig.getHandlerInstantiator();
        VirtualBeanPropertyWriter virtualPropertyWriterInstance = handlerInstantiator == null ? null : handlerInstantiator.virtualPropertyWriterInstance(mapperConfig, value);
        if (virtualPropertyWriterInstance == null) {
            virtualPropertyWriterInstance = (VirtualBeanPropertyWriter) ClassUtil.createInstance(value, mapperConfig.canOverrideAccessModifiers());
        }
        return virtualPropertyWriterInstance.withConfig(mapperConfig, annotatedClass, construct, constructType);
    }

    /* access modifiers changed from: protected */
    public PropertyName _findConstructorName(Annotated annotated) {
        if (annotated instanceof AnnotatedParameter) {
            AnnotatedParameter annotatedParameter = (AnnotatedParameter) annotated;
            if (annotatedParameter.getOwner() != null) {
                Java7Support java7Support = _java7Helper;
                if (java7Support != null) {
                    PropertyName findConstructorName = java7Support.findConstructorName(annotatedParameter);
                    if (findConstructorName != null) {
                        return findConstructorName;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public TypeResolverBuilder<?> _findTypeResolver(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) {
        TypeResolverBuilder typeResolverBuilder;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(annotated, JsonTypeInfo.class);
        JsonTypeResolver jsonTypeResolver = (JsonTypeResolver) _findAnnotation(annotated, JsonTypeResolver.class);
        TypeIdResolver typeIdResolver = null;
        if (jsonTypeResolver != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            typeResolverBuilder = mapperConfig.typeResolverBuilderInstance(annotated, jsonTypeResolver.value());
        } else if (jsonTypeInfo == null) {
            return null;
        } else {
            if (jsonTypeInfo.use() == Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            typeResolverBuilder = _constructStdTypeResolverBuilder();
        }
        JsonTypeIdResolver jsonTypeIdResolver = (JsonTypeIdResolver) _findAnnotation(annotated, JsonTypeIdResolver.class);
        if (jsonTypeIdResolver != null) {
            typeIdResolver = mapperConfig.typeIdResolverInstance(annotated, jsonTypeIdResolver.value());
        }
        if (typeIdResolver != null) {
            typeIdResolver.init(javaType);
        }
        TypeResolverBuilder init = typeResolverBuilder.init(jsonTypeInfo.use(), typeIdResolver);
        As include = jsonTypeInfo.include();
        if (include == As.EXTERNAL_PROPERTY && (annotated instanceof AnnotatedClass)) {
            include = As.PROPERTY;
        }
        TypeResolverBuilder typeProperty = init.inclusion(include).typeProperty(jsonTypeInfo.property());
        Class<None> defaultImpl = jsonTypeInfo.defaultImpl();
        if (defaultImpl != None.class && !defaultImpl.isAnnotation()) {
            typeProperty = typeProperty.defaultImpl(defaultImpl);
        }
        return typeProperty.typeIdVisibility(jsonTypeInfo.visible());
    }

    /* access modifiers changed from: protected */
    public boolean _isIgnorable(Annotated annotated) {
        JsonIgnore jsonIgnore = (JsonIgnore) _findAnnotation(annotated, JsonIgnore.class);
        if (jsonIgnore != null) {
            return jsonIgnore.value();
        }
        Java7Support java7Support = _java7Helper;
        if (java7Support != null) {
            Boolean findTransient = java7Support.findTransient(annotated);
            if (findTransient != null) {
                return findTransient.booleanValue();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public PropertyName _propertyName(String str, String str2) {
        return str.isEmpty() ? PropertyName.USE_DEFAULT : (str2 == null || str2.isEmpty()) ? PropertyName.construct(str) : PropertyName.construct(str, str2);
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
        JsonAppend jsonAppend = (JsonAppend) _findAnnotation(annotatedClass, JsonAppend.class);
        if (jsonAppend != null) {
            boolean prepend = jsonAppend.prepend();
            Attr[] attrs = jsonAppend.attrs();
            int length = attrs.length;
            JavaType javaType = null;
            for (int i = 0; i < length; i++) {
                if (javaType == null) {
                    javaType = mapperConfig.constructType(Object.class);
                }
                BeanPropertyWriter _constructVirtualProperty = _constructVirtualProperty(attrs[i], mapperConfig, annotatedClass, javaType);
                if (prepend) {
                    list.add(i, _constructVirtualProperty);
                } else {
                    list.add(_constructVirtualProperty);
                }
            }
            Prop[] props = jsonAppend.props();
            int length2 = props.length;
            for (int i2 = 0; i2 < length2; i2++) {
                BeanPropertyWriter _constructVirtualProperty2 = _constructVirtualProperty(props[i2], mapperConfig, annotatedClass);
                if (prepend) {
                    list.add(i2, _constructVirtualProperty2);
                } else {
                    list.add(_constructVirtualProperty2);
                }
            }
        }
    }

    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(annotatedClass, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    public Object findContentDeserializer(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize != null) {
            Class<JsonDeserializer.None> contentUsing = jsonDeserialize.contentUsing();
            if (contentUsing != JsonDeserializer.None.class) {
                return contentUsing;
            }
        }
        return null;
    }

    public Object findContentSerializer(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null) {
            Class<JsonSerializer.None> contentUsing = jsonSerialize.contentUsing();
            if (contentUsing != JsonSerializer.None.class) {
                return contentUsing;
            }
        }
        return null;
    }

    public Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (this._cfgConstructorPropertiesImpliesCreator && mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (annotated instanceof AnnotatedConstructor)) {
            Java7Support java7Support = _java7Helper;
            if (java7Support != null) {
                Boolean hasCreatorAnnotation = java7Support.hasCreatorAnnotation(annotated);
                if (hasCreatorAnnotation != null && hasCreatorAnnotation.booleanValue()) {
                    return Mode.PROPERTIES;
                }
            }
        }
        return null;
    }

    @Deprecated
    public Mode findCreatorBinding(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return ClassUtil.findFirstAnnotatedEnumValue(cls, JsonEnumDefaultValue.class);
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedMember, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.contentConverter(), Converter.None.class);
    }

    public Object findDeserializationConverter(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.converter(), Converter.None.class);
    }

    public Object findDeserializer(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize != null) {
            Class<JsonDeserializer.None> using = jsonDeserialize.using();
            if (using != JsonDeserializer.None.class) {
                return using;
            }
        }
        return null;
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        Field[] declaredFields;
        HashMap hashMap = null;
        for (Field field : ClassUtil.getDeclaredFields(cls)) {
            if (field.isEnumConstant()) {
                JsonProperty jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class);
                if (jsonProperty != null) {
                    String value = jsonProperty.value();
                    if (!value.isEmpty()) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(field.getName(), value);
                    }
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) hashMap.get(enumArr[i].name());
                if (str != null) {
                    strArr[i] = str;
                }
            }
        }
        return strArr;
    }

    public Object findFilterId(Annotated annotated) {
        JsonFilter jsonFilter = (JsonFilter) _findAnnotation(annotated, JsonFilter.class);
        if (jsonFilter != null) {
            String value = jsonFilter.value();
            if (value.length() > 0) {
                return value;
            }
        }
        return null;
    }

    public JsonFormat.Value findFormat(Annotated annotated) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(annotated, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return new JsonFormat.Value(jsonFormat);
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName _findConstructorName = _findConstructorName(annotatedMember);
        if (_findConstructorName == null) {
            return null;
        }
        return _findConstructorName.getSimpleName();
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        String str;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value from = JacksonInject.Value.from(jacksonInject);
        if (!from.hasId()) {
            if (!(annotatedMember instanceof AnnotatedMethod)) {
                str = annotatedMember.getRawType().getName();
            } else {
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
                str = annotatedMethod.getParameterCount() == 0 ? annotatedMember.getRawType().getName() : annotatedMethod.getRawParameterType(0).getName();
            }
            from = from.withId(str);
        }
        return from;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.Value findInjectableValue = findInjectableValue(annotatedMember);
        if (findInjectableValue == null) {
            return null;
        }
        return findInjectableValue.getId();
    }

    public Object findKeyDeserializer(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize != null) {
            Class<KeyDeserializer.None> keyUsing = jsonDeserialize.keyUsing();
            if (keyUsing != KeyDeserializer.None.class) {
                return keyUsing;
            }
        }
        return null;
    }

    public Object findKeySerializer(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null) {
            Class<JsonSerializer.None> keyUsing = jsonSerialize.keyUsing();
            if (keyUsing != JsonSerializer.None.class) {
                return keyUsing;
            }
        }
        return null;
    }

    public Boolean findMergeInfo(Annotated annotated) {
        JsonMerge jsonMerge = (JsonMerge) _findAnnotation(annotated, JsonMerge.class);
        if (jsonMerge == null) {
            return null;
        }
        return jsonMerge.value().asBoolean();
    }

    public PropertyName findNameForDeserialization(Annotated annotated) {
        boolean z;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(annotated, JsonSetter.class);
        if (jsonSetter != null) {
            String value = jsonSetter.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.construct(jsonProperty.value());
        }
        if (z || _hasOneOf(annotated, ANNOTATIONS_TO_INFER_DESER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    public PropertyName findNameForSerialization(Annotated annotated) {
        boolean z;
        JsonGetter jsonGetter = (JsonGetter) _findAnnotation(annotated, JsonGetter.class);
        if (jsonGetter != null) {
            String value = jsonGetter.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z = true;
        } else {
            z = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return PropertyName.construct(jsonProperty.value());
        }
        if (z || _hasOneOf(annotated, ANNOTATIONS_TO_INFER_SER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        JsonNaming jsonNaming = (JsonNaming) _findAnnotation(annotatedClass, JsonNaming.class);
        if (jsonNaming == null) {
            return null;
        }
        return jsonNaming.value();
    }

    public Object findNullSerializer(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null) {
            Class<JsonSerializer.None> nullsUsing = jsonSerialize.nullsUsing();
            if (nullsUsing != JsonSerializer.None.class) {
                return nullsUsing;
            }
        }
        return null;
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        JsonIdentityInfo jsonIdentityInfo = (JsonIdentityInfo) _findAnnotation(annotated, JsonIdentityInfo.class);
        if (jsonIdentityInfo == null || jsonIdentityInfo.generator() == ObjectIdGenerators.None.class) {
            return null;
        }
        return new ObjectIdInfo(PropertyName.construct(jsonIdentityInfo.property()), jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), jsonIdentityInfo.resolver());
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) _findAnnotation(annotated, JsonIdentityReference.class);
        if (jsonIdentityReference == null) {
            return objectIdInfo;
        }
        if (objectIdInfo == null) {
            objectIdInfo = ObjectIdInfo.empty();
        }
        return objectIdInfo.withAlwaysAsId(jsonIdentityReference.alwaysAsId());
    }

    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedClass, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.builder());
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder jsonPOJOBuilder = (JsonPOJOBuilder) _findAnnotation(annotatedClass, JsonPOJOBuilder.class);
        if (jsonPOJOBuilder == null) {
            return null;
        }
        return new JsonPOJOBuilder.Value(jsonPOJOBuilder);
    }

    public Access findPropertyAccess(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    public List<PropertyName> findPropertyAliases(Annotated annotated) {
        JsonAlias jsonAlias = (JsonAlias) _findAnnotation(annotated, JsonAlias.class);
        if (jsonAlias == null) {
            return null;
        }
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (String construct : jsonAlias.value()) {
            arrayList.add(PropertyName.construct(construct));
        }
        return arrayList;
    }

    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() != null) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        StringBuilder sb = new StringBuilder("Must call method with a container or reference type (got ");
        sb.append(javaType);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public String findPropertyDefaultValue(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String defaultValue = jsonProperty.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    public String findPropertyDescription(Annotated annotated) {
        JsonPropertyDescription jsonPropertyDescription = (JsonPropertyDescription) _findAnnotation(annotated, JsonPropertyDescription.class);
        if (jsonPropertyDescription == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(annotated, JsonIgnoreProperties.class);
        return jsonIgnoreProperties == null ? JsonIgnoreProperties.Value.empty() : JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    public Value findPropertyInclusion(Annotated annotated) {
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(annotated, JsonInclude.class);
        Value empty = jsonInclude == null ? Value.empty() : Value.from(jsonInclude);
        return empty.getValueInclusion() == Include.USE_DEFAULTS ? _refinePropertyInclusion(annotated, empty) : empty;
    }

    public Integer findPropertyIndex(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            int index = jsonProperty.index();
            if (index != -1) {
                return Integer.valueOf(index);
            }
        }
        return null;
    }

    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    public ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        JsonManagedReference jsonManagedReference = (JsonManagedReference) _findAnnotation(annotatedMember, JsonManagedReference.class);
        if (jsonManagedReference != null) {
            return ReferenceProperty.managed(jsonManagedReference.value());
        }
        JsonBackReference jsonBackReference = (JsonBackReference) _findAnnotation(annotatedMember, JsonBackReference.class);
        if (jsonBackReference != null) {
            return ReferenceProperty.back(jsonBackReference.value());
        }
        return null;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        JsonRootName jsonRootName = (JsonRootName) _findAnnotation(annotatedClass, JsonRootName.class);
        String str = null;
        if (jsonRootName == null) {
            return null;
        }
        String namespace = jsonRootName.namespace();
        if (namespace == null || namespace.length() != 0) {
            str = namespace;
        }
        return PropertyName.construct(jsonRootName.value(), str);
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentConverter(), Converter.None.class);
    }

    public Object findSerializationConverter(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.converter(), Converter.None.class);
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotatedClass, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }

    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return _findSortAlpha(annotated);
    }

    public Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    public Object findSerializer(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null) {
            Class<JsonSerializer.None> using = jsonSerialize.using();
            if (using != JsonSerializer.None.class) {
                return using;
            }
        }
        JsonRawValue jsonRawValue = (JsonRawValue) _findAnnotation(annotated, JsonRawValue.class);
        if (jsonRawValue == null || !jsonRawValue.value()) {
            return null;
        }
        return new RawSerializer(annotated.getRawType());
    }

    public JsonSetter.Value findSetterInfo(Annotated annotated) {
        return JsonSetter.Value.from((JsonSetter) _findAnnotation(annotated, JsonSetter.class));
    }

    public List<NamedType> findSubtypes(Annotated annotated) {
        JsonSubTypes jsonSubTypes = (JsonSubTypes) _findAnnotation(annotated, JsonSubTypes.class);
        if (jsonSubTypes == null) {
            return null;
        }
        Type[] value = jsonSubTypes.value();
        ArrayList arrayList = new ArrayList(value.length);
        for (Type type : value) {
            arrayList.add(new NamedType(type.value(), type.name()));
        }
        return arrayList;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        JsonTypeName jsonTypeName = (JsonTypeName) _findAnnotation(annotatedClass, JsonTypeName.class);
        if (jsonTypeName == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return _findTypeResolver(mapperConfig, annotatedClass, javaType);
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        JsonUnwrapped jsonUnwrapped = (JsonUnwrapped) _findAnnotation(annotatedMember, JsonUnwrapped.class);
        if (jsonUnwrapped == null || !jsonUnwrapped.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(jsonUnwrapped.prefix(), jsonUnwrapped.suffix());
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        JsonValueInstantiator jsonValueInstantiator = (JsonValueInstantiator) _findAnnotation(annotatedClass, JsonValueInstantiator.class);
        if (jsonValueInstantiator == null) {
            return null;
        }
        return jsonValueInstantiator.value();
    }

    public Class<?>[] findViews(Annotated annotated) {
        JsonView jsonView = (JsonView) _findAnnotation(annotated, JsonView.class);
        if (jsonView == null) {
            return null;
        }
        return jsonView.value();
    }

    public Boolean hasAnyGetter(Annotated annotated) {
        JsonAnyGetter jsonAnyGetter = (JsonAnyGetter) _findAnnotation(annotated, JsonAnyGetter.class);
        if (jsonAnyGetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnyGetter.enabled());
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, JsonAnyGetter.class);
    }

    public Boolean hasAnySetter(Annotated annotated) {
        JsonAnySetter jsonAnySetter = (JsonAnySetter) _findAnnotation(annotated, JsonAnySetter.class);
        if (jsonAnySetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    public Boolean hasAsValue(Annotated annotated) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotated, JsonValue.class);
        if (jsonValue == null) {
            return null;
        }
        return Boolean.valueOf(jsonValue.value());
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotatedMethod, JsonValue.class);
        return jsonValue != null && jsonValue.value();
    }

    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != Mode.DISABLED;
        }
        if (this._cfgConstructorPropertiesImpliesCreator && (annotated instanceof AnnotatedConstructor)) {
            Java7Support java7Support = _java7Helper;
            if (java7Support != null) {
                Boolean hasCreatorAnnotation = java7Support.hasCreatorAnnotation(annotated);
                if (hasCreatorAnnotation != null) {
                    return hasCreatorAnnotation.booleanValue();
                }
            }
        }
        return false;
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        Class annotationType = annotation.annotationType();
        Boolean bool = (Boolean) this._annotationsInside.get(annotationType);
        if (bool == null) {
            bool = Boolean.valueOf(annotationType.getAnnotation(JacksonAnnotationsInside.class) != null);
            this._annotationsInside.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        JsonIgnoreType jsonIgnoreType = (JsonIgnoreType) _findAnnotation(annotatedClass, JsonIgnoreType.class);
        if (jsonIgnoreType == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreType.value());
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, JsonTypeId.class));
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        if (this._annotationsInside == null) {
            this._annotationsInside = new LRUMap<>(48, 48);
        }
        return this;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) {
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        Class _classIfExplicit = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.as());
        if (_classIfExplicit != null && !javaType.hasRawClass(_classIfExplicit) && !_primitiveAndWrapper(javaType, _classIfExplicit)) {
            try {
                javaType = typeFactory.constructSpecializedType(javaType, _classIfExplicit);
            } catch (IllegalArgumentException e) {
                throw new JsonMappingException((Closeable) null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", new Object[]{javaType, _classIfExplicit.getName(), annotated.getName(), e.getMessage()}), (Throwable) e);
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class _classIfExplicit2 = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.keyAs());
            if (_classIfExplicit2 != null && !_primitiveAndWrapper(keyType, _classIfExplicit2)) {
                try {
                    javaType = ((MapLikeType) javaType).withKeyType(typeFactory.constructSpecializedType(keyType, _classIfExplicit2));
                } catch (IllegalArgumentException e2) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, _classIfExplicit2.getName(), annotated.getName(), e2.getMessage()}), (Throwable) e2);
                }
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        Class _classIfExplicit3 = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.contentAs());
        if (_classIfExplicit3 == null || _primitiveAndWrapper(contentType, _classIfExplicit3)) {
            return javaType;
        }
        try {
            return javaType.withContentType(typeFactory.constructSpecializedType(contentType, _classIfExplicit3));
        } catch (IllegalArgumentException e3) {
            throw new JsonMappingException((Closeable) null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, _classIfExplicit3.getName(), annotated.getName(), e3.getMessage()}), (Throwable) e3);
        }
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) {
        JavaType javaType2;
        JavaType javaType3;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        Class _classIfExplicit = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.as());
        if (_classIfExplicit != null) {
            if (javaType.hasRawClass(_classIfExplicit)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class rawClass = javaType.getRawClass();
                try {
                    if (_classIfExplicit.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.constructGeneralizedType(javaType, _classIfExplicit);
                    } else if (rawClass.isAssignableFrom(_classIfExplicit)) {
                        javaType = typeFactory.constructSpecializedType(javaType, _classIfExplicit);
                    } else if (_primitiveAndWrapper(rawClass, _classIfExplicit)) {
                        javaType = javaType.withStaticTyping();
                    } else {
                        throw new JsonMappingException(null, String.format("Cannot refine serialization type %s into %s; types not related", new Object[]{javaType, _classIfExplicit.getName()}));
                    }
                } catch (IllegalArgumentException e) {
                    throw new JsonMappingException((Closeable) null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", new Object[]{javaType, _classIfExplicit.getName(), annotated.getName(), e.getMessage()}), (Throwable) e);
                }
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class _classIfExplicit2 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.keyAs());
            if (_classIfExplicit2 != null) {
                if (keyType.hasRawClass(_classIfExplicit2)) {
                    javaType3 = keyType.withStaticTyping();
                } else {
                    Class rawClass2 = keyType.getRawClass();
                    try {
                        if (_classIfExplicit2.isAssignableFrom(rawClass2)) {
                            javaType3 = typeFactory.constructGeneralizedType(keyType, _classIfExplicit2);
                        } else if (rawClass2.isAssignableFrom(_classIfExplicit2)) {
                            javaType3 = typeFactory.constructSpecializedType(keyType, _classIfExplicit2);
                        } else if (_primitiveAndWrapper(rawClass2, _classIfExplicit2)) {
                            javaType3 = keyType.withStaticTyping();
                        } else {
                            throw new JsonMappingException(null, String.format("Cannot refine serialization key type %s into %s; types not related", new Object[]{keyType, _classIfExplicit2.getName()}));
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new JsonMappingException((Closeable) null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, _classIfExplicit2.getName(), annotated.getName(), e2.getMessage()}), (Throwable) e2);
                    }
                }
                javaType = ((MapLikeType) javaType).withKeyType(javaType3);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return javaType;
        }
        Class _classIfExplicit3 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.contentAs());
        if (_classIfExplicit3 == null) {
            return javaType;
        }
        if (contentType.hasRawClass(_classIfExplicit3)) {
            javaType2 = contentType.withStaticTyping();
        } else {
            Class rawClass3 = contentType.getRawClass();
            try {
                if (_classIfExplicit3.isAssignableFrom(rawClass3)) {
                    javaType2 = typeFactory.constructGeneralizedType(contentType, _classIfExplicit3);
                } else if (rawClass3.isAssignableFrom(_classIfExplicit3)) {
                    javaType2 = typeFactory.constructSpecializedType(contentType, _classIfExplicit3);
                } else if (_primitiveAndWrapper(rawClass3, _classIfExplicit3)) {
                    javaType2 = contentType.withStaticTyping();
                } else {
                    throw new JsonMappingException(null, String.format("Cannot refine serialization content type %s into %s; types not related", new Object[]{contentType, _classIfExplicit3.getName()}));
                }
            } catch (IllegalArgumentException e3) {
                throw new JsonMappingException((Closeable) null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{javaType, _classIfExplicit3.getName(), annotated.getName(), e3.getMessage()}), (Throwable) e3);
            }
        }
        return javaType.withContentType(javaType2);
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<String> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<String> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (rawParameterType.isPrimitive()) {
            if (!rawParameterType2.isPrimitive()) {
                return annotatedMethod;
            }
        } else if (rawParameterType2.isPrimitive()) {
            return annotatedMethod2;
        }
        if (rawParameterType == String.class) {
            if (rawParameterType2 != String.class) {
                return annotatedMethod;
            }
        } else if (rawParameterType2 == String.class) {
            return annotatedMethod2;
        }
        return null;
    }
}
