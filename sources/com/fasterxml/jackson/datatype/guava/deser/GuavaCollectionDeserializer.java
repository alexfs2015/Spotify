package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;

public abstract class GuavaCollectionDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final CollectionType _containerType;
    protected final TypeDeserializer _typeDeserializerForValue;
    protected final JsonDeserializer<?> _valueDeserializer;

    /* access modifiers changed from: protected */
    public abstract T _deserializeContents(JsonParser jsonParser, DeserializationContext deserializationContext);

    /* access modifiers changed from: protected */
    public abstract T _deserializeFromSingleValue(JsonParser jsonParser, DeserializationContext deserializationContext);

    public abstract GuavaCollectionDeserializer<T> withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer);

    protected GuavaCollectionDeserializer(CollectionType collectionType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super((JavaType) collectionType);
        this._containerType = collectionType;
        this._typeDeserializerForValue = typeDeserializer;
        this._valueDeserializer = jsonDeserializer;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._typeDeserializerForValue;
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(this._containerType.getContentType(), beanProperty);
        }
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        if (jsonDeserializer == this._valueDeserializer && typeDeserializer == this._typeDeserializerForValue) {
            return this;
        }
        return withResolved(typeDeserializer, jsonDeserializer);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.isExpectedStartArrayToken()) {
            return _deserializeContents(jsonParser, deserializationContext);
        }
        if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            return _deserializeFromSingleValue(jsonParser, deserializationContext);
        }
        return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }
}
