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

/* renamed from: qmz reason: default package */
public final class qmz extends qmx {
    final SeekBar d;
    int e;
    final jwo f;
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

    public qmz(View view, fsb fsb, jwo jwo) {
        super(view, fsb);
        this.f = jwo;
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
        this.j = ((Drawable) fbp.a(fr.a(this.a, (int) R.drawable.player_progress_thumb))).getIntrinsicWidth();
        this.k = ((Drawable) fbp.a(fr.a(this.a, (int) R.drawable.player_progress_thumb))).getIntrinsicHeight();
        this.n = this.a.getString(R.string.settings_crossfade_off);
        ((TextView) view.findViewById(R.id.offText)).setText(R.string.settings_crossfade_off);
        ((TextView) view.findViewById(R.id.maxText)).setText(this.a.getString(R.string.settings_seconds, new Object[]{Integer.valueOf(12)}));
        this.d.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    qmz.c(qmz.this, i);
                    Point d = qmz.d(qmz.this, i);
                    qmz.this.g.update(seekBar, d.x, d.y, -1, -1);
                }
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
                qmz.this.h = (((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) + (seekBar.getThumbOffset() * 2)) - qmz.this.j;
                qmz.this.i = (seekBar.getPaddingLeft() - seekBar.getThumbOffset()) + (qmz.this.j / 2);
                int progress = seekBar.getProgress();
                qmz.c(qmz.this, seekBar.getProgress());
                Point d = qmz.d(qmz.this, progress);
                qmz.this.g.showAsDropDown(seekBar, d.x, d.y);
                qmz.this.l = true;
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                qmz qmz = qmz.this;
                int progress = qmz.d.getProgress();
                if (progress == qmz.e) {
                    Logger.b("Not saving crossfade settings, they are the same.", new Object[0]);
                } else {
                    Assertion.a("Out of range again! aaargh.", progress >= 0 && progress <= 12);
                    if (progress == 0) {
                        qmz.f.a(jwo.k, Boolean.FALSE);
                    } else {
                        qmz.f.a(jwo.k, Boolean.TRUE);
                        qmz.f.a(jwo.l, Integer.valueOf(progress));
                    }
                }
                qmz.this.g.dismiss();
                qmz.this.l = false;
            }
        });
    }

    private float b(int i2) {
        return ((float) i2) / ((float) this.d.getMax());
    }

    static /* synthetic */ void c(qmz qmz, int i2) {
        if (qmz.g.isShowing()) {
            fbp.a(qmz.m);
            if (i2 <= 0) {
                qmz.m.setText(qmz.n);
                return;
            }
            qmz.m.setText(qmz.a.getString(R.string.settings_seconds, new Object[]{Integer.valueOf(i2)}));
        }
    }

    static /* synthetic */ Point d(qmz qmz, int i2) {
        int i3;
        int i4;
        fbp.a(qmz.m);
        qmz.m.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        if (vgi.a(qmz.getView())) {
            i3 = (-((int) (qmz.b(i2) * ((float) qmz.h)))) - qmz.i;
            i4 = Math.round(((float) qmz.m.getMeasuredWidth()) / 2.0f);
        } else {
            i3 = ((int) (qmz.b(i2) * ((float) qmz.h))) + qmz.i;
            i4 = Math.round(((float) qmz.m.getMeasuredWidth()) / 2.0f);
        }
        return new Point(i3 - i4, -((qmz.d.getHeight() / 2) + qmz.m.getMeasuredHeight() + (qmz.k / 2)));
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

    public final void a(boolean z) {
        super.a(z);
        this.b.getView().setEnabled(z);
        this.d.setEnabled(z);
    }
}
