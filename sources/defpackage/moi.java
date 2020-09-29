package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.internal.StateListAnimatorButton;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.editprofile.EditProfileActivity;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: moi reason: default package */
public final class moi implements kjd<mof, mod>, moh {
    private final EditProfileActivity a;
    /* access modifiers changed from: private */
    public final StateListAnimatorImageButton b;
    /* access modifiers changed from: private */
    public final StateListAnimatorButton c;
    /* access modifiers changed from: private */
    public final EditText d;

    public static String c() {
        return "";
    }

    public moi(EditProfileActivity editProfileActivity) {
        this.a = editProfileActivity;
        this.d = (EditText) editProfileActivity.findViewById(R.id.edit_displayname);
        gaa.a((Context) editProfileActivity);
        ViewGroup viewGroup = (ViewGroup) editProfileActivity.findViewById(R.id.toolbar_wrapper);
        fse a2 = fsi.a(editProfileActivity, viewGroup);
        a2.a((CharSequence) editProfileActivity.getString(R.string.edit_profile_title));
        gab.a(a2.getView(), editProfileActivity);
        viewGroup.addView(a2.getView());
        this.b = new StateListAnimatorImageButton(editProfileActivity);
        ip.a((View) this.b, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) editProfileActivity, SpotifyIconV2.X, (float) editProfileActivity.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(editProfileActivity.getBaseContext(), R.color.white));
        this.b.setImageDrawable(spotifyIconDrawable);
        this.b.setContentDescription(editProfileActivity.getString(R.string.generic_content_description_close));
        a2.a(ToolbarSide.START, this.b, R.id.toolbar_up_button);
        this.c = new StateListAnimatorButton(editProfileActivity);
        ip.a((View) this.c, (Drawable) null);
        this.c.setText(R.string.edit_profile_save_button);
        uuu.b(editProfileActivity, this.c, R.attr.pasteActionBarTitleTextAppearance);
        a2.a(ToolbarSide.END, this.c, R.id.toolbar_save_button);
    }

    public final kje<mof> connect(final kkn<mod> kkn) {
        return new kje<mof>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                moi.this.d.setText(((mof) obj).b());
                moi.this.b.setOnClickListener(new $$Lambda$moi$1$dqkIR5bOyxHwUOCsUl6397Gl688(kkn));
                moi.this.c.setOnClickListener(new $$Lambda$moi$1$Mk8csEJLdf00YnGjirI9YBzZts(this, kkn));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(kkn kkn, View view) {
                kkn.accept(new b(moi.this.b()));
            }
        };
    }

    public final String b() {
        return this.d.getText().toString();
    }

    public final void a() {
        this.a.finish();
    }
}
