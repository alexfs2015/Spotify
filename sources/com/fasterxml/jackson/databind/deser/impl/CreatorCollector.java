package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class CreatorCollector {
    protected static final String[] TYPE_DESCS = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    protected SettableBeanProperty[] _arrayDelegateArgs;
    protected final BeanDescription _beanDesc;
    protected final boolean _canFixAccess;
    protected final AnnotatedWithParams[] _creators = new AnnotatedWithParams[9];
    protected SettableBeanProperty[] _delegateArgs;
    protected int _explicitCreators = 0;
    protected final boolean _forceAccess;
    protected boolean _hasNonDefaultCreator = false;
    protected SettableBeanProperty[] _propertyBasedArgs;

    public static final class StdTypeConstructor extends AnnotatedWithParams implements Serializable {
        private static final long serialVersionUID = 1;
        private final AnnotatedWithParams _base;
        private final int _type;

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public StdTypeConstructor(AnnotatedWithParams annotatedWithParams, int i) {
            super(annotatedWithParams, null);
            this._base = annotatedWithParams;
            this._type = i;
        }

        public static AnnotatedWithParams tryToOptimize(AnnotatedWithParams annotatedWithParams) {
            if (annotatedWithParams != null) {
                Class<HashMap> declaringClass = annotatedWithParams.getDeclaringClass();
                if (declaringClass == List.class || declaringClass == ArrayList.class) {
                    return new StdTypeConstructor(annotatedWithParams, 1);
                }
                if (declaringClass == LinkedHashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 3);
                }
                if (declaringClass == HashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 2);
                }
            }
            return annotatedWithParams;
        }

        /* access modifiers changed from: protected */
        public final Object _construct() {
            int i = this._type;
            if (i == 1) {
                return new ArrayList();
            }
            if (i == 2) {
                return new HashMap();
            }
            if (i == 3) {
                return new LinkedHashMap();
            }
            StringBuilder sb = new StringBuilder("Unknown type ");
            sb.append(this._type);
            throw new IllegalStateException(sb.toString());
        }

        public final int getParameterCount() {
            return this._base.getParameterCount();
        }

        public final Class<?> getRawParameterType(int i) {
            return this._base.getRawParameterType(i);
        }

        public final JavaType getParameterType(int i) {
            return this._base.getParameterType(i);
        }

        public final Object call() {
            return _construct();
        }

        public final Object call(Object[] objArr) {
            return _construct();
        }

        public final Object call1(Object obj) {
            return _construct();
        }

        public final Class<?> getDeclaringClass() {
            return this._base.getDeclaringClass();
        }

        public final Member getMember() {
            return this._base.getMember();
        }

        public final void setValue(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        public final Object getValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final Annotated withAnnotations(AnnotationMap annotationMap) {
            throw new UnsupportedOperationException();
        }

        public final AnnotatedElement getAnnotated() {
            return this._base.getAnnotated();
        }

        public final String getName() {
            return this._base.getName();
        }

        public final JavaType getType() {
            return this._base.getType();
        }

        public final Class<?> getRawType() {
            return this._base.getRawType();
        }

        public final int hashCode() {
            return this._base.hashCode();
        }

        public final String toString() {
            return this._base.toString();
        }
    }

    public CreatorCollector(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this._beanDesc = beanDescription;
        this._canFixAccess = mapperConfig.canOverrideAccessModifiers();
        this._forceAccess = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public ValueInstantiator constructValueInstantiator(DeserializationContext deserializationContext) {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType _computeDelegateType = _computeDelegateType(deserializationContext, this._creators[6], this._delegateArgs);
        JavaType _computeDelegateType2 = _computeDelegateType(deserializationContext, this._creators[8], this._arrayDelegateArgs);
        JavaType type = this._beanDesc.getType();
        AnnotatedWithParams tryToOptimize = StdTypeConstructor.tryToOptimize(this._creators[0]);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, type);
        AnnotatedWithParams[] annotatedWithParamsArr = this._creators;
        stdValueInstantiator.configureFromObjectSettings(tryToOptimize, annotatedWithParamsArr[6], _computeDelegateType, this._delegateArgs, annotatedWithParamsArr[7], this._propertyBasedArgs);
        stdValueInstantiator.configureFromArraySettings(this._creators[8], _computeDelegateType2, this._arrayDelegateArgs);
        stdValueInstantiator.configureFromStringCreator(this._creators[1]);
        stdValueInstantiator.configureFromIntCreator(this._creators[2]);
        stdValueInstantiator.configureFromLongCreator(this._creators[3]);
        stdValueInstantiator.configureFromDoubleCreator(this._creators[4]);
        stdValueInstantiator.configureFromBooleanCreator(this._creators[5]);
        return stdValueInstantiator;
    }

    public void setDefaultCreator(AnnotatedWithParams annotatedWithParams) {
        this._creators[0] = (AnnotatedWithParams) _fixAccess(annotatedWithParams);
    }

    public void addStringCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 1, z);
    }

    public void addIntCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 2, z);
    }

    public void addLongCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 3, z);
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 4, z);
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedWithParams, boolean z) {
        verifyNonDup(annotatedWithParams, 5, z);
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.getParameterType(i).isCollectionLikeType()) {
            if (verifyNonDup(annotatedWithParams, 8, z)) {
                this._arrayDelegateArgs = settableBeanPropertyArr;
            }
        } else if (verifyNonDup(annotatedWithParams, 6, z)) {
            this._delegateArgs = settableBeanPropertyArr;
        }
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        if (verifyNonDup(annotatedWithParams, 7, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String name = settableBeanPropertyArr[i].getName();
                    if (!name.isEmpty() || settableBeanPropertyArr[i].getInjectableValueId() == null) {
                        Integer num = (Integer) hashMap.put(name, Integer.valueOf(i));
                        if (num != null) {
                            throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{name, num, Integer.valueOf(i), ClassUtil.nameOf(this._beanDesc.getBeanClass())}));
                        }
                    }
                }
            }
            this._propertyBasedArgs = settableBeanPropertyArr;
        }
    }

    public boolean hasDefaultCreator() {
        return this._creators[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this._creators[6] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this._creators[7] != null;
    }

    private JavaType _computeDelegateType(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) {
        if (!this._hasNonDefaultCreator || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
            Object findDeserializer = annotationIntrospector.findDeserializer(parameter);
            if (findDeserializer != null) {
                parameterType = parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, findDeserializer));
            } else {
                parameterType = annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
            }
        }
        return parameterType;
    }

    private <T extends AnnotatedMember> T _fixAccess(T t) {
        if (t != null && this._canFixAccess) {
            ClassUtil.checkAndFixAccess((Member) t.getAnnotated(), this._forceAccess);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r7, int r8, boolean r9) {
        /*
            r6 = this;
            r0 = 1
            int r1 = r0 << r8
            r6._hasNonDefaultCreator = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r2 = r6._creators
            r2 = r2[r8]
            if (r2 == 0) goto L_0x0067
            int r3 = r6._explicitCreators
            r3 = r3 & r1
            r4 = 0
            if (r3 == 0) goto L_0x0014
            if (r9 != 0) goto L_0x0016
            return r4
        L_0x0014:
            if (r9 != 0) goto L_0x0018
        L_0x0016:
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 == 0) goto L_0x0067
            java.lang.Class r3 = r2.getClass()
            java.lang.Class r5 = r7.getClass()
            if (r3 != r5) goto L_0x0067
            java.lang.Class r3 = r2.getRawParameterType(r4)
            java.lang.Class r5 = r7.getRawParameterType(r4)
            if (r3 != r5) goto L_0x0060
            boolean r3 = r6._isEnumValueOf(r7)
            if (r3 == 0) goto L_0x0036
            return r4
        L_0x0036:
            boolean r3 = r6._isEnumValueOf(r2)
            if (r3 != 0) goto L_0x0067
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String[] r5 = TYPE_DESCS
            r8 = r5[r8]
            r3[r4] = r8
            if (r9 == 0) goto L_0x004c
            java.lang.String r8 = "explicitly marked"
            goto L_0x004e
        L_0x004c:
            java.lang.String r8 = "implicitly discovered"
        L_0x004e:
            r3[r0] = r8
            r8 = 2
            r3[r8] = r2
            r8 = 3
            r3[r8] = r7
            java.lang.String r7 = "Conflicting %s creators: already had %s creator %s, encountered another: %s"
            java.lang.String r7 = java.lang.String.format(r7, r3)
            r1.<init>(r7)
            throw r1
        L_0x0060:
            boolean r2 = r5.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0067
            return r4
        L_0x0067:
            if (r9 == 0) goto L_0x006e
            int r9 = r6._explicitCreators
            r9 = r9 | r1
            r6._explicitCreators = r9
        L_0x006e:
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams[] r9 = r6._creators
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r7 = r6._fixAccess(r7)
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r7 = (com.fasterxml.jackson.databind.introspect.AnnotatedWithParams) r7
            r9[r8] = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.CreatorCollector.verifyNonDup(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, int, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean _isEnumValueOf(AnnotatedWithParams annotatedWithParams) {
        if (annotatedWithParams.getDeclaringClass().isEnum()) {
            if ("valueOf".equals(annotatedWithParams.getName())) {
                return true;
            }
        }
        return false;
    }
}
