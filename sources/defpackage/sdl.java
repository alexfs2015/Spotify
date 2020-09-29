package defpackage;

import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaDescriptionCompat.a;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import java.util.List;
import java.util.Locale;

/* renamed from: sdl reason: default package */
public final class sdl {
    /* access modifiers changed from: private */
    public static /* synthetic */ MediaItem a(String str, MediaBrowserItem mediaBrowserItem) {
        gqn a = new gqn(mediaBrowserItem.i).a(Boolean.valueOf(mediaBrowserItem.h));
        int i = 1;
        a.a.putLong("android.media.extra.DOWNLOAD_STATUS", Boolean.valueOf(mediaBrowserItem.g && ActionType.PLAYABLE == mediaBrowserItem.b).booleanValue() ? 2 : 0);
        a aVar = new a();
        aVar.a = scn.a(str, mediaBrowserItem.a);
        aVar.b = jun.a(mediaBrowserItem.c, Locale.getDefault());
        aVar.c = mediaBrowserItem.d;
        aVar.f = mediaBrowserItem.e;
        aVar.h = mediaBrowserItem.f;
        aVar.g = a.a;
        MediaDescriptionCompat a2 = aVar.a();
        if (ActionType.BROWSABLE != mediaBrowserItem.b) {
            i = 2;
        }
        return new MediaItem(a2, i);
    }

    public static List<MediaItem> a(List<MediaBrowserItem> list, String str) {
        return Lists.a(list, new $$Lambda$sdl$VAlw2hdVGSK2a2eOOlvf_DXbdJk(str));
    }
}
