package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: fpk reason: default package */
public class fpk {
    public String a;
    private String b;

    fpk(String str, Bundle bundle) {
        this.b = str;
        this.a = bundle.getString("event");
        b(bundle);
    }

    public static fpk a(Bundle bundle) {
        String string = bundle.getString("eventType");
        String str = "default";
        if (TextUtils.isEmpty(string)) {
            string = str;
        }
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != 366526597) {
            if (hashCode != 530697857) {
                if (hashCode == 1544803905 && string.equals(str)) {
                    c = 0;
                }
            } else if (string.equals("ItemSelectionEvent")) {
                c = 1;
            }
        } else if (string.equals("SearchTextEvent")) {
            c = 2;
        }
        if (c == 0) {
            return new fpk(string, bundle);
        }
        if (c == 1) {
            return new fpl(string, bundle);
        }
        if (c != 2) {
            return null;
        }
        return new fpm(string, bundle);
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
    }
}