package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: wkb reason: default package */
final class wkb implements wka {
    private final Method a;
    private final Object b;

    private wkb(Class cls, Object obj) {
        this.b = obj;
        this.a = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    public static wka a(Context context) {
        String str = "Fabric";
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new wkb(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            wja.a().a(str, "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            wji a2 = wja.a();
            StringBuilder sb = new StringBuilder("Could not find method: ");
            sb.append(e.getMessage());
            a2.a(str, sb.toString());
            return null;
        } catch (Exception e2) {
            wja.a().a(str, "Unexpected error loading FirebaseApp instance.", (Throwable) e2);
            return null;
        }
    }

    public final boolean a() {
        try {
            return ((Boolean) this.a.invoke(this.b, new Object[0])).booleanValue();
        } catch (Exception e) {
            wja.a().a("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", (Throwable) e);
            return false;
        }
    }
}
