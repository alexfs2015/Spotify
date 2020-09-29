package defpackage;

import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import com.spotify.voice.api.model.VoiceViewResponse;
import java.util.List;

/* renamed from: tqz reason: default package */
final class tqz implements tqy {
    private static boolean a(VoiceViewResponse voiceViewResponse) {
        return (voiceViewResponse == null || voiceViewResponse.custom() == null) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v4, types: [tqx$a] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.lang.String, tqx$a]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.Object, java.lang.String]
      mth insns count: 49
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
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<defpackage.tqx.a> b(com.spotify.voice.api.model.VoiceViewResponse r7, int r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.List r7 = r7.body()
            if (r7 == 0) goto L_0x0092
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0092
            java.util.Iterator r7 = r7.iterator()
        L_0x0015:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0092
            int r1 = r0.size()
            if (r1 >= r8) goto L_0x0092
            java.lang.Object r1 = r7.next()
            com.spotify.voice.api.model.VoiceViewResponse$Body r1 = (com.spotify.voice.api.model.VoiceViewResponse.Body) r1
            com.spotify.voice.api.model.VoiceViewResponse$Body$Target r2 = r1.target()
            com.spotify.voice.api.model.VoiceViewResponse$Body$Text r3 = r1.text()
            r4 = 0
            if (r2 == 0) goto L_0x008c
            java.lang.String r5 = r2.uri()
            boolean r5 = defpackage.fbo.a(r5)
            if (r5 != 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            java.lang.String r5 = r3.title()
            boolean r5 = defpackage.fbo.a(r5)
            if (r5 == 0) goto L_0x0049
            goto L_0x008c
        L_0x0049:
            tqv$a r5 = new tqv$a
            r5.<init>()
            java.lang.String r2 = r2.uri()
            tqx$a$a r2 = r5.d(r2)
            java.lang.String r5 = r3.title()
            tqx$a$a r2 = r2.a(r5)
            java.lang.String r5 = r3.subtitle()
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x006b
            java.lang.String r3 = r3.subtitle()
            goto L_0x006c
        L_0x006b:
            r3 = r6
        L_0x006c:
            tqx$a$a r2 = r2.b(r3)
            com.spotify.voice.api.model.VoiceViewResponse$Body$Images r1 = r1.images()
            if (r1 == 0) goto L_0x0080
            com.spotify.voice.api.model.VoiceViewResponse$Body$Images$Image r1 = r1.main()
            if (r1 == 0) goto L_0x0080
            java.lang.String r4 = r1.uri()
        L_0x0080:
            if (r4 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r4 = r6
        L_0x0084:
            tqx$a$a r1 = r2.c(r4)
            tqx$a r4 = r1.a()
        L_0x008c:
            if (r4 == 0) goto L_0x0015
            r0.add(r4)
            goto L_0x0015
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqz.b(com.spotify.voice.api.model.VoiceViewResponse, int):java.util.List");
    }

    public final tqx a(VoiceViewResponse voiceViewResponse, int i) {
        List b = b(voiceViewResponse, i);
        String str = "";
        if (a(voiceViewResponse)) {
            String query = voiceViewResponse.custom().query();
            if (query != null) {
                str = query;
            }
        }
        String error = a(voiceViewResponse) ? voiceViewResponse.custom().error() : "INVALID_RESPONSE";
        boolean z = false;
        if (a(voiceViewResponse) && voiceViewResponse.custom().intent() == Intent.PLAY) {
            z = true;
        }
        return new tqx(b, str, error, z);
    }
}
