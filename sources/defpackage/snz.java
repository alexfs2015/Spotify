package defpackage;

/* renamed from: snz reason: default package */
final class snz extends soa {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final fpt d;

    snz(Boolean bool, Boolean bool2, Boolean bool3, fpt fpt) {
        if (bool != null) {
            this.a = bool;
            if (bool2 != null) {
                this.b = bool2;
                if (bool3 != null) {
                    this.c = bool3;
                    if (fpt != null) {
                        this.d = fpt;
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

    public final fpt d() {
        return this.d;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soa) {
            soa soa = (soa) obj;
            return this.a.equals(soa.a()) && this.b.equals(soa.b()) && this.c.equals(soa.c()) && this.d.equals(soa.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
