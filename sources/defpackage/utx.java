package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.view.ViewGroup;
import com.spotify.music.spotlets.scannables.view.CameraPreview;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: utx reason: default package */
public final class utx {
    Camera a;

    public final xii<utp> a(final ViewGroup viewGroup, final Context context) {
        return xii.a((xis<Emitter<T>>) new xis<Emitter<utp>>() {
            public final /* synthetic */ void call(Object obj) {
                int i;
                final Emitter emitter = (Emitter) obj;
                try {
                    utx.this.a = Camera.open(0);
                    int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
                    Camera camera = utx.this.a;
                    CameraInfo cameraInfo = new CameraInfo();
                    Camera.getCameraInfo(0, cameraInfo);
                    int i2 = cameraInfo.orientation;
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i = 90;
                        } else if (rotation == 2) {
                            i = 180;
                        } else if (rotation == 3) {
                            i = 270;
                        }
                        camera.setDisplayOrientation((i2 - i) % 360);
                        AnonymousClass1 r0 = new PreviewCallback() {
                            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                                Size previewSize = camera.getParameters().getPreviewSize();
                                emitter.onNext(new utp(bArr, previewSize.width, previewSize.height));
                                if (viewGroup.getChildCount() > 1) {
                                    viewGroup.removeViewAt(1);
                                }
                            }
                        };
                        CameraPreview cameraPreview = new CameraPreview(context);
                        cameraPreview.a(utx.this.a, (PreviewCallback) r0);
                        viewGroup.addView(cameraPreview, 0);
                        emitter.a((xiw) new xiw() {
                            public final void cancel() {
                                if (utx.this.a != null) {
                                    utx.this.a.setPreviewCallback(null);
                                    utx.this.a.stopPreview();
                                    utx.this.a.release();
                                }
                            }
                        });
                    }
                    i = 0;
                    camera.setDisplayOrientation((i2 - i) % 360);
                    AnonymousClass1 r02 = new PreviewCallback() {
                        public final void onPreviewFrame(byte[] bArr, Camera camera) {
                            Size previewSize = camera.getParameters().getPreviewSize();
                            emitter.onNext(new utp(bArr, previewSize.width, previewSize.height));
                            if (viewGroup.getChildCount() > 1) {
                                viewGroup.removeViewAt(1);
                            }
                        }
                    };
                    CameraPreview cameraPreview2 = new CameraPreview(context);
                    cameraPreview2.a(utx.this.a, (PreviewCallback) r02);
                    viewGroup.addView(cameraPreview2, 0);
                } catch (Exception e) {
                    emitter.onError(e);
                }
                emitter.a((xiw) new xiw() {
                    public final void cancel() {
                        if (utx.this.a != null) {
                            utx.this.a.setPreviewCallback(null);
                            utx.this.a.stopPreview();
                            utx.this.a.release();
                        }
                    }
                });
            }
        }, BackpressureMode.DROP);
    }
}
