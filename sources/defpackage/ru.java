package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ru reason: default package */
public final class ru extends rz implements rt {
    final Callback a;
    private a c;
    private Context d;
    private ArgbEvaluator e;
    private b f;
    private AnimatorListener g;
    private ArrayList<Object> h;

    /* renamed from: ru$a */
    static class a extends ConstantState {
        int a;
        sa b;
        AnimatorSet c;
        ArrayList<Animator> d;
        dp<Animator, String> e;

        public a(a aVar, Callback callback, Resources resources) {
            if (aVar != null) {
                this.a = aVar.a;
                sa saVar = aVar.b;
                if (saVar != null) {
                    ConstantState constantState = saVar.getConstantState();
                    if (resources != null) {
                        this.b = (sa) constantState.newDrawable(resources);
                    } else {
                        this.b = (sa) constantState.newDrawable();
                    }
                    this.b = (sa) this.b.mutate();
                    this.b.setCallback(callback);
                    this.b.setBounds(aVar.b.getBounds());
                    this.b.c = false;
                }
                ArrayList<Animator> arrayList = aVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new dp<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) aVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) aVar.e.get(animator);
                        clone.setTarget(this.b.a(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public final void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        public final int getChangingConfigurations() {
            return this.a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: ru$b */
    static class b extends ConstantState {
        private final ConstantState a;

        public b(ConstantState constantState) {
            this.a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            ru ruVar = new ru();
            ruVar.b = this.a.newDrawable();
            ruVar.b.setCallback(ruVar.a);
            return ruVar;
        }

        public final Drawable newDrawable(Resources resources) {
            ru ruVar = new ru();
            ruVar.b = this.a.newDrawable(resources);
            ruVar.b.setCallback(ruVar.a);
            return ruVar;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            ru ruVar = new ru();
            ruVar.b = this.a.newDrawable(resources, theme);
            ruVar.b.setCallback(ruVar.a);
            return ruVar;
        }
    }

    ru() {
        this(null, null, null);
    }

    private ru(Context context) {
        this(context, null, null);
    }

    private ru(Context context, a aVar, Resources resources) {
        this.e = null;
        this.g = null;
        this.h = null;
        this.a = new Callback() {
            public final void invalidateDrawable(Drawable drawable) {
                ru.this.invalidateSelf();
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                ru.this.scheduleSelf(runnable, j);
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                ru.this.unscheduleSelf(runnable);
            }
        };
        this.d = context;
        this.c = new a(null, this.a, null);
    }

    public static ru a(Context context, int i) {
        int next;
        String str = "parser error";
        String str2 = "AnimatedVDCompat";
        if (VERSION.SDK_INT >= 24) {
            ru ruVar = new ru(context);
            ruVar.b = gb.a(context.getResources(), i, context.getTheme());
            ruVar.b.setCallback(ruVar.a);
            ruVar.f = new b(ruVar.b.getConstantState());
            return ruVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return a(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (XmlPullParserException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (IOException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    public static ru a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        ru ruVar = new ru(context);
        ruVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return ruVar;
    }

    private void a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.e == null) {
                    this.e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.e);
            }
        }
    }

    public final void applyTheme(Theme theme) {
        if (this.b != null) {
            gm.a(this.b, theme);
        }
    }

    public final boolean canApplyTheme() {
        if (this.b != null) {
            return gm.c(this.b);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.c.b.draw(canvas);
        if (this.c.c.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.b != null ? gm.b(this.b) : this.c.b.getAlpha();
    }

    public final int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.c.a;
    }

    public final ColorFilter getColorFilter() {
        return this.b != null ? gm.d(this.b) : this.c.b.getColorFilter();
    }

    public final ConstantState getConstantState() {
        if (this.b == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(this.b.getConstantState());
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : this.c.b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : this.c.b.getIntrinsicWidth();
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.b != null ? this.b.getOpacity() : this.c.b.getOpacity();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            gm.a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a2 = gc.a(resources, theme, attributeSet, rs.e);
                    int resourceId = a2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        sa a3 = sa.a(resources, resourceId, theme);
                        a3.c = false;
                        a3.setCallback(this.a);
                        if (this.c.b != null) {
                            this.c.b.setCallback(null);
                        }
                        this.c.b = a3;
                    }
                    a2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, rs.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.d;
                        if (context != null) {
                            Animator loadAnimator = VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, resourceId2) : rw.a(context, context.getResources(), context.getTheme(), resourceId2, 1.0f);
                            loadAnimator.setTarget(this.c.b.a(string));
                            if (VERSION.SDK_INT < 21) {
                                a(loadAnimator);
                            }
                            if (this.c.d == null) {
                                this.c.d = new ArrayList<>();
                                this.c.e = new dp<>();
                            }
                            this.c.d.add(loadAnimator);
                            this.c.e.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.c.a();
    }

    public final boolean isAutoMirrored() {
        return this.b != null ? gm.a(this.b) : this.c.b.isAutoMirrored();
    }

    public final boolean isRunning() {
        return this.b != null ? ((AnimatedVectorDrawable) this.b).isRunning() : this.c.c.isRunning();
    }

    public final boolean isStateful() {
        return this.b != null ? this.b.isStateful() : this.c.b.isStateful();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.c.b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.b != null ? this.b.setLevel(i) : this.c.b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        return this.b != null ? this.b.setState(iArr) : this.c.b.setState(iArr);
    }

    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.c.b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            gm.a(this.b, z);
        } else {
            this.c.b.setAutoMirrored(z);
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.c.b.setColorFilter(colorFilter);
        }
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i) {
        if (this.b != null) {
            gm.a(this.b, i);
        } else {
            this.c.b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            gm.a(this.b, colorStateList);
        } else {
            this.c.b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.b != null) {
            gm.a(this.b, mode);
        } else {
            this.c.b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.c.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.c.c.isStarted()) {
            this.c.c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.c.c.end();
        }
    }
}
