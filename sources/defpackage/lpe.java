package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.R;

/* renamed from: lpe reason: default package */
public final class lpe implements rum {
    private final Application a;

    public lpe(Application application) {
        this.a = application;
    }

    public final XmlResourceParser a() {
        return this.a.getResources().getXml(R.xml.android_wear_package_validator_whitelist);
    }
}
