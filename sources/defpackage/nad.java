package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;

/* renamed from: nad reason: default package */
public final class nad implements c<hcs, hcs> {
    private final String a;
    private final AlbumOfflineStateProvider b;

    public nad(String str, AlbumOfflineStateProvider albumOfflineStateProvider) {
        this.a = str;
        this.b = albumOfflineStateProvider;
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
    public static /* synthetic */ defpackage.hcm a(com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState r3, defpackage.hcm r4) {
        /*
            hck r0 = r4.componentId()
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
            hcj r0 = r4.metadata()
            java.lang.String r1 = "uri"
            java.lang.String r0 = r0.string(r1)
            hcm$a r4 = r4.toBuilder()
            java.lang.String r1 = "row"
            hcm$a r4 = r4.a(r2, r1)
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
            vli r3 = r1.getOfflineState()
            boolean r0 = r3 instanceof defpackage.vli.b
            r1 = 0
            if (r0 == 0) goto L_0x0062
            vli r3 = defpackage.vli.a(r1)
            goto L_0x0074
        L_0x0062:
            boolean r0 = r3 instanceof defpackage.vli.h
            if (r0 == 0) goto L_0x0074
            vli$h r3 = (defpackage.vli.h) r3
            com.spotify.playlist.models.offline.WaitingReason r3 = r3.a
            vli r3 = defpackage.vli.a(r3, r1)
            goto L_0x0074
        L_0x006f:
            vli$f r3 = new vli$f
            r3.<init>()
        L_0x0074:
            vlk r0 = new vlk
            r0.<init>()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            defpackage.vlk.a(r3, r0)
            byte[] r3 = r0.marshall()
            r0.recycle()
            java.lang.String r0 = "availability"
            hcm$a r3 = r4.c(r0, r3)
            hcm r3 = r3.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nad.a(com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider$OfflineState, hcm):hcm");
    }

    /* access modifiers changed from: private */
    public static hcs a(hcs hcs, OfflineState offlineState) {
        return new hdn(new $$Lambda$nad$_GlFMGamw5DE913wgz0umlN4g(offlineState)).a(hcs);
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a((xii) obj, this.b.a(jva.a(this.a).f()).b(), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$nad$pgTcOuzvfO9u5hEn8Euco9QMrY.INSTANCE);
    }
}
