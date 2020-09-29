package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.Observable;

/* renamed from: -$$Lambda$qza$M_bl4zkN3x5w6IUX6dvhbobwovQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qza$M_bl4zkN3x5w6IUX6dvhbobwovQ implements a {
    private final /* synthetic */ CollectionStateProvider f$0;

    public /* synthetic */ $$Lambda$qza$M_bl4zkN3x5w6IUX6dvhbobwovQ(CollectionStateProvider collectionStateProvider) {
        this.f$0 = collectionStateProvider;
    }

    public final Observable create(String str, String str2, ImmutableSet immutableSet) {
        return this.f$0.a(str, str2, (String[]) fcl.a((Iterable<? extends T>) immutableSet, String.class));
    }
}
