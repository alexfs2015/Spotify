package defpackage;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: fk reason: default package */
final class fk {
    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    static {
        new Object();
    }

    public static Bundle a(Builder builder, a aVar) {
        builder.addAction(aVar.g, aVar.h, aVar.i);
        Bundle bundle = new Bundle(aVar.a);
        if (aVar.b != null) {
            bundle.putParcelableArray("android.support.remoteInputs", a(aVar.b));
        }
        if (aVar.c != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", a(aVar.c));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.d);
        return bundle;
    }

    public static Bundle a(Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                c = true;
                return null;
            }
        }
    }

    static Bundle a(a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", aVar.g);
        bundle.putCharSequence("title", aVar.h);
        bundle.putParcelable("actionIntent", aVar.i);
        Bundle bundle2 = aVar.a != null ? new Bundle(aVar.a) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.d);
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", a(aVar.b));
        bundle.putBoolean("showsUserInterface", aVar.e);
        bundle.putInt("semanticAction", aVar.f);
        return bundle;
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    private static Bundle[] a(fm[] fmVarArr) {
        if (fmVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[fmVarArr.length];
        for (int i = 0; i < fmVarArr.length; i++) {
            fm fmVar = fmVarArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", fmVar.a);
            bundle.putCharSequence("label", fmVar.b);
            bundle.putCharSequenceArray("choices", fmVar.c);
            bundle.putBoolean("allowFreeFormInput", fmVar.d);
            bundle.putBundle("extras", fmVar.e);
            Set<String> set = fmVar.f;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (String add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
