package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.util.Map;
import java.util.Map.Entry;

@JacksonStdImpl
public class MapEntrySerializer extends ContainerSerializer<Entry<?, ?>> implements ContextualSerializer {
    public static final Object MARKER_FOR_EMPTY = Include.NON_EMPTY;
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected JsonSerializer<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[Include.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonInclude$Include[] r0 = com.fasterxml.jackson.annotation.JsonInclude.Include.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include     // Catch:{ NoSuchFieldError -> 0x004b }
                com.fasterxml.jackson.annotation.JsonInclude$Include r1 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.AnonymousClass1.<clinit>():void");
        }
    }

    public boolean hasSingleElement(Entry<?, ?> entry) {
        return true;
    }

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    protected MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = mapEntrySerializer._dynamicValueSerializers;
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(this, this._property, typeSerializer, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
        return mapEntrySerializer;
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z) {
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, jsonSerializer, jsonSerializer2, obj, z);
        return mapEntrySerializer;
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z) {
        if (this._suppressableValue == obj && this._suppressNulls == z) {
            return this;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(this, this._property, this._valueTypeSerializer, this._keySerializer, this._valueSerializer, obj, z);
        return mapEntrySerializer;
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Annotated annotated;
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> jsonSerializer2;
        JsonSerializer jsonSerializer3;
        boolean z;
        Object obj;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        Object obj2 = null;
        if (beanProperty == null) {
            annotated = null;
        } else {
            annotated = beanProperty.getMember();
        }
        if (annotated == null || annotationIntrospector == null) {
            jsonSerializer2 = null;
            jsonSerializer = null;
        } else {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(annotated);
            jsonSerializer = findKeySerializer != null ? serializerProvider.serializerInstance(annotated, findKeySerializer) : null;
            Object findContentSerializer = annotationIntrospector.findContentSerializer(annotated);
            jsonSerializer2 = findContentSerializer != null ? serializerProvider.serializerInstance(annotated, findContentSerializer) : null;
        }
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this._valueSerializer;
        }
        JsonSerializer findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer2);
        if (findContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            findContextualConvertingSerializer = serializerProvider.findValueSerializer(this._valueType, beanProperty);
        }
        JsonSerializer jsonSerializer4 = findContextualConvertingSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = this._keySerializer;
        }
        if (jsonSerializer == null) {
            jsonSerializer3 = serializerProvider.findKeySerializer(this._keyType, beanProperty);
        } else {
            jsonSerializer3 = serializerProvider.handleSecondaryContextualization(jsonSerializer, beanProperty);
        }
        JsonSerializer jsonSerializer5 = jsonSerializer3;
        Object obj3 = this._suppressableValue;
        boolean z2 = this._suppressNulls;
        if (beanProperty != null) {
            Value findPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), null);
            if (findPropertyInclusion != null) {
                Include contentInclusion = findPropertyInclusion.getContentInclusion();
                if (contentInclusion != Include.USE_DEFAULTS) {
                    int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
                    if (i == 1) {
                        obj2 = BeanUtil.getDefaultValue(this._valueType);
                        if (obj2 != null && obj2.getClass().isArray()) {
                            obj2 = ArrayBuilders.getArrayComparator(obj2);
                        }
                    } else if (i != 2) {
                        if (i == 3) {
                            obj2 = MARKER_FOR_EMPTY;
                        } else if (i == 4) {
                            obj2 = serializerProvider.includeFilterInstance(null, findPropertyInclusion.getContentFilter());
                            if (obj2 != null) {
                                z = serializerProvider.includeFilterSuppressNulls(obj2);
                                obj = obj2;
                                return withResolved(beanProperty, jsonSerializer5, jsonSerializer4, obj, z);
                            }
                        } else if (i != 5) {
                            obj = null;
                            z = false;
                            return withResolved(beanProperty, jsonSerializer5, jsonSerializer4, obj, z);
                        }
                    } else if (this._valueType.isReferenceType()) {
                        obj2 = MARKER_FOR_EMPTY;
                    }
                    obj = obj2;
                    z = true;
                    return withResolved(beanProperty, jsonSerializer5, jsonSerializer4, obj, z);
                }
            }
        }
        obj = obj3;
        z = z2;
        return withResolved(beanProperty, jsonSerializer5, jsonSerializer4, obj, z);
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            Class cls = value.getClass();
            JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
            if (serializerFor == null) {
                try {
                    jsonSerializer = _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                jsonSerializer = serializerFor;
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return jsonSerializer.isEmpty(serializerProvider, value);
        }
        return obj.equals(value);
    }

    public void serialize(Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject(entry);
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.setCurrentValue(entry);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    /* access modifiers changed from: protected */
    public void serializeDynamic(Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer jsonSerializer2;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        Object key = entry.getKey();
        if (key == null) {
            jsonSerializer = serializerProvider.findNullKeySerializer(this._keyType, this._property);
        } else {
            jsonSerializer = this._keySerializer;
        }
        Object value = entry.getValue();
        if (value != null) {
            jsonSerializer2 = this._valueSerializer;
            if (jsonSerializer2 == null) {
                Class cls = value.getClass();
                JsonSerializer serializerFor = this._dynamicValueSerializers.serializerFor(cls);
                jsonSerializer2 = serializerFor == null ? this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider) : serializerFor;
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == MARKER_FOR_EMPTY && jsonSerializer2.isEmpty(serializerProvider, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (!this._suppressNulls) {
            jsonSerializer2 = serializerProvider.getDefaultNullValueSerializer();
        } else {
            return;
        }
        jsonSerializer.serialize(key, jsonGenerator, serializerProvider);
        if (typeSerializer == null) {
            try {
                jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append(key);
                wrapAndThrow(serializerProvider, (Throwable) e, (Object) entry, sb.toString());
            }
            return;
        }
        jsonSerializer2.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSecondarySerializer.map) {
            this._dynamicValueSerializers = findAndAddSecondarySerializer.map;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSecondarySerializer.map) {
            this._dynamicValueSerializers = findAndAddSecondarySerializer.map;
        }
        return findAndAddSecondarySerializer.serializer;
    }
}
