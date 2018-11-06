package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String defaultTranslation,String miworkTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
    }



    public Word(String defaultTranslation,String miworkTranslation,int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
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
}
