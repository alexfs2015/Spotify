package defpackage;

import android.net.Uri;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Request;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qym$VXIO511k27Q-ll49DBFlBs_Nxiw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qym$VXIO511k27Qll49DBFlBs_Nxiw implements Consumer {
    private final /* synthetic */ qym f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$qym$VXIO511k27Qll49DBFlBs_Nxiw(qym qym, Uri uri) {
        this.f$0 = qym;
        this.f$1 = uri;
    }

    public final void accept(Object obj) {
        this.f$0.b(this.f$1, (Request) obj);
    }
}
