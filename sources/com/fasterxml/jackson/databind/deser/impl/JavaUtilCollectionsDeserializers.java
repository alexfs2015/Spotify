package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class JavaUtilCollectionsDeserializers {
    private static final Class<?> CLASS_AS_ARRAYS_LIST = Arrays.asList(new Object[]{null, null}).getClass();
    private static final Class<?> CLASS_SINGLETON_LIST;
    private static final Class<?> CLASS_SINGLETON_MAP;
    private static final Class<?> CLASS_SINGLETON_SET;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST;
    private static final Class<?> CLASS_UNMODIFIABLE_MAP;
    private static final Class<?> CLASS_UNMODIFIABLE_SET;

    static class JavaUtilCollectionsConverter implements Converter<Object, Object> {
        private final JavaType _inputType;
        private final int _kind;

        private JavaUtilCollectionsConverter(int i, JavaType javaType) {
            this._inputType = javaType;
            this._kind = i;
        }

        private void _checkSingleton(int i) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder("Can not deserialize Singleton container from ");
                sb.append(i);
                sb.append(" entries");
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this._kind) {
                case 1:
                    Set set = (Set) obj;
                    _checkSingleton(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    _checkSingleton(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    _checkSingleton(map.size());
                    Entry entry = (Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        public JavaType getInputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        public JavaType getOutputType(TypeFactory typeFactory) {
            return this._inputType;
        }
    }

    static {
        Set singleton = Collections.singleton(Boolean.TRUE);
        CLASS_SINGLETON_SET = singleton.getClass();
        CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(singleton).getClass();
        List singletonList = Collections.singletonList(Boolean.TRUE);
        CLASS_SINGLETON_LIST = singletonList.getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(singletonList).getClass();
        Map singletonMap = Collections.singletonMap("a", "b");
        CLASS_SINGLETON_MAP = singletonMap.getClass();
        CLASS_UNMODIFIABLE_MAP = Collections.unmodifiableMap(singletonMap).getClass();
    }

    static JavaUtilCollectionsConverter converter(int i, JavaType javaType, Class<?> cls) {
        return new JavaUtilCollectionsConverter(i, javaType.findSuperType(cls));
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) {
        JavaUtilCollectionsConverter javaUtilCollectionsConverter;
        if (javaType.hasRawClass(CLASS_AS_ARRAYS_LIST)) {
            javaUtilCollectionsConverter = converter(7, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_LIST)) {
            javaUtilCollectionsConverter = converter(2, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_SET)) {
            javaUtilCollectionsConverter = converter(1, javaType, Set.class);
        } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST)) {
            javaUtilCollectionsConverter = converter(5, javaType, List.class);
        } else if (!javaType.hasRawClass(CLASS_UNMODIFIABLE_SET)) {
            return null;
        } else {
            javaUtilCollectionsConverter = converter(4, javaType, Set.class);
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverter);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) {
        JavaUtilCollectionsConverter javaUtilCollectionsConverter;
        if (javaType.hasRawClass(CLASS_SINGLETON_MAP)) {
            javaUtilCollectionsConverter = converter(3, javaType, Map.class);
        } else if (!javaType.hasRawClass(CLASS_UNMODIFIABLE_MAP)) {
            return null;
        } else {
            javaUtilCollectionsConverter = converter(6, javaType, Map.class);
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverter);
    }
}
