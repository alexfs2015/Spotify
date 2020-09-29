package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.introspect.Annotated;

public class PropertyBuilder {
    private static final Object NO_DEFAULT_MARKER = Boolean.FALSE;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.AnonymousClass1.<clinit>():void");
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        Value merge = Value.merge(beanDescription.findPropertyInclusion(Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), Value.empty()));
        this._defaultInclusion = Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        this._useRealPropertyDefaults = merge.getValueInclusion() == Include.NON_DEFAULT;
        this._annotationIntrospector = this._config.getAnnotationIntrospector();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.ser.BeanPropertyWriter buildWriter(com.fasterxml.jackson.databind.SerializerProvider r16, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r17, com.fasterxml.jackson.databind.JavaType r18, com.fasterxml.jackson.databind.JsonSerializer<?> r19, com.fasterxml.jackson.databind.jsontype.TypeSerializer r20, com.fasterxml.jackson.databind.jsontype.TypeSerializer r21, com.fasterxml.jackson.databind.introspect.AnnotatedMember r22, boolean r23) {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            r4 = r17
            r7 = r18
            r0 = r21
            r14 = r22
            r3 = 0
            r5 = r23
            com.fasterxml.jackson.databind.JavaType r5 = r15.findSerializationType(r14, r5, r7)     // Catch:{ JsonMappingException -> 0x0152 }
            if (r0 == 0) goto L_0x0040
            if (r5 != 0) goto L_0x0017
            r5 = r7
        L_0x0017:
            com.fasterxml.jackson.databind.JavaType r6 = r5.getContentType()
            if (r6 != 0) goto L_0x0037
            com.fasterxml.jackson.databind.BeanDescription r6 = r1._beanDesc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "serialization type "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r9 = " has no content"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r2.reportBadPropertyDefinition(r6, r4, r8, r9)
        L_0x0037:
            com.fasterxml.jackson.databind.JavaType r0 = r5.withContentTypeHandler(r0)
            r0.getContentType()
            r10 = r0
            goto L_0x0041
        L_0x0040:
            r10 = r5
        L_0x0041:
            r5 = 0
            if (r10 != 0) goto L_0x0046
            r0 = r7
            goto L_0x0047
        L_0x0046:
            r0 = r10
        L_0x0047:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r17.getAccessor()
            if (r6 != 0) goto L_0x005a
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "could not determine property type"
            java.lang.Object r0 = r2.reportBadPropertyDefinition(r0, r4, r5, r3)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        L_0x005a:
            java.lang.Class r6 = r6.getRawType()
            com.fasterxml.jackson.databind.SerializationConfig r8 = r1._config
            java.lang.Class r9 = r0.getRawClass()
            com.fasterxml.jackson.annotation.JsonInclude$Value r11 = r1._defaultInclusion
            com.fasterxml.jackson.annotation.JsonInclude$Value r6 = r8.getDefaultInclusion(r9, r6, r11)
            com.fasterxml.jackson.annotation.JsonInclude$Value r8 = r17.findInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Value r6 = r6.withOverrides(r8)
            com.fasterxml.jackson.annotation.JsonInclude$Include r8 = r6.getValueInclusion()
            com.fasterxml.jackson.annotation.JsonInclude$Include r9 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS
            if (r8 != r9) goto L_0x007c
            com.fasterxml.jackson.annotation.JsonInclude$Include r8 = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS
        L_0x007c:
            int[] r9 = com.fasterxml.jackson.databind.ser.PropertyBuilder.AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r9 = 1
            if (r8 == r9) goto L_0x00ce
            r11 = 2
            if (r8 == r11) goto L_0x00c2
            r11 = 3
            if (r8 == r11) goto L_0x00be
            r11 = 4
            if (r8 == r11) goto L_0x00ac
            r6 = 5
            if (r8 == r6) goto L_0x0094
            r9 = 0
        L_0x0094:
            boolean r0 = r0.isContainerType()
            if (r0 == 0) goto L_0x00a8
            com.fasterxml.jackson.databind.SerializationConfig r0 = r1._config
            com.fasterxml.jackson.databind.SerializationFeature r3 = com.fasterxml.jackson.databind.SerializationFeature.WRITE_EMPTY_JSON_ARRAYS
            boolean r0 = r0.isEnabled(r3)
            if (r0 != 0) goto L_0x00a8
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            r12 = r0
            goto L_0x00a9
        L_0x00a8:
            r12 = r5
        L_0x00a9:
            r11 = r9
            goto L_0x0113
        L_0x00ac:
            java.lang.Class r0 = r6.getValueFilter()
            java.lang.Object r0 = r2.includeFilterInstance(r4, r0)
            if (r0 != 0) goto L_0x00b7
            goto L_0x00c0
        L_0x00b7:
            boolean r3 = r2.includeFilterSuppressNulls(r0)
        L_0x00bb:
            r12 = r0
            r11 = r3
            goto L_0x0113
        L_0x00be:
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
        L_0x00c0:
            r12 = r0
            goto L_0x00cc
        L_0x00c2:
            boolean r0 = r0.isReferenceType()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY
            goto L_0x00c0
        L_0x00cb:
            r12 = r5
        L_0x00cc:
            r11 = 1
            goto L_0x0113
        L_0x00ce:
            boolean r6 = r1._useRealPropertyDefaults
            if (r6 == 0) goto L_0x00fa
            java.lang.Object r6 = r15.getDefaultBean()
            if (r6 == 0) goto L_0x00fa
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS
            boolean r0 = r2.isEnabled(r0)
            if (r0 == 0) goto L_0x00eb
            com.fasterxml.jackson.databind.SerializationConfig r0 = r1._config
            com.fasterxml.jackson.databind.MapperFeature r8 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r0 = r0.isEnabled(r8)
            r14.fixAccess(r0)
        L_0x00eb:
            java.lang.Object r5 = r14.getValue(r6)     // Catch:{ Exception -> 0x00f0 }
            goto L_0x00ff
        L_0x00f0:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = r17.getName()
            r15._throwWrapped(r8, r0, r6)
            goto L_0x00ff
        L_0x00fa:
            java.lang.Object r5 = com.fasterxml.jackson.databind.util.BeanUtil.getDefaultValue(r0)
            r3 = 1
        L_0x00ff:
            if (r5 != 0) goto L_0x0102
            goto L_0x00cb
        L_0x0102:
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = com.fasterxml.jackson.databind.util.ArrayBuilders.getArrayComparator(r5)
            goto L_0x00bb
        L_0x0111:
            r11 = r3
            r12 = r5
        L_0x0113:
            java.lang.Class[] r0 = r17.findViews()
            if (r0 != 0) goto L_0x011f
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.Class[] r0 = r0.findDefaultViews()
        L_0x011f:
            r13 = r0
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter
            com.fasterxml.jackson.databind.BeanDescription r3 = r1._beanDesc
            com.fasterxml.jackson.databind.util.Annotations r6 = r3.getClassAnnotations()
            r3 = r0
            r4 = r17
            r5 = r22
            r7 = r18
            r8 = r19
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r1._annotationIntrospector
            java.lang.Object r3 = r3.findNullSerializer(r14)
            if (r3 == 0) goto L_0x0145
            com.fasterxml.jackson.databind.JsonSerializer r2 = r2.serializerInstance(r14, r3)
            r0.assignNullSerializer(r2)
        L_0x0145:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r1._annotationIntrospector
            com.fasterxml.jackson.databind.util.NameTransformer r2 = r2.findUnwrappingNameTransformer(r14)
            if (r2 == 0) goto L_0x0151
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = r0.unwrappingWriter(r2)
        L_0x0151:
            return r0
        L_0x0152:
            r0 = move-exception
            r5 = r0
            if (r4 != 0) goto L_0x0161
            java.lang.String r0 = r5.getMessage()
            java.lang.Object r0 = r2.reportBadDefinition(r7, r0)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        L_0x0161:
            com.fasterxml.jackson.databind.BeanDescription r0 = r1._beanDesc
            java.lang.String r5 = r5.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r0 = r2.reportBadPropertyDefinition(r0, r4, r5, r3)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter r0 = (com.fasterxml.jackson.databind.ser.BeanPropertyWriter) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.introspect.AnnotatedMember, boolean):com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
    }

    /* access modifiers changed from: protected */
    public JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        if (refineSerializationType != javaType) {
            Class rawClass = refineSerializationType.getRawClass();
            Class rawClass2 = javaType.getRawClass();
            if (rawClass.isAssignableFrom(rawClass2) || rawClass2.isAssignableFrom(rawClass)) {
                javaType = refineSerializationType;
                z = true;
            } else {
                StringBuilder sb = new StringBuilder("Illegal concrete-type annotation for method '");
                sb.append(annotated.getName());
                sb.append("': class ");
                sb.append(rawClass.getName());
                sb.append(" not a super-type of (declared) class ");
                sb.append(rawClass2.getName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (!(findSerializationTyping == null || findSerializationTyping == Typing.DEFAULT_TYPING)) {
            z = findSerializationTyping == Typing.STATIC;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Object getDefaultBean() {
        Object obj = this._defaultBean;
        if (obj == null) {
            obj = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (obj == null) {
                obj = NO_DEFAULT_MARKER;
            }
            this._defaultBean = obj;
        }
        if (obj == NO_DEFAULT_MARKER) {
            return null;
        }
        return this._defaultBean;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Throwable, for r3v0, types: [java.lang.Throwable, java.lang.Exception] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _throwWrapped(java.lang.Throwable r3, java.lang.String r4, java.lang.Object r5) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L_0x000b
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0000
        L_0x000b:
            com.fasterxml.jackson.databind.util.ClassUtil.throwIfError(r3)
            com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE(r3)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to get property '"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "' of default "
            r0.append(r4)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = " instance"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            goto L_0x003b
        L_0x003a:
            throw r3
        L_0x003b:
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(java.lang.Exception, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
