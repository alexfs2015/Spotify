package com.spotify.music.spotlets.scannables.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CameraPreview extends SurfaceView implements Callback {
    private List<Size> a;
    private SurfaceHolder b;
    /* access modifiers changed from: private */
    public Camera c;
    private Size d;
    private PreviewCallback e;
    /* access modifiers changed from: private */
    public Handler f;
    /* access modifiers changed from: private */
    public final Runnable g = new Runnable() {
        public final void run() {
            String str = "continuous-picture";
            try {
                if (CameraPreview.this.c != null) {
                    Parameters parameters = CameraPreview.this.c.getParameters();
                    if (parameters.getSupportedFocusModes().contains(str)) {
                        parameters.setFocusMode(str);
                    }
                    CameraPreview.this.c.setParameters(parameters);
                }
            } catch (RuntimeException unused) {
                Logger.d("Camera was released already", new Object[0]);
            }
        }
    };
    private final AutoFocusCallback h = new AutoFocusCallback() {
        public final void onAutoFocus(boolean z, Camera camera) {
            CameraPreview.this.f.removeCallbacks(CameraPreview.this.g);
            CameraPreview.this.f.postDelayed(CameraPreview.this.g, 3000);
        }
    };

    public CameraPreview(Context context) {
        super(context);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(Camera camera, PreviewCallback previewCallback) {
        this.c = camera;
        this.e = previewCallback;
        this.a = this.c.getParameters().getSupportedPreviewSizes();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.width > 1024 || size.height > 1024) {
                it.remove();
            }
        }
        this.b = getHolder();
        this.b.addCallback(this);
        this.b.setType(3);
        this.f = new Handler();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1) {
            return true;
        }
        try {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.c != null) {
                Parameters parameters = this.c.getParameters();
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(0, cameraInfo);
                if (parameters.getMaxNumFocusAreas() > 0) {
                    float f2 = (float) y;
                    int a2 = a((int) (((((float) x) / ((float) getWidth())) * 2000.0f) - 1000.0f), 50);
                    int a3 = a((int) (((f2 / ((float) getHeight())) * 2000.0f) - 1000.0f), 50);
                    Rect rect = new Rect(a2, a3, a2 + 50, a3 + 50);
                    int i = 360 - cameraInfo.orientation;
                    RectF rectF = new RectF(rect);
                    Matrix matrix = new Matrix();
                    matrix.postRotate((float) i);
                    matrix.mapRect(rectF);
                    rectF.round(rect);
                    parameters.setFocusMode("auto");
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new Area(rect, 1000));
                    parameters.setFocusAreas(arrayList);
                    this.c.setParameters(parameters);
                    this.c.autoFocus(this.h);
                } else {
                    this.c.autoFocus(this.h);
                }
            }
        } catch (RuntimeException unused) {
            Logger.d("Camera was released already", new Object[0]);
        }
        performClick();
        return true;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.c.setPreviewDisplay(surfaceHolder);
            this.c.setPreviewCallback(this.e);
            this.c.startPreview();
        } catch (IOException | RuntimeException e2) {
            Logger.e("Error setting camera preview: %s", e2.getMessage());
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f.removeCallbacks(this.g);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        String str = "continuous-picture";
        if (this.b.getSurface() != null) {
            try {
                this.c.stopPreview();
            } catch (Exception e2) {
                Logger.e("Could not stop preview %s", e2);
            }
            try {
                Parameters parameters = this.c.getParameters();
                if (parameters.getSupportedFocusModes().contains(str)) {
                    parameters.setFocusMode(str);
                }
                if (this.d != null) {
                    parameters.setPreviewSize(this.d.width, this.d.height);
                }
                this.c.setParameters(parameters);
                this.c.setPreviewDisplay(this.b);
                this.c.setPreviewCallback(this.e);
                this.c.startPreview();
            } catch (IOException | RuntimeException e3) {
                Logger.e("Error starting camera preview: %s", e3.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int resolveSize = resolveSize(getSuggestedMinimumWidth(), i);
        int resolveSize2 = resolveSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(resolveSize, resolveSize2);
        List<Size> list = this.a;
        if (list != null && !list.isEmpty()) {
            List<Size> list2 = this.a;
            Size size = null;
            if (list2 != null) {
                double d2 = (double) resolveSize2;
                double d3 = (double) resolveSize;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = d2 / d3;
                double d5 = Double.MAX_VALUE;
                double d6 = Double.MAX_VALUE;
                for (Size size2 : list2) {
                    double d7 = (double) size2.width;
                    double d8 = (double) size2.height;
                    Double.isNaN(d7);
                    Double.isNaN(d8);
                    if (Math.abs((d7 / d8) - d4) <= 0.1d && ((double) Math.abs(size2.height - resolveSize2)) < d6) {
                        d6 = (double) Math.abs(size2.height - resolveSize2);
                        size = size2;
                    }
                }
                if (size == null) {
                    for (Size size3 : list2) {
                        if (((double) Math.abs(size3.height - resolveSize2)) < d5) {
                            d5 = (double) Math.abs(size3.height - resolveSize2);
                            size = size3;
                        }
                    }
                }
            }
            this.d = size;
        }
    }

    private static int a(int i, int i2) {
        if (Math.abs(i) + 25 > 1000) {
            return i > 0 ? 975 : -975;
        }
        return i - 25;
    }
}
