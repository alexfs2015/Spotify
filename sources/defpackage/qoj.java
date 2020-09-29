package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.OffliningService;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;

/* renamed from: qoj reason: default package */
final class qoj implements uey {
    private final sso a;
    private final Context b;

    qoj(sso sso, Context context) {
        this.a = sso;
        this.b = context;
    }

    public final void onDownloadClick(vkv vkv, String str, int i) {
        boolean z = vkv.u() instanceof f;
        OffliningService.a(this.b, vkv.getUri(), z);
        OffliningLogger.a(this.a, vkv.getUri(), SourceElement.ITEM_ROW, z);
    }
}
