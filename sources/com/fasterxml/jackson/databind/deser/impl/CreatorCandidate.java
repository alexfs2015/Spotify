package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

public final class CreatorCandidate {
    protected final AnnotatedWithParams _creator;
    protected final AnnotationIntrospector _intr;
    protected final int _paramCount;
    protected final Param[] _params;

    public static final class Param {
        public final AnnotatedParameter annotated;
        public final Value injection;
        public final BeanPropertyDefinition propDef;

        public Param(AnnotatedParameter annotatedParameter, BeanPropertyDefinition beanPropertyDefinition, Value value) {
            this.annotated = annotatedParameter;
            this.propDef = beanPropertyDefinition;
            this.injection = value;
        }
    }

    protected CreatorCandidate(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, Param[] paramArr, int i) {
        this._intr = annotationIntrospector;
        this._creator = annotatedWithParams;
        this._params = paramArr;
        this._paramCount = i;
    }

    public static CreatorCandidate construct(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition[] beanPropertyDefinitionArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        Param[] paramArr = new Param[parameterCount];
        int i = 0;
        while (i < parameterCount) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
            paramArr[i] = new Param(parameter, beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i], annotationIntrospector.findInjectableValue(parameter));
            i++;
        }
        return new CreatorCandidate(annotationIntrospector, annotatedWithParams, paramArr, parameterCount);
    }

    public final AnnotatedWithParams creator() {
        return this._creator;
    }

    public final int paramCount() {
        return this._paramCount;
    }

    public final Value injection(int i) {
        return this._params[i].injection;
    }

    public final AnnotatedParameter parameter(int i) {
        return this._params[i].annotated;
    }

    public final BeanPropertyDefinition propertyDef(int i) {
        return this._params[i].propDef;
    }

    public final PropertyName paramName(int i) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i].propDef;
        if (beanPropertyDefinition != null) {
            return beanPropertyDefinition.getFullName();
        }
        return null;
    }

    public final PropertyName explicitParamName(int i) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i].propDef;
        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
            return null;
        }
        return beanPropertyDefinition.getFullName();
    }

    public final PropertyName findImplicitParamName(int i) {
        String findImplicitPropertyName = this._intr.findImplicitPropertyName(this._params[i].annotated);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    public final int findOnlyParamWithoutInjection() {
        int i = -1;
        for (int i2 = 0; i2 < this._paramCount; i2++) {
            if (this._params[i2].injection == null) {
                if (i >= 0) {
                    return -1;
                }
                i = i2;
            }
        }
        return i;
    }

    public final String toString() {
        return this._creator.toString();
    }
}