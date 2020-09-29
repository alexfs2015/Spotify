package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: hrv reason: default package */
public final class hrv implements hqx {
    private final Context b;
    private final hed c;
    private final hth d;
    private final ioo e;
    private final wud<String> f;

    public hrv(Context context, hed hed, hth hth, ioo ioo, wud<String> wud) {
        this.b = context;
        this.c = hed;
        this.d = hth;
        this.e = ioo;
        this.f = wud;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        return vun.a(wud.a(this.f, this.c.a("shows-collection").f(new $$Lambda$57qjxmYDaaOcXK34YDXTPaU2AA("1")), vun.a((ObservableSource<T>) this.e.a().c((Function<? super T, ? extends R>) $$Lambda$hrv$sN172ini1Nn6gWcfo4FZuRXAt8Q.INSTANCE), BackpressureStrategy.LATEST), (wuv<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$hrv$Ksq0QLTwcXjE5Lgg3b326rxbUC0<Object,Object,Object,Object>(this)).a(1).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List a(String str, Boolean bool, Integer num) {
        ArrayList arrayList = new ArrayList(6);
        Context context = this.b;
        Bundle bundle = new gox().b(1).a;
        hpa hpa = new hpa(ViewUris.bd.toString());
        hpa.b = jsd.a(context.getString(R.string.collection_playlists_page_indicator), Locale.getDefault());
        hpa.a = ActionType.BROWSABLE;
        hpa.d = gbf.a(context, R.drawable.mediaservice_playlists);
        hpa.f = true;
        arrayList.add(hpa.a(bundle).b());
        String h = jst.g(str).h();
        if (num.intValue() > 0 && h != null) {
            Context context2 = this.b;
            hpa hpa2 = new hpa(h);
            hpa2.a = ActionType.PLAYABLE;
            hpa2.d = gbf.a(context2, R.drawable.mediaservice_songs);
            hpa2.b = context2.getString(R.string.collection_start_songs_title);
            hpa2.f = false;
            arrayList.add(hpa2.b());
        }
        Context context3 = this.b;
        Bundle bundle2 = new gox().b(1).a;
        hpa hpa3 = new hpa("com.spotify.your-albums");
        hpa3.a = ActionType.BROWSABLE;
        hpa3.b = context3.getString(R.string.collection_start_albums_title);
        hpa3.d = gbf.a(context3, R.drawable.mediaservice_albums);
        hpa3.f = true;
        arrayList.add(hpa3.a(bundle2).b());
        Context context4 = this.b;
        Bundle bundle3 = new gox().b(1).a;
        hpa hpa4 = new hpa("com.spotify.your-artists");
        hpa4.a = ActionType.BROWSABLE;
        hpa4.b = context4.getString(R.string.collection_start_artists_title);
        hpa4.d = gbf.a(context4, R.drawable.mediaservice_artists);
        hpa4.f = true;
        arrayList.add(hpa4.a(bundle3).b());
        if (bool.booleanValue() && this.d.a.a()) {
            Context context5 = this.b;
            Bundle bundle4 = new gox().b(1).a;
            hpa hpa5 = new hpa("spotify:collection:podcasts");
            hpa5.a = ActionType.BROWSABLE;
            hpa5.d = gbf.a(context5, R.drawable.mediaservice_podcasts);
            hpa5.b = context5.getString(R.string.collection_start_shows_title_podcasts_only);
            hpa5.f = true;
            arrayList.add(hpa5.a(bundle4).b());
        }
        return arrayList;
    }
}
