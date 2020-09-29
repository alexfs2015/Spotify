package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.annotations.Header;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class HeadersAtom {
    private final List<IndexedAnnotation<Header>> mDynamicHeadersIndex;
    private final Map<String, String> mStaticHeaders;

    HeadersAtom(Method method) {
        this.mStaticHeaders = createHeaders(method);
        this.mDynamicHeadersIndex = createDynamicHeadersIndex(method);
    }

    /* access modifiers changed from: 0000 */
    public final Map<String, String> call(Object[] objArr) {
        HashMap hashMap = new HashMap(this.mStaticHeaders);
        for (IndexedAnnotation indexedAnnotation : this.mDynamicHeadersIndex) {
            Object obj = objArr[indexedAnnotation.mIndex];
            String value = ((Header) indexedAnnotation.mAnnotation).value();
            hashMap.put(value, convertHeaderArg(value, obj));
        }
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    public final String convertHeaderArg(String str, Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        String str2 = "@Header argument ";
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

    /* access modifiers changed from: 0000 */
    public final List<IndexedAnnotation<Header>> createDynamicHeadersIndex(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList arrayList = new ArrayList(parameterAnnotations.length);
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Header header = (Header) ReflectionUtil.findAnnotation(parameterAnnotations[i], Header.class);
            if (header != null) {
                arrayList.add(new IndexedAnnotation(header, i));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final Map<String, String> createHeaders(Method method) {
        Headers headers = (Headers) method.getAnnotation(Headers.class);
        if (headers == null) {
            return Collections.emptyMap();
        }
        String[] value = headers.value();
        HashMap hashMap = new HashMap();
        int length = value.length;
        int i = 0;
        while (i < length) {
            String str = value[i];
            int indexOf = str.indexOf(58);
            String str2 = "\"";
            if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(str);
                sb.append("\" is not in the form \"Name: Value\"");
                throw new IllegalArgumentException(sb.toString());
            }
            String substring = str.substring(0, indexOf);
            String trim = str.substring(indexOf + 1).trim();
            if (!trim.isEmpty()) {
                hashMap.put(substring, trim);
                i++;
            } else {
                StringBuilder sb2 = new StringBuilder(str2);
                sb2.append(substring);
                sb2.append("\" valuer is empty");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return hashMap;
    }
}
