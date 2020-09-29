package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.AlbumMetadata.ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup.ProtoImageGroup;
import com.spotify.playlist.models.Covers;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ipp reason: default package */
public final class ipp {
    public static ProtoImageGroup a(Covers covers) {
        if (covers == null) {
            return null;
        }
        String str = "";
        return (ProtoImageGroup) ProtoImageGroup.k().a((String) jtc.a(covers.getUri(), str)).b((String) jtc.a(covers.getSmallUri(), str)).c((String) jtc.a(covers.getLargeUri(), str)).d((String) jtc.a(covers.getXlargeUri(), str)).g();
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata] */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata] */
    /* JADX WARNING: type inference failed for: r0v21, types: [com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata] */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata, com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata]
      uses: [com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata, com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata]
      mth insns count: 94
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata a(defpackage.uzc r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.List r1 = r7.getArtists()
            java.lang.Object r1 = defpackage.fay.a(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r3 = r1.hasNext()
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r1.next()
            uyr r3 = (defpackage.uyr) r3
            if (r3 != 0) goto L_0x002d
            r3 = r0
            goto L_0x0053
        L_0x002d:
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackArtistMetadata$a r5 = com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackArtistMetadata.l()
            java.lang.String r6 = r3.getUri()
            java.lang.Object r6 = defpackage.jtc.a(r6, r4)
            java.lang.String r6 = (java.lang.String) r6
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackArtistMetadata$a r5 = r5.a(r6)
            java.lang.String r3 = r3.getName()
            java.lang.Object r3 = defpackage.jtc.a(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackArtistMetadata$a r3 = r5.b(r3)
            com.google.protobuf.GeneratedMessageLite r3 = r3.g()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackArtistMetadata r3 = (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackArtistMetadata) r3
        L_0x0053:
            r2.add(r3)
            goto L_0x001b
        L_0x0057:
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r1 = com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata.n()
            uyq r3 = r7.getAlbum()
            if (r3 != 0) goto L_0x0062
            goto L_0x00c5
        L_0x0062:
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata$a r5 = com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumMetadata.o()
            java.lang.String r6 = r3.getName()
            java.lang.Object r6 = defpackage.jtc.a(r6, r4)
            java.lang.String r6 = (java.lang.String) r6
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata$a r5 = r5.b(r6)
            java.lang.String r6 = r3.getUri()
            java.lang.Object r6 = defpackage.jtc.a(r6, r4)
            java.lang.String r6 = (java.lang.String) r6
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata$a r5 = r5.a(r6)
            com.spotify.playlist.models.Covers r6 = r3.getCovers()
            com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup r6 = a(r6)
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata$a r5 = r5.a(r6)
            uyr r3 = r3.getArtist()
            if (r3 != 0) goto L_0x0095
            goto L_0x00bb
        L_0x0095:
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata$a r0 = com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumArtistMetadata.k()
            java.lang.String r6 = r3.getUri()
            java.lang.Object r6 = defpackage.jtc.a(r6, r4)
            java.lang.String r6 = (java.lang.String) r6
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata$a r0 = r0.a(r6)
            java.lang.String r3 = r3.getName()
            java.lang.Object r3 = defpackage.jtc.a(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata$a r0 = r0.b(r3)
            com.google.protobuf.GeneratedMessageLite r0 = r0.g()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata r0 = (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumArtistMetadata) r0
        L_0x00bb:
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata$a r0 = r5.a(r0)
            com.google.protobuf.GeneratedMessageLite r0 = r0.g()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata r0 = (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackAlbumMetadata) r0
        L_0x00c5:
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r1.a(r0)
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.a(r2)
            boolean r1 = r7.isAvailableInMetadataCatalogue()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.a(r1)
            boolean r1 = r7.isExplicit()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.b(r1)
            boolean r1 = r7.isPremiumOnly()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.d(r1)
            boolean r1 = r7.isLocal()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.c(r1)
            java.lang.String r1 = r7.getUri()
            java.lang.Object r1 = defpackage.jtc.a(r1, r4)
            java.lang.String r1 = (java.lang.String) r1
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.a(r1)
            java.lang.String r1 = r7.getName()
            java.lang.Object r1 = defpackage.jtc.a(r1, r4)
            java.lang.String r1 = (java.lang.String) r1
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.b(r1)
            java.lang.String r1 = r7.previewId()
            java.lang.Object r1 = defpackage.jtc.a(r1, r4)
            java.lang.String r1 = (java.lang.String) r1
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.c(r1)
            java.lang.String r1 = r7.playableTrackUri()
            java.lang.Object r1 = defpackage.jtc.a(r1, r4)
            java.lang.String r1 = (java.lang.String) r1
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r0 = r0.d(r1)
            int r7 = r7.getLength()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r7 = r0.a(r7)
            r0 = 0
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r7 = r7.c(r0)
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata$a r7 = r7.b(r0)
            com.google.protobuf.GeneratedMessageLite r7 = r7.g()
            com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata r7 = (com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata.ProtoTrackMetadata) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipp.a(uzc):com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata");
    }

    public static ProtoAlbumMetadata a(uyq uyq) {
        ProtoAlbumArtistMetadata protoAlbumArtistMetadata;
        ImmutableList artists = uyq.getArtists();
        ArrayList arrayList = new ArrayList();
        Iterator it = artists.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                return (ProtoAlbumMetadata) ProtoAlbumMetadata.m().b((String) jtc.a(uyq.getName(), str)).a((String) jtc.a(uyq.getUri(), str)).a((Iterable<? extends ProtoAlbumArtistMetadata>) arrayList).c((String) jtc.a(uyq.getCopyright(), str)).b(uyq.getNumDiscs()).c(uyq.getNumTracks()).a(uyq.getYear()).a(uyq.isAnyTrackPlayable()).a(a(uyq.getCovers())).g();
            }
            uyr uyr = (uyr) it.next();
            if (uyr == null) {
                protoAlbumArtistMetadata = null;
            } else {
                protoAlbumArtistMetadata = (ProtoAlbumArtistMetadata) ProtoAlbumArtistMetadata.k().b((String) jtc.a(uyr.getName(), str)).a((String) jtc.a(uyr.getUri(), str)).g();
            }
            arrayList.add(protoAlbumArtistMetadata);
        }
    }
}
