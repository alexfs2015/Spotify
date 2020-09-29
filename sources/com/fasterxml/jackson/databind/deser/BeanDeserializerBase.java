package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyMetadata.MergeInfo;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer, Serializable {
    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    private static final long serialVersionUID = 1;
    protected SettableAnyProperty _anySetter;
    protected JsonDeserializer<Object> _arrayDelegateDeserializer;
    protected final Map<String, SettableBeanProperty> _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected ExternalTypeHandler _externalTypeIdHandler;
    protected final Set<String> _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final ValueInjector[] _injectables;
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final ObjectIdReader _objectIdReader;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected final Shape _serializationShape;
    protected transient HashMap<ClassKey, JsonDeserializer<Object>> _subDeserializers;
    protected UnwrappedPropertyHandler _unwrappedPropertyHandler;
    protected final ValueInstantiator _valueInstantiator;
    protected boolean _vanillaProcessing;

    /* access modifiers changed from: protected */
    public abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext);

    /* access modifiers changed from: protected */
    public abstract BeanDeserializerBase asArrayDeserializer();

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext);

    public boolean isCachable() {
        return true;
    }

    public abstract JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer);

    public abstract BeanDeserializerBase withIgnorableProperties(Set<String> set);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    protected BeanDeserializerBase(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        super(beanDescription.getType());
        this._beanType = beanDescription.getType();
        this._valueInstantiator = beanDeserializerBuilder.getValueInstantiator();
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBuilder.getAnySetter();
        List injectables = beanDeserializerBuilder.getInjectables();
        Shape shape = null;
        this._injectables = (injectables == null || injectables.isEmpty()) ? null : (ValueInjector[]) injectables.toArray(new ValueInjector[injectables.size()]);
        this._objectIdReader = beanDeserializerBuilder.getObjectIdReader();
        boolean z3 = false;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || this._valueInstantiator.canCreateUsingDelegate() || this._valueInstantiator.canCreateUsingArrayDelegate() || this._valueInstantiator.canCreateFromObjectWith() || !this._valueInstantiator.canCreateUsingDefault();
        Value findExpectedFormat = beanDescription.findExpectedFormat(null);
        if (findExpectedFormat != null) {
            shape = findExpectedFormat.getShape();
        }
        this._serializationShape = shape;
        this._needViewProcesing = z2;
        if (!this._nonStandardCreation && this._injectables == null && !this._needViewProcesing && this._objectIdReader == null) {
            z3 = true;
        }
        this._vanillaProcessing = z3;
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        UnwrappedPropertyHandler unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            if (unwrappedPropertyHandler != null) {
                unwrappedPropertyHandler = unwrappedPropertyHandler.renameAll(nameTransformer);
            }
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
            return;
        }
        this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.STD_REQUIRED));
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.withoutProperties(set);
    }

    protected BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        StringBuilder sb = new StringBuilder("Class ");
        sb.append(getClass().getName());
        sb.append(" does not override `withBeanProperties()`, needs to");
        throw new UnsupportedOperationException(sb.toString());
    }

    public void resolve(DeserializationContext deserializationContext) {
        SettableBeanProperty[] settableBeanPropertyArr;
        Builder builder = null;
        boolean z = false;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            settableBeanPropertyArr = this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            if (this._ignorableProps != null) {
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    if (this._ignorableProps.contains(settableBeanPropertyArr[i].getName())) {
                        settableBeanPropertyArr[i].markAsIgnorable();
                    }
                }
            }
        } else {
            settableBeanPropertyArr = null;
        }
        Iterator it = this._beanProperties.iterator();
        while (it.hasNext()) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) it.next();
            if (!settableBeanProperty.hasValueDeserializer()) {
                JsonDeserializer findConvertingDeserializer = findConvertingDeserializer(deserializationContext, settableBeanProperty);
                if (findConvertingDeserializer == null) {
                    findConvertingDeserializer = deserializationContext.findNonContextualValueDeserializer(settableBeanProperty.getType());
                }
                _replaceProperty(this._beanProperties, settableBeanPropertyArr, settableBeanProperty, settableBeanProperty.withValueDeserializer(findConvertingDeserializer));
            }
        }
        Iterator it2 = this._beanProperties.iterator();
        UnwrappedPropertyHandler unwrappedPropertyHandler = null;
        while (it2.hasNext()) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) it2.next();
            SettableBeanProperty _resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanProperty2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(settableBeanProperty2.getValueDeserializer(), settableBeanProperty2, settableBeanProperty2.getType())));
            if (!(_resolveManagedReferenceProperty instanceof ManagedReferenceProperty)) {
                _resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, _resolveManagedReferenceProperty);
            }
            NameTransformer _findPropertyUnwrapper = _findPropertyUnwrapper(deserializationContext, _resolveManagedReferenceProperty);
            if (_findPropertyUnwrapper != null) {
                JsonDeserializer valueDeserializer = _resolveManagedReferenceProperty.getValueDeserializer();
                JsonDeserializer unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(_findPropertyUnwrapper);
                if (!(unwrappingDeserializer == valueDeserializer || unwrappingDeserializer == null)) {
                    SettableBeanProperty withValueDeserializer = _resolveManagedReferenceProperty.withValueDeserializer(unwrappingDeserializer);
                    if (unwrappedPropertyHandler == null) {
                        unwrappedPropertyHandler = new UnwrappedPropertyHandler();
                    }
                    unwrappedPropertyHandler.addProperty(withValueDeserializer);
                    this._beanProperties.remove(withValueDeserializer);
                }
            }
            SettableBeanProperty _resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, _resolveMergeAndNullSettings(deserializationContext, _resolveManagedReferenceProperty, _resolveManagedReferenceProperty.getMetadata()));
            if (_resolveInnerClassValuedProperty != settableBeanProperty2) {
                _replaceProperty(this._beanProperties, settableBeanPropertyArr, settableBeanProperty2, _resolveInnerClassValuedProperty);
            }
            if (_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                TypeDeserializer valueTypeDeserializer = _resolveInnerClassValuedProperty.getValueTypeDeserializer();
                if (valueTypeDeserializer.getTypeInclusion() == As.EXTERNAL_PROPERTY) {
                    if (builder == null) {
                        builder = ExternalTypeHandler.builder(this._beanType);
                    }
                    builder.addExternal(_resolveInnerClassValuedProperty, valueTypeDeserializer);
                    this._beanProperties.remove(_resolveInnerClassValuedProperty);
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null && !settableAnyProperty.hasValueDeserializer()) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._beanType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{javaType, this._valueInstantiator.getClass().getName()}));
            }
            this._delegateDeserializer = _findDelegateDeserializer(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._beanType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{javaType2, this._valueInstantiator.getClass().getName()}));
            }
            this._arrayDelegateDeserializer = _findDelegateDeserializer(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (settableBeanPropertyArr != null) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, settableBeanPropertyArr, this._beanProperties);
        }
        if (builder != null) {
            this._externalTypeIdHandler = builder.build(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandler;
        if (unwrappedPropertyHandler != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z = true;
        }
        this._vanillaProcessing = z;
    }

    /* access modifiers changed from: protected */
    public void _replaceProperty(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        beanPropertyMap.replace(settableBeanProperty, settableBeanProperty2);
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i = 0; i < length; i++) {
                if (settableBeanPropertyArr[i] == settableBeanProperty) {
                    settableBeanPropertyArr[i] = settableBeanProperty2;
                    return;
                }
            }
        }
    }

    private JsonDeserializer<Object> _findDelegateDeserializer(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) {
        JsonDeserializer<Object> jsonDeserializer;
        Std std = new Std(TEMP_PROPERTY_NAME, javaType, null, annotatedWithParams, PropertyMetadata.STD_OPTIONAL);
        TypeDeserializer typeDeserializer = (TypeDeserializer) javaType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = deserializationContext.getConfig().findTypeDeserializer(javaType);
        }
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) javaType.getValueHandler();
        if (jsonDeserializer2 == null) {
            jsonDeserializer = findDeserializer(deserializationContext, javaType, std);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, std, javaType);
        }
        return typeDeserializer != null ? new TypeWrappedDeserializer(typeDeserializer.forProperty(std), jsonDeserializer) : jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember());
            if (findDeserializationConverter != null) {
                Converter converterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), findDeserializationConverter);
                JavaType inputType = converterInstance.getInputType(deserializationContext.getTypeFactory());
                return new StdDelegatingDeserializer(converterInstance, inputType, deserializationContext.findNonContextualValueDeserializer(inputType));
            }
        }
        return null;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        SettableBeanProperty settableBeanProperty;
        ObjectIdGenerator objectIdGenerator;
        JavaType javaType;
        ObjectIdReader objectIdReader = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        Shape shape = null;
        Annotated member = _neitherNull(beanProperty, annotationIntrospector) ? beanProperty.getMember() : null;
        if (member != null) {
            ObjectIdInfo findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (findObjectIdInfo != null) {
                ObjectIdInfo findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
                Class<PropertyGenerator> generatorType = findObjectReferenceInfo.getGeneratorType();
                ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, findObjectReferenceInfo);
                if (generatorType == PropertyGenerator.class) {
                    PropertyName propertyName = findObjectReferenceInfo.getPropertyName();
                    SettableBeanProperty findProperty = findProperty(propertyName);
                    if (findProperty == null) {
                        deserializationContext.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", new Object[]{handledType().getName(), propertyName}));
                    }
                    javaType = findProperty.getType();
                    settableBeanProperty = findProperty;
                    objectIdGenerator = new PropertyBasedObjectIdGenerator(findObjectReferenceInfo.getScope());
                } else {
                    javaType = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), ObjectIdGenerator.class)[0];
                    settableBeanProperty = null;
                    objectIdGenerator = deserializationContext.objectIdGeneratorInstance(member, findObjectReferenceInfo);
                }
                JavaType javaType2 = javaType;
                objectIdReader = ObjectIdReader.construct(javaType2, findObjectReferenceInfo.getPropertyName(), objectIdGenerator, deserializationContext.findRootValueDeserializer(javaType2), settableBeanProperty, objectIdResolverInstance);
            }
        }
        BeanDeserializerBase withObjectIdReader = (objectIdReader == null || objectIdReader == this._objectIdReader) ? this : withObjectIdReader(objectIdReader);
        if (member != null) {
            JsonIgnoreProperties.Value findPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member);
            if (findPropertyIgnorals != null) {
                Set findIgnoredForDeserialization = findPropertyIgnorals.findIgnoredForDeserialization();
                if (!findIgnoredForDeserialization.isEmpty()) {
                    Set<String> set = withObjectIdReader._ignorableProps;
                    if (set != null && !set.isEmpty()) {
                        Set hashSet = new HashSet(findIgnoredForDeserialization);
                        hashSet.addAll(set);
                        findIgnoredForDeserialization = hashSet;
                    }
                    withObjectIdReader = withObjectIdReader.withIgnorableProperties(findIgnoredForDeserialization);
                }
            }
        }
        Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (findFormatOverrides != null) {
            if (findFormatOverrides.hasShape()) {
                shape = findFormatOverrides.getShape();
            }
            Boolean feature = findFormatOverrides.getFeature(Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (feature != null) {
                BeanPropertyMap beanPropertyMap = this._beanProperties;
                BeanPropertyMap withCaseInsensitivity = beanPropertyMap.withCaseInsensitivity(feature.booleanValue());
                if (withCaseInsensitivity != beanPropertyMap) {
                    withObjectIdReader = withObjectIdReader.withBeanProperties(withCaseInsensitivity);
                }
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == Shape.ARRAY ? withObjectIdReader.asArrayDeserializer() : withObjectIdReader;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty findBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (findBackReference == null) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference '%s': no back reference property found from type %s", new Object[]{managedReferenceName, settableBeanProperty.getType()}));
        }
        JavaType javaType = this._beanType;
        JavaType type = findBackReference.getType();
        boolean isContainerType = settableBeanProperty.getType().isContainerType();
        if (!type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference '%s': back reference type (%s) not compatible with managed type (%s)", new Object[]{managedReferenceName, type.getRawClass().getName(), javaType.getRawClass().getName()}));
        }
        return new ManagedReferenceProperty(settableBeanProperty, managedReferenceName, findBackReference, isContainerType);
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        ObjectIdReader objectIdReader;
        ObjectIdInfo objectIdInfo = settableBeanProperty.getObjectIdInfo();
        JsonDeserializer valueDeserializer = settableBeanProperty.getValueDeserializer();
        if (valueDeserializer == null) {
            objectIdReader = null;
        } else {
            objectIdReader = valueDeserializer.getObjectIdReader();
        }
        if (objectIdInfo == null && objectIdReader == null) {
            return settableBeanProperty;
        }
        return new ObjectIdReferenceProperty(settableBeanProperty, objectIdInfo);
    }

    /* access modifiers changed from: protected */
    public NameTransformer _findPropertyUnwrapper(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member != null) {
            NameTransformer findUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member);
            if (findUnwrappingNameTransformer != null) {
                if (settableBeanProperty instanceof CreatorProperty) {
                    deserializationContext.reportBadDefinition(getValueType(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", new Object[]{settableBeanProperty.getName()}));
                }
                return findUnwrappingNameTransformer;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        JsonDeserializer valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault()) {
            Class rawClass = settableBeanProperty.getType().getRawClass();
            Class outerClass = ClassUtil.getOuterClass(rawClass);
            if (outerClass != null && outerClass == this._beanType.getRawClass()) {
                Constructor[] constructors = rawClass.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (i < length) {
                    Constructor constructor = constructors[i];
                    Class[] parameterTypes = constructor.getParameterTypes();
                    if (parameterTypes.length != 1 || !outerClass.equals(parameterTypes[0])) {
                        i++;
                    } else {
                        if (deserializationContext.canOverrideAccessModifiers()) {
                            ClassUtil.checkAndFixAccess(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        return new InnerClassProperty(settableBeanProperty, constructor);
                    }
                }
            }
        }
        return settableBeanProperty;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty _resolveMergeAndNullSettings(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) {
        MergeInfo mergeInfo = propertyMetadata.getMergeInfo();
        if (mergeInfo != null) {
            JsonDeserializer valueDeserializer = settableBeanProperty.getValueDeserializer();
            Boolean supportsUpdate = valueDeserializer.supportsUpdate(deserializationContext.getConfig());
            if (supportsUpdate == null) {
                if (mergeInfo.fromDefaults) {
                    return settableBeanProperty;
                }
            } else if (!supportsUpdate.booleanValue()) {
                if (!mergeInfo.fromDefaults) {
                    deserializationContext.reportBadMerge(valueDeserializer);
                }
                return settableBeanProperty;
            }
            AnnotatedMember annotatedMember = mergeInfo.getter;
            annotatedMember.fixAccess(deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            if (!(settableBeanProperty instanceof SetterlessProperty)) {
                settableBeanProperty = MergingSettableBeanProperty.construct(settableBeanProperty, annotatedMember);
            }
        }
        NullValueProvider findValueNullProvider = findValueNullProvider(deserializationContext, settableBeanProperty, propertyMetadata);
        if (findValueNullProvider != null) {
            settableBeanProperty = settableBeanProperty.withNullProvider(findValueNullProvider);
        }
        return settableBeanProperty;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) {
        try {
            return this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return ClassUtil.throwAsMappingException(deserializationContext, e);
        }
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(((SettableBeanProperty) it.next()).getName());
        }
        return arrayList;
    }

    public JavaType getValueType() {
        return this._beanType;
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return findProperty(propertyName.getSimpleName());
    }

    public SettableBeanProperty findProperty(String str) {
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty find = beanPropertyMap == null ? null : beanPropertyMap.find(str);
        if (find != null) {
            return find;
        }
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        return propertyBasedCreator != null ? propertyBasedCreator.findCreatorProperty(str) : find;
    }

    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return (SettableBeanProperty) map.get(str);
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        if (this._objectIdReader != null) {
            if (jsonParser.canReadObjectId()) {
                Object objectId = jsonParser.getObjectId();
                if (objectId != null) {
                    return _handleTypedObjectId(jsonParser, deserializationContext, typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext), objectId);
                }
            }
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != null) {
                if (currentToken.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (currentToken == JsonToken.START_OBJECT) {
                    currentToken = jsonParser.nextToken();
                }
                if (currentToken == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.getCurrentName(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) {
        JsonDeserializer deserializer = this._objectIdReader.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, deserializer);
        }
        deserializationContext.findObjectId(obj2, this._objectIdReader.generator, this._objectIdReader.resolver).bindItem(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, obj2) : obj;
    }

    /* access modifiers changed from: protected */
    public Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, JsonDeserializer<Object> jsonDeserializer) {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        if (obj instanceof String) {
            tokenBuffer.writeString((String) obj);
        } else if (obj instanceof Long) {
            tokenBuffer.writeNumber(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            tokenBuffer.writeNumber(((Integer) obj).intValue());
        } else {
            tokenBuffer.writeObject(obj);
        }
        JsonParser asParser = tokenBuffer.asParser();
        asParser.nextToken();
        return jsonDeserializer.deserialize(asParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object readObjectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ReadableObjectId findObjectId = deserializationContext.findObjectId(readObjectReference, this._objectIdReader.generator, this._objectIdReader.resolver);
        Object resolve = findObjectId.resolve();
        if (resolve != null) {
            return resolve;
        }
        StringBuilder sb = new StringBuilder("Could not resolve Object Id [");
        sb.append(readObjectReference);
        sb.append("] (for ");
        sb.append(this._beanType);
        sb.append(").");
        throw new UnresolvedForwardReference(jsonParser, sb.toString(), jsonParser.getCurrentLocation(), findObjectId);
    }

    /* access modifiers changed from: protected */
    public Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        Class rawClass = this._beanType.getRawClass();
        if (ClassUtil.isNonStaticInnerClass(rawClass)) {
            return deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "can only instantiate non-static inner class by using default, no-argument constructor", new Object[0]);
        }
        return deserializationContext.handleMissingInstantiator(rawClass, getValueInstantiator(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer _delegateDeserializer2 = _delegateDeserializer();
        NumberType numberType = jsonParser.getNumberType();
        if (numberType == NumberType.INT) {
            if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.getIntValue());
            }
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        } else if (numberType == NumberType.LONG) {
            if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.getLongValue());
            }
            Object createUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate2);
            }
            return createUsingDelegate2;
        } else if (_delegateDeserializer2 != null) {
            Object createUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate3);
            }
            return createUsingDelegate3;
        } else {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
        }
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromString()) {
            return this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) {
        NumberType numberType = jsonParser.getNumberType();
        if (numberType == NumberType.DOUBLE || numberType == NumberType.FLOAT) {
            JsonDeserializer _delegateDeserializer2 = _delegateDeserializer();
            if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromDouble()) {
                return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.getDoubleValue());
            }
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        }
        JsonDeserializer _delegateDeserializer3 = _delegateDeserializer();
        if (_delegateDeserializer3 != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer3.deserialize(jsonParser, deserializationContext));
        }
        return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromBoolean()) {
            return this._valueInstantiator.createFromBoolean(deserializationContext, jsonParser.getCurrentToken() == JsonToken.VALUE_TRUE);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._arrayDelegateDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = this._delegateDeserializer;
            if (jsonDeserializer == null) {
                if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                    if (jsonParser.nextToken() == JsonToken.END_ARRAY && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                        return null;
                    }
                    Object deserialize = deserialize(jsonParser, deserializationContext);
                    if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                    }
                    return deserialize;
                } else if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                    return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
                } else {
                    if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                        return null;
                    }
                    return deserializationContext.handleUnexpectedToken(handledType(), JsonToken.START_ARRAY, jsonParser, null, new Object[0]);
                }
            }
        }
        Object createUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingArrayDelegate);
        }
        return createUsingArrayDelegate;
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromString()) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            if (embeddedObject != null && !this._beanType.isTypeOrSuperTypeOf(embeddedObject.getClass())) {
                embeddedObject = deserializationContext.handleWeirdNativeValue(this._beanType, embeddedObject, jsonParser);
            }
            return embeddedObject;
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    private final JsonDeserializer<Object> _delegateDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer == null ? this._arrayDelegateDeserializer : jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public void injectValues(DeserializationContext deserializationContext, Object obj) {
        for (ValueInjector inject : this._injectables) {
            inject.inject(deserializationContext, obj);
        }
    }

    /* access modifiers changed from: protected */
    public Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        tokenBuffer.writeEndObject();
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = asParser.getCurrentName();
            asParser.nextToken();
            handleUnknownProperty(asParser, deserializationContext, obj, currentName);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        Set<String> set = this._ignorableProps;
        if (set == null || !set.contains(str)) {
            SettableAnyProperty settableAnyProperty = this._anySetter;
            if (settableAnyProperty != null) {
                try {
                    settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, str, deserializationContext);
                }
            } else {
                handleUnknownProperty(jsonParser, deserializationContext, obj, str);
            }
        } else {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (this._ignoreAllUnknown) {
            jsonParser.skipChildren();
            return;
        }
        Set<String> set = this._ignorableProps;
        if (set != null && set.contains(str)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    /* access modifiers changed from: protected */
    public void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            jsonParser.skipChildren();
            return;
        }
        throw IgnoredPropertyException.from(jsonParser, obj, str, getKnownPropertyNames());
    }

    /* access modifiers changed from: protected */
    public Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        JsonDeserializer _findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, tokenBuffer);
        if (_findSubclassDeserializer != null) {
            if (tokenBuffer != null) {
                tokenBuffer.writeEndObject();
                JsonParser asParser = tokenBuffer.asParser();
                asParser.nextToken();
                obj = _findSubclassDeserializer.deserialize(asParser, deserializationContext, obj);
            }
            if (jsonParser != null) {
                obj = _findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj);
            }
            return obj;
        }
        if (tokenBuffer != null) {
            obj = handleUnknownProperties(deserializationContext, obj, tokenBuffer);
        }
        if (jsonParser != null) {
            obj = deserialize(jsonParser, deserializationContext, obj);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) {
        JsonDeserializer<Object> jsonDeserializer;
        synchronized (this) {
            jsonDeserializer = this._subDeserializers == null ? null : (JsonDeserializer) this._subDeserializers.get(new ClassKey(obj.getClass()));
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (findRootValueDeserializer != null) {
            synchronized (this) {
                if (this._subDeserializers == null) {
                    this._subDeserializers = new HashMap<>();
                }
                this._subDeserializers.put(new ClassKey(obj.getClass()), findRootValueDeserializer);
            }
        }
        return findRootValueDeserializer;
    }

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonProcessingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            ClassUtil.throwIfRTE(th);
        }
        return th;
    }

    /* access modifiers changed from: protected */
    public Object wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        if (!(th instanceof IOException)) {
            if (!(deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))) {
                ClassUtil.throwIfRTE(th);
            }
            return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), null, th);
        }
        throw ((IOException) th);
    }
}
