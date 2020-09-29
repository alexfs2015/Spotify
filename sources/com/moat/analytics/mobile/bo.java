package com.moat.analytics.mobile;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

final class bo<T> {
    final /* synthetic */ bk a;
    private final List<Field> b;

    private bo(bk bkVar, Class<T> cls, Field[] fieldArr) {
        this.a = bkVar;
        if (fieldArr.length == 0) {
            throw new IllegalArgumentException("Must have at least one field in the chain.");
        } else if (cls.isAssignableFrom(fieldArr[fieldArr.length - 1].getType())) {
            this.b = Arrays.asList(fieldArr);
        } else {
            StringBuilder sb = new StringBuilder("Last field must be of type ");
            sb.append(cls.getSimpleName());
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final Object a(Object obj) {
        for (Field a2 : this.b) {
            obj = this.a.a(obj, a2);
            if (obj != null) {
                if (obj instanceof bn) {
                    break;
                }
            } else {
                break;
            }
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((bo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
