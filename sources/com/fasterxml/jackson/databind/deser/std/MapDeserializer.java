package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@JacksonStdImpl
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected final KeyDeserializer _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    static class MapReferring extends Referring {
        private final MapReferringAccumulator _parent;
        public final Object key;
        public final Map<Object, Object> next = new LinkedHashMap();

        MapReferring(MapReferringAccumulator mapReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this._parent = mapReferringAccumulator;
            this.key = obj;
        }

        public void handleResolvedForwardReference(Object obj, Object obj2) {
            this._parent.resolveForwardReference(obj, obj2);
        }
    }

    static final class MapReferringAccumulator {
        private List<MapReferring> _accumulator = new ArrayList();
        private Map<Object, Object> _result;
        private final Class<?> _valueType;

        public MapReferringAccumulator(Class<?> cls, Map<Object, Object> map) {
            this._valueType = cls;
            this._result = map;
        }

        public final Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            MapReferring mapReferring = new MapReferring(this, unresolvedForwardReference, this._valueType, obj);
            this._accumulator.add(mapReferring);
            return mapReferring;
        }

        public final void put(Object obj, Object obj2) {
            if (this._accumulator.isEmpty()) {
                this._result.put(obj, obj2);
                return;
            }
            List<MapReferring> list = this._accumulator;
            ((MapReferring) list.get(list.size() - 1)).next.put(obj, obj2);
        }

        public final void resolveForwardReference(Object obj, Object obj2) {
            Iterator it = this._accumulator.iterator();
            Map<Object, Object> map = this._result;
            while (it.hasNext()) {
                MapReferring mapReferring = (MapReferring) it.next();
                if (mapReferring.hasId(obj)) {
                    it.remove();
                    map.put(mapReferring.key, obj2);
                    map.putAll(mapReferring.next);
                    return;
                }
                map = mapReferring.next;
            }
            StringBuilder sb = new StringBuilder("Trying to resolve a forward reference with id [");
            sb.append(obj);
            sb.append("] that wasn't previously seen as unresolved.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
    }

    protected MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set<String> set) {
        super((ContainerDeserializerBase<?>) mapDeserializer, nullValueProvider, mapDeserializer._unwrapSingle);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._standardStringKey = _isStdKeyDeser(this._containerType, keyDeserializer);
    }

    private void handleUnresolvedReference(DeserializationContext deserializationContext, MapReferringAccumulator mapReferringAccumulator, Object obj, UnresolvedForwardReference unresolvedForwardReference) {
        if (mapReferringAccumulator == null) {
            StringBuilder sb = new StringBuilder("Unresolved forward reference but no identity info: ");
            sb.append(unresolvedForwardReference);
            deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, sb.toString(), new Object[0]);
        }
        unresolvedForwardReference.getRoid().appendReferring(mapReferringAccumulator.handleUnresolvedReference(unresolvedForwardReference, obj));
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        String str = jsonParser.isExpectedStartObjectToken() ? jsonParser.nextFieldName() : jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.getCurrentName() : null;
        while (str != null) {
            JsonToken nextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(str)) {
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(str);
                if (findCreatorProperty == null) {
                    Object deserializeKey = this._keyDeserializer.deserializeKey(str, deserializationContext);
                    try {
                        if (nextToken != JsonToken.VALUE_NULL) {
                            obj = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        } else if (!this._skipNullValues) {
                            obj = this._nullProvider.getNullValue(deserializationContext);
                        }
                        startBuilding.bufferMapProperty(deserializeKey, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, this._containerType.getRawClass(), str);
                        return null;
                    }
                } else if (startBuilding.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        Map<Object, Object> map = (Map) propertyBasedCreator.build(deserializationContext, startBuilding);
                        _readAndBind(jsonParser, deserializationContext, map);
                        return map;
                    } catch (Exception e2) {
                        return (Map) wrapAndThrow(e2, this._containerType.getRawClass(), str);
                    }
                }
            } else {
                jsonParser.skipChildren();
            }
            str = jsonParser.nextFieldName();
        }
        try {
            return (Map) propertyBasedCreator.build(deserializationContext, startBuilding);
        } catch (Exception e3) {
            wrapAndThrow(e3, this._containerType.getRawClass(), str);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean _isStdKeyDeser(JavaType javaType, KeyDeserializer keyDeserializer) {
        if (keyDeserializer == null) {
            return true;
        }
        JavaType keyType = javaType.getKeyType();
        if (keyType == null) {
            return true;
        }
        Class<Object> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer);
    }

    /* access modifiers changed from: protected */
    public final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String str;
        Object obj;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        boolean z = jsonDeserializer.getObjectIdReader() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != JsonToken.FIELD_NAME) {
                if (currentToken != JsonToken.END_OBJECT) {
                    deserializationContext.reportWrongTokenException((JsonDeserializer<?>) this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
                } else {
                    return;
                }
            }
            str = jsonParser.getCurrentName();
        }
        while (str != null) {
            Object deserializeKey = keyDeserializer.deserializeKey(str, deserializationContext);
            JsonToken nextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(str)) {
                try {
                    if (nextToken != JsonToken.VALUE_NULL) {
                        obj = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z) {
                        mapReferringAccumulator.put(deserializeKey, obj);
                    } else {
                        map.put(deserializeKey, obj);
                    }
                } catch (UnresolvedForwardReference e) {
                    handleUnresolvedReference(deserializationContext, mapReferringAccumulator, deserializeKey, e);
                } catch (Exception e2) {
                    wrapAndThrow(e2, map, str);
                }
            } else {
                jsonParser.skipChildren();
            }
            str = jsonParser.nextFieldName();
        }
    }

    /* access modifiers changed from: protected */
    public final void _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String str;
        Object obj;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        boolean z = jsonDeserializer.getObjectIdReader() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != JsonToken.END_OBJECT) {
                if (currentToken != JsonToken.FIELD_NAME) {
                    deserializationContext.reportWrongTokenException((JsonDeserializer<?>) this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
                }
                str = jsonParser.getCurrentName();
            } else {
                return;
            }
        }
        while (str != null) {
            JsonToken nextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(str)) {
                try {
                    if (nextToken != JsonToken.VALUE_NULL) {
                        obj = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z) {
                        mapReferringAccumulator.put(str, obj);
                    } else {
                        map.put(str, obj);
                    }
                } catch (UnresolvedForwardReference e) {
                    handleUnresolvedReference(deserializationContext, mapReferringAccumulator, str, e);
                } catch (Exception e2) {
                    wrapAndThrow(e2, map, str);
                }
            } else {
                jsonParser.skipChildren();
            }
            str = jsonParser.nextFieldName();
        }
    }

    /* access modifiers changed from: protected */
    public final void _readAndUpdate(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String str;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != JsonToken.END_OBJECT) {
                if (currentToken != JsonToken.FIELD_NAME) {
                    deserializationContext.reportWrongTokenException((JsonDeserializer<?>) this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
                }
                str = jsonParser.getCurrentName();
            } else {
                return;
            }
        }
        while (str != null) {
            Object deserializeKey = keyDeserializer.deserializeKey(str, deserializationContext);
            JsonToken nextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(str)) {
                try {
                    if (nextToken != JsonToken.VALUE_NULL) {
                        Object obj = map.get(deserializeKey);
                        Object obj2 = obj != null ? jsonDeserializer.deserialize(jsonParser, deserializationContext, obj) : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        if (obj2 != obj) {
                            map.put(deserializeKey, obj2);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(deserializeKey, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(e, map, str);
                }
            } else {
                jsonParser.skipChildren();
            }
            str = jsonParser.nextFieldName();
        }
    }

    /* access modifiers changed from: protected */
    public final void _readAndUpdateStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String str;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken != JsonToken.END_OBJECT) {
                if (currentToken != JsonToken.FIELD_NAME) {
                    deserializationContext.reportWrongTokenException((JsonDeserializer<?>) this, JsonToken.FIELD_NAME, (String) null, new Object[0]);
                }
                str = jsonParser.getCurrentName();
            } else {
                return;
            }
        }
        while (str != null) {
            JsonToken nextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(str)) {
                try {
                    if (nextToken != JsonToken.VALUE_NULL) {
                        Object obj = map.get(str);
                        Object obj2 = obj != null ? jsonDeserializer.deserialize(jsonParser, deserializationContext, obj) : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        if (obj2 != obj) {
                            map.put(str, obj2);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(str, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(e, map, str);
                }
            } else {
                jsonParser.skipChildren();
            }
            str = jsonParser.nextFieldName();
        }
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (keyDeserializer instanceof ContextualKeyDeserializer) {
            keyDeserializer = ((ContextualKeyDeserializer) keyDeserializer).createContextual(deserializationContext, beanProperty);
        }
        KeyDeserializer keyDeserializer2 = keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        if (beanProperty != null) {
            jsonDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
        }
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer findContextualValueDeserializer = jsonDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        Set<String> set = this._ignorableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (_neitherNull(annotationIntrospector, beanProperty)) {
            AnnotatedMember member = beanProperty.getMember();
            if (member != null) {
                Value findPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member);
                if (findPropertyIgnorals != null) {
                    Set<String> findIgnoredForDeserialization = findPropertyIgnorals.findIgnoredForDeserialization();
                    if (!findIgnoredForDeserialization.isEmpty()) {
                        set = set == null ? new HashSet<>() : new HashSet<>(set);
                        for (String add : findIgnoredForDeserialization) {
                            set.add(add);
                        }
                    }
                }
            }
        }
        return withResolved(keyDeserializer2, typeDeserializer2, findContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer), set);
    }

    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME && currentToken != JsonToken.END_OBJECT) {
            return currentToken == JsonToken.VALUE_STRING ? (Map) this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText()) : (Map) _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        jsonParser.setCurrentValue(map);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndUpdate(jsonParser, deserializationContext, map);
        return map;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public JavaType getValueType() {
        return this._containerType;
    }

    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null;
    }

    public void resolve(DeserializationContext deserializationContext) {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{this._containerType, this._valueInstantiator.getClass().getName()}));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                deserializationContext.reportBadDefinition(this._containerType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{this._containerType, this._valueInstantiator.getClass().getName()}));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
    }

    /* access modifiers changed from: protected */
    public MapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Set<String> set) {
        if (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer && this._nullProvider == nullValueProvider && this._ignorableProperties == set) {
            return this;
        }
        MapDeserializer mapDeserializer = new MapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider, set);
        return mapDeserializer;
    }
}
