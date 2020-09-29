package defpackage;

import android.content.Context;
import android.net.Uri.Builder;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.bixbyhomecards.apis.RecommendedPlaylists.Image;
import com.spotify.mobile.android.spotlets.bixbyhomecards.apis.RecommendedPlaylists.PlaylistItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.apis.RecommendedPlaylists.Response;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.music.R;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Queue;

/* renamed from: ikx reason: default package */
public final class ikx {
    private static final ThreadLocal<SimpleDateFormat> a = new ThreadLocal<SimpleDateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    };
    private final gky<Response> b;
    private final String c;
    private final wug d;

    public ikx(Context context, gky<Response> gky, wug wug) {
        this.b = gky;
        this.c = context.getString(R.string.bixby_home_card_recommended_for_you);
        this.d = wug;
    }

    public final wud<Queue<ContentItem>> a() {
        wud c2 = this.b.resolve(RequestBuilder.get(new Builder().scheme("hm").authority("webapi-browse").path("v1/browse/featured-playlists").appendQueryParameter("timestamp", ((SimpleDateFormat) a.get()).format(new Date())).build().toString()).build()).f(new $$Lambda$ikx$mR045BJaHkAugnqnPeJ_9Ug55A(this)).c();
        hew hew = new hew(20, 3, 1000, this.d);
        return c2.a((c<? super T, ? extends R>) hew);
    }

    /* access modifiers changed from: private */
    public Queue<ContentItem> a(Response response) {
        List<PlaylistItem> items = response.getPlaylists().getItems();
        ArrayDeque arrayDeque = new ArrayDeque(items.size());
        for (PlaylistItem playlistItem : items) {
            Image image = playlistItem.getImage();
            StringBuilder sb = new StringBuilder();
            sb.append(playlistItem.getUri());
            sb.append("/play");
            String sb2 = sb.toString();
            if (image != null) {
                arrayDeque.add(ContentItem.create(playlistItem.getUri(), playlistItem.getName(), this.c, null, image.getUrl(), sb2));
            }
        }
        return arrayDeque;
    }
}
