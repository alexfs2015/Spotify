package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.stories.v1.view.proto.Chapter;
import com.spotify.stories.v1.view.proto.Chapter.ChapterCase;
import com.spotify.stories.v1.view.proto.Story;
import com.spotify.stories.v1.view.rpc.proto.GetStoryViewResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: nbd reason: default package */
public final class nbd {
    private static iov e = new iov() {
        public final /* bridge */ /* synthetic */ Object[] getItems() {
            return new uzc[0];
        }

        public final int getUnfilteredLength() {
            return 0;
        }

        public final int getUnrangedLength() {
            return 0;
        }

        public final boolean isLoading() {
            return false;
        }

        public final uzf a() {
            throw new UnsupportedOperationException();
        }

        public final List<iou> b() {
            return Collections.emptyList();
        }
    };
    private final nal a;
    private final ioo b;
    private final Policy c;
    private final String d;

    public nbd(nal nal, ioo ioo, Policy policy, String str) {
        this.a = nal;
        this.b = ioo;
        this.c = policy;
        this.d = str;
    }

    /* access modifiers changed from: 0000 */
    public final ObservableTransformer<c, naw> a() {
        return new $$Lambda$nbd$fC0YamTPxvEO76LT69zYELE2c(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.h(new $$Lambda$nbd$WYaxY3OkgOamglIFBen3UqGYHY(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(c cVar) {
        return Observable.b((ObservableSource<? extends T1>) this.a.a(this.d).d(), (ObservableSource<? extends T2>) this.b.a(this.c).c(e), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$nbd$oN9tG7RjQ0VhVMr1PUYEopNaQeU.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$nbd$HKGNxN_EA8xAqPyQ4yprEOyflck.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ naw a(GetStoryViewResponse getStoryViewResponse, iov iov) {
        Optional optional;
        Story k = getStoryViewResponse.k();
        if (!k.g.isEmpty()) {
            Iterator it = k.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optional = Optional.e();
                    break;
                }
                Chapter chapter = (Chapter) it.next();
                if (ChapterCase.a(chapter.d) != ChapterCase.VIDEO_CHAPTER && ChapterCase.a(chapter.d) != ChapterCase.TRACK_CHAPTER) {
                    optional = Optional.b(naw.a((nav) new a(k)));
                    break;
                }
            }
        } else {
            optional = Optional.b(naw.a((nav) new b(k)));
        }
        if (optional.b()) {
            return (naw) optional.c();
        }
        e<Chapter> eVar = k.g;
        ArrayList arrayList = new ArrayList(eVar.size());
        a j = ImmutableSet.j();
        for (uzc uri : (uzc[]) iov.getItems()) {
            j.b(uri.getUri());
        }
        ImmutableSet b2 = j.a();
        for (Chapter chapter2 : eVar) {
            arrayList.add(Boolean.valueOf(ChapterCase.a(chapter2.d) == ChapterCase.TRACK_CHAPTER && b2.contains(chapter2.k().d)));
        }
        return new o(k, ImmutableList.a((Collection<? extends E>) arrayList));
    }
}
