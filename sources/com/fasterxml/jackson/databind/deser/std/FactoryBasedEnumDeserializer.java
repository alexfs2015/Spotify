package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;

class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final SettableBeanProperty[] _creatorProps;
    protected final JsonDeserializer<?> _deser;
    protected final AnnotatedMethod _factory;
    protected final boolean _hasArgs;
    protected final JavaType _inputType;
    private transient PropertyBasedCreator _propCreator;
    protected final ValueInstantiator _valueInstantiator;

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = true;
        if (javaType.hasRawClass(String.class)) {
            javaType = null;
        }
        this._inputType = javaType;
        this._deser = null;
        this._valueInstantiator = valueInstantiator;
        this._creatorProps = settableBeanPropertyArr;
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = false;
        this._inputType = null;
        this._deser = null;
        this._valueInstantiator = null;
        this._creatorProps = null;
    }

    protected FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(factoryBasedEnumDeserializer._valueClass);
        this._inputType = factoryBasedEnumDeserializer._inputType;
        this._factory = factoryBasedEnumDeserializer._factory;
        this._hasArgs = factoryBasedEnumDeserializer._hasArgs;
        this._valueInstantiator = factoryBasedEnumDeserializer._valueInstantiator;
        this._creatorProps = factoryBasedEnumDeserializer._creatorProps;
        this._deser = jsonDeserializer;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        if (this._deser == null) {
            JavaType javaType = this._inputType;
            if (javaType != null && this._creatorProps == null) {
                return new FactoryBasedEnumDeserializer(this, deserializationContext.findContextualValueDeserializer(javaType, beanProperty));
            }
        }
        return this;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        JsonDeserializer<?> jsonDeserializer = this._deser;
        if (jsonDeserializer != null) {
            obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else if (this._hasArgs) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING || currentToken == JsonToken.FIELD_NAME) {
                obj = jsonParser.getText();
            } else if (this._creatorProps == null || !jsonParser.isExpectedStartObjectToken()) {
                obj = jsonParser.getValueAsString();
            } else {
                if (this._propCreator == null) {
                    this._propCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._creatorProps, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.nextToken();
                return deserializeEnumUsingPropertyBased(jsonParser, deserializationContext, this._propCreator);
            }
        } else {
            jsonParser.skipChildren();
            try {
                return this._factory.call();
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._valueClass, null, ClassUtil.throwRootCauseIfIOE(e));
            }
        }
        try {
            return this._factory.callOnWith(this._valueClass, obj);
        } catch (Exception e2) {
            Throwable throwRootCauseIfIOE = ClassUtil.throwRootCauseIfIOE(e2);
            if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) || !(throwRootCauseIfIOE instanceof IllegalArgumentException)) {
                return deserializationContext.handleInstantiationProblem(this._valueClass, obj, throwRootCauseIfIOE);
            }
            return null;
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        if (this._deser == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Object deserializeEnumUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyBasedCreator propertyBasedCreator) {
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty));
            } else {
                startBuilding.readIdProperty(currentName);
            }
            currentToken = jsonParser.nextToken();
        }
        return propertyBasedCreator.build(deserializationContext, startBuilding);
    }

    /* access modifiers changed from: protected */
    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            return wrapAndThrow(e, handledType(), settableBeanProperty.getName(), deserializationContext);
        }
    }

    /* access modifiers changed from: protected */
    public Object wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) {
        Throwable rootCause = ClassUtil.getRootCause(th);
        ClassUtil.throwIfError(rootCause);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (rootCause instanceof IOException) {
            if (!z || !(rootCause instanceof JsonProcessingException)) {
                throw ((IOException) rootCause);
            }
        } else if (!z) {
            ClassUtil.throwIfRTE(rootCause);
        }
        return rootCause;
    }
}
