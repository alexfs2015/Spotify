package com.airbnb.lottie.network;

public enum FileExtension {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder(".temp");
        sb.append(this.extension);
        return sb.toString();
    }

    public final String toString() {
        return this.extension;
    }
}
