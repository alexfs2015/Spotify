package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import org.apache.commons.lang3.ObjectUtils;

public abstract class Triple<L, M, R> implements Serializable, Comparable<Triple<L, M, R>> {
    private static final long serialVersionUID = 1;

    public abstract L a();

    public abstract M b();

    public abstract R c();

    public /* synthetic */ int compareTo(Object obj) {
        Triple triple = (Triple) obj;
        return new wpk().a(a(), triple.a(), null).a(b(), triple.b(), null).a(c(), triple.c(), null).a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Triple) {
            Triple triple = (Triple) obj;
            return ObjectUtils.a(a(), triple.a()) && ObjectUtils.a(b(), triple.b()) && ObjectUtils.a(c(), triple.c());
        }
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (a() == null ? 0 : a().hashCode()) ^ (b() == null ? 0 : b().hashCode());
        if (c() != null) {
            i = c().hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(a());
        sb.append(',');
        sb.append(b());
        sb.append(',');
        sb.append(c());
        sb.append(')');
        return sb.toString();
    }
}
