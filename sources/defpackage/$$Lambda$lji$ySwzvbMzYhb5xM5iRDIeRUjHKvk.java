package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.cosmos.android.CosmosServiceIntentBuilder;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: -$$Lambda$lji$ySwzvbMzYhb5xM5iRDIeRUjHKvk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lji$ySwzvbMzYhb5xM5iRDIeRUjHKvk implements CosmosServiceIntentBuilder {
    public static final /* synthetic */ $$Lambda$lji$ySwzvbMzYhb5xM5iRDIeRUjHKvk INSTANCE = new $$Lambda$lji$ySwzvbMzYhb5xM5iRDIeRUjHKvk();

    private /* synthetic */ $$Lambda$lji$ySwzvbMzYhb5xM5iRDIeRUjHKvk() {
    }

    public final Intent createCosmosServiceIntent(Context context) {
        return new Intent().setComponent(new ComponentName(context, SpotifyService.class));
    }
}
