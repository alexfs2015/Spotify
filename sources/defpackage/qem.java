package defpackage;

import android.os.Bundle;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qem reason: default package */
final class qem extends qev {
    private final String a;
    private final Bundle b;
    private final MediaType c;
    private final boolean d;

    qem(String str, Bundle bundle, MediaType mediaType, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = bundle;
            if (mediaType != null) {
                this.c = mediaType;
                this.d = z;
                return;
            }
            throw new NullPointerException("Null mediaType");
        }
        throw new NullPointerException("Null uri");
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final Bundle b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final MediaType c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowEntityResolution{uri=");
        sb.append(this.a);
        sb.append(", navigationExtras=");
        sb.append(this.b);
        sb.append(", mediaType=");
        sb.append(this.c);
        sb.append(", showProgressIndicator=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qev) {
            qev qev = (qev) obj;
            if (this.a.equals(qev.a())) {
                Bundle bundle = this.b;
                if (bundle != null ? bundle.equals(qev.b()) : qev.b() == null) {
                    return this.c.equals(qev.c()) && this.d == qev.d();
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Bundle bundle = this.b;
        return ((((hashCode ^ (bundle == null ? 0 : bundle.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }
}
