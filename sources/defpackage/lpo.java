package defpackage;

import android.animation.Animator;
import android.view.View;
import com.spotify.music.R;

/* renamed from: lpo reason: default package */
public final class lpo {
    public final Animator a;
    public final Animator b;
    public final Animator c;
    public final Animator d;
    public final Animator e;
    public final Animator f;
    public boolean g;

    public lpo(View view) {
        View view2 = (View) fay.a(view.findViewById(R.id.artistspick_metadata));
        View view3 = (View) fay.a(view.findViewById(R.id.artistspick_comment_image_w_bg));
        View view4 = (View) fay.a(view.findViewById(R.id.artistspick_comment_w_caret));
        this.a = utz.a(new lps(view3));
        this.b = utz.a(new lpq(view3));
        this.c = utz.a(new lpp(view4));
        this.d = utz.a(new lpr(view4));
        this.e = utz.a(new lpp(view2));
        this.f = utz.a(new lpr(view2));
    }
}
