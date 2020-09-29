package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: vmc reason: default package */
public final class vmc implements kjd<vma, vly>, vnf {
    private final View a;
    private final Button b = ((Button) this.a.findViewById(R.id.gender_button_female));
    private final Button c = ((Button) this.a.findViewById(R.id.gender_button_male));
    private final Button d = ((Button) this.a.findViewById(R.id.gender_button_neutral));

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    public final void a() {
    }

    public vmc(vlw vlw, View view) {
        this.a = view;
        vlw.a((gcs<c>) $$Lambda$vmc$9SBs4T0A67dRYAnj9b0kbqvuhG8.INSTANCE, (gcs<b>) new $$Lambda$vmc$tp7R59zk7i7XteFFqKG3jMKqM0A<b>(this), (gcs<a>) new $$Lambda$vmc$1FKYrirVzN0GTnpHXikw2GnBqK0<a>(this), (gcs<d>) new $$Lambda$vmc$yhG7Bnxk19ufmtHWNgIIhd4Ujw<d>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(this.b, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        a(this.c, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        a(this.c, this.b);
    }

    public final kje<vma> connect(kkn<vly> kkn) {
        this.b.setOnClickListener(new $$Lambda$vmc$ZIYCoi8h8Esqz10dSshthiOmkKA(this, kkn));
        this.c.setOnClickListener(new $$Lambda$vmc$2olah5QyUuMy7FQ528KkL_P8kN0(this, kkn));
        this.d.setOnClickListener(new $$Lambda$vmc$bAU_Tc1O0IIuGavppemzuXyqKpI(this, kkn));
        return new kje<vma>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                vmc.a(vmc.this, (vma) obj);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(kkn kkn, View view) {
        a(kkn, this.b, new a(), this.c, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(kkn kkn, View view) {
        a(kkn, this.c, new b(), this.b, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, View view) {
        a(kkn, this.d, new d(), this.b, this.c);
    }

    private static void a(View... viewArr) {
        for (int i = 0; i < 2; i++) {
            viewArr[i].setAlpha(0.4f);
        }
    }

    private static void a(final kkn<vly> kkn, View view, final vlw vlw, View... viewArr) {
        for (int i = 0; i < 2; i++) {
            viewArr[i].animate().alpha(0.4f).setDuration(300).setListener(null).start();
        }
        view.animate().alpha(1.0f).setDuration(300).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                kkn.accept(new a(vlw));
            }
        }).start();
    }

    static /* synthetic */ void a(vmc vmc, vma vma) {
        if (vmc.d.getVisibility() != 0 || vma.b()) {
            if (vmc.d.getVisibility() == 8 && vma.b()) {
                vmc.d.setVisibility(0);
            }
            return;
        }
        vmc.d.setVisibility(8);
    }
}
