package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistFormatListAttribute;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoPlaylistHeader;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoPlaylistItem;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoPlaylistResponse;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoRecommendationItem;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistState.ProtoPlaylistOfflineState;
import com.spotify.mobile.android.playlist.proto.PlaylistRootlistRequest.ProtoPlaylistRootFolder;
import com.spotify.mobile.android.playlist.proto.PlaylistRootlistRequest.ProtoPlaylistRootItem;
import com.spotify.mobile.android.playlist.proto.PlaylistRootlistRequest.ProtoPlaylistRootPlaylist;
import com.spotify.mobile.android.playlist.proto.PlaylistRootlistRequest.ProtoPlaylistRootResponse;
import com.spotify.mobile.android.playlist.proto.PlaylistUserState.ProtoUser;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata.ProtoEpisodeShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState.ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.ConsumptionOrder;
import com.spotify.playlist.models.Show.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vkj reason: default package */
public final class vkj {
    private static Covers a(final ProtoImageGroup protoImageGroup) {
        if (protoImageGroup == null) {
            return null;
        }
        return new Covers() {
            public final String getImageUri(Size size) {
                return vlh.a(this, size);
            }

            public final String getLargeUri() {
                return (String) jvi.a(protoImageGroup.f, "");
            }

            public final String getSmallUri() {
                return (String) jvi.a(protoImageGroup.e, "");
            }

            public final String getUri() {
                return (String) jvi.a(protoImageGroup.d, "");
            }

            public final String getXlargeUri() {
                return (String) jvi.a(protoImageGroup.g, "");
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
                return (String) jvi.a(protoEpisodeShowMetadata.f, "");
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

    private static vkt a(final ProtoTrackAlbumMetadata protoTrackAlbumMetadata) {
        ProtoImageGroup protoImageGroup = null;
        if (protoTrackAlbumMetadata == null) {
            return null;
        }
        if (protoTrackAlbumMetadata.m()) {
            protoImageGroup = protoTrackAlbumMetadata.n();
        }
        final Covers a = a(protoImageGroup);
        return new vkt() {
            public final int getAddTime() {
                return 0;
            }

            public final vku getArtist() {
                ProtoTrackAlbumArtistMetadata l = protoTrackAlbumMetadata.k() ? protoTrackAlbumMetadata.l() : null;
                if (l == null) {
                    return null;
                }
                return new vku(l) {
                    private /* synthetic */ ProtoTrackAlbumArtistMetadata a;

                    {
                        this.a = r1;
                    }

                    public final int getAddTime() {
                        return 0;
                    }

                    public final String getCollectionUri() {
                        return "";
                    }

                    public final Covers getCovers() {
                        return null;
                    }

                    public final String getHeader() {
                        return null;
                    }

                    public final String getImageUri() {
                        return "";
                    }

                    public final String getImageUri(Size size) {
                        return "";
                    }

                    public final String getName() {
                        return this.a.e;
                    }

                    public final int getNumAlbumsInCollection() {
                        return 0;
                    }

                    public final int getNumTracksInCollection() {
                        return 0;
                    }

                    public final vli getOfflineState() {
                        return new f();
                    }

                    public final String getTargetUri() {
                        String collectionUri = getCollectionUri();
                        return (getNumTracksInCollection() == 0 || fbo.a(collectionUri)) ? getUri() : collectionUri;
                    }

                    public final String getTitle() {
                        return getName();
                    }

                    public final String getUri() {
                        return this.a.d;
                    }

                    public final boolean isDismissed() {
                        return false;
                    }

                    public final boolean isFollowed() {
                        return false;
                    }

                    public final boolean isHeader() {
                        return false;
                    }

                    public final boolean isVariousArtists() {
                        return false;
                    }
                };
            }

            public final ImmutableList<vku> getArtists() {
                vku artist = getArtist();
                return artist == null ? ImmutableList.d() : ImmutableList.a(artist);
            }

            public final String getCollectionUri() {
                return "";
            }

            public final String getCopyright() {
                return "";
            }

            public final Covers getCovers() {
                return a;
            }

            public final String getHeader() {
                return null;
            }

            public final String getImageUri() {
                Covers covers = a;
                return covers != null ? covers.getImageUri(Size.NORMAL) : "";
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getName() {
                return protoTrackAlbumMetadata.e;
            }

            public final int getNumDiscs() {
                return 0;
            }

            public final int getNumTracks() {
                return 0;
            }

            public final int getNumTracksInCollection() {
                return 0;
            }

            public final vli getOfflineState() {
                return new f();
            }

            public final String getTargetUri() {
                String collectionUri = getCollectionUri();
                return fbo.a(collectionUri) ? getUri() : collectionUri;
            }

            public final String getTitle() {
                return getName();
            }

            public final String getUri() {
                return protoTrackAlbumMetadata.d;
            }

            public final int getYear() {
                return 0;
            }

            public final boolean isAnyTrackPlayable() {
                return false;
            }

            public final boolean isHeader() {
                return false;
            }

            public final boolean isSavedToCollection() {
                return false;
            }
        };
    }

    private static vku a(final ProtoTrackArtistMetadata protoTrackArtistMetadata) {
        if (protoTrackArtistMetadata == null) {
            return null;
        }
        return new vku() {
            public final int getAddTime() {
                return 0;
            }

            public final String getCollectionUri() {
                return "";
            }

            public final Covers getCovers() {
                return null;
            }

            public final String getHeader() {
                return null;
            }

            public final String getImageUri() {
                return "";
            }

            public final String getImageUri(Size size) {
                return "";
            }

            public final String getName() {
                return protoTrackArtistMetadata.e;
            }

            public final int getNumAlbumsInCollection() {
                return 0;
            }

            public final int getNumTracksInCollection() {
                return 0;
            }

            public final vli getOfflineState() {
                return new f();
            }

            public final String getTargetUri() {
                String collectionUri = getCollectionUri();
                return (getNumTracksInCollection() == 0 || fbo.a(collectionUri)) ? getUri() : collectionUri;
            }

            public final String getTitle() {
                return getName();
            }

            public final String getUri() {
                return protoTrackArtistMetadata.d;
            }

            public final boolean isDismissed() {
                return false;
            }

            public final boolean isFollowed() {
                return false;
            }

            public final boolean isHeader() {
                return false;
            }

            public final boolean isVariousArtists() {
                return false;
            }
        };
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
                return (String) jvi.a(protoEpisodeMetadata3.h, "");
            }

            public final String e() {
                return (String) jvi.a(protoEpisodeMetadata3.g, "");
            }

            public final String f() {
                return (String) jvi.a(protoEpisodeMetadata3.m, "");
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
                return covers != null ? covers.getImageUri(Size.SMALL) : "";
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
                return false;
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
                String str = protoEpisodeOfflineState == null ? null : protoEpisodeOfflineState.d;
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

    public static vky a(final ProtoPlaylistRootResponse protoPlaylistRootResponse) {
        if (!protoPlaylistRootResponse.k() || !protoPlaylistRootResponse.l().k()) {
            return null;
        }
        final vlc[] vlcArr = new vlc[protoPlaylistRootResponse.l().d.size()];
        int i = 0;
        for (ProtoPlaylistRootItem a : protoPlaylistRootResponse.l().d) {
            int i2 = i + 1;
            vlcArr[i] = a(a);
            i = i2;
        }
        return new vky() {
            public final String a() {
                return (String) jvi.a(protoPlaylistRootResponse.l().l().d, "");
            }

            public final String b() {
                return (String) jvi.a(protoPlaylistRootResponse.l().l().g, "");
            }

            public final int c() {
                return protoPlaylistRootResponse.l().l().e;
            }

            public final int d() {
                return protoPlaylistRootResponse.l().l().f;
            }

            public final int e() {
                return protoPlaylistRootResponse.l().f;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vlcArr;
            }

            public final int getUnfilteredLength() {
                return protoPlaylistRootResponse.d;
            }

            public final int getUnrangedLength() {
                return protoPlaylistRootResponse.e;
            }

            public final boolean isLoading() {
                return false;
            }
        };
    }

    static vlc a(ProtoPlaylistMetadata protoPlaylistMetadata, ProtoPlaylistOfflineState protoPlaylistOfflineState, String str, int i, Optional<Boolean> optional) {
        Map map;
        ProtoUser protoUser = null;
        if (protoPlaylistMetadata == null) {
            return null;
        }
        final Covers a = a(protoPlaylistMetadata.m() ? protoPlaylistMetadata.n() : null);
        final vlg a2 = a(protoPlaylistMetadata.k() ? protoPlaylistMetadata.l() : null);
        if (protoPlaylistMetadata.p()) {
            protoUser = protoPlaylistMetadata.q();
        }
        final vlg a3 = a(protoUser);
        if (protoPlaylistMetadata.o() > 0) {
            map = Maps.a(protoPlaylistMetadata.p.size());
            for (ProtoPlaylistFormatListAttribute protoPlaylistFormatListAttribute : protoPlaylistMetadata.p) {
                map.put(protoPlaylistFormatListAttribute.d, protoPlaylistFormatListAttribute.e);
            }
        } else {
            map = Collections.emptyMap();
        }
        final Map map2 = map;
        final ProtoPlaylistMetadata protoPlaylistMetadata2 = protoPlaylistMetadata;
        final Optional<Boolean> optional2 = optional;
        final ProtoPlaylistOfflineState protoPlaylistOfflineState2 = protoPlaylistOfflineState;
        final String str2 = str;
        final int i2 = i;
        AnonymousClass11 r0 = new vlc() {
            public final String a() {
                return (String) jvi.a(protoPlaylistMetadata2.e, "");
            }

            public final String b() {
                return protoPlaylistMetadata2.i;
            }

            public final Covers c() {
                return a;
            }

            public final vlg d() {
                return a2;
            }

            public final boolean e() {
                return protoPlaylistMetadata2.r;
            }

            public final boolean f() {
                return false;
            }

            public final boolean g() {
                return protoPlaylistMetadata2.g;
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
                return (String) jvi.a(protoPlaylistMetadata2.d, "");
            }

            public final boolean h() {
                return protoPlaylistMetadata2.j;
            }

            public final boolean i() {
                return protoPlaylistMetadata2.k;
            }

            public final boolean isHeader() {
                return false;
            }

            public final boolean j() {
                return protoPlaylistMetadata2.l;
            }

            public final boolean k() {
                return protoPlaylistMetadata2.f;
            }

            public final boolean l() {
                return protoPlaylistMetadata2.m;
            }

            public final boolean m() {
                return protoPlaylistMetadata2.n;
            }

            public final Optional<Boolean> n() {
                return optional2;
            }

            public final boolean o() {
                return protoPlaylistMetadata2.q;
            }

            public final String p() {
                return protoPlaylistMetadata2.o;
            }

            public final ImmutableMap<String, String> q() {
                return ImmutableMap.a(map2);
            }

            public final vky r() {
                return null;
            }

            public final vli s() {
                ProtoPlaylistOfflineState protoPlaylistOfflineState = protoPlaylistOfflineState2;
                String str = protoPlaylistOfflineState == null ? null : protoPlaylistOfflineState.d;
                ProtoPlaylistOfflineState protoPlaylistOfflineState2 = protoPlaylistOfflineState2;
                return vlj.a(str, protoPlaylistOfflineState2 == null ? 0 : protoPlaylistOfflineState2.e);
            }

            public final int t() {
                return protoPlaylistMetadata2.h;
            }

            public final String u() {
                return str2;
            }

            public final int v() {
                return i2;
            }

            public final vlg w() {
                return a3;
            }
        };
        return r0;
    }

    private static vlc a(final ProtoPlaylistRootFolder protoPlaylistRootFolder, final String str, final int i) {
        if (!protoPlaylistRootFolder.k()) {
            return null;
        }
        final vlc[] vlcArr = new vlc[protoPlaylistRootFolder.d.size()];
        int i2 = 0;
        for (ProtoPlaylistRootItem a : protoPlaylistRootFolder.d) {
            int i3 = i2 + 1;
            vlcArr[i2] = a(a);
            i2 = i3;
        }
        final AnonymousClass13 r1 = new vky() {
            public final String a() {
                return (String) jvi.a(protoPlaylistRootFolder.l().d, "");
            }

            public final String b() {
                return (String) jvi.a(protoPlaylistRootFolder.l().g, "");
            }

            public final int c() {
                return protoPlaylistRootFolder.l().e;
            }

            public final int d() {
                return protoPlaylistRootFolder.l().f;
            }

            public final int e() {
                return i;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vlcArr;
            }

            public final int getUnfilteredLength() {
                return vlcArr.length;
            }

            public final int getUnrangedLength() {
                return vlcArr.length;
            }

            public final boolean isLoading() {
                return false;
            }
        };
        return new vlc() {
            public final String a() {
                return (String) jvi.a(protoPlaylistRootFolder.l().d, "");
            }

            public final String b() {
                return null;
            }

            public final Covers c() {
                return null;
            }

            public final vlg d() {
                return null;
            }

            public final boolean e() {
                return false;
            }

            public final boolean f() {
                return true;
            }

            public final boolean g() {
                return false;
            }

            public final String getHeader() {
                return null;
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
                return a();
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
                return false;
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

            public final boolean m() {
                return false;
            }

            public final Optional<Boolean> n() {
                return Optional.e();
            }

            public final boolean o() {
                return false;
            }

            public final String p() {
                return "";
            }

            public final ImmutableMap<String, String> q() {
                return ImmutableMap.f();
            }

            public final vky r() {
                return r1;
            }

            public final vli s() {
                return new f();
            }

            public final int t() {
                return 0;
            }

            public final String u() {
                return str;
            }

            public final int v() {
                return i;
            }

            public final vlg w() {
                return null;
            }
        };
    }

    private static vlc a(final ProtoPlaylistRootItem protoPlaylistRootItem) {
        if (!fbo.a(protoPlaylistRootItem.d)) {
            return new vlc() {
                public final String a() {
                    return "";
                }

                public final String b() {
                    return null;
                }

                public final Covers c() {
                    return null;
                }

                public final vlg d() {
                    return null;
                }

                public final boolean e() {
                    return false;
                }

                public final boolean f() {
                    return false;
                }

                public final boolean g() {
                    return false;
                }

                public final String getHeader() {
                    return protoPlaylistRootItem.d;
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

                public final boolean m() {
                    return false;
                }

                public final Optional<Boolean> n() {
                    return Optional.e();
                }

                public final boolean o() {
                    return false;
                }

                public final String p() {
                    return "";
                }

                public final ImmutableMap<String, String> q() {
                    return ImmutableMap.f();
                }

                public final vky r() {
                    return null;
                }

                public final vli s() {
                    return new f();
                }

                public final int t() {
                    return 0;
                }

                public final String u() {
                    return null;
                }

                public final int v() {
                    return 0;
                }

                public final vlg w() {
                    return null;
                }
            };
        }
        if (protoPlaylistRootItem.k()) {
            ProtoPlaylistRootFolder l = protoPlaylistRootItem.l();
            return a(l, l.e, l.f);
        }
        ProtoPlaylistRootPlaylist m = protoPlaylistRootItem.m();
        ProtoPlaylistOfflineState protoPlaylistOfflineState = null;
        ProtoPlaylistMetadata l2 = m.k() ? m.l() : null;
        if (m.m()) {
            protoPlaylistOfflineState = m.n();
        }
        return a(l2, protoPlaylistOfflineState, m.d, m.e, m.o() ? Optional.b(Boolean.valueOf(m.f)) : Optional.e());
    }

    public static vld a(final ProtoPlaylistResponse protoPlaylistResponse) {
        final vle[] vleArr = new vle[protoPlaylistResponse.e.size()];
        int i = 0;
        for (ProtoPlaylistItem a : protoPlaylistResponse.e) {
            int i2 = i + 1;
            vleArr[i] = a(a);
            i = i2;
        }
        return new vld() {
            public final vlc a() {
                boolean z = true;
                ProtoPlaylistHeader k = (protoPlaylistResponse.d & 1) == 1 ? protoPlaylistResponse.k() : null;
                Optional b2 = protoPlaylistResponse.l() ? Optional.b(Boolean.valueOf(protoPlaylistResponse.q)) : Optional.e();
                if (k == null) {
                    return null;
                }
                ProtoPlaylistMetadata k2 = (k.d & 1) == 1 ? k.k() : null;
                if ((k.d & 2) != 2) {
                    z = false;
                }
                return vkj.a(k2, z ? k.l() : null, (String) null, 0, b2);
            }

            public final long b() {
                return protoPlaylistResponse.h;
            }

            public final int c() {
                return protoPlaylistResponse.k;
            }

            public final boolean d() {
                return protoPlaylistResponse.m;
            }

            public final boolean e() {
                return protoPlaylistResponse.p;
            }

            public final boolean f() {
                return protoPlaylistResponse.n;
            }

            public final boolean g() {
                return protoPlaylistResponse.o;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vleArr;
            }

            public final int getUnfilteredLength() {
                return protoPlaylistResponse.f;
            }

            public final int getUnrangedLength() {
                return protoPlaylistResponse.g;
            }

            public final int h() {
                return protoPlaylistResponse.s;
            }

            public final int i() {
                return protoPlaylistResponse.r;
            }

            public final boolean isLoading() {
                return protoPlaylistResponse.i;
            }

            public final long j() {
                return protoPlaylistResponse.j;
            }

            public final List<vlf> k() {
                ArrayList a2 = Lists.a();
                for (ProtoRecommendationItem protoRecommendationItem : protoPlaylistResponse.l) {
                    boolean z = true;
                    ProtoTrackPlayState protoTrackPlayState = null;
                    ProtoTrackMetadata k = (protoRecommendationItem.d & 1) == 1 ? protoRecommendationItem.k() : null;
                    ProtoTrackOfflineState m = (protoRecommendationItem.d & 4) == 4 ? protoRecommendationItem.m() : null;
                    ProtoTrackCollectionState l = (protoRecommendationItem.d & 2) == 2 ? protoRecommendationItem.l() : null;
                    if ((protoRecommendationItem.d & 8) != 8) {
                        z = false;
                    }
                    if (z) {
                        protoTrackPlayState = protoRecommendationItem.n();
                    }
                    a2.add(vkj.a(k, m, l, protoTrackPlayState, null, 0, null));
                }
                return a2;
            }
        };
    }

    private static vle a(final ProtoPlaylistItem protoPlaylistItem) {
        final Map map;
        String str = null;
        final vlf a = a(protoPlaylistItem.n() ? protoPlaylistItem.o() : null, protoPlaylistItem.r() ? protoPlaylistItem.s() : null, protoPlaylistItem.p() ? protoPlaylistItem.q() : null, protoPlaylistItem.t() ? protoPlaylistItem.u() : null, protoPlaylistItem.l() ? protoPlaylistItem.m() : null, protoPlaylistItem.e, protoPlaylistItem.k() ? protoPlaylistItem.d : null);
        ProtoEpisodeMetadata x = protoPlaylistItem.w() ? protoPlaylistItem.x() : null;
        ProtoEpisodeOfflineState z = protoPlaylistItem.y() ? protoPlaylistItem.z() : null;
        ProtoEpisodePlayState D = protoPlaylistItem.C() ? protoPlaylistItem.D() : null;
        ProtoEpisodeCollectionState B = protoPlaylistItem.A() ? protoPlaylistItem.B() : null;
        if (protoPlaylistItem.k()) {
            str = protoPlaylistItem.d;
        }
        final vkv a2 = a(x, z, D, B, str);
        if (protoPlaylistItem.v() > 0) {
            map = Maps.a(protoPlaylistItem.g.size());
            for (ProtoPlaylistFormatListAttribute protoPlaylistFormatListAttribute : protoPlaylistItem.g) {
                map.put(protoPlaylistFormatListAttribute.d, protoPlaylistFormatListAttribute.e);
            }
        } else {
            map = Collections.emptyMap();
        }
        return new vle() {
            public final vkv a() {
                return a2;
            }

            public final vlf b() {
                return a;
            }

            public final ImmutableMap<String, String> c() {
                return ImmutableMap.a(map);
            }

            public final String d() {
                return protoPlaylistItem.f;
            }

            public final String getHeader() {
                return protoPlaylistItem.d;
            }

            public final String getImageUri() {
                return getImageUri(Size.SMALL);
            }

            public final String getImageUri(Size size) {
                vkv vkv = a2;
                if (vkv != null) {
                    return vkv.getImageUri(size);
                }
                vlf vlf = a;
                return vlf != null ? vlf.getImageUri(size) : "";
            }

            public final String getTargetUri() {
                vkv vkv = a2;
                if (vkv != null) {
                    return vkv.getTargetUri();
                }
                vlf vlf = a;
                return vlf != null ? vlf.getTargetUri() : "";
            }

            public final String getTitle() {
                vkv vkv = a2;
                if (vkv != null) {
                    return vkv.getTitle();
                }
                vlf vlf = a;
                return vlf != null ? vlf.getTitle() : "";
            }

            public final String getUri() {
                vkv vkv = a2;
                if (vkv != null) {
                    return vkv.getUri();
                }
                vlf vlf = a;
                return vlf != null ? vlf.getUri() : "";
            }

            public final boolean isHeader() {
                return !fbo.a(protoPlaylistItem.d);
            }
        };
    }

    static vlf a(ProtoTrackMetadata protoTrackMetadata, ProtoTrackOfflineState protoTrackOfflineState, ProtoTrackCollectionState protoTrackCollectionState, ProtoTrackPlayState protoTrackPlayState, ProtoUser protoUser, int i, final String str) {
        if (!fbo.a(str)) {
            return new vlf() {
                public final boolean canAddToCollection() {
                    return false;
                }

                public final boolean canBan() {
                    return false;
                }

                public final int getAddTime() {
                    return 0;
                }

                public final vlg getAddedBy() {
                    return null;
                }

                public final vkt getAlbum() {
                    return null;
                }

                public final List<vku> getArtists() {
                    return null;
                }

                public final String getHeader() {
                    return str;
                }

                public final String getImageUri() {
                    return "";
                }

                public final String getImageUri(Size size) {
                    return "";
                }

                public final int getLength() {
                    return 0;
                }

                public final String getName() {
                    return "";
                }

                public final vli getOfflineState() {
                    return new f();
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

                public final boolean hasLyrics() {
                    return false;
                }

                public final boolean inCollection() {
                    return false;
                }

                public final boolean is19plus() {
                    return false;
                }

                public final boolean isAvailableInMetadataCatalogue() {
                    return false;
                }

                public final boolean isBanned() {
                    return false;
                }

                public final boolean isCurrentlyPlayable() {
                    return false;
                }

                public final boolean isExplicit() {
                    return false;
                }

                public final boolean isHeader() {
                    return true;
                }

                public final boolean isLocal() {
                    return false;
                }

                public final boolean isPremiumOnly() {
                    return false;
                }

                public final String playableTrackUri() {
                    return null;
                }

                public final String previewId() {
                    return null;
                }
            };
        }
        ProtoTrackAlbumMetadata protoTrackAlbumMetadata = null;
        if (protoTrackMetadata == null) {
            return null;
        }
        final vlg a = a(protoUser);
        e<ProtoTrackArtistMetadata> eVar = protoTrackMetadata.d;
        final ArrayList arrayList = new ArrayList(eVar.size());
        for (ProtoTrackArtistMetadata a2 : eVar) {
            arrayList.add(a(a2));
        }
        if (protoTrackMetadata.k()) {
            protoTrackAlbumMetadata = protoTrackMetadata.l();
        }
        final vkt a3 = a(protoTrackAlbumMetadata);
        final ProtoTrackMetadata protoTrackMetadata2 = protoTrackMetadata;
        final ProtoTrackCollectionState protoTrackCollectionState2 = protoTrackCollectionState;
        final ProtoTrackPlayState protoTrackPlayState2 = protoTrackPlayState;
        final ProtoTrackOfflineState protoTrackOfflineState2 = protoTrackOfflineState;
        final int i2 = i;
        AnonymousClass2 r0 = new vlf() {
            public final boolean canAddToCollection() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.e;
            }

            public final boolean canBan() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.g;
            }

            public final int getAddTime() {
                return i2;
            }

            public final vlg getAddedBy() {
                return a;
            }

            public final vkt getAlbum() {
                return a3;
            }

            public final List<vku> getArtists() {
                return arrayList;
            }

            public final String getHeader() {
                return null;
            }

            public final String getImageUri() {
                return getImageUri(Size.NORMAL);
            }

            public final String getImageUri(Size size) {
                vkt vkt = a3;
                return vkt != null ? vkt.getImageUri(size) : "";
            }

            public final int getLength() {
                return protoTrackMetadata2.g;
            }

            public final String getName() {
                return protoTrackMetadata2.f;
            }

            public final vli getOfflineState() {
                ProtoTrackOfflineState protoTrackOfflineState = protoTrackOfflineState2;
                return vlj.a(protoTrackOfflineState == null ? "" : protoTrackOfflineState.d, 0);
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String getTitle() {
                return getName();
            }

            public final String getUri() {
                return protoTrackMetadata2.e;
            }

            public final boolean hasLyrics() {
                return protoTrackMetadata2.l;
            }

            public final boolean inCollection() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.d;
            }

            public final boolean is19plus() {
                return false;
            }

            public final boolean isAvailableInMetadataCatalogue() {
                return protoTrackMetadata2.h;
            }

            public final boolean isBanned() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.f;
            }

            public final boolean isCurrentlyPlayable() {
                ProtoTrackPlayState protoTrackPlayState = protoTrackPlayState2;
                return protoTrackPlayState == null || !protoTrackPlayState.k() || protoTrackPlayState2.d;
            }

            public final boolean isExplicit() {
                return protoTrackMetadata2.i;
            }

            public final boolean isHeader() {
                return false;
            }

            public final boolean isLocal() {
                return protoTrackMetadata2.k;
            }

            public final boolean isPremiumOnly() {
                return protoTrackMetadata2.m;
            }

            public final String playableTrackUri() {
                return protoTrackMetadata2.n;
            }

            public final String previewId() {
                return protoTrackMetadata2.j;
            }
        };
        return r0;
    }

    private static vlg a(final ProtoUser protoUser) {
        if (protoUser == null) {
            return null;
        }
        return new vlg() {
            public final String a() {
                return (String) jvi.a(protoUser.d, "");
            }

            public final String b() {
                return (String) jvi.a(protoUser.e, "");
            }

            public final String c() {
                return d() ? protoUser.f : b();
            }

            public final boolean d() {
                return !fbo.a(protoUser.f);
            }

            public final String e() {
                return protoUser.g;
            }

            public final String f() {
                return protoUser.h;
            }
        };
    }
}
