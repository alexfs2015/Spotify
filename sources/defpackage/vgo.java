package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties;
import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.StupidFlag2;
import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.StupidFlag3;
import com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.StupidFlag4;

/* renamed from: vgo reason: default package */
public final class vgo extends AndroidMusicLibsPlaylistProperties {
    private final boolean a;
    private final boolean b;
    private final StupidFlag2 c;
    private final StupidFlag3 d;
    private final StupidFlag4 e;

    /* renamed from: vgo$a */
    public static final class a extends com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.a {
        private Boolean a;
        private Boolean b;
        private StupidFlag2 c;
        private StupidFlag3 d;
        private StupidFlag4 e;

        public final com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.a a(StupidFlag2 stupidFlag2) {
            if (stupidFlag2 != null) {
                this.c = stupidFlag2;
                return this;
            }
            throw new NullPointerException("Null stupidFlag2");
        }

        public final com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.a a(StupidFlag3 stupidFlag3) {
            if (stupidFlag3 != null) {
                this.d = stupidFlag3;
                return this;
            }
            throw new NullPointerException("Null stupidFlag3");
        }

        public final com.spotify.remoteconfig.AndroidMusicLibsPlaylistProperties.a a(StupidFlag4 stupidFlag4) {
            if (stupidFlag4 != null) {
                this.e = stupidFlag4;
                return this;
            }
            throw new NullPointerException("Null stupidFlag4");
        }

        public final AndroidMusicLibsPlaylistProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" alwaysShowWindowedTracksInPlaylists");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" stupidFlag");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" stupidFlag2");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" stupidFlag3");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" stupidFlag4");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                vgo vgo = new vgo(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d, this.e, 0);
                return vgo;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ vgo(boolean z, boolean z2, StupidFlag2 stupidFlag2, StupidFlag3 stupidFlag3, StupidFlag4 stupidFlag4, byte b2) {
        this(z, z2, stupidFlag2, stupidFlag3, stupidFlag4);
    }

    private vgo(boolean z, boolean z2, StupidFlag2 stupidFlag2, StupidFlag3 stupidFlag3, StupidFlag4 stupidFlag4) {
        this.a = z;
        this.b = z2;
        this.c = stupidFlag2;
        this.d = stupidFlag3;
        this.e = stupidFlag4;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final StupidFlag2 c() {
        return this.c;
    }

    public final StupidFlag3 d() {
        return this.d;
    }

    public final StupidFlag4 e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidMusicLibsPlaylistProperties{alwaysShowWindowedTracksInPlaylists=");
        sb.append(this.a);
        sb.append(", stupidFlag=");
        sb.append(this.b);
        sb.append(", stupidFlag2=");
        sb.append(this.c);
        sb.append(", stupidFlag3=");
        sb.append(this.d);
        sb.append(", stupidFlag4=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidMusicLibsPlaylistProperties) {
            AndroidMusicLibsPlaylistProperties androidMusicLibsPlaylistProperties = (AndroidMusicLibsPlaylistProperties) obj;
            return this.a == androidMusicLibsPlaylistProperties.a() && this.b == androidMusicLibsPlaylistProperties.b() && this.c.equals(androidMusicLibsPlaylistProperties.c()) && this.d.equals(androidMusicLibsPlaylistProperties.d()) && this.e.equals(androidMusicLibsPlaylistProperties.e());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return ((((((i2 ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
