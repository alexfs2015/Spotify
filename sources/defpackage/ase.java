package defpackage;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import defpackage.asf;
import java.util.Map;

/* renamed from: ase reason: default package */
public final class ase<T extends asf> implements DrmSession<T> {
    private final DrmSessionException a;

    public final int e() {
        return 1;
    }

    public final T g() {
        return null;
    }

    public final Map<String, String> h() {
        return null;
    }

    public ase(DrmSessionException drmSessionException) {
        this.a = (DrmSessionException) bcu.a(drmSessionException);
    }

    public final DrmSessionException f() {
        return this.a;
    }
}
