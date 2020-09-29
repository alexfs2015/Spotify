package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;

/* renamed from: mvc reason: default package */
public final class mvc implements c<gzz, gzz> {
    private final String a;
    private final AlbumOfflineStateProvider b;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wud) obj, this.b.a(jst.a(this.a).f()).b(), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$mvc$hBRFuAfmC3gNBc__dyD8OQiGsH4.INSTANCE);
    }

    public mvc(String str, AlbumOfflineStateProvider albumOfflineStateProvider) {
        this.a = str;
        this.b = albumOfflineStateProvider;
    }

    /* access modifiers changed from: private */
    public static gzz a(gzz gzz, OfflineState offlineState) {
        return new hau(new $$Lambda$mvc$41FHDIGe4ZlhZHXF5O2ZtHivEHc(offlineState)).a(gzz);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [byte[], java.io.Serializable] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v5, types: [byte[], java.io.Serializable]
      assigns: [byte[]]
      uses: [java.io.Serializable]
      mth insns count: 46
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.gzt a(com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState r3, defpackage.gzt r4) {
        /*
            gzr r0 = r4.componentId()
            java.lang.String r0 = r0.id()
            java.lang.String r1 = "glue2:trackRow"
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "row:trackWithDownloadProgress"
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "glue:entityRow"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0022
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            return r4
        L_0x0022:
            gzq r0 = r4.metadata()
            java.lang.String r1 = "uri"
            java.lang.String r0 = r0.string(r1)
            gzt$a r4 = r4.toBuilder()
            java.lang.String r1 = "row"
            gzt$a r4 = r4.a(r2, r1)
            java.util.List r3 = r3.getTracks()
            java.util.Iterator r3 = r3.iterator()
        L_0x003e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r3.next()
            com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider$Track r1 = (com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.Track) r1
            java.lang.String r2 = r1.getLink()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x003e
            uzf r3 = r1.getOfflineState()
            boolean r0 = r3 instanceof defpackage.uzf.b
            r1 = 0
            if (r0 == 0) goto L_0x0062
            uzf r3 = defpackage.uzf.a(r1)
            goto L_0x0074
        L_0x0062:
            boolean r0 = r3 instanceof defpackage.uzf.h
            if (r0 == 0) goto L_0x0074
            uzf$h r3 = (defpackage.uzf.h) r3
            com.spotify.playlist.models.offline.WaitingReason r3 = r3.a
            uzf r3 = defpackage.uzf.a(r3, r1)
            goto L_0x0074
        L_0x006f:
            uzf$f r3 = new uzf$f
            r3.<init>()
        L_0x0074:
            uzh r0 = new uzh
            r0.<init>()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            defpackage.uzh.a(r3, r0)
            byte[] r3 = r0.marshall()
            r0.recycle()
            java.lang.String r0 = "availability"
            gzt$a r3 = r4.c(r0, r3)
            gzt r3 = r3.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvc.a(com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider$OfflineState, gzt):gzt");
    }
}
