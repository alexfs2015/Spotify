package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: vmu reason: default package */
final class vmu extends vmy {
    private final String a;
    private final String b;

    vmu(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("id")
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("type")
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmy) {
            vmy vmy = (vmy) obj;
            if (this.a.equals(vmy.a())) {
                String str = this.b;
                return str != null ? str.equals(vmy.b()) : vmy.b() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastSelectionCompleteRequestBody{id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
