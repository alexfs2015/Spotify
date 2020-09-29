package defpackage;

import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest.ProtoUnplayedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest.ProtoUnplayedEpisodesResponse;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: vaa reason: default package */
public final class vaa {
    public static <T> T a(T t, T t2) {
        return t != null ? t : t2;
    }

    public static ProtoUnplayedEpisodesResponse a(uyy<uys> uyy) {
        ArrayList arrayList = new ArrayList(((uys[]) uyy.getItems()).length);
        for (uys d : (uys[]) uyy.getItems()) {
            arrayList.add(d(d));
        }
        return (ProtoUnplayedEpisodesResponse) ProtoUnplayedEpisodesResponse.l().a(uyy.getUnfilteredLength()).b(uyy.getUnrangedLength()).a(uyy.isLoading()).a((Iterable<? extends ProtoUnplayedEpisodesRequestItem>) arrayList).g();
    }

    private static ProtoImageGroup a(Covers covers) {
        if (covers == null) {
            return null;
        }
        String str = "";
        return (ProtoImageGroup) ProtoImageGroup.k().a((String) a(covers.getUri(), str)).b((String) a(covers.getSmallUri(), str)).c((String) a(covers.getLargeUri(), str)).d((String) a(covers.getXlargeUri(), str)).g();
    }

    public static ProtoShowMetadata a(Show show) {
        if (show == null) {
            return null;
        }
        String str = "";
        return (ProtoShowMetadata) ProtoShowMetadata.n().a((String) a(show.getUri(), str)).b((String) a(show.a(), str)).f(show.j().toString().toLowerCase(Locale.US)).a(a(show.b())).c((String) a(show.f(), str)).c(show.k().ordinal()).d((String) a(show.c(), str)).a(false).a((Iterable<String>) new ArrayList<String>(0)).e(str).b(0).a(0).g();
    }

    private static ProtoEpisodeShowMetadata d(Show show) {
        if (show == null) {
            return null;
        }
        String str = "";
        return (ProtoEpisodeShowMetadata) ProtoEpisodeShowMetadata.m().a((String) a(show.getUri(), str)).b((String) a(show.a(), str)).c((String) a(show.c(), str)).a(a(show.b())).g();
    }

    public static ProtoShowCollectionState b(Show show) {
        if (show == null) {
            return null;
        }
        return (ProtoShowCollectionState) ProtoShowCollectionState.k().a(show.g()).g();
    }

    public static ProtoShowPlayState c(Show show) {
        if (show == null) {
            return null;
        }
        return (ProtoShowPlayState) ProtoShowPlayState.k().a((String) a(show.d(), "")).g();
    }

    public static ProtoEpisodeCollectionState a(uys uys) {
        if (uys == null) {
            return null;
        }
        return (ProtoEpisodeCollectionState) ProtoEpisodeCollectionState.k().a(uys.h()).b(uys.j()).g();
    }

    public static ProtoEpisodePlayState b(uys uys) {
        if (uys == null) {
            return null;
        }
        return (ProtoEpisodePlayState) ProtoEpisodePlayState.l().a(uys.k()).a(uys.n() != null ? uys.n().intValue() : 0).b(uys.o()).g();
    }

    public static ProtoEpisodeMetadata c(uys uys) {
        if (uys == null) {
            return null;
        }
        String str = "";
        return (ProtoEpisodeMetadata) ProtoEpisodeMetadata.s().a(uys.l()).a(a(uys.b())).d((String) a(uys.d(), str)).b(a(uys.c())).a(uys.m()).a((String) a(uys.getUri(), str)).c((String) a(uys.e(), str)).f((String) a(uys.f(), str)).b((String) a(uys.a(), str)).a((long) uys.s()).a(d(uys.t())).b(uys.w().ordinal()).b(uys.r()).c(uys.i()).e(str).g();
    }

    private static ProtoUnplayedEpisodesRequestItem d(uys uys) {
        return (ProtoUnplayedEpisodesRequestItem) ProtoUnplayedEpisodesRequestItem.t().a(a(uys)).a(c(uys)).a(b(uys)).a((String) a(uys.getHeader(), "")).g();
    }
}
