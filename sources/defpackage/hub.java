package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
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

/* renamed from: hub reason: default package */
public final class hub {
    private static Uri a(Uri uri) {
        return uri != null ? uri : Uri.EMPTY;
    }

    private static MediaBrowserItem a(AlbumItem albumItem, Bundle bundle) {
        hup hup = new hup(a(Uri.parse(albumItem.getUri())));
        hup.a = ActionType.PLAYABLE;
        hup.b = fbo.b(albumItem.getName());
        List artists = albumItem.getArtists();
        if (artists == null || artists.isEmpty()) {
            hup.c = "";
        } else {
            hup.c = fbo.b(((Artist) artists.get(0)).getName());
        }
        List images = albumItem.getImages();
        if (images != null && !images.isEmpty()) {
            hup.d = Uri.parse(((Image) images.get(0)).getUrl());
        }
        hup.a(bundle);
        return hup.b();
    }

    private static MediaBrowserItem a(ArtistItem artistItem, Bundle bundle) {
        hup hup = new hup(a(Uri.parse(artistItem.getUri())));
        hup.a = ActionType.PLAYABLE;
        hup.b = fbo.b(artistItem.getName());
        hup.c = "";
        List images = artistItem.getImages();
        if (images != null && !images.isEmpty()) {
            hup.d = Uri.parse(((Image) images.get(0)).getUrl());
        }
        hup.a(bundle);
        return hup.b();
    }

    private static MediaBrowserItem a(PlaylistItem playlistItem, Bundle bundle) {
        hup hup = new hup(a(Uri.parse(playlistItem.getUri())));
        hup.a = ActionType.PLAYABLE;
        hup.b = fbo.b(playlistItem.getName());
        hup.c = "";
        List images = playlistItem.getImages();
        if (images != null && !images.isEmpty()) {
            hup.d = Uri.parse(((Image) images.get(0)).getUrl());
        }
        hup.a(bundle);
        return hup.b();
    }

    private static MediaBrowserItem a(TrackItem trackItem, Bundle bundle) {
        hup hup = new hup(a(Uri.parse(trackItem.getUri())));
        hup.a = ActionType.PLAYABLE;
        hup.b = fbo.b(trackItem.getName());
        List artists = trackItem.getArtists();
        if (artists == null || artists.isEmpty()) {
            hup.c = "";
        } else {
            hup.c = fbo.b(((Artist) artists.get(0)).getName());
        }
        Album album = trackItem.getAlbum();
        if (album != null) {
            Image image = album.getImage();
            if (image != null) {
                hup.d = Uri.parse(image.getUrl());
            }
        }
        hup.a(bundle);
        return hup.b();
    }

    public static MediaBrowserItem[] a(Albums albums, Bundle bundle) {
        return a(albums.getItems(), bundle);
    }

    public static MediaBrowserItem[] a(Artists artists, Bundle bundle) {
        return a(artists.getItems(), bundle);
    }

    public static MediaBrowserItem[] a(Playlists playlists, Bundle bundle) {
        return a(playlists.getItems(), bundle);
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
}
