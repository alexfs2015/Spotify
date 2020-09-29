package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.UUID;

/* renamed from: vua reason: default package */
public final class vua {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: vua$a */
    static class a {
        String a;
        String b;

        private a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        /* synthetic */ a(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    vua(Context context) {
        a a2 = a(context);
        this.a = a2.a;
        this.b = a2.b;
        SharedPreferences sharedPreferences = context.getSharedPreferences("spotify-identity", 0);
        String str = "installation-id";
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            xop.b("Created new installation ID: %s", string);
            sharedPreferences.edit().putString(str, string).apply();
        }
        this.c = string;
    }

    private static a a(Context context) {
        try {
            InputStream open = context.getAssets().open("rcs_identifiers");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            String readLine = bufferedReader.readLine();
            String readLine2 = bufferedReader.readLine();
            open.close();
            return new a(readLine, readLine2, 0);
        } catch (IOException e) {
            throw new RuntimeException("Could not read RCS asset file.", e);
        }
    }
}
