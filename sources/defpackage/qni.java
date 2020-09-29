package defpackage;

import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter.ViewType;

/* renamed from: qni reason: default package */
final class qni extends qnj {
    private final String a;
    private final ViewType b;

    qni(String str, ViewType viewType) {
        if (str != null) {
            this.a = str;
            if (viewType != null) {
                this.b = viewType;
                return;
            }
            throw new NullPointerException("Null viewType");
        }
        throw new NullPointerException("Null text");
    }

    public final String a() {
        return this.a;
    }

    public final ViewType b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreditRowModel{text=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qnj) {
            qnj qnj = (qnj) obj;
            return this.a.equals(qnj.a()) && this.b.equals(qnj.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
