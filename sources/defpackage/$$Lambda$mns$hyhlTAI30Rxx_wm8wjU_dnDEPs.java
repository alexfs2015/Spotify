package defpackage;

import android.net.Uri;
import com.spotify.music.features.editplaylist.upload.Keymaster;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mns$hyhlTAI30Rxx_wm-8wjU_dnDEPs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mns$hyhlTAI30Rxx_wm8wjU_dnDEPs implements Consumer {
    private final /* synthetic */ mns f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$mns$hyhlTAI30Rxx_wm8wjU_dnDEPs(mns mns, Uri uri) {
        this.f$0 = mns;
        this.f$1 = uri;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Keymaster) obj);
    }
}
