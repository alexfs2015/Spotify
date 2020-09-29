package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;
import com.spotify.music.libs.album.model.AlbumType;

/* renamed from: lof reason: default package */
public final class lof {
    private static final ImmutableMap<AlbumType, ho<Integer, Integer>> a = ImmutableMap.g().b(AlbumType.ALBUM, new ho(Integer.valueOf(R.string.album_header_album_by), Integer.valueOf(R.string.album_header_album_by_format))).b(AlbumType.SINGLE, new ho(Integer.valueOf(R.string.album_header_single_by), Integer.valueOf(R.string.album_header_single_by_format))).b(AlbumType.COMPILATION, new ho(Integer.valueOf(R.string.album_header_compilation_by), Integer.valueOf(R.string.album_header_compilation_by_format))).b(AlbumType.EP, new ho(Integer.valueOf(R.string.album_header_ep_by), Integer.valueOf(R.string.album_header_ep_by_format))).b(AlbumType.AUDIOBOOK, new ho(Integer.valueOf(R.string.album_header_audiobook_by), Integer.valueOf(R.string.album_header_audiobook_by_format))).b(AlbumType.PODCAST, new ho(Integer.valueOf(R.string.album_header_podcast_by), Integer.valueOf(R.string.album_header_podcast_by_format))).b();

    public static int a(AlbumType albumType) {
        return ((Integer) fay.a(((ho) a.get(albumType)).a)).intValue();
    }

    public static int b(AlbumType albumType) {
        return ((Integer) fay.a(((ho) a.get(albumType)).b)).intValue();
    }
}
