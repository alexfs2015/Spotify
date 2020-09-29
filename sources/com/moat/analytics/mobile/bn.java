package com.moat.analytics.mobile;

import com.moat.analytics.mobile.base.asserts.a;
import java.lang.reflect.Field;

final class bn {
    final /* synthetic */ bk a;
    private final Field b;

    private bn(bk bkVar, Field field) {
        this.a = bkVar;
        a.a(field);
        this.b = field;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((bn) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
