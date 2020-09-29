package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qoe reason: default package */
final class qoe {
    public static kmw<qny, qnv> a(qny qny) {
        return kmw.a(qny, kmt.a(new b(qny.a()), new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(qny qny, b bVar) {
        return kng.b(new qnp(qny.a(), qny.b(), qny.c(), qny.c() == MediaType.UNKNOWN));
    }

    public static kng<qny, qnv> a(qny qny, qnx qnx) {
        if (qny.c() == MediaType.UNKNOWN) {
            return (kng) qnx.a(new $$Lambda$qoe$wgLcfH0Yj6cdbp78Ox2D3v5Cc8(qny), new $$Lambda$qoe$xbqp1qU0M1aPdh8lwEFsS1Ey7k(qny), $$Lambda$qoe$9UmZRm7ALYtc0jn9_gO5d7lQZ4.INSTANCE);
        }
        qny a = a(qny, qny.c());
        return kng.a(kmt.a(qnv.a(a.a(), Optional.c(a.b()))));
    }

    /* access modifiers changed from: private */
    public static qny a(qny qny, MediaType mediaType) {
        return qny.a(qoh.a(qny.a(), mediaType), mediaType, qny.b());
    }
}
