package defpackage;

import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaDescriptionCompat.a;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import java.util.List;
import java.util.Locale;

/* renamed from: rtz reason: default package */
public final class rtz {
    public static List<MediaItem> a(List<MediaBrowserItem> list, String str) {
        return Lists.a(list, new $$Lambda$rtz$cdJezizjYZIGiGscoW5ZUejqV5g(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ MediaItem a(String str, MediaBrowserItem mediaBrowserItem) {
        gox a = new gox(mediaBrowserItem.h).a(Boolean.valueOf(mediaBrowserItem.g));
        int i = 1;
        a.a.putLong("android.media.extra.DOWNLOAD_STATUS", Boolean.valueOf(mediaBrowserItem.f && ActionType.PLAYABLE == mediaBrowserItem.b).booleanValue() ? 2 : 0);
        a aVar = new a();
        aVar.a = rtg.a(str, mediaBrowserItem.a);
        aVar.b = jsd.a(mediaBrowserItem.c, Locale.getDefault());
        aVar.c = mediaBrowserItem.d;
        aVar.f = mediaBrowserItem.e;
        aVar.g = a.a;
        MediaDescriptionCompat a2 = aVar.a();
        if (ActionType.BROWSABLE != mediaBrowserItem.b) {
            i = 2;
        }
        return new MediaItem(a2, i);
    }
}
