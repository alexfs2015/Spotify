package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class BeanSerializerBase extends StdSerializer<Object> implements JsonFormatVisitable, ContextualSerializer, ResolvableSerializer {
    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    public static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    protected final AnyGetterWriter _anyGetterWriter;
    protected final JavaType _beanType;
    protected final BeanPropertyWriter[] _filteredProps;
    protected final ObjectIdWriter _objectIdWriter;
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter[] _props;
    protected final Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[Shape.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonFormat$Shape[] r0 = com.fasterxml.jackson.annotation.JsonFormat.Shape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = r0
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public abstract BeanSerializerBase asArraySerializer();

    public abstract BeanSerializerBase withFilterId(Object obj);

    /* access modifiers changed from: protected */
    public abstract BeanSerializerBase withIgnorals(Set<String> set);

    public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter);

    protected BeanSerializerBase(JavaType javaType, BeanSerializerBuilder beanSerializerBuilder, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this._beanType = javaType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        Shape shape = null;
        if (beanSerializerBuilder == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
        } else {
            this._typeId = beanSerializerBuilder.getTypeId();
            this._anyGetterWriter = beanSerializerBuilder.getAnyGetter();
            this._propertyFilterId = beanSerializerBuilder.getFilterId();
            this._objectIdWriter = beanSerializerBuilder.getObjectIdWriter();
            Value findExpectedFormat = beanSerializerBuilder.getBeanDescription().findExpectedFormat(null);
            if (findExpectedFormat != null) {
                shape = findExpectedFormat.getShape();
            }
        }
        this._serializationShape = shape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    protected BeanSerializerBase(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter) {
        this(beanSerializerBase, objectIdWriter, beanSerializerBase._propertyFilterId);
    }

    protected BeanSerializerBase(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = objectIdWriter;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    protected BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set) {
        ArrayList arrayList;
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase._props;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase._filteredProps;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList2 = new ArrayList(length);
        BeanPropertyWriter[] beanPropertyWriterArr3 = null;
        if (beanPropertyWriterArr2 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(length);
        }
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (set == null || !set.contains(beanPropertyWriter.getName())) {
                arrayList2.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList.add(beanPropertyWriterArr2[i]);
                }
            }
        }
        this._props = (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]);
        if (arrayList != null) {
            beanPropertyWriterArr3 = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        }
        this._filteredProps = beanPropertyWriterArr3;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    protected BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, rename(beanSerializerBase._props, nameTransformer), rename(beanSerializerBase._filteredProps, nameTransformer));
    }

    private static final BeanPropertyWriter[] rename(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i = 0; i < length; i++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i] = beanPropertyWriter.rename(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    public void resolve(SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr = this._filteredProps;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this._props.length;
        for (int i = 0; i < length2; i++) {
            BeanPropertyWriter beanPropertyWriter = this._props[i];
            if (!beanPropertyWriter.willSuppressNulls() && !beanPropertyWriter.hasNullSerializer()) {
                JsonSerializer findNullValueSerializer = serializerProvider.findNullValueSerializer(beanPropertyWriter);
                if (findNullValueSerializer != null) {
                    beanPropertyWriter.assignNullSerializer(findNullValueSerializer);
                    if (i < length) {
                        BeanPropertyWriter beanPropertyWriter2 = this._filteredProps[i];
                        if (beanPropertyWriter2 != null) {
                            beanPropertyWriter2.assignNullSerializer(findNullValueSerializer);
                        }
                    }
                }
            }
            if (!beanPropertyWriter.hasSerializer()) {
                JsonSerializer findConvertingSerializer = findConvertingSerializer(serializerProvider, beanPropertyWriter);
                if (findConvertingSerializer == null) {
                    JavaType serializationType = beanPropertyWriter.getSerializationType();
                    if (serializationType == null) {
                        serializationType = beanPropertyWriter.getType();
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                beanPropertyWriter.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(serializationType, (BeanProperty) beanPropertyWriter);
                    if (serializationType.isContainerType()) {
                        TypeSerializer typeSerializer = (TypeSerializer) serializationType.getContentType().getTypeHandler();
                        if (typeSerializer != null && (findValueSerializer instanceof ContainerSerializer)) {
                            findConvertingSerializer = ((ContainerSerializer) findValueSerializer).withValueTypeSerializer(typeSerializer);
                        }
                    }
                    findConvertingSerializer = findValueSerializer;
                }
                if (i < length) {
                    BeanPropertyWriter beanPropertyWriter3 = this._filteredProps[i];
                    if (beanPropertyWriter3 != null) {
                        beanPropertyWriter3.assignSerializer(findConvertingSerializer);
                    }
                }
                beanPropertyWriter.assignSerializer(findConvertingSerializer);
            }
        }
        AnyGetterWriter anyGetterWriter = this._anyGetterWriter;
        if (anyGetterWriter != null) {
            anyGetterWriter.resolve(serializerProvider);
        }
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> findConvertingSerializer(SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter) {
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        JsonSerializer jsonSerializer = null;
        if (annotationIntrospector != null) {
            AnnotatedMember member = beanPropertyWriter.getMember();
            if (member != null) {
                Object findSerializationConverter = annotationIntrospector.findSerializationConverter(member);
                if (findSerializationConverter != null) {
                    Converter converterInstance = serializerProvider.converterInstance(beanPropertyWriter.getMember(), findSerializationConverter);
                    JavaType outputType = converterInstance.getOutputType(serializerProvider.getTypeFactory());
                    if (!outputType.isJavaLangObject()) {
                        jsonSerializer = serializerProvider.findValueSerializer(outputType, (BeanProperty) beanPropertyWriter);
                    }
                    return new StdDelegatingSerializer(converterInstance, outputType, jsonSerializer);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r18, com.fasterxml.jackson.databind.BeanProperty r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r9 = r19
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r18.getAnnotationIntrospector()
            r3 = 0
            if (r9 == 0) goto L_0x0015
            if (r2 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r4 = r19.getMember()
            goto L_0x0016
        L_0x0015:
            r4 = r3
        L_0x0016:
            com.fasterxml.jackson.databind.SerializationConfig r5 = r18.getConfig()
            java.lang.Class r6 = r17.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r6 = r0.findFormatOverrides(r1, r9, r6)
            r7 = 2
            r8 = 1
            r10 = 0
            if (r6 == 0) goto L_0x00ab
            boolean r11 = r6.hasShape()
            if (r11 == 0) goto L_0x00ab
            com.fasterxml.jackson.annotation.JsonFormat$Shape r11 = r6.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r12 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ANY
            if (r11 == r12) goto L_0x00ac
            com.fasterxml.jackson.annotation.JsonFormat$Shape r12 = r0._serializationShape
            if (r11 == r12) goto L_0x00ac
            java.lang.Class r12 = r0._handledType
            boolean r12 = r12.isEnum()
            if (r12 == 0) goto L_0x006a
            int[] r12 = com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape
            int r13 = r11.ordinal()
            r12 = r12[r13]
            if (r12 == r8) goto L_0x0051
            if (r12 == r7) goto L_0x0051
            r13 = 3
            if (r12 == r13) goto L_0x0051
            goto L_0x00ac
        L_0x0051:
            com.fasterxml.jackson.databind.JavaType r2 = r0._beanType
            com.fasterxml.jackson.databind.BeanDescription r2 = r5.introspectClassAnnotations(r2)
            com.fasterxml.jackson.databind.JavaType r3 = r0._beanType
            java.lang.Class r3 = r3.getRawClass()
            com.fasterxml.jackson.databind.SerializationConfig r4 = r18.getConfig()
            com.fasterxml.jackson.databind.ser.std.EnumSerializer r2 = com.fasterxml.jackson.databind.ser.std.EnumSerializer.construct(r3, r4, r2, r6)
            com.fasterxml.jackson.databind.JsonSerializer r1 = r1.handlePrimaryContextualization(r2, r9)
            return r1
        L_0x006a:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r5 = com.fasterxml.jackson.annotation.JsonFormat.Shape.NATURAL
            if (r11 != r5) goto L_0x00ac
            com.fasterxml.jackson.databind.JavaType r5 = r0._beanType
            boolean r5 = r5.isMapLikeType()
            if (r5 == 0) goto L_0x0080
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.Class r6 = r0._handledType
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 != 0) goto L_0x00ac
        L_0x0080:
            java.lang.Class<java.util.Map$Entry> r5 = java.util.Map.Entry.class
            java.lang.Class r6 = r0._handledType
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L_0x00ac
            com.fasterxml.jackson.databind.JavaType r2 = r0._beanType
            java.lang.Class<java.util.Map$Entry> r3 = java.util.Map.Entry.class
            com.fasterxml.jackson.databind.JavaType r2 = r2.findSuperType(r3)
            com.fasterxml.jackson.databind.JavaType r4 = r2.containedTypeOrUnknown(r10)
            com.fasterxml.jackson.databind.JavaType r5 = r2.containedTypeOrUnknown(r8)
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r10 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            com.fasterxml.jackson.databind.JavaType r3 = r0._beanType
            r6 = 0
            r7 = 0
            r2 = r10
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.fasterxml.jackson.databind.JsonSerializer r1 = r1.handlePrimaryContextualization(r10, r9)
            return r1
        L_0x00ab:
            r11 = r3
        L_0x00ac:
            com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter r5 = r0._objectIdWriter
            if (r4 == 0) goto L_0x017d
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r6 = r2.findPropertyIgnorals(r4)
            if (r6 == 0) goto L_0x00bb
            java.util.Set r6 = r6.findIgnoredForSerialization()
            goto L_0x00bc
        L_0x00bb:
            r6 = r3
        L_0x00bc:
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo r12 = r2.findObjectIdInfo(r4)
            if (r12 != 0) goto L_0x00d7
            if (r5 == 0) goto L_0x00d4
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo r7 = r2.findObjectReferenceInfo(r4, r3)
            if (r7 == 0) goto L_0x00d4
            com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter r5 = r0._objectIdWriter
            boolean r7 = r7.getAlwaysAsId()
            com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter r5 = r5.withAlwaysAsId(r7)
        L_0x00d4:
            r15 = r3
            goto L_0x016b
        L_0x00d7:
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo r5 = r2.findObjectReferenceInfo(r4, r12)
            java.lang.Class r12 = r5.getGeneratorType()
            com.fasterxml.jackson.databind.JavaType r13 = r1.constructType(r12)
            com.fasterxml.jackson.databind.type.TypeFactory r14 = r18.getTypeFactory()
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerator> r15 = com.fasterxml.jackson.annotation.ObjectIdGenerator.class
            com.fasterxml.jackson.databind.JavaType[] r13 = r14.findTypeParameters(r13, r15)
            r13 = r13[r10]
            java.lang.Class<com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator> r14 = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class
            if (r12 != r14) goto L_0x0159
            com.fasterxml.jackson.databind.PropertyName r12 = r5.getPropertyName()
            java.lang.String r12 = r12.getSimpleName()
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r13 = r0._props
            int r14 = r13.length
            r13 = 0
        L_0x00ff:
            if (r13 != r14) goto L_0x011a
            com.fasterxml.jackson.databind.JavaType r15 = r0._beanType
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Class r16 = r17.handledType()
            java.lang.String r16 = r16.getName()
            r3[r10] = r16
            r3[r8] = r12
            java.lang.String r7 = "Invalid Object Id definition for %s: cannot find property with name '%s'"
            java.lang.String r3 = java.lang.String.format(r7, r3)
            r1.reportBadDefinition(r15, r3)
        L_0x011a:
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r3 = r0._props
            r3 = r3[r13]
            java.lang.String r7 = r3.getName()
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x0153
            if (r13 <= 0) goto L_0x0140
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r7 = r0._props
            java.lang.System.arraycopy(r7, r10, r7, r8, r13)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r7 = r0._props
            r7[r10] = r3
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r7 = r0._filteredProps
            if (r7 == 0) goto L_0x0140
            r12 = r7[r13]
            java.lang.System.arraycopy(r7, r10, r7, r8, r13)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] r7 = r0._filteredProps
            r7[r10] = r12
        L_0x0140:
            com.fasterxml.jackson.databind.JavaType r7 = r3.getType()
            com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator r8 = new com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator
            r8.<init>(r5, r3)
            boolean r3 = r5.getAlwaysAsId()
            r15 = 0
            com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter r3 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(r7, r15, r8, r3)
            goto L_0x016a
        L_0x0153:
            r15 = 0
            int r13 = r13 + 1
            r3 = r15
            r7 = 2
            goto L_0x00ff
        L_0x0159:
            r15 = r3
            com.fasterxml.jackson.annotation.ObjectIdGenerator r3 = r1.objectIdGeneratorInstance(r4, r5)
            com.fasterxml.jackson.databind.PropertyName r7 = r5.getPropertyName()
            boolean r5 = r5.getAlwaysAsId()
            com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter r3 = com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter.construct(r13, r7, r3, r5)
        L_0x016a:
            r5 = r3
        L_0x016b:
            java.lang.Object r3 = r2.findFilterId(r4)
            if (r3 == 0) goto L_0x017f
            java.lang.Object r2 = r0._propertyFilterId
            if (r2 == 0) goto L_0x017b
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x017f
        L_0x017b:
            r15 = r3
            goto L_0x017f
        L_0x017d:
            r15 = r3
            r6 = r15
        L_0x017f:
            if (r5 == 0) goto L_0x0194
            com.fasterxml.jackson.databind.JavaType r2 = r5.idType
            com.fasterxml.jackson.databind.JsonSerializer r1 = r1.findValueSerializer(r2, r9)
            com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter r1 = r5.withSerializer(r1)
            com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter r2 = r0._objectIdWriter
            if (r1 == r2) goto L_0x0194
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r1 = r0.withObjectIdWriter(r1)
            goto L_0x0195
        L_0x0194:
            r1 = r0
        L_0x0195:
            if (r6 == 0) goto L_0x01a1
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x01a1
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r1 = r1.withIgnorals(r6)
        L_0x01a1:
            if (r15 == 0) goto L_0x01a7
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r1 = r1.withFilterId(r15)
        L_0x01a7:
            if (r11 != 0) goto L_0x01ab
            com.fasterxml.jackson.annotation.JsonFormat$Shape r11 = r0._serializationShape
        L_0x01ab:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY
            if (r11 != r2) goto L_0x01b3
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r1 = r1.asArraySerializer()
        L_0x01b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public Iterator<PropertyWriter> properties() {
        return Arrays.asList(this._props).iterator();
    }

    public boolean usesObjectId() {
        return this._objectIdWriter != null;
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (this._objectIdWriter != null) {
            jsonGenerator.setCurrentValue(obj);
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        jsonGenerator.setCurrentValue(obj);
        WritableTypeId _typeIdDef = _typeIdDef(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.writeTypePrefix(jsonGenerator, _typeIdDef);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, _typeIdDef);
    }

    /* access modifiers changed from: protected */
    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z) {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableObjectId findObjectId = serializerProvider.findObjectId(obj, objectIdWriter.generator);
        if (!findObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter)) {
            Object generateId = findObjectId.generateId(obj);
            if (objectIdWriter.alwaysAsId) {
                objectIdWriter.serializer.serialize(generateId, jsonGenerator, serializerProvider);
                return;
            }
            if (z) {
                jsonGenerator.writeStartObject(obj);
            }
            findObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);
            if (this._propertyFilterId != null) {
                serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
            } else {
                serializeFields(obj, jsonGenerator, serializerProvider);
            }
            if (z) {
                jsonGenerator.writeEndObject();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableObjectId findObjectId = serializerProvider.findObjectId(obj, objectIdWriter.generator);
        if (!findObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter)) {
            Object generateId = findObjectId.generateId(obj);
            if (objectIdWriter.alwaysAsId) {
                objectIdWriter.serializer.serialize(generateId, jsonGenerator, serializerProvider);
            } else {
                _serializeObjectId(obj, jsonGenerator, serializerProvider, typeSerializer, findObjectId);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _serializeObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer, WritableObjectId writableObjectId) {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableTypeId _typeIdDef = _typeIdDef(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.writeTypePrefix(jsonGenerator, _typeIdDef);
        writableObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, _typeIdDef);
    }

    /* access modifiers changed from: protected */
    public final WritableTypeId _typeIdDef(TypeSerializer typeSerializer, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this._typeId;
        if (annotatedMember == null) {
            return typeSerializer.typeId(obj, jsonToken);
        }
        Object value = annotatedMember.getValue(obj);
        if (value == null) {
            value = "";
        }
        return typeSerializer.typeId(obj, jsonToken, value);
    }

    /* access modifiers changed from: protected */
    public void serializeFields(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        String str = "[anySetter]";
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
                }
            }
            if (this._anyGetterWriter != null) {
                this._anyGetterWriter.getAndSerialize(obj, jsonGenerator, serializerProvider);
            }
        } catch (Exception e) {
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            wrapAndThrow(serializerProvider, (Throwable) e, obj, str);
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException((Closeable) jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e2);
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            jsonMappingException.prependPath(new Reference(obj, str));
            throw jsonMappingException;
        }
    }

    /* access modifiers changed from: protected */
    public void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        String str = "[anySetter]";
        if (this._filteredProps == null || serializerProvider.getActiveView() == null) {
            beanPropertyWriterArr = this._props;
        } else {
            beanPropertyWriterArr = this._filteredProps;
        }
        PropertyFilter findPropertyFilter = findPropertyFilter(serializerProvider, this._propertyFilterId, obj);
        if (findPropertyFilter == null) {
            serializeFields(obj, jsonGenerator, serializerProvider);
            return;
        }
        try {
            for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                if (beanPropertyWriter != null) {
                    findPropertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, beanPropertyWriter);
                }
            }
            if (this._anyGetterWriter != null) {
                this._anyGetterWriter.getAndFilter(obj, jsonGenerator, serializerProvider, findPropertyFilter);
            }
        } catch (Exception e) {
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            wrapAndThrow(serializerProvider, (Throwable) e, obj, str);
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException((Closeable) jsonGenerator, "Infinite recursion (StackOverflowError)", (Throwable) e2);
            if (0 != beanPropertyWriterArr.length) {
                str = beanPropertyWriterArr[0].getName();
            }
            jsonMappingException.prependPath(new Reference(obj, str));
            throw jsonMappingException;
        }
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (jsonFormatVisitorWrapper != null) {
            JsonObjectFormatVisitor expectObjectFormat = jsonFormatVisitorWrapper.expectObjectFormat(javaType);
            if (expectObjectFormat != null) {
                SerializerProvider provider = jsonFormatVisitorWrapper.getProvider();
                int i = 0;
                Class cls = null;
                if (this._propertyFilterId != null) {
                    PropertyFilter findPropertyFilter = findPropertyFilter(jsonFormatVisitorWrapper.getProvider(), this._propertyFilterId, null);
                    int length = this._props.length;
                    while (i < length) {
                        findPropertyFilter.depositSchemaProperty(this._props[i], expectObjectFormat, provider);
                        i++;
                    }
                    return;
                }
                if (!(this._filteredProps == null || provider == null)) {
                    cls = provider.getActiveView();
                }
                if (cls != null) {
                    beanPropertyWriterArr = this._filteredProps;
                } else {
                    beanPropertyWriterArr = this._props;
                }
                int length2 = beanPropertyWriterArr.length;
                while (i < length2) {
                    BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                    if (beanPropertyWriter != null) {
                        beanPropertyWriter.depositSchemaProperty(expectObjectFormat, provider);
                    }
                    i++;
                }
            }
        }
    }
}
