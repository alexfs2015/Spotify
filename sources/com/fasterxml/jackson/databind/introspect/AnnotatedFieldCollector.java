package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnnotatedFieldCollector extends CollectorBase {
    private final MixInResolver _mixInResolver;
    private final TypeFactory _typeFactory;

    static final class FieldBuilder {
        public AnnotationCollector annotations = AnnotationCollector.emptyCollector();
        public final Field field;
        public final TypeResolutionContext typeContext;

        public FieldBuilder(TypeResolutionContext typeResolutionContext, Field field2) {
            this.typeContext = typeResolutionContext;
            this.field = field2;
        }

        public final AnnotatedField build() {
            return new AnnotatedField(this.typeContext, this.field, this.annotations.asAnnotationMap());
        }
    }

    AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this._typeFactory = typeFactory;
        if (annotationIntrospector == null) {
            mixInResolver = null;
        }
        this._mixInResolver = mixInResolver;
    }

    private void _addFieldMixIns(Class<?> cls, Class<?> cls2, Map<String, FieldBuilder> map) {
        Field[] declaredFields;
        for (Class declaredFields2 : ClassUtil.findSuperClasses(cls, cls2, true)) {
            for (Field field : ClassUtil.getDeclaredFields(declaredFields2)) {
                if (_isIncludableField(field)) {
                    FieldBuilder fieldBuilder = (FieldBuilder) map.get(field.getName());
                    if (fieldBuilder != null) {
                        fieldBuilder.annotations = collectAnnotations(fieldBuilder.annotations, field.getDeclaredAnnotations());
                    }
                }
            }
        }
    }

    private Map<String, FieldBuilder> _findFields(TypeResolutionContext typeResolutionContext, JavaType javaType, Map<String, FieldBuilder> map) {
        Field[] declaredFields;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class rawClass = javaType.getRawClass();
        Map<String, FieldBuilder> _findFields = _findFields(new Basic(this._typeFactory, superClass.getBindings()), superClass, map);
        for (Field field : ClassUtil.getDeclaredFields(rawClass)) {
            if (_isIncludableField(field)) {
                if (_findFields == null) {
                    _findFields = new LinkedHashMap<>();
                }
                FieldBuilder fieldBuilder = new FieldBuilder(typeResolutionContext, field);
                if (this._intr != null) {
                    fieldBuilder.annotations = collectAnnotations(fieldBuilder.annotations, field.getDeclaredAnnotations());
                }
                _findFields.put(field.getName(), fieldBuilder);
            }
        }
        MixInResolver mixInResolver = this._mixInResolver;
        if (mixInResolver != null) {
            Class findMixInClassFor = mixInResolver.findMixInClassFor(rawClass);
            if (findMixInClassFor != null) {
                _addFieldMixIns(findMixInClassFor, rawClass, _findFields);
            }
        }
        return _findFields;
    }

    private boolean _isIncludableField(Field field) {
        return !field.isSynthetic() && !Modifier.isStatic(field.getModifiers());
    }

    public static List<AnnotatedField> collectFields(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType) {
        return new AnnotatedFieldCollector(annotationIntrospector, typeFactory, mixInResolver).collect(typeResolutionContext, javaType);
    }

    /* access modifiers changed from: 0000 */
    public List<AnnotatedField> collect(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        Map _findFields = _findFields(typeResolutionContext, javaType, null);
        if (_findFields == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(_findFields.size());
        for (FieldBuilder build : _findFields.values()) {
            arrayList.add(build.build());
        }
        return arrayList;
    }
}
