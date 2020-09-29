package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

/* renamed from: vae reason: default package */
public final class vae {
    public final Activity a;
    public a b;
    private final kf c;
    private Fragment d;

    /* renamed from: vae$a */
    public interface a {
        void b(Fragment fragment);
    }

    public vae(Activity activity, kf kfVar) {
        this.a = activity;
        this.c = kfVar;
    }

    public void a(Fragment fragment) {
        this.d = fragment;
        this.c.a().b(R.id.podcastonboarding_content, fragment, null).b();
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(this.d);
        }
    }
}
