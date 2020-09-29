package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Album;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.AlbumItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Albums;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Artist;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.ArtistItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Artists;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Image;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.MediaBrowserItemConvertible;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.PlaylistItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Playlists;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.TrackItem;
import com.spotify.mobile.android.service.media.search.WebApiSearchModel.Tracks;
import java.util.List;

/* renamed from: hrp reason: default package */
public final class hrp {
    public static MediaBrowserItem[] a(Albums albums, Bundle bundle) {
        return a(albums.getItems(), bundle);
    }

    private static MediaBrowserItem a(AlbumItem albumItem, Bundle bundle) {
        hpa hpa = new hpa(a(Uri.parse(albumItem.getUri())));
        hpa.a = ActionType.PLAYABLE;
        hpa.b = fax.b(albumItem.getName());
        List artists = albumItem.getArtists();
        if (artists == null || artists.isEmpty()) {
            hpa.c = "";
        } else {
            hpa.c = fax.b(((Artist) artists.get(0)).getName());
        }
        List images = albumItem.getImages();
        if (images != null && !images.isEmpty()) {
            hpa.d = Uri.parse(((Image) images.get(0)).getUrl());
        }
        hpa.a(bundle);
        return hpa.b();
    }

    private static MediaBrowserItem a(ArtistItem artistItem, Bundle bundle) {
        hpa hpa = new hpa(a(Uri.parse(artistItem.getUri())));
        hpa.a = ActionType.PLAYABLE;
        hpa.b = fax.b(artistItem.getName());
        hpa.c = "";
        List images = artistItem.getImages();
        if (images != null && !images.isEmpty()) {
            hpa.d = Uri.parse(((Image) images.get(0)).getUrl());
        }
        hpa.a(bundle);
        return hpa.b();
    }

    public static MediaBrowserItem[] a(Artists artists, Bundle bundle) {
        return a(artists.getItems(), bundle);
    }

    private static MediaBrowserItem a(PlaylistItem playlistItem, Bundle bundle) {
        hpa hpa = new hpa(a(Uri.parse(playlistItem.getUri())));
        hpa.a = ActionType.PLAYABLE;
        hpa.b = fax.b(playlistItem.getName());
        hpa.c = "";
        List images = playlistItem.getImages();
        if (images != null && !images.isEmpty()) {
            hpa.d = Uri.parse(((Image) images.get(0)).getUrl());
        }
        hpa.a(bundle);
        return hpa.b();
    }

    public static MediaBrowserItem[] a(Playlists playlists, Bundle bundle) {
        return a(playlists.getItems(), bundle);
    }

    private static MediaBrowserItem a(TrackItem trackItem, Bundle bundle) {
        hpa hpa = new hpa(a(Uri.parse(trackItem.getUri())));
        hpa.a = ActionType.PLAYABLE;
        hpa.b = fax.b(trackItem.getName());
        List artists = trackItem.getArtists();
        if (artists == null || artists.isEmpty()) {
            hpa.c = "";
        } else {
            hpa.c = fax.b(((Artist) artists.get(0)).getName());
        }
        Album album = trackItem.getAlbum();
        if (album != null) {
            Image image = album.getImage();
            if (image != null) {
                hpa.d = Uri.parse(image.getUrl());
            }
        }
        hpa.a(bundle);
        return hpa.b();
    }

    public static MediaBrowserItem[] a(Tracks tracks, Bundle bundle) {
        return a(tracks.getItems(), bundle);
    }

    private static MediaBrowserItem[] a(List<? extends MediaBrowserItemConvertible> list, Bundle bundle) {
        if (list == null) {
            return new MediaBrowserItem[0];
        }
        MediaBrowserItem[] mediaBrowserItemArr = new MediaBrowserItem[list.size()];
        for (int i = 0; i < list.size(); i++) {
            MediaBrowserItemConvertible mediaBrowserItemConvertible = (MediaBrowserItemConvertible) list.get(i);
            if (mediaBrowserItemConvertible instanceof AlbumItem) {
                mediaBrowserItemArr[i] = a((AlbumItem) mediaBrowserItemConvertible, bundle);
            } else if (mediaBrowserItemConvertible instanceof ArtistItem) {
                mediaBrowserItemArr[i] = a((ArtistItem) mediaBrowserItemConvertible, bundle);
            } else if (mediaBrowserItemConvertible instanceof PlaylistItem) {
                mediaBrowserItemArr[i] = a((PlaylistItem) mediaBrowserItemConvertible, bundle);
            } else if (mediaBrowserItemConvertible instanceof TrackItem) {
                mediaBrowserItemArr[i] = a((TrackItem) mediaBrowserItemConvertible, bundle);
            }
        }
        return mediaBrowserItemArr;
    }

    private static Uri a(Uri uri) {
        return uri != null ? uri : Uri.EMPTY;
    }
}
