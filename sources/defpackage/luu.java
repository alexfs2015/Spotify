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

/* renamed from: luu reason: default package */
public abstract class luu implements Parcelable {
    public static final Creator<luu> i = new Creator<luu>() {
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return (luu) luv.CREATOR.createFromParcel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return (luu[]) luv.CREATOR.newArray(i);
        }
    };

    public static List<luu> a(List<vlf> list) {
        ArrayList a = Lists.a();
        for (vlf a2 : list) {
            a.add(a(a2));
        }
        return a;
    }

    public static luu a(vlf vlf) {
        vkt album = vlf.getAlbum();
        List artists = vlf.getArtists();
        String str = "";
        String name = album != null ? album.getName() : str;
        boolean z = artists != null && !artists.isEmpty();
        String name2 = z ? ((vku) artists.get(0)).getName() : str;
        List a = z ? Lists.a(artists, new Function<vku, String>() {
            public final /* synthetic */ Object apply(Object obj) {
                return ((vku) obj).getName();
            }
        }) : Collections.emptyList();
        String previewId = vlf.previewId();
        luv luv = new luv(vlf.getUri(), vlf.getName(), previewId != null ? previewId : str, vlf.isExplicit(), name, name2, a, vlf.getImageUri(Size.NORMAL));
        return luv;
    }

    public static List<luu> b(List<RecsTrack> list) {
        ArrayList a = Lists.a();
        for (RecsTrack recsTrack : list) {
            luv luv = new luv(recsTrack.getUri(), recsTrack.getName(), recsTrack.getPreviewId(), recsTrack.isExplicit(), recsTrack.getAlbumName(), recsTrack.getArtistName(), recsTrack.getArtistNames(), recsTrack.getImage());
            a.add(luv);
        }
        return a;
    }

    public static List<luu> c(List<GenreTrack> list) {
        ArrayList a = Lists.a();
        for (GenreTrack genreTrack : list) {
            luv luv = new luv(genreTrack.getUri(), genreTrack.getName(), genreTrack.getPreviewId(), genreTrack.isExplicit(), genreTrack.getAlbumName(), genreTrack.getArtistName(), genreTrack.getArtistNames(), genreTrack.getImageUri());
            a.add(luv);
        }
        return a;
    }

    public static List<luu> d(List<ResponseTrack> list) {
        ArrayList a = Lists.a();
        for (ResponseTrack responseTrack : list) {
            ResponseItem album = responseTrack.getAlbum();
            List artists = responseTrack.getArtists();
            boolean z = !artists.isEmpty();
            luv luv = new luv(responseTrack.getUri(), responseTrack.getName(), responseTrack.getPreviewId(), responseTrack.isExplicit(), album.getName(), z ? ((ResponseItem) artists.get(0)).getName() : "", z ? Lists.a(artists, new Function<ResponseItem, String>() {
                public final /* synthetic */ Object apply(Object obj) {
                    return ((ResponseItem) obj).getName();
                }
            }) : Collections.emptyList(), responseTrack.getImage());
            a.add(luv);
        }
        return a;
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public abstract String e();

    public abstract String f();

    public abstract List<String> g();

    public abstract String h();
}
