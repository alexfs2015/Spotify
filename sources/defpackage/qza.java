package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.f;
import com.spotify.music.features.yourlibrary.musicpages.recsloader.RecsTrack;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import java.util.Map;

/* renamed from: qza reason: default package */
public final class qza {

    /* renamed from: qza$a */
    interface a {
        Observable<Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a>> create(String str, String str2, ImmutableSet<String> immutableSet);
    }

    public static a a(CollectionStateProvider collectionStateProvider) {
        return new $$Lambda$qza$M_bl4zkN3x5w6IUX6dvhbobwovQ(collectionStateProvider);
    }

    public static ObservableTransformer<b, qyx> a(qzc qzc) {
        return new $$Lambda$qza$qT9oLdAi_l7Qw8pUedv2kxUHCZ0(qzc);
    }

    public static ObservableTransformer<defpackage.qyw.a, qyx> a(a aVar, String str, qxq qxq) {
        return new $$Lambda$qza$1aWojZNUccKPkN2fRT_ZO5416o(str, qxq, aVar);
    }

    private static ImmutableSet<String> a(ImmutableList<String> immutableList) {
        return ImmutableSet.a(fcl.a((Iterable<F>) immutableList, (Function<? super F, ? extends T>) $$Lambda$qza$c9BNovn4OiTgJDgudVqQkHWDE.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList a(qxq qxq, String str, ImmutableList immutableList) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        fdh R_ = immutableList.R_();
        while (R_.hasNext()) {
            RecsTrack recsTrack = (RecsTrack) R_.next();
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a y = MusicItem.y();
            fdr fdr = qxq.c;
            StringBuilder sb = new StringBuilder();
            sb.append(recsTrack.uri());
            sb.append(":recommended");
            g.c(y.a(fdr.a((CharSequence) sb.toString()).c()).a(Type.TRACK_SHUFFLE_ONLY).a(recsTrack.name()).b(fau.a(", ").a((Iterable<?>) recsTrack.getArtistNames())).c(recsTrack.uri()).d(recsTrack.uri()).e(recsTrack.getImage()).a(0).a((Boolean) null).a((b) f.l().b(str).a(false).b(false).c(true).d(true).e(recsTrack.explicit()).f(true).g(true).a(recsTrack.previewId()).h(false).a()).b(0).a(true).b(false).c(false).d(false).a());
        }
        return g.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList a(ImmutableList immutableList, Map map) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        fdh R_ = immutableList.R_();
        while (R_.hasNext()) {
            MusicItem musicItem = (MusicItem) R_.next();
            if (musicItem.v()) {
                com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a aVar = (com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a) map.get(musicItem.j());
                if (aVar != null) {
                    g.c(musicItem.r().a((b) musicItem.w().k().a(aVar.a()).b(aVar.b()).a()).a());
                }
            }
        }
        return g.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList b(ImmutableList immutableList) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            g.c(((MusicItem) immutableList.get(i)).r().b(i).a());
        }
        return g.a();
    }
}
