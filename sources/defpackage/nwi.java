package defpackage;

import com.spotify.base.java.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: nwi reason: default package */
public final class nwi extends fra<fsm> {
    final fsm b;

    protected nwi(fsm fsm) {
        super(fsm);
        this.b = fsm;
    }

    public static String a(String str) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault()).parse(str);
        } catch (ParseException e) {
            Logger.e(e, "Exception when parsing date.", new Object[0]);
        }
        return new SimpleDateFormat("E MMM dd, yyyy - hh:mm a", Locale.getDefault()).format(date);
    }
}
