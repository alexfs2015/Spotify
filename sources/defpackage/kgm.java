package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: kgm reason: default package */
public class kgm extends vtv {
    public khh a;
    public Runnable b;

    public static kgm a(kdo kdo) {
        kgm kgm = new kgm();
        kgm.g(kfs.a(kdo));
        return kgm;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stories_container_error_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        ip.c(view, (int) R.id.retry).setOnClickListener(new $$Lambda$kgm$S584THegCoJohqCmoPku2S9QqpY(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void g() {
        super.g();
        this.a.a((khg) new b(c()));
    }

    public final void h() {
        this.a.a((khg) new c(c()));
        super.h();
    }

    private String c() {
        return (String) fay.a(l().getString("story_id"));
    }
}
