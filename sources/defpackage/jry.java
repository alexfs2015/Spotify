package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: jry reason: default package */
public abstract class jry extends jqz {
    public jue Y;
    protected int Z = -1;

    public void a(int i, int i2, Intent intent) {
        Assertion.b((Object) Integer.valueOf(-1), (Object) Integer.valueOf(i));
        super.a(i, i2, intent);
        jue jue = this.Y;
        if (jue != null) {
            jue.a(i, i2, intent);
        }
    }

    public void a(jue jue) {
        fbp.a(jue);
        this.Y = jue;
        this.Z = this.Y.b(this);
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            bundle.setClassLoader(((kf) fbp.a(p())).getClassLoader());
            String string = bundle.getString("presenter_tag");
            if (string != null) {
                this.Y = (jue) ((kk) fbp.a(this.t)).a(string);
            }
            this.Z = bundle.getInt("request_code");
        }
    }

    public void c() {
        Assertion.b((Object) Integer.valueOf(-1), (Object) Integer.valueOf(this.Z));
    }

    public void e(Bundle bundle) {
        super.e(bundle);
        jue jue = this.Y;
        if (jue != null) {
            String str = jue.z;
            if (str != null) {
                bundle.putString("presenter_tag", str);
            }
        }
        bundle.putInt("request_code", this.Z);
    }
}
