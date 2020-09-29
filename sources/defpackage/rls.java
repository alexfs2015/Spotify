package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import com.spotify.music.follow.resolver.RxFollowersCountResolver.Count;
import com.spotify.music.follow.resolver.RxFollowersCountResolver.Counts;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: rls reason: default package */
public final class rls {
    private final RxFollowersCountResolver a;
    private final CollectionStateProvider b;

    public rls(CollectionStateProvider collectionStateProvider, ObjectMapper objectMapper, Scheduler scheduler, RxResolver rxResolver) {
        this(collectionStateProvider, new RxFollowersCountResolver(rxResolver, objectMapper, scheduler));
    }

    private rls(CollectionStateProvider collectionStateProvider, RxFollowersCountResolver rxFollowersCountResolver) {
        this.b = collectionStateProvider;
        this.a = (RxFollowersCountResolver) fbp.a(rxFollowersCountResolver);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(List list) {
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        fbp.a(z);
        return Observable.b(list.get(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(List list, Counts counts, Map map) {
        boolean z = true;
        fbp.a(counts.counts.length == list.size());
        if (map.size() != list.size()) {
            z = false;
        }
        fbp.a(z);
        int size = map.size();
        ArrayList a2 = Lists.a(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            Count count = counts.counts[i];
            a aVar = (a) map.get(str);
            fbp.a(aVar);
            FollowManager.a aVar2 = new FollowManager.a(str, count.getFollowersCount(), count.getFollowingCount(), aVar.a(), aVar.b());
            a2.add(aVar2);
        }
        return a2;
    }

    public final Observable<FollowManager.a> a(String str) {
        fbp.a(str);
        ImmutableList a2 = ImmutableList.a(str);
        fbp.a(a2);
        fbp.a(!a2.isEmpty());
        return Observable.a((ObservableSource<? extends T1>) this.a.a((List<String>) a2), (ObservableSource<? extends T2>) this.b.a("spotify:follow", "<no context>", (String[]) a2.toArray(new String[0])).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$rls$fZXLK8YkL1DQBSY6Z1yN4HLIhzI<Object,Object,Object>(a2)).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$rls$ApDIpXkwy254sRHlCtsBrKl7tcA.INSTANCE, false);
    }
}
