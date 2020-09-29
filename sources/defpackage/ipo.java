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

/* renamed from: ipo reason: default package */
public final class ipo {

    /* renamed from: ipo$7 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ipo.AnonymousClass7.<clinit>():void");
        }
    }

    public static iov a(final ProtoCollectionTracksResponse protoCollectionTracksResponse) {
        final uzc[] uzcArr = new uzc[protoCollectionTracksResponse.k()];
        int i = 0;
        for (ProtoCollectionTracksItem a : protoCollectionTracksResponse.d) {
            int i2 = i + 1;
            uzcArr[i] = a(a);
            i = i2;
        }
        return new iov() {
            public final uzf a() {
                return uzg.a(protoCollectionTracksResponse.h, protoCollectionTracksResponse.i);
            }

            public final List<iou> b() {
                ArrayList arrayList = new ArrayList(protoCollectionTracksResponse.j.size());
                for (final ProtoGroupHeader protoGroupHeader : protoCollectionTracksResponse.j) {
                    arrayList.add(new iou() {
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

            public final boolean isLoading() {
                return protoCollectionTracksResponse.g;
            }

            public final int getUnfilteredLength() {
                return protoCollectionTracksResponse.e;
            }

            public final int getUnrangedLength() {
                return protoCollectionTracksResponse.f;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return uzcArr;
            }
        };
    }

    private static uzc a(ProtoCollectionTracksItem protoCollectionTracksItem) {
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

    public static uyy<uyq> a(final ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse) {
        final uyq[] uyqArr = new uyq[protoCollectionAlbumsResponse.k()];
        int i = 0;
        for (ProtoCollectionAlbumsItem a : protoCollectionAlbumsResponse.d) {
            int i2 = i + 1;
            uyqArr[i] = a(a);
            i = i2;
        }
        return new uyy<uyq>() {
            public final boolean isLoading() {
                return protoCollectionAlbumsResponse.g;
            }

            public final int getUnfilteredLength() {
                return protoCollectionAlbumsResponse.e;
            }

            public final int getUnrangedLength() {
                return protoCollectionAlbumsResponse.f;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return uyqArr;
            }
        };
    }

    private static uyq a(ProtoCollectionAlbumsItem protoCollectionAlbumsItem) {
        String str = null;
        ProtoAlbumMetadata m = protoCollectionAlbumsItem.l() ? protoCollectionAlbumsItem.m() : null;
        ProtoAlbumOfflineState q = protoCollectionAlbumsItem.p() ? protoCollectionAlbumsItem.q() : null;
        ProtoAlbumCollectionState o = protoCollectionAlbumsItem.n() ? protoCollectionAlbumsItem.o() : null;
        if (protoCollectionAlbumsItem.k()) {
            str = protoCollectionAlbumsItem.d;
        }
        return a(m, q, o, str, protoCollectionAlbumsItem.e);
    }

    public static uyy<uyr> a(final ProtoCollectionArtistsResponse protoCollectionArtistsResponse) {
        final uyr[] uyrArr = new uyr[protoCollectionArtistsResponse.k()];
        int i = 0;
        for (ProtoCollectionArtistsItem a : protoCollectionArtistsResponse.d) {
            int i2 = i + 1;
            uyrArr[i] = a(a);
            i = i2;
        }
        return new uyy<uyr>() {
            public final boolean isLoading() {
                return protoCollectionArtistsResponse.g;
            }

            public final int getUnfilteredLength() {
                return protoCollectionArtistsResponse.e;
            }

            public final int getUnrangedLength() {
                return protoCollectionArtistsResponse.f;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return uyrArr;
            }
        };
    }

    private static uyr a(ProtoCollectionArtistsItem protoCollectionArtistsItem) {
        String str = null;
        ProtoArtistMetadata m = protoCollectionArtistsItem.l() ? protoCollectionArtistsItem.m() : null;
        ProtoArtistOfflineState q = protoCollectionArtistsItem.p() ? protoCollectionArtistsItem.q() : null;
        ProtoArtistCollectionState o = protoCollectionArtistsItem.n() ? protoCollectionArtistsItem.o() : null;
        if (protoCollectionArtistsItem.k()) {
            str = protoCollectionArtistsItem.d;
        }
        return a(m, q, o, str, protoCollectionArtistsItem.e);
    }

    private static uyr a(final ProtoTrackArtistMetadata protoTrackArtistMetadata) {
        if (protoTrackArtistMetadata == null) {
            return null;
        }
        return new uyr() {
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

            public final int getNumAlbumsInCollection() {
                return 0;
            }

            public final int getNumTracksInCollection() {
                return 0;
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

            public final String getTitle() {
                return getName();
            }

            public final String getTargetUri() {
                return iqp.a((uyr) this);
            }

            public final String getUri() {
                return protoTrackArtistMetadata.d;
            }

            public final String getImageUri() {
                return (String) jtc.a(protoTrackArtistMetadata.k().d, "");
            }

            public final String getImageUri(Size size) {
                int i = AnonymousClass7.a[size.ordinal()];
                String str = "";
                if (i == 1) {
                    return (String) jtc.a(protoTrackArtistMetadata.k().d, str);
                }
                if (i == 2) {
                    return (String) jtc.a(protoTrackArtistMetadata.k().e, str);
                }
                if (i != 3) {
                    return (String) jtc.a(protoTrackArtistMetadata.k().g, str);
                }
                return (String) jtc.a(protoTrackArtistMetadata.k().f, str);
            }

            public final String getName() {
                return protoTrackArtistMetadata.e;
            }

            public final uzf getOfflineState() {
                return new f();
            }
        };
    }

    public static uyq a(final ProtoTrackAlbumMetadata protoTrackAlbumMetadata) {
        ProtoImageGroup protoImageGroup = null;
        if (protoTrackAlbumMetadata == null) {
            return null;
        }
        if (protoTrackAlbumMetadata.m()) {
            protoImageGroup = protoTrackAlbumMetadata.n();
        }
        final Covers a = a(protoImageGroup);
        return new uyq() {
            public final int getAddTime() {
                return 0;
            }

            public final String getCollectionUri() {
                return "";
            }

            public final String getCopyright() {
                return "";
            }

            public final String getHeader() {
                return null;
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

            public final String getTitle() {
                return getName();
            }

            public final String getTargetUri() {
                return iqp.a((uyq) this);
            }

            public final String getUri() {
                return protoTrackAlbumMetadata.d;
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

            public final uyr getArtist() {
                ProtoTrackAlbumArtistMetadata l = protoTrackAlbumMetadata.k() ? protoTrackAlbumMetadata.l() : null;
                if (l == null) {
                    return null;
                }
                return new uyr(l) {
                    private /* synthetic */ ProtoTrackAlbumArtistMetadata a;

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

                    public final int getNumAlbumsInCollection() {
                        return 0;
                    }

                    public final int getNumTracksInCollection() {
                        return 0;
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

                    {
                        this.a = r1;
                    }

                    public final String getTitle() {
                        return getName();
                    }

                    public final String getTargetUri() {
                        return iqp.a((uyr) this);
                    }

                    public final String getUri() {
                        return this.a.d;
                    }

                    public final String getName() {
                        return this.a.e;
                    }

                    public final uzf getOfflineState() {
                        return new f();
                    }
                };
            }

            public final ImmutableList<uyr> getArtists() {
                uyr artist = getArtist();
                return artist == null ? ImmutableList.d() : ImmutableList.a(artist);
            }

            public final Covers getCovers() {
                return a;
            }

            public final uzf getOfflineState() {
                return new f();
            }
        };
    }

    private static Covers a(final ProtoImageGroup protoImageGroup) {
        if (protoImageGroup == null) {
            return null;
        }
        return new Covers() {
            public final String getUri() {
                return (String) jtc.a(protoImageGroup.d, "");
            }

            public final String getSmallUri() {
                return (String) jtc.a(protoImageGroup.e, "");
            }

            public final String getLargeUri() {
                return (String) jtc.a(protoImageGroup.f, "");
            }

            public final String getXlargeUri() {
                return (String) jtc.a(protoImageGroup.g, "");
            }

            public final String getImageUri(Size size) {
                return uze.a(this, size);
            }
        };
    }

    public static uzc a(final ProtoTrackMetadata protoTrackMetadata, ProtoTrackOfflineState protoTrackOfflineState, ProtoTrackPlayState protoTrackPlayState, ProtoTrackCollectionState protoTrackCollectionState, int i, final String str) {
        if (!fax.a(str)) {
            return new uzc() {
                public final boolean canAddToCollection() {
                    return false;
                }

                public final boolean canBan() {
                    return false;
                }

                public final int getAddTime() {
                    return 0;
                }

                public final uzd getAddedBy() {
                    return null;
                }

                public final List<uyr> getArtists() {
                    return null;
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

                public final String getTargetUri() {
                    return getUri();
                }

                public final uyq getAlbum() {
                    ProtoTrackMetadata protoTrackMetadata = protoTrackMetadata;
                    ProtoTrackAlbumMetadata protoTrackAlbumMetadata = null;
                    if (protoTrackMetadata == null) {
                        return null;
                    }
                    if (protoTrackMetadata.k()) {
                        protoTrackAlbumMetadata = protoTrackMetadata.l();
                    }
                    return ipo.a(protoTrackAlbumMetadata);
                }

                public final String getHeader() {
                    return str;
                }

                public final uzf getOfflineState() {
                    return new f();
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
        final uyq a2 = a(protoTrackAlbumMetadata);
        final ProtoTrackMetadata protoTrackMetadata2 = protoTrackMetadata;
        final ProtoTrackCollectionState protoTrackCollectionState2 = protoTrackCollectionState;
        final ProtoTrackPlayState protoTrackPlayState2 = protoTrackPlayState;
        final ProtoTrackOfflineState protoTrackOfflineState2 = protoTrackOfflineState;
        final int i2 = i;
        AnonymousClass2 r0 = new uzc() {
            public final uzd getAddedBy() {
                return null;
            }

            public final String getHeader() {
                return null;
            }

            public final boolean is19plus() {
                return false;
            }

            public final boolean isHeader() {
                return false;
            }

            public final String getTitle() {
                return getName();
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String getUri() {
                return protoTrackMetadata2.e;
            }

            public final String getImageUri() {
                return getImageUri(Size.NORMAL);
            }

            public final String getImageUri(Size size) {
                uyq uyq = a2;
                return uyq != null ? uyq.getImageUri(size) : "";
            }

            public final String getName() {
                return protoTrackMetadata2.f;
            }

            public final uyq getAlbum() {
                return a2;
            }

            public final List<uyr> getArtists() {
                return arrayList;
            }

            public final boolean inCollection() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.d;
            }

            public final boolean canAddToCollection() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.e;
            }

            public final boolean isBanned() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.f;
            }

            public final boolean canBan() {
                ProtoTrackCollectionState protoTrackCollectionState = protoTrackCollectionState2;
                return protoTrackCollectionState != null && protoTrackCollectionState.g;
            }

            public final boolean isCurrentlyPlayable() {
                ProtoTrackPlayState protoTrackPlayState = protoTrackPlayState2;
                return protoTrackPlayState != null && protoTrackPlayState.d;
            }

            public final boolean isAvailableInMetadataCatalogue() {
                return protoTrackMetadata2.h;
            }

            public final boolean isExplicit() {
                return protoTrackMetadata2.i;
            }

            public final boolean isLocal() {
                return protoTrackMetadata2.k;
            }

            public final boolean hasLyrics() {
                return protoTrackMetadata2.l;
            }

            public final boolean isPremiumOnly() {
                return protoTrackMetadata2.m;
            }

            public final uzf getOfflineState() {
                ProtoTrackOfflineState protoTrackOfflineState = protoTrackOfflineState2;
                return uzg.a(protoTrackOfflineState == null ? "" : protoTrackOfflineState.d, 0);
            }

            public final int getAddTime() {
                return i2;
            }

            public final String previewId() {
                return protoTrackMetadata2.j;
            }

            public final String playableTrackUri() {
                return protoTrackMetadata2.n;
            }

            public final int getLength() {
                return protoTrackMetadata2.g;
            }
        };
        return r0;
    }

    public static uyq a(ProtoAlbumMetadata protoAlbumMetadata, ProtoAlbumOfflineState protoAlbumOfflineState, ProtoAlbumCollectionState protoAlbumCollectionState, final String str, int i) {
        if (!fax.a(str)) {
            return new uyq() {
                public final int getAddTime() {
                    return 0;
                }

                public final uyr getArtist() {
                    return null;
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

                public final String getTargetUri() {
                    return getUri();
                }

                public final ImmutableList<uyr> getArtists() {
                    return ImmutableList.d();
                }

                public final String getHeader() {
                    return str;
                }

                public final uzf getOfflineState() {
                    return new f();
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
        AnonymousClass4 r0 = new uyq() {
            public final String getHeader() {
                return null;
            }

            public final boolean isHeader() {
                return false;
            }

            public final String getTitle() {
                return getName();
            }

            public final String getTargetUri() {
                return iqp.a((uyq) this);
            }

            public final String getUri() {
                return protoAlbumMetadata2.e;
            }

            public final String getImageUri() {
                return getImageUri(Size.NORMAL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getCollectionUri() {
                ProtoAlbumCollectionState protoAlbumCollectionState = protoAlbumCollectionState2;
                return (String) jtc.a(protoAlbumCollectionState == null ? null : protoAlbumCollectionState.d, "");
            }

            public final String getName() {
                return protoAlbumMetadata2.f;
            }

            public final uyr getArtist() {
                return ipo.a(protoAlbumMetadata2.d.size() > 0 ? (ProtoAlbumArtistMetadata) protoAlbumMetadata2.d.get(0) : null);
            }

            public final ImmutableList<uyr> getArtists() {
                a g = ImmutableList.g();
                for (ProtoAlbumArtistMetadata a2 : protoAlbumMetadata2.d) {
                    g.c(ipo.a(a2));
                }
                return g.a();
            }

            public final Covers getCovers() {
                return a;
            }

            public final uzf getOfflineState() {
                ProtoAlbumOfflineState protoAlbumOfflineState = protoAlbumOfflineState2;
                String str = protoAlbumOfflineState == null ? null : protoAlbumOfflineState.d;
                ProtoAlbumOfflineState protoAlbumOfflineState2 = protoAlbumOfflineState2;
                return uzg.a(str, protoAlbumOfflineState2 == null ? 0 : protoAlbumOfflineState2.e);
            }

            public final int getYear() {
                return protoAlbumMetadata2.h;
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

            public final String getCopyright() {
                return (String) jtc.a(protoAlbumMetadata2.g, "");
            }

            public final boolean isAnyTrackPlayable() {
                return protoAlbumMetadata2.k;
            }

            public final boolean isSavedToCollection() {
                ProtoAlbumCollectionState protoAlbumCollectionState = protoAlbumCollectionState2;
                return protoAlbumCollectionState != null && protoAlbumCollectionState.f;
            }

            public final int getAddTime() {
                return i2;
            }
        };
        return r0;
    }

    public static uyr a(ProtoArtistMetadata protoArtistMetadata, ProtoArtistOfflineState protoArtistOfflineState, ProtoArtistCollectionState protoArtistCollectionState, final String str, int i) {
        if (!fax.a(str)) {
            return new uyr() {
                public final int getAddTime() {
                    return 0;
                }

                public final String getCollectionUri() {
                    return "";
                }

                public final Covers getCovers() {
                    return null;
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

                public final String getTitle() {
                    return getName();
                }

                public final String getTargetUri() {
                    return getUri();
                }

                public final String getHeader() {
                    return str;
                }

                public final uzf getOfflineState() {
                    return new f();
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
        AnonymousClass6 r0 = new uyr() {
            public final String getHeader() {
                return null;
            }

            public final boolean isHeader() {
                return false;
            }

            public final String getTitle() {
                return getName();
            }

            public final String getTargetUri() {
                return iqp.a((uyr) this);
            }

            public final String getUri() {
                return protoArtistMetadata2.d;
            }

            public final String getImageUri() {
                return getImageUri(Size.NORMAL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String getCollectionUri() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                return (String) jtc.a(protoArtistCollectionState == null ? null : protoArtistCollectionState.d, "");
            }

            public final String getName() {
                return protoArtistMetadata2.e;
            }

            public final Covers getCovers() {
                return a;
            }

            public final uzf getOfflineState() {
                ProtoArtistOfflineState protoArtistOfflineState = protoArtistOfflineState2;
                String str = protoArtistOfflineState == null ? null : protoArtistOfflineState.d;
                ProtoArtistOfflineState protoArtistOfflineState2 = protoArtistOfflineState2;
                return uzg.a(str, protoArtistOfflineState2 == null ? 0 : protoArtistOfflineState2.e);
            }

            public final int getNumTracksInCollection() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                if (protoArtistCollectionState == null) {
                    return 0;
                }
                return protoArtistCollectionState.f;
            }

            public final int getNumAlbumsInCollection() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                if (protoArtistCollectionState == null) {
                    return 0;
                }
                return protoArtistCollectionState.g;
            }

            public final boolean isFollowed() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                return protoArtistCollectionState != null && protoArtistCollectionState.e;
            }

            public final boolean isDismissed() {
                ProtoArtistCollectionState protoArtistCollectionState = protoArtistCollectionState2;
                return protoArtistCollectionState != null && protoArtistCollectionState.h;
            }

            public final boolean isVariousArtists() {
                return protoArtistMetadata2.f;
            }

            public final int getAddTime() {
                return i2;
            }
        };
        return r0;
    }

    static /* synthetic */ uyr a(final ProtoAlbumArtistMetadata protoAlbumArtistMetadata) {
        if (protoAlbumArtistMetadata == null) {
            return null;
        }
        return new uyr() {
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

            public final int getNumAlbumsInCollection() {
                return 0;
            }

            public final int getNumTracksInCollection() {
                return 0;
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

            public final String getTitle() {
                return getName();
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String getUri() {
                return protoAlbumArtistMetadata.d;
            }

            public final String getName() {
                return protoAlbumArtistMetadata.e;
            }

            public final uzf getOfflineState() {
                return new f();
            }
        };
    }
}
