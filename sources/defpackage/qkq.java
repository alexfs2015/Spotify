package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.spotlets.scannables.view.ScannableActivity;

/* renamed from: qkq reason: default package */
public final class qkq implements qkp {
    private final Fragment a;

    public qkq(Fragment fragment) {
        this.a = fragment;
    }

    public final void a() {
        Fragment fragment = this.a;
        fragment.startActivityForResult(ScannableActivity.a(fragment.o(), false), 1001);
    }
}
