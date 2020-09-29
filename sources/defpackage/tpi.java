package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: tpi reason: default package */
public final class tpi extends PopupWindow implements OnDismissListener, tpk {
    private a a;
    private boolean b;

    public tpi(View view) {
        super(view, -1, -1);
        ImageView imageView = (ImageView) view.findViewById(R.id.car_imageview);
        if (imageView != null) {
            Context context = view.getContext();
            imageView.setImageDrawable(tou.a(context, SpotifyIconV2.DEVICE_CAR, tou.a(context, (int) R.dimen.driving_default_scalable_icon_size), (int) R.color.white));
        }
        ((Button) view.findViewById(R.id.driving_optout_button)).setOnClickListener(new $$Lambda$tpi$KxDKTp3W7XiwRmQG0JV6bpLlspA(this));
        ((Button) view.findViewById(R.id.cancel_button)).setOnClickListener(new $$Lambda$tpi$fUDdxS_qGFYj2pGLFEjUzDW369g(this));
        setOnDismissListener(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    public final void a() {
        this.b = true;
        dismiss();
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void onDismiss() {
        this.a.a(this.b);
    }
}
