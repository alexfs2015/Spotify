package com.spotify.mobile.android.sso.bakery;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class Cookie implements JacksonModel {
    public String domain;
    public int maxAge;
    public String name;
    public String path;
    public boolean secure;
    public String value;
}
