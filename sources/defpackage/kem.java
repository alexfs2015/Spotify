package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.tracking.VideoSurfaceState;
import java.util.Comparator;

/* renamed from: kem reason: default package */
public final class kem {
    static final Comparator<kem> a = $$Lambda$kem$Ye2bjjlx1x2C0ldB0LLyQ9qbeQ.INSTANCE;
    final long b;
    final VideoSurfaceState c;
    final String d;
    final float e;
    private final long f;

    public kem(long j, float f2, VideoSurfaceState videoSurfaceState, String str) {
        this(j, -1, f2, videoSurfaceState, str);
    }

    private kem(long j, long j2, float f2, VideoSurfaceState videoSurfaceState, String str) {
        this.b = j;
        this.f = j2;
        this.e = f2;
        this.c = videoSurfaceState;
        this.d = str;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(kem kem, kem kem2) {
        long j = kem.b;
        long j2 = kem2.b;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public final Optional<Long> a() {
        return c() ? Optional.b(Long.valueOf(this.f - this.b)) : Optional.e();
    }

    public final kem a(long j) {
        kem kem = new kem(this.b, j, this.e, this.c, this.d);
        return kem;
    }

    public final long b() {
        if (this.e > 0.0f) {
            return (long) (((float) ((Long) a().a(Long.valueOf(0))).longValue()) / this.e);
        }
        return 0;
    }

    public final boolean c() {
        return this.f != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kem)) {
            return false;
        }
        kem kem = (kem) obj;
        return this.b == kem.b && this.f == kem.f && this.c == kem.c;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        VideoSurfaceState videoSurfaceState = this.c;
        return i2 + (videoSurfaceState != null ? videoSurfaceState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range{mStart=");
        sb.append(this.b);
        sb.append(", mEnd=");
        sb.append(this.f);
        sb.append(", mSurfaceState=");
        sb.append(this.c);
        sb.append(", length=");
        sb.append(a());
        sb.append('}');
        return sb.toString();
    }
}
