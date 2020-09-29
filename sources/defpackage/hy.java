package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: hy reason: default package */
public final class hy {
    private static boolean a;
    private static Method b;
    private static boolean c;
    private static Field d;

    /* renamed from: hy$a */
    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    private static OnKeyListener a(Dialog dialog) {
        if (!c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!a) {
            try {
                b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            a = true;
        }
        Method method = b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return ip.a(view, keyEvent);
    }

    public static boolean a(a aVar, View view, Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.a(keyEvent);
        }
        DispatcherState dispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                    return true;
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (ip.b(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                dispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, dispatcherState, activity);
        } else if (!(callback instanceof Dialog)) {
            return (view != null && ip.b(view, keyEvent)) || aVar.a(keyEvent);
        } else {
            Dialog dialog = (Dialog) callback;
            OnKeyListener a2 = a(dialog);
            if (a2 != null && a2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            if (ip.b(decorView2, keyEvent)) {
                return true;
            }
            if (decorView2 != null) {
                dispatcherState = decorView2.getKeyDispatcherState();
            }
            return keyEvent.dispatch(dialog, dispatcherState, dialog);
        }
    }
}
