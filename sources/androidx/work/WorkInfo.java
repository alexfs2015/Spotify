package androidx.work;

public final class WorkInfo {

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [ss, java.util.Set, java.lang.Object, java.util.UUID] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2, types: [ss, java.util.Set, java.lang.Object, java.util.UUID]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.util.UUID, java.lang.Object, ss, java.util.Set]
      mth insns count: 16
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
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 != r3) goto L_0x0004
            r3 = 1
            return r3
        L_0x0004:
            r0 = 0
            if (r3 == 0) goto L_0x0026
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            if (r1 == r3) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r3 = 0
            boolean r1 = r3.equals(r3)
            if (r1 != 0) goto L_0x001a
            return r0
        L_0x001a:
            boolean r1 = r3.equals(r3)
            if (r1 != 0) goto L_0x0021
            return r0
        L_0x0021:
            boolean r3 = r3.equals(r3)
            return r3
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkInfo.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ss, androidx.work.WorkInfo$State, java.util.Set, java.util.UUID] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [ss, androidx.work.WorkInfo$State, java.util.Set, java.util.UUID]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.util.UUID, androidx.work.WorkInfo$State, ss, java.util.Set]
      mth insns count: 13
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
    public final int hashCode() {
        /*
            r3 = this;
            r0 = 0
            int r1 = r0.hashCode()
            int r1 = r1 * 31
            int r2 = r0.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r2 = r0.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkInfo.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{mId='");
        sb.append(null);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(null);
        sb.append(", mOutputData=");
        sb.append(null);
        sb.append(", mTags=");
        sb.append(null);
        sb.append('}');
        return sb.toString();
    }
}
