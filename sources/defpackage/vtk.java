package defpackage;

import com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties;
import com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.DontLockWhenInCarView;

/* renamed from: vtk reason: default package */
public final class vtk extends AndroidLibsNowplayingDrivingProperties {
    private final DontLockWhenInCarView a;
    private final boolean b;

    /* renamed from: vtk$a */
    public static final class a extends com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.a {
        private DontLockWhenInCarView a;
        private Boolean b;

        public final com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.a a(DontLockWhenInCarView dontLockWhenInCarView) {
            if (dontLockWhenInCarView != null) {
                this.a = dontLockWhenInCarView;
                return this;
            }
            throw new NullPointerException("Null dontLockWhenInCarView");
        }

        public final com.spotify.remoteconfig.AndroidLibsNowplayingDrivingProperties.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final AndroidLibsNowplayingDrivingProperties a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" dontLockWhenInCarView");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" enableCarViewVoiceSearch");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new vtk(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private vtk(DontLockWhenInCarView dontLockWhenInCarView, boolean z) {
        this.a = dontLockWhenInCarView;
        this.b = z;
    }

    /* synthetic */ vtk(DontLockWhenInCarView dontLockWhenInCarView, boolean z, byte b2) {
        this(dontLockWhenInCarView, z);
    }

    public final DontLockWhenInCarView a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidLibsNowplayingDrivingProperties) {
            AndroidLibsNowplayingDrivingProperties androidLibsNowplayingDrivingProperties = (AndroidLibsNowplayingDrivingProperties) obj;
            return this.a.equals(androidLibsNowplayingDrivingProperties.a()) && this.b == androidLibsNowplayingDrivingProperties.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidLibsNowplayingDrivingProperties{dontLockWhenInCarView=");
        sb.append(this.a);
        sb.append(", enableCarViewVoiceSearch=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
