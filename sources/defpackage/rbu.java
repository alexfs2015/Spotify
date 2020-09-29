package defpackage;

import com.google.common.collect.ImmutableSet;
import defpackage.rca.a;
import java.lang.Enum;

/* renamed from: rbu reason: default package */
final class rbu<T extends Enum<T>, D extends a<T>> extends c<T, D> {
    private final ImmutableSet<T> a;
    private final e b;
    private final d<T, D> c;

    rbu(ImmutableSet<T> immutableSet, e eVar, d<T, D> dVar) {
        if (immutableSet != null) {
            this.a = immutableSet;
            if (eVar != null) {
                this.b = eVar;
                this.c = dVar;
                return;
            }
            throw new NullPointerException("Null viewTypeCreator");
        }
        throw new NullPointerException("Null types");
    }

    public final ImmutableSet<T> a() {
        return this.a;
    }

    public final e b() {
        return this.b;
    }

    public final d<T, D> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a.equals(cVar.a()) && this.b.equals(cVar.b())) {
                d<T, D> dVar = this.c;
                return dVar != null ? dVar.equals(cVar.c()) : cVar.c() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        d<T, D> dVar = this.c;
        return hashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewType{types=");
        sb.append(this.a);
        sb.append(", viewTypeCreator=");
        sb.append(this.b);
        sb.append(", viewTypeBinder=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
