package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int maudioResourceId;



    public Word(String defaultTranslation,String miworkTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        maudioResourceId = audioResourceId;
    }



    public Word(String defaultTranslation,String miworkTranslation,int imageResourceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
        maudioResourceId = audioResourceId;
    }



    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }


    public String getMiworkTranslation(){
        return mMiworkTranslation;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }


    public int getMaudioResourceId() {
        return maudioResourceId;
    }
}
