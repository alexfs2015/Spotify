package defpackage;

import io.reactivex.Completable;

/* renamed from: gjp reason: default package */
final class gjp<T> extends gjr<T> {
    private final Completable a;
    private final T b;
    private final String c;
    private final String d;

    gjp(Completable completable, T t, String str, String str2) {
        if (completable != null) {
            this.a = completable;
            if (t != null) {
                this.b = t;
                if (str != null) {
                    this.c = str;
                    if (str2 != null) {
                        this.d = str2;
                        return;
                    }
                    throw new NullPointerException("Null factoryDescription");
                }
                throw new NullPointerException("Null description");
            }
            throw new NullPointerException("Null input");
        }
        throw new NullPointerException("Null asCompletable");
    }

    public final Completable a() {
        return this.a;
    }

    public final T b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command{asCompletable=");
        sb.append(this.a);
        sb.append(", input=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", factoryDescription=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gjr) {
            gjr gjr = (gjr) obj;
            return this.a.equals(gjr.a()) && this.b.equals(gjr.b()) && this.c.equals(gjr.c()) && this.d.equals(gjr.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
