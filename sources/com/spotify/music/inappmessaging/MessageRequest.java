package com.spotify.music.inappmessaging;

import java.io.Serializable;

public abstract class MessageRequest implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public static MessageRequest a(String str, String str2, String str3) {
        return new AutoValue_MessageRequest(str, str2, str3, null);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(':');
        sb.append(b());
        sb.append(':');
        sb.append(c());
        String sb2 = sb.toString();
        String d = d();
        if (d == null || d.isEmpty()) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + d.length() + 1);
        sb3.append(sb2);
        sb3.append(':');
        sb3.append(d);
        return sb3.toString();
    }
}
