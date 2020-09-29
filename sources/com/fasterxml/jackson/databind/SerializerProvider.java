package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class SerializerProvider extends DatabindContext {
    public static final JsonSerializer<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final JsonSerializer<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected transient ContextAttributes _attributes;
    protected final SerializationConfig _config;
    protected DateFormat _dateFormat;
    protected JsonSerializer<Object> _keySerializer;
    protected final ReadOnlyClassToSerializerMap _knownSerializers;
    protected JsonSerializer<Object> _nullKeySerializer;
    protected JsonSerializer<Object> _nullValueSerializer;
    protected final Class<?> _serializationView;
    protected final SerializerCache _serializerCache;
    protected final SerializerFactory _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected JsonSerializer<Object> _unknownTypeSerializer;

    public SerializerProvider() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new SerializerCache();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    protected SerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        JsonSerializer<Object> jsonSerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = jsonSerializer;
        this._serializerFactory = serializerFactory;
        this._config = serializationConfig;
        this._serializerCache = serializerProvider._serializerCache;
        this._unknownTypeSerializer = serializerProvider._unknownTypeSerializer;
        this._keySerializer = serializerProvider._keySerializer;
        this._nullValueSerializer = serializerProvider._nullValueSerializer;
        this._nullKeySerializer = serializerProvider._nullKeySerializer;
        this._stdNullValueSerializer = this._nullValueSerializer == jsonSerializer;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = this._serializerCache.getReadOnlyLookupMap();
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _createAndCacheUntypedSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        try {
            jsonSerializer = _createUntypedSerializer(javaType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, e.getMessage(), new Object[0]);
            jsonSerializer = null;
        }
        if (jsonSerializer != null) {
            this._serializerCache.addAndResolveNonTypedSerializer(javaType, jsonSerializer, this);
        }
        return jsonSerializer;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _createAndCacheUntypedSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        JavaType constructType = this._config.constructType(cls);
        try {
            jsonSerializer = _createUntypedSerializer(constructType);
        } catch (IllegalArgumentException e) {
            reportMappingProblem(e, e.getMessage(), new Object[0]);
            jsonSerializer = null;
        }
        if (jsonSerializer != null) {
            this._serializerCache.addAndResolveNonTypedSerializer(cls, constructType, jsonSerializer, this);
        }
        return jsonSerializer;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _createUntypedSerializer(JavaType javaType) {
        JsonSerializer<Object> createSerializer;
        synchronized (this._serializerCache) {
            createSerializer = this._serializerFactory.createSerializer(this, javaType);
        }
        return createSerializer;
    }

    /* access modifiers changed from: protected */
    public final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _findExplicitUntypedSerializer(Class<?> cls) {
        JsonSerializer<Object> untypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(cls);
            if (untypedValueSerializer == null) {
                untypedValueSerializer = _createAndCacheUntypedSerializer(cls);
            }
        }
        if (isUnknownTypeSerializer(untypedValueSerializer)) {
            return null;
        }
        return untypedValueSerializer;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _handleContextualResolvable(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return handleSecondaryContextualization(jsonSerializer, beanProperty);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _handleResolvable(JsonSerializer<?> jsonSerializer) {
        if (jsonSerializer instanceof ResolvableSerializer) {
            ((ResolvableSerializer) jsonSerializer).resolve(this);
        }
        return jsonSerializer;
    }

    /* access modifiers changed from: protected */
    public void _reportIncompatibleRootType(Object obj, JavaType javaType) {
        if (!javaType.isPrimitive() || !ClassUtil.wrapperType(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            reportBadDefinition(javaType, String.format("Incompatible types: declared root type (%s) vs %s", new Object[]{javaType, ClassUtil.classNameOf(obj)}));
        }
    }

    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public void defaultSerializeDateKey(long j, JsonGenerator jsonGenerator) {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(j));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(new Date(j)));
        }
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.writeFieldName(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.writeFieldName(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.writeNumber(date.getTime());
        } else {
            jsonGenerator.writeString(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) {
        jsonGenerator.writeFieldName(str);
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.writeNull();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) {
        if (this._stdNullValueSerializer) {
            jsonGenerator.writeNull();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) {
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.writeNull();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public JsonSerializer<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this._config, javaType, this._keySerializer), beanProperty);
    }

    public JsonSerializer<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public JsonSerializer<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) {
        return this._nullKeySerializer;
    }

    public JsonSerializer<Object> findNullValueSerializer(BeanProperty beanProperty) {
        return this._nullValueSerializer;
    }

    public abstract WritableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public JsonSerializer<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) {
        JsonSerializer untypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType);
            if (untypedValueSerializer == null) {
                untypedValueSerializer = _createAndCacheUntypedSerializer(javaType);
                if (untypedValueSerializer == null) {
                    return getUnknownTypeSerializer(javaType.getRawClass());
                }
            }
        }
        return handlePrimaryContextualization(untypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) {
        JsonSerializer untypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(cls);
            if (untypedValueSerializer == null) {
                untypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls));
                if (untypedValueSerializer == null) {
                    untypedValueSerializer = _createAndCacheUntypedSerializer(cls);
                    if (untypedValueSerializer == null) {
                        return getUnknownTypeSerializer(cls);
                    }
                }
            }
        }
        return handlePrimaryContextualization(untypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) {
        JsonSerializer<Object> typedValueSerializer = this._knownSerializers.typedValueSerializer(javaType);
        if (typedValueSerializer != null) {
            return typedValueSerializer;
        }
        JsonSerializer<Object> typedValueSerializer2 = this._serializerCache.typedValueSerializer(javaType);
        if (typedValueSerializer2 != null) {
            return typedValueSerializer2;
        }
        JsonSerializer<Object> findValueSerializer = findValueSerializer(javaType, beanProperty);
        TypeSerializer createTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (createTypeSerializer != null) {
            findValueSerializer = new TypeWrappedSerializer<>(createTypeSerializer.forProperty(beanProperty), findValueSerializer);
        }
        if (z) {
            this._serializerCache.addTypedSerializer(javaType, findValueSerializer);
        }
        return findValueSerializer;
    }

    public JsonSerializer<Object> findTypedValueSerializer(Class<?> cls, boolean z, BeanProperty beanProperty) {
        JsonSerializer<Object> typedValueSerializer = this._knownSerializers.typedValueSerializer(cls);
        if (typedValueSerializer != null) {
            return typedValueSerializer;
        }
        JsonSerializer<Object> typedValueSerializer2 = this._serializerCache.typedValueSerializer(cls);
        if (typedValueSerializer2 != null) {
            return typedValueSerializer2;
        }
        JsonSerializer<Object> findValueSerializer = findValueSerializer(cls, beanProperty);
        SerializerFactory serializerFactory = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        TypeSerializer createTypeSerializer = serializerFactory.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (createTypeSerializer != null) {
            findValueSerializer = new TypeWrappedSerializer<>(createTypeSerializer.forProperty(beanProperty), findValueSerializer);
        }
        if (z) {
            this._serializerCache.addTypedSerializer(cls, findValueSerializer);
        }
        return findValueSerializer;
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType) {
        JsonSerializer<Object> untypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (untypedValueSerializer != null) {
            return untypedValueSerializer;
        }
        JsonSerializer<Object> untypedValueSerializer2 = this._serializerCache.untypedValueSerializer(javaType);
        if (untypedValueSerializer2 != null) {
            return untypedValueSerializer2;
        }
        JsonSerializer<Object> _createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(javaType);
        return _createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(javaType.getRawClass()) : _createAndCacheUntypedSerializer;
    }

    public JsonSerializer<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        JsonSerializer untypedValueSerializer = this._knownSerializers.untypedValueSerializer(javaType);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(javaType);
            if (untypedValueSerializer == null) {
                untypedValueSerializer = _createAndCacheUntypedSerializer(javaType);
                if (untypedValueSerializer == null) {
                    return getUnknownTypeSerializer(javaType.getRawClass());
                }
            }
        }
        return handleSecondaryContextualization(untypedValueSerializer, beanProperty);
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls) {
        JsonSerializer<Object> untypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (untypedValueSerializer != null) {
            return untypedValueSerializer;
        }
        JsonSerializer<Object> untypedValueSerializer2 = this._serializerCache.untypedValueSerializer(cls);
        if (untypedValueSerializer2 != null) {
            return untypedValueSerializer2;
        }
        JsonSerializer<Object> untypedValueSerializer3 = this._serializerCache.untypedValueSerializer(this._config.constructType(cls));
        if (untypedValueSerializer3 != null) {
            return untypedValueSerializer3;
        }
        JsonSerializer<Object> _createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(cls);
        return _createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(cls) : _createAndCacheUntypedSerializer;
    }

    public JsonSerializer<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) {
        JsonSerializer untypedValueSerializer = this._knownSerializers.untypedValueSerializer(cls);
        if (untypedValueSerializer == null) {
            untypedValueSerializer = this._serializerCache.untypedValueSerializer(cls);
            if (untypedValueSerializer == null) {
                untypedValueSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(cls));
                if (untypedValueSerializer == null) {
                    untypedValueSerializer = _createAndCacheUntypedSerializer(cls);
                    if (untypedValueSerializer == null) {
                        return getUnknownTypeSerializer(cls);
                    }
                }
            }
        }
        return handleSecondaryContextualization(untypedValueSerializer, beanProperty);
    }

    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public final SerializationConfig getConfig() {
        return this._config;
    }

    public JsonSerializer<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    public final Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final FilterProvider getFilterProvider() {
        return this._config.getFilterProvider();
    }

    public JsonGenerator getGenerator() {
        return null;
    }

    public Locale getLocale() {
        return this._config.getLocale();
    }

    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public JsonSerializer<Object> getUnknownTypeSerializer(Class<?> cls) {
        return cls == Object.class ? this._unknownTypeSerializer : new UnknownSerializer(cls);
    }

    public JsonSerializer<?> handlePrimaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) {
        return (jsonSerializer == null || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    public JsonSerializer<?> handleSecondaryContextualization(JsonSerializer<?> jsonSerializer, BeanProperty beanProperty) {
        return (jsonSerializer == null || !(jsonSerializer instanceof ContextualSerializer)) ? jsonSerializer : ((ContextualSerializer) jsonSerializer).createContextual(this, beanProperty);
    }

    public abstract Object includeFilterInstance(BeanPropertyDefinition beanPropertyDefinition, Class<?> cls);

    public abstract boolean includeFilterSuppressNulls(Object obj);

    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(null, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, javaType}), str2), javaType, str);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public boolean isUnknownTypeSerializer(JsonSerializer<?> jsonSerializer) {
        if (jsonSerializer == this._unknownTypeSerializer || jsonSerializer == null) {
            return true;
        }
        return isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && jsonSerializer.getClass() == UnknownSerializer.class;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr));
    }

    public <T> T reportBadDefinition(JavaType javaType, String str) {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType);
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th) {
        InvalidDefinitionException from = InvalidDefinitionException.from(getGenerator(), str, constructType(cls));
        from.initCause(th);
        throw from;
    }

    public <T> T reportBadPropertyDefinition(BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, String str, Object... objArr) {
        String _format = _format(str, objArr);
        String str2 = "N/A";
        String _quotedString = beanPropertyDefinition != null ? _quotedString(beanPropertyDefinition.getName()) : str2;
        if (beanDescription != null) {
            str2 = ClassUtil.nameOf(beanDescription.getBeanClass());
        }
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid definition for property %s (of type %s): %s", new Object[]{_quotedString, str2, _format}), beanDescription, beanPropertyDefinition);
    }

    public <T> T reportBadTypeDefinition(BeanDescription beanDescription, String str, Object... objArr) {
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid type definition for type %s: %s", new Object[]{beanDescription != null ? ClassUtil.nameOf(beanDescription.getBeanClass()) : "N/A", _format(str, objArr)}), beanDescription, (BeanPropertyDefinition) null);
    }

    public void reportMappingProblem(String str, Object... objArr) {
        throw mappingException(str, objArr);
    }

    public void reportMappingProblem(Throwable th, String str, Object... objArr) {
        throw JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    public abstract JsonSerializer<Object> serializerInstance(Annotated annotated, Object obj);

    public SerializerProvider setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }
}
