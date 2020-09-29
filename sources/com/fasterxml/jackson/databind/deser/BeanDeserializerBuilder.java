package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BeanDeserializerBuilder {
    protected SettableAnyProperty _anySetter;
    protected HashMap<String, SettableBeanProperty> _backRefProperties;
    protected final BeanDescription _beanDesc;
    protected AnnotatedMethod _buildMethod;
    protected Value _builderConfig;
    protected final DeserializationConfig _config;
    protected final DeserializationContext _context;
    protected HashSet<String> _ignorableProps;
    protected boolean _ignoreAllUnknown;
    protected List<ValueInjector> _injectables;
    protected ObjectIdReader _objectIdReader;
    protected final Map<String, SettableBeanProperty> _properties = new LinkedHashMap();
    protected ValueInstantiator _valueInstantiator;

    public BeanDeserializerBuilder(BeanDescription beanDescription, DeserializationContext deserializationContext) {
        this._beanDesc = beanDescription;
        this._context = deserializationContext;
        this._config = deserializationContext.getConfig();
    }

    /* access modifiers changed from: protected */
    public Map<String, List<PropertyName>> _collectAliases(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this._config.getAnnotationIntrospector();
        HashMap hashMap = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                List findPropertyAliases = annotationIntrospector.findPropertyAliases(settableBeanProperty.getMember());
                if (findPropertyAliases != null && !findPropertyAliases.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(settableBeanProperty.getName(), findPropertyAliases);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }

    /* access modifiers changed from: protected */
    public void _fixAccess(Collection<SettableBeanProperty> collection) {
        for (SettableBeanProperty fixAccess : collection) {
            fixAccess.fixAccess(this._config);
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null) {
            settableAnyProperty.fixAccess(this._config);
        }
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod != null) {
            annotatedMethod.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    public void addBackReferenceProperty(String str, SettableBeanProperty settableBeanProperty) {
        if (this._backRefProperties == null) {
            this._backRefProperties = new HashMap<>(4);
        }
        settableBeanProperty.fixAccess(this._config);
        this._backRefProperties.put(str, settableBeanProperty);
    }

    public void addCreatorProperty(SettableBeanProperty settableBeanProperty) {
        addProperty(settableBeanProperty);
    }

    public void addIgnorable(String str) {
        if (this._ignorableProps == null) {
            this._ignorableProps = new HashSet<>();
        }
        this._ignorableProps.add(str);
    }

    public void addInjectable(PropertyName propertyName, JavaType javaType, Annotations annotations, AnnotatedMember annotatedMember, Object obj) {
        if (this._injectables == null) {
            this._injectables = new ArrayList();
        }
        boolean canOverrideAccessModifiers = this._config.canOverrideAccessModifiers();
        boolean z = canOverrideAccessModifiers && this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        if (canOverrideAccessModifiers) {
            annotatedMember.fixAccess(z);
        }
        this._injectables.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    public void addOrReplaceProperty(SettableBeanProperty settableBeanProperty, boolean z) {
        this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    public void addProperty(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._properties.put(settableBeanProperty.getName(), settableBeanProperty);
        if (settableBeanProperty2 != null && settableBeanProperty2 != settableBeanProperty) {
            StringBuilder sb = new StringBuilder("Duplicate property '");
            sb.append(settableBeanProperty.getName());
            sb.append("' for ");
            sb.append(this._beanDesc.getType());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> build() {
        /*
            r13 = this;
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r0 = r13._properties
            java.util.Collection r0 = r0.values()
            r13._fixAccess(r0)
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r13._config
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r1 = r1.isEnabled(r2)
            java.util.Map r2 = r13._collectAliases(r0)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r1 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(r0, r1, r2)
            r1.assignIndexes()
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r13._config
            com.fasterxml.jackson.databind.MapperFeature r3 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION
            boolean r2 = r2.isEnabled(r3)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 != 0) goto L_0x0040
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r0.next()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r4
            boolean r4 = r4.hasViews()
            if (r4 == 0) goto L_0x002c
            r12 = 1
            goto L_0x0041
        L_0x0040:
            r12 = r2
        L_0x0041:
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = r13._objectIdReader
            if (r0 == 0) goto L_0x0050
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty r2 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
            com.fasterxml.jackson.databind.PropertyMetadata r3 = com.fasterxml.jackson.databind.PropertyMetadata.STD_REQUIRED
            r2.<init>(r0, r3)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r1 = r1.withProperty(r2)
        L_0x0050:
            r8 = r1
            com.fasterxml.jackson.databind.deser.BeanDeserializer r0 = new com.fasterxml.jackson.databind.deser.BeanDeserializer
            com.fasterxml.jackson.databind.BeanDescription r7 = r13._beanDesc
            java.util.HashMap<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r9 = r13._backRefProperties
            java.util.HashSet<java.lang.String> r10 = r13._ignorableProps
            boolean r11 = r13._ignoreAllUnknown
            r5 = r0
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder.build():com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public AbstractDeserializer buildAbstract() {
        return new AbstractDeserializer(this, this._beanDesc, this._backRefProperties, this._properties);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> buildBuilderBased(com.fasterxml.jackson.databind.JavaType r14, java.lang.String r15) {
        /*
            r13 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = r13._buildMethod
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x002f
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0071
            com.fasterxml.jackson.databind.DeserializationContext r0 = r13._context
            com.fasterxml.jackson.databind.BeanDescription r4 = r13._beanDesc
            com.fasterxml.jackson.databind.JavaType r4 = r4.getType()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.fasterxml.jackson.databind.BeanDescription r5 = r13._beanDesc
            java.lang.Class r5 = r5.getBeanClass()
            java.lang.String r5 = r5.getName()
            r2[r1] = r5
            r2[r3] = r15
            java.lang.String r15 = "Builder class %s does not have build method (name: '%s')"
            java.lang.String r15 = java.lang.String.format(r15, r2)
            r0.reportBadDefinition(r4, r15)
            goto L_0x0071
        L_0x002f:
            java.lang.Class r15 = r0.getRawReturnType()
            java.lang.Class r0 = r14.getRawClass()
            if (r15 == r0) goto L_0x0071
            boolean r4 = r15.isAssignableFrom(r0)
            if (r4 != 0) goto L_0x0071
            boolean r0 = r0.isAssignableFrom(r15)
            if (r0 != 0) goto L_0x0071
            com.fasterxml.jackson.databind.DeserializationContext r0 = r13._context
            com.fasterxml.jackson.databind.BeanDescription r4 = r13._beanDesc
            com.fasterxml.jackson.databind.JavaType r4 = r4.getType()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r6 = r13._buildMethod
            java.lang.String r6 = r6.getFullName()
            r5[r1] = r6
            java.lang.String r15 = r15.getName()
            r5[r3] = r15
            java.lang.Class r15 = r14.getRawClass()
            java.lang.String r15 = r15.getName()
            r5[r2] = r15
            java.lang.String r15 = "Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)"
            java.lang.String r15 = java.lang.String.format(r15, r5)
            r0.reportBadDefinition(r4, r15)
        L_0x0071:
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r15 = r13._properties
            java.util.Collection r15 = r15.values()
            r13._fixAccess(r15)
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r13._config
            com.fasterxml.jackson.databind.MapperFeature r1 = com.fasterxml.jackson.databind.MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r0 = r0.isEnabled(r1)
            java.util.Map r1 = r13._collectAliases(r15)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r0 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(r15, r0, r1)
            r0.assignIndexes()
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r13._config
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION
            boolean r1 = r1.isEnabled(r2)
            r1 = r1 ^ r3
            if (r1 != 0) goto L_0x00b0
            java.util.Iterator r15 = r15.iterator()
        L_0x009c:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r2 = r15.next()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r2
            boolean r2 = r2.hasViews()
            if (r2 == 0) goto L_0x009c
            r12 = 1
            goto L_0x00b1
        L_0x00b0:
            r12 = r1
        L_0x00b1:
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r15 = r13._objectIdReader
            if (r15 == 0) goto L_0x00c0
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty r1 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
            com.fasterxml.jackson.databind.PropertyMetadata r2 = com.fasterxml.jackson.databind.PropertyMetadata.STD_REQUIRED
            r1.<init>(r15, r2)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r0 = r0.withProperty(r1)
        L_0x00c0:
            r8 = r0
            com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer r15 = new com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer
            com.fasterxml.jackson.databind.BeanDescription r6 = r13._beanDesc
            java.util.HashMap<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r9 = r13._backRefProperties
            java.util.HashSet<java.lang.String> r10 = r13._ignorableProps
            boolean r11 = r13._ignoreAllUnknown
            r4 = r15
            r5 = r13
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder.buildBuilderBased(com.fasterxml.jackson.databind.JavaType, java.lang.String):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return (SettableBeanProperty) this._properties.get(propertyName.getSimpleName());
    }

    public SettableAnyProperty getAnySetter() {
        return this._anySetter;
    }

    public AnnotatedMethod getBuildMethod() {
        return this._buildMethod;
    }

    public List<ValueInjector> getInjectables() {
        return this._injectables;
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public boolean hasIgnorable(String str) {
        HashSet<String> hashSet = this._ignorableProps;
        return hashSet != null && hashSet.contains(str);
    }

    public void setAnySetter(SettableAnyProperty settableAnyProperty) {
        if (this._anySetter == null || settableAnyProperty == null) {
            this._anySetter = settableAnyProperty;
            return;
        }
        throw new IllegalStateException("_anySetter already set to non-null");
    }

    public void setIgnoreUnknownProperties(boolean z) {
        this._ignoreAllUnknown = z;
    }

    public void setObjectIdReader(ObjectIdReader objectIdReader) {
        this._objectIdReader = objectIdReader;
    }

    public void setPOJOBuilder(AnnotatedMethod annotatedMethod, Value value) {
        this._buildMethod = annotatedMethod;
        this._builderConfig = value;
    }

    public void setValueInstantiator(ValueInstantiator valueInstantiator) {
        this._valueInstantiator = valueInstantiator;
    }
}
