package defpackage;

/* renamed from: syg reason: default package */
final class syg extends syh {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final fqn d;

    syg(Boolean bool, Boolean bool2, Boolean bool3, fqn fqn) {
        if (bool != null) {
            this.a = bool;
            if (bool2 != null) {
                this.b = bool2;
                if (bool3 != null) {
                    this.c = bool3;
                    if (fqn != null) {
                        this.d = fqn;
                        return;
                    }
                    throw new NullPointerException("Null getFlags");
                }
                throw new NullPointerException("Null isOnDemandTrialExpired");
            }
            throw new NullPointerException("Null isPremiumTrialExpired");
        }
        throw new NullPointerException("Null isForeground");
    }

    public final Boolean a() {
        return this.a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final fqn d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof syh) {
            syh syh = (syh) obj;
            return this.a.equals(syh.a()) && this.b.equals(syh.b()) && this.c.equals(syh.c()) && this.d.equals(syh.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EndOfTrialDialogModel{isForeground=");
        sb.append(this.a);
        sb.append(", isPremiumTrialExpired=");
        sb.append(this.b);
        sb.append(", isOnDemandTrialExpired=");
        sb.append(this.c);
        sb.append(", getFlags=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
