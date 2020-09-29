package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.follow.FollowManager.a;
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

/* renamed from: rcu reason: default package */
public final class rcu {
    private final RxFollowersCountResolver a;
    private final CollectionStateProvider b;

    public rcu(CollectionStateProvider collectionStateProvider, ObjectMapper objectMapper, Scheduler scheduler) {
        this(collectionStateProvider, new RxFollowersCountResolver((RxResolver) ggw.a(RxResolver.class), objectMapper, scheduler));
    }

    private rcu(CollectionStateProvider collectionStateProvider, RxFollowersCountResolver rxFollowersCountResolver) {
        this.b = collectionStateProvider;
        this.a = (RxFollowersCountResolver) fay.a(rxFollowersCountResolver);
    }

    public final Observable<a> a(String str) {
        fay.a(str);
        ImmutableList a2 = ImmutableList.a(str);
        fay.a(a2);
        fay.a(!a2.isEmpty());
        return Observable.a((ObservableSource<? extends T1>) this.a.a((List<String>) a2), (ObservableSource<? extends T2>) this.b.a("spotify:follow", "<no context>", (String[]) a2.toArray(new String[0])).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$rcu$h9O7sn_yhQYKhRUvW4sOvvIw3k<Object,Object,Object>(a2)).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$rcu$_V6WAbwEGfI3Do6qgsLArxjG1hU.INSTANCE, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(List list) {
        boolean z = true;
        if (list.size() != 1) {
            z = false;
        }
        fay.a(z);
        return Observable.b(list.get(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(List list, Counts counts, Map map) {
        boolean z = true;
        fay.a(counts.counts.length == list.size());
        if (map.size() != list.size()) {
            z = false;
        }
        fay.a(z);
        int size = map.size();
        ArrayList a2 = Lists.a(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            Count count = counts.counts[i];
            CollectionStateProvider.a aVar = (CollectionStateProvider.a) map.get(str);
            fay.a(aVar);
            a aVar2 = new a(str, count.getFollowersCount(), count.getFollowingCount(), aVar.a(), aVar.b());
            a2.add(aVar2);
        }
        return a2;
    }
}
