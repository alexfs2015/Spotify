package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;

/* renamed from: -$$Lambda$kpu$lU8XPlsJ2A1eYwrmwkyEABin_qs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kpu$lU8XPlsJ2A1eYwrmwkyEABin_qs implements Function {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ $$Lambda$kpu$lU8XPlsJ2A1eYwrmwkyEABin_qs(Context context) {
        this.f$0 = context;
    }

    public final Object apply(Object obj) {
        return new a().a(((RecentlyPlayedItem) obj).getTargetUri()).b(((RecentlyPlayedItem) obj).getTitle(this.f$0)).c(((RecentlyPlayedItem) obj).getImageUri()).a();
    }
}
