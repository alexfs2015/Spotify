package defpackage;

import com.spotify.http.RequestInfo;

/* renamed from: ghk reason: default package */
final class ghk implements defpackage.wlt.a {
    final ghl a;
    final jrp b = gbd.a();

    /* renamed from: ghk$a */
    class a extends wlt {
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
            this.f = ghk.this.b.b();
        }

        public final void a() {
            this.h = false;
        }

        public final void a(long j) {
            this.d = (int) j;
        }

        public final void b(long j) {
            this.e = (int) j;
            this.g = ghk.this.b.b();
        }

        public final void b() {
            ghl ghl = ghk.this.a;
            String str = this.b;
            String str2 = this.c;
            int i2 = this.e;
            int i3 = this.d;
            RequestInfo requestInfo = new RequestInfo(str, str2, i2, i3, i3, this.f, this.g, this.h);
            ghl.a(requestInfo);
        }
    }

    ghk(ghl ghl, gbd gbd) {
        this.a = ghl;
    }

    public final wlt a(wlj wlj) {
        return new a(wlj.a().a.toString(), wlj.a().b);
    }
}
