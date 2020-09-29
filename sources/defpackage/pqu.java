package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.internal.StateListAnimatorButton;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.FlexibleSquareImageView;

/* renamed from: pqu reason: default package */
public final class pqu implements kmm<pqr, pqp>, pqt {
    private final EditProfileActivity a;
    /* access modifiers changed from: private */
    public final jyx b;
    /* access modifiers changed from: private */
    public final StateListAnimatorImageButton c;
    /* access modifiers changed from: private */
    public final StateListAnimatorButton d;
    /* access modifiers changed from: private */
    public final FlexibleSquareImageView e;
    /* access modifiers changed from: private */
    public final EditText f;

    public pqu(EditProfileActivity editProfileActivity, jyx jyx) {
        this.a = editProfileActivity;
        this.e = (FlexibleSquareImageView) editProfileActivity.findViewById(R.id.edit_image);
        this.f = (EditText) editProfileActivity.findViewById(R.id.edit_displayname);
        this.b = jyx;
        gau.a((Context) editProfileActivity);
        ViewGroup viewGroup = (ViewGroup) editProfileActivity.findViewById(R.id.toolbar_wrapper);
        fsy a2 = ftc.a(editProfileActivity, viewGroup);
        a2.a((CharSequence) editProfileActivity.getString(R.string.edit_profile_title));
        gav.a(a2.getView(), editProfileActivity);
        viewGroup.addView(a2.getView());
        this.c = new StateListAnimatorImageButton(editProfileActivity);
        ip.a((View) this.c, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) editProfileActivity, SpotifyIconV2.X, (float) editProfileActivity.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(editProfileActivity.getBaseContext(), R.color.white));
        this.c.setImageDrawable(spotifyIconDrawable);
        this.c.setContentDescription(editProfileActivity.getString(R.string.generic_content_description_close));
        a2.a(ToolbarSide.START, this.c, R.id.toolbar_up_button);
        this.d = new StateListAnimatorButton(editProfileActivity);
        ip.a((View) this.d, (Drawable) null);
        this.d.setText(R.string.edit_profile_save_button);
        vgl.b(editProfileActivity, this.d, R.attr.pasteActionBarTitleTextAppearance);
        a2.a(ToolbarSide.END, this.d, R.id.toolbar_save_button);
    }

    public static String c() {
        return "";
    }

    public final void a() {
        this.a.finish();
    }

    public final String b() {
        return this.f.getText().toString();
    }

    public final kmn<pqr> connect(final knw<pqp> knw) {
        return new kmn<pqr>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(knw knw, View view) {
                knw.accept(new b(pqu.this.b()));
            }

            public final /* synthetic */ void accept(Object obj) {
                pqr pqr = (pqr) obj;
                pqu.this.f.setText(pqr.b());
                pqu.this.c.setOnClickListener(new $$Lambda$pqu$1$I4aOXvUwjsvB4khpbwtFupS5H4(knw));
                pqu.this.d.setOnClickListener(new $$Lambda$pqu$1$e0AyCbrGb1Pnpd2tiu6P4ZjcAZQ(this, knw));
                pqu.this.b.a((ImageView) pqu.this.e, !TextUtils.isEmpty(pqr.c()) ? Uri.parse(pqr.c()) : Uri.EMPTY, vgq.a());
            }

            public final void dispose() {
            }
        };
    }
}
