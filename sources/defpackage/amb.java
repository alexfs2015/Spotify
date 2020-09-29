package defpackage;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/* renamed from: amb reason: default package */
final class amb {
    private String a;
    private boolean b;

    amb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final void a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(akq.g()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
        edit.apply();
    }

    public final String toString() {
        String str = this.b ? "Applink" : "Unclassified";
        if (this.a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
