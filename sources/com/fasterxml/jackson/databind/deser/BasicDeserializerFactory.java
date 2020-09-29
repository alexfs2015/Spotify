package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ConstantValueInstantiator;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Entry.class;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");
    static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
    static final HashMap<String, Class<? extends Map>> _mapFallbacks;
    protected final DeserializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = new int[Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonCreator$Mode[] r0 = com.fasterxml.jackson.annotation.JsonCreator.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.annotation.JsonCreator$Mode r1 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DEFAULT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public abstract DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    static {
        HashMap<String, Class<? extends Map>> hashMap = new HashMap<>();
        _mapFallbacks = hashMap;
        hashMap.put(Map.class.getName(), LinkedHashMap.class);
        _mapFallbacks.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        _mapFallbacks.put(SortedMap.class.getName(), TreeMap.class);
        _mapFallbacks.put(NavigableMap.class.getName(), TreeMap.class);
        _mapFallbacks.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        HashMap<String, Class<? extends Collection>> hashMap2 = new HashMap<>();
        _collectionFallbacks = hashMap2;
        hashMap2.put(Collection.class.getName(), ArrayList.class);
        _collectionFallbacks.put(List.class.getName(), ArrayList.class);
        _collectionFallbacks.put(Set.class.getName(), HashSet.class);
        _collectionFallbacks.put(SortedSet.class.getName(), TreeSet.class);
        _collectionFallbacks.put(Queue.class.getName(), LinkedList.class);
        _collectionFallbacks.put("java.util.Deque", LinkedList.class);
        _collectionFallbacks.put("java.util.NavigableSet", TreeSet.class);
    }

    protected BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(deserializers));
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class rawClass = javaType.getRawClass();
            Class rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                StringBuilder sb = new StringBuilder("Invalid abstract type resolution from ");
                sb.append(javaType);
                sb.append(" to ");
                sb.append(_mapAbstractType2);
                sb.append(": latter is not a subtype of former");
            } else {
                javaType = _mapAbstractType2;
            }
        }
        StringBuilder sb2 = new StringBuilder("Invalid abstract type resolution from ");
        sb2.append(javaType);
        sb2.append(" to ");
        sb2.append(_mapAbstractType2);
        sb2.append(": latter is not a subtype of former");
        throw new IllegalArgumentException(sb2.toString());
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class rawClass = javaType.getRawClass();
        if (this._factoryConfig.hasAbstractTypeResolvers()) {
            for (AbstractTypeResolver findTypeMapping : this._factoryConfig.abstractTypeResolvers()) {
                JavaType findTypeMapping2 = findTypeMapping.findTypeMapping(deserializationConfig, javaType);
                if (findTypeMapping2 != null && !findTypeMapping2.hasRawClass(rawClass)) {
                    return findTypeMapping2;
                }
            }
        }
        return null;
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator _valueInstantiatorInstance = findValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, findValueInstantiator) : null;
        if (_valueInstantiatorInstance == null) {
            _valueInstantiatorInstance = _findStdValueInstantiator(config, beanDescription);
            if (_valueInstantiatorInstance == null) {
                _valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            }
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators valueInstantiators : this._factoryConfig.valueInstantiators()) {
                _valueInstantiatorInstance = valueInstantiators.findValueInstantiator(config, beanDescription, _valueInstantiatorInstance);
                if (_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", valueInstantiators.getClass().getName());
                }
            }
        }
        if (_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return _valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = _valueInstantiatorInstance.getIncompleteParameter();
        AnnotatedWithParams owner = incompleteParameter.getOwner();
        StringBuilder sb = new StringBuilder("Argument #");
        sb.append(incompleteParameter.getIndex());
        sb.append(" of constructor ");
        sb.append(owner);
        sb.append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
        throw new IllegalArgumentException(sb.toString());
    }

    private ValueInstantiator _findStdValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Class<JsonLocation> beanClass = beanDescription.getBeanClass();
        if (beanClass == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(beanClass)) {
            if (Collections.EMPTY_SET.getClass() == beanClass) {
                return new ConstantValueInstantiator(Collections.EMPTY_SET);
            }
            if (Collections.EMPTY_LIST.getClass() == beanClass) {
                return new ConstantValueInstantiator(Collections.EMPTY_LIST);
            }
        } else if (Map.class.isAssignableFrom(beanClass) && Collections.EMPTY_MAP.getClass() == beanClass) {
            return new ConstantValueInstantiator(Collections.EMPTY_MAP);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        VisibilityChecker defaultVisibilityChecker = deserializationContext.getConfig().getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Map _findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, beanDescription);
        _addDeserializerFactoryMethods(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        }
        return creatorCollector.constructValueInstantiator(deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> emptyMap = Collections.emptyMap();
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription.findProperties()) {
            Iterator constructorParameters = beanPropertyDefinition.getConstructorParameters();
            while (constructorParameters.hasNext()) {
                AnnotatedParameter annotatedParameter = (AnnotatedParameter) constructorParameters.next();
                AnnotatedWithParams owner = annotatedParameter.getOwner();
                BeanPropertyDefinition[] beanPropertyDefinitionArr = (BeanPropertyDefinition[]) emptyMap.get(owner);
                int index = annotatedParameter.getIndex();
                if (beanPropertyDefinitionArr == null) {
                    if (emptyMap.isEmpty()) {
                        emptyMap = new LinkedHashMap<>();
                    }
                    beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                    emptyMap.put(owner, beanPropertyDefinitionArr);
                } else if (beanPropertyDefinitionArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], beanPropertyDefinition);
                }
                beanPropertyDefinitionArr[index] = beanPropertyDefinition;
            }
        }
        return emptyMap;
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (ValueInstantiator.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = deserializationConfig.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    ValueInstantiator valueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(deserializationConfig, annotated, cls);
                    if (valueInstantiatorInstance != null) {
                        return valueInstantiatorInstance;
                    }
                }
                return (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers());
            }
            StringBuilder sb = new StringBuilder("AnnotationIntrospector returned Class ");
            sb.append(cls.getName());
            sb.append("; expected Class<ValueInstantiator>");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("AnnotationIntrospector returned key deserializer definition of type ");
        sb2.append(obj.getClass().getName());
        sb2.append("; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext r27, com.fasterxml.jackson.databind.BeanDescription r28, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r29, com.fasterxml.jackson.databind.AnnotationIntrospector r30, com.fasterxml.jackson.databind.deser.impl.CreatorCollector r31, java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]> r32) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r0 = r32
            boolean r1 = r28.isNonStaticInnerClass()
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r1 = r28.findDefaultConstructor()
            if (r1 == 0) goto L_0x002a
            boolean r2 = r31.hasDefaultCreator()
            if (r2 == 0) goto L_0x0027
            boolean r2 = r7._hasCreatorAnnotation(r8, r1)
            if (r2 == 0) goto L_0x002a
        L_0x0027:
            r12.setDefaultCreator(r1)
        L_0x002a:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List r2 = r28.getConstructors()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x0038:
            boolean r4 = r2.hasNext()
            r14 = 2
            r15 = 0
            r6 = 1
            if (r4 == 0) goto L_0x009b
            java.lang.Object r4 = r2.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r4 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r4
            com.fasterxml.jackson.databind.DeserializationConfig r5 = r27.getConfig()
            com.fasterxml.jackson.annotation.JsonCreator$Mode r5 = r11.findCreatorAnnotation(r5, r4)
            com.fasterxml.jackson.annotation.JsonCreator$Mode r13 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r13 == r5) goto L_0x0038
            if (r5 != 0) goto L_0x0069
            boolean r5 = r10.isCreatorVisible(r4)
            if (r5 == 0) goto L_0x0038
            java.lang.Object r5 = r0.get(r4)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r5 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r5
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r5)
            r1.add(r4)
            goto L_0x0038
        L_0x0069:
            int[] r13 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode
            int r5 = r5.ordinal()
            r5 = r13[r5]
            if (r5 == r6) goto L_0x0091
            if (r5 == r14) goto L_0x0083
            java.lang.Object r5 = r0.get(r4)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r5 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r5
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r5)
            r7._addExplicitAnyCreator(r8, r9, r12, r4)
            goto L_0x0098
        L_0x0083:
            java.lang.Object r5 = r0.get(r4)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r5 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r5
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r5)
            r7._addExplicitPropertyCreator(r8, r9, r12, r4)
            goto L_0x0098
        L_0x0091:
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r4 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r4, r15)
            r7._addExplicitDelegatingCreator(r8, r9, r12, r4)
        L_0x0098:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x009b:
            if (r3 <= 0) goto L_0x009e
            return
        L_0x009e:
            java.util.Iterator r13 = r1.iterator()
            r17 = r15
        L_0x00a4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r0 = r13.next()
            r5 = r0
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r5 = (com.fasterxml.jackson.databind.deser.impl.CreatorCandidate) r5
            int r4 = r5.paramCount()
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r3 = r5.creator()
            if (r4 != r6) goto L_0x010a
            r2 = 0
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r0 = r5.propertyDef(r2)
            boolean r1 = r7._checkIfCreatorPropertyBased(r11, r3, r0)
            if (r1 == 0) goto L_0x00f4
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r4 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r6]
            com.fasterxml.jackson.databind.PropertyName r16 = r5.paramName(r2)
            r18 = 0
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r19 = r5.parameter(r2)
            com.fasterxml.jackson.annotation.JacksonInject$Value r20 = r5.injection(r2)
            r0 = r26
            r1 = r27
            r5 = 0
            r2 = r28
            r15 = r3
            r3 = r16
            r14 = r4
            r4 = r18
            r5 = r19
            r18 = 1
            r6 = r20
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r1 = 0
            r14[r1] = r0
            r12.addPropertyCreator(r15, r1, r14)
            goto L_0x0106
        L_0x00f4:
            r15 = r3
            r1 = 0
            r18 = 1
            boolean r2 = r10.isCreatorVisible(r15)
            r7._handleSingleArgumentCreator(r12, r15, r1, r2)
            if (r0 == 0) goto L_0x0106
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r0 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r0
            r0.removeConstructors()
        L_0x0106:
            r23 = r13
            goto L_0x01b6
        L_0x010a:
            r15 = r3
            r18 = 1
            r0 = -1
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r14 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r4]
            r3 = -1
            r6 = 0
            r19 = 0
            r20 = 0
        L_0x0116:
            if (r6 >= r4) goto L_0x0195
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r2 = r15.getParameter(r6)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r0 = r5.propertyDef(r6)
            com.fasterxml.jackson.annotation.JacksonInject$Value r21 = r11.findInjectableValue(r2)
            if (r0 != 0) goto L_0x0129
            r22 = 0
            goto L_0x012f
        L_0x0129:
            com.fasterxml.jackson.databind.PropertyName r1 = r0.getFullName()
            r22 = r1
        L_0x012f:
            if (r0 == 0) goto L_0x0157
            boolean r0 = r0.isExplicitlyNamed()
            if (r0 == 0) goto L_0x0157
            int r19 = r19 + 1
            r0 = r26
            r1 = r27
            r32 = r2
            r2 = r28
            r10 = r3
            r3 = r22
            r23 = r13
            r13 = r4
            r4 = r6
            r24 = r5
            r5 = r32
            r25 = r6
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r14[r25] = r0
            goto L_0x0179
        L_0x0157:
            r32 = r2
            r10 = r3
            r24 = r5
            r25 = r6
            r23 = r13
            r13 = r4
            if (r21 == 0) goto L_0x017b
            int r20 = r20 + 1
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r22
            r4 = r25
            r5 = r32
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r14[r25] = r0
        L_0x0179:
            r3 = r10
            goto L_0x018b
        L_0x017b:
            r0 = r32
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r11.findUnwrappingNameTransformer(r0)
            if (r1 == 0) goto L_0x0187
            r7._reportUnwrappedCreatorProperty(r8, r9, r0)
            goto L_0x0179
        L_0x0187:
            if (r10 >= 0) goto L_0x0179
            r3 = r25
        L_0x018b:
            int r6 = r25 + 1
            r10 = r29
            r4 = r13
            r13 = r23
            r5 = r24
            goto L_0x0116
        L_0x0195:
            r10 = r3
            r24 = r5
            r23 = r13
            r13 = r4
            if (r19 > 0) goto L_0x01a3
            if (r20 <= 0) goto L_0x01a0
            goto L_0x01a3
        L_0x01a0:
            r0 = 2
            r3 = 0
            goto L_0x01de
        L_0x01a3:
            int r0 = r19 + r20
            if (r0 != r13) goto L_0x01ac
            r0 = 0
            r12.addPropertyCreator(r15, r0, r14)
            goto L_0x01b6
        L_0x01ac:
            r0 = 0
            if (r19 != 0) goto L_0x01bf
            int r1 = r20 + 1
            if (r1 != r13) goto L_0x01bf
            r12.addDelegatingCreator(r15, r0, r14, r0)
        L_0x01b6:
            r10 = r29
            r13 = r23
            r6 = 1
            r14 = 2
            r15 = 0
            goto L_0x00a4
        L_0x01bf:
            r0 = r24
            com.fasterxml.jackson.databind.PropertyName r0 = r0.findImplicitParamName(r10)
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a0
        L_0x01cd:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r3 = 0
            r1[r3] = r2
            r1[r18] = r15
            java.lang.String r2 = "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.reportBadTypeDefinition(r9, r2, r1)
        L_0x01de:
            boolean r1 = r31.hasDefaultCreator()
            if (r1 != 0) goto L_0x01b6
            if (r17 != 0) goto L_0x01ec
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L_0x01ee
        L_0x01ec:
            r1 = r17
        L_0x01ee:
            r1.add(r15)
            r17 = r1
            goto L_0x01b6
        L_0x01f4:
            if (r17 == 0) goto L_0x0213
            boolean r0 = r31.hasDelegatingCreator()
            if (r0 != 0) goto L_0x0213
            boolean r0 = r31.hasPropertyBasedCreator()
            if (r0 != 0) goto L_0x0213
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r17
            r0._checkImplicitlyNamedConstructors(r1, r2, r3, r4, r5, r6)
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.deser.impl.CreatorCollector, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) {
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        CreatorCollector creatorCollector2 = creatorCollector;
        CreatorCandidate creatorCandidate2 = creatorCandidate;
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        int i = -1;
        for (int i2 = 0; i2 < paramCount; i2++) {
            AnnotatedParameter parameter = creatorCandidate2.parameter(i2);
            Value injection = creatorCandidate2.injection(i2);
            if (injection != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, null, i2, parameter, injection);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext2.reportBadTypeDefinition(beanDescription2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), creatorCandidate2);
            }
        }
        if (i < 0) {
            deserializationContext2.reportBadTypeDefinition(beanDescription2, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate2);
        }
        if (paramCount == 1) {
            _handleSingleArgumentCreator(creatorCollector2, creatorCandidate.creator(), true, true);
            BeanPropertyDefinition propertyDef = creatorCandidate2.propertyDef(0);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
            }
            return;
        }
        creatorCollector2.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i);
    }

    /* access modifiers changed from: protected */
    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) {
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        for (int i = 0; i < paramCount; i++) {
            Value injection = creatorCandidate.injection(i);
            AnnotatedParameter parameter = creatorCandidate.parameter(i);
            PropertyName paramName = creatorCandidate.paramName(i);
            if (paramName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(parameter) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                }
                paramName = creatorCandidate.findImplicitParamName(i);
                if (paramName == null && injection == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i), creatorCandidate);
                }
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, paramName, i, parameter, injection);
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    /* access modifiers changed from: protected */
    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) {
        if (1 != creatorCandidate.paramCount()) {
            int findOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection();
            if (findOnlyParamWithoutInjection < 0 || creatorCandidate.paramName(findOnlyParamWithoutInjection) != null) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            }
        } else {
            AnnotatedParameter parameter = creatorCandidate.parameter(0);
            Value injection = creatorCandidate.injection(0);
            PropertyName explicitParamName = creatorCandidate.explicitParamName(0);
            BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
            boolean z = (explicitParamName == null && injection == null) ? false : true;
            if (!z && propertyDef != null) {
                explicitParamName = creatorCandidate.paramName(0);
                z = explicitParamName != null && propertyDef.couldSerialize();
            }
            PropertyName propertyName = explicitParamName;
            if (z) {
                creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, parameter, injection)});
                return;
            }
            _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
            }
        }
    }

    private boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        if ((beanPropertyDefinition != null && beanPropertyDefinition.isExplicitlyNamed()) || annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) != null) {
            return true;
        }
        if (beanPropertyDefinition != null) {
            String name = beanPropertyDefinition.getName();
            return name != null && !name.isEmpty() && beanPropertyDefinition.couldSerialize();
        }
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) {
        int i;
        Iterator it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams annotatedWithParams3 = (AnnotatedWithParams) it.next();
            if (visibilityChecker.isCreatorVisible(annotatedWithParams3)) {
                int parameterCount = annotatedWithParams3.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 < parameterCount) {
                        AnnotatedParameter parameter = annotatedWithParams3.getParameter(i2);
                        PropertyName _findParamName = _findParamName(parameter, annotationIntrospector);
                        if (_findParamName == null || _findParamName.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, _findParamName, parameter.getIndex(), parameter, null);
                        i2++;
                    } else if (annotatedWithParams2 != null) {
                        break;
                    } else {
                        annotatedWithParams2 = annotatedWithParams3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r16v1, types: [com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r19v1, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter, com.fasterxml.jackson.databind.introspect.AnnotatedMember] */
    /* JADX WARNING: type inference failed for: r20v0, types: [com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition] */
    /* JADX WARNING: type inference failed for: r22v0 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r19v2 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter, com.fasterxml.jackson.databind.introspect.AnnotatedMember] */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.fasterxml.jackson.databind.PropertyName] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter] */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r3v8, types: [com.fasterxml.jackson.databind.PropertyName] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter] */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r22v1, types: [com.fasterxml.jackson.databind.PropertyName] */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: type inference failed for: r20v5 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r19v4 */
    /* JADX WARNING: type inference failed for: r19v5 */
    /* JADX WARNING: type inference failed for: r19v6 */
    /* JADX WARNING: type inference failed for: r19v7 */
    /* JADX WARNING: type inference failed for: r19v8 */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r22v3 */
    /* JADX WARNING: type inference failed for: r20v6 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 174
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 22 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext r27, com.fasterxml.jackson.databind.BeanDescription r28, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r29, com.fasterxml.jackson.databind.AnnotationIntrospector r30, com.fasterxml.jackson.databind.deser.impl.CreatorCollector r31, java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]> r32) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r1 = r28.getFactoryMethods()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x001c:
            boolean r3 = r1.hasNext()
            r15 = 2
            r6 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r3
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r27.getConfig()
            com.fasterxml.jackson.annotation.JsonCreator$Mode r4 = r11.findCreatorAnnotation(r4, r3)
            int r14 = r3.getParameterCount()
            if (r4 != 0) goto L_0x0049
            if (r14 != r5) goto L_0x001c
            boolean r4 = r10.isCreatorVisible(r3)
            if (r4 == 0) goto L_0x001c
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r6)
            r0.add(r3)
            goto L_0x001c
        L_0x0049:
            com.fasterxml.jackson.annotation.JsonCreator$Mode r6 = com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED
            if (r4 == r6) goto L_0x001c
            if (r14 != 0) goto L_0x0053
            r12.setDefaultCreator(r3)
            goto L_0x001c
        L_0x0053:
            int[] r6 = com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L_0x007b
            if (r4 == r15) goto L_0x006d
            java.lang.Object r4 = r13.get(r3)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r4 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r4
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r4)
            r7._addExplicitAnyCreator(r8, r9, r12, r3)
            goto L_0x0083
        L_0x006d:
            java.lang.Object r4 = r13.get(r3)
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r4 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r4
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r4)
            r7._addExplicitPropertyCreator(r8, r9, r12, r3)
            goto L_0x0083
        L_0x007b:
            r6 = 0
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r3 = com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.construct(r11, r3, r6)
            r7._addExplicitDelegatingCreator(r8, r9, r12, r3)
        L_0x0083:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0086:
            if (r2 <= 0) goto L_0x0089
            return
        L_0x0089:
            java.util.Iterator r14 = r0.iterator()
        L_0x008d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r0 = r14.next()
            com.fasterxml.jackson.databind.deser.impl.CreatorCandidate r0 = (com.fasterxml.jackson.databind.deser.impl.CreatorCandidate) r0
            int r4 = r0.paramCount()
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r3 = r0.creator()
            java.lang.Object r1 = r13.get(r3)
            r16 = r1
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[] r16 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]) r16
            if (r4 != r5) goto L_0x0196
            r1 = 0
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r0 = r0.propertyDef(r1)
            boolean r2 = r7._checkIfCreatorPropertyBased(r11, r3, r0)
            if (r2 != 0) goto L_0x00c5
            boolean r2 = r10.isCreatorVisible(r3)
            r7._handleSingleArgumentCreator(r12, r3, r1, r2)
            if (r0 == 0) goto L_0x008d
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder r0 = (com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder) r0
            r0.removeConstructors()
            goto L_0x008d
        L_0x00c5:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r2 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[r4]
            r19 = r6
            r1 = 0
            r17 = 0
            r18 = 0
        L_0x00ce:
            if (r1 >= r4) goto L_0x0155
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r0 = r3.getParameter(r1)
            if (r16 != 0) goto L_0x00d9
            r20 = r6
            goto L_0x00db
        L_0x00d9:
            r20 = r16[r1]
        L_0x00db:
            com.fasterxml.jackson.annotation.JacksonInject$Value r21 = r11.findInjectableValue(r0)
            if (r20 != 0) goto L_0x00e4
            r22 = r6
            goto L_0x00e8
        L_0x00e4:
            com.fasterxml.jackson.databind.PropertyName r22 = r20.getFullName()
        L_0x00e8:
            if (r20 == 0) goto L_0x0112
            boolean r20 = r20.isExplicitlyNamed()
            if (r20 == 0) goto L_0x0112
            int r17 = r17 + 1
            r20 = r0
            r0 = r26
            r23 = r1
            r1 = r27
            r15 = r2
            r2 = r28
            r10 = r3
            r3 = r22
            r13 = r4
            r4 = r23
            r24 = 1
            r5 = r20
            r25 = r6
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0146
        L_0x0112:
            r20 = r0
            r23 = r1
            r15 = r2
            r10 = r3
            r13 = r4
            r25 = r6
            r24 = 1
            if (r21 == 0) goto L_0x0136
            int r18 = r18 + 1
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r22
            r4 = r23
            r5 = r20
            r6 = r21
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.constructCreatorProperty(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0146
        L_0x0136:
            r0 = r20
            com.fasterxml.jackson.databind.util.NameTransformer r1 = r11.findUnwrappingNameTransformer(r0)
            if (r1 == 0) goto L_0x0142
            r7._reportUnwrappedCreatorProperty(r8, r9, r0)
            goto L_0x0146
        L_0x0142:
            if (r19 != 0) goto L_0x0146
            r19 = r0
        L_0x0146:
            int r1 = r23 + 1
            r3 = r10
            r4 = r13
            r2 = r15
            r6 = r25
            r5 = 1
            r15 = 2
            r10 = r29
            r13 = r32
            goto L_0x00ce
        L_0x0155:
            r15 = r2
            r10 = r3
            r13 = r4
            r25 = r6
            r24 = 1
            if (r17 > 0) goto L_0x0164
            if (r18 <= 0) goto L_0x0161
            goto L_0x0164
        L_0x0161:
            r0 = 0
            r1 = 2
            goto L_0x016c
        L_0x0164:
            int r0 = r17 + r18
            if (r0 != r13) goto L_0x0176
            r0 = 0
            r12.addPropertyCreator(r10, r0, r15)
        L_0x016c:
            r10 = r29
            r13 = r32
            r6 = r25
            r5 = 1
            r15 = 2
            goto L_0x008d
        L_0x0176:
            r0 = 0
            if (r17 != 0) goto L_0x0181
            int r1 = r18 + 1
            if (r1 != r13) goto L_0x0181
            r12.addDelegatingCreator(r10, r0, r15, r0)
            goto L_0x016c
        L_0x0181:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r19.getIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            r2[r24] = r10
            java.lang.String r3 = "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.reportBadTypeDefinition(r9, r3, r2)
            goto L_0x016c
        L_0x0196:
            r10 = r29
            r13 = r32
            goto L_0x008d
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.AnnotationIntrospector, com.fasterxml.jackson.databind.deser.impl.CreatorCollector, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<Boolean> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                creatorCollector.addStringCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                creatorCollector.addIntCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                creatorCollector.addLongCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z);
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            creatorCollector.addDelegatingCreator(annotatedWithParams, z, null, 0);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) {
        deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", new Object[]{Integer.valueOf(annotatedParameter.getIndex())}));
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, Value value) {
        PropertyMetadata propertyMetadata;
        Object obj;
        DeserializationContext deserializationContext2 = deserializationContext;
        AnnotatedParameter annotatedParameter2 = annotatedParameter;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        } else {
            propertyMetadata = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter2), annotationIntrospector.findPropertyDescription(annotatedParameter2), annotationIntrospector.findPropertyIndex(annotatedParameter2), annotationIntrospector.findPropertyDefaultValue(annotatedParameter2));
        }
        PropertyMetadata propertyMetadata2 = propertyMetadata;
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext2, annotatedParameter2, annotatedParameter.getType());
        Std std = new Std(propertyName, resolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter2), annotatedParameter, propertyMetadata2);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        if (value == null) {
            obj = null;
        } else {
            obj = value.getId();
        }
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, resolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializer2, beanDescription.getClassAnnotations(), annotatedParameter, i, obj, propertyMetadata2);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext2, annotatedParameter2);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? creatorProperty.withValueDeserializer(deserializationContext2.handlePrimaryContextualization(findDeserializerFromAnnotation, creatorProperty, resolveMemberAndTypeAnnotations)) : creatorProperty;
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (!(annotatedParameter == null || annotationIntrospector == null)) {
            PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
            if (findNameForDeserialization != null) {
                return findNameForDeserialization;
            }
            String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
            if (findImplicitPropertyName != null && !findImplicitPropertyName.isEmpty()) {
                return PropertyName.construct(findImplicitPropertyName);
            }
        }
        return null;
    }

    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<String> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer<>(arrayType, jsonDeserializer, typeDeserializer2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyArrayDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomArrayDeserializer = modifyArrayDeserializer.modifyArrayDeserializer(config, arrayType, beanDescription, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createCollectionDeserializer(com.fasterxml.jackson.databind.DeserializationContext r11, com.fasterxml.jackson.databind.type.CollectionType r12, com.fasterxml.jackson.databind.BeanDescription r13) {
        /*
            r10 = this;
            com.fasterxml.jackson.databind.JavaType r0 = r12.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            com.fasterxml.jackson.databind.JsonDeserializer r1 = (com.fasterxml.jackson.databind.JsonDeserializer) r1
            com.fasterxml.jackson.databind.DeserializationConfig r8 = r11.getConfig()
            java.lang.Object r2 = r0.getTypeHandler()
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r2 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r2
            if (r2 != 0) goto L_0x001a
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r2 = r10.findTypeDeserializer(r8, r0)
        L_0x001a:
            r9 = r2
            r2 = r10
            r3 = r12
            r4 = r8
            r5 = r13
            r6 = r9
            r7 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r2._findCustomCollectionDeserializer(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x003b
            java.lang.Class r3 = r12.getRawClass()
            if (r1 != 0) goto L_0x003b
            java.lang.Class<java.util.EnumSet> r4 = java.util.EnumSet.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L_0x003b
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
            r3 = 0
            r2.<init>(r0, r3)
        L_0x003b:
            if (r2 != 0) goto L_0x00a8
            boolean r3 = r12.isInterface()
            if (r3 != 0) goto L_0x0049
            boolean r3 = r12.isAbstract()
            if (r3 == 0) goto L_0x0073
        L_0x0049:
            com.fasterxml.jackson.databind.type.CollectionType r3 = r10._mapAbstractCollectionType(r12, r8)
            if (r3 != 0) goto L_0x006e
            java.lang.Object r2 = r12.getTypeHandler()
            if (r2 == 0) goto L_0x005a
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r2 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r13)
            goto L_0x0073
        L_0x005a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot find a deserializer for non-concrete Collection type "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L_0x006e:
            com.fasterxml.jackson.databind.BeanDescription r13 = r8.introspectForCreation(r3)
            r12 = r3
        L_0x0073:
            if (r2 != 0) goto L_0x00a8
            com.fasterxml.jackson.databind.deser.ValueInstantiator r2 = r10.findValueInstantiator(r11, r13)
            boolean r3 = r2.canCreateUsingDefault()
            if (r3 != 0) goto L_0x0094
            java.lang.Class<java.util.concurrent.ArrayBlockingQueue> r3 = java.util.concurrent.ArrayBlockingQueue.class
            boolean r3 = r12.hasRawClass(r3)
            if (r3 == 0) goto L_0x008d
            com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            r11.<init>(r12, r1, r9, r2)
            return r11
        L_0x008d:
            com.fasterxml.jackson.databind.JsonDeserializer r11 = com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForCollection(r11, r12)
            if (r11 == 0) goto L_0x0094
            return r11
        L_0x0094:
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r11 = r0.hasRawClass(r11)
            if (r11 == 0) goto L_0x00a2
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r11.<init>(r12, r1, r2)
            goto L_0x00a9
        L_0x00a2:
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            r11.<init>(r12, r1, r9, r2)
            goto L_0x00a9
        L_0x00a8:
            r11 = r2
        L_0x00a9:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r10._factoryConfig
            boolean r0 = r0.hasDeserializerModifiers()
            if (r0 == 0) goto L_0x00cc
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r0 = r10._factoryConfig
            java.lang.Iterable r0 = r0.deserializerModifiers()
            java.util.Iterator r0 = r0.iterator()
        L_0x00bb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r0.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r1 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r1
            com.fasterxml.jackson.databind.JsonDeserializer r11 = r1.modifyCollectionDeserializer(r8, r12, r13, r11)
            goto L_0x00bb
        L_0x00cc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createCollectionDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* access modifiers changed from: protected */
    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class cls = (Class) _collectionFallbacks.get(javaType.getRawClass().getName());
        if (cls == null) {
            return null;
        }
        return (CollectionType) deserializationConfig.constructSpecializedType(javaType, cls);
    }

    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        JsonDeserializer<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionLikeDeserializer = modifyCollectionLikeDeserializer.modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.JsonDeserializer<?>] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r12v1, types: [com.fasterxml.jackson.databind.deser.std.MapDeserializer] */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.fasterxml.jackson.databind.deser.AbstractDeserializer] */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer<?>] */
    /* JADX WARNING: type inference failed for: r0v20, types: [com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer] */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r12v2, types: [com.fasterxml.jackson.databind.deser.std.MapDeserializer] */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v7
      assigns: [com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.std.MapDeserializer, com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.fasterxml.jackson.databind.JsonDeserializer<?>, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.std.MapDeserializer, com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer]
      mth insns count: 112
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r20, com.fasterxml.jackson.databind.type.MapType r21, com.fasterxml.jackson.databind.BeanDescription r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            com.fasterxml.jackson.databind.DeserializationConfig r10 = r20.getConfig()
            com.fasterxml.jackson.databind.JavaType r11 = r21.getKeyType()
            com.fasterxml.jackson.databind.JavaType r0 = r21.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            r16 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r16 = (com.fasterxml.jackson.databind.JsonDeserializer) r16
            java.lang.Object r1 = r11.getValueHandler()
            r15 = r1
            com.fasterxml.jackson.databind.KeyDeserializer r15 = (com.fasterxml.jackson.databind.KeyDeserializer) r15
            java.lang.Object r1 = r0.getTypeHandler()
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r1
            if (r1 != 0) goto L_0x0030
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r7.findTypeDeserializer(r10, r0)
            r17 = r0
            goto L_0x0032
        L_0x0030:
            r17 = r1
        L_0x0032:
            r0 = r19
            r1 = r21
            r2 = r10
            r3 = r22
            r4 = r15
            r5 = r17
            r6 = r16
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._findCustomMapDeserializer(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00fd
            java.lang.Class r12 = r21.getRawClass()
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            boolean r1 = r1.isAssignableFrom(r12)
            r18 = 0
            if (r1 == 0) goto L_0x0085
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r12 != r0) goto L_0x005b
            r13 = r22
            r2 = r18
            goto L_0x0062
        L_0x005b:
            r13 = r22
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r7.findValueInstantiator(r8, r13)
            r2 = r0
        L_0x0062:
            java.lang.Class r0 = r11.getRawClass()
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L_0x007d
            com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
            r3 = 0
            r6 = 0
            r0 = r11
            r1 = r21
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0087
        L_0x007d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x0085:
            r13 = r22
        L_0x0087:
            if (r0 != 0) goto L_0x00ff
            boolean r1 = r21.isInterface()
            if (r1 != 0) goto L_0x009f
            boolean r1 = r21.isAbstract()
            if (r1 == 0) goto L_0x0096
            goto L_0x009f
        L_0x0096:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForMap(r20, r21)
            if (r0 == 0) goto L_0x009d
            return r0
        L_0x009d:
            r2 = r13
            goto L_0x00c4
        L_0x009f:
            java.util.HashMap<java.lang.String, java.lang.Class<? extends java.util.Map>> r1 = _mapFallbacks
            java.lang.String r2 = r12.getName()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L_0x00b9
            com.fasterxml.jackson.databind.JavaType r1 = r10.constructSpecializedType(r9, r1)
            com.fasterxml.jackson.databind.type.MapType r1 = (com.fasterxml.jackson.databind.type.MapType) r1
            com.fasterxml.jackson.databind.BeanDescription r2 = r10.introspectForCreation(r1)
            r9 = r1
            goto L_0x00c4
        L_0x00b9:
            java.lang.Object r0 = r21.getTypeHandler()
            if (r0 == 0) goto L_0x00e9
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r0 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r22)
            goto L_0x009d
        L_0x00c4:
            if (r0 != 0) goto L_0x00e7
            com.fasterxml.jackson.databind.deser.ValueInstantiator r14 = r7.findValueInstantiator(r8, r2)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r12 = r0
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r3 = r2.getClassInfo()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r1 = r10.getDefaultPropertyIgnorals(r1, r3)
            if (r1 != 0) goto L_0x00de
            goto L_0x00e2
        L_0x00de:
            java.util.Set r18 = r1.findIgnoredForDeserialization()
        L_0x00e2:
            r1 = r18
            r0.setIgnorableProperties(r1)
        L_0x00e7:
            r13 = r2
            goto L_0x00ff
        L_0x00e9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find a deserializer for non-concrete Map type "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            r13 = r22
        L_0x00ff:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r7._factoryConfig
            boolean r1 = r1.hasDeserializerModifiers()
            if (r1 == 0) goto L_0x0122
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r7._factoryConfig
            java.lang.Iterable r1 = r1.deserializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x0111:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0122
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r2 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r2
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.modifyMapDeserializer(r10, r9, r13, r0)
            goto L_0x0111
        L_0x0122:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomMapLikeDeserializer = modifyMapLikeDeserializer.modifyMapLikeDeserializer(config, mapLikeType, beanDescription, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        SettableBeanProperty[] settableBeanPropertyArr;
        JsonDeserializer<?> deserializerForNoArgsCreator;
        DeserializationConfig config = deserializationContext.getConfig();
        Class rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            if (_constructDefaultValueInstantiator == null) {
                settableBeanPropertyArr = null;
            } else {
                settableBeanPropertyArr = _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            }
            Iterator it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) it.next();
                if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                    if (annotatedMethod.getParameterCount() == 0) {
                        deserializerForNoArgsCreator = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, annotatedMethod);
                        break;
                    } else if (annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                        deserializerForNoArgsCreator = EnumDeserializer.deserializerForCreator(config, rawClass, annotatedMethod, _constructDefaultValueInstantiator, settableBeanPropertyArr);
                        break;
                    }
                }
            }
            _findCustomEnumDeserializer = deserializerForNoArgsCreator;
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer<>(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyEnumDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomEnumDeserializer = modifyEnumDeserializer.modifyEnumDeserializer(config, javaType, beanDescription, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        if (_findCustomTreeNodeDeserializer != null) {
            return _findCustomTreeNodeDeserializer;
        }
        return JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) {
        ValueInstantiator valueInstantiator;
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        TypeDeserializer findTypeDeserializer = typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer;
        JsonDeserializer<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, findTypeDeserializer, jsonDeserializer);
        if (_findCustomReferenceDeserializer != null || !referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            if (_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyReferenceDeserializer : this._factoryConfig.deserializerModifiers()) {
                    _findCustomReferenceDeserializer = modifyReferenceDeserializer.modifyReferenceDeserializer(config, referenceType, beanDescription, _findCustomReferenceDeserializer);
                }
            }
            return _findCustomReferenceDeserializer;
        }
        if (referenceType.getRawClass() == AtomicReference.class) {
            valueInstantiator = null;
        } else {
            valueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
        }
        return new AtomicReferenceDeserializer(referenceType, valueInstantiator, findTypeDeserializer, jsonDeserializer);
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        Collection collection;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
            collection = null;
        } else {
            collection = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        }
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract()) {
            JavaType mapAbstractType = mapAbstractType(deserializationConfig, javaType);
            if (mapAbstractType != null && !mapAbstractType.hasRawClass(javaType.getRawClass())) {
                findTypeResolver = findTypeResolver.defaultImpl(mapAbstractType.getRawClass());
            }
        }
        try {
            return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collection);
        } catch (IllegalArgumentException e) {
            InvalidDefinitionException from = InvalidDefinitionException.from((JsonParser) null, e.getMessage(), javaType);
            from.initCause(e);
            throw from;
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        DeserializationConfig config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializer = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            BeanDescription introspectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            for (KeyDeserializers findKeyDeserializer : this._factoryConfig.keyDeserializers()) {
                keyDeserializer = findKeyDeserializer.findKeyDeserializer(javaType, config, introspectClassAnnotations);
                if (keyDeserializer != null) {
                    break;
                }
            }
        }
        if (keyDeserializer == null) {
            if (javaType.isEnumType()) {
                keyDeserializer = _createEnumKeyDeserializer(deserializationContext, javaType);
            } else {
                keyDeserializer = StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
            }
        }
        if (keyDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyKeyDeserializer : this._factoryConfig.deserializerModifiers()) {
                keyDeserializer = modifyKeyDeserializer.modifyKeyDeserializer(config, javaType, keyDeserializer);
            }
        }
        return keyDeserializer;
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        DeserializationConfig config = deserializationContext.getConfig();
        Class rawClass = javaType.getRawClass();
        BeanDescription introspect = config.introspect(javaType);
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        JsonDeserializer _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueAccessor());
        for (AnnotatedMethod annotatedMethod : introspect.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    StringBuilder sb = new StringBuilder("Unsuitable method (");
                    sb.append(annotatedMethod);
                    sb.append(") decorated with @JsonCreator (for Enum type ");
                    sb.append(rawClass.getName());
                    sb.append(")");
                    throw new IllegalArgumentException(sb.toString());
                } else if (annotatedMethod.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, annotatedMethod);
                } else {
                    StringBuilder sb2 = new StringBuilder("Parameter #0 type for factory method (");
                    sb2.append(annotatedMethod);
                    sb2.append(") not suitable, must be java.lang.String");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        TypeResolverBuilder findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        TypeResolverBuilder findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (findPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JavaType javaType2;
        JavaType javaType3;
        Class<TokenBuffer> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = _findRemappedType(config, List.class);
                javaType3 = _findRemappedType(config, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        } else if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        } else {
            if (rawClass == CLASS_ITERABLE) {
                TypeFactory typeFactory = deserializationContext.getTypeFactory();
                JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, CLASS_ITERABLE);
                return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]), beanDescription);
            } else if (rawClass == CLASS_MAP_ENTRY) {
                JavaType containedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
                JavaType containedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
                TypeDeserializer typeDeserializer = (TypeDeserializer) containedTypeOrUnknown2.getTypeHandler();
                if (typeDeserializer == null) {
                    typeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), containedTypeOrUnknown2);
                }
                return new MapEntryDeserializer(javaType, (KeyDeserializer) containedTypeOrUnknown.getValueHandler(), (JsonDeserializer) containedTypeOrUnknown2.getValueHandler(), typeDeserializer);
            } else {
                String name = rawClass.getName();
                if (rawClass.isPrimitive() || name.startsWith("java.")) {
                    JsonDeserializer<?> find = NumberDeserializers.find(rawClass, name);
                    if (find == null) {
                        find = DateDeserializers.find(rawClass, name);
                    }
                    if (find != null) {
                        return find;
                    }
                }
                if (rawClass == TokenBuffer.class) {
                    return new TokenBufferDeserializer();
                }
                JsonDeserializer<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
                if (findOptionalStdDeserializer != null) {
                    return findOptionalStdDeserializer;
                }
                return JdkDeserializers.find(rawClass, name);
            }
        }
    }

    /* access modifiers changed from: protected */
    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findReferenceDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findReferenceDeserializer2 = findReferenceDeserializer.findReferenceDeserializer(referenceType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findReferenceDeserializer2 != null) {
                return findReferenceDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findBeanDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<Object> findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findArrayDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findCollectionDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        for (Deserializers findEnumDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findMapDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        for (Deserializers findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findDeserializer = annotationIntrospector.findDeserializer(annotated);
            if (findDeserializer != null) {
                return deserializationContext.deserializerInstance(annotated, findDeserializer);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated);
            if (findKeyDeserializer != null) {
                return deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findContentDeserializer = annotationIntrospector.findContentDeserializer(annotated);
            if (findContentDeserializer != null) {
                return deserializationContext.deserializerInstance(annotated, findContentDeserializer);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null) {
            KeyDeserializer keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember));
            if (keyDeserializerInstance != null) {
                javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                javaType.getKeyType();
            }
        }
        if (javaType.hasContentType()) {
            JsonDeserializer deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (deserializerInstance != null) {
                javaType = javaType.withContentValueHandler(deserializerInstance);
            }
            TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (findPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (findPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    /* access modifiers changed from: protected */
    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector());
    }

    /* access modifiers changed from: protected */
    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Mode findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated);
            if (!(findCreatorAnnotation == null || findCreatorAnnotation == Mode.DISABLED)) {
                return true;
            }
        }
        return false;
    }
}
