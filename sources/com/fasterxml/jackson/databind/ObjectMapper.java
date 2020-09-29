package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectMapper extends ObjectCodec implements Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR = new JacksonAnnotationIntrospector();
    protected static final BaseSettings DEFAULT_BASE;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    private static final long serialVersionUID = 2;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected SerializerFactory _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected SubtypeResolver _subtypeResolver;
    protected TypeFactory _typeFactory;

    static {
        BaseSettings baseSettings = new BaseSettings(null, DEFAULT_ANNOTATION_INTROSPECTOR, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), null, Base64Variants.getDefaultVariant());
        DEFAULT_BASE = baseSettings;
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                this._jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings withClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        this._configOverrides = new ConfigOverrides();
        BaseSettings baseSettings = withClassIntrospector;
        SimpleMixInResolver simpleMixInResolver2 = simpleMixInResolver;
        RootNameLookup rootNameLookup2 = rootNameLookup;
        SerializationConfig serializationConfig = new SerializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, this._configOverrides);
        this._serializationConfig = serializationConfig;
        DeserializationConfig deserializationConfig = new DeserializationConfig(baseSettings, this._subtypeResolver, simpleMixInResolver2, rootNameLookup2, this._configOverrides);
        this._deserializationConfig = deserializationConfig;
        boolean requiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        if (this._serializationConfig.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY) ^ requiresPropertyOrdering) {
            configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, requiresPropertyOrdering);
        }
        if (defaultSerializerProvider == null) {
            defaultSerializerProvider = new Impl();
        }
        this._serializerProvider = defaultSerializerProvider;
        if (defaultDeserializationContext == null) {
            defaultDeserializationContext = new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance);
        }
        this._deserializationContext = defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    private final void _configAndWriteCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(null, closeable, e);
        }
    }

    /* access modifiers changed from: protected */
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) {
        SerializationConfig serializationConfig = getSerializationConfig();
        serializationConfig.initialize(jsonGenerator);
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e) {
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, e);
            }
        } else {
            _configAndWriteCloseable(jsonGenerator, obj, serializationConfig);
        }
    }

    /* access modifiers changed from: protected */
    public Object _convert(Object obj, JavaType javaType) {
        Object obj2;
        if (obj != null) {
            Class<Object> rawClass = javaType.getRawClass();
            if (rawClass != Object.class && !javaType.hasGenericTypes() && rawClass.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer = tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken _initForReading = _initForReading(asParser, javaType);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createDeserializationContext = createDeserializationContext(asParser, deserializationConfig);
                obj2 = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DefaultDeserializationContext createDeserializationContext2 = createDeserializationContext(asParser, deserializationConfig);
                        obj2 = _findRootDeserializer(createDeserializationContext2, javaType).deserialize(asParser, createDeserializationContext2);
                    }
                }
                obj2 = null;
            }
            asParser.close();
            return obj2;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer = (JsonDeserializer) this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            StringBuilder sb = new StringBuilder("Cannot find a deserializer for type ");
            sb.append(javaType);
            return (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, sb.toString());
        }
        this._rootDeserializers.put(javaType, findRootValueDeserializer);
        return findRootValueDeserializer;
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            currentToken = jsonParser.nextToken();
            if (currentToken == null) {
                throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
            }
        }
        return currentToken;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    /* access modifiers changed from: protected */
    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        ObjectReader objectReader = new ObjectReader(this, deserializationConfig, javaType, obj, formatSchema, injectableValues);
        return objectReader;
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    /* access modifiers changed from: protected */
    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        return new ObjectWriter(this, serializationConfig, javaType, prettyPrinter);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _readMapAndClose(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.JavaType r11) {
        /*
            r9 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r9._initForReading(r10, r11)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.DeserializationConfig r7 = r9.getDeserializationConfig()     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r8 = r9.createDeserializationContext(r10, r7)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0019
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.getNullValue(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x0019:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x003e
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            boolean r0 = r7.useRootWrapping()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0036
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r7
            r5 = r11
            java.lang.Object r0 = r1._unwrapAndDeserialize(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0050 }
            goto L_0x003a
        L_0x0036:
            java.lang.Object r0 = r6.deserialize(r10, r8)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            r8.checkUnresolvedObjectId()     // Catch:{ all -> 0x0050 }
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0050 }
            boolean r1 = r7.isEnabled(r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            r9._verifyNoTrailingTokens(r10, r8, r11)     // Catch:{ all -> 0x0050 }
        L_0x004a:
            if (r10 == 0) goto L_0x004f
            r10.close()
        L_0x004f:
            return r0
        L_0x0050:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r11 = move-exception
            if (r10 == 0) goto L_0x0058
            r10.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r7 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonNode _readTreeAndClose(com.fasterxml.jackson.core.JsonParser r7) {
        /*
            r6 = this;
            com.fasterxml.jackson.databind.JavaType r4 = JSON_NODE_TYPE     // Catch:{ all -> 0x005a }
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r6.getDeserializationConfig()     // Catch:{ all -> 0x005a }
            r3.initialize(r7)     // Catch:{ all -> 0x005a }
            com.fasterxml.jackson.core.JsonToken r0 = r7.getCurrentToken()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x001c
            com.fasterxml.jackson.core.JsonToken r0 = r7.nextToken()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x001c
            if (r7 == 0) goto L_0x001a
            r7.close()
        L_0x001a:
            r7 = 0
            return r7
        L_0x001c:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x005a }
            if (r0 != r1) goto L_0x002e
            com.fasterxml.jackson.databind.node.JsonNodeFactory r0 = r3.getNodeFactory()     // Catch:{ all -> 0x005a }
            com.fasterxml.jackson.databind.node.NullNode r0 = r0.nullNode()     // Catch:{ all -> 0x005a }
            if (r7 == 0) goto L_0x002d
            r7.close()
        L_0x002d:
            return r0
        L_0x002e:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r2 = r6.createDeserializationContext(r7, r3)     // Catch:{ all -> 0x005a }
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r6._findRootDeserializer(r2, r4)     // Catch:{ all -> 0x005a }
            boolean r0 = r3.useRootWrapping()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0043
            r0 = r6
            r1 = r7
            java.lang.Object r0 = r0._unwrapAndDeserialize(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x005a }
            goto L_0x0052
        L_0x0043:
            java.lang.Object r0 = r5.deserialize(r7, r2)     // Catch:{ all -> 0x005a }
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x005a }
            boolean r1 = r3.isEnabled(r1)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0052
            r6._verifyNoTrailingTokens(r7, r2, r4)     // Catch:{ all -> 0x005a }
        L_0x0052:
            com.fasterxml.jackson.databind.JsonNode r0 = (com.fasterxml.jackson.databind.JsonNode) r0     // Catch:{ all -> 0x005a }
            if (r7 == 0) goto L_0x0059
            r7.close()
        L_0x0059:
            return r0
        L_0x005a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            if (r7 == 0) goto L_0x0062
            r7.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readTreeAndClose(com.fasterxml.jackson.core.JsonParser):com.fasterxml.jackson.databind.JsonNode");
    }

    /* access modifiers changed from: protected */
    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) {
        Object obj;
        JsonToken _initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (_initForReading == JsonToken.VALUE_NULL) {
            obj = _findRootDeserializer(createDeserializationContext, javaType).getNullValue(createDeserializationContext);
        } else if (_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT) {
            obj = null;
        } else {
            JsonDeserializer _findRootDeserializer = _findRootDeserializer(createDeserializationContext, javaType);
            obj = deserializationConfig.useRootWrapping() ? _unwrapAndDeserialize(jsonParser, createDeserializationContext, deserializationConfig, javaType, _findRootDeserializer) : _findRootDeserializer.deserialize(jsonParser, createDeserializationContext);
        }
        jsonParser.clearCurrentToken();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, javaType);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) {
        String simpleName = deserializationConfig.findRootName(javaType).getSimpleName();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            deserializationContext.reportWrongTokenException(javaType, JsonToken.START_OBJECT, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        if (jsonParser.nextToken() != JsonToken.FIELD_NAME) {
            deserializationContext.reportWrongTokenException(javaType, JsonToken.FIELD_NAME, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        String currentName = jsonParser.getCurrentName();
        if (!simpleName.equals(currentName)) {
            deserializationContext.reportInputMismatch(javaType, "Root name '%s' does not match expected ('%s') for type %s", currentName, simpleName, javaType);
        }
        jsonParser.nextToken();
        Object deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            deserializationContext.reportWrongTokenException(javaType, JsonToken.END_OBJECT, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, javaType);
        }
        return deserialize;
    }

    /* access modifiers changed from: protected */
    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            deserializationContext.reportTrailingTokens(ClassUtil.rawClass(javaType), jsonParser, nextToken);
        }
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, null);
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, null);
    }

    public ObjectMapper configure(Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        MapperConfigBase mapperConfigBase;
        MapperConfigBase mapperConfigBase2;
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature[] mapperFeatureArr = new MapperFeature[1];
        if (z) {
            mapperFeatureArr[0] = mapperFeature;
            mapperConfigBase = serializationConfig.with(mapperFeatureArr);
        } else {
            mapperFeatureArr[0] = mapperFeature;
            mapperConfigBase = serializationConfig.without(mapperFeatureArr);
        }
        this._serializationConfig = (SerializationConfig) mapperConfigBase;
        if (z) {
            mapperConfigBase2 = this._deserializationConfig.with(mapperFeature);
        } else {
            mapperConfigBase2 = this._deserializationConfig.without(mapperFeature);
        }
        this._deserializationConfig = (DeserializationConfig) mapperConfigBase2;
        return this;
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public JavaType constructType(Type type) {
        return this._typeFactory.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) {
        return _convert(obj, this._typeFactory.constructType((Type) cls));
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    /* access modifiers changed from: protected */
    public ClassIntrospector defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    public <T extends TreeNode> T readTree(JsonParser jsonParser) {
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.getCurrentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        T t = (JsonNode) _readValue(deserializationConfig, jsonParser, JSON_NODE_TYPE);
        if (t == null) {
            t = getNodeFactory().nullNode();
        }
        return t;
    }

    public JsonNode readTree(InputStream inputStream) {
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public JsonNode readTree(byte[] bArr) {
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        return _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(File file, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(typeReference));
    }

    public <T> T readValue(File file, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(String str, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType(typeReference));
    }

    public <T> T readValue(String str, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(str), javaType);
    }

    public <T> T readValue(String str, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType((Type) cls));
    }

    public <T> T readValue(byte[] bArr, TypeReference typeReference) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(typeReference));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) {
        return _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((Type) cls));
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectMapper registerModule(Module module) {
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS)) {
            Object typeId = module.getTypeId();
            if (typeId != null) {
                if (this._registeredModuleTypes == null) {
                    this._registeredModuleTypes = new LinkedHashSet();
                }
                if (!this._registeredModuleTypes.add(typeId)) {
                    return this;
                }
            }
        }
        if (module.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        } else if (module.version() != null) {
            module.setupModule(new SetupContext() {
                public void addBeanSerializerModifier(BeanSerializerModifier beanSerializerModifier) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(beanSerializerModifier);
                }

                public void addDeserializers(Deserializers deserializers) {
                    DeserializerFactory withAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(deserializers);
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._deserializationContext = objectMapper._deserializationContext.with(withAdditionalDeserializers);
                }

                public void addSerializers(Serializers serializers) {
                    ObjectMapper objectMapper = ObjectMapper.this;
                    objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(serializers);
                }

                public void addTypeModifier(TypeModifier typeModifier) {
                    ObjectMapper.this.setTypeFactory(ObjectMapper.this._typeFactory.withModifier(typeModifier));
                }
            });
            return this;
        } else {
            throw new IllegalArgumentException("Module without defined version");
        }
    }

    public ObjectMapper setDefaultPropertyInclusion(Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setSerializationInclusion(Include include) {
        setPropertyInclusion(Value.construct(include, include));
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(typeFactory);
        this._serializationConfig = (SerializationConfig) this._serializationConfig.with(typeFactory);
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        return new TreeTraversingParser((JsonNode) treeNode, this);
    }

    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) {
        if (cls != Object.class) {
            try {
                if (cls.isAssignableFrom(treeNode.getClass())) {
                    return treeNode;
                }
            } catch (JsonProcessingException e) {
                throw e;
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        if (treeNode.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (treeNode instanceof POJONode)) {
            T pojo = ((POJONode) treeNode).getPojo();
            if (pojo == null || cls.isInstance(pojo)) {
                return pojo;
            }
        }
        return readValue(treeAsTokens(treeNode), cls);
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            jsonGenerator.setPrettyPrinter(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            return;
        }
        _writeCloseableValue(jsonGenerator, obj, serializationConfig);
    }

    public void writeValue(File file, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public byte[] writeValueAsBytes(Object obj) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator((OutputStream) byteArrayBuilder, JsonEncoding.UTF8), obj);
            byte[] byteArray = byteArrayBuilder.toByteArray();
            byteArrayBuilder.release();
            return byteArray;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }
}
