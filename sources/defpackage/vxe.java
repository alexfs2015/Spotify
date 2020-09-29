package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: vxe reason: default package */
public final class vxe {
    public final waq a;
    final waj<vyj> b;
    public final wat c = new wat() {
        public final void a(Credential credential) {
            super.a(credential);
            vxe.this.b.a(vyj.a((vyq) new c(credential.a)));
        }

        public final void ar_() {
            super.ar_();
            vxe.this.b.a(new f());
        }

        public final void d() {
            super.d();
            vxe.this.b.a(vyj.a((vyq) new a()));
        }
    };

    public vxe(waq waq, waj<vyj> waj) {
        this.a = waq;
        this.b = waj;
    }

    public final void a() {
        this.a.a((wau) this.c);
    }
}
