package com.example.mymosque;

public class Word {

    public String mLokasi;
    public String mNamaMasjid;
    public int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String Lokasi, String NamaMasjid) {
        mLokasi = Lokasi;
        mNamaMasjid = NamaMasjid;
    }

    public Word(String Lokasi, String NamaMasjid, int ImageResourceId) {
        mLokasi = Lokasi;
        mNamaMasjid= NamaMasjid;
        mImageResourceId = ImageResourceId;
    }

    public String getLokasi() {
        return mLokasi;
    }

    public String getNamaMasjid() {
        return mNamaMasjid;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
