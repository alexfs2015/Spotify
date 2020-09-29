package defpackage;

import com.squareup.wire.internal.ImmutableList;
import com.squareup.wire.internal.MutableOnWriteList;
import java.util.Collections;
import java.util.List;

/* renamed from: whk reason: default package */
public final class whk {
    public static <T> List<T> a() {
        return new MutableOnWriteList(Collections.emptyList());
    }

    public static <T> List<T> a(String str, List<T> list) {
        if (list != null) {
            if (list instanceof MutableOnWriteList) {
                list = ((MutableOnWriteList) list).mutableList;
            }
            if (list == Collections.emptyList() || (list instanceof ImmutableList)) {
                return list;
            }
            ImmutableList immutableList = new ImmutableList(list);
            if (!immutableList.contains(null)) {
                return immutableList;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".contains(null)");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" == null");
        throw new NullPointerException(sb2.toString());
    }

    public static void a(List<?> list) {
        if (list != null) {
            int i = 0;
            int size = list.size();
            while (i < size) {
                if (list.get(i) != null) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    throw new NullPointerException(sb.toString());
                }
            }
            return;
        }
        throw new NullPointerException("list == null");
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
