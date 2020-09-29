package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$rhp$QrkonN_WYWG5UOdT8fqsCGHj9Ks reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rhp$QrkonN_WYWG5UOdT8fqsCGHj9Ks implements a {
    private final /* synthetic */ CollectionStateProvider f$0;

    public /* synthetic */ $$Lambda$rhp$QrkonN_WYWG5UOdT8fqsCGHj9Ks(CollectionStateProvider collectionStateProvider) {
        this.f$0 = collectionStateProvider;
    }

    public final Observable create(String str, String str2, ImmutableSet immutableSet) {
        return this.f$0.a(str, str2, (String[]) fdd.a((Iterable<? extends T>) immutableSet, String.class));
    }
}
