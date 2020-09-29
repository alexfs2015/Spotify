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

/* renamed from: rhp reason: default package */
public final class rhp {

    /* renamed from: rhp$a */
    interface a {
        Observable<Map<String, com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a>> create(String str, String str2, ImmutableSet<String> immutableSet);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmutableList a(ImmutableList immutableList, Map map) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        fdz R_ = immutableList.R_();
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
    public static /* synthetic */ ImmutableList a(rgf rgf, String str, ImmutableList immutableList) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        fdz R_ = immutableList.R_();
        while (R_.hasNext()) {
            RecsTrack recsTrack = (RecsTrack) R_.next();
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.a y = MusicItem.y();
            fej fej = rgf.c;
            StringBuilder sb = new StringBuilder();
            sb.append(recsTrack.uri());
            sb.append(":recommended");
            g.c(y.a(fej.a((CharSequence) sb.toString()).c()).a(Type.TRACK_SHUFFLE_ONLY).a(recsTrack.name()).b(fbl.a(", ").a((Iterable<?>) recsTrack.getArtistNames())).c(recsTrack.uri()).d(recsTrack.uri()).e(recsTrack.getImage()).a(0).a((Boolean) null).a((b) f.l().b(str).a(false).b(false).c(true).d(true).e(recsTrack.explicit()).f(true).g(true).a(recsTrack.previewId()).h(false).a()).b(0).a(true).b(false).c(false).d(false).a());
        }
        return g.a();
    }

    private static ImmutableSet<String> a(ImmutableList<String> immutableList) {
        return ImmutableSet.a(fdd.a((Iterable<F>) immutableList, (Function<? super F, ? extends T>) $$Lambda$rhp$cFJmehOvG0pXU1UvqIFrENW_w.INSTANCE));
    }

    public static ObservableTransformer<defpackage.rhl.a, rhm> a(a aVar, String str, rgf rgf) {
        return new $$Lambda$rhp$UwdElxgJ7RDIXW6ZdkF86Cm6TU(str, rgf, aVar);
    }

    public static ObservableTransformer<b, rhm> a(rhr rhr) {
        return new $$Lambda$rhp$SwsmeXzArCeW32VTpWxrOMz_wWg(rhr);
    }

    public static a a(CollectionStateProvider collectionStateProvider) {
        return new $$Lambda$rhp$QrkonN_WYWG5UOdT8fqsCGHj9Ks(collectionStateProvider);
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
