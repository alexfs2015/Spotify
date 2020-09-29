package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.util.StringBuilderPrinter;
import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.service.feature.FeatureService.d;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;

/* renamed from: hjc reason: default package */
public final class hjc {
    static RuntimeException a(ClassCastException classCastException, Context context, IBinder iBinder) {
        fay.a(iBinder);
        Context applicationContext = ((Context) fay.a(context)).getApplicationContext();
        try {
            ServiceInfo serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, FeatureService.class), 128);
            StringBuilder sb = new StringBuilder(200);
            sb.append("Attempted to cast IBinder -> ");
            sb.append(d.class);
            sb.append(" but runtime cast was from");
            sb.append(iBinder.getClass());
            StringBuilderPrinter stringBuilderPrinter = new StringBuilderPrinter(sb);
            stringBuilderPrinter.println("\nReflection based dump:\n");
            a(sb, serviceInfo);
            stringBuilderPrinter.println("----------------------");
            stringBuilderPrinter.println("System provided dump:");
            serviceInfo.dump(stringBuilderPrinter, ">>>");
            return new RuntimeException(sb.toString(), classCastException);
        } catch (NameNotFoundException e) {
            return new RuntimeException("Unable to obtain system metadata", e);
        }
    }

    private static void a(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        Class<String> cls = obj.getClass();
        if (obj instanceof Integer) {
            sb.append(obj);
            sb.append(Integer.toHexString(((Integer) obj).intValue()));
        } else if (cls.isPrimitive() || cls == Double.class || cls == Float.class || cls == Long.class || cls == Integer.class || cls == Short.class || cls == Character.class || cls == Byte.class || cls == Boolean.class || cls == String.class) {
            sb.append(obj);
        } else if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            Set<String> keySet = bundle.keySet();
            sb.append("Bundle {");
            for (String str : keySet) {
                sb.append(10);
                sb.append(str);
                sb.append('=');
                a(sb, bundle.get(str));
            }
            sb.append('}');
        } else {
            Field[] fields = obj.getClass().getFields();
            sb.append(obj.getClass());
            sb.append(" {");
            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    sb.append(10);
                    sb.append(field.getName());
                    sb.append('=');
                    try {
                        a(sb, field.get(obj));
                    } catch (IllegalAccessException e) {
                        sb.append(e.getMessage());
                    }
                }
            }
            sb.append('}');
        }
    }
}
