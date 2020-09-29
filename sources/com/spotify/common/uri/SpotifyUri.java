package com.spotify.common.uri;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SpotifyUri implements Comparable<SpotifyUri> {
    public final Kind a;
    public final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final long g;
    private final Kind h;
    private final List<String> i;
    private final String j;

    public enum Kind {
        EMPTY,
        ARTIST,
        ARTIST_CONCERTS,
        ALBUM,
        SEARCH,
        TRACK,
        AUDIO,
        WORK,
        GENRE,
        PLAYLIST,
        PLAYLIST_V2,
        PLAYLISTS,
        ACTIVATE,
        INTERNAL_VIEW,
        INTERNAL,
        LOCAL_TRACK("local"),
        USER,
        STARRED,
        AD,
        INTERRUPTION,
        TOPLIST,
        RECENTLY_PLAYED,
        RADIO,
        STATION,
        IMAGE,
        PARTNER,
        TRACK_SET,
        AUTOSTART,
        LOGIN_DELAY,
        APPLICATION,
        FACEBOOK_USER("facebook"),
        COLLECTION_ROOT("collectionrootlist"),
        COLLECTION_TRACKLIST("collectiontracklist"),
        PUBLISHED_ROOT("publishedrootlist"),
        PROFILE_CONTAINER,
        INBOX_PLAYLIST("inbox"),
        PLAYLIST_ROOT("rootlist"),
        PURCHASE_PLAYLIST("purchaselist"),
        PUBLISHED_STARRED,
        MASKED_STARRED,
        TOPFRIENDS,
        MASKED_TOPLIST,
        OUTBOX_PLAYLIST("outbox"),
        LIBRARY,
        STARTGROUP("start-group"),
        ENDGROUP("end-group"),
        VIDEO,
        RECORDING,
        CANVAS,
        UNKNOWN,
        TOPTRACKS,
        SHOW,
        EPISODE,
        ADSPACE,
        CHART,
        PARTY,
        RUNNING,
        CLUSTER,
        DAILYMIX,
        LINK,
        IMAGESET,
        SPACE,
        CONCERT,
        MOSAIC,
        COLLECTION,
        COLLECTION_ALBUM,
        COLLECTION_ARTIST,
        PREMIUM_DESTINATION,
        UPSELL,
        DEVICEPRESET,
        TOGETHER,
        SOCIALSESSION,
        LICENSOR,
        CUSTOM_STATION("station"),
        ZEROTAP,
        HOME,
        SONG,
        FOLDER;
        
        private static Map<String, Kind> aA;
        String name;

        static {
            int i;
            Kind[] values;
            aA = new HashMap();
            for (Kind kind : values()) {
                aA.put(kind.name, kind);
            }
        }

        private Kind(String str) {
            this.name = str;
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        SpotifyUri spotifyUri = (SpotifyUri) obj;
        Kind kind = this.a;
        Kind kind2 = spotifyUri.a;
        if (kind != kind2) {
            return kind.compareTo(kind2);
        }
        Kind kind3 = this.h;
        Kind kind4 = spotifyUri.h;
        if (kind3 != kind4) {
            return kind3.compareTo(kind4);
        }
        int a2 = a(this.d, spotifyUri.d);
        if (a2 != 0) {
            return a2;
        }
        int a3 = a(this.b, spotifyUri.b);
        if (a3 != 0) {
            return a3;
        }
        int a4 = a(this.e, spotifyUri.e);
        if (a4 != 0) {
            return a4;
        }
        int a5 = a(this.f, spotifyUri.f);
        if (a5 != 0) {
            return a5;
        }
        return Long.valueOf(this.g).compareTo(Long.valueOf(spotifyUri.g));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v56 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r1v71, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v74 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r4v67 */
    /* JADX WARNING: type inference failed for: r1v76, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r4v68 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r4v70 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r1v89, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r5v66 */
    /* JADX WARNING: type inference failed for: r4v71 */
    /* JADX WARNING: type inference failed for: r3v45 */
    /* JADX WARNING: type inference failed for: r4v72 */
    /* JADX WARNING: type inference failed for: r3v46 */
    /* JADX WARNING: type inference failed for: r1v160 */
    /* JADX WARNING: type inference failed for: r1v161 */
    /* JADX WARNING: type inference failed for: r5v67 */
    /* JADX WARNING: type inference failed for: r3v47 */
    /* JADX WARNING: type inference failed for: r5v68 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1
      assigns: []
      uses: []
      mth insns count: 727
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARNING: Unknown variable types count: 17 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SpotifyUri(java.lang.String r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r18.<init>()
            r0.c = r1
            gcf r2 = new gcf
            r2.<init>(r1)
            r2.d()
            boolean r3 = r2.c()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0031
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ACTIVATE
            r0.a = r1
            r0.b = r6
            r0.d = r6
            r0.f = r6
            r0.e = r6
            r0.g = r4
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.UNKNOWN
            r0.h = r1
            r0.i = r6
            r0.j = r6
            return
        L_0x0031:
            java.lang.String r3 = r2.a()
            com.spotify.common.uri.SpotifyUri$Kind r7 = com.spotify.common.uri.SpotifyUri.Kind.UNKNOWN
            java.lang.String r8 = "album"
            boolean r9 = r3.equals(r8)
            if (r9 == 0) goto L_0x004d
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ALBUM
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x004d:
            java.lang.String r9 = "artist"
            boolean r10 = r3.equals(r9)
            java.lang.String r11 = "Malformed Spotify uri: "
            if (r10 == 0) goto L_0x009d
            java.lang.String r3 = r2.a()
            r0.b = r3
            r0.d = r6
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x006b
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ARTIST
            r0.a = r1
            goto L_0x079a
        L_0x006b:
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "concerts"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x007d
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ARTIST_CONCERTS
            r0.a = r1
            goto L_0x079a
        L_0x007d:
            java.lang.String r3 = "popular-tracks"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x008b
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ARTIST
            r0.a = r1
            goto L_0x079a
        L_0x008b:
            com.spotify.common.uri.SpotifyUriParserException r2 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x009d:
            java.lang.String r10 = "playlist"
            boolean r12 = r3.equals(r10)
            if (r12 == 0) goto L_0x00b3
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PLAYLIST_V2
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x00b3:
            java.lang.String r12 = "playlists"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00c5
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PLAYLISTS
            r0.a = r1
            r0.b = r6
            r0.d = r6
            goto L_0x079a
        L_0x00c5:
            java.lang.String r12 = "search"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00db
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.SEARCH
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x00db:
            java.lang.String r12 = "track"
            boolean r13 = r3.equals(r12)
            if (r13 == 0) goto L_0x00f1
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.TRACK
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x00f1:
            java.lang.String r13 = "work"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0107
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.WORK
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0107:
            java.lang.String r13 = "audio"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x011d
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.AUDIO
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x011d:
            java.lang.String r13 = "trackset"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0133
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.TRACK_SET
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0133:
            java.lang.String r13 = "genre"
            boolean r14 = r3.equals(r13)
            if (r14 == 0) goto L_0x0149
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.GENRE
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0149:
            java.lang.String r14 = "dailymix"
            boolean r14 = r3.equals(r14)
            if (r14 == 0) goto L_0x015f
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.DAILYMIX
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x015f:
            java.lang.String r14 = "collection"
            boolean r15 = r3.equals(r14)
            if (r15 == 0) goto L_0x017d
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.COLLECTION
            r0.a = r1
            boolean r1 = r2.c()
            if (r1 == 0) goto L_0x0173
            r1 = r6
            goto L_0x0177
        L_0x0173:
            java.lang.String r1 = r2.b()
        L_0x0177:
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x017d:
            java.lang.String r15 = "song"
            boolean r15 = r3.equals(r15)
            if (r15 == 0) goto L_0x0193
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.SONG
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0193:
            java.lang.String r15 = "user"
            boolean r16 = r3.equals(r15)
            r17 = 0
            r4 = 1
            if (r16 == 0) goto L_0x03a5
            java.lang.String r3 = r2.a()
            java.lang.String r5 = "facebook"
            boolean r5 = r3.equals(r5)
            r12 = 0
            if (r5 == 0) goto L_0x01b5
            java.lang.String r5 = r2.e()     // Catch:{ NumberFormatException -> 0x01b5 }
            long r15 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x01b5 }
            goto L_0x01b6
        L_0x01b5:
            r15 = r12
        L_0x01b6:
            int r5 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x01c8
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.FACEBOOK_USER
            r0.a = r1
            java.lang.String r1 = r2.e()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x01c8:
            r0.d = r3
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01d8
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.USER
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x01d8:
            java.lang.String r3 = r2.a()
            boolean r5 = r3.equals(r10)
            if (r5 == 0) goto L_0x01ee
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PLAYLIST
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            goto L_0x079a
        L_0x01ee:
            java.lang.String r5 = "collectiontracklist"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0202
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.COLLECTION_TRACKLIST
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            goto L_0x079a
        L_0x0202:
            java.lang.String r5 = "starred"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0212
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.STARRED
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0212:
            java.lang.String r5 = "publishedstarred"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0222
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PUBLISHED_STARRED
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0222:
            java.lang.String r5 = "maskedstarred"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0232
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.MASKED_STARRED
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0232:
            java.lang.String r5 = "toplist"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0242
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.TOPLIST
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0242:
            java.lang.String r5 = "top"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0266
            java.lang.String r1 = r2.a()
            java.lang.String r2 = "tracks"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x025e
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.TOPTRACKS
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x025e:
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.UNKNOWN
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0266:
            java.lang.String r5 = "maskedtoplist"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0276
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.MASKED_TOPLIST
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0276:
            java.lang.String r5 = "recent"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0286
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.RECENTLY_PLAYED
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0286:
            java.lang.String r5 = "collectionrootlist"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0296
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.COLLECTION_ROOT
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0296:
            java.lang.String r5 = "publishedrootlist"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x02a6
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PUBLISHED_ROOT
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x02a6:
            java.lang.String r5 = "profilecontainer"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x02b6
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PROFILE_CONTAINER
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x02b6:
            java.lang.String r5 = "inbox"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x02c6
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.INBOX_PLAYLIST
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x02c6:
            java.lang.String r5 = "outbox"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x02d6
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.OUTBOX_PLAYLIST
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x02d6:
            java.lang.String r5 = "rootlist"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x02e6
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PLAYLIST_ROOT
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x02e6:
            java.lang.String r5 = "topfriends"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x02f6
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.TOPFRIENDS
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x02f6:
            java.lang.String r5 = "purchaselist"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0306
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PURCHASE_PLAYLIST
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0306:
            java.lang.String r5 = "cluster"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x031a
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.CLUSTER
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            goto L_0x079a
        L_0x031a:
            java.lang.String r5 = "folder"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x032e
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.FOLDER
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            goto L_0x079a
        L_0x032e:
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x0393
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0342
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.COLLECTION
            r0.a = r1
            r0.b = r6
            goto L_0x079a
        L_0x0342:
            java.lang.String r3 = r2.a()
            r5 = -1
            int r10 = r3.hashCode()
            r12 = -1409097913(0xffffffffac02df47, float:-1.8598055E-12)
            if (r10 == r12) goto L_0x035e
            r9 = 92896879(0x5897e6f, float:1.2929862E-35)
            if (r10 == r9) goto L_0x0356
            goto L_0x0365
        L_0x0356:
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x0365
            r5 = 0
            goto L_0x0365
        L_0x035e:
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0365
            r5 = 1
        L_0x0365:
            if (r5 == 0) goto L_0x0387
            if (r5 != r4) goto L_0x0375
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.COLLECTION_ARTIST
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            goto L_0x079a
        L_0x0375:
            com.spotify.common.uri.SpotifyUriParserException r2 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0387:
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.COLLECTION_ALBUM
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            goto L_0x079a
        L_0x0393:
            com.spotify.common.uri.SpotifyUriParserException r2 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x03a5:
            java.lang.String r5 = "local"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0400
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.LOCAL_TRACK
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.e()
            java.lang.String r3 = ":"
            boolean r1 = r1.endsWith(r3)
            java.lang.String r4 = r2.a()
            java.lang.String r5 = r2.a()
            java.lang.String r8 = r2.a()
            r0.b = r8
            boolean r8 = r2.c()
            r9 = -2
            if (r8 != 0) goto L_0x03f5
            java.lang.String r1 = r2.e()     // Catch:{ NumberFormatException -> 0x03dd }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x03dd }
            r3 = r6
            goto L_0x03fc
        L_0x03dd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r3)
            java.lang.String r2 = r2.b()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5 = r1
            goto L_0x03fa
        L_0x03f5:
            if (r1 == 0) goto L_0x03f8
            goto L_0x03fa
        L_0x03f8:
            r9 = -1
        L_0x03fa:
            r3 = r6
            r1 = r9
        L_0x03fc:
            r6 = r4
            r4 = r3
            goto L_0x079f
        L_0x0400:
            java.lang.String r5 = "start-group"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0424
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.STARTGROUP
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.a()
            r0.b = r1
            boolean r1 = r2.c()
            if (r1 != 0) goto L_0x079a
            java.lang.String r1 = r2.b()
            r3 = r6
            r4 = r3
            r5 = r4
            r6 = r1
            goto L_0x079d
        L_0x0424:
            java.lang.String r5 = "end-group"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x043a
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ENDGROUP
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x043a:
            java.lang.String r5 = "radio"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0461
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.RADIO
            r0.a = r1
            r0.d = r6
            r0.b = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x044f:
            boolean r3 = r2.c()
            if (r3 != 0) goto L_0x045d
            java.lang.String r3 = r2.a()
            r1.add(r3)
            goto L_0x044f
        L_0x045d:
            r3 = r1
            r4 = r6
            goto L_0x079c
        L_0x0461:
            java.lang.String r5 = "image"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0477
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.IMAGE
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x0477:
            java.lang.String r5 = "mosaic"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x04a9
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.MOSAIC
            r0.a = r1
            r0.d = r6
            r0.b = r6
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r3 = r2.a()
            r1[r17] = r3
            java.lang.String r3 = r2.a()
            r1[r4] = r3
            r3 = 2
            java.lang.String r4 = r2.a()
            r1[r3] = r4
            r3 = 3
            java.lang.String r2 = r2.b()
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            goto L_0x045d
        L_0x04a9:
            java.lang.String r4 = "station"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0563
            java.lang.String r3 = r2.a()
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x04df
            com.spotify.common.uri.SpotifyUri$Kind r2 = com.spotify.common.uri.SpotifyUri.Kind.CUSTOM_STATION
            r0.a = r2
            com.spotify.common.uri.SpotifyUri$Kind r7 = com.spotify.common.uri.SpotifyUri.Kind.CUSTOM_STATION
            r0.d = r6
            boolean r2 = defpackage.gce.a(r3)
            if (r2 == 0) goto L_0x04cd
            r0.b = r3
            goto L_0x079a
        L_0x04cd:
            com.spotify.common.uri.SpotifyUriParserException r2 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x04df:
            com.spotify.common.uri.SpotifyUri$Kind r4 = com.spotify.common.uri.SpotifyUri.Kind.STATION
            r0.a = r4
            boolean r4 = r3.equals(r15)
            if (r4 == 0) goto L_0x0519
            java.lang.String r3 = r2.a()
            r0.d = r3
            java.lang.String r3 = r2.a()
            boolean r4 = r3.equals(r10)
            if (r4 == 0) goto L_0x04fc
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PLAYLIST
            goto L_0x0523
        L_0x04fc:
            java.lang.String r4 = "cluster"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0507
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.CLUSTER
            goto L_0x0523
        L_0x0507:
            com.spotify.common.uri.SpotifyUriParserException r2 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0519:
            r0.d = r6
            boolean r4 = r3.equals(r9)
            if (r4 == 0) goto L_0x0525
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ARTIST
        L_0x0523:
            r7 = r1
            goto L_0x0549
        L_0x0525:
            boolean r4 = r3.equals(r8)
            if (r4 == 0) goto L_0x052e
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ALBUM
            goto L_0x0523
        L_0x052e:
            boolean r4 = r3.equals(r12)
            if (r4 == 0) goto L_0x0537
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.TRACK
            goto L_0x0523
        L_0x0537:
            boolean r4 = r3.equals(r13)
            if (r4 == 0) goto L_0x0540
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.GENRE
            goto L_0x0523
        L_0x0540:
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0551
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PLAYLIST_V2
            goto L_0x0523
        L_0x0549:
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x0551:
            com.spotify.common.uri.SpotifyUriParserException r2 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0563:
            java.lang.String r4 = "internal"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x058d
            java.lang.String r1 = r2.e()
            java.lang.String r3 = "running:"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x057f
            r2.a()
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.RUNNING
            r0.a = r1
            goto L_0x0583
        L_0x057f:
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.INTERNAL
            r0.a = r1
        L_0x0583:
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x058d:
            java.lang.String r4 = "video"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x05a3
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.VIDEO
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x05a3:
            java.lang.String r4 = "recording"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x05b9
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.RECORDING
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x05b9:
            java.lang.String r4 = "canvas"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x05cf
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.CANVAS
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x05cf:
            java.lang.String r4 = "app"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x05ea
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.APPLICATION
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            java.lang.String r1 = r0.b
            c(r1)
            goto L_0x079a
        L_0x05ea:
            java.lang.String r4 = "show"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0600
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.SHOW
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0600:
            java.lang.String r4 = "episode"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0616
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.EPISODE
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0616:
            java.lang.String r4 = "ad"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x062c
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.AD
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x062c:
            java.lang.String r4 = "adspace"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0642
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ADSPACE
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0642:
            java.lang.String r4 = "interruption"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0658
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.INTERRUPTION
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0658:
            java.lang.String r4 = "chart"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x066e
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.CHART
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x066e:
            java.lang.String r4 = "party"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0684
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PARTY
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0684:
            java.lang.String r4 = "running"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x069a
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.RUNNING
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x069a:
            java.lang.String r4 = "link"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x06b0
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.LINK
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x06b0:
            java.lang.String r4 = "imageset"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x06c6
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.IMAGESET
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x06c6:
            java.lang.String r4 = "space"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x06dc
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.SPACE
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x06dc:
            java.lang.String r4 = "concert"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x06f2
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.CONCERT
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x06f2:
            java.lang.String r4 = "premium-destination"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0704
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.PREMIUM_DESTINATION
            r0.a = r1
            r0.b = r6
            r0.d = r6
            goto L_0x079a
        L_0x0704:
            java.lang.String r4 = "upsell"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x071a
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.UPSELL
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x071a:
            java.lang.String r4 = "devicepreset"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0736
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.DEVICEPRESET
            r0.a = r1
            java.lang.String r1 = r2.a()
            java.lang.String r2 = r2.a()
            r0.b = r2
            r0.d = r6
            r4 = r1
            r3 = r6
            r5 = r3
            goto L_0x079d
        L_0x0736:
            java.lang.String r4 = "together"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x074b
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.TOGETHER
            r0.a = r1
            r0.b = r6
            java.lang.String r1 = r2.a()
            r0.d = r1
            goto L_0x079a
        L_0x074b:
            java.lang.String r4 = "socialsession"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0760
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.SOCIALSESSION
            r0.a = r1
            java.lang.String r1 = r2.a()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0760:
            java.lang.String r4 = "licensor"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0775
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.LICENSOR
            r0.a = r1
            java.lang.String r1 = r2.b()
            r0.b = r1
            r0.d = r6
            goto L_0x079a
        L_0x0775:
            java.lang.String r4 = "zerotap"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x078a
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.ZEROTAP
            r0.a = r1
            r0.d = r6
            java.lang.String r1 = r2.b()
            r0.b = r1
            goto L_0x079a
        L_0x078a:
            java.lang.String r2 = "home"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x07ac
            com.spotify.common.uri.SpotifyUri$Kind r1 = com.spotify.common.uri.SpotifyUri.Kind.HOME
            r0.a = r1
            r0.d = r6
            r0.b = r6
        L_0x079a:
            r3 = r6
            r4 = r3
        L_0x079c:
            r5 = r4
        L_0x079d:
            r1 = -1
        L_0x079f:
            r0.e = r6
            r0.f = r5
            r0.g = r1
            r0.h = r7
            r0.i = r3
            r0.j = r4
            return
        L_0x07ac:
            com.spotify.common.uri.SpotifyUriParserException r2 = new com.spotify.common.uri.SpotifyUriParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x07bf
        L_0x07be:
            throw r2
        L_0x07bf:
            goto L_0x07be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.common.uri.SpotifyUri.<init>(java.lang.String):void");
    }

    private static void c(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == '/' || charAt == '.' || charAt == ':'))) {
                StringBuilder sb = new StringBuilder("Invalid Spotify application id: ");
                sb.append(str);
                throw new SpotifyUriParserException(sb.toString());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("spotify:");
        String str = "station:";
        String str2 = ":cluster:";
        String str3 = "playlist:";
        String str4 = ":playlist:";
        String str5 = "artist:";
        String str6 = ":";
        String str7 = "user:";
        switch (AnonymousClass1.a[this.a.ordinal()]) {
            case 1:
                sb.append(str5);
                sb.append(this.b);
                break;
            case 2:
                sb.append("album:");
                sb.append(this.b);
                break;
            case 3:
                sb.append("track:");
                sb.append(this.b);
                break;
            case 4:
                sb.append("genre:");
                sb.append(this.b);
                break;
            case 5:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(str4);
                sb.append(this.b);
                break;
            case 6:
                sb.append(str3);
                sb.append(this.b);
                break;
            case 7:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(str2);
                sb.append(this.b);
                break;
            case 8:
                sb.append("search:");
                sb.append(d(this.b));
                break;
            case 9:
                sb.append(str5);
                sb.append(this.b);
                sb.append(":concerts");
                break;
            case 10:
                sb.append("work:");
                sb.append(this.b);
                break;
            case 11:
                sb.append("audio:");
                sb.append(this.b);
                break;
            case 12:
                sb.append("activate");
                break;
            case 13:
                sb.append("trackset:");
                sb.append(d(this.b));
                break;
            case 14:
                sb.append("playlists");
                break;
            case 15:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":collectiontracklist:");
                sb.append(this.b);
                break;
            case 16:
                sb.append("local:");
                sb.append(e(this.e));
                sb.append(str6);
                sb.append(e(this.f));
                sb.append(str6);
                sb.append(e(this.b));
                long j2 = this.g;
                if (j2 < 0) {
                    if (j2 != -1) {
                        sb.append(str6);
                        break;
                    }
                } else {
                    sb.append(str6);
                    sb.append(this.g);
                    break;
                }
                break;
            case 17:
                sb.append(str7);
                sb.append(d(this.d));
                break;
            case 18:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":starred");
                break;
            case 19:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":publishedstarred");
                break;
            case 20:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":maskedstarred");
                break;
            case 21:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":toplist");
                break;
            case 22:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":top:tracks");
                break;
            case 23:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":maskedtoplist");
                break;
            case 24:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":recent");
                break;
            case 25:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":collectionrootlist");
                break;
            case 26:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":publishedrootlist");
                break;
            case 27:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":profilecontainer");
                break;
            case 28:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":inbox");
                break;
            case 29:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":rootlist");
                break;
            case 30:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":topfriends");
                break;
            case 31:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":purchaselist");
                break;
            case 32:
                sb.append("radio");
                for (String str8 : this.i) {
                    sb.append(str6);
                    sb.append(d(str8));
                }
                break;
            case 33:
                sb.append("image:");
                sb.append(this.b);
                break;
            case 34:
                sb.append("mosaic:");
                sb.append(String.join(str6, this.i));
                break;
            case 35:
                sb.append(str);
                sb.append(this.b);
                break;
            case 36:
                sb.append(str);
                switch (this.h) {
                    case ARTIST:
                    case ALBUM:
                    case TRACK:
                    case GENRE:
                        sb.append(this.h.name);
                        sb.append(':');
                        break;
                    case PLAYLIST:
                        sb.append(str7);
                        sb.append(d(this.d));
                        sb.append(str4);
                        break;
                    case PLAYLIST_V2:
                        sb.append(str3);
                        break;
                    case CLUSTER:
                        sb.append(str7);
                        sb.append(d(this.d));
                        sb.append(str2);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("unexpected station kind ");
                        sb2.append(this.h);
                        throw new RuntimeException(sb2.toString());
                }
                sb.append(this.b);
                break;
            case 37:
                sb.append("user:facebook:");
                sb.append(this.b);
                break;
            case 38:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":outbox");
                break;
            case 39:
                sb.append("internal:");
                sb.append(this.b);
                break;
            case 40:
                sb.append("video:");
                sb.append(this.b);
                break;
            case 41:
                sb.append("recording:");
                sb.append(this.b);
                break;
            case 42:
                sb.append("canvas:");
                sb.append(this.b);
                break;
            case 43:
                sb.append("app:");
                sb.append(this.b);
                break;
            case 44:
                sb.append("start-group:");
                sb.append(this.b);
                if (this.e != null) {
                    sb.append(str6);
                    sb.append(d(this.e));
                    break;
                }
                break;
            case 45:
                sb.append("end-group:");
                sb.append(this.b);
                break;
            case 46:
                sb.append("show:");
                sb.append(this.b);
                break;
            case 47:
                sb.append("episode:");
                sb.append(this.b);
                break;
            case 48:
                sb.append("ad:");
                sb.append(this.b);
                break;
            case 49:
                sb.append("adspace:");
                sb.append(this.b);
                break;
            case 50:
                sb.append("interruption:");
                sb.append(this.b);
                break;
            case 51:
                sb.append("chart:");
                sb.append(this.b);
                break;
            case 52:
                sb.append("party:");
                sb.append(this.b);
                break;
            case 53:
                sb.append("running:");
                sb.append(this.b);
                break;
            case 54:
                sb.append("dailymix:");
                sb.append(this.b);
                break;
            case 55:
                sb.append("link:");
                sb.append(this.b);
                break;
            case 56:
                sb.append("imageset:");
                sb.append(this.b);
                break;
            case 57:
                sb.append("space:");
                sb.append(this.b);
                break;
            case 58:
                sb.append("concert:");
                sb.append(this.b);
                break;
            case 59:
                if (this.d != null) {
                    sb.append(str7);
                    sb.append(d(this.d));
                    sb.append(':');
                }
                sb.append("collection");
                if (this.b != null) {
                    sb.append(':');
                    sb.append(this.b);
                    break;
                }
                break;
            case b.bo /*60*/:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":collection:album:");
                sb.append(this.b);
                break;
            case b.bp /*61*/:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":collection:artist:");
                sb.append(this.b);
                break;
            case b.bq /*62*/:
                sb.append("premium-destination");
                break;
            case b.br /*63*/:
                sb.append("upsell:");
                sb.append(this.b);
                break;
            case b.bs /*64*/:
                sb.append("devicepreset:");
                sb.append(this.j);
                sb.append(str6);
                sb.append(this.b);
                break;
            case b.bt /*65*/:
                sb.append("together:");
                sb.append(d(this.d));
                break;
            case b.bu /*66*/:
                sb.append("socialsession:");
                sb.append(this.b);
                break;
            case b.bv /*67*/:
                sb.append("licensor:");
                sb.append(this.b);
                break;
            case b.bw /*68*/:
                sb.append("zerotap:");
                sb.append(this.b);
                break;
            case b.bx /*69*/:
                sb.append("home");
                break;
            case b.by /*70*/:
                sb.append("song:");
                sb.append(this.b);
                break;
            case b.bz /*71*/:
                sb.append(str7);
                sb.append(d(this.d));
                sb.append(":folder:");
                sb.append(this.b);
                break;
            default:
                StringBuilder sb3 = new StringBuilder("Unknown Spotify uri kind: ");
                sb3.append(this.a);
                throw new RuntimeException(sb3.toString());
        }
        return sb.toString();
    }

    private SpotifyUri(Kind kind, String str, String str2) {
        this(kind, str, null, null, null, -1, null);
    }

    private SpotifyUri(Kind kind, String str, String str2, String str3, String str4, long j2, String str5) {
        this(kind, str, str2, null, null, -1, Kind.UNKNOWN, new ArrayList(), null);
    }

    private SpotifyUri(Kind kind, String str, String str2, String str3, String str4, long j2, Kind kind2, List<String> list, String str5) {
        this.a = kind;
        this.b = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j2;
        this.c = null;
        this.h = kind2;
        this.i = list;
        this.j = str5;
    }

    public static SpotifyUri a(String str) {
        return new SpotifyUri(Kind.TRACK, str, null);
    }

    public static SpotifyUri b(String str) {
        return new SpotifyUri(Kind.PLAYLIST_V2, str, null);
    }

    private static String d(String str) {
        String str2 = "%7E";
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            if (encode.indexOf(42) != -1) {
                encode = encode.replace("*", "%2A");
            }
            return encode.indexOf(str2) != -1 ? encode.replace(str2, "~") : encode;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String e(String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            return encode.indexOf(42) != -1 ? encode.replace("*", "%2A") : encode;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpotifyUri spotifyUri = (SpotifyUri) obj;
        if (this.g != spotifyUri.g) {
            return false;
        }
        String str = this.b;
        if (str == null ? spotifyUri.b != null : !str.equals(spotifyUri.b)) {
            return false;
        }
        if (this.a != spotifyUri.a || this.h != spotifyUri.h) {
            return false;
        }
        String str2 = this.f;
        if (str2 == null ? spotifyUri.f != null : !str2.equals(spotifyUri.f)) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null ? spotifyUri.e != null : !str3.equals(spotifyUri.e)) {
            return false;
        }
        String str4 = this.d;
        String str5 = spotifyUri.d;
        return str4 == null ? str5 == null : str4.equals(str5);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.h.hashCode()) * 31;
        String str = this.d;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        long j2 = this.g;
        return i3 + ((int) (j2 ^ (j2 >>> 32)));
    }

    private static int a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public final boolean a(SpotifyUri spotifyUri) {
        if (equals(spotifyUri)) {
            return true;
        }
        Kind kind = this.a;
        Kind kind2 = spotifyUri.a;
        if ((kind == Kind.PLAYLIST || kind == Kind.PLAYLIST_V2) && (kind2 == Kind.PLAYLIST || kind2 == Kind.PLAYLIST_V2)) {
            return this.b.equals(spotifyUri.b);
        }
        if (kind == Kind.STATION && ((this.h == Kind.PLAYLIST || this.h == Kind.PLAYLIST_V2) && kind2 == Kind.STATION && (spotifyUri.h == Kind.PLAYLIST || spotifyUri.h == Kind.PLAYLIST_V2))) {
            return this.b.equals(spotifyUri.b);
        }
        if ((kind == Kind.DAILYMIX || (kind == Kind.STATION && this.h == Kind.CLUSTER)) && (kind2 == Kind.DAILYMIX || (kind2 == Kind.STATION && spotifyUri.h == Kind.CLUSTER))) {
            return this.b.equals(spotifyUri.b);
        }
        return false;
    }
}
