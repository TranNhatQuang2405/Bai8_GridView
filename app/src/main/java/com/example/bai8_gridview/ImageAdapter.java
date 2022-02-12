package com.example.bai8_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {

    private ArrayList<Image> listImage;
    private Context context;
    private int layout;

    public ImageAdapter(ArrayList<Image> listImage, Context context, int layout) {
        this.listImage = listImage;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listImage.size();
    }

    @Override
    public Object getItem(int i) {
        return listImage.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ImageHolder{
        ImageView imageView;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageHolder imageHolder;
        if(view == null){
            imageHolder = new ImageHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            imageHolder.imageView = (ImageView) view.findViewById(R.id.imageViewHinh);
            view.setTag(imageHolder);
        }else{
            imageHolder = (ImageHolder) view.getTag();
        }
        Image image = listImage.get(i);
        imageHolder.imageView.setImageResource(image.getImageId());
        return view;
    }
}
