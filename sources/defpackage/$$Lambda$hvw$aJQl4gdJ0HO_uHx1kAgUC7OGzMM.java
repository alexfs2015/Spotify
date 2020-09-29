package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hvw$aJQl4gdJ0HO_uHx1kAgUC7OGzMM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hvw$aJQl4gdJ0HO_uHx1kAgUC7OGzMM implements Consumer {
    private final /* synthetic */ hvw f$0;
    private final /* synthetic */ Activity f$1;
    private final /* synthetic */ fpg f$2;
    private final /* synthetic */ Uri f$3;
    private final /* synthetic */ String f$4;

    public /* synthetic */ $$Lambda$hvw$aJQl4gdJ0HO_uHx1kAgUC7OGzMM(hvw hvw, Activity activity, fpg fpg, Uri uri, String str) {
        this.f$0 = hvw;
        this.f$1 = activity;
        this.f$2 = fpg;
        this.f$3 = uri;
        this.f$4 = str;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, this.f$4, (RolloutFlag) obj);
    }
}
