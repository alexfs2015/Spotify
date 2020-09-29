package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.libs.glue.custom.playbutton.CirclePlayButtonView;
import com.spotify.music.R;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: oqn reason: default package */
final class oqn implements oql, oqm {
    private static final int a = oqn.class.hashCode();
    private final OnClickListener b = new OnClickListener() {
        public final void onClick(View view) {
            oqi a2 = oqn.this.c;
            a2.c.a();
            a2.e.a(a2.d, a2.b.b());
        }
    };
    /* access modifiers changed from: private */
    public final oqi c;
    private final Context d;
    private final ohd e;
    private final a f;
    private uwh g;
    private glf h;
    private Button i;

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    public oqn(oqj oqj, Context context, a aVar, ohd ohd) {
        oqi oqi = new oqi((tcn) oqj.a(oqj.a.get(), 1), (ois) oqj.a(oqj.b.get(), 2), (oqe) oqj.a(oqj.c.get(), 3), (String) oqj.a(oqj.d.get(), 4), (hbj) oqj.a(oqj.e.get(), 5), (Scheduler) oqj.a(oqj.f.get(), 6), (ohd) oqj.a(ohd, 7));
        this.c = oqi;
        this.d = context;
        this.e = ohd;
        this.f = aVar;
    }

    public final Completable a() {
        return this.c.f;
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void az_() {
        this.c.a((oqm) this);
    }

    public final void c() {
        this.c.a((oqm) null);
    }

    public final void d() {
        this.c.a.c();
    }

    public final void a(uwh uwh) {
        glf glf;
        this.g = uwh;
        this.i = fzz.b(this.d);
        this.i.setOnClickListener(this.b);
        Context context = this.d;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 1));
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = uts.a(12.0f, this.d.getResources());
        layoutParams.topMargin = uts.a(12.0f, this.d.getResources());
        layoutParams.gravity = 1;
        if (this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader)) {
            if (this.e.c().c()) {
                glf = this.f.a(new CirclePlayButtonView(this.d));
            } else {
                a aVar = this.f;
                fzz.a();
                glf = aVar.a(a.a(this.d));
            }
            glf.a((OnClickListener) new $$Lambda$oqn$hdBZvI9SRGmiZKor7ybz0JzmdFk(this));
            linearLayout.addView(glf.a(), layoutParams);
            this.h = glf;
        }
        linearLayout.addView(this.i, layoutParams);
        uwh.a((a<H>) new jlu<H>(frameLayout, true), a);
        uwh.a(a);
    }

    public final void e() {
        this.i.setText(R.string.playlist_edit_playlist_button);
        this.g.a(true, a);
    }

    public final void f() {
        this.i.setText(R.string.playlist_preview_button);
        this.g.a(true, a);
    }

    public final void a(boolean z) {
        glf glf = this.h;
        if (glf != null) {
            glf.a(z);
        }
    }

    public final void b(boolean z) {
        glf glf = this.h;
        if (glf != null) {
            glf.b(z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.c.a();
    }
}
