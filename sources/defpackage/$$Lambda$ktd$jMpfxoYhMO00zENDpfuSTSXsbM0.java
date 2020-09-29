package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;

/* renamed from: -$$Lambda$ktd$jMpfxoYhMO00zENDpfuSTSXsbM0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktd$jMpfxoYhMO00zENDpfuSTSXsbM0 implements Function {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ $$Lambda$ktd$jMpfxoYhMO00zENDpfuSTSXsbM0(Context context) {
        this.f$0 = context;
    }

    public final Object apply(Object obj) {
        return new a().a(((RecentlyPlayedItem) obj).getTargetUri()).b(((RecentlyPlayedItem) obj).getTitle(this.f$0)).c(((RecentlyPlayedItem) obj).getImageUri()).a();
    }
}
