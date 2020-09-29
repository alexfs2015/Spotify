package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.music.R;

/* renamed from: qdw reason: default package */
public final class qdw extends qdu {
    final SeekBar d;
    int e;
    final jug f;
    /* access modifiers changed from: private */
    public PopupWindow g;
    /* access modifiers changed from: private */
    public int h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public int j;
    private int k;
    /* access modifiers changed from: private */
    public boolean l;
    private TextView m = new TextView(this.a);
    private final String n;

    public qdw(View view, frh frh, jug jug) {
        super(view, frh);
        this.f = jug;
        this.d = (SeekBar) view.findViewById(R.id.seekbar);
        this.d.setMax(12);
        this.d.refreshDrawableState();
        this.m.setGravity(17);
        this.m.setBackgroundResource(R.drawable.bg_settings_bubble);
        this.m.setTextSize(1, 16.0f);
        this.m.setTextColor(fr.c(this.a, R.color.txt_cell_title_normal));
        this.m.setLayoutParams(new LayoutParams(-1, -1));
        int round = Math.round(TypedValue.applyDimension(1, 4.0f, this.a.getResources().getDisplayMetrics()));
        TextView textView = this.m;
        textView.setPadding(textView.getPaddingLeft() + round, this.m.getPaddingTop(), this.m.getPaddingRight() + round, this.m.getPaddingBottom());
        this.g = new PopupWindow(this.m);
        this.g.setFocusable(false);
        this.g.setTouchable(false);
        this.g.setClippingEnabled(false);
        this.g.setWidth(-2);
        this.g.setHeight(-2);
        this.j = ((Drawable) fay.a(fr.a(this.a, (int) R.drawable.player_progress_thumb))).getIntrinsicWidth();
        this.k = ((Drawable) fay.a(fr.a(this.a, (int) R.drawable.player_progress_thumb))).getIntrinsicHeight();
        this.n = this.a.getString(R.string.settings_crossfade_off);
        ((TextView) view.findViewById(R.id.offText)).setText(R.string.settings_crossfade_off);
        ((TextView) view.findViewById(R.id.maxText)).setText(this.a.getString(R.string.settings_seconds, new Object[]{Integer.valueOf(12)}));
        this.d.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onStopTrackingTouch(SeekBar seekBar) {
                qdw qdw = qdw.this;
                int progress = qdw.d.getProgress();
                if (progress == qdw.e) {
                    Logger.b("Not saving crossfade settings, they are the same.", new Object[0]);
                } else {
                    Assertion.a("Out of range again! aaargh.", progress >= 0 && progress <= 12);
                    if (progress == 0) {
                        qdw.f.a(jug.k, Boolean.FALSE);
                    } else {
                        qdw.f.a(jug.k, Boolean.TRUE);
                        qdw.f.a(jug.l, Integer.valueOf(progress));
                    }
                }
                qdw.this.g.dismiss();
                qdw.this.l = false;
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
                qdw.this.h = (((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) + (seekBar.getThumbOffset() * 2)) - qdw.this.j;
                qdw.this.i = (seekBar.getPaddingLeft() - seekBar.getThumbOffset()) + (qdw.this.j / 2);
                int progress = seekBar.getProgress();
                qdw.c(qdw.this, seekBar.getProgress());
                Point d = qdw.d(qdw.this, progress);
                qdw.this.g.showAsDropDown(seekBar, d.x, d.y);
                qdw.this.l = true;
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    qdw.c(qdw.this, i);
                    Point d = qdw.d(qdw.this, i);
                    qdw.this.g.update(seekBar, d.x, d.y, -1, -1);
                }
            }
        });
    }

    public final void a(SettingsState settingsState) {
        if (!this.l) {
            boolean crossfade = settingsState.crossfade();
            int crossfadeTimeSeconds = settingsState.crossfadeTimeSeconds();
            if (crossfadeTimeSeconds < 0 || crossfadeTimeSeconds > 12) {
                StringBuilder sb = new StringBuilder("Out of range: ");
                sb.append(crossfadeTimeSeconds);
                Assertion.a(sb.toString());
            }
            if (!crossfade) {
                crossfadeTimeSeconds = 0;
            }
            this.e = crossfadeTimeSeconds;
            this.d.setProgress(this.e);
        }
    }

    private float b(int i2) {
        return ((float) i2) / ((float) this.d.getMax());
    }

    public final void a(boolean z) {
        super.a(z);
        this.b.getView().setEnabled(z);
        this.d.setEnabled(z);
    }

    static /* synthetic */ void c(qdw qdw, int i2) {
        if (qdw.g.isShowing()) {
            fay.a(qdw.m);
            if (i2 <= 0) {
                qdw.m.setText(qdw.n);
                return;
            }
            qdw.m.setText(qdw.a.getString(R.string.settings_seconds, new Object[]{Integer.valueOf(i2)}));
        }
    }

    static /* synthetic */ Point d(qdw qdw, int i2) {
        int i3;
        int i4;
        fay.a(qdw.m);
        qdw.m.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        if (uur.a(qdw.getView())) {
            i3 = (-((int) (qdw.b(i2) * ((float) qdw.h)))) - qdw.i;
            i4 = Math.round(((float) qdw.m.getMeasuredWidth()) / 2.0f);
        } else {
            i3 = ((int) (qdw.b(i2) * ((float) qdw.h))) + qdw.i;
            i4 = Math.round(((float) qdw.m.getMeasuredWidth()) / 2.0f);
        }
        return new Point(i3 - i4, -((qdw.d.getHeight() / 2) + qdw.m.getMeasuredHeight() + (qdw.k / 2)));
    }
}
