package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$jdl$sB9VbFId142zE7ERwjWpmZwg21M reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$jdl$sB9VbFId142zE7ERwjWpmZwg21M implements Function {
    private final /* synthetic */ jdl f$0;
    private final /* synthetic */ ShareEventLogger f$1;
    private final /* synthetic */ jcc f$2;
    private final /* synthetic */ jdz f$3;
    private final /* synthetic */ long f$4;
    private final /* synthetic */ Activity f$5;

    public /* synthetic */ $$Lambda$jdl$sB9VbFId142zE7ERwjWpmZwg21M(jdl jdl, ShareEventLogger shareEventLogger, jcc jcc, jdz jdz, long j, Activity activity) {
        this.f$0 = jdl;
        this.f$1 = shareEventLogger;
        this.f$2 = jcc;
        this.f$3 = jdz;
        this.f$4 = j;
        this.f$5 = activity;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Optional) obj);
    }
}
