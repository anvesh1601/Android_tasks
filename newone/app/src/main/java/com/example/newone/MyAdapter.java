package com.example.newone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private int position;
    int myImages[];
    String APILevel[];
    String MyCodeName[];
    String MyReleaseDate[];
    String MyVersionNumber[];

    Context ct;

    public MyAdapter(MainActivity mainActivity, int[] images, String[] name1, String[] codeName, String[] ReleaseDate, String[] VersionNumber) {
        myImages = images;
        APILevel = name1;
        MyCodeName = codeName;
        MyReleaseDate = ReleaseDate;
        MyVersionNumber = VersionNumber;
        ct = mainActivity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.myfile, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tv1.setText(MyCodeName[position]);
        holder.tv2.setText(MyReleaseDate[position]);
        holder.tv3.setText(MyVersionNumber[position]);
        holder.tv4.setText(APILevel[position]);
    }

    @Override
    public int getItemCount() {
        return myImages.length;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv1,tv2,tv3,tv4;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.imageView);
            tv4 = itemView.findViewById(R.id.name);
            tv3 = itemView.findViewById(R.id.name2);
            tv2 = itemView.findViewById(R.id.api);
            tv1 = itemView.findViewById(R.id.apilevel);


        }
    }
}