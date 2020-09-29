package defpackage;

import android.content.Context;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: goc reason: default package */
public final class goc {
    private final Context a;
    private final String b;
    private final jty c;
    private final Scheduler d;
    private final gob e;
    private final boolean f;

    public goc(Context context, String str, jty jty, Scheduler scheduler, gix gix, boolean z) {
        this.a = context;
        this.b = str;
        this.c = jty;
        this.d = scheduler;
        DebugFlag debugFlag = DebugFlag.PRE_SIGN_UP_EXPERIMENT_TEST_ENDPOINT;
        this.e = (gob) gix.a(gob.class);
        this.f = z;
    }

    /* access modifiers changed from: private */
    public PreSignupExperimentFlags a(PreSignupExperimentFlags preSignupExperimentFlags) {
        HashSet<String> hashSet = new HashSet<>(preSignupExperimentFlags.activeFlags());
        HashSet<String> hashSet2 = new HashSet<>(preSignupExperimentFlags.inactiveFlags());
        if (this.f) {
            DebugFlag debugFlag = DebugFlag.SIGNUP_ENABLE_PHONE_NUMBER_SIGNUP;
        }
        DebugFlag debugFlag2 = DebugFlag.SIGNUP_DISABLE_REMOTE_VALIDATION;
        HashMap hashMap = new HashMap(hashSet2.size() + hashSet.size());
        for (String put : hashSet2) {
            hashMap.put(put, Boolean.FALSE);
        }
        for (String put2 : hashSet) {
            hashMap.put(put2, Boolean.TRUE);
        }
        return new PreSignupExperimentFlags(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[Catch:{ IOException -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[SYNTHETIC, Splitter:B:28:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f A[SYNTHETIC, Splitter:B:34:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0044 A[EDGE_INSN: B:40:0x0044->B:13:0x0044 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.spotify.libs.pse.model.PreSignupExperimentFlags b() {
        /*
            r10 = this;
            java.lang.String r0 = "Could not close br"
            boolean r1 = r10.f
            r2 = 0
            if (r1 == 0) goto L_0x007a
            java.io.File r1 = new java.io.File
            android.content.Context r3 = r10.a
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r4 = "settings/presignup.experiment.override"
            r1.<init>(r3, r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r4 = r1.exists()
            if (r4 == 0) goto L_0x007a
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
        L_0x002a:
            java.lang.String r1 = r5.readLine()     // Catch:{ IOException -> 0x0058 }
            if (r1 == 0) goto L_0x0044
            java.lang.String r6 = ":"
            java.lang.String[] r1 = r1.split(r6)     // Catch:{ IOException -> 0x0058 }
            int r6 = r1.length     // Catch:{ IOException -> 0x0058 }
            r7 = 0
        L_0x0038:
            if (r7 >= r6) goto L_0x002a
            r8 = r1[r7]     // Catch:{ IOException -> 0x0058 }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0058 }
            r3.put(r8, r9)     // Catch:{ IOException -> 0x0058 }
            int r7 = r7 + 1
            goto L_0x0038
        L_0x0044:
            com.spotify.libs.pse.model.PreSignupExperimentFlags r1 = new com.spotify.libs.pse.model.PreSignupExperimentFlags     // Catch:{ IOException -> 0x0058 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r2, r0, r3)
        L_0x0053:
            return r1
        L_0x0054:
            r1 = move-exception
            r5 = r2
            goto L_0x006d
        L_0x0057:
            r5 = r2
        L_0x0058:
            java.lang.String r1 = "could not read pre signup override flags"
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x006c }
            com.spotify.base.java.logging.Logger.e(r1, r3)     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x007a
            r5.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x007a
        L_0x0065:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r1, r0, r3)
            goto L_0x007a
        L_0x006c:
            r1 = move-exception
        L_0x006d:
            if (r5 == 0) goto L_0x0079
            r5.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0079
        L_0x0073:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.spotify.base.java.logging.Logger.e(r2, r0, r3)
        L_0x0079:
            throw r1
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goc.b():com.spotify.libs.pse.model.PreSignupExperimentFlags");
    }

    public final Observable<PreSignupExperimentFlags> a() {
        Single single;
        String str = this.b;
        String str2 = this.c.a().split("-")[0];
        String b2 = SpotifyLocale.b(this.a);
        PreSignupExperimentFlags b3 = b();
        if (b3 != null) {
            single = Single.b(b3);
        } else {
            DebugFlag debugFlag = DebugFlag.PRE_SIGN_UP_EXPERIMENT_OVERRIDES_ENABLED;
            single = this.e.a(str, str2, b2).f(new $$Lambda$goc$m4z4p5KOzxVfv3o324OcULeAGTE(this));
        }
        return single.d().a(this.d);
    }
}
