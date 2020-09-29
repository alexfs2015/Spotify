package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.a;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;

/* renamed from: asm reason: default package */
public final class asm extends a {
    private final a a;
    private final String b;
    private final bcd c;
    private final wli d;

    public asm(a aVar, String str) {
        this(aVar, str, null, null);
    }

    private asm(a aVar, String str, bcd bcd, wli wli) {
        this.a = aVar;
        this.b = str;
        this.c = null;
        this.d = null;
    }

    public final /* synthetic */ HttpDataSource a(c cVar) {
        asl asl = new asl(this.a, this.b, null, this.d, cVar);
        bcd bcd = this.c;
        if (bcd != null) {
            asl.a(bcd);
        }
        return asl;
    }
}
