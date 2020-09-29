package defpackage;

import com.spotify.searchview.proto.MainViewResponse;

/* renamed from: rzz reason: default package */
public abstract class rzz {
    public abstract String a();

    public abstract String b();

    public abstract MainViewResponse c();

    public static rzz a(String str, String str2, MainViewResponse mainViewResponse) {
        return new rzl(str, str2, mainViewResponse);
    }
}
