package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class CredentialPickerConfig extends bxw implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new bmk();
    private final int a;
    private final boolean b;
    private final boolean c;
    @Deprecated
    private final boolean d;
    private final int e;

    public static class a {
        public boolean a = true;
        int b = 1;
        private boolean c = false;

        public final CredentialPickerConfig a() {
            return new CredentialPickerConfig(this, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
      assigns: [?[boolean, int, float, short, byte, char], ?[int, float, short, byte, char], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [boolean, int]
      mth insns count: 17
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CredentialPickerConfig(int r2, boolean r3, boolean r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r3 = 1
            r4 = 3
            r0 = 2
            if (r2 >= r0) goto L_0x0016
            r1.d = r5
            if (r5 == 0) goto L_0x0013
            r3 = 3
        L_0x0013:
            r1.e = r3
            return
        L_0x0016:
            if (r6 != r4) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r1.d = r3
            r1.e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialPickerConfig.<init>(int, boolean, boolean, boolean, int):void");
    }

    private CredentialPickerConfig(a aVar) {
        this(2, false, aVar.a, false, aVar.b);
    }

    /* synthetic */ CredentialPickerConfig(a aVar, byte b2) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        boolean z = true;
        bxx.a(parcel, 1, this.b);
        bxx.a(parcel, 2, this.c);
        if (this.e != 3) {
            z = false;
        }
        bxx.a(parcel, 3, z);
        bxx.b(parcel, 4, this.e);
        bxx.b(parcel, 1000, this.a);
        bxx.b(parcel, a2);
    }
}
