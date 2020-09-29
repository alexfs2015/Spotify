package defpackage;

import android.net.Uri;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Request;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qym$lJDb8c7q7ro2CdrMAly7_RY-e6s reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qym$lJDb8c7q7ro2CdrMAly7_RYe6s implements Consumer {
    private final /* synthetic */ qym f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$qym$lJDb8c7q7ro2CdrMAly7_RYe6s(qym qym, Uri uri) {
        this.f$0 = qym;
        this.f$1 = uri;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Request) obj);
    }
}
