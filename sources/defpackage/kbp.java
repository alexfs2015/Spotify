package defpackage;

import android.media.MediaDrm.MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.os.Looper;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.drm.DrmUtil.UnexpectedDrmException;

/* renamed from: kbp reason: default package */
public final class kbp {
    public static kbq a(Looper looper, a aVar, ata ata) {
        try {
            return DrmUtil.a(looper, aVar, ata);
        } catch (MediaDrmStateException | MediaDrmResetException e) {
            throw new UnexpectedDrmException(e);
        }
    }
}
