package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.HashMap;

public final class AnnotationMap implements Annotations {
    protected HashMap<Class<?>, Annotation> _annotations;

    public AnnotationMap() {
    }

    public static AnnotationMap of(Class<?> cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new AnnotationMap(hashMap);
    }

    AnnotationMap(HashMap<Class<?>, Annotation> hashMap) {
        this._annotations = hashMap;
    }

    public final <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public final boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public final boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this._annotations != null) {
            for (Class<? extends Annotation> containsKey : clsArr) {
                if (this._annotations.containsKey(containsKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static AnnotationMap merge(AnnotationMap annotationMap, AnnotationMap annotationMap2) {
        if (annotationMap != null) {
            HashMap<Class<?>, Annotation> hashMap = annotationMap._annotations;
            if (hashMap != null && !hashMap.isEmpty()) {
                if (annotationMap2 != null) {
                    HashMap<Class<?>, Annotation> hashMap2 = annotationMap2._annotations;
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        HashMap hashMap3 = new HashMap();
                        for (Annotation annotation : annotationMap2._annotations.values()) {
                            hashMap3.put(annotation.annotationType(), annotation);
                        }
                        for (Annotation annotation2 : annotationMap._annotations.values()) {
                            hashMap3.put(annotation2.annotationType(), annotation2);
                        }
                        annotationMap = new AnnotationMap(hashMap3);
                    }
                }
                return annotationMap;
            }
        }
        return annotationMap2;
    }

    public final int size() {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public final boolean add(Annotation annotation) {
        return _add(annotation);
    }

    public final String toString() {
        HashMap<Class<?>, Annotation> hashMap = this._annotations;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean _add(Annotation annotation) {
        if (this._annotations == null) {
            this._annotations = new HashMap<>();
        }
        Annotation annotation2 = (Annotation) this._annotations.put(annotation.annotationType(), annotation);
        return annotation2 == null || !annotation2.equals(annotation);
    }
}
