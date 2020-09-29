package defpackage;

import com.spotify.music.follow.FollowManager.b;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$mwr$mD_owuD5_fxY0wTvxPXss4NyxA8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mwr$mD_owuD5_fxY0wTvxPXss4NyxA8 implements Cancellable {
    private final /* synthetic */ mwr f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ b f$2;

    public /* synthetic */ $$Lambda$mwr$mD_owuD5_fxY0wTvxPXss4NyxA8(mwr mwr, String str, b bVar) {
        this.f$0 = mwr;
        this.f$1 = str;
        this.f$2 = bVar;
    }

    public final void cancel() {
        this.f$0.a(this.f$1, this.f$2);
    }
}
