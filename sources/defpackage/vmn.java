package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateEpisodeItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest.ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata.ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest.ProtoOfflinedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest.ProtoOfflinedEpisodesResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.AuxiliarySections;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoOnlineData;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoShowRequestHeader;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoShowRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest.ProtoShowResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowsRequest.ProtoShowsRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowsRequest.ProtoShowsResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState.ProtoShowPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest.Episode;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest.ProtoUnplayedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest.ProtoUnplayedEpisodesResponse;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.ConsumptionOrder;
import com.spotify.playlist.models.Show.MediaType;
import com.spotify.podcastextensions.proto.Podcastextensions.PodcastTopic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vmn reason: default package */
public final class vmn {
    private static Covers a(final ProtoImageGroup protoImageGroup) {
        if (protoImageGroup == null) {
            return null;
        }
        return new Covers() {
            public final String getImageUri(Size size) {
                return vlh.a(this, size);
            }

            public final String getLargeUri() {
                return (String) vmn.a(protoImageGroup.f, "");
            }

            public final String getSmallUri() {
                return (String) vmn.a(protoImageGroup.e, "");
            }

            public final String getUri() {
                return (String) vmn.a(protoImageGroup.d, "");
            }

            public final String getXlargeUri() {
                return (String) vmn.a(protoImageGroup.g, "");
            }
        };
    }

    private static Show a(final ProtoEpisodeShowMetadata protoEpisodeShowMetadata) {
        ProtoImageGroup protoImageGroup = null;
        if (protoEpisodeShowMetadata == null) {
            return null;
        }
        if (protoEpisodeShowMetadata.k()) {
            protoImageGroup = protoEpisodeShowMetadata.l();
        }
        final Covers a = a(protoImageGroup);
        return new Show() {
            public final String a() {
                return protoEpisodeShowMetadata.e;
            }

            public final Covers b() {
                return a;
            }

            public final String c() {
                return (String) vmn.a(protoEpisodeShowMetadata.f, "");
            }

            public final String d() {
                return "";
            }

            public final long e() {
                return -1;
            }

            public final String f() {
                return "";
            }

            public final boolean g() {
                return false;
            }

            public final String getHeader() {
                return null;
            }

            public final String getImageUri() {
                return getImageUri(Size.SMALL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String getTitle() {
                return a();
            }

            public final String getUri() {
                return protoEpisodeShowMetadata.d;
            }

            public final boolean h() {
                return false;
            }

            public final int i() {
                return 0;
            }

            public final boolean isHeader() {
                return false;
            }

            public final ConsumptionOrder j() {
                return ConsumptionOrder.UNKNOWN;
            }

            public final MediaType k() {
                return MediaType.UNKNOWN;
            }
        };
    }

    public static Show a(ProtoShowMetadata protoShowMetadata, ProtoShowCollectionState protoShowCollectionState, ProtoShowPlayState protoShowPlayState, int i, boolean z, long j) {
        ProtoShowMetadata protoShowMetadata2 = protoShowMetadata;
        ProtoImageGroup protoImageGroup = null;
        if (protoShowMetadata2 == null) {
            return null;
        }
        if (protoShowMetadata.k()) {
            protoImageGroup = protoShowMetadata.l();
        }
        final Covers a = a(protoImageGroup);
        final ConsumptionOrder a2 = vlh.a(protoShowMetadata2.h);
        final MediaType a3 = vlh.a(protoShowMetadata.m() ? protoShowMetadata2.i : -1);
        final ProtoShowMetadata protoShowMetadata3 = protoShowMetadata;
        final ProtoShowPlayState protoShowPlayState2 = protoShowPlayState;
        final long j2 = j;
        final ProtoShowCollectionState protoShowCollectionState2 = protoShowCollectionState;
        final boolean z2 = z;
        final int i2 = i;
        AnonymousClass11 r0 = new Show() {
            public final String a() {
                return protoShowMetadata3.e;
            }

            public final Covers b() {
                return a;
            }

            public final String c() {
                return (String) vmn.a(protoShowMetadata3.g, "");
            }

            public final String d() {
                ProtoShowPlayState protoShowPlayState = protoShowPlayState2;
                return protoShowPlayState == null ? "" : protoShowPlayState.d;
            }

            public final long e() {
                return j2;
            }

            public final String f() {
                return protoShowMetadata3.f;
            }

            public final boolean g() {
                ProtoShowCollectionState protoShowCollectionState = protoShowCollectionState2;
                return protoShowCollectionState != null && protoShowCollectionState.d;
            }

            public final String getHeader() {
                return null;
            }

            public final String getImageUri() {
                return getImageUri(Size.SMALL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String getTitle() {
                return a();
            }

            public final String getUri() {
                return protoShowMetadata3.d;
            }

            public final boolean h() {
                return z2;
            }

            public final int i() {
                return i2;
            }

            public final boolean isHeader() {
                return false;
            }

            public final ConsumptionOrder j() {
                return a2;
            }

            public final MediaType k() {
                return a3;
            }
        };
        return r0;
    }

    private static Show a(ProtoShowsRequestItem protoShowsRequestItem) {
        ProtoShowPlayState protoShowPlayState = null;
        ProtoShowMetadata l = protoShowsRequestItem.k() ? protoShowsRequestItem.l() : null;
        ProtoShowCollectionState n = protoShowsRequestItem.m() ? protoShowsRequestItem.n() : null;
        if (protoShowsRequestItem.o()) {
            protoShowPlayState = protoShowsRequestItem.p();
        }
        return (Show) fbp.a(a(l, n, protoShowPlayState, protoShowsRequestItem.d, protoShowsRequestItem.e, protoShowsRequestItem.f));
    }

    static /* synthetic */ Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(List list) {
        return list;
    }

    public static Map<String, vkv> a(ProtoDecorateResponse protoDecorateResponse) {
        if (protoDecorateResponse == null) {
            return null;
        }
        HashMap hashMap = new HashMap(protoDecorateResponse.k());
        for (ProtoDecorateEpisodeItem protoDecorateEpisodeItem : protoDecorateResponse.e) {
            hashMap.put(protoDecorateEpisodeItem.d, a(protoDecorateEpisodeItem.k() ? protoDecorateEpisodeItem.l() : null, protoDecorateEpisodeItem.o() ? protoDecorateEpisodeItem.p() : null, protoDecorateEpisodeItem.q() ? protoDecorateEpisodeItem.r() : null, protoDecorateEpisodeItem.m() ? protoDecorateEpisodeItem.n() : null, null));
        }
        return hashMap;
    }

    private static vkv a(ProtoEpisodeMetadata protoEpisodeMetadata, ProtoEpisodeOfflineState protoEpisodeOfflineState, ProtoEpisodePlayState protoEpisodePlayState, ProtoEpisodeCollectionState protoEpisodeCollectionState, String str) {
        ProtoEpisodeMetadata protoEpisodeMetadata2 = protoEpisodeMetadata;
        final HashMap hashMap = new HashMap(0);
        if (!fbo.a(str)) {
            final String str2 = str;
            return new vkv() {
                public final String a() {
                    return "";
                }

                public final Covers b() {
                    return null;
                }

                public final Covers c() {
                    return null;
                }

                public final String d() {
                    return "";
                }

                public final String e() {
                    return "";
                }

                public final String f() {
                    return "";
                }

                public final String g() {
                    return null;
                }

                public final String getHeader() {
                    return str2;
                }

                public final String getImageUri() {
                    return "";
                }

                public final String getImageUri(Size size) {
                    return "";
                }

                public final String getTargetUri() {
                    return getUri();
                }

                public final String getTitle() {
                    return "";
                }

                public final String getUri() {
                    return "";
                }

                public final boolean h() {
                    return false;
                }

                public final boolean i() {
                    return false;
                }

                public final boolean isHeader() {
                    return true;
                }

                public final boolean j() {
                    return false;
                }

                public final boolean k() {
                    return false;
                }

                public final boolean l() {
                    return false;
                }

                public final int m() {
                    return 0;
                }

                public final Integer n() {
                    return null;
                }

                public final boolean o() {
                    return false;
                }

                public final boolean p() {
                    return false;
                }

                public final Long q() {
                    return null;
                }

                public final boolean r() {
                    return false;
                }

                public final int s() {
                    return 0;
                }

                public final Show t() {
                    return null;
                }

                public final vli u() {
                    return new f();
                }

                public final Map<String, String> v() {
                    return hashMap;
                }

                public final MediaType w() {
                    return MediaType.UNKNOWN;
                }
            };
        }
        ProtoEpisodeShowMetadata protoEpisodeShowMetadata = null;
        if (protoEpisodeMetadata2 == null) {
            return null;
        }
        final Covers a = a(protoEpisodeMetadata.m() ? protoEpisodeMetadata.n() : null);
        Covers a2 = a(protoEpisodeMetadata.o() ? protoEpisodeMetadata.p() : null);
        if (protoEpisodeMetadata.k()) {
            protoEpisodeShowMetadata = protoEpisodeMetadata.l();
        }
        Show a3 = a(protoEpisodeShowMetadata);
        MediaType a4 = vlh.a(protoEpisodeMetadata.q() ? protoEpisodeMetadata2.k : -1);
        final Map a5 = vlh.a(a, a2, protoEpisodeMetadata2.e, protoEpisodeMetadata2.g, a3, a4);
        if (protoEpisodeMetadata.r()) {
            a5.put(Metadata.IS_BACKGROUNDABLE, String.valueOf(protoEpisodeMetadata2.l));
        }
        final ProtoEpisodeMetadata protoEpisodeMetadata3 = protoEpisodeMetadata;
        final Covers covers = a2;
        final ProtoEpisodeCollectionState protoEpisodeCollectionState2 = protoEpisodeCollectionState;
        final ProtoEpisodePlayState protoEpisodePlayState2 = protoEpisodePlayState;
        final Show show = a3;
        final ProtoEpisodeOfflineState protoEpisodeOfflineState2 = protoEpisodeOfflineState;
        final MediaType mediaType = a4;
        AnonymousClass4 r0 = new vkv() {
            public final String a() {
                return protoEpisodeMetadata3.e;
            }

            public final Covers b() {
                return a;
            }

            public final Covers c() {
                return covers;
            }

            public final String d() {
                return protoEpisodeMetadata3.h;
            }

            public final String e() {
                return (String) vmn.a(protoEpisodeMetadata3.g, "");
            }

            public final String f() {
                return (String) vmn.a(protoEpisodeMetadata3.m, "");
            }

            public final String g() {
                return protoEpisodeMetadata3.o;
            }

            public final String getHeader() {
                return "";
            }

            public final String getImageUri() {
                return getImageUri(Size.SMALL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String getTitle() {
                return a();
            }

            public final String getUri() {
                return protoEpisodeMetadata3.d;
            }

            public final boolean h() {
                ProtoEpisodeCollectionState protoEpisodeCollectionState = protoEpisodeCollectionState2;
                return protoEpisodeCollectionState != null && protoEpisodeCollectionState.d;
            }

            public final boolean i() {
                return protoEpisodeMetadata3.n;
            }

            public final boolean isHeader() {
                return false;
            }

            public final boolean j() {
                ProtoEpisodeCollectionState protoEpisodeCollectionState = protoEpisodeCollectionState2;
                return protoEpisodeCollectionState != null && protoEpisodeCollectionState.e;
            }

            public final boolean k() {
                ProtoEpisodePlayState protoEpisodePlayState = protoEpisodePlayState2;
                return protoEpisodePlayState != null && protoEpisodePlayState.e;
            }

            public final boolean l() {
                return protoEpisodeMetadata3.j;
            }

            public final int m() {
                return protoEpisodeMetadata3.f;
            }

            public final Integer n() {
                ProtoEpisodePlayState protoEpisodePlayState = protoEpisodePlayState2;
                if (protoEpisodePlayState == null) {
                    return null;
                }
                int i2 = protoEpisodePlayState.d;
                if (!protoEpisodePlayState2.k() || i2 < 0) {
                    return null;
                }
                return Integer.valueOf(i2);
            }

            public final boolean o() {
                ProtoEpisodePlayState protoEpisodePlayState = protoEpisodePlayState2;
                return protoEpisodePlayState != null && protoEpisodePlayState.f;
            }

            public final boolean p() {
                ProtoEpisodeCollectionState protoEpisodeCollectionState = protoEpisodeCollectionState2;
                return protoEpisodeCollectionState != null && protoEpisodeCollectionState.f;
            }

            public final Long q() {
                ProtoEpisodePlayState protoEpisodePlayState = protoEpisodePlayState2;
                if (protoEpisodePlayState != null) {
                    return Long.valueOf(protoEpisodePlayState.g);
                }
                return null;
            }

            public final boolean r() {
                return protoEpisodeMetadata3.l;
            }

            public final int s() {
                return (int) protoEpisodeMetadata3.i;
            }

            public final Show t() {
                return show;
            }

            public final vli u() {
                ProtoEpisodeOfflineState protoEpisodeOfflineState = protoEpisodeOfflineState2;
                String str = protoEpisodeOfflineState == null ? "" : protoEpisodeOfflineState.d;
                ProtoEpisodeOfflineState protoEpisodeOfflineState2 = protoEpisodeOfflineState2;
                return vlj.a(str, protoEpisodeOfflineState2 == null ? 0 : protoEpisodeOfflineState2.e);
            }

            public final Map<String, String> v() {
                return a5;
            }

            public final MediaType w() {
                return mediaType;
            }
        };
        return r0;
    }

    /* access modifiers changed from: private */
    public static vkv a(ProtoShowRequestItem protoShowRequestItem) {
        String str = null;
        ProtoEpisodeMetadata m = protoShowRequestItem.l() ? protoShowRequestItem.m() : null;
        ProtoEpisodeOfflineState q = protoShowRequestItem.p() ? protoShowRequestItem.q() : null;
        ProtoEpisodePlayState s = protoShowRequestItem.r() ? protoShowRequestItem.s() : null;
        ProtoEpisodeCollectionState o = protoShowRequestItem.n() ? protoShowRequestItem.o() : null;
        if (protoShowRequestItem.k()) {
            str = protoShowRequestItem.d;
        }
        return a(m, q, s, o, str);
    }

    public static vlb<vkv> a(final ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse) {
        final vkv[] vkvArr = new vkv[protoOfflinedEpisodesResponse.k()];
        int i = 0;
        for (ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem : protoOfflinedEpisodesResponse.d) {
            int i2 = i + 1;
            String str = null;
            ProtoEpisodeMetadata m = protoOfflinedEpisodesRequestItem.l() ? protoOfflinedEpisodesRequestItem.m() : null;
            ProtoEpisodeOfflineState q = protoOfflinedEpisodesRequestItem.p() ? protoOfflinedEpisodesRequestItem.q() : null;
            ProtoEpisodePlayState s = protoOfflinedEpisodesRequestItem.r() ? protoOfflinedEpisodesRequestItem.s() : null;
            ProtoEpisodeCollectionState o = protoOfflinedEpisodesRequestItem.n() ? protoOfflinedEpisodesRequestItem.o() : null;
            if (protoOfflinedEpisodesRequestItem.k()) {
                str = protoOfflinedEpisodesRequestItem.d;
            }
            vkvArr[i] = a(m, q, s, o, str);
            i = i2;
        }
        return new vlb<vkv>() {
            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vkvArr;
            }

            public final int getUnfilteredLength() {
                return protoOfflinedEpisodesResponse.e;
            }

            public final int getUnrangedLength() {
                return protoOfflinedEpisodesResponse.f;
            }

            public final boolean isLoading() {
                return protoOfflinedEpisodesResponse.g;
            }
        };
    }

    public static vlb<vkv> a(final Response response) {
        final vkv[] vkvArr = new vkv[response.k()];
        int i = 0;
        for (Episode episode : response.d) {
            int i2 = i + 1;
            boolean z = true;
            ProtoEpisodeMetadata k = (episode.d & 1) == 1 ? episode.k() : null;
            ProtoEpisodeOfflineState m = (episode.d & 4) == 4 ? episode.m() : null;
            ProtoEpisodePlayState n = (episode.d & 8) == 8 ? episode.n() : null;
            if ((episode.d & 2) != 2) {
                z = false;
            }
            vkvArr[i] = a(k, m, n, z ? episode.l() : null, null);
            i = i2;
        }
        return new vlb<vkv>() {
            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vkvArr;
            }

            public final int getUnfilteredLength() {
                return response.k();
            }

            public final int getUnrangedLength() {
                return response.k();
            }

            public final boolean isLoading() {
                return false;
            }
        };
    }

    public static vlb<vkv> a(final ProtoUnplayedEpisodesResponse protoUnplayedEpisodesResponse) {
        final vkv[] vkvArr = new vkv[protoUnplayedEpisodesResponse.k()];
        int i = 0;
        for (ProtoUnplayedEpisodesRequestItem protoUnplayedEpisodesRequestItem : protoUnplayedEpisodesResponse.d) {
            int i2 = i + 1;
            String str = null;
            ProtoEpisodeMetadata m = protoUnplayedEpisodesRequestItem.l() ? protoUnplayedEpisodesRequestItem.m() : null;
            ProtoEpisodeOfflineState q = protoUnplayedEpisodesRequestItem.p() ? protoUnplayedEpisodesRequestItem.q() : null;
            ProtoEpisodePlayState s = protoUnplayedEpisodesRequestItem.r() ? protoUnplayedEpisodesRequestItem.s() : null;
            ProtoEpisodeCollectionState o = protoUnplayedEpisodesRequestItem.n() ? protoUnplayedEpisodesRequestItem.o() : null;
            if (protoUnplayedEpisodesRequestItem.k()) {
                str = protoUnplayedEpisodesRequestItem.d;
            }
            vkvArr[i] = a(m, q, s, o, str);
            i = i2;
        }
        return new vlb<vkv>() {
            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vkvArr;
            }

            public final int getUnfilteredLength() {
                return protoUnplayedEpisodesResponse.e;
            }

            public final int getUnrangedLength() {
                return protoUnplayedEpisodesResponse.f;
            }

            public final boolean isLoading() {
                return protoUnplayedEpisodesResponse.g;
            }
        };
    }

    private static vmi a(ProtoOnlineData protoOnlineData) {
        if (protoOnlineData == null) {
            return null;
        }
        protoOnlineData.getClass();
        return new $$Lambda$m5F9efCQmb3RJJjuGyoDHqxlrCE(protoOnlineData);
    }

    public static vml a(final ProtoShowResponse protoShowResponse) {
        ProtoOnlineData protoOnlineData = null;
        if (!protoShowResponse.l()) {
            return null;
        }
        ProtoShowRequestHeader m = protoShowResponse.m();
        final Show a = a(m.k() ? m.l() : null, m.m() ? m.n() : null, m.o() ? m.p() : null, 0, false, -1);
        if (protoShowResponse.n()) {
            protoOnlineData = protoShowResponse.o();
        }
        final vmi a2 = a(protoOnlineData);
        final vkv[] vkvArr = new vkv[protoShowResponse.k()];
        int i = 0;
        for (ProtoShowRequestItem a3 : protoShowResponse.d) {
            int i2 = i + 1;
            vkvArr[i] = a(a3);
            i = i2;
        }
        return new vml() {
            public final Show a() {
                return a;
            }

            public final vmi b() {
                return a2;
            }

            public final vmh c() {
                return vmn.b(protoShowResponse);
            }

            public final vmk d() {
                return vmn.c(protoShowResponse);
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vkvArr;
            }

            public final int getUnfilteredLength() {
                return protoShowResponse.e;
            }

            public final int getUnrangedLength() {
                return protoShowResponse.g;
            }

            public final boolean isLoading() {
                return protoShowResponse.f;
            }
        };
    }

    public static vmm a(final ProtoShowsResponse protoShowsResponse) {
        final Show[] showArr = new Show[protoShowsResponse.k()];
        int i = 0;
        for (ProtoShowsRequestItem a : protoShowsResponse.d) {
            int i2 = i + 1;
            showArr[i] = a(a);
            i = i2;
        }
        return new vmm() {
            public final int a() {
                return protoShowsResponse.e;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return showArr;
            }

            public final int getUnfilteredLength() {
                return protoShowsResponse.f;
            }

            public final int getUnrangedLength() {
                return protoShowsResponse.g;
            }

            public final boolean isLoading() {
                return protoShowsResponse.h;
            }
        };
    }

    public static List<vkv> b(ProtoDecorateResponse protoDecorateResponse) {
        if (protoDecorateResponse == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(protoDecorateResponse.k());
        for (ProtoDecorateEpisodeItem protoDecorateEpisodeItem : protoDecorateResponse.e) {
            arrayList.add(a(protoDecorateEpisodeItem.k() ? protoDecorateEpisodeItem.l() : null, protoDecorateEpisodeItem.o() ? protoDecorateEpisodeItem.p() : null, protoDecorateEpisodeItem.q() ? protoDecorateEpisodeItem.r() : null, protoDecorateEpisodeItem.m() ? protoDecorateEpisodeItem.n() : null, null));
        }
        return arrayList;
    }

    static /* synthetic */ vmh b(ProtoShowResponse protoShowResponse) {
        AuxiliarySections q = protoShowResponse.q();
        if (protoShowResponse.p()) {
            boolean z = true;
            if ((q.d & 1) == 1) {
                if ((q.k().d & 1) != 1) {
                    z = false;
                }
                if (z) {
                    return new $$Lambda$vmn$_JMSwb99LP7wOa5XSYuzXHjUsq4(q.k().k());
                }
            }
        }
        return null;
    }

    static /* synthetic */ vmk c(ProtoShowResponse protoShowResponse) {
        AuxiliarySections q = protoShowResponse.q();
        if (protoShowResponse.p()) {
            if (((q.d & 2) == 2) && q.l().k() != 0) {
                ArrayList arrayList = new ArrayList(q.l().k());
                for (final PodcastTopic podcastTopic : q.l().d) {
                    arrayList.add(new vmj() {
                        public final String a() {
                            return podcastTopic.e;
                        }

                        public final String b() {
                            return podcastTopic.d;
                        }
                    });
                }
                return new $$Lambda$vmn$B7UPsWdcueP7R4myZnEOed3JoZc(arrayList);
            }
        }
        return null;
    }
}
