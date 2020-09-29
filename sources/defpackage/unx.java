package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.ScannableImageLoadState;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b;

/* renamed from: unx reason: default package */
public final class unx extends SocialListeningDeviceModel {
    private final boolean b;
    private final Optional<uns> c;
    private final Optional<Boolean> d;
    private final ScannableImageLoadState e;
    private final b f;

    /* renamed from: unx$a */
    public static final class a extends com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a {
        private Boolean a;
        private Optional<uns> b;
        private Optional<Boolean> c;
        private ScannableImageLoadState d;
        private b e;

        public a() {
            this.b = Optional.e();
            this.c = Optional.e();
        }

        private a(SocialListeningDeviceModel socialListeningDeviceModel) {
            this.b = Optional.e();
            this.c = Optional.e();
            this.a = Boolean.valueOf(socialListeningDeviceModel.a());
            this.b = socialListeningDeviceModel.b();
            this.c = socialListeningDeviceModel.c();
            this.d = socialListeningDeviceModel.d();
            this.e = socialListeningDeviceModel.e();
        }

        /* synthetic */ a(SocialListeningDeviceModel socialListeningDeviceModel, byte b2) {
            this(socialListeningDeviceModel);
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a a(Optional<uns> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null socialListeningState");
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a a(ScannableImageLoadState scannableImageLoadState) {
            if (scannableImageLoadState != null) {
                this.d = scannableImageLoadState;
                return this;
            }
            throw new NullPointerException("Null scannableImageLoadState");
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a a(b bVar) {
            if (bVar != null) {
                this.e = bVar;
                return this;
            }
            throw new NullPointerException("Null uiState");
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final SocialListeningDeviceModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isClosing");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" scannableImageLoadState");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" uiState");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                unx unx = new unx(this.a.booleanValue(), this.b, this.c, this.d, this.e, 0);
                return unx;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a b(Optional<Boolean> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null isOnline");
        }
    }

    private unx(boolean z, Optional<uns> optional, Optional<Boolean> optional2, ScannableImageLoadState scannableImageLoadState, b bVar) {
        this.b = z;
        this.c = optional;
        this.d = optional2;
        this.e = scannableImageLoadState;
        this.f = bVar;
    }

    /* synthetic */ unx(boolean z, Optional optional, Optional optional2, ScannableImageLoadState scannableImageLoadState, b bVar, byte b2) {
        this(z, optional, optional2, scannableImageLoadState, bVar);
    }

    public final boolean a() {
        return this.b;
    }

    public final Optional<uns> b() {
        return this.c;
    }

    public final Optional<Boolean> c() {
        return this.d;
    }

    public final ScannableImageLoadState d() {
        return this.e;
    }

    public final b e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialListeningDeviceModel) {
            SocialListeningDeviceModel socialListeningDeviceModel = (SocialListeningDeviceModel) obj;
            return this.b == socialListeningDeviceModel.a() && this.c.equals(socialListeningDeviceModel.b()) && this.d.equals(socialListeningDeviceModel.c()) && this.e.equals(socialListeningDeviceModel.d()) && this.f.equals(socialListeningDeviceModel.e());
        }
    }

    public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        return (((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialListeningDeviceModel{isClosing=");
        sb.append(this.b);
        sb.append(", socialListeningState=");
        sb.append(this.c);
        sb.append(", isOnline=");
        sb.append(this.d);
        sb.append(", scannableImageLoadState=");
        sb.append(this.e);
        sb.append(", uiState=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
