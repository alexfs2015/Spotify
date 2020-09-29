package defpackage;

import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;
import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel;
import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.SimpleMessageTest;

/* renamed from: vtw reason: default package */
public final class vtw extends AppsMusicLibsRemoteconfigProperties {
    private final SettingsDebugLabel a;
    private final SimpleMessageTest b;

    /* renamed from: vtw$a */
    public static final class a extends com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.a {
        private SettingsDebugLabel a;
        private SimpleMessageTest b;

        public final com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.a a(SettingsDebugLabel settingsDebugLabel) {
            if (settingsDebugLabel != null) {
                this.a = settingsDebugLabel;
                return this;
            }
            throw new NullPointerException("Null settingsDebugLabel");
        }

        public final com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties.a a(SimpleMessageTest simpleMessageTest) {
            if (simpleMessageTest != null) {
                this.b = simpleMessageTest;
                return this;
            }
            throw new NullPointerException("Null simpleMessageTest");
        }

        public final AppsMusicLibsRemoteconfigProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" settingsDebugLabel");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" simpleMessageTest");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vtw(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private vtw(SettingsDebugLabel settingsDebugLabel, SimpleMessageTest simpleMessageTest) {
        this.a = settingsDebugLabel;
        this.b = simpleMessageTest;
    }

    /* synthetic */ vtw(SettingsDebugLabel settingsDebugLabel, SimpleMessageTest simpleMessageTest, byte b2) {
        this(settingsDebugLabel, simpleMessageTest);
    }

    public final SettingsDebugLabel a() {
        return this.a;
    }

    public final SimpleMessageTest b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppsMusicLibsRemoteconfigProperties) {
            AppsMusicLibsRemoteconfigProperties appsMusicLibsRemoteconfigProperties = (AppsMusicLibsRemoteconfigProperties) obj;
            return this.a.equals(appsMusicLibsRemoteconfigProperties.a()) && this.b.equals(appsMusicLibsRemoteconfigProperties.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMusicLibsRemoteconfigProperties{settingsDebugLabel=");
        sb.append(this.a);
        sb.append(", simpleMessageTest=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
