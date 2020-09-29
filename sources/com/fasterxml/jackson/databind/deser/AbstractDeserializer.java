package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer, Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final Map<String, SettableBeanProperty> _backRefProperties;
    protected final JavaType _baseType;
    protected final ObjectIdReader _objectIdReader;
    protected transient Map<String, SettableBeanProperty> _properties;

    protected AbstractDeserializer(BeanDescription beanDescription) {
        this._baseType = beanDescription.getType();
        this._objectIdReader = null;
        this._backRefProperties = null;
        Class rawClass = this._baseType.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = false;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class)) {
            z = true;
        }
        this._acceptDouble = z;
    }

    protected AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = objectIdReader;
        this._properties = map;
    }

    public AbstractDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        this._baseType = beanDescription.getType();
        this._objectIdReader = beanDeserializerBuilder.getObjectIdReader();
        this._backRefProperties = map;
        this._properties = map2;
        Class rawClass = this._baseType.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = false;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class)) {
            z = true;
        }
        this._acceptDouble = z;
    }

    public static AbstractDeserializer constructForNonPOJO(BeanDescription beanDescription) {
        return new AbstractDeserializer(beanDescription);
    }

    /* access modifiers changed from: protected */
    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object readObjectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ReadableObjectId findObjectId = deserializationContext.findObjectId(readObjectReference, this._objectIdReader.generator, this._objectIdReader.resolver);
        Object resolve = findObjectId.resolve();
        if (resolve != null) {
            return resolve;
        }
        StringBuilder sb = new StringBuilder("Could not resolve Object Id [");
        sb.append(readObjectReference);
        sb.append("] -- unresolved forward-reference?");
        throw new UnresolvedForwardReference(jsonParser, sb.toString(), jsonParser.getCurrentLocation(), findObjectId);
    }

    /* access modifiers changed from: protected */
    public Object _deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (jsonParser.getCurrentTokenId()) {
            case 6:
                if (this._acceptString) {
                    return jsonParser.getText();
                }
                break;
            case 7:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                break;
            case 8:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
                break;
            case 9:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                break;
            case 10:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                break;
        }
        return null;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        ObjectIdGenerator objectIdGenerator;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!(beanProperty == null || annotationIntrospector == null)) {
            AnnotatedMember member = beanProperty.getMember();
            if (member != null) {
                ObjectIdInfo findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
                if (findObjectIdInfo != null) {
                    ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, findObjectIdInfo);
                    ObjectIdInfo findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
                    Class<PropertyGenerator> generatorType = findObjectReferenceInfo.getGeneratorType();
                    if (generatorType == PropertyGenerator.class) {
                        PropertyName propertyName = findObjectReferenceInfo.getPropertyName();
                        Map<String, SettableBeanProperty> map = this._properties;
                        SettableBeanProperty settableBeanProperty2 = map == null ? null : (SettableBeanProperty) map.get(propertyName.getSimpleName());
                        if (settableBeanProperty2 == null) {
                            deserializationContext.reportBadDefinition(this._baseType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", new Object[]{handledType().getName(), propertyName}));
                        }
                        JavaType type = settableBeanProperty2.getType();
                        objectIdGenerator = new PropertyBasedObjectIdGenerator(findObjectReferenceInfo.getScope());
                        javaType = type;
                        settableBeanProperty = settableBeanProperty2;
                    } else {
                        objectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, findObjectReferenceInfo);
                        JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), ObjectIdGenerator.class)[0];
                        objectIdGenerator = deserializationContext.objectIdGeneratorInstance(member, findObjectReferenceInfo);
                        settableBeanProperty = null;
                        javaType = javaType2;
                    }
                    return new AbstractDeserializer(this, ObjectIdReader.construct(javaType, findObjectReferenceInfo.getPropertyName(), objectIdGenerator, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, objectIdResolverInstance), null);
                }
            }
        }
        return this._properties == null ? this : new AbstractDeserializer(this, this._objectIdReader, null);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return deserializationContext.handleMissingInstantiator(this._baseType.getRawClass(), new Base(this._baseType), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        if (this._objectIdReader != null) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != null) {
                if (currentToken.isScalarValue()) {
                    return _deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (currentToken == JsonToken.START_OBJECT) {
                    currentToken = jsonParser.nextToken();
                }
                if (currentToken == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.getCurrentName(), jsonParser)) {
                    return _deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        Object _deserializeIfNatural = _deserializeIfNatural(jsonParser, deserializationContext);
        return _deserializeIfNatural != null ? _deserializeIfNatural : typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return (SettableBeanProperty) map.get(str);
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public Class<?> handledType() {
        return this._baseType.getRawClass();
    }

    public boolean isCachable() {
        return true;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }
}
