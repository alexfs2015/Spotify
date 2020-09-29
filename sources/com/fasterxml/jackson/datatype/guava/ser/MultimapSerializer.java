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

public class MultimapSerializer extends ContainerSerializer<fdf<?, ?>> implements ContextualSerializer {
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

    private final void serializeFields(fdf<?, ?> fdf, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Set<String> set = this._ignoredEntries;
        PropertySerializerMap propertySerializerMap = this._dynamicValueSerializers;
        for (Entry entry : fdf.b().entrySet()) {
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

    private final void serializeFilteredFields(fdf<?, ?> fdf, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Set<String> set = this._ignoredEntries;
        PropertyFilter findPropertyFilter = findPropertyFilter(serializerProvider, this._filterId, fdf);
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        for (Entry entry : fdf.b().entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                Collection collection = (Collection) entry.getValue();
                mapProperty.reset(key, collection, this._keySerializer, collection == null ? serializerProvider.getDefaultNullValueSerializer() : this._valueSerializer);
                try {
                    findPropertyFilter.serializeAsField(fdf, jsonGenerator, serializerProvider, mapProperty);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(key);
                    wrapAndThrow(serializerProvider, (Throwable) e, (Object) collection, sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSecondarySerializer.map) {
            this._dynamicValueSerializers = findAndAddSecondarySerializer.map;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
        SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        if (propertySerializerMap != findAndAddSecondarySerializer.map) {
            this._dynamicValueSerializers = findAndAddSecondarySerializer.map;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        MultimapSerializer multimapSerializer = new MultimapSerializer(this, this._property, this._keySerializer, typeSerializer, this._valueSerializer, this._ignoredEntries, this._filterId, this._sortKeys);
        return multimapSerializer;
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

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        boolean z;
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            JavaType contentType = this._type.getContentType();
            if (contentType.isFinal()) {
                jsonSerializer = serializerProvider.findValueSerializer(contentType, beanProperty);
            }
        } else if (jsonSerializer instanceof ContextualSerializer) {
            jsonSerializer = ((ContextualSerializer) jsonSerializer).createContextual(serializerProvider, beanProperty);
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        JsonSerializer<Object> jsonSerializer2 = null;
        Annotated member = beanProperty == null ? null : beanProperty.getMember();
        Object obj = this._filterId;
        if (!(member == null || annotationIntrospector == null)) {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(member);
            if (findKeySerializer != null) {
                jsonSerializer2 = serializerProvider.serializerInstance(member, findKeySerializer);
            }
            Object findContentSerializer = annotationIntrospector.findContentSerializer(member);
            if (findContentSerializer != null) {
                jsonSerializer = serializerProvider.serializerInstance(member, findContentSerializer);
            }
            obj = annotationIntrospector.findFilterId(member);
        }
        Object obj2 = obj;
        if (jsonSerializer == null) {
            jsonSerializer = this._valueSerializer;
        }
        JsonSerializer findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer);
        if (findContextualConvertingSerializer == null) {
            JavaType contentType2 = this._type.getContentType();
            if (contentType2.useStaticType()) {
                findContextualConvertingSerializer = serializerProvider.findValueSerializer(contentType2, beanProperty);
            }
        } else {
            findContextualConvertingSerializer = serializerProvider.handleSecondaryContextualization(findContextualConvertingSerializer, beanProperty);
        }
        JsonSerializer jsonSerializer3 = findContextualConvertingSerializer;
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this._keySerializer;
        }
        JsonSerializer findKeySerializer2 = jsonSerializer2 == null ? serializerProvider.findKeySerializer(this._type.getKeyType(), beanProperty) : serializerProvider.handleSecondaryContextualization(jsonSerializer2, beanProperty);
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        TypeSerializer typeSerializer2 = typeSerializer;
        Set<String> set = this._ignoredEntries;
        boolean z2 = false;
        if (!(annotationIntrospector == null || member == null)) {
            Value findPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member);
            if (findPropertyIgnorals != null) {
                Set<String> findIgnoredForSerialization = findPropertyIgnorals.findIgnoredForSerialization();
                if (findIgnoredForSerialization != null && !findIgnoredForSerialization.isEmpty()) {
                    set = set == null ? new HashSet<>() : new HashSet<>(set);
                    for (String add : findIgnoredForSerialization) {
                        set.add(add);
                    }
                }
            }
            Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(member);
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
                return withResolved(beanProperty, findKeySerializer2, typeSerializer2, jsonSerializer3, set2, obj2, z);
            }
        }
        z = z2;
        return withResolved(beanProperty, findKeySerializer2, typeSerializer2, jsonSerializer3, set2, obj2, z);
    }

    public boolean hasSingleElement(fdf<?, ?> fdf) {
        return fdf.e() == 1;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, fdf<?, ?> fdf) {
        return fdf.l();
    }

    public void serialize(fdf<?, ?> fdf, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeStartObject();
        jsonGenerator.setCurrentValue(fdf);
        if (!fdf.l()) {
            if (this._filterId != null) {
                serializeFilteredFields(fdf, jsonGenerator, serializerProvider);
            } else {
                serializeFields(fdf, jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeWithType(fdf<?, ?> fdf, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.setCurrentValue(fdf);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(fdf, JsonToken.START_OBJECT));
        if (!fdf.l()) {
            if (this._filterId != null) {
                serializeFilteredFields(fdf, jsonGenerator, serializerProvider);
            } else {
                serializeFields(fdf, jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    /* access modifiers changed from: protected */
    public MultimapSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Object obj, boolean z) {
        MultimapSerializer multimapSerializer = new MultimapSerializer(this, beanProperty, jsonSerializer, typeSerializer, jsonSerializer2, set, obj, z);
        return multimapSerializer;
    }
}
