package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectReader extends ObjectCodec implements Serializable {
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    private static final long serialVersionUID = 2;
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders;
    private final TokenFilter _filter;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = jsonDeserializer;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = dataFormatReaders;
        this._filter = objectReader._filter;
    }

    /* access modifiers changed from: protected */
    public Object _bind(JsonParser jsonParser, Object obj) {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken _initForReading = _initForReading(createDeserializationContext, jsonParser);
        if (_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(createDeserializationContext).getNullValue(createDeserializationContext);
            }
        } else if (!(_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT)) {
            JsonDeserializer _findRootDeserializer = _findRootDeserializer(createDeserializationContext);
            obj = this._unwrapRoot ? _unwrapAndDeserialize(jsonParser, createDeserializationContext, this._valueType, _findRootDeserializer) : obj == null ? _findRootDeserializer.deserialize(jsonParser, createDeserializationContext) : _findRootDeserializer.deserialize(jsonParser, createDeserializationContext, obj);
        }
        jsonParser.clearCurrentToken();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createDeserializationContext, this._valueType);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r5 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _bindAndClose(com.fasterxml.jackson.core.JsonParser r5) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r0 = r4.createDeserializationContext(r5)     // Catch:{ all -> 0x005c }
            com.fasterxml.jackson.core.JsonToken r1 = r4._initForReading(r0, r5)     // Catch:{ all -> 0x005c }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x005c }
            if (r1 != r2) goto L_0x001c
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0019
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.getNullValue(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x0019:
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x001c:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x005c }
            if (r1 == r2) goto L_0x0045
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x005c }
            if (r1 != r2) goto L_0x0025
            goto L_0x0045
        L_0x0025:
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x005c }
            boolean r2 = r4._unwrapRoot     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0034
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r4._unwrapAndDeserialize(r5, r0, r2, r1)     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x0034:
            java.lang.Object r2 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x003d
            java.lang.Object r1 = r1.deserialize(r5, r0)     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x003d:
            java.lang.Object r2 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            r1.deserialize(r5, r0, r2)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
            goto L_0x0047
        L_0x0045:
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x005c }
        L_0x0047:
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r4._config     // Catch:{ all -> 0x005c }
            com.fasterxml.jackson.databind.DeserializationFeature r3 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x005c }
            boolean r2 = r2.isEnabled(r3)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0056
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x005c }
            r4._verifyNoTrailingTokens(r5, r0, r2)     // Catch:{ all -> 0x005c }
        L_0x0056:
            if (r5 == 0) goto L_0x005b
            r5.close()
        L_0x005b:
            return r1
        L_0x005c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0064
            r5.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader._bindAndClose(com.fasterxml.jackson.core.JsonParser):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final JsonNode _bindAsTree(JsonParser jsonParser) {
        Object obj;
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            currentToken = jsonParser.nextToken();
            if (currentToken == null) {
                return null;
            }
        }
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(jsonParser);
        if (currentToken == JsonToken.VALUE_NULL) {
            return createDeserializationContext.getNodeFactory().nullNode();
        }
        JsonDeserializer _findTreeDeserializer = _findTreeDeserializer(createDeserializationContext);
        if (this._unwrapRoot) {
            obj = _unwrapAndDeserialize(jsonParser, createDeserializationContext, JSON_NODE_TYPE, _findTreeDeserializer);
        } else {
            Object deserialize = _findTreeDeserializer.deserialize(jsonParser, createDeserializationContext);
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, createDeserializationContext, JSON_NODE_TYPE);
            }
            obj = deserialize;
        }
        return (JsonNode) obj;
    }

    /* access modifiers changed from: protected */
    public JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || FilteringParserDelegate.class.isInstance(jsonParser)) ? jsonParser : new FilteringParserDelegate(jsonParser, this._filter, false, z);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition(null, "No value type configured for ObjectReader");
        }
        JsonDeserializer<Object> jsonDeserializer2 = (JsonDeserializer) this._rootDeserializers.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer == null) {
            StringBuilder sb = new StringBuilder("Cannot find a deserializer for type ");
            sb.append(javaType);
            deserializationContext.reportBadDefinition(javaType, sb.toString());
        }
        this._rootDeserializers.put(javaType, findRootValueDeserializer);
        return findRootValueDeserializer;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findTreeDeserializer(DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = (JsonDeserializer) this._rootDeserializers.get(JSON_NODE_TYPE);
        if (jsonDeserializer == null) {
            jsonDeserializer = deserializationContext.findRootValueDeserializer(JSON_NODE_TYPE);
            if (jsonDeserializer == null) {
                JavaType javaType = JSON_NODE_TYPE;
                StringBuilder sb = new StringBuilder("Cannot find a deserializer for type ");
                sb.append(JSON_NODE_TYPE);
                deserializationContext.reportBadDefinition(javaType, sb.toString());
            }
            this._rootDeserializers.put(JSON_NODE_TYPE, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            currentToken = jsonParser.nextToken();
            if (currentToken == null) {
                deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
            }
        }
        return currentToken;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    /* access modifiers changed from: protected */
    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        ObjectReader objectReader2 = new ObjectReader(objectReader, deserializationConfig, javaType, jsonDeserializer, obj, formatSchema, injectableValues, dataFormatReaders);
        return objectReader2;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializer = (JsonDeserializer) this._rootDeserializers.get(javaType);
        if (jsonDeserializer == null) {
            try {
                JsonDeserializer<Object> findRootValueDeserializer = createDeserializationContext(null).findRootValueDeserializer(javaType);
                if (findRootValueDeserializer != null) {
                    try {
                        this._rootDeserializers.put(javaType, findRootValueDeserializer);
                    } catch (JsonProcessingException unused) {
                        jsonDeserializer = findRootValueDeserializer;
                    }
                }
                return findRootValueDeserializer;
            } catch (JsonProcessingException unused2) {
            }
        }
        return jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public void _reportUndetectableSource(Object obj) {
        StringBuilder sb = new StringBuilder("Cannot use source of type ");
        sb.append(obj.getClass().getName());
        sb.append(" with format auto-detection: must be byte- not char-based");
        throw new JsonParseException(null, sb.toString());
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) {
        Object obj;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
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
        Object obj2 = this._valueToUpdate;
        if (obj2 == null) {
            obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            jsonDeserializer.deserialize(jsonParser, deserializationContext, obj2);
            obj = this._valueToUpdate;
        }
        if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            deserializationContext.reportWrongTokenException(javaType, JsonToken.END_OBJECT, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", simpleName, jsonParser.getCurrentToken());
        }
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, deserializationContext, this._valueType);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            Class rawClass = ClassUtil.rawClass(javaType);
            if (rawClass == null) {
                Object obj = this._valueToUpdate;
                if (obj != null) {
                    rawClass = obj.getClass();
                }
            }
            deserializationContext.reportTrailingTokens(rawClass, jsonParser, nextToken);
        }
    }

    /* access modifiers changed from: protected */
    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader _new = _new(this, deserializationConfig);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            _new = _new.withFormatDetection(dataFormatReaders.with(deserializationConfig));
        }
        return _new;
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        JsonDeserializer _prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        DataFormatReaders dataFormatReaders = this._dataFormatReaders;
        if (dataFormatReaders != null) {
            dataFormatReaders = dataFormatReaders.withType(javaType);
        }
        return _new(this, this._config, javaType, _prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    public <T extends TreeNode> T readTree(JsonParser jsonParser) {
        return _bindAsTree(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser) {
        return _bind(jsonParser, this._valueToUpdate);
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        return forType(cls).readValue(jsonParser);
    }

    public <T> T readValue(Reader reader) {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndClose(_considerFilter(this._parserFactory.createParser(reader), false));
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        return new TreeTraversingParser((JsonNode) treeNode, withValueToUpdate(null));
    }

    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) {
        try {
            return readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public ObjectReader with(InjectableValues injectableValues) {
        if (this._injectableValues == injectableValues) {
            return this;
        }
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withFormatDetection(DataFormatReaders dataFormatReaders) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
    }

    public ObjectReader withRootName(String str) {
        return _with((DeserializationConfig) this._config.withRootName(str));
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, null, this._schema, this._injectableValues, this._dataFormatReaders);
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            javaType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaType, this._rootDeserializer, obj, this._schema, this._injectableValues, this._dataFormatReaders);
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }
}
