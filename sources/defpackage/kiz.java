package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: kiz reason: default package */
public class kiz extends wib {
    public kju a;
    public Runnable b;

    public static kiz a(kfp kfp) {
        kiz kiz = new kiz();
        kiz.g(kif.a(kfp));
        return kiz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    private String c() {
        return (String) fbp.a(l().getString("story_id"));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stories_container_error_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        ip.d(view, (int) R.id.retry).setOnClickListener(new $$Lambda$kiz$rG3thbQNys1CuPz3MG_dULO6Q8(this));
    }

    public final void aP_() {
        super.aP_();
        this.a.a((kjt) new b(c()));
    }

    public final void h() {
        this.a.a((kjt) new c(c()));
        super.h();
    }
}
