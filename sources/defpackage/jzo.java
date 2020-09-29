package defpackage;

import android.media.MediaDrm.MediaDrmStateException;
import android.os.Looper;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.drm.DrmUtil.UnexpectedDrmException;

/* renamed from: jzo reason: default package */
public final class jzo {
    public static jzq a(Looper looper, a aVar, asj asj) {
        try {
            return DrmUtil.a(looper, aVar, asj);
        } catch (MediaDrmStateException e) {
            throw new UnexpectedDrmException(e);
        }
    }
}
