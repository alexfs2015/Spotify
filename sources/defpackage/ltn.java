package defpackage;

import android.animation.Animator;
import android.view.View;
import com.spotify.music.R;

/* renamed from: ltn reason: default package */
public final class ltn {
    public final Animator a;
    public final Animator b;
    public final Animator c;
    public final Animator d;
    public final Animator e;
    public final Animator f;
    public boolean g;

    public ltn(View view) {
        View view2 = (View) fbp.a(view.findViewById(R.id.artistspick_metadata));
        View view3 = (View) fbp.a(view.findViewById(R.id.artistspick_comment_image_w_bg));
        View view4 = (View) fbp.a(view.findViewById(R.id.artistspick_comment_w_caret));
        this.a = vfq.a(new ltr(view3));
        this.b = vfq.a(new ltp(view3));
        this.c = vfq.a(new lto(view4));
        this.d = vfq.a(new ltq(view4));
        this.e = vfq.a(new lto(view2));
        this.f = vfq.a(new ltq(view2));
    }
}
