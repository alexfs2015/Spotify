package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

/* renamed from: kfo reason: default package */
public class kfo extends vtv {
    public static kfo c() {
        return new kfo();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sharing_preview_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        ip.c(view, (int) R.id.close_button).setOnClickListener(new $$Lambda$kfo$AtRObS4s89yU0HI7FuU4VNSi3x4(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.t != null) {
            this.t.a().b((Fragment) this).b();
        }
    }
}
