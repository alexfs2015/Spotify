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
import com.spotify.music.R;
import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: oxt reason: default package */
final class oxt implements oxr, oxs {
    private static final int a = oxt.class.hashCode();
    private final OnClickListener b = new OnClickListener() {
        public final void onClick(View view) {
            oxo a2 = oxt.this.c;
            a2.c.a();
            a2.e.a(a2.d, a2.b.b());
        }
    };
    /* access modifiers changed from: private */
    public final oxo c;
    private final Context d;
    private final ooh e;
    private final a f;
    private vhx g;
    private gmu h;
    private Button i;

    public oxt(oxp oxp, Context context, a aVar, ooh ooh) {
        oxo oxo = new oxo((tmu) oxp.a(oxp.a.get(), 1), (opw) oxp.a(oxp.b.get(), 2), (oxk) oxp.a(oxp.c.get(), 3), (String) oxp.a(oxp.d.get(), 4), (hec) oxp.a(oxp.e.get(), 5), (Scheduler) oxp.a(oxp.f.get(), 6), (ooh) oxp.a(ooh, 7));
        this.c = oxo;
        this.d = context;
        this.e = ooh;
        this.f = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.c.a();
    }

    public final Completable a() {
        return this.c.f;
    }

    public final void a(Bundle bundle) {
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void a(vhx vhx) {
        gmu gmu;
        this.g = vhx;
        this.i = gat.b(this.d);
        this.i.setOnClickListener(this.b);
        Context context = this.d;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 1));
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = vfj.a(12.0f, this.d.getResources());
        layoutParams.topMargin = vfj.a(12.0f, this.d.getResources());
        layoutParams.gravity = 1;
        if (this.d.getResources().getBoolean(R.bool.showPlayButtonInHeader)) {
            if (this.e.c().c()) {
                gmu = this.f.a(this.d);
            } else {
                a aVar = this.f;
                gat.a();
                gmu = aVar.a(a.a(this.d));
            }
            gmu.a((OnClickListener) new $$Lambda$oxt$0M1k7AGDMaHPT1Kk4LNOGLP7aE(this));
            linearLayout.addView(gmu.a(), layoutParams);
            this.h = gmu;
        }
        linearLayout.addView(this.i, layoutParams);
        vhx.a((a<H>) new jog<H>(frameLayout, true), a);
        vhx.a(a);
    }

    public final void a(boolean z) {
        gmu gmu = this.h;
        if (gmu != null) {
            gmu.a(z);
        }
    }

    public final void ay_() {
        this.c.a((oxs) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void b(boolean z) {
        gmu gmu = this.h;
        if (gmu != null) {
            gmu.b(z);
        }
    }

    public final void c() {
        this.c.a((oxs) null);
    }

    public final void d() {
        this.c.a.c();
    }

    public final void e() {
        this.i.setText(R.string.playlist_edit_playlist_button);
        this.g.a(true, a);
    }

    public final void f() {
        this.i.setText(R.string.playlist_preview_button);
        this.g.a(true, a);
    }
}
