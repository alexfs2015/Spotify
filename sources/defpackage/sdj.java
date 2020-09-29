package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Album;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.AlbumItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Artist;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.ArtistItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.PlaylistItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Response;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.TrackItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Tracks;
import com.spotify.music.R;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.List;

/* renamed from: sdj reason: default package */
public final class sdj {
    private final String a;
    private final hpt b;

    public sdj(String str, hpt hpt) {
        this.a = str;
        this.b = hpt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.b.f().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Response response) {
        if (response.hasTracks() || response.hasAlbums() || response.hasArtists() || response.hasPlaylists()) {
            StringBuilder sb = new StringBuilder("spotify:media-service:search:");
            sb.append(Uri.encode(str));
            String sb2 = sb.toString();
            if (response.hasTracks()) {
                this.b.d().a(PlayerContext.create(sb2, a(response.getTracks())), (PlayOptions) null, this.a, (ActionCallback) null);
            } else if (response.hasArtists()) {
                this.b.d().a(((ArtistItem) response.getArtists().getItems().get(0)).getUri(), (PlayOptions) null, this.a, (ActionCallback) null);
            } else if (response.hasAlbums()) {
                this.b.d().a(((AlbumItem) response.getAlbums().getItems().get(0)).getUri(), (PlayOptions) null, this.a, (ActionCallback) null);
            } else {
                this.b.d().a(((PlaylistItem) response.getPlaylists().getItems().get(0)).getUri(), (PlayOptions) null, this.a, (ActionCallback) null);
            }
        } else {
            this.b.f().a(R.string.media_service_voice_search_failed);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.b.f().a(R.string.media_service_voice_search_failed);
    }

    private static PlayerTrack[] a(Tracks tracks) {
        List items = tracks.getItems();
        PlayerTrack[] playerTrackArr = new PlayerTrack[items.size()];
        for (int i = 0; i < items.size(); i++) {
            TrackItem trackItem = (TrackItem) items.get(i);
            List artists = trackItem.getArtists();
            String str = "";
            String b2 = (artists == null || artists.isEmpty()) ? str : fbo.b(((Artist) artists.get(0)).getUri());
            Album album = trackItem.getAlbum();
            if (album != null) {
                str = fbo.b(album.getUri());
            }
            playerTrackArr[i] = PlayerTrack.create(trackItem.getUri(), str, b2);
        }
        return playerTrackArr;
    }

    public final xig a(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(str)) {
            this.b.d().d(this.a, null);
            return xig.a();
        }
        this.b.d().a(this.a);
        return xig.a(wit.a((ObservableSource<T>) this.b.f().a(str, 0, 50, this.a, bundle2).a(1).d(), BackpressureStrategy.BUFFER).a((xir) new $$Lambda$sdj$DGqv6GtV7qc8UfbJTEHmi9niFU(this)).a(1).b((xis<? super T>) new $$Lambda$sdj$qgkqje_vRN87_WIJymbSG4XEdU<Object>(this, str)).a((xis<? super Throwable>) new $$Lambda$sdj$tl5LTVRGXRR8olVNJxh6QLCubVg<Object>(this)));
    }
}
