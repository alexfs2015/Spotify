package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: lpz reason: default package */
public final class lpz extends lqc {
    public lpz(ViewGroup viewGroup) {
        fsa b = fqb.e().b(viewGroup.getContext(), viewGroup);
        lpx.a(b.a());
        lpx.a(b.c());
        AnonymousClass1 r0 = new a(b) {
            private /* synthetic */ fsa a;

            {
                this.a = r1;
            }

            public final TextView c() {
                return this.a.c();
            }

            public final void b(CharSequence charSequence) {
                this.a.b(charSequence);
            }

            public final TextView a() {
                return this.a.a();
            }

            public final void a(CharSequence charSequence) {
                this.a.a(charSequence);
            }

            public final void a(String str) {
                this.a.a(str);
            }

            public final void a(boolean z) {
                this.a.a(z);
            }

            public final View b() {
                return this.a.b();
            }

            public final void b(boolean z) {
                this.a.b(z);
            }

            public final View getView() {
                return this.a.getView();
            }
        };
        fqf.a(r0);
        super(r0.getView());
    }
}
