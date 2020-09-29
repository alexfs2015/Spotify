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

/* renamed from: vmo reason: default package */
public final class vmo {
    public static ProtoEpisodeCollectionState a(vkv vkv) {
        if (vkv == null) {
            return null;
        }
        return (ProtoEpisodeCollectionState) ProtoEpisodeCollectionState.k().a(vkv.h()).b(vkv.j()).g();
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

    public static ProtoUnplayedEpisodesResponse a(vlb<vkv> vlb) {
        ArrayList arrayList = new ArrayList(((vkv[]) vlb.getItems()).length);
        for (vkv d : (vkv[]) vlb.getItems()) {
            arrayList.add(d(d));
        }
        return (ProtoUnplayedEpisodesResponse) ProtoUnplayedEpisodesResponse.l().a(vlb.getUnfilteredLength()).b(vlb.getUnrangedLength()).a(vlb.isLoading()).a((Iterable<? extends ProtoUnplayedEpisodesRequestItem>) arrayList).g();
    }

    public static <T> T a(T t, T t2) {
        return t != null ? t : t2;
    }

    public static ProtoEpisodePlayState b(vkv vkv) {
        if (vkv == null) {
            return null;
        }
        return (ProtoEpisodePlayState) ProtoEpisodePlayState.l().a(vkv.k()).a(vkv.n() != null ? vkv.n().intValue() : 0).b(vkv.o()).g();
    }

    public static ProtoShowCollectionState b(Show show) {
        if (show == null) {
            return null;
        }
        return (ProtoShowCollectionState) ProtoShowCollectionState.k().a(show.g()).g();
    }

    public static ProtoEpisodeMetadata c(vkv vkv) {
        if (vkv == null) {
            return null;
        }
        String str = "";
        return (ProtoEpisodeMetadata) ProtoEpisodeMetadata.s().a(vkv.l()).a(a(vkv.b())).d((String) a(vkv.d(), str)).b(a(vkv.c())).a(vkv.m()).a((String) a(vkv.getUri(), str)).c((String) a(vkv.e(), str)).f((String) a(vkv.f(), str)).b((String) a(vkv.a(), str)).a((long) vkv.s()).a(d(vkv.t())).b(vkv.w().ordinal()).b(vkv.r()).c(vkv.i()).e(str).g();
    }

    public static ProtoShowPlayState c(Show show) {
        if (show == null) {
            return null;
        }
        return (ProtoShowPlayState) ProtoShowPlayState.k().a((String) a(show.d(), "")).g();
    }

    private static ProtoEpisodeShowMetadata d(Show show) {
        if (show == null) {
            return null;
        }
        String str = "";
        return (ProtoEpisodeShowMetadata) ProtoEpisodeShowMetadata.m().a((String) a(show.getUri(), str)).b((String) a(show.a(), str)).c((String) a(show.c(), str)).a(a(show.b())).g();
    }

    private static ProtoUnplayedEpisodesRequestItem d(vkv vkv) {
        return (ProtoUnplayedEpisodesRequestItem) ProtoUnplayedEpisodesRequestItem.t().a(a(vkv)).a(c(vkv)).a(b(vkv)).a((String) a(vkv.getHeader(), "")).g();
    }
}
