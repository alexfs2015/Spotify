package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: vjy reason: default package */
public final class vjy {
    public final vnk a;
    final vnd<vld> b;

    public vjy(vnk vnk, vnd<vld> vnd) {
        this.a = vnk;
        this.b = vnd;
    }

    public final void a() {
        this.a.a((vno) new vnn() {
            public final void a(Credential credential) {
                super.a(credential);
                vjy.this.b.a(vld.a((vlk) new c(credential.a)));
            }

            public final void d() {
                super.d();
                vjy.this.b.a(vld.a((vlk) new a()));
            }
        });
    }
}
