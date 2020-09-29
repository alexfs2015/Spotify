package defpackage;

import com.spotify.podcastonboarding.api.TopicsApiResponse.a;
import com.spotify.podcastonboarding.topicpicker.model.TopicItem;
import java.util.List;

/* renamed from: vah reason: default package */
public final class vah extends a {
    private final String a;
    private final String b;
    private final List<TopicItem> c;

    public vah(String str, String str2, List<TopicItem> list) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            if (list != null) {
                this.c = list;
                return;
            }
            throw new NullPointerException("Null topics");
        }
        throw new NullPointerException("Null renderType");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<TopicItem> c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Section{renderType=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", topics=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a())) {
                String str = this.b;
                if (str != null ? str.equals(aVar.b()) : aVar.b() == null) {
                    if (this.c.equals(aVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }
}
