package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumState.ProtoAlbumOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistMetadata.ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ArtistState.ProtoArtistOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest.ProtoCollectionAlbumsItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest.ProtoCollectionAlbumsResponse;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest.ProtoCollectionArtistsItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionArtistsRequest.ProtoCollectionArtistsResponse;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest.ProtoCollectionTracksItem;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest.ProtoCollectionTracksResponse;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest.ProtoGroupHeader;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.TrackState.ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: isb reason: default package */
public final class isb {

    /* renamed from: isb$7 reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] a = new int[Size.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.playlist.models.Covers$Size[] r0 = com.spotify.playlist.models.Covers.Size.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.playlist.models.Covers$Size r1 = com.spotify.playlist.models.Covers.Size.NORMAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.playlist.models.Covers$Size r1 = com.spotify.playlist.models.Covers.Size.SMALL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.playlist.models.Covers$Size r1 = com.spotify.playlist.models.Covers.Size.LARGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.isb.AnonymousClass7.<clinit>():void");
        }
    }

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

    public static iri a(final ProtoCollectionTracksResponse protoCollectionTracksResponse) {
        final vlf[] vlfArr = new vlf[protoCollectionTracksResponse.k()];
        int i = 0;
        for (ProtoCollectionTracksItem a : protoCollectionTracksResponse.d) {
            int i2 = i + 1;
            vlfArr[i] = a(a);
            i = i2;
        }
        return new iri() {
            public final vli a() {
                return vlj.a(protoCollectionTracksResponse.h, protoCollectionTracksResponse.i);
            }

            public final List<irh> b() {
                ArrayList arrayList = new ArrayList(protoCollectionTracksResponse.j.size());
                for (final ProtoGroupHeader protoGroupHeader : protoCollectionTracksResponse.j) {
                    arrayList.add(new irh() {
                        public final int a() {
                            return protoGroupHeader.d;
                        }

                        public final int b() {
                            return protoGroupHeader.e;
                        }
                    });
                }
                return arrayList;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vlfArr;
            }

            public final int getUnfilteredLength() {
                return protoCollectionTracksResponse.e;
            }

            public final int getUnrangedLength() {
                return protoCollectionTracksResponse.f;
            }

            public final boolean isLoading() {
                return protoCollectionTracksResponse.g;
            }
        };
    }

    public static vkt a(ProtoAlbumMetadata protoAlbumMetadata, ProtoAlbumOfflineState protoAlbumOfflineState, ProtoAlbumCollectionState protoAlbumCollectionState, final String str, int i) {
        if (!fbo.a(str)) {
            return new vkt() {
                public final int getAddTime() {
                    return 0;
                }

                public final vku getArtist() {
                    return null;
                }

                public final ImmutableList<vku> getArtists() {
                    return ImmutableList.d();
                }

                public final String getCollectionUri() {
                    return "";
                }

                public final String getCopyright() {
                    return "";
                }

                public final Covers getCovers() {
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

                public final String getName() {
                    return "";
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
                    return getUri();
                }

                public final String getTitle() {
                    return "";
                }

                public final String getUri() {
                    return "";
                }

                public final int getYear() {
                    return 0;
                }

                public final boolean isAnyTrackPlayable() {
                    return false;
                }

                public final boolean isHeader() {
                    return true;
                }

                public final boolean isSavedToCollection() {
                    return false;
                }
            };
        }
        ProtoImageGroup protoImageGroup = null;
        if (protoAlbumMetadata == null) {
            return null;
        }
        if (protoAlbumMetadata.k()) {
            protoImageGroup = protoAlbumMetadata.l();
        }
        final Covers a = a(protoImageGroup);
        final ProtoAlbumMetadata protoAlbumMetadata2 = protoAlbumMetadata;
        final ProtoAlbumCollectionState protoAlbumCollectionState2 = protoAlbumCollectionState;
        final ProtoAlbumOfflineState protoAlbumOfflineState2 = protoAlbumOfflineState;
        final int i2 = i;
        AnonymousClass4 r0 = new vkt() {
            public final int getAddTime() {
                return i2;
            }

            public final vku getArtist() {
                return isb.a(protoAlbumMetadata2.d.size() > 0 ? (ProtoAlbumArtistMetadata) protoAlbumMetadata2.d.get(0) : null);
            }

            public final ImmutableList<vku> getArtists() {
                a g = ImmutableList.g();
                for (ProtoAlbumArtistMetadata a2 : protoAlbumMetadata2.d) {
                    g.c(isb.a(a2));
                }
                return g.a();
            }

            public final String getCollectionUri() {
                ProtoAlbumCollectionState protoAlbumCollectionState = protoAlbumCollectionState2;
                return (String) jvi.a(protoAlbumCollectionState == null ? null : protoAlbumCollectionState.d, "");
            }

            public final String getCopyright() {
                return (String) jvi.a(protoAlbumMetadata2.g, "");
            }

            public final Covers getCovers() {
                return a;
            }

            public final String getHeader() {
                return null;
            }

            public final String getImageUri() {
                return getImageUri(Size.NORMAL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getName() {
                return protoAlbumMetadata2.f;
            }

            public final int getNumDiscs() {
                return protoAlbumMetadata2.i;
            }

            public final int getNumTracks() {
                return protoAlbumMetadata2.j;
            }

            public final int getNumTracksInCollection() {
                ProtoAlbumCollectionState protoAlbumCollectionState = protoAlbumCollectionState2;
                if (protoAlbumCollectionState == null) {
                    return 0;
                }
                return protoAlbumCollectionState.e;
            }

            public final vli getOfflineState() {
                ProtoAlbumOfflineState protoAlbumOfflineState = protoAlbumOfflineState2;
                String str = protoAlbumOfflineState == null ? null : protoAlbumOfflineState.d;
                ProtoAlbumOfflineState protoAlbumOfflineState2 = protoAlbumOfflineState2;
                return vlj.a(str, protoAlbumOfflineState2 == null ? 0 : protoAlbumOfflineState2.e);
            }

            public final String getTargetUri() {
                return itc.a((vkt) this);
            }

            public final String getTitle() {
                return getName();
            }

            public final String getUri() {
                return protoAlbumMetadata2.e;
            }

            public final int getYear() {
                return protoAlbumMetadata2.h;
            }

            public final boolean isAnyTrackPlayable() {
                return protoAlbumMetadata2.k;
            }

            public final boolean isHeader() {
                return false;
            }

            public final boolean isSavedToCollection() {
                ProtoAlbumCollectionState protoAlbumCollectionState = protoAlbumCollectionState2;
                return protoAlbumCollectionState != null && protoAlbumCollectionState.f;
            }
        };
        return r0;
    }

    private static vkt a(ProtoCollectionAlbumsItem protoCollectionAlbumsItem) {
        String str = null;
        ProtoAlbumMetadata m = protoCollectionAlbumsItem.l() ? protoCollectionAlbumsItem.m() : null;
        ProtoAlbumOfflineState q = protoCollectionAlbumsItem.p() ? protoCollectionAlbumsItem.q() : null;
        ProtoAlbumCollectionState o = protoCollectionAlbumsItem.n() ? protoCollectionAlbumsItem.o() : null;
        if (protoCollectionAlbumsItem.k()) {
            str = protoCollectionAlbumsItem.d;
        }
        return a(m, q, o, str, protoCollectionAlbumsItem.e);
    }

    public static vkt a(final ProtoTrackAlbumMetadata protoTrackAlbumMetadata) {
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
                        return itc.a((vku) this);
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
                return itc.a((vkt) this);
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

    static /* synthetic */ vku a(final ProtoAlbumArtistMetadata protoAlbumArtistMetadata) {
        if (protoAlbumArtistMetadata == null) {
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
                return protoAlbumArtistMetadata.e;
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
                return getUri();
            }

            public final String getTitle() {
                return getName();
            }

            public final String getUri() {
                return protoAlbumArtistMetadata.d;
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

    public static vku a(ProtoArtistMetadata protoArtistMetadata, ProtoArtistOfflineState protoArtistOfflineState, ProtoArtistCollectionState protoArtistCollectionState, final String str, int i) {
        if (!fbo.a(str)) {
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
                    return str;
                }

                public final String getImageUri() {
                    return "";
                }

                public final String getImageUri(Size size) {
                    return "";
                }

                public final String getName() {
                    return "";
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
                    return getUri();
                }

                public final String getTitle() {
                    return getName();
                }

                public final String getUri() {
                    return "";
                }

                public final boolean isDismissed() {
                    return false;
                }

                public final boolean isFollowed() {
                    return false;
                }

                public final boolean isHeader() {
                    return true;
                }

                public final boolean isVariousArtists() {
                    return false;
                }
            };
        }
        ProtoImageGroup protoImageGroup = null;
        if (protoArtistMetadata == null) {
            return null;
        }
        if (protoArtistMetadata.k()) {
            protoImageGroup = protoArtistMetadata.l();
        }
        final Covers a = a(protoImageGroup);
        final ProtoArtistMetadata protoArtistMetadata2 = protoArtistMetadata;
        final ProtoArtistCollectionState protoArtistCollectionState2 = protoArtistCollectionState;
        final ProtoArtistOfflineState protoArtistOfflineState2 = protoArtistOfflineState;
        final int i2 = i;
        AnonymousClass6 r0 = new vku() {
            public final int getAddTime() {
                return i2;
            }

            public final String getCollectionUri() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                return (String) jvi.a(protoArtistCollectionState == null ? null : protoArtistCollectionState.d, "");
            }

            public final Covers getCovers() {
                return a;
            }

            public final String getHeader() {
                return null;
            }

            public final String getImageUri() {
                return getImageUri(Size.NORMAL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getName() {
                return protoArtistMetadata2.e;
            }

            public final int getNumAlbumsInCollection() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                if (protoArtistCollectionState == null) {
                    return 0;
                }
                return protoArtistCollectionState.g;
            }

            public final int getNumTracksInCollection() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                if (protoArtistCollectionState == null) {
                    return 0;
                }
                return protoArtistCollectionState.f;
            }

            public final vli getOfflineState() {
                ProtoArtistOfflineState protoArtistOfflineState = protoArtistOfflineState2;
                String str = protoArtistOfflineState == null ? null : protoArtistOfflineState.d;
                ProtoArtistOfflineState protoArtistOfflineState2 = protoArtistOfflineState2;
                return vlj.a(str, protoArtistOfflineState2 == null ? 0 : protoArtistOfflineState2.e);
            }

            public final String getTargetUri() {
                return itc.a((vku) this);
            }

            public final String getTitle() {
                return getName();
            }

            public final String getUri() {
                return protoArtistMetadata2.d;
            }

            public final boolean isDismissed() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                return protoArtistCollectionState != null && protoArtistCollectionState.h;
            }

            public final boolean isFollowed() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                return protoArtistCollectionState != null && protoArtistCollectionState.e;
            }

            public final boolean isHeader() {
                return false;
            }

            public final boolean isVariousArtists() {
                return protoArtistMetadata2.f;
            }
        };
        return r0;
    }

    private static vku a(ProtoCollectionArtistsItem protoCollectionArtistsItem) {
        String str = null;
        ProtoArtistMetadata m = protoCollectionArtistsItem.l() ? protoCollectionArtistsItem.m() : null;
        ProtoArtistOfflineState q = protoCollectionArtistsItem.p() ? protoCollectionArtistsItem.q() : null;
        ProtoArtistCollectionState o = protoCollectionArtistsItem.n() ? protoCollectionArtistsItem.o() : null;
        if (protoCollectionArtistsItem.k()) {
            str = protoCollectionArtistsItem.d;
        }
        return a(m, q, o, str, protoCollectionArtistsItem.e);
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
                return (String) jvi.a(protoTrackArtistMetadata.k().d, "");
            }

            public final String getImageUri(Size size) {
                int i = AnonymousClass7.a[size.ordinal()];
                String str = "";
                return i != 1 ? i != 2 ? i != 3 ? (String) jvi.a(protoTrackArtistMetadata.k().g, str) : (String) jvi.a(protoTrackArtistMetadata.k().f, str) : (String) jvi.a(protoTrackArtistMetadata.k().e, str) : (String) jvi.a(protoTrackArtistMetadata.k().d, str);
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
                return itc.a((vku) this);
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

    public static vlb<vkt> a(final ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse) {
        final vkt[] vktArr = new vkt[protoCollectionAlbumsResponse.k()];
        int i = 0;
        for (ProtoCollectionAlbumsItem a : protoCollectionAlbumsResponse.d) {
            int i2 = i + 1;
            vktArr[i] = a(a);
            i = i2;
        }
        return new vlb<vkt>() {
            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vktArr;
            }

            public final int getUnfilteredLength() {
                return protoCollectionAlbumsResponse.e;
            }

            public final int getUnrangedLength() {
                return protoCollectionAlbumsResponse.f;
            }

            public final boolean isLoading() {
                return protoCollectionAlbumsResponse.g;
            }
        };
    }

    public static vlb<vku> a(final ProtoCollectionArtistsResponse protoCollectionArtistsResponse) {
        final vku[] vkuArr = new vku[protoCollectionArtistsResponse.k()];
        int i = 0;
        for (ProtoCollectionArtistsItem a : protoCollectionArtistsResponse.d) {
            int i2 = i + 1;
            vkuArr[i] = a(a);
            i = i2;
        }
        return new vlb<vku>() {
            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return vkuArr;
            }

            public final int getUnfilteredLength() {
                return protoCollectionArtistsResponse.e;
            }

            public final int getUnrangedLength() {
                return protoCollectionArtistsResponse.f;
            }

            public final boolean isLoading() {
                return protoCollectionArtistsResponse.g;
            }
        };
    }

    private static vlf a(ProtoCollectionTracksItem protoCollectionTracksItem) {
        String str = null;
        ProtoTrackMetadata m = protoCollectionTracksItem.l() ? protoCollectionTracksItem.m() : null;
        ProtoTrackOfflineState o = protoCollectionTracksItem.n() ? protoCollectionTracksItem.o() : null;
        ProtoTrackPlayState q = protoCollectionTracksItem.p() ? protoCollectionTracksItem.q() : null;
        ProtoTrackCollectionState s = protoCollectionTracksItem.r() ? protoCollectionTracksItem.s() : null;
        int i = protoCollectionTracksItem.e;
        if (protoCollectionTracksItem.k()) {
            str = protoCollectionTracksItem.d;
        }
        return a(m, o, q, s, i, str);
    }

    public static vlf a(final ProtoTrackMetadata protoTrackMetadata, ProtoTrackOfflineState protoTrackOfflineState, ProtoTrackPlayState protoTrackPlayState, ProtoTrackCollectionState protoTrackCollectionState, int i, final String str) {
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
                    ProtoTrackMetadata protoTrackMetadata = protoTrackMetadata;
                    ProtoTrackAlbumMetadata protoTrackAlbumMetadata = null;
                    if (protoTrackMetadata == null) {
                        return null;
                    }
                    if (protoTrackMetadata.k()) {
                        protoTrackAlbumMetadata = protoTrackMetadata.l();
                    }
                    return isb.a(protoTrackAlbumMetadata);
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
        final ArrayList arrayList = new ArrayList(protoTrackMetadata.m());
        for (ProtoTrackArtistMetadata a : protoTrackMetadata.d) {
            arrayList.add(a(a));
        }
        if (protoTrackMetadata.k()) {
            protoTrackAlbumMetadata = protoTrackMetadata.l();
        }
        final vkt a2 = a(protoTrackAlbumMetadata);
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
                return null;
            }

            public final vkt getAlbum() {
                return a2;
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
                vkt vkt = a2;
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
                return protoTrackPlayState != null && protoTrackPlayState.d;
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
}
