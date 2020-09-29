package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

final class PathAtom {
    private final List<IndexedAnnotation<Path>> mNamedPathIndex;
    private final String mUri;

    PathAtom(Method method) {
        this.mNamedPathIndex = createNamedPathIndex(method);
        this.mUri = parseUri(ReflectionUtil.findActionAnnotation(method));
    }

    /* access modifiers changed from: 0000 */
    public final List<IndexedAnnotation<Path>> createNamedPathIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Path path = (Path) ReflectionUtil.findAnnotation(parameterAnnotations[i], Path.class);
            if (path != null) {
                arrayList.add(new IndexedAnnotation(path, i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final String parseUri(Annotation annotation) {
        if (annotation instanceof GET) {
            return ((GET) annotation).value();
        }
        if (annotation instanceof POST) {
            return ((POST) annotation).value();
        }
        if (annotation instanceof SUB) {
            return ((SUB) annotation).value();
        }
        if (annotation instanceof DELETE) {
            return ((DELETE) annotation).value();
        }
        if (annotation instanceof PUT) {
            return ((PUT) annotation).value();
        }
        throw new IllegalArgumentException(String.valueOf(annotation.annotationType()));
    }

    /* access modifiers changed from: 0000 */
    public final String call(Object[] objArr) {
        HashMap hashMap = new HashMap(this.mNamedPathIndex.size());
        fdj b = fea.b();
        for (IndexedAnnotation indexedAnnotation : this.mNamedPathIndex) {
            String value = ((Path) indexedAnnotation.mAnnotation).value();
            String convertPathArg = convertPathArg(value, objArr[indexedAnnotation.mIndex]);
            if (!((Path) indexedAnnotation.mAnnotation).encoded()) {
                convertPathArg = b.a(convertPathArg);
            }
            hashMap.put(value, convertPathArg);
        }
        StringBuilder sb = new StringBuilder(this.mUri);
        for (Entry entry : hashMap.entrySet()) {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append((String) entry.getKey());
            sb2.append('}');
            String sb3 = sb2.toString();
            int indexOf = sb.indexOf(sb3);
            sb.replace(indexOf, sb3.length() + indexOf, (String) entry.getValue());
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String convertPathArg(String str, Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        String str2 = "@Path argument ";
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            sb.append(" is null");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.append(str);
        sb2.append(" has unsupported type: ");
        sb2.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }
}
