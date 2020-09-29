package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hul reason: default package */
public final class hul implements hth {
    private final hrc b;
    private final Observable<String> c;
    private final RxResolver d;

    public hul(Observable<String> observable, RxResolver rxResolver, hrc hrc) {
        this.c = observable;
        this.d = rxResolver;
        this.b = hrc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(vmm vmm) {
        Show[] showArr = (Show[]) vmm.getItems();
        ArrayList arrayList = new ArrayList(showArr.length);
        for (Show show : showArr) {
            hrc hrc = this.b;
            hup hup = new hup(show.getUri());
            hup.a = ActionType.BROWSABLE;
            hup.d = hrc.a.a(show.getImageUri());
            hup a = hup.a(new gqn().b(1).a);
            a.f = (!TextUtils.isEmpty(show.getImageUri()) ? Uri.parse(show.getImageUri()) : Uri.EMPTY).toString();
            a.b = show.getTitle();
            arrayList.add(a.b());
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.c.c((Function<? super T, ? extends R>) new $$Lambda$pMlSnqD67jNNxodlV2FaRQKRQkw<Object,Object>(this)).h($$Lambda$6fG9mh0953e8QivcVi0jLNoXDmc.INSTANCE).h().f(new $$Lambda$hul$NhLr1CovdRq1gQfLneZalmYxp1U(this));
    }

    /* access modifiers changed from: 0000 */
    public final iqz a(String str) {
        iqz iqz = new iqz(this.d, str);
        SortOption sortOption = new SortOption("latestPublishedEpisodeDate", true);
        sortOption.a(true);
        iqz.c = sortOption;
        iqz.a = MediaType.VIDEO;
        return iqz;
    }
}
