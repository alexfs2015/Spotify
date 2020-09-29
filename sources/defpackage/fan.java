package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.a;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;

/* renamed from: fan reason: default package */
public final class fan extends a {
    private final a a;
    private final String b;
    private final bcd c;
    private final wli d;

    public fan(a aVar, String str, bcd bcd) {
        this(aVar, null, bcd, null);
    }

    private fan(a aVar, String str, bcd bcd, wli wli) {
        this.a = aVar;
        this.b = str;
        this.c = bcd;
        this.d = null;
    }

    public final /* synthetic */ HttpDataSource a(c cVar) {
        fam fam = new fam(this.a, this.b, null, this.d, cVar);
        bcd bcd = this.c;
        if (bcd != null) {
            fam.a(bcd);
        }
        return fam;
    }
}
