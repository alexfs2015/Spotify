package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jvw reason: default package */
public final class jvw {
    public final String a;
    public PlayerTrack b;
    public PlayOrigin c;
    public String d;
    public Integer e;
    public boolean f;
    public PlayerOptions g;
    public PlayerRestrictions h;
    public PlayerSuppressions i;
    public float j;
    public long k;
    public long l;
    public PlayerTrack[] m;
    public PlayerTrack[] n;
    public Map<String, String> o;
    public Map<String, String> p;
    public AudioStream q;
    private long r = 0;
    private boolean s;

    public jvw(String str) {
        this.a = str;
        String str2 = "";
        this.b = PlayerTrack.create(str2);
        this.c = new PlayOrigin(str2, str2, str2, null);
        this.d = str2;
        this.e = Integer.valueOf(0);
        this.f = true;
        this.s = false;
        this.g = PlayerOptions.create(false, false, false);
        this.h = PlayerRestrictions.empty();
        this.i = PlayerSuppressions.empty();
        this.j = 1.0f;
        this.k = 10000;
        this.l = 3000;
        this.m = new PlayerTrack[0];
        this.n = new PlayerTrack[0];
        this.o = new HashMap();
        this.p = new HashMap();
        this.q = AudioStream.DEFAULT;
    }
}
