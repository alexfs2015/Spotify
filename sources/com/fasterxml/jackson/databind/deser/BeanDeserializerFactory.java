package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    public DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        ClassUtil.verifyMustOverride(BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }

    public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<Object> _findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, beanDescription);
        if (_findCustomBeanDeserializer != null) {
            return _findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType()) {
            JavaType materializeAbstractType = materializeAbstractType(deserializationContext, javaType, beanDescription);
            if (materializeAbstractType != null) {
                return buildBeanDeserializer(deserializationContext, materializeAbstractType, config.introspect(materializeAbstractType));
            }
        }
        JsonDeserializer<Object> findStdDeserializer = findStdDeserializer(deserializationContext, javaType, beanDescription);
        if (findStdDeserializer != null) {
            return findStdDeserializer;
        }
        if (!isPotentialBeanType(javaType.getRawClass())) {
            return null;
        }
        _validateSubType(deserializationContext, javaType, beanDescription);
        return buildBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls) {
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(deserializationContext.constructType(cls)));
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer<?> findDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, beanDescription);
        if (findDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                findDefaultDeserializer = modifyDeserializer.modifyDeserializer(deserializationContext.getConfig(), beanDescription, findDefaultDeserializer);
            }
        }
        return findDefaultDeserializer;
    }

    /* access modifiers changed from: protected */
    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        for (AbstractTypeResolver resolveAbstractType : this._factoryConfig.abstractTypeResolvers()) {
            JavaType resolveAbstractType2 = resolveAbstractType.resolveAbstractType(deserializationContext.getConfig(), beanDescription);
            if (resolveAbstractType2 != null) {
                return resolveAbstractType2;
            }
        }
        return null;
    }

    public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer<Object> jsonDeserializer;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
            constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
            addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                    constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
                }
            }
            if (!javaType.isAbstract() || findValueInstantiator.canInstantiate()) {
                jsonDeserializer = constructBeanDeserializerBuilder.build();
            } else {
                jsonDeserializer = constructBeanDeserializerBuilder.buildAbstract();
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    jsonDeserializer = modifyDeserializer.modifyDeserializer(config, beanDescription, jsonDeserializer);
                }
            }
            return jsonDeserializer;
        } catch (NoClassDefFoundError e) {
            return new ErrorThrowingDeserializer(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), e2.getMessage(), beanDescription, (BeanPropertyDefinition) null);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        String str;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            DeserializationConfig config = deserializationContext.getConfig();
            BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
            constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
            addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            Value findPOJOBuilderConfig = beanDescription.findPOJOBuilderConfig();
            if (findPOJOBuilderConfig == null) {
                str = "build";
            } else {
                str = findPOJOBuilderConfig.buildMethodName;
            }
            AnnotatedMethod findMethod = beanDescription.findMethod(str, null);
            if (findMethod != null && config.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(findMethod.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            constructBeanDeserializerBuilder.setPOJOBuilder(findMethod, findPOJOBuilderConfig);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                    constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
                }
            }
            JsonDeserializer<Object> buildBuilderBased = constructBeanDeserializerBuilder.buildBuilderBased(javaType, str);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    buildBuilderBased = modifyDeserializer.modifyDeserializer(config, beanDescription, buildBuilderBased);
                }
            }
            return buildBuilderBased;
        } catch (NoClassDefFoundError e) {
            return new ErrorThrowingDeserializer(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), e2.getMessage(), beanDescription, (BeanPropertyDefinition) null);
        }
    }

    /* access modifiers changed from: protected */
    public void addObjectIdReader(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        ObjectIdGenerator objectIdGenerator;
        JavaType javaType;
        SettableBeanProperty settableBeanProperty;
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo != null) {
            Class<PropertyGenerator> generatorType = objectIdInfo.getGeneratorType();
            ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(beanDescription.getClassInfo(), objectIdInfo);
            if (generatorType == PropertyGenerator.class) {
                PropertyName propertyName = objectIdInfo.getPropertyName();
                settableBeanProperty = beanDeserializerBuilder.findProperty(propertyName);
                if (settableBeanProperty != null) {
                    JavaType type = settableBeanProperty.getType();
                    javaType = type;
                    objectIdGenerator = new PropertyBasedObjectIdGenerator(objectIdInfo.getScope());
                } else {
                    StringBuilder sb = new StringBuilder("Invalid Object Id definition for ");
                    sb.append(beanDescription.getBeanClass().getName());
                    sb.append(": cannot find property with name '");
                    sb.append(propertyName);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                objectIdGenerator = deserializationContext.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo);
                javaType = javaType2;
            }
            SettableBeanProperty settableBeanProperty2 = settableBeanProperty;
            beanDeserializerBuilder.setObjectIdReader(ObjectIdReader.construct(javaType, objectIdInfo.getPropertyName(), objectIdGenerator, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty2, objectIdResolverInstance));
        }
    }

    public JsonDeserializer<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator(deserializationContext, beanDescription));
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        AnnotatedMethod findMethod = beanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (findMethod != null) {
            SettableBeanProperty constructSettableProperty = constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), findMethod, new PropertyName("cause")), findMethod.getParameterType(0));
            if (constructSettableProperty != null) {
                constructBeanDeserializerBuilder.addOrReplaceProperty(constructSettableProperty, true);
            }
        }
        constructBeanDeserializerBuilder.addIgnorable("localizedMessage");
        constructBeanDeserializerBuilder.addIgnorable("suppressed");
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
            }
        }
        JsonDeserializer build = constructBeanDeserializerBuilder.build();
        if (build instanceof BeanDeserializer) {
            build = new ThrowableDeserializer((BeanDeserializer) build);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                build = modifyDeserializer.modifyDeserializer(config, beanDescription, build);
            }
        }
        return build;
    }

    /* access modifiers changed from: protected */
    public BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        return new BeanDeserializerBuilder(beanDescription, deserializationContext);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addBeanProps(com.fasterxml.jackson.databind.DeserializationContext r17, com.fasterxml.jackson.databind.BeanDescription r18, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            com.fasterxml.jackson.databind.JavaType r0 = r18.getType()
            boolean r0 = r0.isAbstract()
            r10 = 1
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x0022
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r19.getValueInstantiator()
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r17.getConfig()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] r0 = r0.getFromObjectArguments(r1)
            r12 = r0
            goto L_0x0023
        L_0x0022:
            r12 = 0
        L_0x0023:
            r13 = 0
            if (r12 == 0) goto L_0x0028
            r14 = 1
            goto L_0x0029
        L_0x0028:
            r14 = 0
        L_0x0029:
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r17.getConfig()
            java.lang.Class r1 = r18.getBeanClass()
            com.fasterxml.jackson.databind.introspect.AnnotatedClass r2 = r18.getClassInfo()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r0 = r0.getDefaultPropertyIgnorals(r1, r2)
            if (r0 == 0) goto L_0x005a
            boolean r1 = r0.getIgnoreUnknown()
            r9.setIgnoreUnknownProperties(r1)
            java.util.Set r0 = r0.findIgnoredForDeserialization()
            java.util.Iterator r1 = r0.iterator()
        L_0x004a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r9.addIgnorable(r2)
            goto L_0x004a
        L_0x005a:
            java.util.Set r0 = java.util.Collections.emptySet()
        L_0x005e:
            r5 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r18.findAnySetterAccessor()
            if (r0 == 0) goto L_0x006d
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r0 = r6.constructAnySetter(r7, r8, r0)
            r9.setAnySetter(r0)
            goto L_0x0087
        L_0x006d:
            java.util.Set r0 = r18.getIgnoredPropertyNames()
            if (r0 == 0) goto L_0x0087
            java.util.Iterator r0 = r0.iterator()
        L_0x0077:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0087
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r9.addIgnorable(r1)
            goto L_0x0077
        L_0x0087:
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.USE_GETTERS_AS_SETTERS
            boolean r0 = r7.isEnabled(r0)
            if (r0 == 0) goto L_0x0099
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_GETTERS
            boolean r0 = r7.isEnabled(r0)
            if (r0 == 0) goto L_0x0099
            r15 = 1
            goto L_0x009a
        L_0x0099:
            r15 = 0
        L_0x009a:
            java.util.List r4 = r18.findProperties()
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.util.List r0 = r0.filterBeanProps(r1, r2, r3, r4, r5)
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r6._factoryConfig
            boolean r1 = r1.hasDeserializerModifiers()
            if (r1 == 0) goto L_0x00d1
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r1 = r6._factoryConfig
            java.lang.Iterable r1 = r1.deserializerModifiers()
            java.util.Iterator r1 = r1.iterator()
        L_0x00bc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d1
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r2 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r2
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r17.getConfig()
            java.util.List r0 = r2.updateProperties(r3, r8, r0)
            goto L_0x00bc
        L_0x00d1:
            java.util.Iterator r0 = r0.iterator()
        L_0x00d5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ba
            java.lang.Object r1 = r0.next()
            com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r1 = (com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) r1
            boolean r2 = r1.hasSetter()
            if (r2 == 0) goto L_0x00f4
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = r1.getSetter()
            com.fasterxml.jackson.databind.JavaType r2 = r2.getParameterType(r13)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r6.constructSettableProperty(r7, r8, r1, r2)
            goto L_0x013e
        L_0x00f4:
            boolean r2 = r1.hasField()
            if (r2 == 0) goto L_0x0107
            com.fasterxml.jackson.databind.introspect.AnnotatedField r2 = r1.getField()
            com.fasterxml.jackson.databind.JavaType r2 = r2.getType()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r6.constructSettableProperty(r7, r8, r1, r2)
            goto L_0x013e
        L_0x0107:
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = r1.getGetter()
            if (r2 == 0) goto L_0x013d
            if (r15 == 0) goto L_0x0128
            java.lang.Class r2 = r2.getRawType()
            boolean r2 = r6._isSetterlessType(r2)
            if (r2 == 0) goto L_0x0128
            java.lang.String r2 = r1.getName()
            boolean r2 = r9.hasIgnorable(r2)
            if (r2 != 0) goto L_0x013d
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r6.constructSetterlessProperty(r7, r8, r1)
            goto L_0x013e
        L_0x0128:
            boolean r2 = r1.hasConstructorParameter()
            if (r2 != 0) goto L_0x013d
            com.fasterxml.jackson.databind.PropertyMetadata r2 = r1.getMetadata()
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r2 = r2.getMergeInfo()
            if (r2 == 0) goto L_0x013d
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r6.constructSetterlessProperty(r7, r8, r1)
            goto L_0x013e
        L_0x013d:
            r2 = 0
        L_0x013e:
            if (r14 == 0) goto L_0x01a4
            boolean r3 = r1.hasConstructorParameter()
            if (r3 == 0) goto L_0x01a4
            java.lang.String r3 = r1.getName()
            if (r12 == 0) goto L_0x0167
            int r4 = r12.length
            r5 = 0
        L_0x014e:
            if (r5 >= r4) goto L_0x0167
            r11 = r12[r5]
            java.lang.String r10 = r11.getName()
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x0163
            boolean r10 = r11 instanceof com.fasterxml.jackson.databind.deser.CreatorProperty
            if (r10 == 0) goto L_0x0163
            com.fasterxml.jackson.databind.deser.CreatorProperty r11 = (com.fasterxml.jackson.databind.deser.CreatorProperty) r11
            goto L_0x0168
        L_0x0163:
            int r5 = r5 + 1
            r10 = 1
            goto L_0x014e
        L_0x0167:
            r11 = 0
        L_0x0168:
            if (r11 != 0) goto L_0x018d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r12.length
            r5 = 0
        L_0x0171:
            if (r5 >= r4) goto L_0x017f
            r10 = r12[r5]
            java.lang.String r10 = r10.getName()
            r2.add(r10)
            int r5 = r5 + 1
            goto L_0x0171
        L_0x017f:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r13] = r3
            r3 = 1
            r4[r3] = r2
            java.lang.String r2 = "Could not find creator property with name '%s' (known Creator properties: %s)"
            r7.reportBadPropertyDefinition(r8, r1, r2, r4)
            goto L_0x01b7
        L_0x018d:
            r3 = 1
            if (r2 == 0) goto L_0x0193
            r11.setFallbackSetter(r2)
        L_0x0193:
            java.lang.Class[] r1 = r1.findViews()
            if (r1 != 0) goto L_0x019d
            java.lang.Class[] r1 = r18.findDefaultViews()
        L_0x019d:
            r11.setViews(r1)
            r9.addCreatorProperty(r11)
            goto L_0x01b7
        L_0x01a4:
            r3 = 1
            if (r2 == 0) goto L_0x01b7
            java.lang.Class[] r1 = r1.findViews()
            if (r1 != 0) goto L_0x01b1
            java.lang.Class[] r1 = r18.findDefaultViews()
        L_0x01b1:
            r2.setViews(r1)
            r9.addProperty(r2)
        L_0x01b7:
            r10 = 1
            goto L_0x00d5
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder):void");
    }

    private boolean _isSetterlessType(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    /* access modifiers changed from: protected */
    public List<BeanPropertyDefinition> filterBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder, List<BeanPropertyDefinition> list, Set<String> set) {
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : list) {
            String name = beanPropertyDefinition.getName();
            if (!set.contains(name)) {
                if (!beanPropertyDefinition.hasConstructorParameter()) {
                    Class rawPrimaryType = beanPropertyDefinition.getRawPrimaryType();
                    if (rawPrimaryType != null && isIgnorableType(deserializationContext.getConfig(), beanPropertyDefinition, rawPrimaryType, hashMap)) {
                        beanDeserializerBuilder.addIgnorable(name);
                    }
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void addBackReferenceProperties(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        List<BeanPropertyDefinition> findBackReferences = beanDescription.findBackReferences();
        if (findBackReferences != null) {
            for (BeanPropertyDefinition beanPropertyDefinition : findBackReferences) {
                beanDeserializerBuilder.addBackReferenceProperty(beanPropertyDefinition.findReferenceName(), constructSettableProperty(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getPrimaryType()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addInjectables(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) {
        Map findInjectables = beanDescription.findInjectables();
        if (findInjectables != null) {
            for (Entry entry : findInjectables.entrySet()) {
                AnnotatedMember annotatedMember = (AnnotatedMember) entry.getValue();
                beanDeserializerBuilder.addInjectable(PropertyName.construct(annotatedMember.getName()), annotatedMember.getType(), beanDescription.getClassAnnotations(), annotatedMember, entry.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableAnyProperty constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext r9, com.fasterxml.jackson.databind.BeanDescription r10, com.fasterxml.jackson.databind.introspect.AnnotatedMember r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002a
            r10 = r11
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r10
            com.fasterxml.jackson.databind.JavaType r0 = r10.getParameterType(r2)
            com.fasterxml.jackson.databind.JavaType r10 = r10.getParameterType(r1)
            com.fasterxml.jackson.databind.JavaType r10 = r8.resolveMemberAndTypeAnnotations(r9, r11, r10)
            com.fasterxml.jackson.databind.BeanProperty$Std r7 = new com.fasterxml.jackson.databind.BeanProperty$Std
            java.lang.String r1 = r11.getName()
            com.fasterxml.jackson.databind.PropertyName r2 = com.fasterxml.jackson.databind.PropertyName.construct(r1)
            r4 = 0
            com.fasterxml.jackson.databind.PropertyMetadata r6 = com.fasterxml.jackson.databind.PropertyMetadata.STD_OPTIONAL
            r1 = r7
            r3 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10 = r0
            goto L_0x0055
        L_0x002a:
            boolean r0 = r11 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedField
            if (r0 == 0) goto L_0x0099
            r10 = r11
            com.fasterxml.jackson.databind.introspect.AnnotatedField r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r10
            com.fasterxml.jackson.databind.JavaType r10 = r10.getType()
            com.fasterxml.jackson.databind.JavaType r2 = r8.resolveMemberAndTypeAnnotations(r9, r11, r10)
            com.fasterxml.jackson.databind.JavaType r10 = r2.getKeyType()
            com.fasterxml.jackson.databind.JavaType r6 = r2.getContentType()
            com.fasterxml.jackson.databind.BeanProperty$Std r7 = new com.fasterxml.jackson.databind.BeanProperty$Std
            java.lang.String r0 = r11.getName()
            com.fasterxml.jackson.databind.PropertyName r1 = com.fasterxml.jackson.databind.PropertyName.construct(r0)
            r3 = 0
            com.fasterxml.jackson.databind.PropertyMetadata r5 = com.fasterxml.jackson.databind.PropertyMetadata.STD_OPTIONAL
            r0 = r7
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r3 = r6
            r1 = r7
        L_0x0055:
            com.fasterxml.jackson.databind.KeyDeserializer r0 = r8.findKeyDeserializerFromAnnotation(r9, r11)
            if (r0 != 0) goto L_0x0061
            java.lang.Object r0 = r10.getValueHandler()
            com.fasterxml.jackson.databind.KeyDeserializer r0 = (com.fasterxml.jackson.databind.KeyDeserializer) r0
        L_0x0061:
            if (r0 != 0) goto L_0x0069
            com.fasterxml.jackson.databind.KeyDeserializer r10 = r9.findKeyDeserializer(r10, r1)
        L_0x0067:
            r4 = r10
            goto L_0x0075
        L_0x0069:
            boolean r10 = r0 instanceof com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer
            if (r10 == 0) goto L_0x0074
            com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer r0 = (com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer) r0
            com.fasterxml.jackson.databind.KeyDeserializer r10 = r0.createContextual(r9, r1)
            goto L_0x0067
        L_0x0074:
            r4 = r0
        L_0x0075:
            com.fasterxml.jackson.databind.JsonDeserializer r10 = r8.findContentDeserializerFromAnnotation(r9, r11)
            if (r10 != 0) goto L_0x0081
            java.lang.Object r10 = r3.getValueHandler()
            com.fasterxml.jackson.databind.JsonDeserializer r10 = (com.fasterxml.jackson.databind.JsonDeserializer) r10
        L_0x0081:
            if (r10 == 0) goto L_0x0089
            com.fasterxml.jackson.databind.JsonDeserializer r9 = r9.handlePrimaryContextualization(r10, r1, r3)
            r5 = r9
            goto L_0x008a
        L_0x0089:
            r5 = r10
        L_0x008a:
            java.lang.Object r9 = r3.getTypeHandler()
            r6 = r9
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r6 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r6
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r9 = new com.fasterxml.jackson.databind.deser.SettableAnyProperty
            r0 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x0099:
            com.fasterxml.jackson.databind.JavaType r10 = r10.getType()
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Class r11 = r11.getClass()
            r0[r2] = r11
            java.lang.String r11 = "Unrecognized mutator type for any setter: %s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            java.lang.Object r9 = r9.reportBadDefinition(r10, r11)
            com.fasterxml.jackson.databind.deser.SettableAnyProperty r9 = (com.fasterxml.jackson.databind.deser.SettableAnyProperty) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructAnySetter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.AnnotatedMember):com.fasterxml.jackson.databind.deser.SettableAnyProperty");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty] */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.fasterxml.jackson.databind.deser.impl.MethodProperty] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r3v2, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.fasterxml.jackson.databind.deser.impl.MethodProperty] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty]
      assigns: [com.fasterxml.jackson.databind.deser.impl.FieldProperty, com.fasterxml.jackson.databind.deser.impl.MethodProperty]
      uses: [com.fasterxml.jackson.databind.deser.impl.FieldProperty, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.impl.MethodProperty]
      mth insns count: 43
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty constructSettableProperty(com.fasterxml.jackson.databind.DeserializationContext r10, com.fasterxml.jackson.databind.BeanDescription r11, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition r12, com.fasterxml.jackson.databind.JavaType r13) {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r12.getNonConstructorMutator()
            if (r0 != 0) goto L_0x000e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No non-constructor mutator available"
            r10.reportBadPropertyDefinition(r11, r12, r2, r1)
        L_0x000e:
            com.fasterxml.jackson.databind.JavaType r13 = r9.resolveMemberAndTypeAnnotations(r10, r0, r13)
            java.lang.Object r1 = r13.getTypeHandler()
            r6 = r1
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r6 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r6
            boolean r1 = r0 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            if (r1 == 0) goto L_0x002d
            com.fasterxml.jackson.databind.deser.impl.MethodProperty r1 = new com.fasterxml.jackson.databind.deser.impl.MethodProperty
            com.fasterxml.jackson.databind.util.Annotations r7 = r11.getClassAnnotations()
            r8 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x003c
        L_0x002d:
            com.fasterxml.jackson.databind.deser.impl.FieldProperty r1 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty
            com.fasterxml.jackson.databind.util.Annotations r7 = r11.getClassAnnotations()
            r8 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedField r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x003c:
            com.fasterxml.jackson.databind.JsonDeserializer r11 = r9.findDeserializerFromAnnotation(r10, r0)
            if (r11 != 0) goto L_0x0048
            java.lang.Object r11 = r13.getValueHandler()
            com.fasterxml.jackson.databind.JsonDeserializer r11 = (com.fasterxml.jackson.databind.JsonDeserializer) r11
        L_0x0048:
            if (r11 == 0) goto L_0x0052
            com.fasterxml.jackson.databind.JsonDeserializer r10 = r10.handlePrimaryContextualization(r11, r1, r13)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r1 = r1.withValueDeserializer(r10)
        L_0x0052:
            com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty r10 = r12.findReferenceType()
            if (r10 == 0) goto L_0x0065
            boolean r11 = r10.isManagedReference()
            if (r11 == 0) goto L_0x0065
            java.lang.String r10 = r10.getName()
            r1.setManagedReferenceName(r10)
        L_0x0065:
            com.fasterxml.jackson.databind.introspect.ObjectIdInfo r10 = r12.findObjectIdInfo()
            if (r10 == 0) goto L_0x006e
            r1.setObjectIdInfo(r10)
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.constructSettableProperty(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanDescription, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) {
        AnnotatedMethod getter = beanPropertyDefinition.getGetter();
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, getter, getter.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler(), beanDescription.getClassAnnotations(), getter);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, getter);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, setterlessProperty, resolveMemberAndTypeAnnotations)) : setterlessProperty;
    }

    /* access modifiers changed from: protected */
    public boolean isPotentialBeanType(Class<?> cls) {
        String canBeABeanType = ClassUtil.canBeABeanType(cls);
        String str = ") as a Bean";
        String str2 = " (of type ";
        String str3 = "Cannot deserialize Class ";
        if (canBeABeanType != null) {
            StringBuilder sb = new StringBuilder(str3);
            sb.append(cls.getName());
            sb.append(str2);
            sb.append(canBeABeanType);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (!ClassUtil.isProxyType(cls)) {
            String isLocalType = ClassUtil.isLocalType(cls, true);
            if (isLocalType == null) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder(str3);
            sb2.append(cls.getName());
            sb2.append(str2);
            sb2.append(isLocalType);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("Cannot deserialize Proxy class ");
            sb3.append(cls.getName());
            sb3.append(" as a Bean");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean isIgnorableType(DeserializationConfig deserializationConfig, BeanPropertyDefinition beanPropertyDefinition, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean bool;
        Boolean bool2 = (Boolean) map.get(cls);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            bool = Boolean.FALSE;
        } else {
            bool = deserializationConfig.getConfigOverride(cls).getIsIgnoredType();
            if (bool == null) {
                bool = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).getClassInfo());
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
            }
        }
        map.put(cls, bool);
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public void _validateSubType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        SubTypeValidator.instance().validateSubType(deserializationContext, javaType, beanDescription);
    }
}
