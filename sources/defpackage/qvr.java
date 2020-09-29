package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter.ViewType;

/* renamed from: qvr reason: default package */
public final class qvr extends qvs {
    private final String a;
    private final Optional<String> b;
    private final ViewType c;

    public qvr(String str, Optional<String> optional, ViewType viewType) {
        if (str != null) {
            this.a = str;
            if (optional != null) {
                this.b = optional;
                if (viewType != null) {
                    this.c = viewType;
                    return;
                }
                throw new NullPointerException("Null viewType");
            }
            throw new NullPointerException("Null externalUrl");
        }
        throw new NullPointerException("Null text");
    }

    public final String a() {
        return this.a;
    }

    public final Optional<String> b() {
        return this.b;
    }

    public final ViewType c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvs) {
            qvs qvs = (qvs) obj;
            return this.a.equals(qvs.a()) && this.b.equals(qvs.b()) && this.c.equals(qvs.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreditRowModel{text=");
        sb.append(this.a);
        sb.append(", externalUrl=");
        sb.append(this.b);
        sb.append(", viewType=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
