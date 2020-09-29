package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.collect.ImmutableSet;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

final class ReflectionUtil {
    private static final ImmutableSet<Class<? extends Annotation>> ACTIONS = ImmutableSet.j().b(GET.class).b(POST.class).b(SUB.class).b(DELETE.class).b(PUT.class).a();

    private ReflectionUtil() {
    }

    static String findAction(Method method) {
        return findActionAnnotation(method).annotationType().getSimpleName();
    }

    static Annotation findActionAnnotation(Method method) {
        Annotation[] annotations;
        for (Annotation annotation : method.getAnnotations()) {
            if (ACTIONS.contains(annotation.annotationType())) {
                return annotation;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(method);
        sb.append(" does not declare one of ");
        sb.append(ACTIONS);
        throw new IllegalArgumentException(sb.toString());
    }

    static <T> T findAnnotation(Annotation[] annotationArr, Class<T> cls) {
        for (T t : annotationArr) {
            if (cls.isAssignableFrom(t.annotationType())) {
                return t;
            }
        }
        return null;
    }
}
