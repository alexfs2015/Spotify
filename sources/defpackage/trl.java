package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.SeekBar;

/* renamed from: trl reason: default package */
public final class trl implements trk {
    private static final int[] d = new int[2];
    private GLSurfaceView a;
    /* access modifiers changed from: private */
    public boolean b;
    /* access modifiers changed from: private */
    public float c;

    /* renamed from: trl$a */
    class a implements defpackage.gaj.a {
        private final SeekBar a;
        private final wzi<Integer> b;

        public a(SeekBar seekBar, wzi<Integer> wzi) {
            this.a = (SeekBar) fbp.a(seekBar);
            this.b = wzi;
        }

        public final void a(Rect rect) {
            trl.a(this.a, rect);
        }

        public final boolean a() {
            return trl.this.b;
        }

        public final int b() {
            return trl.a(this.a);
        }

        public final int c() {
            wzi<Integer> wzi = this.b;
            if (wzi == null) {
                return 0;
            }
            return ((Integer) wzi.get()).intValue();
        }

        public final float d() {
            return trl.this.c;
        }
    }

    static /* synthetic */ int a(SeekBar seekBar) {
        return (int) (((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) * (((float) seekBar.getProgress()) / ((float) seekBar.getMax())));
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

    public final void a(ViewGroup viewGroup) {
        fbp.a(this.a);
        this.a.onPause();
        this.a.setVisibility(8);
        viewGroup.removeView(this.a);
        this.a = null;
    }

    public final void a(ViewGroup viewGroup, SeekBar seekBar, wzi<Integer> wzi) {
        Context applicationContext = viewGroup.getContext().getApplicationContext();
        this.c = ((WindowManager) applicationContext.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        trj trj = new trj(new gaj(applicationContext, new a(seekBar, wzi)));
        fbp.b(this.a == null);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(applicationContext);
        gLSurfaceView.setLayoutParams(new LayoutParams(-1, -1));
        gLSurfaceView.setEGLContextClientVersion(3);
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        gLSurfaceView.getHolder().setFormat(1);
        gLSurfaceView.setZOrderOnTop(true);
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        this.a = gLSurfaceView;
        this.a.setRenderer(trj);
        this.a.setRenderMode(1);
        viewGroup.addView(this.a, -1);
        this.a.onResume();
        this.a.setVisibility(0);
    }

    public final void a(boolean z) {
        this.b = z;
    }
}
