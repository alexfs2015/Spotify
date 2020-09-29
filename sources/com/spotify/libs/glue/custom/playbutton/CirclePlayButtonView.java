package com.spotify.libs.glue.custom.playbutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

public class CirclePlayButtonView extends AppCompatImageButton implements uue {
    private final uud a = new uud(this);
    private Drawable b;
    private gle c;
    private Drawable d;
    private gle e;
    private IconState f;
    private boolean g;

    public enum IconState {
        PLAY,
        PAUSE
    }

    public CirclePlayButtonView(Context context) {
        super(context);
        e();
    }

    public CirclePlayButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public CirclePlayButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    private void e() {
        this.c = a(SpotifyIconV2.PLAY);
        this.b = new glj(this.c, b(R.color.black_30));
        this.e = a(SpotifyIconV2.PAUSE);
        this.d = new glj(this.e, b(R.color.black_30));
        uui.c(this).a();
    }

    public final void a(IconState iconState) {
        this.f = iconState;
        if (this.f == IconState.PLAY) {
            setBackgroundDrawable(this.b);
            return;
        }
        if (this.f == IconState.PAUSE) {
            setBackgroundDrawable(this.d);
        }
    }

    public final void a(boolean z) {
        this.g = z;
        this.e.a(this.g);
        this.c.a(this.g);
    }

    public final void a(b bVar) {
        this.a.a(bVar);
    }

    public final b c() {
        return this.a.a;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }

    private gle a(SpotifyIconV2 spotifyIconV2) {
        Context context = getContext();
        int b2 = b(R.color.green);
        int b3 = b(R.color.white);
        Context context2 = context;
        uvv uvv = new uvv(context2, spotifyIconV2, (float) a((int) R.dimen.play_icon_size), (float) a((int) R.dimen.play_circle_size), b2, b3);
        uvv uvv2 = new uvv(context2, SpotifyIconV2.SHUFFLE, (float) a((int) R.dimen.badge_icon_size), (float) a((int) R.dimen.badge_circle_size), b3, b2);
        gle gle = new gle(uvv, uvv2, a((int) R.dimen.badge_position_offset), b(R.color.black_30), (float) a((int) R.dimen.badge_shadow_radius));
        return gle;
    }

    private int a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    private int b(int i) {
        return fr.c(getContext(), i);
    }
}
