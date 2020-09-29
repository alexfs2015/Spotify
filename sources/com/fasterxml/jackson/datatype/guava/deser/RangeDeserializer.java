package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.guava.deser.util.RangeFactory;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
import java.util.Arrays;

public class RangeDeserializer extends StdDeserializer<Range<?>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    private BoundType _defaultBoundType;
    protected final JsonDeserializer<Object> _endpointDeserializer;
    protected final JavaType _rangeType;

    public RangeDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer) {
        super(javaType);
        this._rangeType = javaType;
        this._endpointDeserializer = jsonDeserializer;
    }

    public RangeDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer, BoundType boundType) {
        super(javaType);
        this._rangeType = javaType;
        this._endpointDeserializer = jsonDeserializer;
        this._defaultBoundType = boundType;
    }

    public RangeDeserializer(BoundType boundType, JavaType javaType) {
        this(javaType, null);
        this._defaultBoundType = boundType;
    }

    private BoundType deserializeBoundType(DeserializationContext deserializationContext, JsonParser jsonParser) {
        expect(deserializationContext, JsonToken.VALUE_STRING, jsonParser.getCurrentToken());
        String text = jsonParser.getText();
        try {
            return BoundType.valueOf(text);
        } catch (IllegalArgumentException unused) {
            return (BoundType) deserializationContext.handleWeirdStringValue(BoundType.class, text, "not a valid BoundType name (should be one oF: %s)", Arrays.asList(BoundType.values()));
        }
    }

    private Comparable<?> deserializeEndpoint(DeserializationContext deserializationContext, JsonParser jsonParser) {
        Object deserialize = this._endpointDeserializer.deserialize(jsonParser, deserializationContext);
        if (!(deserialize instanceof Comparable)) {
            deserializationContext.reportBadDefinition(this._rangeType, String.format("Field [%s] deserialized to [%s], which does not implement Comparable.", new Object[]{jsonParser.getCurrentName(), deserialize.getClass().getName()}));
        }
        return (Comparable) deserialize;
    }

    private void expect(DeserializationContext deserializationContext, JsonToken jsonToken, JsonToken jsonToken2) {
        if (jsonToken2 != jsonToken) {
            deserializationContext.reportInputMismatch((JsonDeserializer<?>) this, String.format("Problem deserializing %s: expecting %s, found %s", new Object[]{handledType().getName(), jsonToken, jsonToken2}), new Object[0]);
        }
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (this._endpointDeserializer != null) {
            return this;
        }
        JavaType containedType = this._rangeType.containedType(0);
        if (containedType == null) {
            containedType = TypeFactory.unknownType();
        }
        return new RangeDeserializer(this._rangeType, deserializationContext.findContextualValueDeserializer(containedType, beanProperty), this._defaultBoundType);
    }

    public Range<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        Comparable comparable = null;
        BoundType boundType = this._defaultBoundType;
        BoundType boundType2 = boundType;
        Comparable comparable2 = null;
        while (currentToken != JsonToken.END_OBJECT) {
            expect(deserializationContext, JsonToken.FIELD_NAME, currentToken);
            String currentName = jsonParser.getCurrentName();
            try {
                if (currentName.equals("lowerEndpoint")) {
                    jsonParser.nextToken();
                    comparable = deserializeEndpoint(deserializationContext, jsonParser);
                } else if (currentName.equals("upperEndpoint")) {
                    jsonParser.nextToken();
                    comparable2 = deserializeEndpoint(deserializationContext, jsonParser);
                } else if (currentName.equals("lowerBoundType")) {
                    jsonParser.nextToken();
                    boundType = deserializeBoundType(deserializationContext, jsonParser);
                } else if (currentName.equals("upperBoundType")) {
                    jsonParser.nextToken();
                    boundType2 = deserializeBoundType(deserializationContext, jsonParser);
                } else {
                    deserializationContext.handleUnknownProperty(jsonParser, this, Range.class, currentName);
                }
                currentToken = jsonParser.nextToken();
            } catch (IllegalStateException e) {
                throw JsonMappingException.from(jsonParser, e.getMessage());
            }
        }
        String str = "'upperEndpoint' field found, but not 'upperBoundType'";
        String str2 = "'lowerEndpoint' field found, but not 'lowerBoundType'";
        boolean z = true;
        if (comparable != null && comparable2 != null) {
            try {
                String str3 = "Endpoint types are not the same - 'lowerEndpoint' deserialized to [%s], and 'upperEndpoint' deserialized to [%s].";
                Object[] objArr = {comparable.getClass().getName(), comparable2.getClass().getName()};
                if (comparable.getClass() == comparable2.getClass()) {
                    fbp.b(boundType != null, str2);
                    if (boundType2 == null) {
                        z = false;
                    }
                    fbp.b(z, str);
                    return RangeFactory.range(comparable, boundType, comparable2, boundType2);
                }
                throw new IllegalStateException(fbt.a(str3, objArr));
            } catch (IllegalStateException e2) {
                throw JsonMappingException.from(jsonParser, e2.getMessage());
            }
        } else if (comparable != null) {
            if (boundType == null) {
                z = false;
            }
            fbp.b(z, str2);
            return RangeFactory.downTo(comparable, boundType);
        } else if (comparable2 == null) {
            return RangeFactory.all();
        } else {
            if (boundType2 == null) {
                z = false;
            }
            fbp.b(z, str);
            return RangeFactory.upTo(comparable2, boundType2);
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public JavaType getValueType() {
        return this._rangeType;
    }
}
