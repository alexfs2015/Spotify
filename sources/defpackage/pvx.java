package defpackage;

/* renamed from: pvx reason: default package */
public final class pvx implements gvk {
    private final gys b;
    private final ryz c;
    private final sfu d;
    private final sgn e;

    public pvx(ryz ryz, sfu sfu, sgn sgn, gys gys) {
        this.b = gys;
        this.c = (ryz) fay.a(ryz);
        this.d = (sfu) fay.a(sfu);
        this.e = (sgn) fay.a(sgn);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, java.lang.String[], java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [java.lang.Object, java.lang.String[], java.io.Serializable]
      assigns: [java.lang.String[]]
      uses: [java.lang.Object, java.io.Serializable]
      mth insns count: 35
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleCommand(defpackage.gzp r7, defpackage.guy r8) {
        /*
            r6 = this;
            sgn r0 = r6.e
            r0.a()
            gzq r0 = r7.data()
            java.lang.String r1 = "trackList"
            java.lang.String[] r0 = r0.stringArray(r1)
            gzq r7 = r7.data()
            java.lang.String r2 = "uri"
            java.lang.String r7 = r7.string(r2)
            java.lang.Object r0 = defpackage.fay.a(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r3 = defpackage.fay.a(r7)
            java.lang.String r3 = (java.lang.String) r3
            defpackage.fay.a(r0)
            defpackage.fay.a(r3)
            gzp$a r4 = defpackage.haa.builder()
            java.lang.String r5 = "playFromTrackList"
            gzp$a r4 = r4.a(r5)
            gzp$a r0 = r4.a(r1, r0)
            gzp$a r0 = r0.a(r2, r3)
            gzp r0 = r0.a()
            gys r1 = r6.b
            r1.handleCommand(r0, r8)
            gzt r0 = r8.b
            boolean r1 = defpackage.rzj.a(r0)
            if (r1 != 0) goto L_0x0061
            gys r1 = r6.b
            boolean r8 = r1.a(r8)
            if (r8 != 0) goto L_0x0061
            ryz r8 = r6.c
            sfu r1 = r6.d
            com.spotify.music.libs.search.history.SearchHistoryItem r7 = r1.a(r7, r0)
            r8.a(r7)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvx.handleCommand(gzp, guy):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.lang.String[], java.io.Serializable] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.String[], code=null, for r2v0, types: [java.lang.Object, java.lang.String[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.gzp a(java.lang.String[] r2, java.lang.String r3) {
        /*
            defpackage.fay.a(r2)
            defpackage.fay.a(r3)
            gzp$a r0 = defpackage.haa.builder()
            java.lang.String r1 = "playAndSaveToHistory"
            gzp$a r0 = r0.a(r1)
            java.lang.String r1 = "trackList"
            gzp$a r2 = r0.a(r1, r2)
            java.lang.String r0 = "uri"
            gzp$a r2 = r2.a(r0, r3)
            gzp r2 = r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvx.a(java.lang.String[], java.lang.String):gzp");
    }
}
