package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.collection.service.OffliningService;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;

/* renamed from: qfg reason: default package */
final class qfg implements tsv {
    private final sih a;
    private final Context b;

    qfg(sih sih, Context context) {
        this.a = sih;
        this.b = context;
    }

    public final void onDownloadClick(uys uys, String str, int i) {
        boolean z = uys.u() instanceof f;
        OffliningService.a(this.b, uys.getUri(), z);
        OffliningLogger.a(this.a, uys.getUri(), SourceElement.ITEM_ROW, z);
    }
}
