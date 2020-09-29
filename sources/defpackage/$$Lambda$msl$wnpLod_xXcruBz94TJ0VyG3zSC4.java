package defpackage;

import android.net.Uri;
import com.spotify.music.features.editplaylist.upload.Keymaster;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$msl$wnpLod_xXcruBz94TJ0VyG3zSC4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$msl$wnpLod_xXcruBz94TJ0VyG3zSC4 implements Consumer {
    private final /* synthetic */ msl f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$msl$wnpLod_xXcruBz94TJ0VyG3zSC4(msl msl, Uri uri) {
        this.f$0 = msl;
        this.f$1 = uri;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Keymaster) obj);
    }
}
