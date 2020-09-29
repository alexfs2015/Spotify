package defpackage;

import android.media.MediaDrm.MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.os.Looper;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.drm.DrmUtil.UnexpectedDrmException;

/* renamed from: jzp reason: default package */
public final class jzp {
    public static jzq a(Looper looper, a aVar, asj asj) {
        try {
            return DrmUtil.a(looper, aVar, asj);
        } catch (MediaDrmStateException | MediaDrmResetException e) {
            throw new UnexpectedDrmException(e);
        }
    }
}
