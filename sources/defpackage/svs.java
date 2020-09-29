package defpackage;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.lyrics.views.LyricsAppearance;

/* renamed from: svs reason: default package */
public final class svs extends LinearLayout {
    public int a = -7829368;
    public boolean b;
    private final LyricsAppearance c;

    public svs(Context context, int i, LyricsAppearance lyricsAppearance) {
        super(context);
        this.c = lyricsAppearance;
        setOrientation(1);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        int b2 = vfj.b((float) this.c.mLineHeight, getResources());
        int i3 = size / b2;
        int i4 = i3 - (i3 % 2);
        if (i4 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i5 = size / i4;
        if (i5 == b2) {
            i5 = b2;
        }
        removeAllViews();
        if (this.b) {
            String string = getContext().getString(R.string.lyrics_full_screen_unsynced);
            TextView textView = new TextView(getContext());
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(0, i5, 0, i5);
            textView.setLayoutParams(layoutParams);
            textView.setHeight(i5);
            textView.setId(R.id.text1);
            vgl.a(getContext(), textView, 2132017668);
            textView.setTextColor(this.a);
            textView.setGravity(80);
            textView.setText(string);
            addView(textView);
        } else {
            Space space = new Space(getContext());
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.setMargins(0, i5, 0, 0);
            space.setLayoutParams(layoutParams2);
            addView(space);
        }
        super.onMeasure(i, i2);
    }
}
