package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public final class AnnotatedClass extends Annotated implements TypeResolutionContext {
    private static final Creators NO_CREATORS = new Creators(null, Collections.emptyList(), Collections.emptyList());
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final TypeBindings _bindings;
    protected final Class<?> _class;
    protected final Annotations _classAnnotations;
    protected Creators _creators;
    protected List<AnnotatedField> _fields;
    protected AnnotatedMethodMap _memberMethods;
    protected final MixInResolver _mixInResolver;
    protected transient Boolean _nonStaticInnerClass;
    protected final Class<?> _primaryMixIn;
    protected final List<JavaType> _superTypes;
    protected final JavaType _type;
    protected final TypeFactory _typeFactory;

    public static final class Creators {
        public final List<AnnotatedConstructor> constructors;
        public final List<AnnotatedMethod> creatorMethods;
        public final AnnotatedConstructor defaultConstructor;

        public Creators(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.defaultConstructor = annotatedConstructor;
            this.constructors = list;
            this.creatorMethods = list2;
        }
    }

    AnnotatedClass(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, MixInResolver mixInResolver, TypeFactory typeFactory) {
        this._type = javaType;
        this._class = cls;
        this._superTypes = list;
        this._primaryMixIn = cls2;
        this._classAnnotations = annotations;
        this._bindings = typeBindings;
        this._annotationIntrospector = annotationIntrospector;
        this._mixInResolver = mixInResolver;
        this._typeFactory = typeFactory;
    }

    AnnotatedClass(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._superTypes = Collections.emptyList();
        this._primaryMixIn = null;
        this._classAnnotations = AnnotationCollector.emptyAnnotations();
        this._bindings = TypeBindings.emptyBindings();
        this._annotationIntrospector = null;
        this._mixInResolver = null;
        this._typeFactory = null;
    }

    private final Creators _creators() {
        Creators creators = this._creators;
        if (creators == null) {
            JavaType javaType = this._type;
            creators = javaType == null ? NO_CREATORS : AnnotatedCreatorCollector.collectCreators(this._annotationIntrospector, this, javaType, this._primaryMixIn);
            this._creators = creators;
        }
        return creators;
    }

    private final List<AnnotatedField> _fields() {
        List<AnnotatedField> list = this._fields;
        if (list == null) {
            JavaType javaType = this._type;
            list = javaType == null ? Collections.emptyList() : AnnotatedFieldCollector.collectFields(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType);
            this._fields = list;
        }
        return list;
    }

    private final AnnotatedMethodMap _methods() {
        AnnotatedMethodMap annotatedMethodMap = this._memberMethods;
        if (annotatedMethodMap == null) {
            JavaType javaType = this._type;
            if (javaType == null) {
                annotatedMethodMap = new AnnotatedMethodMap();
            } else {
                annotatedMethodMap = AnnotatedMethodCollector.collectMethods(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType, this._superTypes, this._primaryMixIn);
            }
            this._memberMethods = annotatedMethodMap;
        }
        return annotatedMethodMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, getClass()) && ((AnnotatedClass) obj)._class == this._class;
    }

    public final Iterable<AnnotatedField> fields() {
        return _fields();
    }

    public final AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return _methods().find(str, clsArr);
    }

    public final Class<?> getAnnotated() {
        return this._class;
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._classAnnotations.get(cls);
    }

    public final Annotations getAnnotations() {
        return this._classAnnotations;
    }

    public final List<AnnotatedConstructor> getConstructors() {
        return _creators().constructors;
    }

    public final AnnotatedConstructor getDefaultConstructor() {
        return _creators().defaultConstructor;
    }

    public final List<AnnotatedMethod> getFactoryMethods() {
        return _creators().creatorMethods;
    }

    public final String getName() {
        return this._class.getName();
    }

    public final Class<?> getRawType() {
        return this._class;
    }

    public final JavaType getType() {
        return this._type;
    }

    public final boolean hasAnnotation(Class<?> cls) {
        return this._classAnnotations.has(cls);
    }

    public final boolean hasAnnotations() {
        return this._classAnnotations.size() > 0;
    }

    public final boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this._classAnnotations.hasOneOf(clsArr);
    }

    public final int hashCode() {
        return this._class.getName().hashCode();
    }

    public final boolean isNonStaticInnerClass() {
        Boolean bool = this._nonStaticInnerClass;
        if (bool == null) {
            bool = Boolean.valueOf(ClassUtil.isNonStaticInnerClass(this._class));
            this._nonStaticInnerClass = bool;
        }
        return bool.booleanValue();
    }

    public final Iterable<AnnotatedMethod> memberMethods() {
        return _methods();
    }

    public final JavaType resolveType(Type type) {
        return this._typeFactory.constructType(type, this._bindings);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[AnnotedClass ");
        sb.append(this._class.getName());
        sb.append("]");
        return sb.toString();
    }
}
