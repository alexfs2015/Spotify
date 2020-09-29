package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: tey reason: default package */
public final class tey extends PopupWindow implements tfa {
    private a a;

    public tey(View view) {
        super(view, -1, -1);
        ImageView imageView = (ImageView) view.findViewById(R.id.car_imageview);
        if (imageView != null) {
            Context context = view.getContext();
            imageView.setImageDrawable(tek.a(context, SpotifyIconV2.DEVICE_CAR, tek.a(context, (int) R.dimen.driving_default_scalable_icon_size), (int) R.color.white));
        }
        ((Button) view.findViewById(R.id.driving_optout_button)).setOnClickListener(new $$Lambda$tey$ISdKYtON7ctx2GxIr6yKFF7y9us(this));
        ((Button) view.findViewById(R.id.cancel_button)).setOnClickListener(new $$Lambda$tey$G9WRgP7p3OAMfiE6fhshqiNdft8(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.b();
    }

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a() {
        dismiss();
    }
}
