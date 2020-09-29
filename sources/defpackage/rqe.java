package defpackage;

import com.spotify.music.genie.Wish;
import com.spotify.music.genie.Wish.Action;

/* renamed from: rqe reason: default package */
public final class rqe extends Wish {
    private final String a;
    private final Action b;

    public rqe(String str, Action action) {
        this.a = str;
        if (action != null) {
            this.b = action;
            return;
        }
        throw new NullPointerException("Null action");
    }

    public final String a() {
        return this.a;
    }

    public final Action b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wish) {
            Wish wish = (Wish) obj;
            String str = this.a;
            if (str != null ? str.equals(wish.a()) : wish.a() == null) {
                if (this.b.equals(wish.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Wish{uri=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
