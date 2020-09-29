package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.Log;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.spotify.core.http.HttpConnection;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: jm reason: default package */
public final class jm {
    private static Field a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    /* renamed from: jm$a */
    static class a implements Callback {
        private final Callback a;
        private final TextView b;
        private Class c;
        private Method d;
        private boolean e;
        private boolean f = false;

        a(Callback callback, TextView textView) {
            this.a = callback;
            this.b = textView;
        }

        private static Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(HttpConnection.kDefaultContentType);
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Context context = this.b.getContext();
            PackageManager packageManager = context.getPackageManager();
            String str = "removeItemAt";
            if (!this.f) {
                this.f = true;
                try {
                    this.c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.d = this.c.getDeclaredMethod(str, new Class[]{Integer.TYPE});
                    this.e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                Method declaredMethod = (!this.e || !this.c.isInstance(menu)) ? menu.getClass().getDeclaredMethod(str, new Class[]{Integer.TYPE}) : this.d;
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0))) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                    MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                    TextView textView = this.b;
                    add.setIntent(a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled())).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        if (VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!d) {
            c = a("mMaxMode");
            d = true;
        }
        Field field = c;
        if (field != null && a(field, textView) == 1) {
            if (!b) {
                a = a("mMaximum");
                b = true;
            }
            Field field2 = a;
            if (field2 != null) {
                return a(field2, textView);
            }
        }
        return -1;
    }

    private static int a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder("Could not retrieve value of ");
            sb.append(field.getName());
            sb.append(" field.");
            return -1;
        }
    }

    public static Callback a(TextView textView, Callback callback) {
        return (VERSION.SDK_INT < 26 || VERSION.SDK_INT > 27 || (callback instanceof a)) ? callback : new a(callback, textView);
    }

    private static Field a(String str) {
        Field field;
        try {
            field = TextView.class.getDeclaredField(str);
            try {
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            field = null;
            StringBuilder sb = new StringBuilder("Could not retrieve ");
            sb.append(str);
            sb.append(" field.");
            Log.e("TextViewCompat", sb.toString());
            return field;
        }
        return field;
    }

    public static void a(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void a(TextView textView, ColorStateList colorStateList) {
        hr.a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintList(colorStateList);
            return;
        }
        if (textView instanceof jo) {
            ((jo) textView).b(colorStateList);
        }
    }

    public static void a(TextView textView, Mode mode) {
        hr.a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintMode(mode);
            return;
        }
        if (textView instanceof jo) {
            ((jo) textView).b(mode);
        }
    }

    public static void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void b(TextView textView, int i) {
        hr.a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else if (VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static Drawable[] b(TextView textView) {
        if (VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (VERSION.SDK_INT < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    public static void c(TextView textView, int i) {
        hr.a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void d(TextView textView, int i) {
        hr.a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }
}
