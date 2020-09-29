package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qfb reason: default package */
final class qfb {
    public static kjn<qev, qes> a(qev qev) {
        return kjn.a(qev, kjk.a(new b(qev.a()), new a()));
    }

    public static kjx<qev, qes> a(qev qev, qeu qeu) {
        if (qev.c() == MediaType.UNKNOWN) {
            return (kjx) qeu.a(new $$Lambda$qfb$7rTlGnGNqkzZyirde98fhZYhDfQ(qev), new $$Lambda$qfb$m286uuXtmWwiA7L49CdUDSo_dk(qev), $$Lambda$qfb$Lx1MzxZaYFQktlBZGPj0vkErPkQ.INSTANCE);
        }
        qev a = a(qev, qev.c());
        return kjx.a(kjk.a(qes.a(a.a(), Optional.c(a.b()))));
    }

    /* access modifiers changed from: private */
    public static qev a(qev qev, MediaType mediaType) {
        return qev.a(qfe.a(qev.a(), mediaType), mediaType, qev.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qev qev, b bVar) {
        return kjx.b(new qem(qev.a(), qev.b(), qev.c(), qev.c() == MediaType.UNKNOWN));
    }
}
