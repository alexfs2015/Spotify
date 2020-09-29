package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: bxe reason: default package */
public final class bxe {
    public static String a(String str, String str2, Context context, AttributeSet attributeSet, boolean z, boolean z2, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !attributeValue.startsWith("@string/")) {
            return attributeValue;
        }
        String substring = attributeValue.substring(8);
        String packageName = context.getPackageName();
        TypedValue typedValue = new TypedValue();
        try {
            Resources resources = context.getResources();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(substring).length());
            sb.append(packageName);
            sb.append(":string/");
            sb.append(substring);
            resources.getValue(sb.toString(), typedValue, true);
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 30 + String.valueOf(attributeValue).length());
            sb2.append("Could not find resource for ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(attributeValue);
        }
        if (typedValue.string != null) {
            return typedValue.string.toString();
        }
        String valueOf = String.valueOf(typedValue);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(valueOf).length());
        sb3.append("Resource ");
        sb3.append(str2);
        sb3.append(" was not a string: ");
        sb3.append(valueOf);
        return attributeValue;
    }
}
