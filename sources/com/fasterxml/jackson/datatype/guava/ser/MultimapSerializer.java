package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.fasterxml.jackson.databind.type.MapLikeType;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class MultimapSerializer extends ContainerSerializer<fcn<?, ?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    private final JsonSerializer<Object> _keySerializer;
    private final BeanProperty _property;
    protected final boolean _sortKeys;
    private final MapLikeType _type;
    private final JsonSerializer<Object> _valueSerializer;
    private final TypeSerializer _valueTypeSerializer;

    public MultimapSerializer(MapLikeType mapLikeType, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2, Set<String> set, Object obj) {
        super(mapLikeType.getRawClass(), false);
        this._type = mapLikeType;
        this._property = null;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer2;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = false;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
    }

    protected MultimapSerializer(MultimapSerializer multimapSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Object obj, boolean z) {
        super((ContainerSerializer<?>) multimapSerializer);
        this._type = multimapSerializer._type;
        this._property = beanProperty;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = multimapSerializer._dynamicValueSerializers;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = z;
    }

    /* access modifiers changed from: protected */
    public MultimapSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Object obj, boolean z) {
        MultimapSerializer multimapSerializer = new MultimapSerializer(this, beanProperty, jsonSerializer, typeSerializer, jsonSerializer2, set, obj, z);
        return multimapSerializer;
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        MultimapSerializer multimapSerializer = new MultimapSerializer(this, this._property, this._keySerializer, typeSerializer, this._valueSerializer, this._ignoredEntries, this._filterId, this._sortKeys);
        return multimapSerializer;
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Annotated annotated;
        JsonSerializer jsonSerializer;
        boolean z;
        JsonSerializer<Object> jsonSerializer2 = this._valueSerializer;
        if (jsonSerializer2 == null) {
            JavaType contentType = this._type.getContentType();
            if (contentType.isFinal()) {
                jsonSerializer2 = serializerProvider.findValueSerializer(contentType, beanProperty);
            }
        } else if (jsonSerializer2 instanceof ContextualSerializer) {
            jsonSerializer2 = ((ContextualSerializer) jsonSerializer2).createContextual(serializerProvider, beanProperty);
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        JsonSerializer<Object> jsonSerializer3 = null;
        if (beanProperty == null) {
            annotated = null;
        } else {
            annotated = beanProperty.getMember();
        }
        Object obj = this._filterId;
        if (!(annotated == null || annotationIntrospector == null)) {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(annotated);
            if (findKeySerializer != null) {
                jsonSerializer3 = serializerProvider.serializerInstance(annotated, findKeySerializer);
            }
            Object findContentSerializer = annotationIntrospector.findContentSerializer(annotated);
            if (findContentSerializer != null) {
                jsonSerializer2 = serializerProvider.serializerInstance(annotated, findContentSerializer);
            }
            obj = annotationIntrospector.findFilterId(annotated);
        }
        Object obj2 = obj;
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this._valueSerializer;
        }
        JsonSerializer findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer2);
        if (findContextualConvertingSerializer == null) {
            JavaType contentType2 = this._type.getContentType();
            if (contentType2.useStaticType()) {
                findContextualConvertingSerializer = serializerProvider.findValueSerializer(contentType2, beanProperty);
            }
        } else {
            findContextualConvertingSerializer = serializerProvider.handleSecondaryContextualization(findContextualConvertingSerializer, beanProperty);
        }
        JsonSerializer jsonSerializer4 = findContextualConvertingSerializer;
        if (jsonSerializer3 == null) {
            jsonSerializer3 = this._keySerializer;
        }
        if (jsonSerializer3 == null) {
            jsonSerializer = serializerProvider.findKeySerializer(this._type.getKeyType(), beanProperty);
        } else {
            jsonSerializer = serializerProvider.handleSecondaryContextualization(jsonSerializer3, beanProperty);
        }
        JsonSerializer jsonSerializer5 = jsonSerializer;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        TypeSerializer typeSerializer2 = typeSerializer;
        Set<String> set = this._ignoredEntries;
        boolean z2 = false;
        if (!(annotationIntrospector == null || annotated == null)) {
            Value findPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(annotated);
            if (findPropertyIgnorals != null) {
                Set<String> findIgnoredForSerialization = findPropertyIgnorals.findIgnoredForSerialization();
                if (findIgnoredForSerialization != null && !findIgnoredForSerialization.isEmpty()) {
                    set = set == null ? new HashSet<>() : new HashSet<>(set);
                    for (String add : findIgnoredForSerialization) {
                        set.add(add);
                    }
                }
            }
            Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(annotated);
            if (findSerializationSortAlphabetically != null && findSerializationSortAlphabetically.booleanValue()) {
                z2 = true;
            }
        }
        Set<String> set2 = set;
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides != null) {
            Boolean feature = findFormatOverrides.getFeature(Feature.WRITE_SORTED_MAP_ENTRIES);
            if (feature != null) {
                z = feature.booleanValue();
                return withResolved(beanProperty, jsonSerializer5, typeSerializer2, jsonSerializer4, set2, obj2, z);
            }
        }
        z = z2;
        return withResolved(beanProperty, jsonSerializer5, typeSerializer2, jsonSerializer4, set2, obj2, z);
    }

    public boolean hasSingleElement(fcn<?, ?> fcn) {
        return fcn.e() == 1;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, fcn<?, ?> fcn) {
        return fcn.l();
    }

    public void serialize(fcn<?, ?> fcn, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        jsonGenerator.setCurrentValue(fcn);
        if (!fcn.l()) {
            if (this._filterId != null) {
                serializeFilteredFields(fcn, jsonGenerator, serializerProvider);
            } else {
                serializeFields(fcn, jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(fcn<?, ?> fcn, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.setCurrentValue(fcn);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(fcn, JsonToken.START_OBJECT));
        if (!fcn.l()) {
            if (this._filterId != null) {
                serializeFilteredFields(fcn, jsonGenerator, serializerProvider);
            } else {
                serializeFields(fcn, jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    private final void serializeFields(fcn<?, ?> fcn, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Set<String> set = this._ignoredEntries;
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        for (Entry entry : fcn.b().entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    serializerProvider.findNullKeySerializer(this._type.getKeyType(), this._property).serialize(null, jsonGenerator, serializerProvider);
                } else {
                    this._keySerializer.serialize(key, jsonGenerator, serializerProvider);
                }
                jsonGenerator.writeStartArray();
                for (Object next : (Collection) entry.getValue()) {
                    if (next == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
                        if (jsonSerializer == null) {
                            Class cls = next.getClass();
                            JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                            if (serializerFor == null) {
                                jsonSerializer = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                                propertySerializerMap = this._dynamicValueSerializers;
                            } else {
                                jsonSerializer = serializerFor;
                            }
                        }
                        TypeSerializer typeSerializer = this._valueTypeSerializer;
                        if (typeSerializer == null) {
                            jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                        } else {
                            jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                        }
                    }
                }
                jsonGenerator.writeEndArray();
            }
        }
    }

    private final void serializeFilteredFields(fcn<?, ?> fcn, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer<Object> jsonSerializer;
        Set<String> set = this._ignoredEntries;
        PropertyFilter findPropertyFilter = findPropertyFilter(serializerProvider, this._filterId, fcn);
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        for (Entry entry : fcn.b().entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                Collection collection = (Collection) entry.getValue();
                if (collection == null) {
                    jsonSerializer = serializerProvider.getDefaultNullValueSerializer();
                } else {
                    jsonSerializer = this._valueSerializer;
                }
                mapProperty.reset(key, collection, this._keySerializer, jsonSerializer);
                try {
                    findPropertyFilter.serializeAsField(fcn, jsonGenerator, serializerProvider, mapProperty);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(key);
                    wrapAndThrow(serializerProvider, (Throwable) e, (Object) collection, sb.toString());
                }
            }
        }
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        JsonMapFormatVisitor expectMapFormat = jsonFormatVisitorWrapper == null ? null : jsonFormatVisitorWrapper.expectMapFormat(javaType);
        if (expectMapFormat != null) {
            expectMapFormat.keyFormat(this._keySerializer, this._type.getKeyType());
            final JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            final JavaType contentType = this._type.getContentType();
            final SerializerProvider provider = jsonFormatVisitorWrapper.getProvider();
            if (jsonSerializer == null) {
                jsonSerializer = _findAndAddDynamic(this._dynamicValueSerializers, contentType, provider);
            }
            expectMapFormat.valueFormat(new JsonFormatVisitable() {
                final JavaType arrayType = provider.getTypeFactory().constructArrayType(contentType);
            }, contentType);
        }
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
