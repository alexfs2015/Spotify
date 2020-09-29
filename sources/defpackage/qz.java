package defpackage;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qz reason: default package */
public final class qz {
    public final Map<String, Object> a = new HashMap();
    public View b;
    public final ArrayList<Transition> c = new ArrayList<>();

    public final boolean equals(Object obj) {
        if (obj instanceof qz) {
            qz qzVar = (qz) obj;
            if (this.b == qzVar.b && this.a.equals(qzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.b);
        String str = "\n";
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str2 : this.a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str2);
            sb7.append(": ");
            sb7.append(this.a.get(str2));
            sb7.append(str);
            sb6 = sb7.toString();
        }
        return sb6;
    }
}
