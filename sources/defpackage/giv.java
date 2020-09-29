package defpackage;

import com.spotify.http.RequestInfo;

/* renamed from: giv reason: default package */
final class giv implements defpackage.wzz.a {
    final giw a;
    final jtz b = jtp.a;

    /* renamed from: giv$a */
    class a extends wzz {
        private final String b;
        private final String c;
        private int d;
        private int e;
        private final long f;
        private long g;
        private boolean h = true;

        a(String str, String str2) {
            this.b = str;
            this.c = str2;
            this.f = giv.this.b.b();
        }

        public final void a() {
            this.h = false;
        }

        public final void a(long j) {
            this.d = (int) j;
        }

        public final void b() {
            giw giw = giv.this.a;
            String str = this.b;
            String str2 = this.c;
            int i2 = this.e;
            int i3 = this.d;
            RequestInfo requestInfo = new RequestInfo(str, str2, i2, i3, i3, this.f, this.g, this.h);
            giw.a(requestInfo);
        }

        public final void b(long j) {
            this.e = (int) j;
            this.g = giv.this.b.b();
        }
    }

    giv(giw giw, gcb gcb) {
        this.a = giw;
    }

    public final wzz a(wzp wzp) {
        return new a(wzp.a().a.toString(), wzp.a().b);
    }
}
