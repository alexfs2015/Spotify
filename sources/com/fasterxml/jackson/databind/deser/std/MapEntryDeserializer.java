package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

@JacksonStdImpl
public class MapEntryDeserializer extends ContainerDeserializerBase<Entry<Object, Object>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final KeyDeserializer _keyDeserializer;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public MapEntryDeserializer(JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType);
        if (javaType.containedTypeCount() == 2) {
            this._keyDeserializer = keyDeserializer;
            this._valueDeserializer = jsonDeserializer;
            this._valueTypeDeserializer = typeDeserializer;
            return;
        }
        StringBuilder sb = new StringBuilder("Missing generic type information for ");
        sb.append(javaType);
        throw new IllegalArgumentException(sb.toString());
    }

    protected MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super((ContainerDeserializerBase<?>) mapEntryDeserializer);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.containedType(0), beanProperty);
        } else if (keyDeserializer instanceof ContextualKeyDeserializer) {
            keyDeserializer = ((ContextualKeyDeserializer) keyDeserializer).createContextual(deserializationContext, beanProperty);
        }
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType containedType = this._containerType.containedType(1);
        JsonDeserializer findContextualValueDeserializer = findConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(containedType, beanProperty) : deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, containedType);
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(keyDeserializer, typeDeserializer, findContextualValueDeserializer);
    }

    public Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME && currentToken != JsonToken.END_OBJECT) {
            return (Entry) _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        if (currentToken == JsonToken.FIELD_NAME) {
            KeyDeserializer keyDeserializer = this._keyDeserializer;
            JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            String currentName = jsonParser.getCurrentName();
            Object deserializeKey = keyDeserializer.deserializeKey(currentName, deserializationContext);
            try {
                obj = jsonParser.nextToken() == JsonToken.VALUE_NULL ? jsonDeserializer.getNullValue(deserializationContext) : typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            } catch (Exception e) {
                wrapAndThrow(e, Entry.class, currentName);
                obj = null;
            }
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_OBJECT) {
                return new SimpleEntry(deserializeKey, obj);
            }
            if (nextToken == JsonToken.FIELD_NAME) {
                deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.getCurrentName());
            } else {
                StringBuilder sb = new StringBuilder("Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ");
                sb.append(nextToken);
                deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, sb.toString(), new Object[0]);
            }
            return null;
        } else if (currentToken != JsonToken.END_OBJECT) {
            return (Entry) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        } else {
            return (Entry) deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
        }
    }

    public Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Entry<Object, Object> entry) {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    /* access modifiers changed from: protected */
    public MapEntryDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer) ? this : new MapEntryDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer);
    }
}
