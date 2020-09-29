package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistFormatListAttribute;
import com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistMetadata;
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
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: uyg reason: default package */
public final class uyg {
    static uyz a(ProtoPlaylistMetadata protoPlaylistMetadata, ProtoPlaylistOfflineState protoPlaylistOfflineState, String str, int i, Optional<Boolean> optional) {
        Map map;
        ProtoUser protoUser = null;
        if (protoPlaylistMetadata == null) {
            return null;
        }
        final Covers a = a(protoPlaylistMetadata.m() ? protoPlaylistMetadata.n() : null);
        final uzd a2 = a(protoPlaylistMetadata.k() ? protoPlaylistMetadata.l() : null);
        if (protoPlaylistMetadata.p()) {
            protoUser = protoPlaylistMetadata.q();
        }
        final uzd a3 = a(protoUser);
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
        AnonymousClass11 r0 = new uyz() {
            public final boolean f() {
                return false;
            }

            public final String getHeader() {
                return null;
            }

            public final boolean isHeader() {
                return false;
            }

            public final uyv r() {
                return null;
            }

            public final String getTitle() {
                return a();
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String getUri() {
                return (String) jtc.a(protoPlaylistMetadata2.d, "");
            }

            public final String getImageUri() {
                return getImageUri(Size.SMALL);
            }

            public final String getImageUri(Size size) {
                Covers covers = a;
                return covers != null ? covers.getImageUri(size) : "";
            }

            public final String a() {
                return (String) jtc.a(protoPlaylistMetadata2.e, "");
            }

            public final String b() {
                return protoPlaylistMetadata2.i;
            }

            public final Covers c() {
                return a;
            }

            public final uzd d() {
                return a2;
            }

            public final boolean e() {
                return protoPlaylistMetadata2.r;
            }

            public final boolean g() {
                return protoPlaylistMetadata2.g;
            }

            public final boolean h() {
                return protoPlaylistMetadata2.j;
            }

            public final boolean i() {
                return protoPlaylistMetadata2.k;
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

            public final uzf s() {
                ProtoPlaylistOfflineState protoPlaylistOfflineState = protoPlaylistOfflineState2;
                String str = protoPlaylistOfflineState == null ? null : protoPlaylistOfflineState.d;
                ProtoPlaylistOfflineState protoPlaylistOfflineState2 = protoPlaylistOfflineState2;
                return uzg.a(str, protoPlaylistOfflineState2 == null ? 0 : protoPlaylistOfflineState2.e);
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

            public final uzd w() {
                return a3;
            }
        };
        return r0;
    }

    private static uyz a(final ProtoPlaylistRootFolder protoPlaylistRootFolder, final String str, final int i) {
        if (!protoPlaylistRootFolder.k()) {
            return null;
        }
        final uyz[] uyzArr = new uyz[protoPlaylistRootFolder.d.size()];
        int i2 = 0;
        for (ProtoPlaylistRootItem a : protoPlaylistRootFolder.d) {
            int i3 = i2 + 1;
            uyzArr[i2] = a(a);
            i2 = i3;
        }
        final AnonymousClass13 r1 = new uyv() {
            public final boolean isLoading() {
                return false;
            }

            public final int getUnfilteredLength() {
                return uyzArr.length;
            }

            public final int getUnrangedLength() {
                return uyzArr.length;
            }

            public final String a() {
                return (String) jtc.a(protoPlaylistRootFolder.l().d, "");
            }

            public final String b() {
                return (String) jtc.a(protoPlaylistRootFolder.l().g, "");
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
                return uyzArr;
            }
        };
        return new uyz() {
            public final String b() {
                return null;
            }

            public final Covers c() {
                return null;
            }

            public final uzd d() {
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

            public final boolean o() {
                return false;
            }

            public final String p() {
                return "";
            }

            public final int t() {
                return 0;
            }

            public final uzd w() {
                return null;
            }

            public final String getTitle() {
                return a();
            }

            public final String getTargetUri() {
                return getUri();
            }

            public final String a() {
                return (String) jtc.a(protoPlaylistRootFolder.l().d, "");
            }

            public final Optional<Boolean> n() {
                return Optional.e();
            }

            public final ImmutableMap<String, String> q() {
                return ImmutableMap.f();
            }

            public final uyv r() {
                return r1;
            }

            public final String u() {
                return str;
            }

            public final int v() {
                return i;
            }

            public final uzf s() {
                return new f();
            }
        };
    }

    private static uzd a(final ProtoUser protoUser) {
        if (protoUser == null) {
            return null;
        }
        return new uzd() {
            public final String a() {
                return (String) jtc.a(protoUser.d, "");
            }

            public final String b() {
                return (String) jtc.a(protoUser.e, "");
            }

            public final String c() {
                if (d()) {
                    return protoUser.f;
                }
                return b();
            }

            public final boolean d() {
                return !fax.a(protoUser.f);
            }

            public final String e() {
                return protoUser.g;
            }

            public final String f() {
                return protoUser.h;
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
                String collectionUri = getCollectionUri();
                return (getNumTracksInCollection() == 0 || fax.a(collectionUri)) ? getUri() : collectionUri;
            }

            public final String getUri() {
                return protoTrackArtistMetadata.d;
            }

            public final String getName() {
                return protoTrackArtistMetadata.e;
            }

            public final uzf getOfflineState() {
                return new f();
            }
        };
    }

    private static uyq a(final ProtoTrackAlbumMetadata protoTrackAlbumMetadata) {
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
                String collectionUri = getCollectionUri();
                return fax.a(collectionUri) ? getUri() : collectionUri;
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
                        String collectionUri = getCollectionUri();
                        return (getNumTracksInCollection() == 0 || fax.a(collectionUri)) ? getUri() : collectionUri;
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

    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [uys] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r23v0, types: [com.spotify.playlist.models.Show] */
    /* JADX WARNING: type inference failed for: r11v17, types: [uyg$4] */
    /* JADX WARNING: type inference failed for: r17v0, types: [com.spotify.playlist.models.Show] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5, types: [com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup] */
    /* JADX WARNING: type inference failed for: r13v6, types: [uyg$6] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8, types: [com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup] */
    /* JADX WARNING: type inference failed for: r8v9, types: [uyg$3] */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], uyg$3, com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup]
      uses: [uys, ?[OBJECT, ARRAY], com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup]
      mth insns count: 182
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.uza a(com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoPlaylistResponse r26) {
        /*
            r0 = r26
            fki$e<com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistItem> r1 = r0.e
            int r1 = r1.size()
            uzb[] r1 = new defpackage.uzb[r1]
            fki$e<com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistItem> r2 = r0.e
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 0
        L_0x0012:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01c4
            java.lang.Object r5 = r2.next()
            com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistItem r5 = (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest.ProtoPlaylistItem) r5
            int r6 = r4 + 1
            int r7 = r5.d
            r8 = 8
            r7 = r7 & r8
            r9 = 1
            if (r7 != r8) goto L_0x002a
            r7 = 1
            goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            r8 = 0
            if (r7 == 0) goto L_0x0034
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata r7 = r5.m()
            r10 = r7
            goto L_0x0035
        L_0x0034:
            r10 = r8
        L_0x0035:
            int r7 = r5.d
            r11 = 32
            r7 = r7 & r11
            if (r7 != r11) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x0047
            com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackOfflineState r7 = r5.o()
            r11 = r7
            goto L_0x0048
        L_0x0047:
            r11 = r8
        L_0x0048:
            int r7 = r5.d
            r12 = 16
            r7 = r7 & r12
            if (r7 != r12) goto L_0x0051
            r7 = 1
            goto L_0x0052
        L_0x0051:
            r7 = 0
        L_0x0052:
            if (r7 == 0) goto L_0x005a
            com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackCollectionState r7 = r5.n()
            r12 = r7
            goto L_0x005b
        L_0x005a:
            r12 = r8
        L_0x005b:
            int r7 = r5.d
            r13 = 128(0x80, float:1.794E-43)
            r7 = r7 & r13
            if (r7 != r13) goto L_0x0064
            r7 = 1
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            if (r7 == 0) goto L_0x006d
            com.spotify.mobile.android.spotlets.collection.proto.TrackState$ProtoTrackPlayState r7 = r5.p()
            r13 = r7
            goto L_0x006e
        L_0x006d:
            r13 = r8
        L_0x006e:
            int r7 = r5.d
            r14 = 4
            r7 = r7 & r14
            if (r7 != r14) goto L_0x0076
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            if (r7 == 0) goto L_0x007f
            com.spotify.mobile.android.playlist.proto.PlaylistUserState$ProtoUser r7 = r5.l()
            r14 = r7
            goto L_0x0080
        L_0x007f:
            r14 = r8
        L_0x0080:
            int r15 = r5.f
            boolean r7 = r5.k()
            if (r7 == 0) goto L_0x008d
            java.lang.String r7 = r5.e
            r16 = r7
            goto L_0x008f
        L_0x008d:
            r16 = r8
        L_0x008f:
            uzc r7 = a(r10, r11, r12, r13, r14, r15, r16)
            int r10 = r5.d
            r11 = 256(0x100, float:3.59E-43)
            r10 = r10 & r11
            if (r10 != r11) goto L_0x009c
            r10 = 1
            goto L_0x009d
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 == 0) goto L_0x00a5
            com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata r10 = r5.q()
            r12 = r10
            goto L_0x00a6
        L_0x00a5:
            r12 = r8
        L_0x00a6:
            int r10 = r5.d
            r11 = 512(0x200, float:7.175E-43)
            r10 = r10 & r11
            if (r10 != r11) goto L_0x00af
            r10 = 1
            goto L_0x00b0
        L_0x00af:
            r10 = 0
        L_0x00b0:
            if (r10 == 0) goto L_0x00b9
            com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState r10 = r5.r()
            r18 = r10
            goto L_0x00bb
        L_0x00b9:
            r18 = r8
        L_0x00bb:
            int r10 = r5.d
            r11 = 2048(0x800, float:2.87E-42)
            r10 = r10 & r11
            if (r10 != r11) goto L_0x00c4
            r10 = 1
            goto L_0x00c5
        L_0x00c4:
            r10 = 0
        L_0x00c5:
            if (r10 == 0) goto L_0x00ce
            com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState r10 = r5.t()
            r16 = r10
            goto L_0x00d0
        L_0x00ce:
            r16 = r8
        L_0x00d0:
            int r10 = r5.d
            r11 = 1024(0x400, float:1.435E-42)
            r10 = r10 & r11
            if (r10 != r11) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r9 = 0
        L_0x00d9:
            if (r9 == 0) goto L_0x00e1
            com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState r9 = r5.s()
            r15 = r9
            goto L_0x00e2
        L_0x00e1:
            r15 = r8
        L_0x00e2:
            boolean r9 = r5.k()
            if (r9 == 0) goto L_0x00eb
            java.lang.String r9 = r5.e
            goto L_0x00ec
        L_0x00eb:
            r9 = r8
        L_0x00ec:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r3)
            boolean r11 = defpackage.fax.a(r9)
            if (r11 != 0) goto L_0x00fe
            uyg$3 r8 = new uyg$3
            r8.<init>(r10, r9)
            goto L_0x018a
        L_0x00fe:
            if (r12 != 0) goto L_0x0102
            goto L_0x018a
        L_0x0102:
            boolean r9 = r12.m()
            if (r9 == 0) goto L_0x010d
            com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup r9 = r12.n()
            goto L_0x010e
        L_0x010d:
            r9 = r8
        L_0x010e:
            com.spotify.playlist.models.Covers r9 = a(r9)
            boolean r10 = r12.o()
            if (r10 == 0) goto L_0x011d
            com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup r10 = r12.p()
            goto L_0x011e
        L_0x011d:
            r10 = r8
        L_0x011e:
            com.spotify.playlist.models.Covers r10 = a(r10)
            boolean r11 = r12.k()
            if (r11 == 0) goto L_0x012d
            com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeShowMetadata r11 = r12.l()
            goto L_0x012e
        L_0x012d:
            r11 = r8
        L_0x012e:
            if (r11 != 0) goto L_0x0131
            goto L_0x0145
        L_0x0131:
            boolean r13 = r11.k()
            if (r13 == 0) goto L_0x013b
            com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup r8 = r11.l()
        L_0x013b:
            com.spotify.playlist.models.Covers r8 = a(r8)
            uyg$6 r13 = new uyg$6
            r13.<init>(r11, r8)
            r8 = r13
        L_0x0145:
            boolean r11 = r12.q()
            if (r11 == 0) goto L_0x014e
            int r11 = r12.k
            goto L_0x014f
        L_0x014e:
            r11 = -1
        L_0x014f:
            com.spotify.playlist.models.Show$MediaType r25 = defpackage.uze.a(r11)
            java.lang.String r11 = r12.e
            java.lang.String r13 = r12.g
            r19 = r9
            r20 = r10
            r21 = r11
            r22 = r13
            r23 = r8
            r24 = r25
            java.util.Map r14 = defpackage.uze.a(r19, r20, r21, r22, r23, r24)
            boolean r11 = r12.r()
            if (r11 == 0) goto L_0x0178
            boolean r11 = r12.l
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r13 = "is_backgroundable"
            r14.put(r13, r11)
        L_0x0178:
            uyg$4 r21 = new uyg$4
            r11 = r21
            r13 = r9
            r9 = r14
            r14 = r10
            r17 = r8
            r19 = r9
            r20 = r25
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8 = r21
        L_0x018a:
            fki$e<com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> r9 = r5.h
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x01b6
            fki$e<com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> r9 = r5.h
            int r9 = r9.size()
            java.util.HashMap r9 = com.google.common.collect.Maps.a(r9)
            fki$e<com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> r10 = r5.h
            java.util.Iterator r10 = r10.iterator()
        L_0x01a2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ba
            java.lang.Object r11 = r10.next()
            com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute r11 = (com.spotify.mobile.android.playlist.proto.PlaylistPlaylistMetadata.ProtoPlaylistFormatListAttribute) r11
            java.lang.String r12 = r11.d
            java.lang.String r11 = r11.e
            r9.put(r12, r11)
            goto L_0x01a2
        L_0x01b6:
            java.util.Map r9 = java.util.Collections.emptyMap()
        L_0x01ba:
            uyg$15 r10 = new uyg$15
            r10.<init>(r8, r7, r9, r5)
            r1[r4] = r10
            r4 = r6
            goto L_0x0012
        L_0x01c4:
            uyg$1 r2 = new uyg$1
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyg.a(com.spotify.mobile.android.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistResponse):uza");
    }

    public static uyv a(final ProtoPlaylistRootResponse protoPlaylistRootResponse) {
        boolean z = true;
        int i = 0;
        if ((protoPlaylistRootResponse.d & 1) != 1) {
            z = false;
        }
        if (!z || !protoPlaylistRootResponse.k().k()) {
            return null;
        }
        final uyz[] uyzArr = new uyz[protoPlaylistRootResponse.k().d.size()];
        for (ProtoPlaylistRootItem a : protoPlaylistRootResponse.k().d) {
            int i2 = i + 1;
            uyzArr[i] = a(a);
            i = i2;
        }
        return new uyv() {
            public final boolean isLoading() {
                return false;
            }

            public final int getUnfilteredLength() {
                return protoPlaylistRootResponse.e;
            }

            public final int getUnrangedLength() {
                return protoPlaylistRootResponse.f;
            }

            public final String a() {
                return (String) jtc.a(protoPlaylistRootResponse.k().l().d, "");
            }

            public final String b() {
                return (String) jtc.a(protoPlaylistRootResponse.k().l().g, "");
            }

            public final int c() {
                return protoPlaylistRootResponse.k().l().e;
            }

            public final int d() {
                return protoPlaylistRootResponse.k().l().f;
            }

            public final int e() {
                return protoPlaylistRootResponse.k().f;
            }

            public final /* bridge */ /* synthetic */ Object[] getItems() {
                return uyzArr;
            }
        };
    }

    private static uyz a(final ProtoPlaylistRootItem protoPlaylistRootItem) {
        Optional optional;
        if (!fax.a(protoPlaylistRootItem.d)) {
            return new uyz() {
                public final String a() {
                    return "";
                }

                public final String b() {
                    return null;
                }

                public final Covers c() {
                    return null;
                }

                public final uzd d() {
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

                public final String getImageUri() {
                    return "";
                }

                public final String getImageUri(Size size) {
                    return "";
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

                public final boolean o() {
                    return false;
                }

                public final String p() {
                    return "";
                }

                public final uyv r() {
                    return null;
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

                public final uzd w() {
                    return null;
                }

                public final String getTargetUri() {
                    return getUri();
                }

                public final Optional<Boolean> n() {
                    return Optional.e();
                }

                public final ImmutableMap<String, String> q() {
                    return ImmutableMap.f();
                }

                public final String getHeader() {
                    return protoPlaylistRootItem.d;
                }

                public final uzf s() {
                    return new f();
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
        String str = m.d;
        int i = m.e;
        if (m.o()) {
            optional = Optional.b(Boolean.valueOf(m.f));
        } else {
            optional = Optional.e();
        }
        return a(l2, protoPlaylistOfflineState, str, i, optional);
    }

    static uzc a(ProtoTrackMetadata protoTrackMetadata, ProtoTrackOfflineState protoTrackOfflineState, ProtoTrackCollectionState protoTrackCollectionState, ProtoTrackPlayState protoTrackPlayState, ProtoUser protoUser, int i, final String str) {
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

                public final uyq getAlbum() {
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
        final uzd a = a(protoUser);
        e<ProtoTrackArtistMetadata> eVar = protoTrackMetadata.d;
        final ArrayList arrayList = new ArrayList(eVar.size());
        for (ProtoTrackArtistMetadata a2 : eVar) {
            arrayList.add(a(a2));
        }
        if (protoTrackMetadata.k()) {
            protoTrackAlbumMetadata = protoTrackMetadata.l();
        }
        final uyq a3 = a(protoTrackAlbumMetadata);
        final ProtoTrackMetadata protoTrackMetadata2 = protoTrackMetadata;
        final ProtoTrackCollectionState protoTrackCollectionState2 = protoTrackCollectionState;
        final ProtoTrackPlayState protoTrackPlayState2 = protoTrackPlayState;
        final ProtoTrackOfflineState protoTrackOfflineState2 = protoTrackOfflineState;
        final int i2 = i;
        AnonymousClass2 r0 = new uzc() {
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
                uyq uyq = a3;
                return uyq != null ? uyq.getImageUri(size) : "";
            }

            public final String getName() {
                return protoTrackMetadata2.f;
            }

            public final uzd getAddedBy() {
                return a;
            }

            public final uyq getAlbum() {
                return a3;
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
                return protoTrackPlayState == null || !protoTrackPlayState.k() || protoTrackPlayState2.d;
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
}
