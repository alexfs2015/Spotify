package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.music.R;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ChangeImageTransform extends Transition {
    private static final String[] a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> m = new TypeEvaluator<Matrix>() {
        public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            return null;
        }
    };
    private static final Property<ImageView, Matrix> n = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ImageView imageView = (ImageView) obj;
            Matrix matrix = (Matrix) obj2;
            if (VERSION.SDK_INT < 21) {
                imageView.setImageMatrix(matrix);
                return;
            }
            qm.a();
            if (qm.a != null) {
                try {
                    qm.a.invoke(imageView, new Object[]{matrix});
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }
    };

    /* renamed from: androidx.transition.ChangeImageTransform$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.AnonymousClass3.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void d(qz qzVar) {
        Matrix matrix;
        View view = qzVar.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = qzVar.a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                int i = AnonymousClass3.a[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    Drawable drawable = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
                    matrix = matrix2;
                } else if (i != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable2 = imageView.getDrawable();
                    float width = (float) imageView.getWidth();
                    float intrinsicWidth = (float) drawable2.getIntrinsicWidth();
                    float f = width / intrinsicWidth;
                    float height = (float) imageView.getHeight();
                    float intrinsicHeight = (float) drawable2.getIntrinsicHeight();
                    float max = Math.max(f, height / intrinsicHeight);
                    float f2 = intrinsicHeight * max;
                    int round = Math.round((width - (intrinsicWidth * max)) / 2.0f);
                    int round2 = Math.round((height - f2) / 2.0f);
                    Matrix matrix3 = new Matrix();
                    matrix3.postScale(max, max);
                    matrix3.postTranslate((float) round, (float) round2);
                    matrix = matrix3;
                }
                map.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }

    public final Animator a(ViewGroup viewGroup, qz qzVar, qz qzVar2) {
        ObjectAnimator objectAnimator = null;
        if (!(qzVar == null || qzVar2 == null)) {
            String str = "android:changeImageTransform:bounds";
            Rect rect = (Rect) qzVar.a.get(str);
            Rect rect2 = (Rect) qzVar2.a.get(str);
            if (!(rect == null || rect2 == null)) {
                String str2 = "android:changeImageTransform:matrix";
                Matrix matrix = (Matrix) qzVar.a.get(str2);
                Matrix matrix2 = (Matrix) qzVar2.a.get(str2);
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) qzVar2.b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (VERSION.SDK_INT < 21) {
                    ScaleType scaleType = imageView.getScaleType();
                    imageView.setTag(R.id.save_scale_type, scaleType);
                    if (scaleType == ScaleType.MATRIX) {
                        imageView.setTag(R.id.save_image_matrix, imageView.getImageMatrix());
                    } else {
                        imageView.setScaleType(ScaleType.MATRIX);
                    }
                    imageView.setImageMatrix(qn.a);
                }
                if (intrinsicWidth == 0 || intrinsicHeight == 0) {
                    objectAnimator = ObjectAnimator.ofObject(imageView, n, m, new Matrix[]{null, null});
                } else {
                    if (matrix == null) {
                        matrix = qn.a;
                    }
                    if (matrix2 == null) {
                        matrix2 = qn.a;
                    }
                    n.set(imageView, matrix);
                    objectAnimator = ObjectAnimator.ofObject(imageView, n, new a(), new Matrix[]{matrix, matrix2});
                }
                if (VERSION.SDK_INT < 21) {
                    objectAnimator.addListener(new AnimatorListenerAdapter(imageView) {
                        private /* synthetic */ ImageView a;

                        {
                            this.a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            ScaleType scaleType = (ScaleType) this.a.getTag(R.id.save_scale_type);
                            this.a.setScaleType(scaleType);
                            this.a.setTag(R.id.save_scale_type, null);
                            if (scaleType == ScaleType.MATRIX) {
                                ImageView imageView = this.a;
                                imageView.setImageMatrix((Matrix) imageView.getTag(R.id.save_image_matrix));
                                this.a.setTag(R.id.save_image_matrix, null);
                            }
                            animator.removeListener(this);
                        }
                    });
                }
            }
        }
        return objectAnimator;
    }

    public final void a(qz qzVar) {
        d(qzVar);
    }

    public final String[] a() {
        return a;
    }

    public final void b(qz qzVar) {
        d(qzVar);
    }
}
