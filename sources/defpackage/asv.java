package defpackage;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import defpackage.asw;
import java.util.Map;

/* renamed from: asv reason: default package */
public final class asv<T extends asw> implements DrmSession<T> {
    private final DrmSessionException a;

    public asv(DrmSessionException drmSessionException) {
        this.a = (DrmSessionException) bdl.a(drmSessionException);
    }

    public final int e() {
        return 1;
    }

    public final DrmSessionException f() {
        return this.a;
    }

    public final T g() {
        return null;
    }

    public final Map<String, String> h() {
        return null;
    }
}
