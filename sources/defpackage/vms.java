package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.music.R;

/* renamed from: vms reason: default package */
public final class vms {
    public final Activity a;
    public a b;
    private final kk c;
    private Fragment d;

    /* renamed from: vms$a */
    public interface a {
        void b(Fragment fragment);
    }

    public vms(Activity activity, kk kkVar) {
        this.a = activity;
        this.c = kkVar;
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
