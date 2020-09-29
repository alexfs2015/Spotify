package defpackage;

import com.spotify.mobile.android.spotlets.eventshub.model.SourceType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: itk reason: default package */
public final class itk {
    final String a = String.valueOf(ViewUris.ab);
    private final jjf b;

    /* renamed from: itk$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[SourceType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.spotlets.eventshub.model.SourceType[] r0 = com.spotify.mobile.android.spotlets.eventshub.model.SourceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.eventshub.model.SourceType r1 = com.spotify.mobile.android.spotlets.eventshub.model.SourceType.POPULAR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.eventshub.model.SourceType r1 = com.spotify.mobile.android.spotlets.eventshub.model.SourceType.RECOMMENDATIONS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.spotlets.eventshub.model.SourceType r1 = com.spotify.mobile.android.spotlets.eventshub.model.SourceType.ALL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.itk.AnonymousClass1.<clinit>():void");
        }
    }

    public itk(jjf jjf) {
        this.b = jjf;
    }

    public void a(String str, long j, String str2) {
        String str3 = str;
        long j2 = j;
        String str4 = str2;
        bh bhVar = new bh(null, "concerts-browse", this.a, str3, j2, str4, "hit", null, (double) jrf.a.a());
        a(bhVar);
    }

    /* access modifiers changed from: 0000 */
    public final void a(haw haw) {
        this.b.a(haw);
    }

    public final void a(Long l, SourceType sourceType, String str) {
        int i = AnonymousClass1.a[sourceType.ordinal()];
        String str2 = "spotify:concert:";
        if (i == 1) {
            long longValue = l.longValue();
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            a("nearyou-listing", longValue, sb.toString());
        } else if (i != 2) {
            if (i == 3) {
                long longValue2 = l.longValue();
                StringBuilder sb2 = new StringBuilder(str2);
                sb2.append(str);
                a("allconcerts-listing", longValue2, sb2.toString());
            }
        } else {
            long longValue3 = l.longValue();
            StringBuilder sb3 = new StringBuilder(str2);
            sb3.append(str);
            a("rec-listing", longValue3, sb3.toString());
        }
    }

    public final void b(Long l, SourceType sourceType, String str) {
        if (sourceType == SourceType.RECOMMENDATIONS) {
            long longValue = l.longValue();
            StringBuilder sb = new StringBuilder("spotify:concert:");
            sb.append(str);
            a("discovery-listing", longValue, sb.toString());
        }
    }
}
