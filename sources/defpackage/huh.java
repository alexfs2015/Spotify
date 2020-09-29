package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: huh reason: default package */
public final class huh implements hth {
    private final Context b;
    private final hgz c;
    private final irb d;
    private final Observable<String> e;

    public huh(Context context, hgz hgz, irc irc, Observable<String> observable) {
        this.b = context;
        this.c = hgz;
        this.d = irc.a();
        this.e = observable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(String str, Boolean bool, iri iri) {
        ArrayList arrayList = new ArrayList(6);
        Context context = this.b;
        Bundle bundle = new gqn().b(1).a;
        hup hup = new hup("com.spotify.your-playlists");
        hup.a = ActionType.BROWSABLE;
        hup.b = context.getString(R.string.collection_start_playlists_title);
        hup.d = gcd.a(context, R.drawable.mediaservice_playlists);
        hup.g = true;
        arrayList.add(hup.a(bundle).b());
        String h = jva.g(str).h();
        if (((vlf[]) iri.getItems()).length > 0 && h != null) {
            Context context2 = this.b;
            hup hup2 = new hup(h);
            hup2.a = ActionType.PLAYABLE;
            hup2.d = gcd.a(context2, R.drawable.mediaservice_songs);
            hup2.b = context2.getString(R.string.collection_start_songs_title);
            hup2.g = false;
            arrayList.add(hup2.b());
        }
        Context context3 = this.b;
        Bundle bundle2 = new gqn().b(1).a;
        hup hup3 = new hup("com.spotify.your-albums");
        hup3.a = ActionType.BROWSABLE;
        hup3.b = context3.getString(R.string.collection_start_albums_title);
        hup3.d = gcd.a(context3, R.drawable.mediaservice_albums);
        hup3.g = true;
        arrayList.add(hup3.a(bundle2).b());
        Context context4 = this.b;
        Bundle bundle3 = new gqn().b(1).a;
        hup hup4 = new hup("com.spotify.your-artists");
        hup4.a = ActionType.BROWSABLE;
        hup4.b = context4.getString(R.string.collection_start_artists_title);
        hup4.d = gcd.a(context4, R.drawable.mediaservice_artists);
        hup4.g = true;
        arrayList.add(hup4.a(bundle3).b());
        if (bool.booleanValue()) {
            Context context5 = this.b;
            Bundle bundle4 = new gqn().b(1).a;
            hup hup5 = new hup("com.spotify.your-podcasts");
            hup5.a = ActionType.BROWSABLE;
            hup5.b = context5.getString(R.string.collection_start_shows_title_podcasts_only);
            hup5.d = gcd.a(context5, R.drawable.mediaservice_podcasts);
            hup5.g = true;
            arrayList.add(hup5.a(bundle4).b());
        }
        return arrayList;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return Observable.a((ObservableSource<? extends T1>) this.e, (ObservableSource<? extends T2>) this.c.b("shows-collection").c((Function<? super T, ? extends R>) $$Lambda$68fg9X2KEYS64UwVfrChQjCGWc.INSTANCE), (ObservableSource<? extends T3>) this.d.a(false, !z, false).a(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$huh$EiO5WC0mjEQd4yjjr9FeCUOOmkk<Object,Object,Object,Object>(this)).c(1).h();
    }
}
