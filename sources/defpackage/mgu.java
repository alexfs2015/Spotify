package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mgu reason: default package */
public final class mgu {
    public static sih a(mhc mhc) {
        int i = mhc.a;
        if (i == 0) {
            return ViewUris.bu;
        }
        if (i == 1) {
            return ViewUris.bw;
        }
        if (i == 3) {
            return ViewUris.bx;
        }
        if (i == 4) {
            return ViewUris.by;
        }
        if (i == 5) {
            return ViewUris.bz;
        }
        if (i != 6) {
            return ViewUris.bv;
        }
        return ViewUris.bA;
    }

    public static gjf b(mhc mhc) {
        int i = mhc.a;
        if (i == 0) {
            return PageIdentifiers.CONNECT_TUTORIALDESKTOP;
        }
        if (i == 1) {
            return PageIdentifiers.CONNECT_TUTORIALTV;
        }
        if (i == 3) {
            return PageIdentifiers.CONNECT_TUTORIALGAMECONSOLE;
        }
        if (i == 4) {
            return PageIdentifiers.CONNECT_TUTORIALCHROMECAST;
        }
        if (i == 5) {
            return PageIdentifiers.CONNECT_TUTORIALBLUETOOTH;
        }
        if (i != 6) {
            return PageIdentifiers.CONNECT_TUTORIALSPEAKER;
        }
        return PageIdentifiers.CONNECT_TUTORIALSOCIALLISTENING;
    }
}
