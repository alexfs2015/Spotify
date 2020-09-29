package defpackage;

import android.media.MediaDrm.MediaDrmStateException;
import android.os.Looper;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.drm.DrmUtil.UnexpectedDrmException;

/* renamed from: kbo reason: default package */
public final class kbo {
    public static kbq a(Looper looper, a aVar, ata ata) {
        try {
            return DrmUtil.a(looper, aVar, ata);
        } catch (MediaDrmStateException e) {
            throw new UnexpectedDrmException(e);
        }
    }
}
