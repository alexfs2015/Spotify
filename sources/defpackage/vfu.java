package defpackage;

import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValue;
import com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.StructuredValueCase;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: vfu reason: default package */
public final class vfu implements vhj {
    private final Map<String, AssignedPropertyValue> a;

    private vfu(Map<String, AssignedPropertyValue> map) {
        this.a = map;
    }

    public static vfu a(Set<AssignedPropertyValue> set) {
        HashMap hashMap = new HashMap(set.size());
        for (AssignedPropertyValue assignedPropertyValue : set) {
            hashMap.put(a(assignedPropertyValue.f, assignedPropertyValue.h), assignedPropertyValue);
        }
        return new vfu(hashMap);
    }

    public final boolean a(String str, String str2, boolean z) {
        BoolValue boolValue;
        AssignedPropertyValue a2 = a(str, str2, StructuredValueCase.BOOL_VALUE);
        if (a2 == null) {
            return z;
        }
        if (a2.d == 1) {
            boolValue = (BoolValue) a2.e;
        } else {
            boolValue = BoolValue.k();
        }
        return boolValue.d;
    }

    public final int a(String str, String str2, int i, int i2, int i3) {
        IntValue intValue;
        AssignedPropertyValue a2 = a(str, str2, StructuredValueCase.INT_VALUE);
        if (a2 == null) {
            return i3;
        }
        if (a2.d == 2) {
            intValue = (IntValue) a2.e;
        } else {
            intValue = IntValue.k();
        }
        int i4 = intValue.d;
        return (i4 < i || i4 >= i2) ? i3 : i4;
    }

    public final <T extends Enum<T> & vgx> T a(String str, String str2, T t) {
        String str3;
        T[] tArr;
        EnumValue enumValue;
        AssignedPropertyValue a2 = a(str, str2, StructuredValueCase.ENUM_VALUE);
        Class declaringClass = t.getDeclaringClass();
        if (a2 != null) {
            if (a2.d == 3) {
                enumValue = (EnumValue) a2.e;
            } else {
                enumValue = EnumValue.k();
            }
            str3 = enumValue.d;
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
}
