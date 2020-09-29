package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.spotify.music.features.assistedcuration.loader.GenresLoader.GenreTrack;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.ResponseItem;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.ResponseTrack;
import com.spotify.music.features.assistedcuration.loader.RecsLoader.RecsTrack;
import com.spotify.playlist.models.Covers.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lqv reason: default package */
public abstract class lqv implements Parcelable {
    public static final Creator<lqv> i = new Creator<lqv>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return (lqv[]) lqw.CREATOR.newArray(i);
        }

        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (lqv) lqw.CREATOR.createFromParcel(parcel);
        }
    };

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public abstract String e();

    public abstract String f();

    public abstract List<String> g();

    public abstract String h();

    public static lqv a(uzc uzc) {
        List list;
        uyq album = uzc.getAlbum();
        List artists = uzc.getArtists();
        String str = "";
        String name = album != null ? album.getName() : str;
        boolean z = artists != null && !artists.isEmpty();
        String name2 = z ? ((uyr) artists.get(0)).getName() : str;
        AnonymousClass1 r0 = new Function<uyr, String>() {
            public final /* synthetic */ Object apply(Object obj) {
                return ((uyr) obj).getName();
            }
        };
        if (z) {
            list = Lists.a(artists, r0);
        } else {
            list = Collections.emptyList();
        }
        List list2 = list;
        String previewId = uzc.previewId();
        lqw lqw = new lqw(uzc.getUri(), uzc.getName(), previewId != null ? previewId : str, uzc.isExplicit(), name, name2, list2, uzc.getImageUri(Size.NORMAL));
        return lqw;
    }

    public static List<lqv> a(List<uzc> list) {
        ArrayList a = Lists.a();
        for (uzc a2 : list) {
            a.add(a(a2));
        }
        return a;
    }

    public static List<lqv> b(List<RecsTrack> list) {
        ArrayList a = Lists.a();
        for (RecsTrack recsTrack : list) {
            lqw lqw = new lqw(recsTrack.getUri(), recsTrack.getName(), recsTrack.getPreviewId(), recsTrack.isExplicit(), recsTrack.getAlbumName(), recsTrack.getArtistName(), recsTrack.getArtistNames(), recsTrack.getImage());
            a.add(lqw);
        }
        return a;
    }

    public static List<lqv> c(List<GenreTrack> list) {
        ArrayList a = Lists.a();
        for (GenreTrack genreTrack : list) {
            lqw lqw = new lqw(genreTrack.getUri(), genreTrack.getName(), genreTrack.getPreviewId(), genreTrack.isExplicit(), genreTrack.getAlbumName(), genreTrack.getArtistName(), genreTrack.getArtistNames(), genreTrack.getImageUri());
            a.add(lqw);
        }
        return a;
    }

    public static List<lqv> d(List<ResponseTrack> list) {
        List list2;
        ArrayList a = Lists.a();
        for (ResponseTrack responseTrack : list) {
            ResponseItem album = responseTrack.getAlbum();
            List artists = responseTrack.getArtists();
            boolean z = !artists.isEmpty();
            String name = z ? ((ResponseItem) artists.get(0)).getName() : "";
            AnonymousClass2 r5 = new Function<ResponseItem, String>() {
                public final /* synthetic */ Object apply(Object obj) {
                    return ((ResponseItem) obj).getName();
                }
            };
            if (z) {
                list2 = Lists.a(artists, r5);
            } else {
                list2 = Collections.emptyList();
            }
            lqw lqw = new lqw(responseTrack.getUri(), responseTrack.getName(), responseTrack.getPreviewId(), responseTrack.isExplicit(), album.getName(), name, list2, responseTrack.getImage());
            a.add(lqw);
        }
        return a;
    }
}
