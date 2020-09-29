package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: jpm reason: default package */
public abstract class jpm extends jon {
    public jru Y;
    protected int Z = -1;

    public void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            bundle.setClassLoader(((ka) fay.a(p())).getClassLoader());
            String string = bundle.getString("presenter_tag");
            if (string != null) {
                this.Y = (jru) ((kf) fay.a(this.t)).a(string);
            }
            this.Z = bundle.getInt("request_code");
        }
    }

    public void e(Bundle bundle) {
        super.e(bundle);
        jru jru = this.Y;
        if (jru != null) {
            String str = jru.z;
            if (str != null) {
                bundle.putString("presenter_tag", str);
            }
        }
        bundle.putInt("request_code", this.Z);
    }

    public void a(jru jru) {
        fay.a(jru);
        this.Y = jru;
        this.Z = this.Y.b(this);
    }

    public void c() {
        Assertion.b((Object) Integer.valueOf(-1), (Object) Integer.valueOf(this.Z));
    }

    public void a(int i, int i2, Intent intent) {
        Assertion.b((Object) Integer.valueOf(-1), (Object) Integer.valueOf(i));
        super.a(i, i2, intent);
        jru jru = this.Y;
        if (jru != null) {
            jru.a(i, i2, intent);
        }
    }
}
