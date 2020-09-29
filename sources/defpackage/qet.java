package defpackage;

/* renamed from: qet reason: default package */
public final class qet implements gxk {
    private final hbl b;
    private final sin c;
    private final sqb d;
    private final squ e;

    public qet(sin sin, sqb sqb, squ squ, hbl hbl) {
        this.b = hbl;
        this.c = (sin) fbp.a(sin);
        this.d = (sqb) fbp.a(sqb);
        this.e = (squ) fbp.a(squ);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.lang.String[], java.io.Serializable] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.String[], code=null, for r2v0, types: [java.lang.Object, java.lang.String[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hci a(java.lang.String[] r2, java.lang.String r3) {
        /*
            defpackage.fbp.a(r2)
            defpackage.fbp.a(r3)
            hci$a r0 = defpackage.hct.builder()
            java.lang.String r1 = "playAndSaveToHistory"
            hci$a r0 = r0.a(r1)
            java.lang.String r1 = "trackList"
            hci$a r2 = r0.a(r1, r2)
            java.lang.String r0 = "uri"
            hci$a r2 = r2.a(r0, r3)
            hci r2 = r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qet.a(java.lang.String[], java.lang.String):hci");
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
    public final void handleCommand(defpackage.hci r7, defpackage.gwy r8) {
        /*
            r6 = this;
            squ r0 = r6.e
            r0.a()
            hcj r0 = r7.data()
            java.lang.String r1 = "trackList"
            java.lang.String[] r0 = r0.stringArray(r1)
            hcj r7 = r7.data()
            java.lang.String r2 = "uri"
            java.lang.String r7 = r7.string(r2)
            java.lang.Object r0 = defpackage.fbp.a(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r3 = defpackage.fbp.a(r7)
            java.lang.String r3 = (java.lang.String) r3
            defpackage.fbp.a(r0)
            defpackage.fbp.a(r3)
            hci$a r4 = defpackage.hct.builder()
            java.lang.String r5 = "playFromTrackList"
            hci$a r4 = r4.a(r5)
            hci$a r0 = r4.a(r1, r0)
            hci$a r0 = r0.a(r2, r3)
            hci r0 = r0.a()
            hbl r1 = r6.b
            r1.handleCommand(r0, r8)
            hcm r0 = r8.b
            boolean r1 = defpackage.six.a(r0)
            if (r1 != 0) goto L_0x0061
            hbl r1 = r6.b
            boolean r8 = r1.a(r8)
            if (r8 != 0) goto L_0x0061
            sin r8 = r6.c
            sqb r1 = r6.d
            com.spotify.music.libs.search.history.SearchHistoryItem r7 = r1.a(r7, r0)
            r8.a(r7)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qet.handleCommand(hci, gwy):void");
    }
}
