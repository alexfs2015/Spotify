package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: -$$Lambda$lnh$wrvcC_0fnhA9oXjbimfhVxNSwK0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lnh$wrvcC_0fnhA9oXjbimfhVxNSwK0 implements CosmosServiceIntentBuilder {
    public static final /* synthetic */ $$Lambda$lnh$wrvcC_0fnhA9oXjbimfhVxNSwK0 INSTANCE = new $$Lambda$lnh$wrvcC_0fnhA9oXjbimfhVxNSwK0();

    private /* synthetic */ $$Lambda$lnh$wrvcC_0fnhA9oXjbimfhVxNSwK0() {
    }

    public final Intent createCosmosServiceIntent(Context context) {
        return new Intent().setComponent(new ComponentName(context, SpotifyService.class));
    }
}
