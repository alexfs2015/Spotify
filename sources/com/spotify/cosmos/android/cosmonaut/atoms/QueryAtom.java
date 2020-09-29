package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class QueryAtom {
    private final List<IndexedAnnotation<Query>> mNamedQueryIndex;
    private final Optional<IndexedAnnotation<QueryMap>> mQueryMapIndex;

    QueryAtom(Method method) {
        this.mNamedQueryIndex = createNamedQueryIndex(method);
        this.mQueryMapIndex = findQueryMapIndex(method);
    }

    /* access modifiers changed from: 0000 */
    public final List<IndexedAnnotation<Query>> createNamedQueryIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Query query = (Query) ReflectionUtil.findAnnotation(parameterAnnotations[i], Query.class);
            if (query != null) {
                arrayList.add(new IndexedAnnotation(query, i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final Optional<IndexedAnnotation<QueryMap>> findQueryMapIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = parameterAnnotations.length;
        int i = 0;
        while (i < length) {
            QueryMap queryMap = (QueryMap) ReflectionUtil.findAnnotation(parameterAnnotations[i], QueryMap.class);
            if (queryMap == null) {
                i++;
            } else if (isValidQueryMapArgumentType(method.getGenericParameterTypes()[i])) {
                return Optional.b(new IndexedAnnotation(queryMap, i));
            } else {
                throw new IllegalArgumentException("@QueryMap argument should be Map<String, Object> or Map<String, String>");
            }
        }
        return Optional.e();
    }

    /* access modifiers changed from: 0000 */
    public final boolean isValidQueryMapArgumentType(Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 2 && isClassAssignableFromType(rawType, Map.class) && isClassAssignableFromType(actualTypeArguments[0], String.class)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final Map<String, String> call(Object[] objArr) {
        HashMap hashMap = new HashMap();
        fillQueryArguments(hashMap, objArr);
        fillQueryMapArguments(hashMap, objArr);
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    public final void fillQueryArguments(Map<String, String> map, Object[] objArr) {
        fdj a = fea.a();
        for (IndexedAnnotation indexedAnnotation : this.mNamedQueryIndex) {
            Object obj = objArr[indexedAnnotation.mIndex];
            if (obj != null) {
                String value = ((Query) indexedAnnotation.mAnnotation).value();
                String convertQueryArg = convertQueryArg(value, obj);
                if (!((Query) indexedAnnotation.mAnnotation).encoded()) {
                    convertQueryArg = a.a(convertQueryArg);
                }
                map.put(value, convertQueryArg(value, convertQueryArg));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void fillQueryMapArguments(Map<String, String> map, Object[] objArr) {
        fdj a = fea.a();
        if (this.mQueryMapIndex.b()) {
            IndexedAnnotation indexedAnnotation = (IndexedAnnotation) this.mQueryMapIndex.c();
            Object obj = objArr[indexedAnnotation.mIndex];
            if (obj instanceof Map) {
                for (Entry entry : convertToTypedMap(obj).entrySet()) {
                    String convertQueryArg = convertQueryArg((String) entry.getKey(), entry.getValue());
                    if (!((QueryMap) indexedAnnotation.mAnnotation).encoded()) {
                        convertQueryArg = a.a(convertQueryArg);
                    }
                    map.put(entry.getKey(), convertQueryArg);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final String convertQueryArg(String str, Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder("@Query argument ");
        sb.append(str);
        sb.append(" has unsupported type: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    static Map<String, Object> convertToTypedMap(Object obj) {
        return (Map) obj;
    }

    static boolean isClassAssignableFromType(Type type, Class<?> cls) {
        return (type instanceof Class) && cls.isAssignableFrom((Class) type);
    }
}
