package defpackage;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError.ErrorType;

/* renamed from: nzc reason: default package */
public final class nzc extends PartnerAccountLinkingError {
    private final ErrorType a;
    private final String b;

    public nzc(ErrorType errorType, String str) {
        if (errorType != null) {
            this.a = errorType;
            this.b = str;
            return;
        }
        throw new NullPointerException("Null errorType");
    }

    public final ErrorType a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerAccountLinkingError{errorType=");
        sb.append(this.a);
        sb.append(", errorMessage=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PartnerAccountLinkingError) {
            PartnerAccountLinkingError partnerAccountLinkingError = (PartnerAccountLinkingError) obj;
            if (this.a.equals(partnerAccountLinkingError.a())) {
                String str = this.b;
                return str != null ? str.equals(partnerAccountLinkingError.b()) : partnerAccountLinkingError.b() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
