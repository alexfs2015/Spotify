package defpackage;

import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction.a;
import com.spotify.mobile.android.service.media.MediaAction;
import java.util.List;

/* renamed from: sci reason: default package */
public final class sci implements sch {
    public final long a(MediaAction mediaAction) {
        if (mediaAction == MediaAction.PLAY) {
            return 4;
        }
        if (mediaAction == MediaAction.PAUSE) {
            return 2;
        }
        if (mediaAction == MediaAction.SKIP_TO_NEXT) {
            return 32;
        }
        if (mediaAction == MediaAction.SKIP_TO_PREVIOUS) {
            return 16;
        }
        if (mediaAction == MediaAction.STOP) {
            return 1;
        }
        if (mediaAction == MediaAction.PREPARE_FROM_URI) {
            return 131072;
        }
        if (mediaAction == MediaAction.PLAY_FROM_URI) {
            return 8192;
        }
        if (mediaAction == MediaAction.PLAY_FROM_SEARCH) {
            return 2048;
        }
        if (mediaAction == MediaAction.TOGGLE_REPEAT) {
            return 262144;
        }
        if (mediaAction == MediaAction.TOGGLE_SHUFFLE) {
            return 2621440;
        }
        if (mediaAction == MediaAction.SEEK_TO) {
            return 256;
        }
        return mediaAction == MediaAction.SET_STANDARD_RATING ? 128 : 0;
    }

    public final List<MediaAction> a(List<MediaAction> list) {
        return list;
    }

    public final CustomAction b(MediaAction mediaAction) {
        if (mediaAction == null || 0 != a(mediaAction)) {
            return null;
        }
        a aVar = new a(mediaAction.name(), mediaAction.name(), mediaAction.mIconRes);
        return new CustomAction(aVar.a, aVar.b, aVar.c, null);
    }
}
