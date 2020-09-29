package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.spotlets.scannables.view.ScannableActivity;

/* renamed from: qbs reason: default package */
public final class qbs implements qbr {
    private final Fragment a;

    public qbs(Fragment fragment) {
        this.a = fragment;
    }

    public final void a() {
        Fragment fragment = this.a;
        fragment.startActivityForResult(ScannableActivity.a(fragment.o(), false), 1001);
    }
}
