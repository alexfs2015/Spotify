package defpackage;

import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.StructuredValueCase;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: vsx reason: default package */
public final class vsx implements vuo {
    private final Map<String, AssignedPropertyValue> a;

    private vsx(Map<String, AssignedPropertyValue> map) {
        this.a = map;
    }

    private AssignedPropertyValue a(String str, String str2, StructuredValueCase structuredValueCase) {
        AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) this.a.get(a(str, str2));
        if (assignedPropertyValue == null || !structuredValueCase.equals(StructuredValueCase.a(assignedPropertyValue.d))) {
            return null;
        }
        return assignedPropertyValue;
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    public static vsx a(Set<AssignedPropertyValue> set) {
        HashMap hashMap = new HashMap(set.size());
        for (AssignedPropertyValue assignedPropertyValue : set) {
            hashMap.put(a(assignedPropertyValue.f, assignedPropertyValue.h), assignedPropertyValue);
        }
        return new vsx(hashMap);
    }

    public final int a(String str, String str2, int i, int i2, int i3) {
        AssignedPropertyValue a2 = a(str, str2, StructuredValueCase.INT_VALUE);
        if (a2 == null) {
            return i3;
        }
        int i4 = (a2.d == 2 ? (IntValue) a2.e : IntValue.k()).d;
        return (i4 < i || i4 >= i2) ? i3 : i4;
    }

    public final <T extends Enum<T> & vuc> T a(String str, String str2, T t) {
        String str3;
        T[] tArr;
        AssignedPropertyValue a2 = a(str, str2, StructuredValueCase.ENUM_VALUE);
        Class declaringClass = t.getDeclaringClass();
        if (a2 != null) {
            str3 = (a2.d == 3 ? (EnumValue) a2.e : EnumValue.k()).d;
        } else {
            str3 = null;
        }
        for (T t2 : (Enum[]) declaringClass.getEnumConstants()) {
            if (t2.a().equals(str3)) {
                return t2;
            }
        }
        return t;
    }

    public final boolean a(String str, String str2, boolean z) {
        AssignedPropertyValue a2 = a(str, str2, StructuredValueCase.BOOL_VALUE);
        if (a2 == null) {
            return z;
        }
        return (a2.d == 1 ? (BoolValue) a2.e : BoolValue.k()).d;
    }
}
