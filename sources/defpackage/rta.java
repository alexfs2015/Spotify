package defpackage;

import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import com.spotify.mobile.android.service.media.MediaAction;
import java.util.List;

/* renamed from: rta reason: default package */
public interface rta {
    long a(MediaAction mediaAction);

    List<MediaAction> a(List<MediaAction> list);

    CustomAction b(MediaAction mediaAction);
}
