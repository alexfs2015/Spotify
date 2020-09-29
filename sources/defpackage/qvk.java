package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView.b;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView.d;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: qvk reason: default package */
public final class qvk extends srs {
    public final ToolbarSearchFieldView a;

    public qvk(Context context, ToolbarSearchFieldView toolbarSearchFieldView) {
        this.a = (ToolbarSearchFieldView) fbp.a(toolbarSearchFieldView);
        ToolbarSearchFieldView toolbarSearchFieldView2 = this.a;
        toolbarSearchFieldView2.getLayoutParams().width = -1;
        toolbarSearchFieldView2.getLayoutParams().height = gav.b(context);
        ToolbarSearchFieldView toolbarSearchFieldView3 = this.a;
        Resources resources = context.getResources();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, (float) resources.getDimensionPixelSize(R.dimen.free_tier_taste_onboarding_artist_search_bar_icon_size));
        Button button = toolbarSearchFieldView3.d;
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        layoutParams.gravity = 8388611;
        button.setLayoutParams(layoutParams);
        button.setText(resources.getText(R.string.free_tier_taste_onboarding_search_bar_hint));
        vgl.a(button.getContext(), button, 2132017678);
        button.setTextColor(resources.getColor(R.color.free_tier_taste_onboarding_stockholm_black_searchbar_hint_text));
        spotifyIconDrawable.a(resources.getColor(R.color.free_tier_taste_onboarding_stockholm_black_searchbar_hint_text));
        jm.b(button, spotifyIconDrawable, null, null, null);
        if (VERSION.SDK_INT >= 21) {
            this.a.findViewById(R.id.search_toolbar).setTransitionName("search_field");
        }
        this.a.a((d) new d() {
            public final void a() {
                if (!qvk.this.f()) {
                    qvk.this.a();
                }
                qvk.this.c();
                qvk.this.g();
            }

            public final void b() {
            }
        });
        this.a.a((b) new b() {
            public final void a() {
                if (!(qvk.this.b != null && qvk.this.b.onToolbarUpButtonPressed())) {
                    qvk.this.b();
                    qvk.this.c();
                }
            }

            public final void b() {
                qvk.this.b();
            }

            public final void c() {
                qvk.this.a();
                qvk.this.a.d.setPressed(false);
                Animator animator = ((vfv) qvk.this.a.d).c().a;
                if (animator != null) {
                    animator.cancel();
                }
            }
        });
        i();
    }

    private boolean j() {
        return TextUtils.isEmpty(this.a.a.getText());
    }

    public final void a() {
        super.a();
        this.a.j.b();
    }

    public final void a(int i) {
        super.a(i);
        this.a.j.b();
    }

    public final void a(String str) {
        super.a(str);
        boolean a2 = fbo.a(str);
        if (!this.a.a()) {
            this.a.a(!a2);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.a.j.c();
        } else if (j()) {
            this.a.j.d();
        }
        super.a(z);
    }

    public final void b() {
        if (j()) {
            this.a.j.a();
        }
        super.b();
    }

    public final void b(String str) {
        if (!fbo.a(str)) {
            this.a.j.b();
        } else if (!f()) {
            this.a.j.a();
        }
        super.b(str);
    }

    public final void c() {
        if (f()) {
            super.c();
        } else {
            this.a.j.a();
        }
    }

    public final EditText d() {
        return this.a.a;
    }
}
