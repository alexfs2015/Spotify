package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: iwj reason: default package */
public final class iwj implements syw {
    private final meo a;
    private final iri b;
    private final irl c;

    public iwj(meo meo, iri iri, irl irl) {
        this.a = meo;
        this.b = iri;
        this.c = irl;
    }

    public final void a(syx syx) {
        irk a2 = this.c.a(this.b.a(syx));
        meo meo = this.a;
        meo.a.a(new c(a2) {
            private /* synthetic */ gsg a;

            {
                this.a = r2;
            }

            public final void c() {
                this.a.a();
            }

            public final void a() {
                this.a.b();
            }
        });
    }
}
