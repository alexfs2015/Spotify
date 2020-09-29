package com.fasterxml.jackson.datatype.guava.deser.multimap;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.LinkedListMultimap;
import defpackage.fcn;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class GuavaMultimapDeserializer<T extends fcn<Object, Object>> extends StdDeserializer<T> implements ContextualDeserializer {
    private static final List<String> METHOD_NAMES = ImmutableList.a("copyOf", "create");
    private static final long serialVersionUID = 1;
    private final Method creatorMethod;
    private final JsonDeserializer<?> elementDeserializer;
    private final TypeDeserializer elementTypeDeserializer;
    private final KeyDeserializer keyDeserializer;
    private final NullValueProvider nullProvider;
    private final boolean skipNullValues;
    private final MapLikeType type;

    /* access modifiers changed from: protected */
    public abstract JsonDeserializer<?> _createContextual(MapLikeType mapLikeType, KeyDeserializer keyDeserializer2, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Method method, NullValueProvider nullValueProvider);

    /* access modifiers changed from: protected */
    public abstract T createMultimap();

    public GuavaMultimapDeserializer(MapLikeType mapLikeType, KeyDeserializer keyDeserializer2, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        this(mapLikeType, keyDeserializer2, typeDeserializer, jsonDeserializer, findTransformer(mapLikeType.getRawClass()), null);
    }

    public GuavaMultimapDeserializer(MapLikeType mapLikeType, KeyDeserializer keyDeserializer2, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, Method method, NullValueProvider nullValueProvider) {
        boolean z;
        super((JavaType) mapLikeType);
        this.type = mapLikeType;
        this.keyDeserializer = keyDeserializer2;
        this.elementTypeDeserializer = typeDeserializer;
        this.elementDeserializer = jsonDeserializer;
        this.creatorMethod = method;
        this.nullProvider = nullValueProvider;
        if (nullValueProvider == null) {
            z = false;
        } else {
            z = NullsConstantProvider.isSkipper(nullValueProvider);
        }
        this.skipNullValues = z;
    }

    private static Method findTransformer(Class<?> cls) {
        if (!(cls == LinkedListMultimap.class || cls == fcm.class || cls == fcn.class)) {
            for (String method : METHOD_NAMES) {
                try {
                    Method method2 = cls.getMethod(method, new Class[]{fcn.class});
                    if (method2 != null) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
            for (String method3 : METHOD_NAMES) {
                try {
                    Method method4 = cls.getMethod(method3, new Class[]{fcn.class});
                    if (method4 != null) {
                        return method4;
                    }
                } catch (NoSuchMethodException unused2) {
                }
            }
        }
        return null;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer jsonDeserializer;
        KeyDeserializer keyDeserializer2 = this.keyDeserializer;
        if (keyDeserializer2 == null) {
            keyDeserializer2 = deserializationContext.findKeyDeserializer(this.type.getKeyType(), beanProperty);
        }
        KeyDeserializer keyDeserializer3 = keyDeserializer2;
        JsonDeserializer<?> jsonDeserializer2 = this.elementDeserializer;
        JavaType contentType = this.type.getContentType();
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, contentType);
        }
        JsonDeserializer jsonDeserializer3 = jsonDeserializer;
        TypeDeserializer typeDeserializer = this.elementTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return _createContextual(this.type, keyDeserializer3, typeDeserializer, jsonDeserializer3, this.creatorMethod, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer3));
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            return deserializeFromSingleValue(jsonParser, deserializationContext);
        }
        return deserializeContents(jsonParser, deserializationContext);
    }

    private T deserializeContents(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        Object obj2;
        String str = "Could not map to ";
        T createMultimap = createMultimap();
        expect(jsonParser, JsonToken.START_OBJECT);
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            KeyDeserializer keyDeserializer2 = this.keyDeserializer;
            if (keyDeserializer2 != null) {
                obj = keyDeserializer2.deserializeKey(jsonParser.getCurrentName(), deserializationContext);
            } else {
                obj = jsonParser.getCurrentName();
            }
            jsonParser.nextToken();
            expect(jsonParser, JsonToken.START_ARRAY);
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    TypeDeserializer typeDeserializer = this.elementTypeDeserializer;
                    if (typeDeserializer != null) {
                        obj2 = this.elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    } else {
                        obj2 = this.elementDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                } else if (!this.skipNullValues) {
                    obj2 = this.nullProvider.getNullValue(deserializationContext);
                }
                createMultimap.a(obj, obj2);
            }
        }
        Method method = this.creatorMethod;
        if (method == null) {
            return createMultimap;
        }
        try {
            return (fcn) method.invoke(null, new Object[]{createMultimap});
        } catch (InvocationTargetException e) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(this.type);
            throw new JsonMappingException((Closeable) jsonParser, sb.toString(), _peel(e));
        } catch (IllegalArgumentException e2) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(this.type);
            throw new JsonMappingException((Closeable) jsonParser, sb2.toString(), _peel(e2));
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append(this.type);
            throw new JsonMappingException((Closeable) jsonParser, sb3.toString(), _peel(e3));
        }
    }

    private T deserializeFromSingleValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        String str = "Could not map to ";
        T createMultimap = createMultimap();
        expect(jsonParser, JsonToken.START_OBJECT);
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            KeyDeserializer keyDeserializer2 = this.keyDeserializer;
            if (keyDeserializer2 != null) {
                obj = keyDeserializer2.deserializeKey(jsonParser.getCurrentName(), deserializationContext);
            } else {
                obj = jsonParser.getCurrentName();
            }
            jsonParser.nextToken();
            if (jsonParser.currentToken() == JsonToken.START_ARRAY) {
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    createMultimap.a(obj, getCurrentTokenValue(jsonParser, deserializationContext));
                }
            } else {
                createMultimap.a(obj, getCurrentTokenValue(jsonParser, deserializationContext));
            }
        }
        Method method = this.creatorMethod;
        if (method == null) {
            return createMultimap;
        }
        try {
            return (fcn) method.invoke(null, new Object[]{createMultimap});
        } catch (InvocationTargetException e) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(this.type);
            throw new JsonMappingException((Closeable) jsonParser, sb.toString(), _peel(e));
        } catch (IllegalArgumentException e2) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(this.type);
            throw new JsonMappingException((Closeable) jsonParser, sb2.toString(), _peel(e2));
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append(this.type);
            throw new JsonMappingException((Closeable) jsonParser, sb3.toString(), _peel(e3));
        }
    }

    private Object getCurrentTokenValue(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TypeDeserializer typeDeserializer = this.elementTypeDeserializer;
        if (typeDeserializer != null) {
            return this.elementDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return this.elementDeserializer.deserialize(jsonParser, deserializationContext);
    }

    private void expect(JsonParser jsonParser, JsonToken jsonToken) {
        if (jsonParser.getCurrentToken() != jsonToken) {
            StringBuilder sb = new StringBuilder("Expecting ");
            sb.append(jsonToken);
            sb.append(", found ");
            sb.append(jsonParser.getCurrentToken());
            throw new JsonMappingException((Closeable) jsonParser, sb.toString(), jsonParser.getCurrentLocation());
        }
    }

    private Throwable _peel(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }
}
