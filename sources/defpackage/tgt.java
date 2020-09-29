package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.SeekBar;

/* renamed from: tgt reason: default package */
public final class tgt implements tgs {
    private static final int[] d = new int[2];
    private GLSurfaceView a;
    /* access modifiers changed from: private */
    public boolean b;
    /* access modifiers changed from: private */
    public float c;

    /* renamed from: tgt$a */
    class a implements defpackage.fzp.a {
        private final SeekBar a;
        private final wlc<Integer> b;

        public a(SeekBar seekBar, wlc<Integer> wlc) {
            this.a = (SeekBar) fay.a(seekBar);
            this.b = wlc;
        }

        public final boolean a() {
            return tgt.this.b;
        }

        public final void a(Rect rect) {
            tgt.a(this.a, rect);
        }

        public final int b() {
            return tgt.a(this.a);
        }

        public final int c() {
            wlc<Integer> wlc = this.b;
            if (wlc == null) {
                return 0;
            }
            return ((Integer) wlc.get()).intValue();
        }

        public final float d() {
            return tgt.this.c;
        }
    }

    public final void a(ViewGroup viewGroup, SeekBar seekBar, wlc<Integer> wlc) {
        Context applicationContext = viewGroup.getContext().getApplicationContext();
        this.c = ((WindowManager) applicationContext.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        tgr tgr = new tgr(new fzp(applicationContext, new a(seekBar, wlc)));
        fay.b(this.a == null);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(applicationContext);
        gLSurfaceView.setLayoutParams(new LayoutParams(-1, -1));
        gLSurfaceView.setEGLContextClientVersion(3);
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        gLSurfaceView.getHolder().setFormat(1);
        gLSurfaceView.setZOrderOnTop(true);
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        this.a = gLSurfaceView;
        this.a.setRenderer(tgr);
        this.a.setRenderMode(1);
        viewGroup.addView(this.a, -1);
        this.a.onResume();
        this.a.setVisibility(0);
    }

    public final void a(ViewGroup viewGroup) {
        fay.a(this.a);
        this.a.onPause();
        this.a.setVisibility(8);
        viewGroup.removeView(this.a);
        this.a = null;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    static /* synthetic */ void a(View view, Rect rect) {
        view.getLocationInWindow(d);
        int[] iArr = d;
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), d[1] + view.getHeight());
        rect.left += view.getPaddingLeft();
        rect.top += view.getPaddingTop();
        rect.right -= view.getPaddingRight();
        rect.bottom -= view.getPaddingBottom();
    }

    static /* synthetic */ int a(SeekBar seekBar) {
        return (int) (((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) * (((float) seekBar.getProgress()) / ((float) seekBar.getMax())));
    }
}
