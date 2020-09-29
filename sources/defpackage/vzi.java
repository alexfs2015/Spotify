package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: vzi reason: default package */
public final class vzi implements kmm<vzg, vze>, wal {
    private final View a;
    private final Button b = ((Button) this.a.findViewById(R.id.gender_button_female));
    private final Button c = ((Button) this.a.findViewById(R.id.gender_button_male));
    private final Button d = ((Button) this.a.findViewById(R.id.gender_button_neutral));

    public vzi(vzc vzc, View view) {
        this.a = view;
        vzc.a((ged<c>) $$Lambda$vzi$o0s6iAZcjgXGpKR9i3v47HCX5LU.INSTANCE, (ged<b>) new $$Lambda$vzi$JqQn9b7cg4O7PfJXiW7LELUTo9M<b>(this), (ged<a>) new $$Lambda$vzi$EJHHEFSf_PX3vCgYsND7HCJ3kUQ<a>(this), (ged<d>) new $$Lambda$vzi$OhLVsvd08dCYMsYSIVS3YNISJk<d>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, View view) {
        a(knw, this.d, new d(), this.b, this.c);
    }

    private static void a(final knw<vze> knw, View view, final vzc vzc, View... viewArr) {
        for (int i = 0; i < 2; i++) {
            viewArr[i].animate().alpha(0.4f).setDuration(300).setListener(null).start();
        }
        view.animate().alpha(1.0f).setDuration(300).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                knw.accept(new a(vzc));
            }
        }).start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        a(this.c, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(this.b, this.d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        a(this.c, this.b);
    }

    static /* synthetic */ void a(vzi vzi, vzg vzg) {
        if (vzi.d.getVisibility() != 0 || vzg.b()) {
            if (vzi.d.getVisibility() == 8 && vzg.b()) {
                vzi.d.setVisibility(0);
            }
            return;
        }
        vzi.d.setVisibility(8);
    }

    private static void a(View... viewArr) {
        for (int i = 0; i < 2; i++) {
            viewArr[i].setAlpha(0.4f);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(knw knw, View view) {
        a(knw, this.c, new b(), this.b, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(knw knw, View view) {
        a(knw, this.b, new a(), this.c, this.d);
    }

    public final void a() {
    }

    public final kmn<vzg> connect(knw<vze> knw) {
        this.b.setOnClickListener(new $$Lambda$vzi$6xANZrJwMA4e4yFKhARFcvislE(this, knw));
        this.c.setOnClickListener(new $$Lambda$vzi$Ss_laE7B3mgUFj3HUw2Sddl5me8(this, knw));
        this.d.setOnClickListener(new $$Lambda$vzi$md72T9FAr9TuRAjL6mkxQk2HnVU(this, knw));
        return new kmn<vzg>() {
            public final /* synthetic */ void accept(Object obj) {
                vzi.a(vzi.this, (vzg) obj);
            }

            public final void dispose() {
            }
        };
    }
}
