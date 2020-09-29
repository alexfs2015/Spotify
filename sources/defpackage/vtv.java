package defpackage;

import com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties;
import com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor;
import com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties.Message;

/* renamed from: vtv reason: default package */
public final class vtv extends AppsMusicFeaturesRemoteconfigurationProperties {
    private final boolean a;
    private final ButtonColor b;
    private final Message c;

    /* renamed from: vtv$a */
    public static final class a extends com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties.a {
        private Boolean a;
        private ButtonColor b;
        private Message c;

        public final com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties.a a(ButtonColor buttonColor) {
            if (buttonColor != null) {
                this.b = buttonColor;
                return this;
            }
            throw new NullPointerException("Null buttonColor");
        }

        public final com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties.a a(Message message) {
            if (message != null) {
                this.c = message;
                return this;
            }
            throw new NullPointerException("Null message");
        }

        public final com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final AppsMusicFeaturesRemoteconfigurationProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" buttonBig");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" buttonColor");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" message");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new vtv(this.a.booleanValue(), this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private vtv(boolean z, ButtonColor buttonColor, Message message) {
        this.a = z;
        this.b = buttonColor;
        this.c = message;
    }

    /* synthetic */ vtv(boolean z, ButtonColor buttonColor, Message message, byte b2) {
        this(z, buttonColor, message);
    }

    public final boolean a() {
        return this.a;
    }

    public final ButtonColor b() {
        return this.b;
    }

    public final Message c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppsMusicFeaturesRemoteconfigurationProperties) {
            AppsMusicFeaturesRemoteconfigurationProperties appsMusicFeaturesRemoteconfigurationProperties = (AppsMusicFeaturesRemoteconfigurationProperties) obj;
            return this.a == appsMusicFeaturesRemoteconfigurationProperties.a() && this.b.equals(appsMusicFeaturesRemoteconfigurationProperties.b()) && this.c.equals(appsMusicFeaturesRemoteconfigurationProperties.c());
        }
    }

    public final int hashCode() {
        return (((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMusicFeaturesRemoteconfigurationProperties{buttonBig=");
        sb.append(this.a);
        sb.append(", buttonColor=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
