package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: mmh reason: default package */
public final class mmh implements mmm {
    public final mmi a;
    public final Context b;
    public ImageButton c;
    public ImageButton d;
    public fsy e;

    public mmh(Context context, mmi mmi) {
        this.b = context;
        this.a = mmi;
    }

    public ImageButton a(SpotifyIconV2 spotifyIconV2, int i) {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this.b);
        Context context = this.b;
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(R.dimen.toolbar_context_menu_icon_size)));
        ip.a((View) stateListAnimatorImageButton, (Drawable) null);
        stateListAnimatorImageButton.setLayoutParams(new LayoutParams(-2, -2));
        stateListAnimatorImageButton.setId(i);
        return stateListAnimatorImageButton;
    }

    public final void a() {
        this.d.setVisibility(8);
    }

    public final void a(float f) {
        this.e.a(f);
    }

    public final void a(int i) {
        this.e.b(i);
        this.e.getView().setBackgroundColor(fr.c(this.b, i));
    }

    public final void a(Fragment fragment) {
        if (fragment != null) {
            mlq mlq = null;
            Bundle bundle = fragment.i;
            if (bundle != null) {
                mlq = (mlq) bundle.get("tag_education_item");
            }
            String str = fragment.z;
            if (str != null) {
                if (mlq != null) {
                    a(str, mlq.b);
                    return;
                }
                b(str);
            }
        }
    }

    public final void a(SpotifyIconV2 spotifyIconV2) {
        Context context = this.b;
        this.c.setImageDrawable(new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(R.dimen.toolbar_context_menu_icon_size)));
    }

    public final void a(String str) {
        this.e.a((CharSequence) str);
    }

    public final void a(String str, String str2) {
        this.a.a(str, this.b.getResources().getConfiguration().orientation, str2, this);
    }

    public final void b() {
        this.d.setVisibility(0);
    }

    public final void b(String str) {
        a(str, this.b.getString(R.string.connect_picker_header_text));
    }

    public final void c() {
        this.e.a(false);
    }
}
